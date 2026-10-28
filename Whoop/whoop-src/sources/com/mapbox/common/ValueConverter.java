package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;

/* JADX INFO: loaded from: classes.dex */
public final class ValueConverter {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class ValueConverterPeerCleaner implements Runnable {
        private long peer;

        public ValueConverterPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueConverter.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public ValueConverter(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native Expected<String, Value> fromJson(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new ValueConverterPeerCleaner(j7));
    }

    public static native String toJson(Value value);

    public static native String toJson(Value value, int i13);
}
