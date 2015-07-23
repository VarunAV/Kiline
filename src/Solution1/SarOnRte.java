/*
 * SarOnRte
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

public class SarOnRte {
	
	// Stores the network version
	int netVer;
	// Stores the stoparea ID 
	int stopareaID;
	// Stores the link ID 
	int lineID;
	// Stores the route ID
	int routeID;
	// Stores the stopoint ID 
	int stopointID;
	// Stores the stop place 
	int stopPlace;
	
	//   Constructor sets the values to the particular fields of the SarOnRte class  	
	public SarOnRte (int n, int s, int l, int r, int sid, int sp){	 	 // constructor	to initialise the variables
		if(n!=0)
			netVer = n;
		if(s!=0)
			stopareaID = s;
		if(l!=0)
			lineID = l;
		if(r!=0)
			routeID = r;
		if(sid!=0)
			stopointID = sid;
		stopPlace = sp;
	}
	public SarOnRte (int n, int s, int l, int r, int sid){	 	 // constructor	to initialise the variables
		if(n!=0)
			netVer = n;
		if(s!=0)
			stopareaID = s;
		if(l!=0)
			lineID = l;
		if(r!=0)
			routeID = r;
		if(sid!=0)
			stopointID = sid;
	}
	//   get_netVer() returns the network version of a particular instance of SarOnRte		
	public int getNetVer(){
		return netVer;
	}
	//   get_staopareaID() returns the stoparea ID of a particular instance of SarOnRte	
	public int getStopareaID(){
		return stopareaID;
	}
	//   get_lineID() returns the line ID of a particular instance of SarOnRte	
	public int getLineID(){
		return lineID;
	}
	//   get_nrouteID() returns the route ID of a particular instance of SarOnRte
	public int getRouteID(){
		return routeID;
	}
	//   get_stopointID() returns the stopoint ID of a particular instance of SarOnRte	
	public int getStopointID(){
		return stopointID;
	}
	//   get_stopPlace() returns the stop place  of a particular instance of SarOnRte
	public int getStopPlace(){
		return stopPlace;
	}
}