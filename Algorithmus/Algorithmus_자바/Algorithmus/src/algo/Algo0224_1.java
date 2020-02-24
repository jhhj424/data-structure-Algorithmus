package algo;

/*
 * 
 * ���� ����
String�� �迭 seoul�� element�� Kim�� ��ġ x�� ã��, �輭���� x�� �ִٴ� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. seoul�� Kim�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

���� ����
seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
Kim�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
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