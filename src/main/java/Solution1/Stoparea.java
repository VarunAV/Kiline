/*
 * Stoparea
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

import java.util.LinkedList;

public class Stoparea {
	
	// Stores the network ID 
	int netID;
	// Stores the stoparea ID
	int sarID;
	// Stores the stoparea name
	String sarName;
	// Stores the principal
	int principal;
	
	//  Stores the stopoints present in stoparea 
    static LinkedList<Stopoint> stpPnt = new LinkedList<Stopoint>();
	
	//   Constructor sets the values to the particular fields of the Stoparea class  
	public Stoparea (int n, int s, String sn, int p){ 							// constructor to initialise the variables	
		if(n!=0)
			netID = n;
		if(s!=0)
			sarID = s;
		sarName = sn;
		principal = p;
	}
	public Stoparea (int n, int s){ 							// constructor to initialise the variables	
		if(n!=0)
			netID = n;
		if(s!=0)
			sarID=s;
	}
	
    //   addStpnt adds the stopoints to a particular instance of stoparea	
	public static void addStopoints(Stopoint st){
		stpPnt.add(st);
	}
	//   getStopoint() returns the stopoint object present in Stoparea	
	public static LinkedList<Stopoint> getStopoints(){
		return stpPnt;
	}
	//   getNetID() returns the network ID present in a particular instance of Stoparea
	public int getNetID(){
		return netID;
	}
	//   getSarID() returns the stoparea ID present in a particular instance of Stoparea
	public int getSarID(){
		return sarID;
	}
	//   getSarName() returns the stoparea name present in a particular instance of Stoparea
	public String getSarName(){
		return sarName;
	}
	//   getPrincipal() returns the printcipal present in a particular instance of Stoparea
	public int getPrincipal(){
		return principal;
	}

}