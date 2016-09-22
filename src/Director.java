import java.util.ArrayList;
/**
 * 一个导演类，指挥各个事件的先后顺序，然后为每种顺序指定一个代码
 * 导演类起到封装的作用，避免高层模块深入到建造者内部的实现类。当然，在建造者模
        式比较庞大时，导演类可以有多个。
 * @author Administrator
 *
 */
public class Director {

	private ArrayList<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	private BMWBuilder bmwBuilder = new BMWBuilder();
	
	/**
	 * A类型奔驰车模型，先start，然后stop，其它都没有
	 * @return
	 */
	public BenzModel getABenzModel() {
		this.sequence.clear();//防止数据混乱
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
