/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagerank;

/**
 *
 * @author sam
 */
public class node {
    public String nodeName;
    private float score;
    private float tempScore;
    
    //constructor
    node(String name){
        this.nodeName = name;
    }
    //setters
    public void setScore(float score){
        this.score = score;
    }
    
    public void setTempScore(float score){
        this.tempScore = score;
    }
    
    //getters
    public float getScore(){
        return score;
    }
    //very unlikely this will be useful but for completion sake.
    public String getName(){
        return nodeName;
    }
    
    public float getTempScore(){
        return tempScore;
    }
}
