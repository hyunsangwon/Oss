import java.util.*;

public class 신고결과받기 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> reportSet = new HashSet<String>();
        // 중복제거
        for (String rep : report) {
            reportSet.add(rep);
        }
        HashMap<String, List<String>> reportHash = new HashMap<>();
        for (String rep : reportSet) {
            int num = rep.indexOf(" ");
            String userId = rep.substring(0, num);// 유저 ID
            String reporterId = rep.substring(num + 1);// 신고한 ID

            List<String> userList = reportHash.getOrDefault(reporterId, null);
            if (userList == null) {
                userList = new ArrayList<>();
            }
            userList.add(userId);
            reportHash.put(reporterId, userList);
        }

        HashMap<String, Integer> hash = new HashMap<>();
        for (List<String> userList : reportHash.values()) {
            // GG..
        }
        return answer;
    }

    public static void main(String[] args) {
        신고결과받기 sol = new 신고결과받기();
        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        // "muzi(신고당한 ID) frodo(신고한 ID)"
        String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };
        int k = 2; // 정지 기준
        sol.solution(id_list, report, k);
    }
}