package com.alm.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-11 20:15</p>
 * <p>desc: </p>
 */

public class AuthEnum {
    public enum user {
        key(1, "user"),
        ;
        private int id;
        private String value;

        public static String key() {
            return key.getValue();
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

