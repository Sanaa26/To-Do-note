package com.example.todonote.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todonote.repository.TodoRepository
import com.example.todonote.room.NoteEntity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ToDoViewModel(val repository: TodoRepository):ViewModel() {
    var allNotes = repository.allNote



     fun insertData(noteEntity: NoteEntity) {
         viewModelScope.launch {
             repository.insertData(noteEntity)


         }
     }
         fun deleteData(noteEntity: NoteEntity){
             viewModelScope.launch {
                 repository.deleteData(noteEntity)
             }
         }
     fun updateData(noteEntity: NoteEntity){
        viewModelScope.launch {
            repository.updateData(noteEntity)
        }
    }

    }
