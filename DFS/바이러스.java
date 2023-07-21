import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 바이러스 {
    
    static int N,M; // N은 노드, M은 연결 선
    static boolean[][] graph;
    static boolean[] visited;
    static int answer;

    public static void dfs(int idx){
        visited[idx] = true;
        ++answer;
        
        for(int i=1; i<=N; i++){
            if(!visited[i] && graph[idx][i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        
        //간선 정보 입력
        int x,y;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=M; i++){
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(1);

        bw.write(String.valueOf(answer - 1)); //출력
        br.close();
        bw.close();
    }
}