import java.util.ArrayList;
/**
 * 在模型调用run方法之前一定要设置一个sequence，否则将没有效果。
 * 既然是这样，是不是可以弄一个带sequence参数的构造方法，用来保证
 * 每次都强制设置进来一个sequence。设计模式之禅上没有这样做，
 * 不知是出于什么样的考虑？遵循迪米特法则？
 * @author qiaojy
 *
 */
public class BMWBuilder extends CarBuilder{

	//与宝马模型产生聚合关系,整体与部分的关系
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
