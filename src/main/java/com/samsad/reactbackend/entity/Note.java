package com.samsad.reactbackend.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "tbl_notes")
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String title;
    String body;
    String category;
}
