package ArrayList;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 数组存储个数确定
		 * 集合存储不确定长度数组
		 */
		//如何定义数组
		int[] array1;  //推荐使用
		int array2[];
		
		int[] array3 = new int[]{1, 2, 3}; //定一个三个数的数组
		
		//推荐
		int[] array4 = {1, 2, 3, 4}; //直接赋值
		
		int[] array5 = new int[3];  //第三种赋值方式
		
		array5[0] = 5;
		array5[1] = 2;
		array5[2] = 3;
		
		//数组的长度
		System.out.print(array5.length + "\n");
		
		//数组当中某个位置的值
		System.out.print(array5[1] + "\n");
		
		Arrays.sort(array5);
		for(int i=0; i<array5.length; i ++) {
			System.out.print(array5[i] + "\n");
		}
	}

}
