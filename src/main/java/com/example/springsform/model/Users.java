package com.example.springsform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "FormUsers"
)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String name;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String email;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String password;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String gender;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String note;


    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String profession;


    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private boolean married;

    @Column(nullable = false, columnDefinition = "VARCHAR(45)")
    private String birthday;
}
