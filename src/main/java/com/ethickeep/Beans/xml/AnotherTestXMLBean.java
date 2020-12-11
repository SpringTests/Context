package com.ethickeep.Beans.xml;

public class AnotherTestXMLBean {
    private String coolerName;
    private TestXMLBean testBean;

    public void setName(String coolerName) {
        this.coolerName = coolerName;
    }

    public String getName() {
        return coolerName;
    }

    public TestXMLBean getTestBean() {
        return testBean;
    }

    public void setTestBean(TestXMLBean testBean) {
        this.testBean = testBean;
    }

    @Override
    public String toString() {
        return "AnotherTestXMLBean{" +
                "coolerName='" + coolerName + '\'' +
                ", testBean=" + testBean +
                '}';
    }
}
