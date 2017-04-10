import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
public class THashMapSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMap = new HashMap();
		
		hashMap.put("Karaoke", "interesting");
		hashMap.put("Study", "boring");
		hashMap.put("Lunch", "delicious");
		
		System.out.println("Display hashMap:" + hashMap);
		
		String str = (String)hashMap.get("Karaoke");
		System.out.println("Get val of karaoke is:" + str);
		
		if(hashMap.containsKey("Study")) {
			System.out.println("ContainsKey: there is study key");
		}else {
			System.out.println("ContainsKey: no Study key");
		}
		
		hashMap.remove("Lunch");
		System.out.println("Display HashMap" + hashMap);
		
		HashMap hm = new HashMap();
		hm.put("Pol", "199");
		hm.put("Fire", "191");
		
		Iterator it = hm.keySet().iterator();
		while(it.hasNext()) {
			String strKey=(String)it.next();
			String strValue=(String)hm.get(strKey);
			System.out.println(strKey + "" + strValue);			
		}
		
		/*ArrayListTest*/
		ArrayList aryList = new ArrayList();
		aryList.add("cola");
		aryList.add("beer");
		aryList.add("Alphin");
		
		System.out.println("Arry content" + aryList);
		
		String str1 = "Fantasy";
		aryList.add(1, str1);
		System.out.println("Arry content new :"+aryList);
		
		aryList.remove(0);
		System.out.println("Ary after deleted :"+aryList);
		
		System.out.println("Get ele:" + aryList.get(2));
		System.out.println("data size" + aryList.size());
		
		aryList.clear();
		System.out.println("Delete all" + aryList);
		
		if(aryList.isEmpty()) {
			System.out.println("is Empty");
		}else {
			System.out.println("not Empty");
		}
	}
}