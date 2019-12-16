package com.dss.order.domain;

public class Users {
    public static final String COL_ID = "id";
    public static final String COL_USERNAME = "userName";
    public static final String COL_PASSWORD = "passWord";
    public static final String COL_USER_SEX = "user_sex";
    public static final String COL_NICK_NAME = "nick_name";
    public static final String COL_AGE = "age";
    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    private String userSex;

    private String nickName;

    /**
     * 年龄
     */
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", userSex=").append(userSex);
        sb.append(", nickName=").append(nickName);
        sb.append(", age=").append(age);
        sb.append("]");
        return sb.toString();
    }
}