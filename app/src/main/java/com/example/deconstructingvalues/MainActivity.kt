package com.example.deconstructingvalues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.sinh

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var animal = Animal("dog",12)
        var student = Student("thanh",26)
        var (name,weight) = animal
        var (nameStudent,age) = student
    }
}
data class Animal (var name:String,var weight:Int)
class Student (var nameStudent:String, var age:Int) {
    operator fun component1(): String = nameStudent
    operator fun component2(): Int = age
}
