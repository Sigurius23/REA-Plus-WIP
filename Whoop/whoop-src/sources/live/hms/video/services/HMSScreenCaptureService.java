package live.hms.video.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13072o1;
import hms.webrtc.CapturerObserver;
import hms.webrtc.SurfaceTextureHelper;
import hms.webrtc.VideoFrame;
import hms.webrtc.VideoSource;
import l83.C23454a0;
import live.hms.video.factories.HMSPeerConnectionFactory;
import live.hms.video.media.capturers.HMSScreenCapturer;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import live.hms.video.utils.HMSUtils;
import live.hms.video.utils.SharedEglContext;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 :2\u00020\u0001:\u0002;:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0018\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J)\u0010#\u001a\u00020 2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, m65681d2 = {"Llive/hms/video/services/HMSScreenCaptureService;", "Landroid/app/Service;", "<init>", "()V", "Ll83/a0;", "createNotificationChannel", "Lhms/webrtc/VideoFrame;", "frame", "checkForOrientationChange", "(Lhms/webrtc/VideoFrame;)V", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "hmsVideoTrackSettings", "Lhms/webrtc/VideoSource;", "source", "startScreenCapture", "(Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Lhms/webrtc/VideoSource;)V", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "hmsPeerConnectionFactory", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "startAudioSharing$lib_release", "(Landroid/content/Intent;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;)V", "startAudioSharing", "stopScreenCapturer", "stopAudioCaptuer", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Llive/hms/video/services/ScreenCapturerAndroidCustom;", "screenCapturerAndroid", "Llive/hms/video/services/ScreenCapturerAndroidCustom;", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "mBinder", "Landroid/os/IBinder;", "Landroid/app/Notification;", "customerNotification", "Landroid/app/Notification;", "Lec3/o1;", "", "endFlow", "Lec3/o1;", "getEndFlow", "()Lec3/o1;", "oldOrientation", "I", "Companion", "LocalBinder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSScreenCaptureService extends Service {
    public static final String ACTION_START = "AudioCaptureService:Start";
    public static final String ACTION_STOP = "AudioCaptureService:Stop";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String LOCAL_SCREEN_CAPTURER_THREAD = "local-screen-capturer-thread";
    private static final String NOTIFICATION_CHANNEL_ID = "ScreenCapture channel";
    public static final String PERMISSION_RESULT_DATA = "permission_result_data";
    public static final String SCREEN_HEIGHT = "screen_height";
    public static final String SCREEN_WIDTH = "screen_width";
    private static final int SERVICE_ID = 123;
    private Notification customerNotification;
    private HMSPeerConnectionFactory hmsPeerConnectionFactory;
    private int oldOrientation;
    private ScreenCapturerAndroidCustom screenCapturerAndroid;
    private final String TAG = "HMSScreenCaptureService";
    private final IBinder mBinder = new LocalBinder();
    private final InterfaceC13072o1 endFlow = AbstractC13091v.m36592b(0, 0, null, 7);

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m65681d2 = {"Llive/hms/video/services/HMSScreenCaptureService$Companion;", "", "<init>", "()V", "SERVICE_ID", "", "NOTIFICATION_CHANNEL_ID", "", "ACTION_START", "ACTION_STOP", "LOCAL_SCREEN_CAPTURER_THREAD", "PERMISSION_RESULT_DATA", "SCREEN_WIDTH", "SCREEN_HEIGHT", "getStopScreenSharePendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PendingIntent getStopScreenSharePendingIntent(Context context) {
            AbstractC22676k.m65750j(context, "context");
            Intent intent = new Intent(context, (Class<?>) HMSScreenCaptureService.class);
            intent.setAction(HMSScreenCaptureService.ACTION_STOP);
            PendingIntent service = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getService(context, HMSScreenCaptureService.SERVICE_ID, intent, 67108864) : PendingIntent.getBroadcast(context, HMSScreenCaptureService.SERVICE_ID, intent, 134217728);
            AbstractC22676k.m65747g(service);
            return service;
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/services/HMSScreenCaptureService$LocalBinder;", "Landroid/os/Binder;", "<init>", "(Llive/hms/video/services/HMSScreenCaptureService;)V", NotificationCompat.CATEGORY_SERVICE, "Llive/hms/video/services/HMSScreenCaptureService;", "getService", "()Llive/hms/video/services/HMSScreenCaptureService;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public final class LocalBinder extends Binder {
        public LocalBinder() {
        }

        /* JADX INFO: renamed from: getService, reason: from getter */
        public final HMSScreenCaptureService getThis$0() {
            return HMSScreenCaptureService.this;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.services.HMSScreenCaptureService$onStartCommand$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.services.HMSScreenCaptureService$onStartCommand$1", m100430f = "HMSScreenCaptureService.kt", m100431l = {202}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242741 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C242741(InterfaceC30057d<? super C242741> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSScreenCaptureService.this.new C242741(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242741) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 endFlow = HMSScreenCaptureService.this.getEndFlow();
                Boolean bool = Boolean.TRUE;
                this.label = 1;
                if (endFlow.emit(bool, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkForOrientationChange(VideoFrame frame) {
        HMSUtils hMSUtils = HMSUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        int orientation = hMSUtils.getOrientation(applicationContext);
        if (hMSUtils.hasOrientationChange(orientation, this.oldOrientation)) {
            this.oldOrientation = orientation;
            ScreenCapturerAndroidCustom screenCapturerAndroidCustom = this.screenCapturerAndroid;
            if (screenCapturerAndroidCustom != null) {
                screenCapturerAndroidCustom.changeCaptureFormat(frame.getBuffer().getHeight(), frame.getBuffer().getWidth(), 30);
            }
        }
    }

    private final void createNotificationChannel() {
        String channelId;
        Notification notification = this.customerNotification;
        if (notification == null || (channelId = notification.getChannelId()) == null) {
            channelId = NOTIFICATION_CHANNEL_ID;
        }
        ((NotificationManager) getApplicationContext().getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(channelId, "Screen Capture Service Channel", 3));
    }

    public final InterfaceC13072o1 getEndFlow() {
        return this.endFlow;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.customerNotification = intent != null ? (Notification) intent.getParcelableExtra(HMSConstantsKt.SCREEN_SHARE_NOTIFICATION_INTENT_NAME) : null;
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        String TAG = this.TAG;
        AbstractC22676k.m65749i(TAG, "TAG");
        StringBuilder sb4 = new StringBuilder("Is customer intent null? ");
        sb4.append(this.customerNotification == null);
        hMSLogger.m71140v(TAG, sb4.toString());
        createNotificationChannel();
        Notification notificationBuild = this.customerNotification;
        if (notificationBuild == null) {
            notificationBuild = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID).setContentTitle("Service running in background").setContentText("Screen Capture is running in background").build();
            AbstractC22676k.m65749i(notificationBuild, "build(...)");
        }
        startForeground(SERVICE_ID, notificationBuild);
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        HMSLogger hMSLogger = HMSLogger.INSTANCE;
        String TAG = this.TAG;
        AbstractC22676k.m65749i(TAG, "TAG");
        hMSLogger.m71140v(TAG, "Being destroyed from the service");
        ScreenCapturerAndroidCustom screenCapturerAndroidCustom = this.screenCapturerAndroid;
        if (screenCapturerAndroidCustom != null) {
            screenCapturerAndroidCustom.stopCapture();
        }
        HMSPeerConnectionFactory hMSPeerConnectionFactory = this.hmsPeerConnectionFactory;
        if (hMSPeerConnectionFactory != null) {
            hMSPeerConnectionFactory.stopAudioMixing();
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        int iOnStartCommand = super.onStartCommand(intent, flags, startId);
        if (AbstractC22676k.m65745e(intent != null ? intent.getAction() : null, ACTION_STOP)) {
            AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242741(null), 3);
        }
        return iOnStartCommand;
    }

    public final void startAudioSharing$lib_release(Intent mediaProjectionPermissionResultData, HMSPeerConnectionFactory hmsPeerConnectionFactory, AudioMixingMode audioMixingMode) {
        AbstractC22676k.m65750j(hmsPeerConnectionFactory, "hmsPeerConnectionFactory");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        this.hmsPeerConnectionFactory = hmsPeerConnectionFactory;
        Object systemService = getApplicationContext().getSystemService("media_projection");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        AbstractC22676k.m65747g(mediaProjectionPermissionResultData);
        MediaProjection mediaProjection = ((MediaProjectionManager) systemService).getMediaProjection(-1, mediaProjectionPermissionResultData);
        AbstractC22676k.m65749i(mediaProjection, "getMediaProjection(...)");
        hmsPeerConnectionFactory.startAudioMixing(mediaProjection, audioMixingMode);
    }

    public final void startScreenCapture(Intent mediaProjectionPermissionResultData, HMSVideoTrackSettings hmsVideoTrackSettings, final VideoSource source) {
        AbstractC22676k.m65750j(hmsVideoTrackSettings, "hmsVideoTrackSettings");
        AbstractC22676k.m65750j(source, "source");
        ScreenCapturerAndroidCustom screenCapturerAndroidCustom = new ScreenCapturerAndroidCustom(mediaProjectionPermissionResultData, new MediaProjection.Callback() { // from class: live.hms.video.services.HMSScreenCaptureService.startScreenCapture.1
            @Override // android.media.projection.MediaProjection.Callback
            public void onStop() {
                HMSLogger.m71137e(HMSScreenCapturer.TAG, "onstop of screen capturer");
            }
        });
        this.screenCapturerAndroid = screenCapturerAndroidCustom;
        screenCapturerAndroidCustom.initialize(SurfaceTextureHelper.create(LOCAL_SCREEN_CAPTURER_THREAD, SharedEglContext.INSTANCE.getContext()), getApplicationContext(), new CapturerObserver() { // from class: live.hms.video.services.HMSScreenCaptureService.startScreenCapture.2
            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStarted(boolean success) {
                source.getCapturerObserver().onCapturerStarted(success);
            }

            @Override // hms.webrtc.CapturerObserver
            public void onCapturerStopped() {
                source.getCapturerObserver().onCapturerStopped();
            }

            @Override // hms.webrtc.CapturerObserver
            public void onFrameCaptured(VideoFrame frame) {
                source.getCapturerObserver().onFrameCaptured(frame);
                if (frame != null) {
                    this.checkForOrientationChange(frame);
                }
            }
        });
        HMSUtils hMSUtils = HMSUtils.INSTANCE;
        Context applicationContext = getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        Point pointApplySizeConstraint = hMSUtils.applySizeConstraint(hMSUtils.getDeviceWidthAndHeight(applicationContext));
        ScreenCapturerAndroidCustom screenCapturerAndroidCustom2 = this.screenCapturerAndroid;
        if (screenCapturerAndroidCustom2 != null) {
            screenCapturerAndroidCustom2.startCapture(pointApplySizeConstraint.x, pointApplySizeConstraint.y, 30);
        }
    }

    public final void stopAudioCaptuer() {
        HMSPeerConnectionFactory hMSPeerConnectionFactory = this.hmsPeerConnectionFactory;
        if (hMSPeerConnectionFactory != null) {
            hMSPeerConnectionFactory.stopAudioMixing();
        }
        stopSelf();
    }

    public final void stopScreenCapturer() {
        ScreenCapturerAndroidCustom screenCapturerAndroidCustom = this.screenCapturerAndroid;
        if (screenCapturerAndroidCustom != null) {
            screenCapturerAndroidCustom.stopCapture();
        }
        stopSelf();
    }
}
