package com.samsad.springbootnotes.repository

import com.samsad.springbootnotes.entity.Note
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NotesRepository : JpaRepository<Note, Long> {

}