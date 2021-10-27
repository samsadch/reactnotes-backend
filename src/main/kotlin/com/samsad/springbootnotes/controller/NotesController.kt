package com.samsad.springbootnotes.controller

import com.samsad.springbootnotes.entity.Note
import com.samsad.springbootnotes.repository.NotesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
class NotesController {
    @Autowired
    var nRepo: NotesRepository? = null

    @GetMapping("/notes")
    fun readNotes(): ResponseEntity<List<Note>> {
        return ResponseEntity<List<Note>>(nRepo?.findAll(), HttpStatus.OK)
    }
}
