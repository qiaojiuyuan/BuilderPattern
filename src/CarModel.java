import java.util.ArrayList;

public abstract class CarModel {

	//��������Ǹ�����������ִ�е�˳��
	private ArrayList<String> sequence = new ArrayList<String>();
	//ģ��������ʼ��
	protected abstract void start();
	//ģ��ͣ����
	protected abstract void stop();
	//������
	protected abstract void alarm();
	//���濪��
	protected abstract void engineBoom();
	//����ģ��
	final public void run() {
		for(int i = 0;i < this.sequence.size();i++) {
			String actionName = this.sequence.get(i);
			if (actionName.equalsIgnoreCase("start")) {
				this.start();
			} else if(actionName.equalsIgnoreCase("stop")) {
				this.stop();
			} else if (actionName.equalsIgnoreCase("alarm")) {
				this.alarm();
			} else if (actionName.equalsIgnoreCase("engine boom")) {
				this.engineBoom();
			}
		}
	}
	
	//�Ѵ��ݹ���������˳��浽������
	final public void setSequence(ArrayList sequence) {
		this.sequence = sequence;
	}
}
