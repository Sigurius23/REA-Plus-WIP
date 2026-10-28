package com.mapbox.common;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class PersistentStorageInterfaceNative implements PersistentStorageInterface {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class PersistentStorageInterfacePeerCleaner implements Runnable {
        private long peer;

        public PersistentStorageInterfacePeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            PersistentStorageInterfaceNative.cleanNativePeer(this.peer);
        }
    }

    public PersistentStorageInterfaceNative(long j7) {
        this.peer = j7;
        CleanerService.register(this, new PersistentStorageInterfacePeerCleaner(j7));
    }

    public static native void cleanNativePeer(long j7);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, PersistentStorageData> get(String str);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, List<PersistentStorageData>> getAll();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, List<PersistentStorageData>> getMulti(List<String> list);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> getStorageSize();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Date> put(String str, DataRef dataRef);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Date> putMulti(List<PersistentStorageKeyValue> list);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, None> remove(String str);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> removeAll();

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, Long> removeMulti(List<String> list, boolean z4);

    @Override // com.mapbox.common.PersistentStorageInterface
    public native Expected<PersistentStorageError, None> shrinkToFit();
}
