import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

	//�뱼��ģ�Ͳ����ۺϹ�ϵ,�����벿�ֵĹ�ϵ
	private BenzModel benz = new BenzModel();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}

	@Override
	public CarModel getCarModel() {
		return this.benz;
	}

}
