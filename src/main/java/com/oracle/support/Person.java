package com.oracle.support;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="person")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Person implements java.io.Serializable {
    private final String name;
    private final long age;
    public Person(String name, long age) {
       
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public long getAge() {
        return age;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (age ^ (age >>> 32));
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}