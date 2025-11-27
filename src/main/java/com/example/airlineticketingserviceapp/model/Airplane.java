package com.example.airlineticketingserviceapp.model;


import jakarta.persistence.*;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length=50,nullable=false)
    private String name;
    @Column(nullable=false, length=4)
    private int capacity;
    @Column(nullable=false,length=8,unique=true)
    private String registrationNo;

    public Airplane() {};
    public Airplane(long id, String name, int capacity, String registrationNo) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.registrationNo = registrationNo;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public String getRegistrationNo() {
        return registrationNo;
    }
    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

}
