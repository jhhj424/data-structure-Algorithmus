package algo;

/*
 * ���ڿ��� ������ �ٲٱ�
���� ����
���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.

���� ����
s�� ���̴� 1 �̻� 5�����Դϴ�.
s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
s�� 0���� �������� �ʽ��ϴ�.
����� ��
������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 */
public class Algo1227_1 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution("12345"));
	}

}

class Solution {
	  public int solution(String s) {
	      return Integer.parseInt(s);
	  }
	}