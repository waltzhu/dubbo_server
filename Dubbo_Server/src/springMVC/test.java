package springMVC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
  public static void main(String[] args) throws Exception {
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "applicationContext.xml" });
      context.start();

      System.out.println("����ע��ɹ�..");
      System.in.read();
      context.close();
}
}
