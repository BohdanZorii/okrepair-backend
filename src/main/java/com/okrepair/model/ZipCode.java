package com.okrepair.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "zip_codes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ZipCode {
    @Id
    private String code;
}
