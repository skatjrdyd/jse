package api02.util.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		// new Integer(98));는 숫자타입이 아닌 객체 98임
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(60));
		map.put("안도미키", new Integer(30));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			Map.Entry e = (Entry) it.next();
			System.out.println("참가자 : " + e.getKey() + "점수 : " + e.getValue());
		}
		
		
		
	}
}
