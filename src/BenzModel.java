
public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("���۳���ʼ��");
	}

	@Override
	protected void stop() {
		System.out.println("���۳�ֹͣ");
	}

	@Override
	protected void alarm() {
		System.out.println("���۳�������");
	}

	@Override
	protected void engineBoom() {
		System.out.println("���۳����濪ʼ����");
	}

}
