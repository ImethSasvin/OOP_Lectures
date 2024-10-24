public class Main {

    static void printArray(int []a){
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }

    static int[] returnArray(){
        int [] arr2 = new int[]{7,8,9,10,11,12};
        return arr2;
    }

    public static void main(String[] args) {

        int [] arr = new int[]{1,2,3,4,5,6};

        printArray(arr);

        System.out.println();
        System.out.println( );

        int []  arr2 = returnArray();
        printArray(arr2);



    }
}