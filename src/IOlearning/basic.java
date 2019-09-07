package IOlearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class basic {
	
	/**
	 * IO Java对数据的操作是通过流的方式， IO流用来处理设备之间的数据传输 上传文件和下载文件， Java用于操作的对象都在IO包中
	 * 
	 * 常见的IO 
	 * 字节流（InputStream字节输入流: FileInputStream, BufferedInputStream;InputStream字节流出流: FileOuputStream, BufferedOuputStream）/
	 * 字符流（Reader字符流入流 InputStreamReader FileReader, BufferedReader;Reader字符输出流: OuputStreamWriter FileWriter, BufferedWriter）
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * 演示读取桌面文件  txt
		 */
		
		File txtFile = new File("/Users/ericchen/Desktop", "basic.txt");
		
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream(txtFile);
			//定义读取的长度
			byte[] readBytes = new byte[10240];
			
			inputStream.read(readBytes);
			
			System.out.print(new String(readBytes));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		/**
		 * 创建一个文件写入
		 */
		OutputStream outputStream = null;
		
		try {
			outputStream = new FileOutputStream(txtFile);
			
			String content = "good good study";
			
			outputStream.write(content.getBytes());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
