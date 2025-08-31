package it.sam.timbrature.model
import androidx.room.*
@Dao interface PunchDao { @Insert suspend fun insert(p:Punch); @Query("SELECT * FROM punches ORDER BY timestamp DESC") fun latest() }