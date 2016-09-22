import java.util.ArrayList;
/**
 * һ�������ָ࣬�Ӹ����¼����Ⱥ�˳��Ȼ��Ϊÿ��˳��ָ��һ������
 * �������𵽷�װ�����ã�����߲�ģ�����뵽�������ڲ���ʵ���ࡣ��Ȼ���ڽ�����ģ
        ʽ�Ƚ��Ӵ�ʱ������������ж����
 * @author Administrator
 *
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	/**
	 * A���ͱ��۳�ģ�ͣ���start��Ȼ��stop��������û��
	 * @return
	 */
	public BenzModel getABenzModel() {
		this.sequence.clear();//��ֹ���ݻ���
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(this.sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	public BenzModel getBBenzModel() {
		this.sequence.clear();
		this.sequence.add("engine boom");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel)this.benzBuilder.getCarModel();
	}
	
	public BMWModel getCBMWModel() {
		this.sequence.clear();
		this.sequence.add("alarm");
		this.sequence.add("start");
		this.sequence.add("stop");
		this.bmwBuilder.setSequence(sequence);
		return (BMWModel)this.bmwBuilder.getCarModel();
	}
}
