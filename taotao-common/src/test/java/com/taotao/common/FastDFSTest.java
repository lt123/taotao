package com.taotao.common;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FastDFSTest {
	@Test
	public void testName() throws Exception {
		// 1、把FastDFS提供的jar包添加到工程中
		// 2、初始化全局配置。加载一个配置文件。
		ClientGlobal.init("F:\\eclipse\\workspace\\taotao-parent\\taotao-common\\src\\main\\resources\\client.conf");
		// 3、创建一个TrackerClient对象。
		TrackerClient trackerClient = new TrackerClient();
		// 4、创建一个TrackerServer对象。
		TrackerServer trackerServer = trackerClient.getConnection();
		// 5、声明一个StorageServer对象，null。
		StorageServer storageServer = null;
		// 6、获得StorageClient对象。
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		// 7、直接调用StorageClient对象方法上传文件即可。
		String[] strings = storageClient.upload_file("E:\\1.png", "png", null);
		for (String string : strings) {
			System.out.println(string);
		}
	}	
	
	@Test
	public void testUpload() throws Exception {
		// 1、把FastDFS提供的jar包添加到工程中
				// 2、初始化全局配置。加载一个配置文件。
				ClientGlobal.init("F:\\eclipse\\workspace\\taotao-parent\\taotao-common\\src\\main\\resources\\client.conf");
				// 3、创建一个TrackerClient对象。
				TrackerClient trackerClient = new TrackerClient();
				// 4、创建一个TrackerServer对象。
				TrackerServer trackerServer = trackerClient.getConnection();
				// 5、声明一个StorageServer对象，null。
				StorageServer storageServer = null;
				// 6、获得StorageClient对象。
				StorageClient storageClient = new StorageClient(trackerServer, storageServer);
				// 7、直接调用StorageClient对象方法上传文件即可。
				String[] strings = storageClient.upload_file(toByteArray("E:\\1.png"), "png", null);
				for (String string : strings) {
					System.out.println(string);
				}
	}
	
	  public static byte[] toByteArray(String filename) throws IOException {  
		  
	        File f = new File(filename);  
	        if (!f.exists()) {  
	            throw new FileNotFoundException(filename);  
	        }  
	  
	        ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());  
	        BufferedInputStream in = null;  
	        try {  
	            in = new BufferedInputStream(new FileInputStream(f));  
	            int buf_size = 1024;  
	            byte[] buffer = new byte[buf_size];  
	            int len = 0;  
	            while (-1 != (len = in.read(buffer, 0, buf_size))) {  
	                bos.write(buffer, 0, len);  
	            }  
	            return bos.toByteArray();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	            throw e;  
	        } finally {  
	            try {  
	                in.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	            bos.close();  
	        }  
	    }  
	
}
