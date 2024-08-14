public class TestArray {
    public static void main(String[] args){
        double[] myList= {1.9,6.9,6.8};
        // print all the array elements
        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
        // summing all elements
        for (int i=0; i<myList.length;i++){
            myList[i]=myList[i]+1;
        }
        for (int i=0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }
    }
}
