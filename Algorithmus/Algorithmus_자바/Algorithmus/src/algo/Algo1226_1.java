package algo;

/*
 * ���� ����
���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.

���� ����
n�� ���� 10,000������ �ڿ����Դϴ�.
 */
public class Algo1226_1 {
	public static void main(String[] args) {
		Algo1226_1 a = new Algo1226_1();
		String q = a.solution(5);
		System.out.println(q);
		String w = a.watermelon(5);
		System.out.println(w);
		
	}
	  public String solution(int n) {
	      String answer = "";
	      for(int i=0; i<n; i++) {
	    	  if(i%2 == 1) {
	    		  answer = answer + "��";
	    	  } else {
	    		  answer = answer + "��";
	    	  }
	      }
	      return answer;
	  }

	    public String watermelon(int n){

	        return new String(new char [n/2+1]).replace("\0", "����").substring(0,n);
	    }
}
