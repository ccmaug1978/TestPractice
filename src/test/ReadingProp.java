package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Properties p =new Properties();
  ///Users/muralic/Documents/workspace/POM/src/com/qtpselenium/config/config.properties
    String path=System.getProperty("user.dir")+"/src/com/qtpselenium/config/config.properties";
    File f=new File(path);
    
   try{
	   FileInputStream fi=new FileInputStream(f.getAbsolutePath());
	   p.load(fi);
	   System.out.println( p.getProperty("Browser"));
      }catch (Exception e)
       {System.out.println("unable to load propertie file"); return;}
   
   
    
  
	}

}
