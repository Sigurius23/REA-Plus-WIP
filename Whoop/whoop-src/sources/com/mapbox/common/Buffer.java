package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;

/* JADX INFO: loaded from: classes.dex */
public class Buffer {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class BufferPeerCleaner implements Runnable {
        private long peer;

        public BufferPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            Buffer.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public Buffer(DataRef dataRef) {
        initialize(dataRef);
    }

    public static native void cleanNativePeer(long j7);

    private native void initialize(DataRef dataRef);

    private native DataRef nativeGetData();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new BufferPeerCleaner(j7));
    }

    public DataRef getData() {
        return nativeGetData();
    }

    public Buffer(long j7) {
        setPeer(j7);
    }
}
