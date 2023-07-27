import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 유기농배추 {

    static boolean map[][];
    static boolean visited[][];
    static int T,N,M,K;
    //M 가로, N 세로
    //K 배추가 심어져 있는 위치 개수
    static int[] dirY = {-1,1,0,0};
    static int[] dirX = {0,0,-1,1};

    public static void dfs(int x, int y){
        visited[y][x] = true;
        for(int i=0; i<4; i++){
            int newY = y + dirY[i];
            int newX = x + dirX[i];
            if(map[newY][newX] && !visited[newY][newX]){
                dfs(newY, newX);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new boolean[N+1][M+1];
            visited = new boolean[N+1][M+1];

            //map 정보 세팅
            for(int i=1; i<K; i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y+1][x+1] = true;
            }
            //dfs 수행
            int answer = 0;
            for(int i=1; i<=N; i++){
                for(int j=1; j<=M; j++){
                    if(map[i][j] && !visited[i][j]){
                        ++answer;
                    }
                }
            }

            //출력
            bw.write(String.valueOf(answer));
            br.close();
            bw.close();
        }
        
    }
}