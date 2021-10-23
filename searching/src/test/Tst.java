package test;

import java.io.File;

public class Tst {
	//classpath的文件路径
	private static String cp = "/test/orig.txt";
	public static void main(String[] args) {
	//当前类的绝对路径
	System.out.println(Tst.class.getResource("/").getFile());
	//指定CLASSPATH文件的绝对路径
	System.out.println(Tst.class.getResource(cp).getFile());
	//指定CLASSPATH文件的绝对路径
	File f = new File(Tst.class.getResource(cp).getFile());
	System.out.println(f.getPath());
	}
	
}
