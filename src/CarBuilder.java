import java.util.ArrayList;

/**
 * ����������װ��
 * @author qiaojy
 *
 */
public abstract class CarBuilder {

	//����һ��ģ�ͣ�Ҫ����һ����װ˳��
	public abstract void setSequence(ArrayList<String> sequence);
	//������˳��󣬾Ϳ���ֱ���õ��������ģ����
	public abstract CarModel getCarModel();
}
