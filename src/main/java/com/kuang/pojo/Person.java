package com.kuang.pojo;

//import org.hibernate.validator.constraints.Email;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

//import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {
//    @Email()
    private String lastName;
    private Integer age;
    private Boolean happy;
    private Date birth;
    private Dog dog;
    private Map<String, Object> maps;
    private List<Object> lists;

    public Person() {
    }

    public Person(String lastName, Integer age, Boolean happy, Date birth, Dog dog, Map<String, Object> maps, List<Object> lists) {
        this.lastName = lastName;
        this.age = age;
        this.happy = happy;
        this.birth = birth;
        this.dog = dog;
        this.maps = maps;
        this.lists = lists;
    }

    public String getlastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getHappy() {
        return happy;
    }

    public Date getBirth() {
        return birth;
    }

    public Dog getDog() {
        return dog;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHappy(Boolean happy) {
        this.happy = happy;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", happy=" + happy +
                ", birth=" + birth +
                ", dog=" + dog +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }
}
