package it.sam.timbrature.model

import androidx.room.*

@Entity(tableName = "punches")
data class Punch(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val timestamp: Long,
    val type: String
)