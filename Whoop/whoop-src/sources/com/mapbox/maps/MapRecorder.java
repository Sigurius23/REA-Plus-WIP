package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes.dex */
final class MapRecorder {
    protected long peer;

    /* JADX INFO: loaded from: classes6.dex */
    public static class MapRecorderPeerCleaner implements Runnable {
        private long peer;

        public MapRecorderPeerCleaner(long j7) {
            this.peer = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapRecorder.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public MapRecorder(long j7) {
        setPeer(j7);
    }

    public static native void cleanNativePeer(long j7);

    public static native Expected<String, MapRecorder> createInstance(Map map);

    private void setPeer(long j7) {
        this.peer = j7;
        if (j7 == 0) {
            return;
        }
        CleanerService.register(this, new MapRecorderPeerCleaner(j7));
    }

    public native String getPlaybackState();

    public native void replay(DataRef dataRef, MapPlayerOptions mapPlayerOptions, PlaybackFinished playbackFinished);

    public native void startRecording(MapRecorderOptions mapRecorderOptions);

    public native DataRef stopRecording();

    public native void togglePauseReplay();
}
