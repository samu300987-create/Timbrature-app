package it.sam.timbrature.model
import android.content.Context
import androidx.room.*
@Database(entities=[Punch::class],version=1)
abstract class AppDb:RoomDatabase(){ abstract fun punchDao():PunchDao
companion object{ private var INSTANCE:AppDb?=null
fun get(context:Context):AppDb=INSTANCE?: synchronized(this){Room.databaseBuilder(context,AppDb::class.java,"timbrature.db").build().also{INSTANCE=it}}}}