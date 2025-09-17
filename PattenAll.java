import java.util.*;
public class PattenAll{
public static void main(String[] args) {
    
    // *
    // * *
    // * * *
    // * * * * like this
// Patten1( 5);
// * * * * 
// * * * * 
// * * * *
// Patten2(4);

//     * * * * * *
    // * * * * *
    // * *  *
    // * * 
    // * 
// Patten3(4);


// 1
// 1 2 
// 1 2 3
// 1 2 3 4 
// Patten4(5);

//    *
//    * * 
//    * * * 
//    * * * *
//    * * *
//    * * 
//    * 
// Patten5(5);
    //     * 
    //    *  * 
    //   *  *  *
    // *  *  *  *
    //   *  *  * 
    //    *  * 
    //      *   like this 

    Patten6(5);
    }

    static void Patten1(int n ){

        for( int row =1; row <=n; row++){

            for( int col= 1; col<= row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


       static void Patten2(int n ){

        for( int row =1; row <=n; row++){

            for( int col= 1; col<= n; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


           static void Patten3(int n ){

        for( int row =1; row <=n; row++){

            for( int col= 1; col<= n+1-row; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


             static void Patten4(int n ){

        for( int row =1; row <=n; row++){

            for( int col= 1; col<= row; col++){
                System.out.print(" "+col);
            }

            System.out.println();
        }
    }


               static void Patten5(int n ){

        for( int row =0; row <2*n; row++){
             int coloRowNum = row > n ? 2 * n - row : row;

            for( int col= 0; col< coloRowNum; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


               static void Patten6(int n ){

        for( int row =0; row <2*n; row++){
             int coloRowNum = row > n ? 2 * n - row : row;
             int numOfSpaces = n - coloRowNum;

             for( int s = 0; s < numOfSpaces; s++){
                System.out.print(" ");
             }

            for( int col= 0; col< coloRowNum; col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }



    

}
