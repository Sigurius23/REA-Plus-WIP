package hms.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import android.view.Surface;
import hc3.AbstractC17176i;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p497t7.InterfaceC33561b;

/* JADX INFO: loaded from: classes11.dex */
public class Camera2Session implements CameraSession {
    private static final String TAG = "Camera2Session";
    private final Context applicationContext;
    private final CameraSession.CreateSessionCallback callback;
    private CameraCharacteristics cameraCharacteristics;
    private CameraDevice cameraDevice;
    private final String cameraId;
    private final CameraManager cameraManager;
    private int cameraOrientation;
    private final Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private CaptureRequest.Builder captureRequestBuilder;
    private CameraCaptureSession captureSession;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int framerate;
    private final int height;
    private ImageReader imageReader;
    private boolean isCameraFrontFacing;
    private SessionState state = SessionState.RUNNING;
    private Surface surface;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final int width;
    private static final Histogram camera2StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StartTimeMs", 1, InterfaceC33561b.INVALID_OWNERSHIP, 50);
    private static final Histogram camera2StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera2.StopTimeMs", 1, InterfaceC33561b.INVALID_OWNERSHIP, 50);
    private static final Histogram camera2ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera2.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    public static class CameraCaptureCallback extends CameraCaptureSession.CaptureCallback {
        public /* synthetic */ CameraCaptureCallback(int i13) {
            this();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            Logging.m49570d(Camera2Session.TAG, "Capture failed: " + captureFailure);
        }

        private CameraCaptureCallback() {
        }
    }

    public class CameraStateCallback extends CameraDevice.StateCallback {
        public /* synthetic */ CameraStateCallback(Camera2Session camera2Session, int i13) {
            this();
        }

        private String getErrorDescription(int i13) {
            if (i13 == 1) {
                return "Camera device is in use already.";
            }
            if (i13 == 2) {
                return "Camera device could not be opened because there are too many other open camera devices.";
            }
            if (i13 == 3) {
                return "Camera device could not be opened due to a device policy.";
            }
            if (i13 != 4) {
                return i13 != 5 ? AbstractC2875y.m8295h(i13, "Unknown camera error: ") : "Camera service has encountered a fatal error.";
            }
            return "Camera device has encountered a fatal error.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int lambda$onOpened$0(android.util.Size size, android.util.Size size2) {
            return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m49570d(Camera2Session.TAG, "Camera device closed.");
            Camera2Session.this.events.onCameraClosed(Camera2Session.this);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            boolean z4 = Camera2Session.this.captureSession == null && Camera2Session.this.state != SessionState.STOPPED;
            Camera2Session.this.state = SessionState.STOPPED;
            Camera2Session.this.stopInternal();
            if (z4) {
                Camera2Session.this.callback.onFailure(CameraSession.FailureType.DISCONNECTED, "Camera disconnected / evicted.");
            } else {
                Camera2Session.this.events.onCameraDisconnected(Camera2Session.this);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            Camera2Session.this.checkIsOnCameraThread();
            Camera2Session.this.reportError(getErrorDescription(i13));
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m49570d(Camera2Session.TAG, "Camera opened.");
            Camera2Session.this.cameraDevice = cameraDevice;
            Camera2Session.this.surfaceTextureHelper.setTextureSize(Camera2Session.this.captureFormat.width, Camera2Session.this.captureFormat.height);
            Camera2Session.this.surface = new Surface(Camera2Session.this.surfaceTextureHelper.getSurfaceTexture());
            try {
                android.util.Size size = (android.util.Size) Collections.max(Arrays.asList(((StreamConfigurationMap) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256)), new C17479c());
                Camera2Session.this.imageReader = ImageReader.newInstance(size.getWidth(), size.getHeight(), 256, 1);
            } catch (Exception e5) {
                Camera2Session.this.imageReader = null;
                Camera2Session.this.reportError("Failed to setup image reader. " + e5);
            }
            try {
                cameraDevice.createCaptureSession(Camera2Session.this.imageReader == null ? Arrays.asList(Camera2Session.this.surface) : Arrays.asList(Camera2Session.this.surface, Camera2Session.this.imageReader.getSurface()), new CaptureSessionCallback(Camera2Session.this, 0), Camera2Session.this.cameraThreadHandler);
            } catch (CameraAccessException e13) {
                Camera2Session.this.reportError("Failed to create capture session. " + e13);
            }
        }

        private CameraStateCallback() {
        }
    }

    public class CaptureSessionCallback extends CameraCaptureSession.StateCallback {
        public /* synthetic */ CaptureSessionCallback(Camera2Session camera2Session, int i13) {
            this();
        }

        private void chooseFocusMode(CaptureRequest.Builder builder) {
            for (int i13 : (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) {
                if (i13 == 3) {
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    Logging.m49570d(Camera2Session.TAG, "Using continuous video auto-focus.");
                    return;
                }
            }
            Logging.m49570d(Camera2Session.TAG, "Auto-focus is not available.");
        }

        private void chooseStabilizationMode(CaptureRequest.Builder builder) {
            int[] iArr = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
            if (iArr != null) {
                for (int i13 : iArr) {
                    if (i13 == 1) {
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
                        Logging.m49570d(Camera2Session.TAG, "Using optical stabilization.");
                        return;
                    }
                }
            }
            int[] iArr2 = (int[]) Camera2Session.this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            if (iArr2 != null) {
                for (int i14 : iArr2) {
                    if (i14 == 1) {
                        builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                        builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
                        Logging.m49570d(Camera2Session.TAG, "Using video stabilization.");
                        return;
                    }
                }
            }
            Logging.m49570d(Camera2Session.TAG, "Stabilization not available.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(VideoFrame videoFrame) {
            Camera2Session.this.checkIsOnCameraThread();
            if (Camera2Session.this.state != SessionState.RUNNING) {
                Logging.m49570d(Camera2Session.TAG, "Texture frame captured but camera is no longer running.");
                return;
            }
            if (!Camera2Session.this.firstFrameReported) {
                Camera2Session.this.firstFrameReported = true;
                Camera2Session.camera2StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera2Session.this.constructionTimeNs));
            }
            VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), Camera2Session.this.isCameraFrontFacing, -Camera2Session.this.cameraOrientation), Camera2Session.this.getFrameOrientation(), videoFrame.getTimestampNs());
            Camera2Session.this.events.onFrameCaptured(Camera2Session.this, videoFrame2);
            videoFrame2.release();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            cameraCaptureSession.close();
            Camera2Session.this.reportError("Failed to configure capture session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Camera2Session.this.checkIsOnCameraThread();
            Logging.m49570d(Camera2Session.TAG, "Camera capture session configured.");
            Camera2Session.this.captureSession = cameraCaptureSession;
            try {
                Camera2Session camera2Session = Camera2Session.this;
                camera2Session.captureRequestBuilder = camera2Session.cameraDevice.createCaptureRequest(3);
                if (!Build.MODEL.toLowerCase().contains("pixel 4")) {
                    Camera2Session.this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(Camera2Session.this.captureFormat.framerate.min / Camera2Session.this.fpsUnitFactor), Integer.valueOf(Camera2Session.this.captureFormat.framerate.max / Camera2Session.this.fpsUnitFactor)));
                }
                Camera2Session.this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                Camera2Session.this.captureRequestBuilder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
                chooseStabilizationMode(Camera2Session.this.captureRequestBuilder);
                chooseFocusMode(Camera2Session.this.captureRequestBuilder);
                Camera2Session.this.captureRequestBuilder.addTarget(Camera2Session.this.surface);
                cameraCaptureSession.setRepeatingRequest(Camera2Session.this.captureRequestBuilder.build(), new CameraCaptureCallback(0), Camera2Session.this.cameraThreadHandler);
                Camera2Session.this.surfaceTextureHelper.startListening(new C17476a(this, 1));
                Logging.m49570d(Camera2Session.TAG, "Camera device successfully started.");
                Camera2Session.this.callback.onDone(Camera2Session.this);
            } catch (CameraAccessException e5) {
                Camera2Session.this.reportError("Failed to start capture request. " + e5);
            }
        }

        private CaptureSessionCallback() {
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera2Session(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i13, int i14, int i15) {
        Logging.m49570d(TAG, "Create new camera2 session on camera " + str);
        this.constructionTimeNs = System.nanoTime();
        this.cameraThreadHandler = new Handler();
        this.callback = createSessionCallback;
        this.events = events;
        this.applicationContext = context;
        this.cameraManager = cameraManager;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = str;
        this.width = i13;
        this.height = i14;
        this.framerate = i15;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, CameraManager cameraManager, SurfaceTextureHelper surfaceTextureHelper, String str, int i13, int i14, int i15) {
        new Camera2Session(createSessionCallback, events, context, cameraManager, surfaceTextureHelper, str, i13, i14, i15);
    }

    private void findCaptureFormat() {
        checkIsOnCameraThread();
        Range[] rangeArr = (Range[]) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = Camera2Enumerator.getSupportedSizes(this.cameraCharacteristics);
        Logging.m49570d(TAG, "Available preview sizes: " + supportedSizes);
        Logging.m49570d(TAG, "Available fps ranges: " + listConvertFramerates);
        if (listConvertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, this.framerate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(camera2ResolutionHistogram, closestSupportedSize);
        CameraEnumerationAndroid.CaptureFormat captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        this.captureFormat = captureFormat;
        Logging.m49570d(TAG, "Using capture format: " + captureFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        if (!this.isCameraFrontFacing) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (this.cameraOrientation + deviceOrientation) % 360;
    }

    private void openCamera() {
        checkIsOnCameraThread();
        AbstractC17176i.m48510l("Opening camera ", this.cameraId, TAG);
        this.events.onCameraOpening();
        try {
            this.cameraManager.openCamera(this.cameraId, new CameraStateCallback(this, 0), this.cameraThreadHandler);
        } catch (CameraAccessException | IllegalArgumentException | SecurityException e5) {
            reportError(AbstractC2875y.m8297j(e5, "Failed to open camera: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportError(String str) {
        checkIsOnCameraThread();
        Logging.m49571e(TAG, "Error: " + str);
        boolean z4 = this.captureSession == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z4) {
            this.callback.onFailure(CameraSession.FailureType.ERROR, str);
        } else {
            this.events.onCameraError(this, str);
        }
    }

    private void start() {
        checkIsOnCameraThread();
        Logging.m49570d(TAG, "start");
        try {
            CameraCharacteristics cameraCharacteristics = this.cameraManager.getCameraCharacteristics(this.cameraId);
            this.cameraCharacteristics = cameraCharacteristics;
            this.cameraOrientation = ((Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            this.isCameraFrontFacing = ((Integer) this.cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
            findCaptureFormat();
            if (this.captureFormat == null) {
                return;
            }
            openCamera();
        } catch (CameraAccessException | IllegalArgumentException e5) {
            reportError(AbstractC11266d.m30461o("getCameraCharacteristics(): ", e5.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        Logging.m49570d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.captureSession = null;
        }
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        CameraDevice cameraDevice = this.cameraDevice;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.cameraDevice = null;
        }
        Logging.m49570d(TAG, "Stop done");
    }

    public CameraCaptureSession getCamera2CaptureSession() {
        checkIsOnCameraThread();
        return this.captureSession;
    }

    public CameraEnumerationAndroid.CaptureFormat getCameraCaptureFormat() {
        return this.captureFormat;
    }

    public CaptureRequest.Builder getCaptureRequestBuilder() {
        checkIsOnCameraThread();
        return this.captureRequestBuilder;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    @Override // hms.webrtc.CameraSession
    public void stop() {
        AbstractC17176i.m48510l("Stop camera2 session on camera ", this.cameraId, TAG);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long jNanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            camera2StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
        }
    }
}
