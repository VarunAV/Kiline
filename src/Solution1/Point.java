/*
 * Point
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

public class Point {
	// Stores the point ID
	int pointID;
	// Stores the x coordinate 
	int x_val;
	// Stores the y coordinate 
	int y_val;
	
	//   Constructor sets the values to the particular fields of the Point class 
	public Point (int p, int x, int y){					// constructor to initialise the variables
		if(p!=0)
			pointID = p;
		x_val = x;
		y_val = y;
	}
	//  get_pointID() returns the point ID present in a particular instance of Point
	public int getPointID(){
		return pointID;
	}
	//   getxVval() returns the x coordinate of the point present in a particular instance of Point
	public int getxVal(){
		return x_val;
	}
	//   getyVal() returns the y coordinate of the point present in a particular instance of Point
	public int getyVal(){
		return y_val;
	}
}
