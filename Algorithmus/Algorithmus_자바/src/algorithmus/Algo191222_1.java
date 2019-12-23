package algorithmus;

// ���ڿ� �� p�� y�� ����
/*
 * ���� ����
�빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, 
�ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. 
��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.

���� ��� s�� pPoooyY�� true�� return�ϰ� Pyy��� false�� return�մϴ�.

���ѻ���
���ڿ� s�� ���� : 50 ������ �ڿ���
���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.

 */
public class Algo191222_1 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution("python"));
		System.out.println(sol.solution("PppPpython"));
	}
}

class Solution {
	boolean solution(String s) {
		boolean answer = true;
		int ycnt = 0;
		int pcnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				ycnt++;
			}
			if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				pcnt++;
			}
		}
		if (ycnt != pcnt)
			answer = false;
		return answer;
	}
}
