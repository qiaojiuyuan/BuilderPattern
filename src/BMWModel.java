
public class BMWModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("宝马车开始跑");
	}

	@Override
	protected void stop() {
		System.out.println("宝马车停止");
	}

	@Override
	protected void alarm() {
		System.out.println("宝马车响喇叭");
	}

	@Override
	protected void engineBoom() {
		System.out.println("宝马车引擎开始运行");
	}

}
