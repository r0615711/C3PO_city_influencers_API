package com.example.bookinfoservice.model;

import javax.persistence.*;

@Entity
@Table(name="employee", schema = "nocaps")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "\"employee_id\"")
    private int employee_id;
    @Column(name = "\"user_id\"")
    private int user_id;
    @Column(name = "\"role_id\"")
    private int role_id;

    public Employee() {
    }

    public Employee(int employee_id, int user_id, int role_id) {
        this.employee_id = employee_id;
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
