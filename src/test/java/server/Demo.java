package server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zhenghui.lsf.MessageService;

/**
 * User: zhenghui
 * Date: 13-12-22
 * Time: 下午1:45
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        ApplicationContext factory = new ClassPathXmlApplicationContext(
                new String[] {"biz/lsf-demo.xml"});

//        HSFSpringProviderBean hsfSpringProviderBean = (HSFSpringProviderBean) factory.getBean("hsfSpringProviderBean");

        MessageService messageService = (MessageService) factory.getBean("messageServiceLSF");
        Thread.sleep(1000);
        messageService.sayHello("puding");
        messageService.sayHello("puding2");
    }
}
