package week02;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odds = 1;
		final int n = 45;
		final int k = 6;
		
		for(int i = 0; i <= k; i++)
			odds = odds * (n - i + 1) / i;
		
		System.out.println("�ζ� 1�� Ȯ�� : 1/"+odds);

	}

}
