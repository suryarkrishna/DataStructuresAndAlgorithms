/* 

*
*   * 
*       *
*   *   *   *   
*       *
*   *
*


*
*   * 
*       *
*           *
*   *   *   *   * 
*           *
*       *
*   *
*

*/

package interviewPrep;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = (n * 2) - 1;

        // approach:
        // as we can i believe we need to approaches to create a upper triangle and
        // lower triangle.

        // creating upper triangle
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0  ||  j == i-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            
            System.out.println();
        }
         for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j == i-1 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print("* ".repeat(n));
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0  ||  j == i-1 ) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }
            
            System.out.println();
        }
        for (int i = n ; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j == i-1 || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
