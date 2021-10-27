package com.samsad.springbootnotes.entity

import lombok.Data
import javax.persistence.*

@Entity
@Table(name = "tbl_notes")
@Data
data class Note(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        val title: String? = null,
        val body: String? = null,
        val category: String? = null
)