/*
 * Route
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

import java.util.LinkedList;

public class Route {
	// Stores the network ID
	int netID;
	// Stores the line ID
	int lineID;
	// Stores the route ID
	int routeID;

	
	//  Stores the links present in Route 
	static LinkedList<LnkOnRte> rteLnk = new LinkedList<LnkOnRte>();
	//  Stores the stopareas present in Route 
	static LinkedList<SarOnRte> sa = new LinkedList<SarOnRte>();
	
	//   Constructor sets the values to the particular fields of the Route class  
	public Route (int n, int l, int r){							// constructor to initialise the variables
		if(n!=0)
			netID = n;
		if(l!=0)
			lineID = l;
		if(r!=0)
			routeID = r;
	}
    //   addSa adds the stoparea to a particular instance of Route	
	public static void addStopareas(SarOnRte r){
		sa.add(r);
	}
    //   addLink adds the links to a particular instance of Route	
	public static void addLinks(LnkOnRte sor){
		rteLnk.add(sor);
	}
	//   getStoparea() returns the stoparea object present in Route
	public static LinkedList<SarOnRte> getStopareas(){
		return sa;
	}
	//   getLink() returns the link object present in Route
	public static LinkedList<LnkOnRte> getLinks(){
		return rteLnk;
	}
	//   getNetID() returns the network ID present in a particular instance of Route
	public int getNetID(){
		return this.netID;
	}
	//   getLineID() returns the line ID present in a particular instance of Route	
	public int getLineID(){
		return this.lineID;
	}
	//   getRouteID() returns the route ID present in a particular instance of Route	
	public int getRouteID(){
		return this.routeID;
	}
}