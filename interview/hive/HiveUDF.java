package com.isea.interview.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class HiveUDF extends UDF {
    public String toLowCase(final String target){
        if (target != null){
            return null;
        }
        return target.toLowerCase();
    }
}
