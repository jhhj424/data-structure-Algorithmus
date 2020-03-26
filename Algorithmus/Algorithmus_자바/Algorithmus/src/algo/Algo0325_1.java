package algo;

/**
 * 
 * @author jhhj4
 *
 *���� ����
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.
 */
public class Algo0325_1 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int [] a = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		System.out.println(s.solution(a)[0]);
		System.out.println(s.solution(a)[1]);
		System.out.println(s.solution(a)[2]);
	}

}
class Solution2 {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int a1 = 0,a2 = 0,a3 = 0;
        int[] b1 = {1, 2, 3, 4, 5};
        int[] b2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] b3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0; i<answers.length; i++) {
        	if(answers[i] == b1[i%5]) {a1 +=1;}
        	if(answers[i] == b2[i%8]) {a2 +=1;}
        	if(answers[i] == b3[i%10]) {a3 +=1;}
        }
        answer[0] = a1;
        answer[1] = a2;
        answer[2] = a3;
        return answer;
    }
}