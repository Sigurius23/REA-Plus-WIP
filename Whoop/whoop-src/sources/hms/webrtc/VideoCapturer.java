package hms.webrtc;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i13, int i14, int i15);

    void dispose();

    void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i13, int i14, int i15);

    void stopCapture() throws InterruptedException;
}
