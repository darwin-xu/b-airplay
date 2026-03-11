package com.example.bairplay

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.bairplay.airplay.AirPlayReceiver

class MainActivity : Activity() {
    private val TAG = "MainActivity"
    private val airPlayReceiver = AirPlayReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate - starting AirPlayReceiver")
        val started = airPlayReceiver.start()
        Log.i(TAG, "AirPlayReceiver.start() returned: $started")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy - stopping AirPlayReceiver")
        val stopped = airPlayReceiver.stop()
        Log.i(TAG, "AirPlayReceiver.stop() returned: $stopped")
    }
}
