package com.example.bairplay.airplay

/**
 * Minimal AirPlay receiver interface stub.
 * Real AirPlay mirroring is platform- and network-protocol heavy and
 * requires significant implementation (RTSP, video codecs, FairPlay, etc.).
 * This class provides a testable local API and placeholders to implement
 * the protocol handlers later.
 */
class AirPlayReceiver {
    @Volatile
    private var running: Boolean = false

    /** Start the receiver (bind sockets, advertise service, accept streams). */
    fun start(): Boolean {
        synchronized(this) {
            if (running) return false
            // TODO: implement network listeners, mDNS/bonjour advertisement, RTSP handshake
            running = true
            return true
        }
    }

    /** Stop the receiver and release resources. */
    fun stop(): Boolean {
        synchronized(this) {
            if (!running) return false
            // TODO: tear down listeners and free resources
            running = false
            return true
        }
    }

    /** Whether the receiver is currently running. */
    fun isRunning(): Boolean = running
}
