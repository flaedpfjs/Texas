package util;

import java.io.File;


public class Log {
	private static String defaultTag = "Log";
	private static File Log ;
	
	public static void init(){
		//Log = new File(FileUtil.getUserDir(), "Log");
		Log = FileUtil.getUserDir();
	}
	
	public static void Log(String content){
		Log(defaultTag,content);
	}
	
	public static void Log(String tag,String content){
		//FileUtil.writeToFile(new File(Log,tag), content+"\n");
	}
	
	public static void Log(String parentStr,String tag,String content){
//		File parent = new File(Log,"parent");
//		if(!parent.exists()){
//			parent.mkdir();
//		}
//		FileUtil.writeToFile(new File(parent,tag), content+"\n");
	}

}
