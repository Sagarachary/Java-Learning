package Day5;

public class LinearSearch2 {
    public static int linearSearch(String[] array,String key){
        for(int i=0;i<array.length;i++){
            if(array[i].equals(key)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String menue[] = { "dosa","chole", "puri","idli","sambhar","vada","uttapam"};
        String key = "sambhar";
        int index = linearSearch(menue, key);
        if(index == -1){
            System.out.println("Element not found");
    }else{
        System.out.println("Element found at index:"+index);
    }
}
}
