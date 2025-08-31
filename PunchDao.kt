package it.sam.timbrature.model

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface PunchDao {
    @Insert suspend fun insert(p: Punch)
    @Query("SELECT * FROM punches ORDER BY timestamp DESC") fun latest(): Flow<List<Punch>>
}