package com.example.tpp

data class Student(val name: String, val group: Int) {

    override fun toString(): String {
        return "привет я $name, я учусь на $group курсе"
    }
}