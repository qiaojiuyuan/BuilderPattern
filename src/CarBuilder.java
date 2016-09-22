import java.util.ArrayList;

/**
 * 抽象汽车组装者
 * @author qiaojy
 *
 */
public abstract class CarBuilder {

	//建造一个模型，要给我一个组装顺序
	public abstract void setSequence(ArrayList<String> sequence);
	//设置完顺序后，就可以直接拿到这个车辆模型了
	public abstract CarModel getCarModel();
}
