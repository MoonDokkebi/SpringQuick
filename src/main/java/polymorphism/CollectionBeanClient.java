package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Properties;

public class CollectionBeanClient {
    public static void main (String[] args){
        AbstractApplicationContext factory = new GenericXmlApplicationContext("/web/WEB-INF/applicationContext.xml");

        CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
        Properties addressList = bean.getAddressList();
        for (String key : addressList.stringPropertyNames()){
            System.out.println(String.format("키: %s ,값: %s",key,addressList.get(key)));
        }
        factory.close();
    }
}
