/*
 * PntOnLnk
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

public class PntOnLnk {
	
	// Stores the link ID
	int linkID;
	// Stores the point ID 
	int pointID;
	// Stores the place order
	int placeOrder;
	
	//   Constructor sets the values to the particular fields of the PntOnLnk class 	
	public PntOnLnk (int l, int p, int po){ 						// constructor to initialise the variables	
		if(l!=0)
			linkID = l;
		if(p!=0)
			pointID = p;
		placeOrder = po;
	}
	public PntOnLnk (int l, int p){ 						// constructor to initialise the variables	
		if(l!=0)
			linkID = l;
		if(p!=0)
			pointID = p;
	}
	
    //   getLinkID() returns the link ID of a particular instance of PntOnLnk	
	public int getLinkID(){
		return linkID;
	}
	//   getPointID() returns the point ID of a particular instance of PntOnLnk	
	public int getPointID(){
		return pointID;
	}
	//   getPlaceOrder() returns the place order of a particular instance of PntOnLnk	
	public int getPlaceOrder(){
		return placeOrder;
	}
}
