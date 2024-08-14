package Day5;

public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[] ={2,3,4,5,6,7,8,9,10,11,12,13};
        int key = 10;

        int index = linearSearch(numbers,key);
        if(index==-1){
            System.out.println("Element not found"); 
    }else{
        System.out.println("Element found at index:"+index);
    }
}
}
// String menue[] = { "dosa","chole", "puri","idli","sambhar","vada","uttapam"};
// String key = "sambhar"; Do in LinearSearch in LinearSearch2.java file.