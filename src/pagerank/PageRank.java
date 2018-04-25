/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerank;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author sam
 */
public class PageRank {

    //hash map for storing all generated nodes
    private static Map<String, node> nodeMap = new HashMap<>();
    //hash map for storing all edges joining nodes
    private Map<node, List<node>> edgeMap = new HashMap<>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //input the file
        //run through file creating nodes for each node.
        String filename;
        filename = args[0];
        FileReader in = null;
        in = new FileReader(filename);
        String line;
        Scanner input = new Scanner(in);
        while(input.hasNextLine()){
            line = input.nextLine();
            if(!(line.charAt(0)=='#')){
                String[] lineSplit = line.split("\t");
                System.out.println(lineSplit[0]);
                System.out.println(lineSplit[1]);
            }
        }
        //checking for key in list
        /*if(nodeMap.containsKey(newNode)){
            
        }*/
        
    }
   
}
