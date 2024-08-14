package Day5;

public class minelementofarray {
    public static int minElement(int numbers[]){
        int min = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,5,6,7,8,9,10,11,12};
        System.out.println("Minimum element of the array is : "+minElement(numbers));
    }
}
