/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author macbookair
 */
public class GameOfLife {
public static void main(String[] args) {

         //The grid must be a 2D array of boolean
         boolean [][] worldSize = new boolean [10][10];
  
         
        //Generating initial grid

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                if ((i == 1 && j == 1) || (i == 2 && j == 1) ||

                    (i == 1 && j == 2) || (i ==4 && j ==4) ||

                    (i == 3 && j == 4) || (i == 4 && j == 3)) {

                    worldSize[i][j] = true;

                    System.out.print("X");  //X represents live cells

                }

                else {

                    worldSize[i][j] = false;

                    System.out.print("o");  //o represents dead cells

                }  

            }

            System.out.println();

        }

         

                //declaring variables to use in coming loop

        int i, j, k, l;

        i = j = 1;

        int aliveNeighbours = 0;

        for (i = 1; i < 10-1; i++) {

            for (j = 1; j < 10-1; j++) {

                    aliveNeighbours = 0;

                    if (worldSize[i-1][j-1]) aliveNeighbours++;

                    if (worldSize[i][j-1]) aliveNeighbours++;

                    if (worldSize[i-1][j]) aliveNeighbours++;

                    if (worldSize[i+1][j-1]) aliveNeighbours++;

                    if (worldSize[i-1][j+1]) aliveNeighbours++;

                    if (worldSize[i+1][j+1]) aliveNeighbours++;

                    if (worldSize[i][j+1]) aliveNeighbours++;

                    if (worldSize[i+1][j]) aliveNeighbours++;

                                        //implementing the rules of GameOfLife

                    if (aliveNeighbours < 2 || aliveNeighbours > 3)

                                worldSize[i][j] = false;

                    if (aliveNeighbours == 2 || aliveNeighbours == 3)

                                worldSize[i][j] = true;

                    if (aliveNeighbours == 3 && worldSize[i][j] == false)

                                worldSize[i][j] = true;

                     

                    //printing updated grid

                    for (k = 0; k < 10; k++) {

                        for (l = 0; l < 10; l++) {

                            if (worldSize[k][l] == true)

                                System.out.print("X");

                            else {

                                worldSize[k][l] = false;

                                System.out.print("o");

                            }

                        }

                        System.out.println();

                    }

                    System.out.println();

            }

        }

        
        
        
        
    }
    
}
