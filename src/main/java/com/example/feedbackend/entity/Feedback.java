package com.example.feedbackend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

        private String name;
        private String email;
        private int rating;
        private String department;
        private String comments;

    @Column(name = "created_date", updatable = false)
    private LocalDateTime createdDate;

    @PrePersist
    public void prePersist() {
        this.createdDate = LocalDateTime.now();
    }

        // ✅ Include Getters and Setters for ALL fields

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public int getRating() { return rating; }
        public void setRating(int rating) { this.rating = rating; }

        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public String getComments() { return comments; }
        public void setComments(String comments) { this.comments = comments; }

        public LocalDateTime getCreatedDate() { return createdDate; }
        public void setCreatedDate(LocalDateTime createdDate) { this.createdDate = createdDate; }
    }
