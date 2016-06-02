package com.taotao.common.util.fastdfs;

import org.apache.commons.io.FilenameUtils;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FastDFSUtil {
	
	private static Logger log = LoggerFactory.getLogger(FastDFSUtil.class);
	
	private static TrackerClient trackerClient = null;
	private static TrackerServer trackerServer = null;
	private static StorageServer storageServer = null;
	private static StorageClient storageClient = null;
	
	
	static{
		try {
			String path = FastDFSUtil.class.getClassLoader().getResource(IFastDFSConstants.FASTDFS_CONF_NAME).getPath();
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			storageClient = new StorageClient(trackerServer, storageServer);
			ClientGlobal.init(path);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
	
	private FastDFSUtil(){
	}
	
	public static String upload(MultipartFile file,NameValuePair[] metaList){
		try {
			String fileExtName = FilenameUtils.getExtension(file.getOriginalFilename());
			String[] url = storageClient.upload_file(file.getBytes(), fileExtName, metaList);
			return url[0] + "/" + url[1];
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return "";
	}
	
	public static void main(String[] args) {
		System.out.println("FastDFSUtil.main()");
	}
}
