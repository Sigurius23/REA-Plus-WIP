package hms.webrtc;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface CameraEnumerator {
    CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraSessionCallback cameraSessionCallback);

    String[] getDeviceNames();

    List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str);

    boolean isBackFacing(String str);

    boolean isFrontFacing(String str);
}
