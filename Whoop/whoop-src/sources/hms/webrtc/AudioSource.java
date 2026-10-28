package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j7) {
        super(j7);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
