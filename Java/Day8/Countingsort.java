package Day8;
public class Countingsort {
    public static void countingSort(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
           largest = Math.max(largest,number[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<number.length; i++){
            count[number[i]]++;
        }

        // sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                number[j] =i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int number[]){
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int number[] ={5,4,1,3,2};
        countingSort(number);
        printArr(number);
    }
}