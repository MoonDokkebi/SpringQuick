package polymorphism;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class TVUser {
    public static void main(String[] args) {
        AbstractApplicationContext factory =new GenericXmlApplicationContext("/web/WEB-INF/applicationContext.xml");

        TV tv = (TV) factory.getBean("tv");
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
