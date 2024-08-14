package Day5;

public class SubArrays {
    public static void printSubarrays(int numbers[]){
        
        int ts= 0;
        for(int i=0;i<numbers.length;i++){
            int sum=0,min=numbers[0],max=0;
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                    sum=sum+numbers[k];
                    if(min >= numbers[k]){
                        min = numbers[k];
                    }
                    if(max <= numbers[k]){
                        max = numbers[k];
                    }
                }
                ts++;
                System.out.println();
                System.out.println("sum of the sub array is : "+sum);
                System.out.println("Minimum value of the sub array is : "+min);
                System.out.println("Maximum value of the sub array is : "+max);
                sum=0;
            }
            System.out.println();
            
        }
        System.out.println("Total Subarrays: " + ts);
    }
    public static void main(String[] args){
        int totalsum =0;
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
        System.out.println(totalsum);
    }
}
// Home work.
// print the sum of the all sub arrays and find the minimum and maximum values of the sub arrays.//Done
