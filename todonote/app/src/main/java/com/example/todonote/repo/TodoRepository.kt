package com.example.todonote.repository

import com.example.todonote.room.NoteDao
import com.example.todonote.room.NoteEntity

class TodoRepository(val noteDao: NoteDao){
    val allNote = noteDao.getAllData()
    suspend fun insertData(noteEntity:NoteEntity){
        noteDao.insertData(noteEntity)
    }
    suspend fun deleteData(noteEntity: NoteEntity){
        noteDao.deleteData(noteEntity)
    }
    suspend fun updateData(noteEntity: NoteEntity){
        noteDao.updateData(noteEntity)
    }

}