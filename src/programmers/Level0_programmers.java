package programmers;

public class Level0_programmers {
    /**
     * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181901">배열만들기 1</a>
     */
    public int[] CreatingAnArray1(int n, int k) {
        int count = n / k;
        int[] answer = new int[count];
        for(int i = 1; i <= count; i++) {
            answer[i-1] = i*k;
        }
        return answer;
    }

    /**
     * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/181920">카운트 업</a>
     */
    public int[] countUp(int start_num, int end_num) {
        int count = end_num - start_num + 1;
        int[] answer = new int[count];
        for(int i=1; i<=count; i++) {
            answer[i-1] = start_num++;
        }

        return answer;
    }
}
