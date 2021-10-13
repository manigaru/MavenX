package com.oracle.support;

public class PersonKeyConverter implements com.tangosol.coherence.rest.KeyConverter {
    public PersonKey fromString(String s)
    {
        return new PersonKey(Long.parseLong(s));
    }

    public String toString(Object k)
    {
        return "PersonKey [id=" + ((PersonKey) k).getId() + "]";
    }
}
