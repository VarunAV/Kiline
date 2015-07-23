/*
 * Stopoint
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

public class Stopoint {
	
	// Stores the network ID
	int netID;
	// Stores the stopoint ID 
	int stopointID;
	// Stores the stoparea ID 
	int sarID;
	// Stores the detection area ID 
	int detID;
	// Stores the point ID 
	int pointID;
	// Stores the point description 
	String pointDesc;
	
	//   Constructor sets the values to the particular fields of the Stopoint class  
	public Stopoint (int n, int sp, int s, int d, int p, String pd){		// constructor to initialise the variables	
		if(n!=0)
			netID = n;
		if(sp!=0)
			stopointID = sp;
		if(s!=0)
			sarID = s;
		detID = d;
		pointID = p;
		pointDesc = pd;
	}	
	public Stopoint (int n, int sp, int s){		// constructor to initialise the variables	
		if(n!=0)
			netID = n;
		if(sp!=0)
			stopointID = sp;
		if(s!=0)
			sarID = s;
	}	
	//   get_netID() returns the network ID present in a particular instance of Stopoint
	public int getNetID(){
		return netID;
	}
	//   get_stopointID() returns the stopoint ID present in a particular instance of Stopoint
	public int getStopointID(){
		return stopointID;
	}
	//   get_sarID() returns the stoparea ID present in a particular instance of Stopoint	
	public int getSarID(){
		return sarID;
	}
	//   get_detID() returns the detection area ID present in a particular instance of Stopoint
	public int getDetID(){
		return detID;
	}
	//   get_pointID() returns the point ID present in a particular instance of Stopoint	
	public int getPointID(){
		return pointID;
	}
	//   get_pointDesc() returns the point description present in a particular instance of Stopoint
	public String getPointDesc(){
		return pointDesc;
	}
}