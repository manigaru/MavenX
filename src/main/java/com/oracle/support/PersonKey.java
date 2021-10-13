package com.oracle.support;

public class PersonKey implements java.io.Serializable {
    long id;

    public PersonKey(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
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
        PersonKey other = (PersonKey) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PersonKey [id=" + id + "]";
    }

}
