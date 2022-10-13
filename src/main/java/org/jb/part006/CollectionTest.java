package org.jb.part006;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionTest {
    List testList;
    Set testSet;
    Map testMap;
    Properties testProp;

    public void setTestList(List testList) {
        this.testList = testList;
    }

    public void setTestSet(Set testSet) {
        this.testSet = testSet;
    }

    public void setTestMap(Map testMap) {
        this.testMap = testMap;
    }

    public void setTestProp(Properties testProp) {
        this.testProp = testProp;
    }

    @Override
    public String toString() {
        return "CollectionTest{" +
                "testList=" + testList +
                ", testSet=" + testSet +
                ", testMap=" + testMap +
                ", testProp=" + testProp +
                '}';
    }
}
