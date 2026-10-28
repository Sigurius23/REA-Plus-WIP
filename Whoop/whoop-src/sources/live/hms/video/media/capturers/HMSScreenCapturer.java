package live.hms.video.media.capturers;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import bc3.AbstractC3006f0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import hms.webrtc.VideoSource;
import java.util.concurrent.CancellationException;
import live.hms.video.media.settings.HMSVideoTrackSettings;
import live.hms.video.services.HMSScreenCaptureService;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0005*\u0001$\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Llive/hms/video/media/capturers/HMSScreenCapturer;", "Llive/hms/video/media/capturers/HMSCapturer;", "Landroid/content/Context;", "context", "Lhms/webrtc/VideoSource;", "source", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "hmsVideoTrackSettings", "Landroid/app/Notification;", "screenShareNotification", "Lkotlin/Function0;", "Ll83/a0;", "endScreenShare", "<init>", "(Landroid/content/Context;Lhms/webrtc/VideoSource;Landroid/content/Intent;Llive/hms/video/media/settings/HMSVideoTrackSettings;Landroid/app/Notification;Lc93/a;)V", "startCapturer", "()V", "start", "stop", "Landroid/content/Context;", "Lhms/webrtc/VideoSource;", "Landroid/content/Intent;", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "Lbc3/k1;", "endScreenshareJob", "Lbc3/k1;", "Llive/hms/video/services/HMSScreenCaptureService;", "capturerService", "Llive/hms/video/services/HMSScreenCaptureService;", "getCapturerService", "()Llive/hms/video/services/HMSScreenCaptureService;", "setCapturerService", "(Llive/hms/video/services/HMSScreenCaptureService;)V", "screenShareCaptureIntent", "live/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1", "serviceConnection", "Llive/hms/video/media/capturers/HMSScreenCapturer$serviceConnection$1;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSScreenCapturer implements HMSCapturer {
    public static final String TAG = "HMSScreenCapturer";
    private HMSScreenCaptureService capturerService;
    private final Context context;
    private InterfaceC3027k1 endScreenshareJob;
    private final HMSVideoTrackSettings hmsVideoTrackSettings;
    private final Intent mediaProjectionPermissionResultData;
    private final Intent screenShareCaptureIntent;
    private final HMSScreenCapturer$serviceConnection$1 serviceConnection;
    private final VideoSource source;

    /* JADX WARN: Type inference failed for: r2v2, types: [live.hms.video.media.capturers.HMSScreenCapturer$serviceConnection$1] */
    public HMSScreenCapturer(Context context, VideoSource source, Intent intent, HMSVideoTrackSettings hmsVideoTrackSettings, Notification notification, final InterfaceC4339a endScreenShare) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(hmsVideoTrackSettings, "hmsVideoTrackSettings");
        AbstractC22676k.m65750j(endScreenShare, "endScreenShare");
        this.context = context;
        this.source = source;
        this.mediaProjectionPermissionResultData = intent;
        this.hmsVideoTrackSettings = hmsVideoTrackSettings;
        Intent intent2 = new Intent(context, (Class<?>) HMSScreenCaptureService.class);
        intent2.putExtra(HMSConstantsKt.SCREEN_SHARE_NOTIFICATION_INTENT_NAME, notification);
        this.screenShareCaptureIntent = intent2;
        this.serviceConnection = new ServiceConnection() { // from class: live.hms.video.media.capturers.HMSScreenCapturer$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                HMSScreenCapturer hMSScreenCapturer = this.this$0;
                AbstractC22676k.m65748h(service, "null cannot be cast to non-null type live.hms.video.services.HMSScreenCaptureService.LocalBinder");
                hMSScreenCapturer.setCapturerService(((HMSScreenCaptureService.LocalBinder) service).getThis$0());
                HMSScreenCaptureService capturerService = this.this$0.getCapturerService();
                if (capturerService != null) {
                    capturerService.startScreenCapture(this.this$0.mediaProjectionPermissionResultData, this.this$0.hmsVideoTrackSettings, this.this$0.source);
                }
                HMSScreenCapturer hMSScreenCapturer2 = this.this$0;
                hMSScreenCapturer2.endScreenshareJob = AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSScreenCapturer$serviceConnection$1$onServiceConnected$1(hMSScreenCapturer2, endScreenShare, null), 3);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                this.this$0.setCapturerService(null);
            }
        };
    }

    private final void startCapturer() {
        this.context.bindService(this.screenShareCaptureIntent, this.serviceConnection, 1);
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void dispose() {
        HMSCapturer.DefaultImpls.dispose(this);
    }

    public final HMSScreenCaptureService getCapturerService() {
        return this.capturerService;
    }

    public final void setCapturerService(HMSScreenCaptureService hMSScreenCaptureService) {
        this.capturerService = hMSScreenCaptureService;
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void start() {
        startCapturer();
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void stop() {
        InterfaceC3027k1 interfaceC3027k1 = this.endScreenshareJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        HMSScreenCaptureService hMSScreenCaptureService = this.capturerService;
        if (hMSScreenCaptureService != null) {
            hMSScreenCaptureService.stopScreenCapturer();
            this.context.unbindService(this.serviceConnection);
        }
        this.capturerService = null;
        HMSLogger.INSTANCE.m71140v(TAG, "destroyed from capturer");
    }
}
