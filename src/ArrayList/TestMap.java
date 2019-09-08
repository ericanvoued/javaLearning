package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * map特性
		 * key value
		 */
		
		Map map = new HashMap<String, String>();
		map.put("pos1", 1);
		map.put("pos2", 2);
		
		System.out.print(map);
		System.out.print(map.keySet() + "\n");
		System.out.print(map.values() + "\n");
		System.out.print(map.containsKey("pos1") + "\n");
		
		

	}

}
