package hms.webrtc;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.SystemClock;
import hc3.AbstractC17176i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p031b9.AbstractC2875y;
import p497t7.InterfaceC33561b;

/* JADX INFO: loaded from: classes11.dex */
class Camera1Session implements CameraSession {
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final String TAG = "Camera1Session";
    private final Context applicationContext;
    private final Camera camera;
    private final int cameraId;
    private final Handler cameraThreadHandler;
    private final CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final boolean captureToTexture;
    private final long constructionTimeNs;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private final Camera.CameraInfo info;
    private SessionState state;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private static final Histogram camera1StartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StartTimeMs", 1, InterfaceC33561b.INVALID_OWNERSHIP, 50);
    private static final Histogram camera1StopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.Camera1.StopTimeMs", 1, InterfaceC33561b.INVALID_OWNERSHIP, 50);
    private static final Histogram camera1ResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.Camera1.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    /* JADX INFO: renamed from: hms.webrtc.Camera1Session$2 */
    public class C174292 implements Camera.PreviewCallback {
        public C174292() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$0(byte[] bArr) {
            if (Camera1Session.this.state == SessionState.RUNNING) {
                Camera1Session.this.camera.addCallbackBuffer(bArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPreviewFrame$1(byte[] bArr) {
            Camera1Session.this.cameraThreadHandler.post(new RunnableC17478b(this, bArr, 1));
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Camera1Session.this.checkIsOnCameraThread();
            if (camera != Camera1Session.this.camera) {
                Logging.m49571e(Camera1Session.TAG, "Callback from a different camera. This should never happen.");
                return;
            }
            if (Camera1Session.this.state != SessionState.RUNNING) {
                Logging.m49570d(Camera1Session.TAG, "Bytebuffer frame captured but camera is no longer running.");
                return;
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            if (!Camera1Session.this.firstFrameReported) {
                Camera1Session.camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - Camera1Session.this.constructionTimeNs));
                Camera1Session.this.firstFrameReported = true;
            }
            VideoFrame videoFrame = new VideoFrame(new NV21Buffer(bArr, Camera1Session.this.captureFormat.width, Camera1Session.this.captureFormat.height, new RunnableC17478b(this, bArr, 0)), Camera1Session.this.getFrameOrientation(), nanos);
            Camera1Session.this.events.onFrameCaptured(Camera1Session.this, videoFrame);
            videoFrame.release();
        }
    }

    public enum SessionState {
        RUNNING,
        STOPPED
    }

    private Camera1Session(CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, int i13, Camera camera, Camera.CameraInfo cameraInfo, CameraEnumerationAndroid.CaptureFormat captureFormat, long j7) {
        Logging.m49570d(TAG, "Create new camera1 session on camera " + i13);
        this.cameraThreadHandler = new Handler();
        this.events = events;
        this.captureToTexture = z4;
        this.applicationContext = context;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = i13;
        this.camera = camera;
        this.info = cameraInfo;
        this.captureFormat = captureFormat;
        this.constructionTimeNs = j7;
        surfaceTextureHelper.setTextureSize(captureFormat.width, captureFormat.height);
        startCapturing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    public static void create(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, boolean z4, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i13, int i14, int i15) {
        long jNanoTime = System.nanoTime();
        Logging.m49570d(TAG, "Open camera " + str);
        events.onCameraOpening();
        try {
            int cameraIndex = Camera1Enumerator.getCameraIndex(str);
            try {
                Camera cameraOpen = Camera.open(cameraIndex);
                if (cameraOpen == null) {
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, "Camera.open returned null for camera id = " + cameraIndex);
                    return;
                }
                try {
                    cameraOpen.setPreviewTexture(surfaceTextureHelper.getSurfaceTexture());
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(cameraIndex, cameraInfo);
                    try {
                        Camera.Parameters parameters = cameraOpen.getParameters();
                        CameraEnumerationAndroid.CaptureFormat captureFormatFindClosestCaptureFormat = findClosestCaptureFormat(parameters, i13, i14, i15);
                        updateCameraParameters(cameraOpen, parameters, captureFormatFindClosestCaptureFormat, findClosestPictureSize(parameters, i13, i14), z4);
                        if (!z4) {
                            int iFrameSize = captureFormatFindClosestCaptureFormat.frameSize();
                            for (int i16 = 0; i16 < 3; i16++) {
                                cameraOpen.addCallbackBuffer(ByteBuffer.allocateDirect(iFrameSize).array());
                            }
                        }
                        try {
                            cameraOpen.setDisplayOrientation(0);
                            createSessionCallback.onDone(new Camera1Session(events, z4, context, surfaceTextureHelper, cameraIndex, cameraOpen, cameraInfo, captureFormatFindClosestCaptureFormat, jNanoTime));
                        } catch (RuntimeException e5) {
                            cameraOpen.release();
                            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e5.getMessage());
                        }
                    } catch (RuntimeException e13) {
                        cameraOpen.release();
                        createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e13.getMessage());
                    }
                } catch (IOException | RuntimeException e14) {
                    cameraOpen.release();
                    createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e14.getMessage());
                }
            } catch (RuntimeException e15) {
                createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e15.getMessage());
            }
        } catch (IllegalArgumentException e16) {
            createSessionCallback.onFailure(CameraSession.FailureType.ERROR, e16.getMessage());
        }
    }

    private static CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(Camera.Parameters parameters, int i13, int i14, int i15) {
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera1Enumerator.convertFramerates(parameters.getSupportedPreviewFpsRange());
        Logging.m49570d(TAG, "Available fps ranges: " + listConvertFramerates);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, i15);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPreviewSizes()), i13, i14);
        CameraEnumerationAndroid.reportCameraResolution(camera1ResolutionHistogram, closestSupportedSize);
        return new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
    }

    private static Size findClosestPictureSize(Camera.Parameters parameters, int i13, int i14) {
        return CameraEnumerationAndroid.getClosestSupportedSize(Camera1Enumerator.convertSizes(parameters.getSupportedPictureSizes()), i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFrameOrientation() {
        int deviceOrientation = CameraSession.getDeviceOrientation(this.applicationContext);
        Camera.CameraInfo cameraInfo = this.info;
        if (cameraInfo.facing == 0) {
            deviceOrientation = 360 - deviceOrientation;
        }
        return (cameraInfo.orientation + deviceOrientation) % 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$listenForTextureFrames$0(VideoFrame videoFrame) {
        checkIsOnCameraThread();
        if (this.state != SessionState.RUNNING) {
            Logging.m49570d(TAG, "Texture frame captured but camera is no longer running.");
            return;
        }
        if (!this.firstFrameReported) {
            camera1StartTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.constructionTimeNs));
            this.firstFrameReported = true;
        }
        VideoFrame videoFrame2 = new VideoFrame(CameraSession.createTextureBufferWithModifiedTransformMatrix((TextureBufferImpl) videoFrame.getBuffer(), this.info.facing == 1, 0), getFrameOrientation(), videoFrame.getTimestampNs());
        this.events.onFrameCaptured(this, videoFrame2);
        videoFrame2.release();
    }

    private void listenForBytebufferFrames() {
        this.camera.setPreviewCallbackWithBuffer(new C174292());
    }

    private void listenForTextureFrames() {
        this.surfaceTextureHelper.startListening(new C17476a(this, 0));
    }

    private void startCapturing() {
        Logging.m49570d(TAG, "Start capturing");
        checkIsOnCameraThread();
        this.state = SessionState.RUNNING;
        this.camera.setErrorCallback(new Camera.ErrorCallback() { // from class: hms.webrtc.Camera1Session.1
            @Override // android.hardware.Camera.ErrorCallback
            public void onError(int i13, Camera camera) {
                String strM8295h = i13 == 100 ? "Camera server died!" : AbstractC2875y.m8295h(i13, "Camera error: ");
                Logging.m49571e(Camera1Session.TAG, strM8295h);
                Camera1Session.this.stopInternal();
                if (i13 == 2) {
                    Camera1Session.this.events.onCameraDisconnected(Camera1Session.this);
                } else {
                    Camera1Session.this.events.onCameraError(Camera1Session.this, strM8295h);
                }
            }
        });
        if (this.captureToTexture) {
            listenForTextureFrames();
        } else {
            listenForBytebufferFrames();
        }
        try {
            this.camera.startPreview();
        } catch (RuntimeException e5) {
            stopInternal();
            this.events.onCameraError(this, e5.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopInternal() {
        Logging.m49570d(TAG, "Stop internal");
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState == sessionState2) {
            Logging.m49570d(TAG, "Camera is already stopped");
            return;
        }
        this.state = sessionState2;
        this.surfaceTextureHelper.stopListening();
        this.camera.stopPreview();
        this.camera.release();
        this.events.onCameraClosed(this);
        Logging.m49570d(TAG, "Stop done");
    }

    private static void updateCameraParameters(Camera camera, Camera.Parameters parameters, CameraEnumerationAndroid.CaptureFormat captureFormat, Size size, boolean z4) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
        parameters.setPreviewFpsRange(framerateRange.min, framerateRange.max);
        parameters.setPreviewSize(captureFormat.width, captureFormat.height);
        parameters.setPictureSize(size.width, size.height);
        if (!z4) {
            parameters.setPreviewFormat(17);
        }
        if (parameters.isVideoStabilizationSupported()) {
            parameters.setVideoStabilization(true);
        }
        if (supportedFocusModes != null && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
        }
        camera.setParameters(parameters);
    }

    @Override // hms.webrtc.CameraSession
    public void stop() {
        AbstractC17176i.m48509k(this.cameraId, "Stop camera1 session on camera ", TAG);
        checkIsOnCameraThread();
        if (this.state != SessionState.STOPPED) {
            long jNanoTime = System.nanoTime();
            stopInternal();
            camera1StopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
        }
    }
}
