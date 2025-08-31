package it.sam.timbrature.alarm
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
class AlarmReceiver:BroadcastReceiver(){ override fun onReceive(context: Context,intent: Intent){Toast.makeText(context,"È ora di timbrare!",Toast.LENGTH_SHORT).show()} }