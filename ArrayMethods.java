
/**
 * Write a description of class ArrayMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    public int count(){
        int size = 0;
        for (int number;myArray)
        size++;
        return size;
    }

    public int sum(){
        int total = 0;
        for (int number;myArray)
        total+=number;
        return total;
    }

    public double average(){//+ average (): double
        average = (double)sum()/count();
        return average; // short cut retun (double) sum()/count();
    }

    public int Max(){//+ findMax (): int 
        int Max = myArray[0];
        int index = 0;
        for (0< myArray.length)
        if (myArray[i]>Max0){
            Max = myArray[i];
            index = i;
        }

        return Max; // short cut retun (double) sum()/count();    
    }

    public int findLast(int key){//+findLast (int key): int
        for (int c = myArray.length-1;i >=0;i--)
            if(myArray[i]==key){
                int index=-1;
                return-1;
            }
    }

    public int[] findAll (int key){//+findAll(int key): int [ ] 
        int counter =0;
        for(int i=0; i< myArray.length; i++){
            if(myArray [i] ==key)
                counter ++;
        }

    }

    public int[] getArray(){//+getArray(): int[ ]
        int[]array= new int[counter];
        int index = 0;
        for(int i=0; i< myArray.length; i++)
            if(myArray[i] ==key){
            array[index]=i;
            counter ++;
        }
        return array;
    }
    
    public int[] copyArray(){//+copyArray (): int [ ] 
        arrays.copyof(myArray, myArray.length);
    }
}
