package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public class AudioSource extends MediaSource {
    public AudioSource(long j7) {
        super(j7);
    }

    public long getNativeAudioSource() {
        return getNativeMediaSource();
    }
}
