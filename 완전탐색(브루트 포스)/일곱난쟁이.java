public class 일곱난쟁이 {
    public static void main(String[] args) {
        int[] arr = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("총합 : " + sum);
    }
}