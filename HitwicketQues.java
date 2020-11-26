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
//import java.lang.*;
//import java.io.*;

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
        String input="";
        //while(input!="quit")
        {
            System.out.println("enter pawn number and direction:");
            input = sc.next();
            String direction  = sc.next();
            if(direction == "F")
            {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(grid[i][j] == input)
                        {
                            grid[i][j] = "0";
                            grid[i][j+1] = input;
                        }
                    }
                }
            }
            if(direction == "B")
            {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(grid[i][j] == input)
                        {
                            grid[i][j] = "0";
                            grid[i][j-1] = input;
                        }
                    }
                }
            }
            if(direction == "L")
            {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(grid[i][j] == input)
                        {
                            grid[i][j] = "0";
                            grid[i-1][j] = input;
                        }
                    }
                }
            }
            if(direction == "R")
            {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(grid[i][j] == input)
                        {
                            grid[i][j] = "0";
                            grid[i+1][j] = input;
                        }
                    }
                }
            }

        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(grid[4][4]);
    }
    
}
