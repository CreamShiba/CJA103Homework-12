package hw08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HomeWork08 {
	public static void main(String[] args) {
		List list = new ArrayList();
		List train = new ArrayList();
		
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short((short)100));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
//================================================
		Train[] trains = {
	            new Train(202, "普悠瑪", "樹林", "花蓮", 400),
	            new Train(1254, "區間", "屏東", "基隆", 700),
	            new Train(118, "自強", "高雄", "台北", 500),
	            new Train(1288, "區間", "新竹", "基隆", 400),
	            new Train(122, "自強", "台中", "花蓮", 600),
	            new Train(1222, "區間", "樹林", "七堵", 300),
	            new Train(1254, "區間", "屏東", "基隆", 700) 
	        };
//		qs05(trains);//不重複Train物件
//		qs06(trains);//Train物件編號大到小
//		qs07(trains);//Train物件編號大到小且不重複
		
//================================================
//		qs01(list);//Iterator
//		qs02(list);//for迴圈
//		qs03(list);//foreach
//		qs04(list);
		
		


		
	}
	public static void qs01(List list) {
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}
	public static void qs02(List list) {
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static void qs03(List list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
	public static void qs04(List list) {
		Iterator<Object> remover = list.iterator();
        while (remover.hasNext()) {
            Object obj = remover.next();
            if (!(obj instanceof Number)) {
                remover.remove();
            }
        }
        for (Object obj : list) {
            System.out.println(obj);
        }
	}
	public static void qs05(Train[] trains) {
		Set<Train> uniqueSet = new HashSet<>();
        for (Train t : trains) {
            uniqueSet.add(t);
        }
        Iterator<Train> it = uniqueSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}
	public static void qs06(Train[] trains) {
		List<Train> trainList = new ArrayList<>();
        for (Train t : trains) {
            trainList.add(t);
        }
        Collections.sort(trainList);
        for (int i = 0; i < trainList.size(); i++) {
            System.out.println(trainList.get(i));
        }

	}
	public static void qs07(Train[] trains) {
		// 使用 TreeSet 特性：不重複 + 自動排序 (依照 compareTo)
        Set<Train> sortedUniqueSet = new TreeSet<>();
        for (Train t : trains) {
            sortedUniqueSet.add(t);
        }

        for (Train t : sortedUniqueSet) {
            System.out.println(t);
        }
	}
}
