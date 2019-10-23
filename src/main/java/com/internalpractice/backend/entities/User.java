package com.internalpractice.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User  implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String userId;
        private String firstName;
        private String secondName;
        private String firstLastName;
        private String secondLastName;
        private String email;
        private String personalEmail;
        private int phone;
        private int cellphone;
        private String workArea;
        private String position;

        public User(){

        }

        public User(String userId, String firstName, String secondName, String firstLastName, String secondLastName,
                    String email, String personalEmail, int phone, int cellphone, String workArea, String position) {
            this.userId = userId;
            this.firstName = firstName;
            this.secondName = secondName;
            this.firstLastName = firstLastName;
            this.secondLastName = secondLastName;
            this.email = email;
            this.personalEmail = personalEmail;
            this.phone = phone;
            this.cellphone = cellphone;
            this.workArea = workArea;
            this.position = position;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getFirstLastName() {
            return firstLastName;
        }

        public void setFirstLastName(String firstLastName) {
            this.firstLastName = firstLastName;
        }

        public String getSecondLastName() {
            return secondLastName;
        }

        public void setSecondLastName(String secondLastName) {
            this.secondLastName = secondLastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPersonalEmail() {
            return personalEmail;
        }

        public void setPersonalEmail(String personalEmail) {
            this.personalEmail = personalEmail;
        }

        public int getPhone() {
            return phone;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public int getCellphone() {
            return cellphone;
        }

        public void setCellphone(int cellphone) {
            this.cellphone = cellphone;
        }

        public String getWorkArea() {
            return workArea;
        }

        public void setWorkArea(String workArea) {
            this.workArea = workArea;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }
}
