package org.webrtc.audio;

/* JADX INFO: loaded from: classes3.dex */
public interface AudioDeviceModule {
    long getNative(long j7);

    void release();

    void setMicrophoneMute(boolean z4);

    default boolean setNoiseSuppressorEnabled(boolean z4) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f13) {
        return false;
    }

    void setSpeakerMute(boolean z4);
}
