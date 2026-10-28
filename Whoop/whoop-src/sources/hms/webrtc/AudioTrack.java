package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class AudioTrack extends MediaStreamTrack {
    public AudioTrack(long j7) {
        super(j7);
    }

    private static native void nativeSetVolume(long j7, double d3);

    public long getNativeAudioTrack() {
        return getNativeMediaStreamTrack();
    }

    public void setVolume(double d3) {
        nativeSetVolume(getNativeAudioTrack(), d3);
    }
}
