package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.common.TilesetDescriptor;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
public final class OfflineManager {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class OfflineManagerPeerCleaner implements Runnable {
        private long peer;

        public OfflineManagerPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            OfflineManager.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public OfflineManager() {
        initialize();
    }

    public static native void cleanNativePeer(long j7);

    private native void initialize();

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new OfflineManagerPeerCleaner(j7));
    }

    public native TilesetDescriptor createTilesetDescriptor(TilesetDescriptorOptions tilesetDescriptorOptions);

    public native void getAllStylePacks(StylePacksCallback stylePacksCallback);

    public native void getStylePack(String str, StylePackCallback stylePackCallback);

    public native void getStylePackMetadata(String str, StylePackMetadataCallback stylePackMetadataCallback);

    public native Cancelable loadStylePack(String str, StylePackLoadOptions stylePackLoadOptions, StylePackCallback stylePackCallback);

    public native Cancelable loadStylePack(String str, StylePackLoadOptions stylePackLoadOptions, StylePackLoadProgressCallback stylePackLoadProgressCallback, StylePackCallback stylePackCallback);

    public native void removeStylePack(String str);

    public native void removeStylePack(String str, StylePackCallback stylePackCallback);

    public OfflineManager(long j7) {
        setPeer(j7);
    }
}
