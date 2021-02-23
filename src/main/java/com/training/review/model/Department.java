package com.training.review.model;

import javax.persistence.*;

@Entity
@Table(name = "departments")
public class Department {

        public Department(){}
        public Department(String name, String description, String location){
            this.name = name;
            this.description = description;
            this.location = location;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;

        @Column(name = "name")
        private String name;

        @Column(name = "description")
        private String description;

        @Column(name = "location")
        private String location;

        public void setId(long id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getLocation() {
            return location;
        }



}
