package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
final class ReadStreamNative implements ReadStream {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ReadStreamPeerCleaner implements Runnable {
        private long peer;

        public ReadStreamPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReadStreamNative.cleanNativePeer(this.peer);
        }
    }

    public ReadStreamNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new ReadStreamPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.ReadStream
    public native boolean isExhausted();

    @Override // com.mapbox.common.ReadStream
    public native boolean isReadable();

    @Override // com.mapbox.common.ReadStream
    public native Expected<String, Long> read(Buffer buffer);

    @Override // com.mapbox.common.ReadStream
    public native long readBytes();
}
