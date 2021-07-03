package com.sy.entity;

public class User {
    /**
     * 用户ID
     */
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     *工作信息
     */
    private String workMes;

    public User() {
    }

    public User(String id, String name, Integer age, String workMes) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workMes = workMes;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setWorkMes(String workMes) {
        this.workMes = workMes;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getWorkMes() {
        return workMes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", workMes='" + workMes + '\'' +
                '}';
    }
}
