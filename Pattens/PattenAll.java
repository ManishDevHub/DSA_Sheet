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

    // Patten6(5);
    //    1
    //   212
//      32123
   // Patten7(4);

// 4 4 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 3 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 1 0 1 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 3 3 3 3 3 3 4
// 4 4 4 4 4 4 4 4 4

    // Patten8 (4);
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

                 static void Patten7(int n ){

        for( int row =0; row <n; row++){


             for( int s = 0; s < n- row; s++){
                System.out.print(" ");
             }

            for( int col= row; col>= 1; col--){
                System.out.print(col);
            }

              for( int col= 2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

     static void Patten8(int n ){
        int originalN = n;
        n = 2 * n;

        for( int row =0; row <=n; row++){ 

            for( int col= 0; col<=n; col++){
                int AtEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print( AtEveryIndex +" ");
            }

            
            System.out.println();
        }
    }



    

}
