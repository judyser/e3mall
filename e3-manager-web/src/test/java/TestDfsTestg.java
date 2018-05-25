import javax.naming.ldap.SortControl;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class TestDfsTestg {
	@Test
	public void testUpload() throws Exception{
		 //加载配置文件，文件名任意，内容是tracker服务器地址
		 ClientGlobal.init("E:/eclipseWebPro/e3mall/e3-manager-web/src/main/resources/conf/client.conf");
		//使用全局对象加载配置文件
		 //创建-个TrackerClinet 对象
		 TrackerClient trackerClient= new TrackerClient();
		 //创建TrackerClient 或得一个TrackerServer对象
		 TrackerServer trackerServer= trackerClient.getConnection();
		 //创建一个StrorgeServer的引用，可以是null
		StorageServer storageServer = null;
		
		 //创建StorageClient ，参数需要TrackerSever和StrorageServer
		StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		 //使用StrorageClinet上传文件
		String []strings = storageClient.upload_file("H:/黑马/e3商城_day01/黑马32期/01.教案-3.0/01.参考资料/广告图片/b463a2b010033397a2dcd09aa6f57d0c.jpg", "jpg",null );
 		 
		 for(String string :strings){
			 System.out.println(string);
		 }
	 }
}
