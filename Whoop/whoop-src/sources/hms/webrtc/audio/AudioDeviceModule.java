package hms.webrtc.audio;

/* JADX INFO: loaded from: classes11.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z4);

    void setSpeakerMute(boolean z4);
}
