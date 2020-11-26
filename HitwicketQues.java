/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hansy
 */
import java.util.*;
import java.lang.*;
import java.io.*;

public class HitwicketQues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[][] grid = new String[5][5];
        System.out.println("Enter order for pawns for player 1, eg: P2 P3 P1 P5 P4 ");
        for(int i=0;i<5;i++)
        {    
            String player = sc.next();
            grid[4][i] = player;   
        }
        System.out.println("Enter order for pawns for player 2, eg: P2 P3 P1 P5 P4 ");
        for(int i=0;i<5;i++)
        {    
            String player = sc.next();
            grid[0][i] = player;   
        }
        System.out.println(grid[4][4]);
    }
    
}
