package com.example.Spring.model;
import jakarta.persistence.*;
/*

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

@Table(name="employees")
public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public  long id;

        @Column(name = "firstName")
        public  String fName;

        @Column(name = "lastname")
        public  String lName;

        public Employee(long id, String fName, String lName) {
                super();
                this.id = id;
                this.fName = fName;
                this.lName = lName;
        }


        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getfName() {
                return fName;
        }

        public void setfName(String fName) {
                this.fName = fName;
        }

        public String getlName() {
                return lName;
        }

        public void setlName(String lName) {
                this.lName = lName;
        }
}
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(name = "first_name")
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(name = "email_id")
        private String emailId;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getEmailId() {
                return emailId;
        }

        public void setEmailId(String emailId) {
                this.emailId = emailId;
        }
}