import java.util.ArrayList;
/**
 * ��ģ�͵���run����֮ǰһ��Ҫ����һ��sequence������û��Ч����
 * ��Ȼ���������ǲ��ǿ���Ūһ����sequence�����Ĺ��췽����������֤
 * ÿ�ζ�ǿ�����ý���һ��sequence�����ģʽ֮����û����������
 * ��֪�ǳ���ʲô���Ŀ��ǣ���ѭ�����ط���
 * @author qiaojy
 *
 */
public class BMWBuilder extends CarBuilder{

	//�뱦��ģ�Ͳ����ۺϹ�ϵ,�����벿�ֵĹ�ϵ
	private BMWModel bmw = new BMWModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.bmw;
	}

}
