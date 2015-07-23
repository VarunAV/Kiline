/*
 * Line
 * v1.0
 * 04-07-2015
 * This file is copyrighted
 * 
 * Line class provides the details about the lines present in the network 
 */

package Solution1;
import java.util.*;

public class Line {
	// Stores the Network ID
	int netID;
	// Stores the LineID
	int lineID;
	// Stores the lineTypeID
	int lineTypeID;
	//  Stores the Public Line Name
	String pubLineName;
	// Stores the Line Description 
	String lineDesc;

	//   Stores the routes present in the network 
	static LinkedList<Route> rte = new LinkedList<Route>();

	//   Constructor sets the values to the particular fields of the line class 	
	public Line (int n, int l, int lt, String pl, String ld){	 				// constructor to initialise the variables
		if(n!=0)
			netID = n;
		if(l!=0)
			lineID = l;
		lineTypeID = lt;
		pubLineName = pl;
		lineDesc = ld;
	}
	public Line (int n, int l){	 				// constructor to initialise the variables
		if(n!=0)
			netID = n;
		if(l!=0)
			lineID = l;
	}
	//   get_Route() returns the route object present in line 
	public static List<Route> getRoutes(){
    	return rte;
    }
	//   addRoute() adds the route to a particular instance of the line 
    public static void addRoutes(Route r){
    	rte.add(r);
    }
    //   getNetID() returns the netID of a particular instance of line		
	public int getNetID() {    
		return netID;
	}
    //   getLineID() returns the lineID of a particular instance of line	
	public int getLineID() {
		return lineID;
	}
    //   getLineTypeID() returns the lineTypeID of a particular instance of line	
	public int getLineTypeID() {
		return lineTypeID;
	}
    //   getPubLineNameID() returns the pubLineNameID of a particular instance of line	
	public String getPubLineName() {
		return pubLineName;
	}
    //   getLineDesc() returns the line description of a particular instance of line		
	public String getLineDesc() {
		return lineDesc;
	}
}