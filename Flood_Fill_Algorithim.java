package Graphs;
import java.util.*;
public class Flood_Fill_Algorithim {
    public static  void helper(int [][]images,int sr, int sc, int colour, boolean vis[][],int orgcolour) {
        if(sr<0 || sc<0 || sr>= images.length || sc>=images[0].length|| vis[sr][sc] || images[sr][sc]!=orgcolour){
            return;
        }
        // left
        helper(images,sr,sc-1,colour,vis,orgcolour);
        //right
        helper(images,sr,sc+1,colour,vis,orgcolour);
        //up
        helper(images,sr-1,sc,colour,vis,orgcolour);
        // down
        helper(images,sr+1,sc,colour,vis,orgcolour);
    }


    public static  int [][] floodfill(int [][]images,int sr, int sc, int colour){
        boolean [][] vist = new boolean[images.length][images[0].length];
        helper(images,sr,sc,colour,vist,images[sr][sc]);
        return images;
    }
    public static void main(String[] args) {
        int images [][] = {{1,1,1,},{1,1,0},{1,0,1}};
        int sr = 1;
                int sc = 1;
                int colour = 2;


    }
}
