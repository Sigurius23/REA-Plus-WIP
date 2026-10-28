package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
final class OnValueChangedNative implements OnValueChanged {
    private long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OnValueChangedPeerCleaner implements Runnable {
        private long peer;

        public OnValueChangedPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnValueChangedNative.cleanNativePeer(this.peer);
        }
    }

    private OnValueChangedNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new OnValueChangedPeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.OnValueChanged
    public native void run(String str, Value value, Value value2);
}
