public class 네트워크 {

    public static boolean[] visited;
    
    public static void dfs(int idx, int n, int[][] computers){
        visited[idx] = true;
        for(int i=0; i<n; i++){
            if(!visited[i] && computers[idx][i] == 1){
                dfs(i,n,computers);
            }
        }
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, n, computers);
                ++answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 3; //컴퓨터 수
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}; //컴퓨터
        System.out.println("네트워크 수는 ? "+ solution(n, computers));
    }
}
