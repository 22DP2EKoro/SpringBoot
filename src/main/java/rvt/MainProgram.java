package rvt;

public abstract class MainProgram {
    public static int smallest(int[] intArr){
        int smallest = intArr[0];
            for (int i = 0; i < intArr.length; i++){
                if(intArr[i] < smallest){
                    smallest = intArr[i];
                }
            }
            return smallest;
 

    }

    public static int indexOfSmallest(int[] array){
        int index = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
        }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
        }
        return array;
    }

    private static void swap(int[] array, int i, int indexOfSmallest) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
    }
    
    

}
