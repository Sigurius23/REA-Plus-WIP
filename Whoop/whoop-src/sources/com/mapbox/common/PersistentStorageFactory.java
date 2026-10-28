package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.Expected;

/* JADX INFO: loaded from: classes.dex */
public class PersistentStorageFactory {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class PersistentStorageFactoryPeerCleaner implements Runnable {
        private long peer;

        public PersistentStorageFactoryPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageFactory.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public PersistentStorageFactory(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByFile(String str);

    public static native Expected<PersistentStorageError, PersistentStorageInterface> getOrCreateByKey(String str);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new PersistentStorageFactoryPeerCleaner(j7));
    }
}
