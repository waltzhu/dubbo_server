package springMVC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
  public static void main(String[] args) throws Exception {
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( new String[] { "applicationContext.xml" });
      context.start();

      System.out.println("服务注册成功..");
      System.in.read();
      context.close();
}
}
