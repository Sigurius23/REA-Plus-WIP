package hms.webrtc;

import android.hardware.Camera;
import android.os.SystemClock;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;

/* JADX INFO: loaded from: classes11.dex */
public class Camera1Enumerator implements CameraEnumerator {
    private static final String TAG = "Camera1Enumerator";
    private static List<List<CameraEnumerationAndroid.CaptureFormat>> cachedSupportedFormats;
    private final boolean captureToTexture;

    public Camera1Enumerator() {
        this(true);
    }

    public static List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> convertFramerates(List<int[]> list) {
        ArrayList arrayList = new ArrayList();
        for (int[] iArr : list) {
            arrayList.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(iArr[0], iArr[1]));
        }
        return arrayList;
    }

    public static List<Size> convertSizes(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Camera.Size size : list) {
            arrayList.add(new Size(size.width, size.height));
        }
        return arrayList;
    }

    private static List<CameraEnumerationAndroid.CaptureFormat> enumerateFormats(int i13) {
        int i14;
        Logging.m49570d(TAG, "Get supported formats for camera index " + i13 + ".");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Camera cameraOpen = null;
        try {
            try {
                Logging.m49570d(TAG, "Opening camera with index " + i13);
                cameraOpen = Camera.open(i13);
                Camera.Parameters parameters = cameraOpen.getParameters();
                cameraOpen.release();
                ArrayList arrayList = new ArrayList();
                try {
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int i15 = 0;
                    if (supportedPreviewFpsRange != null) {
                        int[] iArr = supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                        i15 = iArr[0];
                        i14 = iArr[1];
                    } else {
                        i14 = 0;
                    }
                    for (Camera.Size size : parameters.getSupportedPreviewSizes()) {
                        arrayList.add(new CameraEnumerationAndroid.CaptureFormat(size.width, size.height, i15, i14));
                    }
                } catch (Exception e5) {
                    Logging.m49572e(TAG, "getSupportedFormats() failed on camera index " + i13, e5);
                }
                Logging.m49570d(TAG, "Get supported formats for camera index " + i13 + " done. Time spent: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms.");
                return arrayList;
            } catch (RuntimeException e13) {
                Logging.m49572e(TAG, "Open camera failed on camera index " + i13, e13);
                ArrayList arrayList2 = new ArrayList();
                if (cameraOpen != null) {
                    cameraOpen.release();
                }
                return arrayList2;
            }
        } catch (Throwable th3) {
            if (cameraOpen != null) {
                cameraOpen.release();
            }
            throw th3;
        }
    }

    public static int getCameraIndex(String str) {
        AbstractC17176i.m48510l("getCameraIndex: ", str, TAG);
        for (int i13 = 0; i13 < Camera.getNumberOfCameras(); i13++) {
            if (str.equals(getDeviceName(i13))) {
                return i13;
            }
        }
        throw new IllegalArgumentException(AbstractC11266d.m30461o("No such camera: ", str));
    }

    private static Camera.CameraInfo getCameraInfo(int i13) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i13, cameraInfo);
            return cameraInfo;
        } catch (Exception e5) {
            Logging.m49572e(TAG, "getCameraInfo failed on index " + i13, e5);
            return null;
        }
    }

    public static String getDeviceName(int i13) {
        Camera.CameraInfo cameraInfo = getCameraInfo(i13);
        if (cameraInfo == null) {
            return null;
        }
        String str = cameraInfo.facing == 1 ? "front" : "back";
        int i14 = cameraInfo.orientation;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "Camera ", ", Facing ", str, ", Orientation ");
        sbM53373n.append(i14);
        return sbM53373n.toString();
    }

    @Override // hms.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraSessionCallback cameraSessionCallback) {
        return new Camera1Capturer(str, cameraEventsHandler, this.captureToTexture, cameraSessionCallback);
    }

    @Override // hms.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < Camera.getNumberOfCameras(); i13++) {
            String deviceName = getDeviceName(i13);
            if (deviceName != null) {
                arrayList.add(deviceName);
                Logging.m49570d(TAG, "Index: " + i13 + ". " + deviceName);
            } else {
                Logging.m49571e(TAG, "Index: " + i13 + ". Failed to query camera name.");
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // hms.webrtc.CameraEnumerator
    public List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(String str) {
        return getSupportedFormats(getCameraIndex(str));
    }

    @Override // hms.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 0;
    }

    @Override // hms.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        Camera.CameraInfo cameraInfo = getCameraInfo(getCameraIndex(str));
        return cameraInfo != null && cameraInfo.facing == 1;
    }

    public Camera1Enumerator(boolean z4) {
        this.captureToTexture = z4;
    }

    public static synchronized List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(int i13) {
        try {
            if (cachedSupportedFormats == null) {
                cachedSupportedFormats = new ArrayList();
                for (int i14 = 0; i14 < Camera.getNumberOfCameras(); i14++) {
                    cachedSupportedFormats.add(enumerateFormats(i14));
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return cachedSupportedFormats.get(i13);
    }
}
