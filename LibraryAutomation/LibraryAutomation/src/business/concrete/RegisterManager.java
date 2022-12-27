package business.concrete;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RegisterManager {
	
	int id;
	List<Integer> registerIdList = new ArrayList<Integer>();

	public void AddRegisteredIdToList(int id) {
		registerIdList.add(id);	
	}
	
	public int CreateRegisterId() {
		Random rnd = new Random();
		id = rnd.nextInt(1000);
		return id;
	}
	public int ShowTheRegisterId() {
		return id;
	}	
	public List<Integer> ShowTheRegisterIdList(){
		return registerIdList;
	}
}
