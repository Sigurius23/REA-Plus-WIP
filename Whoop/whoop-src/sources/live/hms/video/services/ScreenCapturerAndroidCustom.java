package live.hms.video.services;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.util.Log;
import android.view.Surface;
import com.mapbox.maps.RunnableC5502c;
import hms.webrtc.CapturerObserver;
import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.ThreadUtils;
import hms.webrtc.VideoCapturer;
import hms.webrtc.VideoFrame;
import hms.webrtc.VideoSink;

/* JADX INFO: loaded from: classes3.dex */
public class ScreenCapturerAndroidCustom implements VideoCapturer, VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private CapturerObserver capturerObserver;
    private int height;
    private boolean isDisposed;
    private MediaProjection mediaProjection;
    private final MediaProjection.Callback mediaProjectionCallback;
    private MediaProjectionManager mediaProjectionManager;
    private final Intent mediaProjectionPermissionResultData;
    private long numCapturedFrames;
    private SurfaceTextureHelper surfaceTextureHelper;
    private VirtualDisplay virtualDisplay;
    private int width;

    public ScreenCapturerAndroidCustom(Intent intent, MediaProjection.Callback callback) {
        this.mediaProjectionPermissionResultData = intent;
        this.mediaProjectionCallback = callback;
    }

    private void checkNotDisposed() {
        if (this.isDisposed) {
            throw new RuntimeException("capturer is disposed.");
        }
    }

    private void createVirtualDisplay() {
        this.surfaceTextureHelper.setTextureSize(this.width, this.height);
        this.virtualDisplay = this.mediaProjection.createVirtualDisplay("WebRTC_ScreenCapture", this.width, this.height, VIRTUAL_DISPLAY_DPI, 3, new Surface(this.surfaceTextureHelper.getSurfaceTexture()), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$changeCaptureFormat$0(int i13, int i14) {
        this.surfaceTextureHelper.setTextureSize(i13, i14);
        Log.d("XYZ", "Resizing virtual display to " + i13 + "x" + i14);
        this.virtualDisplay.resize(i13, i14, VIRTUAL_DISPLAY_DPI);
    }

    @Override // hms.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int i13, int i14, int i15) {
        checkNotDisposed();
        this.width = i13;
        this.height = i14;
        if (this.virtualDisplay == null) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new RunnableC5502c(this, i13, i14, 4));
    }

    @Override // hms.webrtc.VideoCapturer
    public synchronized void dispose() {
        this.isDisposed = true;
    }

    public MediaProjection getMediaProjection() {
        return this.mediaProjection;
    }

    public long getNumCapturedFrames() {
        return this.numCapturedFrames;
    }

    @Override // hms.webrtc.VideoCapturer
    public synchronized void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        checkNotDisposed();
        if (capturerObserver == null) {
            throw new RuntimeException("capturerObserver not set.");
        }
        this.capturerObserver = capturerObserver;
        if (surfaceTextureHelper == null) {
            throw new RuntimeException("surfaceTextureHelper not set.");
        }
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.mediaProjectionManager = (MediaProjectionManager) context.getSystemService("media_projection");
    }

    @Override // hms.webrtc.VideoCapturer
    public boolean isScreencast() {
        return true;
    }

    @Override // hms.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.numCapturedFrames++;
        this.capturerObserver.onFrameCaptured(videoFrame);
    }

    @Override // hms.webrtc.VideoCapturer
    public synchronized void startCapture(int i13, int i14, int i15) {
        checkNotDisposed();
        this.width = i13;
        this.height = i14;
        MediaProjection mediaProjection = this.mediaProjectionManager.getMediaProjection(-1, this.mediaProjectionPermissionResultData);
        this.mediaProjection = mediaProjection;
        mediaProjection.registerCallback(this.mediaProjectionCallback, this.surfaceTextureHelper.getHandler());
        createVirtualDisplay();
        this.capturerObserver.onCapturerStarted(true);
        this.surfaceTextureHelper.startListening(this);
    }

    @Override // hms.webrtc.VideoCapturer
    public synchronized void stopCapture() {
        checkNotDisposed();
        ThreadUtils.invokeAtFrontUninterruptibly(this.surfaceTextureHelper.getHandler(), new Runnable() { // from class: live.hms.video.services.ScreenCapturerAndroidCustom.1
            @Override // java.lang.Runnable
            public void run() {
                ScreenCapturerAndroidCustom.this.surfaceTextureHelper.stopListening();
                ScreenCapturerAndroidCustom.this.capturerObserver.onCapturerStopped();
                if (ScreenCapturerAndroidCustom.this.virtualDisplay != null) {
                    ScreenCapturerAndroidCustom.this.virtualDisplay.release();
                    ScreenCapturerAndroidCustom.this.virtualDisplay = null;
                }
                if (ScreenCapturerAndroidCustom.this.mediaProjection != null) {
                    ScreenCapturerAndroidCustom.this.mediaProjection.unregisterCallback(ScreenCapturerAndroidCustom.this.mediaProjectionCallback);
                    ScreenCapturerAndroidCustom.this.mediaProjection.stop();
                    ScreenCapturerAndroidCustom.this.mediaProjection = null;
                }
            }
        });
    }
}
