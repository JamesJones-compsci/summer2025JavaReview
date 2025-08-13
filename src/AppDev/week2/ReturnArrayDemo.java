package AppDev.week2;

public class ReturnArrayDemo {

    public static void main(String[] args) {
        int[] numbers = createArray(5);

        System.out.println("Returned array (multiples of 10):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // newline

        int[] myArray = createArray2(7);
        System.out.println("Returns an array of length n containing the first n square numbers:");

        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

        // Method returns an array of size n filled with multiples of 10
        public static int[] createArray ( int n){
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = (i + 1) * 10;
            }

            return arr;  // Return the array reference
        }

        // Method returns an array of size n filled with the first n square numbers
        public static int[] createArray2 (int n){

            int[] myArray = new int[n];

            for (int i = 0; i < n; i++) {

                myArray[i] = (i + 1) * (i + 1);

                // or equivalently: myArray[i] = (int) Math.pow(i + 1, 2);
            }
            return myArray;
        }
    }

