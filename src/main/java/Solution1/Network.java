/*
 * Network
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

import java.io.IOException;
import java.util.*;
public class Network {
	// Stores the network ID
	int netID;
	// Stores the network version 
	String netVer;
	// Stores the start date 
	String startDate;
	// Stores the end date 
    String endDate;
    
    
	//  Stores the lines present in network 
    static List<Line> line = new ArrayList<Line>();
	//  Stores the stopareas present in network  
    static List<Stoparea> stpAr = new ArrayList<Stoparea>();
	//   Constructor sets the values to the particular fields of the Network class
    
    
    public Network (int n, String nv, String s, String e){			//constructor to initialise the variables
    	if( n != 0)
    		netID = n;
    	if( nv != null)
    		netVer = nv;
		startDate = s;
		endDate = e;
	}
    public Network (int n, String nv){			//constructor to initialise the variables	
    	if( n != 0)
    		netID = n;
    	if( nv != null)
    		netVer = nv;
	}
    //   addLines adds the line to a particular instance of network
    public static void addLines(Line l){
    	   	line.add(l);
    }
    //   addStopareass adds the stoparea to a particular instance of network		
    public static void addStopareas(Stoparea s){
    	stpAr.add(s);
    }
    
    // Extracts the data into the respective classes
    public static void networkBuilder() throws IOException{
    	Extract x = new Extract();
    	x.build();
    }
    
    // Find Lines in a network
    public static List<Line> findLines(int lID){
    	int i=0;
        List<Line> l = new ArrayList<Line>();
    	while(i<Network.getLines().size()){
    		if(Network.getLines().get(i).getLineID() == lID){
    			l.add(Network.getLines().get(i));
    		}
    	}
    		return l;
    }
    
    // returns the Routes present in network
    public static List<Route> getRoutes(){
    	int i=0;
    	int j=0;
    	List<Route> l = new ArrayList<Route>();
    	while(i<Network.getLines().size()){
    		Network.getLines().get(i);
			while(j<Line.getRoutes().size()){
    			Network.getLines().get(i);
				l.add((Route) Line.getRoutes().get(j));
    			j++;
    		}
    		i++;
    	}
    	return l;
    }
    // returns Stopoints present in a network with a particular lineID and routeID
    public static List<Integer> findStopoints(int lID, int rID){
    	int i=0;
        List<Integer> l = new ArrayList<Integer>();
    	while(i<Route.getStopareas().size()){
    		if(Route.getStopareas().get(i).getLineID() == lID && Route.getStopareas().get(i).getRouteID()==rID){
    					l.add(Route.getStopareas().get(i).getStopointID());
    				}
    		i++;
    	}
    		return l;
    }
    
    // returns the line and route ID for particular stopoints
    public static void findLineRouteID(int stopointID1, int stopointID2){
    	int i=0;
    	int j=0;
    	List<Integer> l = new ArrayList<Integer>();
    	List<Integer> r = new ArrayList<Integer>();
    	List<Integer> l2 = new ArrayList<Integer>();
    	List<Integer> r2 = new ArrayList<Integer>();

    	while(i<Network.getRoutes().size()){
    		Network.getRoutes().get(i);
			while(j<Route.getStopareas().size()){
    			Network.getRoutes().get(i);
				if(Route.getStopareas().get(j).getStopointID()==stopointID1){
    				Network.getRoutes().get(i);
					l.add(Route.getStopareas().get(j).getLineID());
					r.add(Route.getStopareas().get(j).getRouteID());
    			}
    			j++;
    		}
    		i++;
    	}
    	i=0;
    	j=0;
    	while(i<Network.getRoutes().size()){
    		Network.getRoutes().get(i);
			while(j<Route.getStopareas().size()){
    			Network.getRoutes().get(i);
				if(Route.getStopareas().get(j).getStopointID()==stopointID2){
    				Network.getRoutes().get(i);
					l2.add(Route.getStopareas().get(j).getLineID());
					r2.add(Route.getStopareas().get(j).getRouteID());
    			}
    			j++;
    		}
    		i++;
    	}
    	i=0;
    	j=0;
    	while(i<l.size()){
			while(j<l2.size()){
				if((l.get(i)==l2.get(j))&&r.get(i)==r2.get(j)){
					System.out.println(l.get(i)+","+r.get(i));
				}
				j++;
			}
			i++;
		}
    }
    //   get_Line() returns the line object present in network
    public static List<Line> getLines(){
    	return line;
    }
    //   get_stopArea() returns the stoparea object present in network
    public static List<Stoparea> getStopAreas(){
    	return stpAr;
    }
    //   get_netID() returns the network ID present in a particular instance of network	
	public int getNetID() {				
		return netID;
	}
	//   get_NetVer() returns the network version present in a particular instance of network
	public String getNetVer() {
		return netVer;
	}
	//   get_StartDate() returns the startdate present in a particular instance of network	
	public String getStartDate() {
		return startDate;
	}
	//   get_endDate() returns the end date present in a particular instance of network	
	public String getEndDate() {
		return endDate;
	}
}