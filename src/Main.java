public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int a1 = array1.length;
        int [] array = new int[a1+array2.length];
        for (int i = 0; i<a1;i++) {
            array[i] = array1[i];
        }
        for ( int i = a1; i< array2.length + a1;i++){
            array[i] = array2[i-a1];
        }

        return array;
    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] arr = new int[array1.length+array2.length];
        int one = 0;
        int two = 0;
        for (int i = 0; i<array1.length+array2.length; i++) {
            if (i%2 == 0) {
                arr[i] = array1[one];
                one = one+1;
            }
            else {
                arr[i] = array2[two];
                two = two+1;
            }
        }
        return arr;
    }

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {
        int[] array= new int [array1.length];
        for ( int i = 0; i<array.length;i++){
            array[i]= array1[i]*array2[i];
        }
        return array;
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        int[] result = new int [words.length];
        for ( int i = 0; i<words.length; i++){
          result[i] =  countCapitalLetters(words[i]);
        }
        return result;
    }

    public static int countCapitalLetters(String word) {
        int count = 0;
        for( int i = 0; i<word.length();i++){
            char c = word.charAt(i);
            int num = (char) c ;
            if (num>64 && num<89){
                count += 1;
            }
        }

        return count;

    }

}
