package com.example.todonote.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.todonote.repository.TodoRepository

class TodoFactory (val repo: TodoRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ToDoViewModel(repo) as T
    }
}