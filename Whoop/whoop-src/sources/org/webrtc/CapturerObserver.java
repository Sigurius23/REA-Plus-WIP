package org.webrtc;

/* JADX INFO: loaded from: classes3.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z4);

    void onCapturerStopped();

    void onFrameCaptured(VideoFrame videoFrame);
}
