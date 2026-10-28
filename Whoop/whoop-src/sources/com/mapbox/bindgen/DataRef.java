package com.mapbox.bindgen;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class DataRef {
    private ByteBuffer buffer;
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class DataRefPeerCleaner implements Runnable {
        private long peer;

        public DataRefPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            DataRef.cleanNativePeer(this.peer);
        }
    }

    public DataRef(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be an instance of class java.nio.DirectByteBuffer(created by ByteBuffer#allocateDirect() or JNI#NewDirectByteBuffer()).");
        }
        this.buffer = byteBuffer;
    }

    public static DataRef allocateNative(int i13) {
        if (i13 >= 0) {
            return allocateNativeMemory(i13);
        }
        throw new IllegalArgumentException("Buffer size must be a non-negative integer");
    }

    public static native DataRef allocateNativeMemory(int i13);

    public static native void cleanNativePeer(long j7);

    private void setPeer(long j7) {
        this.peer = j7;
        CleanerService.register(this.buffer, new DataRefPeerCleaner(j7));
    }

    public ByteBuffer getBuffer() {
        return this.buffer.duplicate();
    }

    private DataRef(long j7, ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        setPeer(j7);
    }
}
