package com.albertmnz.familyapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "family_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FamilyUser {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "user_id")
    private UUID user_id;
}
