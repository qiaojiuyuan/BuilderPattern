
public class BenzModel extends CarModel{

	@Override
	protected void start() {
		System.out.println("奔驰车开始跑");
	}

	@Override
	protected void stop() {
		System.out.println("奔驰车停止");
	}

	@Override
	protected void alarm() {
		System.out.println("奔驰车响喇叭");
	}

	@Override
	protected void engineBoom() {
		System.out.println("奔驰车引擎开始运行");
	}

}
