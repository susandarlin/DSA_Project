package com.ssdl.dsa.TwoThreeFourTree;

import java.util.ArrayList;

public class Node {
    Node parent;
    
    public Integer keys[] = new Integer[3];
    ArrayList<Node> children = new ArrayList<Node>();
    public int noOfNode = 1; // 2,3 or 4
    public int order = 4;
    
    public Node insert(int value)
    {
        if(noOfNode != 4) // Normal insert
        {
            //return simpleInsert(value);

        }
        else
        {
          //split case

          //Node node = this.splitNode(this);
        }
        return this;
    }
}
