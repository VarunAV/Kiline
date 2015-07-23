/*
 * Soln
 * 
 * v1.0
 * 
 * 04-07-2015
 * 
 * This file is copyrighted
 */

package Solution1;

import java.io.*;

public class Soln {
	
	public static void main(String[] args) throws IOException{
		
		Extract.NetworkBuilder("/home/v3/data/");  //	Place your data path here. Builds the network 
		// Solution #1
		System.out.println(Network.getLines().size());
		
		// Solution #2
		System.out.println(Network.getRoutes().size());
		
		// Solution #3
		System.out.println(Network.findStopoints(1, 1));
		
		// Solution #4
		Network.findLineRouteID(3672,352);
	}
}
