package com.albertmnz.familyapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dni")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DNI {

    @Id
    @Column(name = "number")
    private String number;

    private byte[] image_front;
    private byte[] image_back;

    private String family_user_id;
}
