package com.example.bairplay.airplay

import org.junit.Assert.*
import org.junit.Test

class AirPlayReceiverTest {

    @Test
    fun testStartStop() {
        val receiver = AirPlayReceiver()
        assertFalse(receiver.isRunning())

        val started = receiver.start()
        assertTrue("start() should return true on first start", started)
        assertTrue(receiver.isRunning())

        val startedAgain = receiver.start()
        assertFalse("start() should return false when already running", startedAgain)

        val stopped = receiver.stop()
        assertTrue("stop() should return true when stopping", stopped)
        assertFalse(receiver.isRunning())

        val stoppedAgain = receiver.stop()
        assertFalse("stop() should return false when already stopped", stoppedAgain)
    }
}
