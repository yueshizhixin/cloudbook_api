package com.alm.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-11 20:15</p>
 * <p>desc: </p>
 */

public class SessionEnum {
    public enum user {
        attrKey(1, "user"),
        ;
        private int id;
        private String value;

        public static String AttrKey() {
            return attrKey.getValue();
        }

        public String getValue() {
            return value;
        }

        user(int id, String value) {
            this.id = id;
            this.value = value;
        }
    }
}

