
/**
 * Write a description of class ArrayMethods here.
 *
 * @author Jasmin Leonrodriguez, jleonrodriquez@student.sdccd.edu
 * @version v1.0
 * @since 4/22/2025
 */
public class ArrayMethods
{
    int[] myArray = {7, 8, 8, 3, 4, 9, 8, 7};

    public int count(){
        int size = 0;
        for (int number: myArray)
            size++;
        return size;
    }

    public int sum(){
        int total = 0;
        for (int number: myArray)
            total+=number;
        return total;
    }

    public double average(){//+ average (): double
        average = (double)sum()/count();
        return average; // short cut retun (double) sum()/count();
    }

    public int findMax(){//+ findMax (): int 
        int Max = myArray[0];
        for (int i=1; i< myArray.length; i++){
            if (myArray[i]>Max){
                Max = myArray[i];
            }
        }

        return Max; // short cut retun (double) sum()/count();    
    }

    public int findIndexOfMax(){//+findIndexOfMax (): int
        int Max = myArray[0];
        int index = 0;
        for (int i=1; i< myArray.length; i++){
            if (myArray[i]>Max){
                Max = myArray[i];  
                index = i;
            }
        }
        return index;
    }

    public int findLast(int key){//+findLast (int key): int
        int Last = -1;
        int i = myArray.length-1;
        boolean found = false;
        while(!found && i>=0){
            if(myArray[i]==key){
                found = true;
                Last = i;
            }
            int index=-1;
        }
        return Last;
    }

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

    public int[] getArray(){//+getArray(): int[ ]

        return myArray;
    }

    public int[] copyArray(){//+copyArray (): int [ ] 
        int copy[] = Arrays.copyOf(myArray, myArray.length);
        return copy;
    }

    public void print(int[] inArray){//+print(int [ ] a): void
        System.out.print("{");
        int i;
        for(i =0 ; i < inArray.length-1; i++)
            System.out.print(inArray[i] +",");
        if (inArray.length> 0 )
            System.out.print(inArray[i]);
        System.out.println("}");
    }
}

