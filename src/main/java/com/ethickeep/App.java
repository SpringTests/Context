package com.ethickeep;

import com.ethickeep.Beans.xml.AnotherTestXMLBean;
import com.ethickeep.Beans.xml.TestXMLBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TestXMLBean testXMLBean = context.getBean(TestXMLBean.class);
        System.out.println(testXMLBean);
        AnotherTestXMLBean xmlBean = (AnotherTestXMLBean) context.getBean("joras_friens");
        System.out.println(xmlBean);


//        ApplicationContext ac = ApplicationContext.
//        BeanFactory bf = BeanFactory.
    }
}
