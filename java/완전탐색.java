public class 완전탐색 {
    public static void main(String[] args) {
        
        int target = 14;
        int[] arr = {4,1,7,9,3,16,5};
        boolean isFlag = false;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum == target){
                   isFlag = true;
                }
            }
        }
        System.out.println(isFlag);
    }
}
