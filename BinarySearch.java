class BinarySearch{
    public static int BinarySearch(int[] arr,int target){
        int low,high;
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr ={1 28 36 44 48 64 78 78};
        int target=10;
        System.out.println(BinarySearch(arr,target));
    }
}
