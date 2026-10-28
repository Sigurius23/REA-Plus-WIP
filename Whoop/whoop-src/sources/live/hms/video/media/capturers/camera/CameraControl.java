package live.hms.video.media.capturers.camera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.media.ExifInterface;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import hms.webrtc.Camera2Session;
import hms.webrtc.CameraEnumerationAndroid;
import hms.webrtc.RendererCommon;
import io.sentry.RunnableC20277c7;
import io.sentry.android.core.RunnableC20151r0;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.connection.degredation.C24117a;
import live.hms.video.error.ErrorFactory;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.events.AnalyticsEventsService;
import live.hms.video.media.capturers.camera.utils.ImageCaptureModel;
import live.hms.video.sdk.HmsTypedActionResultListener;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p031b9.RunnableC2833g0;
import p463rj.AbstractC31479j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.C30065l;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import va3.AbstractC35854l;
import x83.AbstractC38093j;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u008a\u00012\u00020\u0001:\u0002\u008a\u0001B#\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0012J\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001dJ\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010\u001aJ\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J7\u0010*\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J)\u00105\u001a\u00020\f2\u0006\u00102\u001a\u0002012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f03¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u0012J\r\u00108\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0012J\u0015\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010\u0012J!\u0010?\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00152\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010G\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010L\u001a\u00020J2\u0006\u0010I\u001a\u00020\u00152\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020-H\u0082@¢\u0006\u0004\bN\u0010OR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001b\u0010{\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010u\u001a\u0004\bz\u0010RR\u0014\u0010}\u001a\u00020|8\u0002X\u0082D¢\u0006\u0006\n\u0004\b}\u0010~R+\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00158\u0002X\u0082D¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0087\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/CameraControl;", "", "Landroid/os/Handler;", "cameraHandler", "Landroid/content/Context;", "context", "Llive/hms/video/events/AnalyticsEventsService;", "analyticsEventsService", "<init>", "(Landroid/os/Handler;Landroid/content/Context;Llive/hms/video/events/AnalyticsEventsService;)V", "Lhms/webrtc/Camera2Session;", "session", "Ll83/a0;", "onCameraSessionUpdate$lib_release", "(Lhms/webrtc/Camera2Session;)V", "onCameraSessionUpdate", "", "isZoomSupported", "()Z", "isManualFocusSupported", "Landroid/util/Range;", "", "getManualFocusRange", "()Landroid/util/Range;", "range", "setManualFocus", "(F)V", "isTapToFocusSupported", "getMaxZoom", "()F", "getMinZoom", "zoomValue", "setZoom", "resetZoom", "()V", "viewX", "viewY", "", "viewWidth", "viewHeight", "Lhms/webrtc/RendererCommon$ScalingType;", "scalingType", "setTapToFocusAt", "(FFIILhms/webrtc/RendererCommon$ScalingType;)V", "Llive/hms/video/sdk/HmsTypedActionResultListener;", "Llive/hms/video/media/capturers/camera/utils/ImageCaptureModel;", "onImageCapture", "captureImageAtMaxResolution", "(Llive/hms/video/sdk/HmsTypedActionResultListener;)V", "Ljava/io/File;", "savePath", "Lkotlin/Function1;", "callback", "captureImageAtMaxSupportedResolution", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V", "isFlashSupported", "isFlashEnabled", "enable", "setFlash", "(Z)V", "isValidSession", "", "currentCameraIndex", "setZoomInternal", "(FLjava/lang/String;)V", "Landroid/hardware/camera2/CaptureResult;", "result", "autoFocusCallbackResult", "(Landroid/hardware/camera2/CaptureResult;)V", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "getMaxZoomInternal", "(Landroid/hardware/camera2/CameraCharacteristics;)F", "ratio", "Landroid/graphics/Rect;", "zoomSensorRect", "cropRegionForZoom", "(FLandroid/graphics/Rect;)Landroid/graphics/Rect;", "takePictureInternal", "(Lq83/d;)Ljava/lang/Object;", "Landroid/os/Handler;", "getCameraHandler", "()Landroid/os/Handler;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Llive/hms/video/events/AnalyticsEventsService;", "getAnalyticsEventsService$lib_release", "()Llive/hms/video/events/AnalyticsEventsService;", "Landroid/hardware/camera2/CameraCaptureSession;", "currentCameraSession", "Landroid/hardware/camera2/CameraCaptureSession;", "getCurrentCameraSession", "()Landroid/hardware/camera2/CameraCaptureSession;", "setCurrentCameraSession", "(Landroid/hardware/camera2/CameraCaptureSession;)V", "Landroid/hardware/camera2/CaptureRequest$Builder;", "captureRequestBuilder", "Landroid/hardware/camera2/CaptureRequest$Builder;", "getCaptureRequestBuilder", "()Landroid/hardware/camera2/CaptureRequest$Builder;", "setCaptureRequestBuilder", "(Landroid/hardware/camera2/CaptureRequest$Builder;)V", "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;", "captureFormat", "Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;", "getCaptureFormat", "()Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;", "setCaptureFormat", "(Lhms/webrtc/CameraEnumerationAndroid$CaptureFormat;)V", "Lmc3/a;", "cameraCaptureMutex", "Lmc3/a;", "IMAGE_BUFFER_SIZE", "I", "Landroid/os/HandlerThread;", "imageReaderThread$delegate", "Ll83/h;", "getImageReaderThread", "()Landroid/os/HandlerThread;", "imageReaderThread", "imageReaderHandler$delegate", "getImageReaderHandler", "imageReaderHandler", "", "IMAGE_CAPTURE_TIMEOUT_MILLIS", "J", "Landroid/media/ImageReader;", "imageReader", "Landroid/media/ImageReader;", "getImageReader", "()Landroid/media/ImageReader;", "setImageReader", "(Landroid/media/ImageReader;)V", "ZOOM_DEFAULT_VALUE", "F", "lastZoom", "lastLensDistance", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class CameraControl {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "CameraControl";
    private final int IMAGE_BUFFER_SIZE;
    private final long IMAGE_CAPTURE_TIMEOUT_MILLIS;
    private final float ZOOM_DEFAULT_VALUE;
    private final AnalyticsEventsService analyticsEventsService;
    private final InterfaceC25435a cameraCaptureMutex;
    private final Handler cameraHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private CaptureRequest.Builder captureRequestBuilder;
    private final Context context;
    private CameraCaptureSession currentCameraSession;
    private ImageReader imageReader;

    /* JADX INFO: renamed from: imageReaderHandler$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h imageReaderHandler;

    /* JADX INFO: renamed from: imageReaderThread$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h imageReaderThread;
    private float lastLensDistance;
    private float lastZoom;

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/media/capturers/camera/CameraControl$Companion;", "", "<init>", "()V", "TAG", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxResolution$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxResolution$1", m100430f = "CameraControl.kt", m100431l = {722, 394}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241711 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HmsTypedActionResultListener<ImageCaptureModel> $onImageCapture;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241711(HmsTypedActionResultListener<ImageCaptureModel> hmsTypedActionResultListener, InterfaceC30057d<? super C241711> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$onImageCapture = hmsTypedActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C241711 c241711 = CameraControl.this.new C241711(this.$onImageCapture, interfaceC30057d);
            c241711.L$0 = obj;
            return c241711;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241711) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x007d  */
        /* JADX WARN: Code duplicated, block: B:30:0x007f  */
        /* JADX WARN: Code duplicated, block: B:38:0x008f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #4 {all -> 0x008d, blocks: (B:27:0x0079, B:31:0x0080, B:33:0x0086, B:39:0x0091, B:42:0x00a2, B:48:0x00ae, B:49:0x00b1, B:26:0x0075, B:41:0x009f, B:46:0x00ac), top: B:60:0x0075, inners: #2, #3 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            HmsTypedActionResultListener<ImageCaptureModel> hmsTypedActionResultListener;
            InterfaceC25435a interfaceC25435a;
            CameraControl cameraControl;
            HmsTypedActionResultListener<ImageCaptureModel> hmsTypedActionResultListener2;
            InterfaceC25435a interfaceC25435a2;
            Object objM107888l;
            Object obj2;
            ImageCaptureModel imageCaptureModel;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
                    InterfaceC25435a interfaceC25435a3 = CameraControl.this.cameraCaptureMutex;
                    HmsTypedActionResultListener<ImageCaptureModel> hmsTypedActionResultListener3 = this.$onImageCapture;
                    CameraControl cameraControl2 = CameraControl.this;
                    this.L$0 = interfaceC2994c0;
                    this.L$1 = interfaceC25435a3;
                    this.L$2 = hmsTypedActionResultListener3;
                    this.L$3 = cameraControl2;
                    this.label = 1;
                    if (interfaceC25435a3.mo68211b(this) != enumC31071a) {
                        hmsTypedActionResultListener = hmsTypedActionResultListener3;
                        interfaceC25435a = interfaceC25435a3;
                        cameraControl = cameraControl2;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hmsTypedActionResultListener2 = (HmsTypedActionResultListener) this.L$1;
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        objM107888l = (ImageCaptureModel) obj;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            objM107888l = AbstractC34132o.m107888l(th);
                        } catch (Throwable th4) {
                            interfaceC25435a2.mo68214i(null);
                            throw th4;
                        }
                    }
                    if (objM107888l instanceof C23467m) {
                        obj2 = null;
                    } else {
                        obj2 = objM107888l;
                    }
                    imageCaptureModel = (ImageCaptureModel) obj2;
                    if (!(objM107888l instanceof C23467m) && C23468n.m68037a(objM107888l) != null) {
                        hmsTypedActionResultListener2.onError(ErrorFactory.INSTANCE.ImageCaptureException(C23468n.m68037a(objM107888l)));
                    } else if (imageCaptureModel == null) {
                        hmsTypedActionResultListener2.onError(ErrorFactory.INSTANCE.ImageCaptureException(C23468n.m68037a(objM107888l)));
                    } else {
                        try {
                            hmsTypedActionResultListener2.onSuccess(imageCaptureModel);
                            imageCaptureModel.close();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                AbstractC35854l.m113829i(imageCaptureModel, th5);
                                throw th6;
                            }
                        }
                    }
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                cameraControl = (CameraControl) this.L$3;
                hmsTypedActionResultListener = (HmsTypedActionResultListener) this.L$2;
                interfaceC25435a = (InterfaceC25435a) this.L$1;
                AbstractC34132o.m107864I(obj);
                this.L$0 = interfaceC25435a;
                this.L$1 = hmsTypedActionResultListener;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = cameraControl.takePictureInternal(this);
                if (obj != enumC31071a) {
                    hmsTypedActionResultListener2 = hmsTypedActionResultListener;
                    interfaceC25435a2 = interfaceC25435a;
                    objM107888l = (ImageCaptureModel) obj;
                    if (objM107888l instanceof C23467m) {
                        obj2 = null;
                    } else {
                        obj2 = objM107888l;
                    }
                    imageCaptureModel = (ImageCaptureModel) obj2;
                    if (!(objM107888l instanceof C23467m)) {
                        if (imageCaptureModel == null) {
                            hmsTypedActionResultListener2.onError(ErrorFactory.INSTANCE.ImageCaptureException(C23468n.m68037a(objM107888l)));
                        } else {
                            hmsTypedActionResultListener2.onSuccess(imageCaptureModel);
                            imageCaptureModel.close();
                        }
                    } else if (imageCaptureModel == null) {
                        hmsTypedActionResultListener2.onError(ErrorFactory.INSTANCE.ImageCaptureException(C23468n.m68037a(objM107888l)));
                    } else {
                        hmsTypedActionResultListener2.onSuccess(imageCaptureModel);
                        imageCaptureModel.close();
                    }
                    interfaceC25435a2.mo68214i(null);
                    return C23454a0.f92919a;
                }
                return enumC31071a;
            } catch (Throwable th7) {
                th = th7;
                hmsTypedActionResultListener2 = hmsTypedActionResultListener;
                interfaceC25435a2 = interfaceC25435a;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxSupportedResolution$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.capturers.camera.CameraControl$captureImageAtMaxSupportedResolution$1", m100430f = "CameraControl.kt", m100431l = {722, 422, 423}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241721 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Function1 $callback;
        final /* synthetic */ File $savePath;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241721(Function1 function1, File file, InterfaceC30057d<? super C241721> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$callback = function1;
            this.$savePath = file;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C241721 c241721 = CameraControl.this.new C241721(this.$callback, this.$savePath, interfaceC30057d);
            c241721.L$0 = obj;
            return c241721;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241721) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d8 A[Catch: all -> 0x002f, TryCatch #6 {all -> 0x002f, blocks: (B:8:0x002a, B:33:0x00cc, B:35:0x00d8, B:37:0x00e4), top: B:75:0x002a }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00e4 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #6 {all -> 0x002f, blocks: (B:8:0x002a, B:33:0x00cc, B:35:0x00d8, B:37:0x00e4), top: B:75:0x002a }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0117 A[Catch: all -> 0x013b, TRY_LEAVE, TryCatch #4 {all -> 0x013b, blocks: (B:49:0x0113, B:51:0x0117, B:56:0x0137, B:59:0x013d, B:48:0x010f, B:53:0x011d), top: B:72:0x010f, inners: #2 }] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25435a interfaceC25435a;
            File file;
            Function1 function1;
            CameraControl cameraControl;
            CameraControl cameraControl2;
            Function1 function2;
            InterfaceC25435a interfaceC25435a2;
            Closeable closeable;
            Closeable closeable2;
            Throwable th3;
            ImageCaptureModel imageCaptureModel;
            Context context;
            File file2;
            ImageCaptureModel imageCaptureModel2;
            Object objM107888l;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
                    InterfaceC25435a interfaceC25435a3 = CameraControl.this.cameraCaptureMutex;
                    Function1 function3 = this.$callback;
                    CameraControl cameraControl3 = CameraControl.this;
                    File file3 = this.$savePath;
                    this.L$0 = interfaceC2994c0;
                    this.L$1 = interfaceC25435a3;
                    this.L$2 = function3;
                    this.L$3 = cameraControl3;
                    this.L$4 = file3;
                    this.label = 1;
                    if (interfaceC25435a3.mo68211b(this) != enumC31071a) {
                        interfaceC25435a = interfaceC25435a3;
                        file = file3;
                        function1 = function3;
                        cameraControl = cameraControl3;
                    }
                    return enumC31071a;
                }
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        imageCaptureModel2 = (ImageCaptureModel) this.L$5;
                        closeable2 = (Closeable) this.L$4;
                        file2 = (File) this.L$3;
                        cameraControl2 = (CameraControl) this.L$2;
                        function2 = (Function1) this.L$1;
                        interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                        try {
                            AbstractC34132o.m107864I(obj);
                            if (AbstractC38093j.m122039m(file2).equals("jpg") || AbstractC38093j.m122039m(file2).equals("jpeg")) {
                                ExifInterface exifInterface = new ExifInterface(file2.getAbsolutePath());
                                exifInterface.setAttribute("Orientation", String.valueOf(imageCaptureModel2.getOrientation()));
                                exifInterface.saveAttributes();
                            }
                            AbstractC35854l.m113829i(closeable2, null);
                            objM107888l = c23454a0;
                            if ((objM107888l instanceof C23467m) && C23468n.m68037a(objM107888l) != null) {
                                try {
                                    AnalyticsEventsService analyticsEventsService = cameraControl2.getAnalyticsEventsService();
                                    AnalyticsEventFactory analyticsEventFactory = AnalyticsEventFactory.INSTANCE;
                                    Throwable thM68037a = C23468n.m68037a(objM107888l);
                                    AbstractC22676k.m65747g(thM68037a);
                                    analyticsEventsService.queue(analyticsEventFactory.cameraCapturingException(thM68037a)).flush();
                                } catch (Throwable th4) {
                                    AbstractC34132o.m107888l(th4);
                                }
                            }
                            function2.invoke(Boolean.valueOf(!(objM107888l instanceof C23467m)));
                            interfaceC25435a2.mo68214i(null);
                            return c23454a0;
                        } catch (Throwable th5) {
                            th3 = th5;
                            try {
                                throw th3;
                            } catch (Throwable th6) {
                                AbstractC35854l.m113829i(closeable2, th3);
                                throw th6;
                            }
                        }
                    }
                    file = (File) this.L$3;
                    cameraControl2 = (CameraControl) this.L$2;
                    function2 = (Function1) this.L$1;
                    interfaceC25435a2 = (InterfaceC25435a) this.L$0;
                    try {
                        AbstractC34132o.m107864I(obj);
                        closeable = (Closeable) obj;
                        try {
                            imageCaptureModel = (ImageCaptureModel) closeable;
                            context = cameraControl2.getContext();
                            this.L$0 = interfaceC25435a2;
                            this.L$1 = function2;
                            this.L$2 = cameraControl2;
                            this.L$3 = file;
                            this.L$4 = closeable;
                            this.L$5 = imageCaptureModel;
                            this.label = 3;
                            if (CameraExtKt.saveResult(context, imageCaptureModel, file, this) != enumC31071a) {
                                file2 = file;
                                imageCaptureModel2 = imageCaptureModel;
                                closeable2 = closeable;
                                if (AbstractC38093j.m122039m(file2).equals("jpg")) {
                                    ExifInterface exifInterface2 = new ExifInterface(file2.getAbsolutePath());
                                    exifInterface2.setAttribute("Orientation", String.valueOf(imageCaptureModel2.getOrientation()));
                                    exifInterface2.saveAttributes();
                                } else {
                                    ExifInterface exifInterface3 = new ExifInterface(file2.getAbsolutePath());
                                    exifInterface3.setAttribute("Orientation", String.valueOf(imageCaptureModel2.getOrientation()));
                                    exifInterface3.saveAttributes();
                                }
                                AbstractC35854l.m113829i(closeable2, null);
                                objM107888l = c23454a0;
                                if (objM107888l instanceof C23467m) {
                                    AnalyticsEventsService analyticsEventsService2 = cameraControl2.getAnalyticsEventsService();
                                    AnalyticsEventFactory analyticsEventFactory2 = AnalyticsEventFactory.INSTANCE;
                                    Throwable thM68037a2 = C23468n.m68037a(objM107888l);
                                    AbstractC22676k.m65747g(thM68037a2);
                                    analyticsEventsService2.queue(analyticsEventFactory2.cameraCapturingException(thM68037a2)).flush();
                                }
                                function2.invoke(Boolean.valueOf(!(objM107888l instanceof C23467m)));
                                interfaceC25435a2.mo68214i(null);
                                return c23454a0;
                            }
                            return enumC31071a;
                        } catch (Throwable th7) {
                            closeable2 = closeable;
                            th3 = th7;
                            throw th3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        try {
                            objM107888l = AbstractC34132o.m107888l(th);
                            if (objM107888l instanceof C23467m) {
                                AnalyticsEventsService analyticsEventsService3 = cameraControl2.getAnalyticsEventsService();
                                AnalyticsEventFactory analyticsEventFactory3 = AnalyticsEventFactory.INSTANCE;
                                Throwable thM68037a3 = C23468n.m68037a(objM107888l);
                                AbstractC22676k.m65747g(thM68037a3);
                                analyticsEventsService3.queue(analyticsEventFactory3.cameraCapturingException(thM68037a3)).flush();
                            }
                            function2.invoke(Boolean.valueOf(!(objM107888l instanceof C23467m)));
                            interfaceC25435a2.mo68214i(null);
                            return c23454a0;
                        } catch (Throwable th9) {
                            interfaceC25435a2.mo68214i(null);
                            throw th9;
                        }
                    }
                }
                file = (File) this.L$4;
                cameraControl = (CameraControl) this.L$3;
                function1 = (Function1) this.L$2;
                interfaceC25435a = (InterfaceC25435a) this.L$1;
                AbstractC34132o.m107864I(obj);
                this.L$0 = interfaceC25435a;
                this.L$1 = function1;
                this.L$2 = cameraControl;
                this.L$3 = file;
                this.L$4 = null;
                this.label = 2;
                obj = cameraControl.takePictureInternal(this);
                if (obj != enumC31071a) {
                    cameraControl2 = cameraControl;
                    function2 = function1;
                    interfaceC25435a2 = interfaceC25435a;
                    closeable = (Closeable) obj;
                    imageCaptureModel = (ImageCaptureModel) closeable;
                    context = cameraControl2.getContext();
                    this.L$0 = interfaceC25435a2;
                    this.L$1 = function2;
                    this.L$2 = cameraControl2;
                    this.L$3 = file;
                    this.L$4 = closeable;
                    this.L$5 = imageCaptureModel;
                    this.label = 3;
                    if (CameraExtKt.saveResult(context, imageCaptureModel, file, this) != enumC31071a) {
                        file2 = file;
                        imageCaptureModel2 = imageCaptureModel;
                        closeable2 = closeable;
                        if (AbstractC38093j.m122039m(file2).equals("jpg")) {
                            ExifInterface exifInterface4 = new ExifInterface(file2.getAbsolutePath());
                            exifInterface4.setAttribute("Orientation", String.valueOf(imageCaptureModel2.getOrientation()));
                            exifInterface4.saveAttributes();
                        } else {
                            ExifInterface exifInterface5 = new ExifInterface(file2.getAbsolutePath());
                            exifInterface5.setAttribute("Orientation", String.valueOf(imageCaptureModel2.getOrientation()));
                            exifInterface5.saveAttributes();
                        }
                        AbstractC35854l.m113829i(closeable2, null);
                        objM107888l = c23454a0;
                        if (objM107888l instanceof C23467m) {
                            AnalyticsEventsService analyticsEventsService4 = cameraControl2.getAnalyticsEventsService();
                            AnalyticsEventFactory analyticsEventFactory4 = AnalyticsEventFactory.INSTANCE;
                            Throwable thM68037a4 = C23468n.m68037a(objM107888l);
                            AbstractC22676k.m65747g(thM68037a4);
                            analyticsEventsService4.queue(analyticsEventFactory4.cameraCapturingException(thM68037a4)).flush();
                        }
                        function2.invoke(Boolean.valueOf(!(objM107888l instanceof C23467m)));
                        interfaceC25435a2.mo68214i(null);
                        return c23454a0;
                    }
                }
                return enumC31071a;
            } catch (Throwable th10) {
                th = th10;
                cameraControl2 = cameraControl;
                function2 = function1;
                interfaceC25435a2 = interfaceC25435a;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
    }

    public CameraControl(Handler handler, Context context, AnalyticsEventsService analyticsEventsService) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(analyticsEventsService, "analyticsEventsService");
        this.cameraHandler = handler;
        this.context = context;
        this.analyticsEventsService = analyticsEventsService;
        this.cameraCaptureMutex = new C25437c(false);
        this.IMAGE_BUFFER_SIZE = 1;
        this.imageReaderThread = AbstractC30060g.m92088H(new C24069a(5));
        this.imageReaderHandler = AbstractC30060g.m92088H(new C24117a(this, 3));
        this.IMAGE_CAPTURE_TIMEOUT_MILLIS = 5000L;
        this.ZOOM_DEFAULT_VALUE = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoFocusCallbackResult(CaptureResult result) {
        CameraCaptureSession cameraCaptureSession;
        Integer num = (Integer) result.get(CaptureResult.CONTROL_AF_STATE);
        if (num != null) {
            int iIntValue = num.intValue();
            if (4 == iIntValue || 5 == iIntValue) {
                CaptureRequest.Builder builder = this.captureRequestBuilder;
                if (builder != null) {
                    builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                    builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                    builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
                }
                try {
                    if (isValidSession() && (cameraCaptureSession = this.currentCameraSession) != null) {
                        CaptureRequest.Builder builder2 = this.captureRequestBuilder;
                        AbstractC22676k.m65747g(builder2);
                        cameraCaptureSession.setRepeatingRequest(builder2.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$autoFocusCallbackResult$2$1
                        }, this.cameraHandler);
                    }
                } catch (Throwable th3) {
                    AbstractC34132o.m107888l(th3);
                }
            }
        }
    }

    private final Rect cropRegionForZoom(float ratio, Rect zoomSensorRect) {
        int iWidth = zoomSensorRect.width() / 2;
        int iHeight = zoomSensorRect.height() / 2;
        int iWidth2 = (int) ((zoomSensorRect.width() * 0.5f) / ratio);
        int iHeight2 = (int) ((zoomSensorRect.height() * 0.5f) / ratio);
        return new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
    }

    private final Handler getImageReaderHandler() {
        return (Handler) this.imageReaderHandler.getValue();
    }

    private final HandlerThread getImageReaderThread() {
        return (HandlerThread) this.imageReaderThread.getValue();
    }

    private final float getMaxZoomInternal(CameraCharacteristics cameraCharacteristics) {
        Float f13;
        if (cameraCharacteristics != null && (f13 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)) != null) {
            return f13.floatValue();
        }
        return this.ZOOM_DEFAULT_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler imageReaderHandler_delegate$lambda$2(CameraControl this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        return new Handler(this$0.getImageReaderThread().getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HandlerThread imageReaderThread_delegate$lambda$1() {
        HandlerThread handlerThread = new HandlerThread("imageReaderThread");
        handlerThread.start();
        return handlerThread;
    }

    private final boolean isValidSession() {
        return (this.cameraHandler == null || this.captureRequestBuilder == null || this.currentCameraSession == null || this.captureFormat == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetZoom$lambda$6(CameraControl this$0, String currentCameraIndex) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(currentCameraIndex, "$currentCameraIndex");
        this$0.setZoomInternal(this$0.getZOOM_DEFAULT_VALUE(), currentCameraIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFlash$lambda$13(CameraControl this$0, int i13) {
        AbstractC22676k.m65750j(this$0, "this$0");
        try {
            CaptureRequest.Builder builder = this$0.captureRequestBuilder;
            if (builder != null) {
                builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(i13));
            }
            CameraCaptureSession cameraCaptureSession = this$0.currentCameraSession;
            if (cameraCaptureSession != null) {
                CaptureRequest.Builder builder2 = this$0.captureRequestBuilder;
                AbstractC22676k.m65747g(builder2);
                cameraCaptureSession.setRepeatingRequest(builder2.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$setFlash$1$1$1
                }, this$0.cameraHandler);
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public static /* synthetic */ void setTapToFocusAt$default(CameraControl cameraControl, float f13, float f14, int i13, int i14, RendererCommon.ScalingType scalingType, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        }
        cameraControl.setTapToFocusAt(f13, f14, i13, i14, scalingType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTapToFocusAt$lambda$10(final CameraControl this$0) {
        AbstractC22676k.m65750j(this$0, "this$0");
        CameraCaptureSession cameraCaptureSession = this$0.currentCameraSession;
        if (cameraCaptureSession != null) {
            try {
                CaptureRequest.Builder builder = this$0.captureRequestBuilder;
                AbstractC22676k.m65747g(builder);
                cameraCaptureSession.setRepeatingRequest(builder.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$setTapToFocusAt$2$1$1
                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
                        AbstractC22676k.m65750j(session, "session");
                        AbstractC22676k.m65750j(request, "request");
                        AbstractC22676k.m65750j(result, "result");
                        super.onCaptureCompleted(session, request, result);
                        this.$this_runCatching.autoFocusCallbackResult(result);
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                    public void onCaptureProgressed(CameraCaptureSession session, CaptureRequest request, CaptureResult partialResult) {
                        AbstractC22676k.m65750j(session, "session");
                        AbstractC22676k.m65750j(request, "request");
                        AbstractC22676k.m65750j(partialResult, "partialResult");
                        super.onCaptureProgressed(session, request, partialResult);
                        this.$this_runCatching.autoFocusCallbackResult(partialResult);
                    }
                }, this$0.cameraHandler);
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setZoom$lambda$5(CameraControl this$0, float f13, String currentCameraIndex) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(currentCameraIndex, "$currentCameraIndex");
        this$0.setZoomInternal(f13, currentCameraIndex);
    }

    private final void setZoomInternal(float zoomValue, String currentCameraIndex) {
        Integer numM125932Q;
        CameraCharacteristics cameraCharacteristics;
        Rect rect;
        CameraCaptureSession cameraCaptureSession;
        if (currentCameraIndex == null || (numM125932Q = AbstractC39421y.m125932Q(currentCameraIndex)) == null || (cameraCharacteristics = CameraExtKt.getCameraCharacteristics(numM125932Q.intValue(), this.context)) == null || (rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE)) == null) {
            return;
        }
        float maxZoomInternal = getMaxZoomInternal(cameraCharacteristics);
        if (Math.abs(maxZoomInternal - this.ZOOM_DEFAULT_VALUE) < 0.001f) {
            return;
        }
        boolean z4 = zoomValue >= this.ZOOM_DEFAULT_VALUE && zoomValue <= maxZoomInternal && zoomValue != this.lastZoom;
        this.lastZoom = zoomValue;
        if (z4) {
            Rect rectCropRegionForZoom = cropRegionForZoom(zoomValue, rect);
            CaptureRequest.Builder builder = this.captureRequestBuilder;
            if (builder != null) {
                builder.set(CaptureRequest.SCALER_CROP_REGION, rectCropRegionForZoom);
            }
            this.lastZoom = zoomValue;
            try {
                if (isValidSession() && (cameraCaptureSession = this.currentCameraSession) != null) {
                    CaptureRequest.Builder builder2 = this.captureRequestBuilder;
                    AbstractC22676k.m65747g(builder2);
                    cameraCaptureSession.setRepeatingRequest(builder2.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$setZoomInternal$1$1
                    }, this.cameraHandler);
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object takePictureInternal(InterfaceC30057d<? super ImageCaptureModel> interfaceC30057d) {
        CaptureRequest.Builder builderCreateCaptureRequest;
        CameraDevice device;
        final C30065l c30065l = new C30065l(AbstractC15751g.m44424D(interfaceC30057d));
        if (this.imageReader == null || !isValidSession()) {
            c30065l.resumeWith(AbstractC34132o.m107888l(new NullPointerException("imageReader null, should be initlaised")));
        } else {
            while (true) {
                ImageReader imageReader = this.imageReader;
                AbstractC22676k.m65747g(imageReader);
                Image imageAcquireLatestImage = imageReader.acquireLatestImage();
                if (imageAcquireLatestImage == null) {
                    break;
                }
                imageAcquireLatestImage.close();
            }
            final ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(this.IMAGE_BUFFER_SIZE);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ImageReader imageReader2 = this.imageReader;
            AbstractC22676k.m65747g(imageReader2);
            imageReader2.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: live.hms.video.media.capturers.camera.CameraControl$takePictureInternal$2$1
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader3) {
                    try {
                        Image imageAcquireNextImage = imageReader3.acquireNextImage();
                        if (imageAcquireNextImage == null) {
                            return;
                        }
                        if (!atomicBoolean.get() && arrayBlockingQueue.offer(imageAcquireNextImage)) {
                            return;
                        }
                        imageAcquireNextImage.close();
                    } catch (Throwable th3) {
                        HMSLogger.INSTANCE.m71138e("CameraControl", "onImageAvailable: acquireNextImage failed, dropping frame", th3);
                    }
                }
            }, getImageReaderHandler());
            final C22669g0 c22669g0 = new C22669g0();
            CameraCaptureSession cameraCaptureSession = this.currentCameraSession;
            if (cameraCaptureSession == null || (device = cameraCaptureSession.getDevice()) == null || (builderCreateCaptureRequest = device.createCaptureRequest(2)) == null) {
                builderCreateCaptureRequest = null;
            } else {
                ImageReader imageReader3 = this.imageReader;
                AbstractC22676k.m65747g(imageReader3);
                builderCreateCaptureRequest.addTarget(imageReader3.getSurface());
            }
            if (builderCreateCaptureRequest == null) {
                takePictureInternal$lambda$22$failOnce(atomicBoolean, c30065l, c22669g0, this, arrayBlockingQueue, new NullPointerException("current camera session not found"));
            } else {
                CaptureRequest.Builder builder = this.captureRequestBuilder;
                if (builder != null) {
                    CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
                    Rect rect = (Rect) builder.get(key);
                    if (rect != null) {
                        builderCreateCaptureRequest.set(key, rect);
                    }
                }
                final TimeoutException timeoutException = new TimeoutException("Image dequeuing took too long");
                Runnable runnable = new Runnable() { // from class: live.hms.video.media.capturers.camera.CameraControl$takePictureInternal$2$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraControl.takePictureInternal$lambda$22$failOnce(atomicBoolean, c30065l, c22669g0, this, arrayBlockingQueue, timeoutException);
                    }
                };
                c30065l = c30065l;
                c22669g0.f89336w = runnable;
                getImageReaderHandler().postDelayed(runnable, this.IMAGE_CAPTURE_TIMEOUT_MILLIS);
                CameraCaptureSession cameraCaptureSession2 = this.currentCameraSession;
                if (cameraCaptureSession2 != null) {
                    AbstractC17269i.m48918v(cameraCaptureSession2.capture(builderCreateCaptureRequest.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$takePictureInternal$2$3
                        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                        public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
                            AbstractC22676k.m65750j(session, "session");
                            AbstractC22676k.m65750j(request, "request");
                            AbstractC22676k.m65750j(result, "result");
                            super.onCaptureCompleted(session, request, result);
                            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c30065l.getContext()), null, null, new CameraControl$takePictureInternal$2$3$onCaptureCompleted$1(arrayBlockingQueue, (Long) result.get(CaptureResult.SENSOR_TIMESTAMP), atomicBoolean, this, c30065l, result, c22669g0, null), 3);
                        }
                    }, this.cameraHandler));
                } else {
                    takePictureInternal$lambda$22$failOnce(atomicBoolean, c30065l, c22669g0, this, arrayBlockingQueue, new IllegalStateException("Camera session is null, capture cannot be performed"));
                }
            }
        }
        Object objM92140a = c30065l.m92140a();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM92140a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takePictureInternal$lambda$22$failOnce(AtomicBoolean atomicBoolean, InterfaceC30057d<? super ImageCaptureModel> interfaceC30057d, C22669g0 c22669g0, CameraControl cameraControl, ArrayBlockingQueue<Image> arrayBlockingQueue, Throwable th3) {
        if (atomicBoolean.compareAndSet(false, true)) {
            takePictureInternal$lambda$22$releaseCaptureResources(c22669g0, cameraControl, arrayBlockingQueue);
            interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void takePictureInternal$lambda$22$releaseCaptureResources(C22669g0 c22669g0, CameraControl cameraControl, ArrayBlockingQueue<Image> arrayBlockingQueue) {
        Runnable runnable = (Runnable) c22669g0.f89336w;
        if (runnable != null) {
            cameraControl.getImageReaderHandler().removeCallbacks(runnable);
        }
        ImageReader imageReader = cameraControl.imageReader;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(null, null);
        }
        while (!arrayBlockingQueue.isEmpty()) {
            try {
                Image imagePoll = arrayBlockingQueue.poll();
                if (imagePoll != null) {
                    imagePoll.close();
                }
            } catch (Throwable th3) {
                AbstractC34132o.m107888l(th3);
            }
        }
    }

    public final void captureImageAtMaxResolution(HmsTypedActionResultListener<ImageCaptureModel> onImageCapture) {
        AbstractC22676k.m65750j(onImageCapture, "onImageCapture");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C241711(onImageCapture, null), 3);
    }

    public final void captureImageAtMaxSupportedResolution(File savePath, Function1 callback) {
        AbstractC22676k.m65750j(savePath, "savePath");
        AbstractC22676k.m65750j(callback, "callback");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(ExecutorC22364d.f87316w), null, null, new C241721(callback, savePath, null), 3);
    }

    /* JADX INFO: renamed from: getAnalyticsEventsService$lib_release, reason: from getter */
    public final AnalyticsEventsService getAnalyticsEventsService() {
        return this.analyticsEventsService;
    }

    public final Handler getCameraHandler() {
        return this.cameraHandler;
    }

    public final CameraEnumerationAndroid.CaptureFormat getCaptureFormat() {
        return this.captureFormat;
    }

    public final CaptureRequest.Builder getCaptureRequestBuilder() {
        return this.captureRequestBuilder;
    }

    public final Context getContext() {
        return this.context;
    }

    public final CameraCaptureSession getCurrentCameraSession() {
        return this.currentCameraSession;
    }

    public final ImageReader getImageReader() {
        return this.imageReader;
    }

    public final Range<Float> getManualFocusRange() {
        CameraDevice device;
        String id4;
        Float fValueOf = Float.valueOf(0.0f);
        if (!isValidSession()) {
            return new Range<>(fValueOf, fValueOf);
        }
        CameraCaptureSession cameraCaptureSession = this.currentCameraSession;
        return (cameraCaptureSession == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null) ? new Range<>(fValueOf, fValueOf) : CameraExtKt.getLensDistanceRange(this.context, id4);
    }

    public final float getMaxZoom() {
        CameraDevice device;
        String id4;
        if (!isValidSession()) {
            return this.ZOOM_DEFAULT_VALUE;
        }
        CameraCaptureSession cameraCaptureSession = this.currentCameraSession;
        if (cameraCaptureSession == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null) {
            return this.ZOOM_DEFAULT_VALUE;
        }
        Integer numM125932Q = AbstractC39421y.m125932Q(id4);
        return getMaxZoomInternal(numM125932Q != null ? CameraExtKt.getCameraCharacteristics(numM125932Q.intValue(), this.context) : null);
    }

    /* JADX INFO: renamed from: getMinZoom, reason: from getter */
    public final float getZOOM_DEFAULT_VALUE() {
        return this.ZOOM_DEFAULT_VALUE;
    }

    public final boolean isFlashEnabled() {
        Integer num;
        CaptureRequest.Builder builder = this.captureRequestBuilder;
        return (builder == null || (num = (Integer) builder.get(CaptureRequest.FLASH_MODE)) == null || num.intValue() != 2) ? false : true;
    }

    public final boolean isFlashSupported() {
        CameraDevice device;
        String id4;
        CameraCaptureSession cameraCaptureSession = this.currentCameraSession;
        if (cameraCaptureSession == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null) {
            return false;
        }
        return CameraExtKt.isFlashAvailable(this.context, id4);
    }

    public final boolean isManualFocusSupported() {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        String id4;
        if (isValidSession() && (cameraCaptureSession = this.currentCameraSession) != null && (device = cameraCaptureSession.getDevice()) != null && (id4 = device.getId()) != null) {
            Range<Float> lensDistanceRange = CameraExtKt.getLensDistanceRange(this.context, id4);
            if (((Number) lensDistanceRange.getUpper()).floatValue() > 0.0f && ((Number) lensDistanceRange.getLower()).floatValue() > 0.0f) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTapToFocusSupported() {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        String id4;
        Integer numM125932Q;
        CameraCharacteristics cameraCharacteristics;
        int[] iArr;
        if (!isValidSession() || (cameraCaptureSession = this.currentCameraSession) == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null || (numM125932Q = AbstractC39421y.m125932Q(id4)) == null || (cameraCharacteristics = CameraExtKt.getCameraCharacteristics(numM125932Q.intValue(), this.context)) == null || (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) == null) {
            return false;
        }
        return ((iArr.length == 0) || CameraExtKt.getFocusMaxMeteringRegionsSupported(this.context, id4) == 0) ? false : true;
    }

    public final boolean isZoomSupported() {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        String id4;
        if (isValidSession() && (cameraCaptureSession = this.currentCameraSession) != null && (device = cameraCaptureSession.getDevice()) != null && (id4 = device.getId()) != null) {
            Integer numM125932Q = AbstractC39421y.m125932Q(id4);
            if (getMaxZoomInternal(numM125932Q != null ? CameraExtKt.getCameraCharacteristics(numM125932Q.intValue(), this.context) : null) > this.ZOOM_DEFAULT_VALUE) {
                return true;
            }
        }
        return false;
    }

    public final void onCameraSessionUpdate$lib_release(Camera2Session session) {
        AbstractC22676k.m65750j(session, "session");
        this.captureRequestBuilder = session.getCaptureRequestBuilder();
        this.currentCameraSession = session.getCamera2CaptureSession();
        this.captureFormat = session.getCameraCaptureFormat();
        this.imageReader = session.getImageReader();
    }

    public final void resetZoom() {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        String id4;
        Handler handler;
        if (!isValidSession() || (cameraCaptureSession = this.currentCameraSession) == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null || (handler = this.cameraHandler) == null) {
            return;
        }
        handler.post(new RunnableC20151r0(16, this, id4));
    }

    public final void setCaptureFormat(CameraEnumerationAndroid.CaptureFormat captureFormat) {
        this.captureFormat = captureFormat;
    }

    public final void setCaptureRequestBuilder(CaptureRequest.Builder builder) {
        this.captureRequestBuilder = builder;
    }

    public final void setCurrentCameraSession(CameraCaptureSession cameraCaptureSession) {
        this.currentCameraSession = cameraCaptureSession;
    }

    public final void setFlash(boolean enable) {
        if (isValidSession()) {
            int i13 = enable ? 2 : 0;
            Handler handler = this.cameraHandler;
            if (handler != null) {
                handler.post(new RunnableC2833g0(this, i13, 3));
            }
        }
    }

    public final void setImageReader(ImageReader imageReader) {
        this.imageReader = imageReader;
    }

    public final void setManualFocus(float range) {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        CameraCaptureSession cameraCaptureSession2;
        if (!isValidSession() || (cameraCaptureSession = this.currentCameraSession) == null || (device = cameraCaptureSession.getDevice()) == null || device.getId() == null) {
            return;
        }
        Range<Float> manualFocusRange = getManualFocusRange();
        Object lower = manualFocusRange.getLower();
        AbstractC22676k.m65749i(lower, "getLower(...)");
        float fFloatValue = ((Number) lower).floatValue();
        Object upper = manualFocusRange.getUpper();
        AbstractC22676k.m65749i(upper, "getUpper(...)");
        float fM36283m = AbstractC12889b.m36283m(range, fFloatValue, ((Number) upper).floatValue());
        this.lastLensDistance = fM36283m;
        CaptureRequest.Builder builder = this.captureRequestBuilder;
        if (builder != null) {
            builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(fM36283m));
        }
        try {
            if (isValidSession() && (cameraCaptureSession2 = this.currentCameraSession) != null) {
                CaptureRequest.Builder builder2 = this.captureRequestBuilder;
                AbstractC22676k.m65747g(builder2);
                cameraCaptureSession2.setRepeatingRequest(builder2.build(), new CameraCaptureSession.CaptureCallback() { // from class: live.hms.video.media.capturers.camera.CameraControl$setManualFocus$1$1
                }, this.cameraHandler);
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
    }

    public final void setTapToFocusAt(float viewX, float viewY, int viewWidth, int viewHeight, RendererCommon.ScalingType scalingType) {
        CaptureRequest.Builder builder;
        Rect rect;
        String id4;
        CameraDevice device;
        CameraDevice device2;
        AbstractC22676k.m65750j(scalingType, "scalingType");
        if (isValidSession() && viewX >= 0.0f && viewX <= viewWidth && viewY >= 0.0f && viewY <= viewHeight && (builder = this.captureRequestBuilder) != null && (rect = (Rect) builder.get(CaptureRequest.SCALER_CROP_REGION)) != null) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            Context context = this.context;
            CameraCaptureSession cameraCaptureSession = this.currentCameraSession;
            if (cameraCaptureSession == null || (device2 = cameraCaptureSession.getDevice()) == null || (id4 = device2.getId()) == null) {
                id4 = UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE;
            }
            int iComputeRelativeRotation = CameraExtKt.computeRelativeRotation(context, id4);
            CameraCaptureSession cameraCaptureSession2 = this.currentCameraSession;
            boolean zM65745e = AbstractC22676k.m65745e((cameraCaptureSession2 == null || (device = cameraCaptureSession2.getDevice()) == null) ? null : device.getId(), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
            int i13 = (zM65745e ? 1 : -1) * iComputeRelativeRotation;
            HMSUtils hMSUtils = HMSUtils.INSTANCE;
            RectF rectF = new RectF(viewX, viewY, viewX, viewY);
            CameraEnumerationAndroid.CaptureFormat captureFormat = this.captureFormat;
            Integer numValueOf = captureFormat != null ? Integer.valueOf(captureFormat.width) : null;
            CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.captureFormat;
            RectF rectFViewToNormalized$lib_release = hMSUtils.viewToNormalized$lib_release(rectF, viewWidth, viewHeight, numValueOf, captureFormat2 != null ? Integer.valueOf(captureFormat2.height) : null, zM65745e, i13, scalingType);
            if (rectFViewToNormalized$lib_release == null) {
                return;
            }
            float f13 = rectFViewToNormalized$lib_release.left;
            float f14 = rectFViewToNormalized$lib_release.top;
            RectF rectF2 = new RectF();
            rectF2.left = AbstractC31479j.m96938q(f13 - 0.05f, 0.0f, 1.0f);
            rectF2.right = AbstractC31479j.m96938q(f13 + 0.05f, 0.0f, 1.0f);
            rectF2.top = AbstractC31479j.m96938q(f14 - 0.05f, 0.0f, 1.0f);
            rectF2.bottom = AbstractC31479j.m96938q(f14 + 0.05f, 0.0f, 1.0f);
            CameraEnumerationAndroid.CaptureFormat captureFormat3 = this.captureFormat;
            Integer numValueOf2 = captureFormat3 != null ? Integer.valueOf(captureFormat3.width) : null;
            CameraEnumerationAndroid.CaptureFormat captureFormat4 = this.captureFormat;
            RectF rectFNormalizedToCameraSensor$lib_release = hMSUtils.normalizedToCameraSensor$lib_release(rectF2, numValueOf2, captureFormat4 != null ? Integer.valueOf(captureFormat4.height) : null, iWidth, iHeight, true);
            if (rectFNormalizedToCameraSensor$lib_release == null) {
                return;
            }
            Rect rect2 = new Rect();
            if (rectFNormalizedToCameraSensor$lib_release.width() == 0.0f || rectFNormalizedToCameraSensor$lib_release.height() == 0.0f) {
                rect2 = new Rect(0, 0, 0, 0);
            } else {
                rectFNormalizedToCameraSensor$lib_release.round(rect2);
            }
            CaptureRequest.Builder builder2 = this.captureRequestBuilder;
            if (builder2 != null) {
                builder2.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                builder2.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect2, 1000)});
                builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
                builder2.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                builder2.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            }
            Handler handler = this.cameraHandler;
            if (handler != null) {
                handler.post(new RunnableC20277c7(this, 28));
            }
        }
    }

    public final void setZoom(final float zoomValue) {
        CameraCaptureSession cameraCaptureSession;
        CameraDevice device;
        final String id4;
        Handler handler;
        if (!isValidSession() || (cameraCaptureSession = this.currentCameraSession) == null || (device = cameraCaptureSession.getDevice()) == null || (id4 = device.getId()) == null || (handler = this.cameraHandler) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: live.hms.video.media.capturers.camera.a
            @Override // java.lang.Runnable
            public final void run() {
                CameraControl.setZoom$lambda$5(this.f95235w, zoomValue, id4);
            }
        });
    }
}
