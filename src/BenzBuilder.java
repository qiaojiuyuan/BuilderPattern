import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

	//与奔驰模型产生聚合关系,整体与部分的关系
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
