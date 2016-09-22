import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
//		ArrayList<String> sequence = new ArrayList<String>();
//		sequence.add("engine boom");
//		sequence.add("start");
//		sequence.add("stop");
//		BenzBuilder benzBuilder = new BenzBuilder();
//		benzBuilder.setSequence(sequence);
//		BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//		benz.run();
//		
//		ArrayList<String> sequence1 = new ArrayList<String>();
//		sequence1.add("start");
//		sequence1.add("engine boom");
//		sequence1.add("stop");
//		BMWBuilder bmwBuilder = new BMWBuilder();
//		bmwBuilder.setSequence(sequence1);
//		BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
//		bmw.run();
		Director director = new Director();
		for(int i = 0;i < 5;i++) {
			director.getABenzModel().run();
		}
		for(int i = 0;i < 5;i++) {
			director.getCBMWModel().run();
		}
	}
}
