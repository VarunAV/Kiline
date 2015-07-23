/*
 * Link
 * v1.0
 * 04-07-2015
 * This file is copyrighted
 * 
 * Link class provides the details about the links present in the network 
 */

package Solution1;
import java.util.*;

public class Link {
	// Stores the link ID 
	int linkID;
	// Stores the start point
	Point startPoint;
	// Stores the end point 
	Point endPoint;
	// Stores the point description
	String pointDesc;
	// Stores the link date
	String linkDate;
	
	//  Stores the points present in link 
	static LinkedList<PntOnLnk> lnkPnt = new LinkedList<PntOnLnk>();
	
	//   Constructor sets the values to the particular fields of the Link class  
	public Link (int l, String p, String ld){ 	// constructor to initialise the variables	
		if(l!=0)
			linkID = l;
		pointDesc = p;
		linkDate = ld;
	}
    //   addPoint adds the points to a particular instance of link
	public static void addPoints(PntOnLnk stp){
		lnkPnt.add(stp);
	}
    //   getPoints() returns the point object present in link		
	public static LinkedList<PntOnLnk> getPoints(){
		return lnkPnt;
	}
	public void addStartPoint(Point p1){
		startPoint = p1;
	}
	public void addEndPoint(Point p2){
		endPoint = p2;
	}
    //   getLinkID() returns the linkID of a particular instance of link	
	public int getLinkID(){
		return linkID;
	}
    //   getStartPoint() returns the start point of a particular instance of link	
	public Point getStartPoint(){
		return startPoint;
	}
    //   getEndPoint() returns the end point of a particular instance of link	
	public Point getEndPoint(){
		return endPoint;
	}
    //  getPointDesc() returns the point description of a particular instance of link	
	public String getPointDesc(){
		return pointDesc;
	}
    //  getLinkDate() returns the date of a particular instance of link	
	public String getLinkDate(){
		return linkDate;
	}

}
