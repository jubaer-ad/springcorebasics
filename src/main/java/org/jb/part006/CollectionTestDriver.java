package org.jb.part006;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionTestDriver {
    public static void main(String[] args) {

        // Testing Collection Injection beanCollectionTest.xml
        ApplicationContext collectionContext = new ClassPathXmlApplicationContext("beanCollectionTest.xml");
        CollectionTest collectionTest = collectionContext.getBean("collection", CollectionTest.class);
        System.out.println(collectionTest.toString());
//        System.out.println(collectionTest.testList.getClass());
//        System.out.println(collectionTest.testSet.getClass());
//        System.out.println(collectionTest.testMap.getClass());
//        System.out.println(collectionTest.testProp.getClass());

        System.out.println(collectionTest.testList.get(0).getClass());
    }
}
