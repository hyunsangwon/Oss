import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수{
    
    static boolean[][] map;
    static boolean[][] visited;
    static int dirX[] = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int dirY[] = {0, 1, 1, 1, 0, -1, -1, -1};
    static final int DIRECTION = 8;

    public static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i=0; i<DIRECTION; i++){
            int newX = x + dirX[0];
            int newY = y + dirY[0];
            if(map[newX][newY] && !visited[newX][newY]){
                dfs(newX, newY);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        int w = 5;//가로길이
        int h = 5;//세로길이    
        int answer = 0;

        map = new boolean[w+1][h+1];    
        visited = new boolean[w+1][h+1];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //map settings
        for(int i=1; i<=h; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=w; j++){
                map[i][j] = Integer.parseInt(st.nextToken()) == 1;
            }
        }

        //bfs
        for(int i=1; i<=h; i++){
            for(int j=1; j<=w; j++){
                if(map[i][j] && !visited[i][j]){
                    ++answer;
                    dfs(i,j);
                }
            }
        }
        System.out.println("섬의 개수 : "+answer);

    }
}