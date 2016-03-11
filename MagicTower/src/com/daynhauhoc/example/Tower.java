
package com.daynhauhoc.example;

/**
 * @author hoangpt
 */
public class Tower {

  public int nrFloor = 8;
  
  /**
   * build Tower
   * @author hoangpt
   */
  void buildTower() {
    for (int i = 1; i <= nrFloor; i++) {
      _buildFloor(i);
    }
  }

  /**
   * build Each Floor
   * @author hoangpt
   * 
   * @param floor 
   */
  private void _buildFloor(int floor) {
    //build space
    for (int j = 1; j < nrFloor-floor; j++) {
      System.out.print(" ");
    }
    
    /*
    build nr
    */
    int middleNr = 2*floor - 1;
    
    //--1: build left
    for (int k = floor; k < middleNr; k++) {
      int h = k%10;
      System.out.print(h);
    }
    
    //--2: middle
    int n = middleNr%10;
    System.out.print(n);
    
    //--3: build right
    for (int k = middleNr-1; k >= floor; k--) {
      int h = k%10;
      System.out.print(h);
    }
    
    //end floor
    System.out.println("");
  }
}
