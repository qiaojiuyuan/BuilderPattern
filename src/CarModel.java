import java.util.ArrayList;

public abstract class CarModel {

	//这个参数是各个基本方法执行的顺序
	private ArrayList<String> sequence = new ArrayList<String>();
	//模型启动开始跑
	protected abstract void start();
	//模型停下来
	protected abstract void stop();
	//响喇叭
	protected abstract void alarm();
	//引擎开响
	protected abstract void engineBoom();
	//运行模型
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
	
	//把传递过来的运行顺序存到对象内
	final public void setSequence(ArrayList sequence) {
		this.sequence = sequence;
	}
}
