package com.oracle.support;

import com.tangosol.net.NamedCache;
import com.tangosol.net.CacheFactory;

import java.time.ZonedDateTime;

public class BulkLoadPerson {
    public static void loadData(long numentries)
    {
            try
            {
                    System.out.println("Adding " + numentries + " entries to the person cache");
                    long startTime = ZonedDateTime.now().toInstant().toEpochMilli();

                    NamedCache<PersonKey, Person> cache = CacheFactory.getCache("person");
                    for (long i=1;i <= numentries;i++) {
                        cache.put(new PersonKey(i),new Person("abcdefghijklmn",i%10));
                    }
                    long endTime = ZonedDateTime.now().toInstant().toEpochMilli();
                    long elapsedTime = endTime - startTime;
                    System.out.println("Load Completed. Cache entries are " + cache.size());
                    System.out.println("Elapsed time (milliseconds): " + elapsedTime);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
}
    public static void main(String[] args) {
        // Loads 1000 entries to the PERSON cache
        loadData(1000L);
    }
}
