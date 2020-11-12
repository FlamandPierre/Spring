package com.spring.henallux.firstSpringProject.model;
import javax.validation.constraints.*;

public class User {
    @Size(min=4, max=15)
    private String name;
    @Min(1)
    @Max(12)
    private Integer age;
    @NotNull
    private Boolean male;
    private String hobby;

    public User() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getMale() {
        return male;
    }

    public String getHobby() {
        return hobby;
    }
}
