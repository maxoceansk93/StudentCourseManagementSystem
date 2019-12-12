package com.bkf.persistence;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student
{

    @Id
    @Column(name="Id")
    private Integer id;
    
    @Column(name="Name")
    private String name;
    
    @Column(name="Age")
    private long age;

    public Student()
    {
        super();
    }
    public Student(Integer id, String name, long age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public long getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getAge()
    {
        return age;
    }
    public void setAge(long age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
