import java.lang.reflect.Array;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);


    }
    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static int indexOfSmallest(int[] array) {
        int min_ind = 0;
        for(int i=0;i<array.length;i++) {
            if(array[i]<array[min_ind]) {
                min_ind = i;
            }
        }
        return min_ind;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min_ind = startIndex;
        for(int i=startIndex;i<table.length;i++) {
            if(table[i]<table[min_ind]) {
                min_ind = i;
            }
        }
        return min_ind;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

    }

    public static void sort(int[] array) {
        for(int i=0;i<array.length;i++) {
            int min_ind = indexOfSmallestFrom(array,i);
            
            swap(array,i,min_ind);
            if(min_ind!=i){
                System.out.println(Arrays.toString(array));
            }
        }
    }
            
}
