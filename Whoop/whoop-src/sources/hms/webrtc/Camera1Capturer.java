package hms.webrtc;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class Camera1Capturer extends CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z4, CameraVideoCapturer.CameraSessionCallback cameraSessionCallback) {
        super(str, cameraEventsHandler, new Camera1Enumerator(z4), cameraSessionCallback);
        this.captureToTexture = z4;
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i13, int i14, int i15) {
        super.changeCaptureFormat(i13, i14, i15);
    }

    @Override // hms.webrtc.CameraCapturer
    public void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i13, int i14, int i15) {
        Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, str, i13, i14, i15);
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // hms.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i13, int i14, int i15) {
        super.startCapture(i13, i14, i15);
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // hms.webrtc.CameraCapturer, hms.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, String str) {
        super.switchCamera(cameraSwitchHandler, str);
    }
}
