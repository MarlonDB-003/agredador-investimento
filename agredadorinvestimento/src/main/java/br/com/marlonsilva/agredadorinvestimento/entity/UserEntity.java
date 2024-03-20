package br.com.marlonsilva.agredadorinvestimento.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_user")
public class UserEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(name= "username")
    private String username;

    @Column(name= "email")
    private String email;

    @Column(name= "password")
    private String password;

    @CreationTimestamp
    private Instant creationTimeStamp;

    @UpdateTimestamp
    private Instant updateTimeStamp;

    public UserEntity(){

    }

    public UserEntity(UUID userId, String username, String email, String password, Instant creationTimeStamp,
            Instant updateTimeStamp) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.creationTimeStamp = creationTimeStamp;
        this.updateTimeStamp = updateTimeStamp;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Instant getCreationTimeStamp() {
        return creationTimeStamp;
    }

    public void setCreationTimeStamp(Instant creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    public Instant getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Instant updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }
    
}
