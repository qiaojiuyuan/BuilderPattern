
public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("������ʼ��");
	}

	@Override
	protected void stop() {
		System.out.println("����ֹͣ");
	}

	@Override
	protected void alarm() {
		System.out.println("����������");
	}

	@Override
	protected void engineBoom() {
		System.out.println("�������濪ʼ����");
	}

}
