package p0929;
class Static01{
	
	int a;
	//�� Ŭ������ ����� ��� ��ü�� ����
	static int n=0;
	//��ü�� �� �� ����������� Ȯ���� �� �ִ� ������
	public Static01() { 
		
	}
	public static void main(String[] args) {
		Static01 sc1 = new Static01();
		Static01 sc2 = new Static01();
		Static01 sc3 = new Static01();

		sc1.a = 1;
		// StaticClass.n = 1;
		//static �ʵ�� 'Ŭ���� �̸�. �ʵ�'��� 
		//'��ü�̸�.�ʵ�'���ٴ� ����ϱ� ���� 
		System.out.println(sc1.a+ " " +Static01.n);
		sc2.a = 2;
		System.out.println(sc2.a+ " " +Static01.n);
		sc3.a = 3;
		System.out.println(sc3.a+ " " +Static01.n);


	}
	
}

