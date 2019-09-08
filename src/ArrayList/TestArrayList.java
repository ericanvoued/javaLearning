package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 利用arrays工具类 生成集合
		List<String> asList =  Arrays.asList("tom", "lucy", "hanma");
		
		//自己手动生成集合
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		//迭代器
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + "\n");
		}
		
		//重新洗牌
		Collections.shuffle(list);
		
		//如果不需要利用到索引， 可以使用增强型 for 循环  --》 foreach
		for(String str: list) {
			System.out.print(str + "\n");
		}
		/**
		 * ArrayList 是实现了基于动态数组的数据结构， linkedList是基于链表的数据结构
		 * 对于随机访问的get和set， ArrayList优于linkedList ，因为linkedList要移动指针
		 * 对于新增和删除操作add和remove ， linkedList比较占优势， 因为 ArrayList要移动数据
		 */

	}

}
