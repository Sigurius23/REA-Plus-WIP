package hms.webrtc;

import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i13) {
            this.nativeIndex = i13;
        }

        @CalledByNative("MediaType")
        public static MediaType fromNativeIndex(int i13) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i13) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown native media type: "));
        }

        @CalledByNative("MediaType")
        public int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        public static State fromNativeIndex(int i13) {
            return values()[i13];
        }
    }

    public MediaStreamTrack(long j7) {
        if (j7 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j7;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    public static MediaStreamTrack createMediaStreamTrack(long j7) {
        if (j7 == 0) {
            return null;
        }
        String strNativeGetKind = nativeGetKind(j7);
        if (strNativeGetKind.equals("audio")) {
            return new AudioTrack(j7);
        }
        if (strNativeGetKind.equals("video")) {
            return new VideoTrack(j7);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j7);

    private static native String nativeGetId(long j7);

    private static native String nativeGetKind(long j7);

    private static native State nativeGetState(long j7);

    private static native boolean nativeSetEnabled(long j7, boolean z4);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    public long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    /* JADX INFO: renamed from: id */
    public String m49577id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z4) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z4);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
