import java.util.HashSet;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //HashSet과 contains, remove 함수가 특징
        
        HashSet<Integer> reserveSet = new HashSet<Integer>();
        HashSet<Integer> lostSet = new HashSet<Integer>();
        
        for(int i : reserve){
            reserveSet.add(i);
        }
        for(int i : lost){
            if(reserveSet.contains(i)){//빌려줄 수 있는사람도 잃어버림
                reserveSet.remove(i);
            }else{
                lostSet.add(i);
            }
        }
        
        for(int i : reserveSet){
            if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            }else if(lostSet.contains(i+1)){
                lostSet.remove(i+1);
            }
        }
        
        
        return n - lostSet.size();
    }
}