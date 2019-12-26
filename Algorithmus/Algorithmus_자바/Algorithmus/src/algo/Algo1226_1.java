package algo;

/*
 * 문제 설명
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
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
	    		  answer = answer + "박";
	    	  } else {
	    		  answer = answer + "수";
	    	  }
	      }
	      return answer;
	  }

	    public String watermelon(int n){

	        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	    }
}
