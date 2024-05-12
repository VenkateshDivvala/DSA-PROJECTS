class FindElementInInfiniteArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int start=0;
        int end=1;
        int target=24;
       try{
            while(target>arr[end]){
                start=end+1;
                end=end+(end-start+1)*2;
            }
            System.out.print(findElement(arr, target, start, end));
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
    static int findElement(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}