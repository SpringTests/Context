package com.ethickeep.Beans.xml;

public class TestXMLBean {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TestXMLBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
