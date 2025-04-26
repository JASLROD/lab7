import java.util.Arrays;
/**
 * The ArrayMethods class provides several utility methods
 * to operate on a predefined integer array.
 * It includes methods for counting elements, 
 * summing elements, finding the average, finding the maximum value, 
 * locating specific elements, copying arrays, and printing arrays.
 * 
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 4/22/2025
 */
public class ArrayMethods
{
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    /**
     * Counts the number of elements in the array.
     *
     * @return the number of elements in myArray
     */
    public int count(){
        int size = 0;
        for (int number: myArray)
            size++;
        return size;
    }

    /**
     * Calculates the sum of all elements in the array.
     * 
     * @return the sum of all elements in myArray
     */
    public int sum(){
        int total = 0;
        for (int number: myArray)
            total+=number;
        return total;
    }

    /**
     * Calculates the average value of the elements in the array.
     * 
     * @return the average of elements as a double
     */
    public double average(){//+ average (): double
        double average = 0;
        average = (double)sum()/count();
        return average; // short cut retun (double) sum()/count();
    }

    /**
     * Finds the maximum value in the array.
     * 
     * @return the largest value found in myArray
     */
    public int findMax(){//+ findMax (): int 
        int max = myArray[0];
        for (int i=1; i< myArray.length; i++){
            if (myArray[i]>max){
                max = myArray[i];
            }
        }

        return max; // short cut retun (double) sum()/count();    
    }

    /**
     * Finds the index of the first occurrence of the maximum value in the array.
     * 
     * @return the index of the maximum value
     */
    public int findIndexOfMax(){//+findIndexOfMax (): int
        int max = myArray[0];
        int index = 0;
        for (int i=1; i< myArray.length; i++){
            if (myArray[i]>max){
                max = myArray[i];  
                index = i;
            }
        }
        return index;
    }

    /**
     * Finds the last occurrence of a given key in the array.
     * 
     * @param key the value to find
     * @return the index of the last occurrence of the key, or -1 if not found
     */
    public int findLast(int key){//+findLast (int key): int
        int index = -1;
        int i = myArray.length-1;
        boolean found = false;
        while(!found && i>=0){
            if(myArray[i]==key){
                found = true;
                index = i;
            }//end if
            i--;
        }//end wile
        return index;
    }

    /**
     * Finds all indices where a given key occurs in the array.
     * 
     * @param key the value to find
     * @return an array of indices where the key is found
     */
    public int[] findAll (int key){//+findAll(int key): int [ ] 
        int counter =0;
        for(int i=0; i< myArray.length; i++)
            if(myArray [i] ==key){
                counter ++;
            }
        int array[] = new int[counter];
        int index = 0;

        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == key){
                array[index]=i;
                index++;
            }
        }

        return array;
    }

    /**
     * Returns a reference to the internal array.
     * 
     * @return the original myArray
     */
    public int[] getArray(){//+getArray(): int[ ]

        return myArray;
    }

    /**
     * Returns a copy of the internal array.
     * 
     * @return a new array containing the same elements as myArray
     */
    public int[] copyArray(){//+copyArray (): int [ ] 
        int copy[] = Arrays.copyOf(myArray, myArray.length);
        return copy;
    }

    /**
     * prints an int array, nicely formatted
     * @param inArray int array to print
     * 
     */
    public void print(int[ ] inArray)//+print(int [ ] a): void
    {
        System.out.print("{");
        int i;
        // print elements before the last, separated by commas
        for (i = 0; i < inArray.length - 1; i++)
            System.out.print(inArray[i] + ", ");
        // print last element. Careful here to handle length 0
        if (inArray.length > 0)
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}

