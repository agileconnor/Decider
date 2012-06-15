/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package decider;

/**
 *
 * @author Connor
 */
public class Decider {
    public static int Closest (float p1, float p2, float p3, float p4, float num) {
       float p1s, p2s, p3s, p4s, p1a, p2a, p3a, p4a, i;
       p1s = p1 - num;
       p2s = p2 - num;
       p3s = p3 - num;
       p4s = p4 - num;
       p1a = java.lang.Math.abs(p1s);
       p2a = java.lang.Math.abs(p2s);
       p3a = java.lang.Math.abs(p3s);
       p4a = java.lang.Math.abs(p4s);
       i = 1;
       if (p1 == 0) {
           p1a = 0;
       }
       if (p2 == 0) {
           p2a = 0;
       }
       if (p3 == 0) {
           p3a = 0;
       }
       if (p4 == 0) {
           p4a = 0;
       }
       int winner = 0;
       boolean p1w = false;
       boolean p2w = false;
       boolean p3w = false;
       boolean p4w = false;
       boolean error = false;
       while (true) {
           if (p1a == i) {
               p1w = true;
           }
           if (p2a == i) {
               p2w = true;
           }
           if (p3a == i) {
               p3w = true;
           }
           if (p4a == i) {
               p4w = true;
           }
           if (p1w == true || p2w == true || p3w == true || p4w == true) {
               break;
           }else if (i == 20){
               error = true;
               break;
           }else{
               i = i + 1;
           }
       }
       if (p1w == true) {
           winner = 1;
       }
       if (p2w == true) {
           winner = 2;
       }
       if (p3w == true) {
           winner = 3;
       }
       if (p4w == true) {
           winner = 4;
       }
       if (error == true) {
           winner = 0;
       }
       return winner;
    } 
}
