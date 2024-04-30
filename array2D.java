
//**** program 1 -> PRINT BORDER ELEMENT ****

// public class array2D {
//     public static void main(String[] args) {
//         //int arr[][]=new int[3][3];
//         int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
//         // for(int i: arr){
//         //     System.out.println(i);
//         // }
//         for(int i=0;i<arr1.length;i++){
//             for(int j=0;j<arr1[0].length;j++){
//                 if((i==0) || (j==0) || (i==arr1.length-1)||(j==arr1[0].length-1)){
//                     System.out.println(arr1[i][j]);
//                 }
//             }
//             System.out.println(" ");
//         }

//     }
// }


// **** program 2 -> PRINT LOWER DIAGONAL ELEMENT *****

// public class array2D{
//     public static void main(String[] args){
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(i>j && i!=j){
//                     System.out.println(arr[i][j]);
//                 }
//             }
//         }
//     }
// }


// ****** program 3 -> SWAP FIRST ROW WITH LAST ****


// public class array2D{
//     public static void main(String[] args){
//         int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(i==0){
//                     System.out.print(arr[arr.length-1][j]+" ");
//                 }
//                 else if (i==arr.length-1) {
//                     System.out.print(arr[0][j]+" ");
                    
//                 } else {
//                     System.out.print(arr[i][j]+" ");
                    
//                 }
//             }
//             System.out.println();
//         }
//     }
// }




// ***** program 4 -> REPLACE ALL NEGATIVE ELEMENT WITH 0 *****


// public class array2D{
//     public static void main(String[] args){
//         int arr[][]={{1,-2,-3},{-4,5,6},{-7,8,-9},{-10,-11,12}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]<0){
//                     System.out.print(0+" ");
//                 }
//                 else{
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// ***** program 5 ->  FIND THE MAXIMUM ELEMENT IN ARRAY *****


// public class array2D{
//     public static void main(String[] args){
//         int arr[][]={{1,-2,-3},{-4,5,6},{-7,8,-9},{20,-11,12}};
//         int a=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]>a){
//                     a=arr[i][j];
//                 }
//             }
//         }
//         System.out.println(a);
//     }
// }


// ****** program - 6 -> SUM OF EACH ROW IN AN ARRAY ******


public class array2D{
    public static void main(String[] args){
        int arr[][]={{1,-2,-3},{-4,5,6},{-7,8,-9},{20,-11,12}};
        for(int i=0;i<arr[0].length;i++){
            int a=0;
            for(int j=0;j<arr.length;j++){
                a+=arr[j][i];
            }
            System.out.print(a + " ");
        }
    }
}