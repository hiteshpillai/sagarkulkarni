package demo.spring;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {  //Message message=new Message();
    
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("demo/spring/beanConfig.xml");
    	
    	/*Message message = ctx.getBean("m", Message.class);
    	Message message1 = ctx.getBean("m", Message.class);
    	
    	message.setText("Hello String Learners");
    	message1.setText("Hello String Learners 2");
    	System.out.println(message.getText());
    	System.out.println(message1.getText());
    	
        System.out.println();
        System.out.println(message==message1);*/
    	
    	MessagePrinter mesgprntr = ctx.getBean("mp", MessagePrinter.class);
    	mesgprntr.printmessage();
    }
}
