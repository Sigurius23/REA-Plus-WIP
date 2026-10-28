package hms.webrtc;

/* JADX INFO: loaded from: classes11.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z4);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
