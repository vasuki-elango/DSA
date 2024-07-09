import java.util.*;
class Linearsearch{
    // Print the Linear Search
    public int LinearSearch(int[] arr,int target){
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
       }
       return -1;
    }
    public static void main(String args[]){
        int[] myArr = {12,3,24,6,18};
        int target = 2;
        Linearsearch myObj = new  Linearsearch();
        int result = myObj.LinearSearch(myArr,target);
        if(result == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(target+" is found "+result);
        }
    }
}
