package live.hms.video.media.capturers;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.ProcessLifecycleOwner;
import bc3.AbstractC3006f0;
import bc3.C3058t;
import hms.webrtc.Camera2Session;
import hms.webrtc.CameraEnumerationAndroid;
import hms.webrtc.CameraSession;
import hms.webrtc.CameraVideoCapturer;
import hms.webrtc.CapturerObserver;
import hms.webrtc.Size;
import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.VideoFrame;
import hms.webrtc.VideoSource;
import hn.C17508p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.error.ErrorFactory;
import live.hms.video.error.HMSException;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.capturers.camera.CameraControl;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HmsVideoFrameListener;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HmsCamera;
import live.hms.video.utils.SharedEglContext;
import live.hms.video.utils.VideoFrameToBitmapConverter;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002Z]\b\u0000\u0018\u0000 e2\u00020\u0001:\u0001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0019\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\r2\u0006\u0010/\u001a\u00020,¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u0010!J\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010;\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020:0*H\u0002¢\u0006\u0004\b;\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010N\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bN\u00109\"\u0004\bP\u0010QR$\u0010R\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0016\u0010X\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010OR\u0016\u0010Y\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010OR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u00020`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, m65681d2 = {"Llive/hms/video/media/capturers/HMSCameraCapturer;", "Llive/hms/video/media/capturers/HMSCapturer;", "Landroid/content/Context;", "context", "Lhms/webrtc/VideoSource;", "source", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "settings", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "<init>", "(Landroid/content/Context;Lhms/webrtc/VideoSource;Llive/hms/video/media/settings/HMSVideoTrackSettings;Llive/hms/video/events/AnalyticsEventsService;)V", "newSettings", "Ll83/a0;", "setSettings$lib_release", "(Llive/hms/video/media/settings/HMSVideoTrackSettings;Lq83/d;)Ljava/lang/Object;", "setSettings", "Llive/hms/video/sdk/HMSActionResultListener;", "onAction", "switchCamera", "(Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "face", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sdk/HmsVideoFrameListener;", "videoFrameListener", "addVideoFrameCapturer", "(Llive/hms/video/sdk/HmsVideoFrameListener;)V", "", "deviceId", "givenFace", "(Ljava/lang/String;Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "start", "()V", "stop", "dispose", "Llive/hms/video/media/capturers/camera/CameraControl;", "getCameraControl", "()Llive/hms/video/media/capturers/camera/CameraControl;", "Lhms/webrtc/SurfaceTextureHelper;", "getSurfaceTexture", "()Lhms/webrtc/SurfaceTextureHelper;", "Ll83/k;", "Lhms/webrtc/Size;", "", "getInputResolution", "()Ll83/k;", "fps", "changeInputFps", "(I)V", "Lhms/webrtc/VideoFrame;", "frame", "processFrameAndFireCallback", "(Lhms/webrtc/VideoFrame;)V", "stopCaptureWithTimeout", "", "restartCapture", "()Z", "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat$FramerateRange;", "getClosestSizeAndFps", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lhms/webrtc/VideoSource;", "getSource", "()Lhms/webrtc/VideoSource;", "setSource", "(Lhms/webrtc/VideoSource;)V", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "Llive/hms/video/events/AnalyticsEventsService;", "Llive/hms/video/sdk/HmsVideoFrameListener;", "Lhms/webrtc/CameraVideoCapturer;", "capturer", "Lhms/webrtc/CameraVideoCapturer;", "surTexture", "Lhms/webrtc/SurfaceTextureHelper;", "cameraControls", "Llive/hms/video/media/capturers/camera/CameraControl;", "isStarted", "Z", "setStarted", "(Z)V", "currentCameraFace", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "getCurrentCameraFace", "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "setCurrentCameraFace", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V", "cameraLostWhileActive", "stoppingDeliberately", "live/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1", "appForegroundObserver", "Llive/hms/video/media/capturers/HMSCameraCapturer$appForegroundObserver$1;", "live/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1", "cameraCaptureObserver", "Llive/hms/video/media/capturers/HMSCameraCapturer$cameraCaptureObserver$1;", "Llive/hms/video/utils/HmsCamera;", "hmsCamera", "Llive/hms/video/utils/HmsCamera;", "currentCameraDeviceId", "Ljava/lang/String;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSCameraCapturer implements HMSCapturer {
    private static final String LOCAL_CAMERA_CAPTURER_THREAD = "local-camera-capturer-thread";
    public static final String TAG = "HMSVideoCapturer";
    private final AnalyticsEventsService analyticsEventsService;
    private final HMSCameraCapturer$appForegroundObserver$1 appForegroundObserver;
    private final HMSCameraCapturer$cameraCaptureObserver$1 cameraCaptureObserver;
    private CameraControl cameraControls;
    private volatile boolean cameraLostWhileActive;
    private final CameraVideoCapturer capturer;
    private final Context context;
    private String currentCameraDeviceId;
    private HMSVideoTrackSettings.CameraFacing currentCameraFace;
    private HmsCamera hmsCamera;
    private volatile boolean isStarted;
    private HMSVideoTrackSettings settings;
    private VideoSource source;
    private volatile boolean stoppingDeliberately;
    private final SurfaceTextureHelper surTexture;
    private HmsVideoFrameListener videoFrameListener;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMSVideoTrackSettings.CameraFacing.values().length];
            try {
                iArr[HMSVideoTrackSettings.CameraFacing.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSVideoTrackSettings.CameraFacing.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.capturers.HMSCameraCapturer$switchCamera$2 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.capturers.HMSCameraCapturer", m100430f = "HMSCameraCapturer.kt", m100431l = {233}, m100432m = "switchCamera")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241662 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C241662(InterfaceC30057d<? super C241662> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSCameraCapturer.this.switchCamera(null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.capturers.HMSCameraCapturer$switchCamera$4 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.capturers.HMSCameraCapturer", m100430f = "HMSCameraCapturer.kt", m100431l = {307}, m100432m = "switchCamera")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C241674 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C241674(InterfaceC30057d<? super C241674> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HMSCameraCapturer.this.switchCamera(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [live.hms.video.media.capturers.HMSCameraCapturer$appForegroundObserver$1] */
    /* JADX WARN: Type inference failed for: r7v4, types: [hms.webrtc.CapturerObserver, live.hms.video.media.capturers.HMSCameraCapturer$cameraCaptureObserver$1] */
    public HMSCameraCapturer(Context context, VideoSource source, HMSVideoTrackSettings settings, AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(settings, "settings");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        this.context = context;
        this.source = source;
        this.settings = settings;
        this.analyticsEventsService = analyticsEventsService;
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create(LOCAL_CAMERA_CAPTURER_THREAD, SharedEglContext.INSTANCE.getContext());
        AbstractC22676k.m65749i(surfaceTextureHelperCreate, "create(...)");
        this.surTexture = surfaceTextureHelperCreate;
        this.appForegroundObserver = new DefaultLifecycleObserver() { // from class: live.hms.video.media.capturers.HMSCameraCapturer$appForegroundObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStart(InterfaceC1585g0 owner) {
                AbstractC22676k.m65750j(owner, "owner");
                if (this.this$0.cameraLostWhileActive) {
                    AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSCameraCapturer$appForegroundObserver$1$onStart$1(this.this$0, null), 3);
                }
            }
        };
        ?? r10 = new CapturerObserver() { // from class: live.hms.video.media.capturers.HMSCameraCapturer$cameraCaptureObserver$1
            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStarted(boolean success) {
                this.this$0.getSource().getCapturerObserver().onCapturerStarted(success);
            }

            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStopped() {
                this.this$0.getSource().getCapturerObserver().onCapturerStopped();
            }

            @Override // hms.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame frame) {
                this.this$0.getSource().getCapturerObserver().onFrameCaptured(frame);
                if (this.this$0.videoFrameListener != null) {
                    HMSCameraCapturer hMSCameraCapturer = this.this$0;
                    if (frame != null) {
                        hMSCameraCapturer.processFrameAndFireCallback(frame);
                    }
                }
            }
        };
        this.cameraCaptureObserver = r10;
        HmsCamera hmsCamera = new HmsCamera(context, analyticsEventsService);
        this.hmsCamera = hmsCamera;
        this.currentCameraDeviceId = hmsCamera.getDeviceId(this.settings.getCameraFacing());
        CameraVideoCapturer cameraVideoCapturerCreateCapturer = this.hmsCamera.getEnumerator().createCapturer(this.currentCameraDeviceId, new CameraVideoCapturer.CameraEventsHandler() { // from class: live.hms.video.media.capturers.HMSCameraCapturer.1
            private final String logPrefix;

            {
                this.logPrefix = "DeviceName=" + HMSCameraCapturer.this.currentCameraDeviceId + " CameraVideoCapturer.CameraEventsHandler.";
            }

            public final String getLogPrefix() {
                return this.logPrefix;
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                HMSLogger.m71136d(HMSCameraCapturer.TAG, this.logPrefix + "onCameraClosed");
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
                HMSLogger.m71136d(HMSCameraCapturer.TAG, this.logPrefix + "onCameraDisconnected");
                if (!HMSCameraCapturer.this.getIsStarted() || HMSCameraCapturer.this.stoppingDeliberately) {
                    return;
                }
                HMSCameraCapturer.this.cameraLostWhileActive = true;
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String errorDescription) {
                HMSLogger.m71137e(HMSCameraCapturer.TAG, this.logPrefix + "onCameraError: " + errorDescription);
                if (!HMSCameraCapturer.this.getIsStarted() || HMSCameraCapturer.this.stoppingDeliberately) {
                    return;
                }
                HMSCameraCapturer.this.cameraLostWhileActive = true;
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String errorDescription) {
                HMSLogger.m71136d(HMSCameraCapturer.TAG, this.logPrefix + "onCameraFreezed: " + errorDescription);
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String cameraName) {
                HMSLogger.m71136d(HMSCameraCapturer.TAG, this.logPrefix + "onCameraOpening: " + cameraName);
            }

            @Override // hms.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
                HMSLogger.m71136d(HMSCameraCapturer.TAG, this.logPrefix + "onFirstFrameAvailable");
            }
        }, new C17508p(this, 27));
        this.capturer = cameraVideoCapturerCreateCapturer;
        cameraVideoCapturerCreateCapturer.initialize(surfaceTextureHelperCreate, context, r10);
        new Handler(Looper.getMainLooper()).post(new RunnableC24170a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(HMSCameraCapturer this$0, CameraSession cameraSession) {
        AbstractC22676k.m65750j(this$0, "this$0");
        Camera2Session camera2Session = cameraSession instanceof Camera2Session ? (Camera2Session) cameraSession : null;
        if (camera2Session != null) {
            if (this$0.cameraControls == null) {
                this$0.cameraControls = new CameraControl(this$0.surTexture.getHandler(), this$0.context, this$0.analyticsEventsService);
            }
            CameraControl cameraControl = this$0.cameraControls;
            if (cameraControl != null) {
                cameraControl.onCameraSessionUpdate$lib_release(camera2Session);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(HMSCameraCapturer this$0) {
        Object objM107888l;
        AbstractC22676k.m65750j(this$0, "this$0");
        try {
            ProcessLifecycleOwner.f6173I.f6175F.mo4986a(this$0.appForegroundObserver);
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            HMSLogger.m71137e(TAG, "Could not register foreground observer: " + thM68037a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispose$lambda$11(HMSCameraCapturer this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        try {
            ProcessLifecycleOwner.f6173I.f6175F.mo4988d(this$0.appForegroundObserver);
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    private final C23465k getClosestSizeAndFps() throws HMSException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = this.hmsCamera.getEnumerator().getSupportedFormats(this.currentCameraDeviceId);
        AbstractC22676k.m65749i(supportedFormats, "getSupportedFormats(...)");
        boolean z4 = false;
        for (CameraEnumerationAndroid.CaptureFormat captureFormat : supportedFormats) {
            int i13 = captureFormat.height;
            int i14 = captureFormat.width;
            if (i13 > i14) {
                z4 = true;
            }
            arrayList.add(new Size(i14, i13));
            CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = captureFormat.framerate;
            arrayList2.add(new CameraEnumerationAndroid.CaptureFormat.FramerateRange(framerateRange.min, framerateRange.max));
        }
        if (arrayList.isEmpty() || arrayList2.isEmpty()) {
            HMSException hMSExceptionCantAccessCaptureDevice$default = ErrorFactory.TracksErrors.CantAccessCaptureDevice$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, "camera", "Camera occupied. Sizes was " + arrayList + " and fpsRanges are " + arrayList2 + " both must be non-empty.", false, null, null, 56, null);
            this.analyticsEventsService.queue(AnalyticsEventFactory.INSTANCE.videoPublishFail(hMSExceptionCantAccessCaptureDevice$default)).flush();
            throw hMSExceptionCantAccessCaptureDevice$default;
        }
        HMSLogger.m71136d(TAG, "[Device=" + this.currentCameraDeviceId + "] Supported Sizes: " + arrayList);
        HMSLogger.m71136d(TAG, "[Device=" + this.currentCameraDeviceId + "] Supported FrameRate Ranges: " + arrayList2);
        int width = this.settings.getResolution().getWidth();
        int height = this.settings.getResolution().getHeight();
        if (!z4) {
            width = Math.max(this.settings.getResolution().getWidth(), this.settings.getResolution().getHeight());
            height = Math.min(this.settings.getResolution().getWidth(), this.settings.getResolution().getHeight());
        }
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(arrayList, width, height);
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(arrayList2, this.settings.getMaxFrameRate());
        HMSLogger.m71136d(TAG, "[Device=" + this.currentCameraDeviceId + "] Using Size=" + closestSupportedSize + " FrameRate Range=" + closestSupportedFramerateRange);
        return new C23465k(closestSupportedSize, closestSupportedFramerateRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFrameAndFireCallback(VideoFrame frame) {
        HmsVideoFrameListener hmsVideoFrameListener;
        Bitmap bitmapConvertToBitmap$default = VideoFrameToBitmapConverter.Companion.convertToBitmap$default(VideoFrameToBitmapConverter.INSTANCE, frame, false, 2, null);
        if (bitmapConvertToBitmap$default != null && (hmsVideoFrameListener = this.videoFrameListener) != null) {
            hmsVideoFrameListener.onFrameCaptured(bitmapConvertToBitmap$default);
        }
        this.videoFrameListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean restartCapture() throws HMSException {
        Object objM107888l;
        if (this.stoppingDeliberately) {
            return false;
        }
        stopCaptureWithTimeout();
        C23465k closestSizeAndFps = getClosestSizeAndFps();
        Size size = (Size) closestSizeAndFps.f92937w;
        try {
            this.capturer.startCapture(size.width, size.height, ((CameraEnumerationAndroid.CaptureFormat.FramerateRange) closestSizeAndFps.f92938x).max);
            objM107888l = C23454a0.f92919a;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = objM107888l instanceof C23467m;
        boolean z13 = !z4;
        if (!z4) {
            this.isStarted = true;
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            this.isStarted = false;
            HMSLogger.m71137e(TAG, "restartCapture: startCapture failed: " + thM68037a);
        }
        return z13;
    }

    private final void stopCaptureWithTimeout() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future<?> futureSubmit = executorServiceNewSingleThreadExecutor.submit(new RunnableC24170a(this, 2));
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (TimeoutException unused) {
            futureSubmit.cancel(true);
        } catch (Exception e5) {
            HMSLogger.INSTANCE.m71141w(TAG, "stopCaptureWithTimeout: stopCapture errored: " + e5);
        } finally {
            executorServiceNewSingleThreadExecutor.shutdownNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopCaptureWithTimeout$lambda$6(HMSCameraCapturer this$0) throws InterruptedException {
        AbstractC22676k.m65750j(this$0, "this$0");
        this$0.capturer.stopCapture();
    }

    public final void addVideoFrameCapturer(HmsVideoFrameListener videoFrameListener) {
        AbstractC22676k.m65750j(videoFrameListener, "videoFrameListener");
        this.videoFrameListener = videoFrameListener;
    }

    public final void changeInputFps(int fps) {
        this.capturer.changeCaptureFormat(this.settings.getResolution().getWidth(), this.settings.getResolution().getHeight(), fps);
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void dispose() {
        HMSCapturer.DefaultImpls.dispose(this);
        new Handler(Looper.getMainLooper()).post(new RunnableC24170a(this, 1));
        try {
            this.source.dispose();
            this.surTexture.stopListening();
            this.surTexture.dispose();
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX INFO: renamed from: getCameraControl, reason: from getter */
    public final CameraControl getCameraControls() {
        return this.cameraControls;
    }

    public final Context getContext() {
        return this.context;
    }

    public final HMSVideoTrackSettings.CameraFacing getCurrentCameraFace() {
        return this.currentCameraFace;
    }

    public final C23465k getInputResolution() {
        return new C23465k(new Size(this.settings.getResolution().getWidth(), this.settings.getResolution().getHeight()), Integer.valueOf(this.settings.getMaxFrameRate()));
    }

    public final VideoSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: getSurfaceTexture, reason: from getter */
    public final SurfaceTextureHelper getSurTexture() {
        return this.surTexture;
    }

    /* JADX INFO: renamed from: isStarted, reason: from getter */
    public final boolean getIsStarted() {
        return this.isStarted;
    }

    public final void setCurrentCameraFace(HMSVideoTrackSettings.CameraFacing cameraFacing) {
        this.currentCameraFace = cameraFacing;
    }

    public final Object setSettings$lib_release(HMSVideoTrackSettings hMSVideoTrackSettings, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws HMSException {
        Object objSwitchCamera;
        C23454a0 c23454a0 = C23454a0.f92919a;
        HMSVideoTrackSettings hMSVideoTrackSettings2 = this.settings;
        this.settings = hMSVideoTrackSettings;
        if (!AbstractC22676k.m65745e(hMSVideoTrackSettings.getResolution(), hMSVideoTrackSettings2.getResolution()) || hMSVideoTrackSettings.getMaxFrameRate() != hMSVideoTrackSettings2.getMaxFrameRate()) {
            C23465k closestSizeAndFps = getClosestSizeAndFps();
            Size size = (Size) closestSizeAndFps.f92937w;
            CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange = (CameraEnumerationAndroid.CaptureFormat.FramerateRange) closestSizeAndFps.f92938x;
            if (this.isStarted) {
                this.capturer.changeCaptureFormat(size.width, size.height, framerateRange.max);
            } else {
                this.capturer.startCapture(size.width, size.height, framerateRange.max);
                this.isStarted = true;
            }
        }
        return (hMSVideoTrackSettings.getCameraFacing() == hMSVideoTrackSettings2.getCameraFacing() || (objSwitchCamera = switchCamera(hMSVideoTrackSettings.getCameraFacing(), null, interfaceC30057d)) != EnumC31071a.f128113w) ? c23454a0 : objSwitchCamera;
    }

    public final void setSource(VideoSource videoSource) {
        AbstractC22676k.m65750j(videoSource, "<set-?>");
        this.source = videoSource;
    }

    public final void setStarted(boolean z4) {
        this.isStarted = z4;
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void start() throws HMSException {
        this.stoppingDeliberately = false;
        this.cameraLostWhileActive = false;
        C23465k closestSizeAndFps = getClosestSizeAndFps();
        Size size = (Size) closestSizeAndFps.f92937w;
        this.capturer.startCapture(size.width, size.height, ((CameraEnumerationAndroid.CaptureFormat.FramerateRange) closestSizeAndFps.f92938x).max);
        this.isStarted = true;
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void stop() {
        this.stoppingDeliberately = true;
        stopCaptureWithTimeout();
        this.isStarted = false;
        this.cameraLostWhileActive = false;
    }

    public final Object switchCamera(HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        HMSVideoTrackSettings.CameraFacing cameraFacing;
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.settings.getCameraFacing().ordinal()];
        if (i13 == 1) {
            cameraFacing = HMSVideoTrackSettings.CameraFacing.BACK;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cameraFacing = HMSVideoTrackSettings.CameraFacing.FRONT;
        }
        Object objSwitchCamera = switchCamera(cameraFacing, hMSActionResultListener, interfaceC30057d);
        return objSwitchCamera == EnumC31071a.f128113w ? objSwitchCamera : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object switchCamera(HMSVideoTrackSettings.CameraFacing cameraFacing, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C241662 c241662;
        if (interfaceC30057d instanceof C241662) {
            c241662 = (C241662) interfaceC30057d;
            int i13 = c241662.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241662.label = i13 - Integer.MIN_VALUE;
            } else {
                c241662 = new C241662(interfaceC30057d);
            }
        } else {
            c241662 = new C241662(interfaceC30057d);
        }
        Object obj = c241662.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c241662.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                String deviceId = this.hmsCamera.getDeviceId(cameraFacing);
                c241662.label = 1;
                if (switchCamera(deviceId, cameraFacing, hMSActionResultListener, c241662) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object switchCamera(final String str, HMSVideoTrackSettings.CameraFacing cameraFacing, final HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C241674 c241674;
        HMSVideoTrackSettings.CameraFacing cameraFaceFromId = cameraFacing;
        if (interfaceC30057d instanceof C241674) {
            c241674 = (C241674) interfaceC30057d;
            int i13 = c241674.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c241674.label = i13 - Integer.MIN_VALUE;
            } else {
                c241674 = new C241674(interfaceC30057d);
            }
        } else {
            c241674 = new C241674(interfaceC30057d);
        }
        C241674 c241675 = c241674;
        Object objM8817m = c241675.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c241675.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8817m);
            if (AbstractC22676k.m65745e(str, this.currentCameraDeviceId)) {
                HMSLogger.INSTANCE.m71141w(TAG, AbstractC2875y.m8304q(new StringBuilder("switchCamera: Ignoring request to switch from "), this.currentCameraDeviceId, " -> ", str));
                return c23454a0;
            }
            this.currentCameraFace = cameraFaceFromId;
            if (cameraFaceFromId == null) {
                cameraFaceFromId = this.hmsCamera.getCameraFaceFromId(str);
            }
            final HMSVideoTrackSettings.CameraFacing cameraFacing2 = cameraFaceFromId;
            if (cameraFacing2 == null) {
                HMSException hMSExceptionGenericTrack$default = ErrorFactory.TracksErrors.GenericTrack$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, AbstractC11895b.m31996o("It cannot be determined if ", str, " is front facing or back facing. Camera was not switched."), null, null, false, 12, null);
                if (hMSActionResultListener != null) {
                    hMSActionResultListener.onError(hMSExceptionGenericTrack$default);
                    return c23454a0;
                }
            } else {
                final C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                this.capturer.switchCamera(new CameraVideoCapturer.CameraSwitchHandler() { // from class: live.hms.video.media.capturers.HMSCameraCapturer.switchCamera.5
                    @Override // hms.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchDone(boolean isFrontCamera) {
                        HMSCameraCapturer.this.settings.setCameraFacing(cameraFacing2);
                        HMSCameraCapturer.this.currentCameraDeviceId = str;
                        HMSActionResultListener hMSActionResultListener2 = hMSActionResultListener;
                        if (hMSActionResultListener2 != null) {
                            hMSActionResultListener2.onSuccess();
                        }
                        ((C3058t) c3058tM8707a).m8807L(null);
                    }

                    @Override // hms.webrtc.CameraVideoCapturer.CameraSwitchHandler
                    public void onCameraSwitchError(String errorDescription) {
                        AbstractC22676k.m65750j(errorDescription, "errorDescription");
                        HMSException hMSExceptionGenericTrack$default2 = ErrorFactory.TracksErrors.GenericTrack$default(ErrorFactory.TracksErrors.INSTANCE, ErrorFactory.Action.TRACK, errorDescription, null, null, false, 28, null);
                        hMSExceptionGenericTrack$default2.setTerminal(false);
                        HMSActionResultListener hMSActionResultListener2 = hMSActionResultListener;
                        if (hMSActionResultListener2 != null) {
                            hMSActionResultListener2.onError(hMSExceptionGenericTrack$default2);
                        }
                        ((C3058t) c3058tM8707a).m8807L(errorDescription);
                    }
                }, str);
                c241675.label = 1;
                objM8817m = c3058tM8707a.m8817m(c241675);
                if (objM8817m == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM8817m);
        String str2 = (String) objM8817m;
        if (str2 != null) {
            HMSLogger.m71137e(TAG, "Implement onAction to be made aware of these. ".concat(str2));
        }
        return c23454a0;
    }
}
