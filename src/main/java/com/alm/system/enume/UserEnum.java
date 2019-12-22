package com.alm.system.enume;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-02 18:58</p>
 * <p>desc: 用户枚举</p>
 */
public class UserEnum {
    public enum signUp {
        account(1, "account"),
        phone(2, "phone"),
        email(3, "email"),
        ;

        private int id;
        private String value;

        signUp(int id, String value) {
            this.id = id;
            this.value = value;
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

    }
}
