package fourth.Exam_12827_20161209_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MathTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			int a = (int) (Math.random() * 100);
			list.add(a);
		}
		System.out.println("随机生成的50个小于100的数，分别为" + list);
		Map<Integer, List> map = new HashMap<Integer, List>();
		List<Integer> list0 = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		List<Integer> list5 = new ArrayList<Integer>();
		List<Integer> list6 = new ArrayList<Integer>();
		List<Integer> list7 = new ArrayList<Integer>();
		List<Integer> list8 = new ArrayList<Integer>();
		List<Integer> list9 = new ArrayList<Integer>();
		for (Integer integer : list) {
			if ((double) integer / 10 < 1) {
				list0.add(integer);
			} else if ((double) integer / 10 < 2) {
				list1.add(integer);
			} else if ((double) integer / 10 < 3) {
				list2.add(integer);
			} else if ((double) integer / 10 < 4) {
				list3.add(integer);
			} else if ((double) integer / 10 < 5) {
				list4.add(integer);
			} else if ((double) integer / 10 < 6) {
				list5.add(integer);
			} else if ((double) integer / 10 < 7) {
				list6.add(integer);
			} else if ((double) integer / 10 < 8) {
				list7.add(integer);
			} else if ((double) integer / 10 < 9) {
				list8.add(integer);
			} else if ((double) integer / 10 < 10) {
				list9.add(integer);
			}
			map.put(1, list1);
			map.put(2, list2);
			map.put(3, list3);
			map.put(4, list4);
			map.put(5, list5);
			map.put(6, list6);
			map.put(7, list7);
			map.put(8, list8);
			map.put(9, list9);
		}

		System.out.println("Map中的数据为：");
		for (Integer aa : map.keySet()) {
			System.out.println(aa + "=>" + map.get(aa));
		}
		for (Integer aa : map.keySet()) {
			List list10 = map.get(aa);
			list10.sort(new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					if (o1 <= o2) {
						return -1;
					} else if (o1 > o2) {
						return 1;
					} else
						return 0;
				}

			});
			map.put(aa, list10);
		}
		System.out.println("排序后Map中的数据为：");
		for (Integer aa : map.keySet()) {
			System.out.println(aa + "=>" + map.get(aa));
		}
	}
}
