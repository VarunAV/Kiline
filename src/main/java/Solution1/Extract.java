/*
 * Line
 * v1.0
 * 04-07-2015
 * This file is copyrighted
 * 
 * Extract class extracts the data from the datafiles and stores them
 */
package Solution1;

import java.io.*;
import java.util.*;

public class Extract {
	
	static List<Network> netl = new ArrayList<Network>();
	static List<Line> ll = new ArrayList<Line>();
	static List<Stoparea> sarl = new ArrayList<Stoparea>();
	static List<Link> lnkl = new ArrayList<Link>();
	static List<Point> pntl = new ArrayList<Point>();
	static List<Route> rtl = new ArrayList<Route>();
	static String path = "";
	static double d = 0;


	
	 static void build() throws IOException{
		
		File network = new File (path+"network_vrsn.dat");			// Network class extraction
		String x = null;
		String y[] = null;
		Network net=null;
		Scanner s = new Scanner (network);							// starts the scanner
		while(s.hasNextLine()){									// reads till EOF encountered 
			x = s.nextLine();
			y = x.split("\\|");
		 net= new Network(Integer.parseInt(y[0]) 			// Object calling the constructor with parameters 
					, y[1], y[2], y[3]);
			netl.add(net);
		}
		File ln = new File (path+"line.dat");						//Line class extraction
		Line line = null;
		x = null;
		String y2[] = null;
		Scanner s2 = new Scanner (ln);							// starts the scanner
		while(s2.hasNextLine()){									// reads till EOF encountered 
			x = s2.nextLine();
			y2 = x.split("\\|");
		line = new Line(Integer.parseInt(y2[0]),			 	// Object calling the constructor with parameters 
				Integer.parseInt(y2[1]), 	
				Integer.parseInt(y2[2]), 
				y2[3], y2[4]);
		ll.add(line);
		int i=0;

		while(i<netl.size()){
			if(netl.get(i).getNetID()==line.getNetID())
					Network.addLines(line);
			i++;
		}i =0;
		}
			File rte = new File (path+"route.dat");						// Route class extraction
			x = null;
			String y3[];
			int i=0;
			Route rt = null;
			Scanner s3 = new Scanner (rte);							// starts the scanner
			while(s3.hasNextLine()){									// reads till EOF encountered 
				x = s3.nextLine();
				y3 = x.split("\\|");
			rt = new Route(Integer.parseInt(y3[0]),				// Object calling the constructor with parameters
					Integer.parseInt(y3[1]),
					Integer.parseInt(y3[2]));
			rtl.add(rt);
			while(i<ll.size()){
				if(ll.get(i).getLineID()==rt.getLineID())
						Line.addRoutes(rt);
				i++;
			}i =0;			
			}
		
			File sar = new File (path+"stoparea.dat");									// Stoparea class extraction
			x = null;
			String y4[];
			BufferedReader b = new BufferedReader(new FileReader(sar));
			while((x=b.readLine())!=null){
			// reads till EOF encountered 
				y4 = x.split("\\|");
			Stoparea stp = new Stoparea(Integer.parseInt(y4[0]),					// Object calling the constructor with parameters
					Integer.parseInt(y4[1]),
					y4[2], Integer.parseInt(y4[3]));

			sarl.add(stp);

			i=0;
			while(i<netl.size()){
				if(netl.get(i).getNetID()==stp.getNetID())
						Network.addStopareas(stp);
				i++;
			}i =0;

			}
			b.close();
	
			File stp = new File (path+"stopoint.dat");					// Stopoint classs extraction
			x = null;
			String y5[];
			Scanner s5 = new Scanner (stp);							// starts the scanner
			while(s5.hasNextLine()){									// reads till EOF encountered 
				x = s5.nextLine();
				y5 = x.split("\\|");
			Stopoint stpt = new Stopoint(Integer.parseInt(y5[0]),		// Object calling the constructor with parameters
					Integer.parseInt(y5[1]),
					Integer.parseInt(y5[2]),
					Integer.parseInt(y5[3]),
					Integer.parseInt(y5[4]), y5[5]);
			i=0;

			while(i<sarl.size()){
				if(sarl.get(i).getSarID()==stpt.getSarID())
						Stoparea.addStopoints(stpt);
				i++;
			}i =0;
		}
			File point = new File (path+"point.dat");						// Point class extraction
			x = null;
			String y9[];
			Point p = null;
			Scanner s9 = new Scanner (point);							// starts the scanner
			while(s9.hasNextLine()){									// reads till EOF encountered 
				x = s9.nextLine();
				y9 = x.split("\\|");
			p= new Point(Integer.parseInt(y9[0]),						// Object calling the constructor with parameters
					Integer.parseInt(y9[1]),
					Integer.parseInt(y9[2]));
			pntl.add(p);
			}
				File sr = new File (path+"sar_on_rte.dat");								// Stoparea on Route class
				x = null;
				String y6[];
				Scanner s6 = new Scanner (sr);
				while(s6.hasNextLine()){											// reads till EOF encountered 
					x = s6.nextLine();
					y6 = x.split("\\|");
					i=0;
				SarOnRte sor1 = new SarOnRte(Integer.parseInt(y6[0]),			// Object calling the constructor with parameters
						Integer.parseInt(y6[1]),
						Integer.parseInt(y6[2]),
						Integer.parseInt(y6[3]),
						Integer.parseInt(y6[4]),
						Integer.parseInt(y6[5]));
				while(i<rtl.size()){
					if(rtl.get(i).getRouteID()==Integer.parseInt(y6[3]))
							Route.addStopareas(sor1);
					i++;
				}
				}
				File lnk = new File (path+"link.dat");								// Link class extraction
				x = null;
				String y7[];
				Link link = null;
				BufferedReader b2 = new BufferedReader(new FileReader(lnk));
				while((x=b2.readLine())!=null){									// reads till EOF encountered
					y7 = x.split("\\|");
					Point p1 = pntl.get(Integer.parseInt(y7[1])-1);
					Point p2 = pntl.get(Integer.parseInt(y7[2])-1);
				link= new Link(Integer.parseInt(y7[0]),							// Object calling the constructor with parameters 
						y7[3], y7[4]);
				link.addStartPoint(p1);
				link.addEndPoint(p2);
				int ax = p1.getxVal();
				int ay = p1.getyVal();
				int bx = p2.getxVal();
				int by = p2.getyVal();
				d += Math.sqrt(Math.pow(ax-bx, 2)+Math.pow(ay-by, 2));
				lnkl.add(link);
				}
				b2.close();
				File srr = new File ("lnk_on_rte.dat");						// Link on Route extraction
				x = null;
				String y8[];
				Scanner s8 = new Scanner (srr);
				 while(s8.hasNextLine()){									// reads till EOF encountered 
				 	x = s8.nextLine();
					y8 = x.split("\\|");
				LnkOnRte sor = new LnkOnRte(Integer.parseInt(y8[0]), 		// Object calling the constructor with parameters 
						Integer.parseInt(y8[1]),
						Integer.parseInt(y8[2]),
						Integer.parseInt(y8[3]),
						Integer.parseInt(y8[4]));
				i=0;
				while(i<rtl.size()){
					if(rtl.get(i).getRouteID()==Integer.parseInt(y8[2]));
							Route.addLinks(sor);
					i++;
				}i =0;
				 }
			
					
				File ptlnk = new File (path+"pnt_on_lnk.dat");					// Point on Link class extraction
				x = null;

				String y0[];
				Scanner s0 = new Scanner (ptlnk);
				while(s0.hasNextLine()){									// reads till EOF encountered 
					x = s0.nextLine();
					y0 = x.split("\\|");
				PntOnLnk sor2 = new PntOnLnk(Integer.parseInt(y0[0]),		// Object calling the constructor with parameters 
						Integer.parseInt(y0[1]),
						Integer.parseInt(y0[2]));
				i=0;
			}		
			
			}
		public static void NetworkBuilder(String givenPath) throws IOException{
			path = givenPath;
			build();	
		}
}
