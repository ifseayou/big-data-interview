package com.isea.interview.hive;

import org.apache.hadoop.hive.ql.exec.UDAF;

public class HiveUDAF extends UDAF {
    public static String toUpperCase(final String target){
        if (target == null){
            return null;
        }
        return target.toUpperCase();
    }
}
