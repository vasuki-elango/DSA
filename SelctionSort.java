class SelctionSort{
  public static void main(String[] args){
    int[] arr={2,3,4,9,1,7};
    int n=arr.length;
    for(int i=o0;i<n-1;i++){
      int min = i;
      for(int j=i;j<n;j++){
        if(arr[j]<arr[min]){
          min=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[min];
      arr[min]=temp;
    }
  }
}
