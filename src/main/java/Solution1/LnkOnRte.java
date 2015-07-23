/*
 * LnkOnRte
 * v1.0
 * 04-07-2015
 * This file is copyrighted
 */

package Solution1;

public class LnkOnRte {
	
	// Stores the network version 
	int netVer;
	// Stores the link ID 
	int lineID;
	// Stores the route ID 
	int routeID;
	// Stores the link ID 
	int linkID;
	// Stores the link place 
	int linkPlace;
	
	//   Constructor sets the values to the particular fields of the LnkOnRte class   	
	public LnkOnRte (int n, int l, int r, int lid, int lp){ 		// constructor to initialise the variables	
		if(n!=0)
			netVer = n;
		if(l!=0)
			lineID = l;
		if(r!=0)
			routeID = r;
		if(lid!=0)
			linkID = lid;
		linkPlace = lp;
	}
	public LnkOnRte (int n, int l, int r, int lid){ 		// constructor to initialise the variables	
		if(n!=0)
			netVer = n;
		if(l!=0)
			lineID = l;
		if(r!=0)
			routeID = r;
		if(lid!=0)
			linkID = lid;
	}

    //   getNetVer() returns the network version of a particular instance of LinkOnRte	
	public int getNetVer(){
		return this.netVer;
	}
    //   getLineID() returns the line ID of a particular instance of LnkOnRte		
	public int getLineID(){
		return this.lineID;
	}
    //   getRouteID() returns the route ID of a particular instance of LnkOnRte	
	public int getRouteID(){
		return this.routeID;
	}
    //   getLinkID() returns the link ID of a particular instance of LnkOnRte
	public Object getLinkID(){
		return this.linkID;
	}
    //   getLinkPlace() returns the link place of a particular instance of LnkOnRte		
	public int getLinkPlace(){
		return this.linkPlace;
	}

}