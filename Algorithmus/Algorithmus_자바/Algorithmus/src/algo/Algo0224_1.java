package algo;

/*
 * 
 * 문제 설명
String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
Kim은 반드시 seoul 안에 포함되어 있습니다.
 */
public class Algo0224_1 {

	public static void main(String[] args) {
		Solution0224_1 s = new Solution0224_1();
		System.out.println(s.solution(213142));
	}

}

class Solution0224_1 {
	public int solution(int n) {
	      int answer = 0;
	      int cnt = 0;
	      for(int i=2; i<=n; i++) {
	    	  for(int j=1; j<=Math.sqrt(i); j++) {
	    		  if(i%j == 0) {
	    			  cnt++;
	    		  }
	    		  if(cnt > 2) j = i;
	    		  System.out.println(i+":"+j);
	    	  }
	    	  if(cnt == 2) answer++;
	    	  cnt = 0;
	      }
	      return answer;
	  }
	}