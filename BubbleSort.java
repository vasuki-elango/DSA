class BubbleSort{
    public static void main(String args[]){
        int[] arr = {24,18,38,43,14,40,1,54};
        int n=arr.length;
  	    for(int i=0;i<n-1;i++){
              for(int j=0;j<n-1;j++){
                  if(arr[j]>arr[j+1]){
                      int temp=arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }
              }
  	    }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
