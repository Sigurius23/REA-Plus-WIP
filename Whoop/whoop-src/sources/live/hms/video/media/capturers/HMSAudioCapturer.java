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
import java.util.concurrent.CancellationException;
import live.hms.video.factories.HMSPeerConnectionFactory;
import live.hms.video.sdk.models.enums.AudioMixingMode;
import live.hms.video.services.HMSScreenCaptureService;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u001f\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Llive/hms/video/media/capturers/HMSAudioCapturer;", "Llive/hms/video/media/capturers/HMSCapturer;", "Landroid/content/Context;", "context", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "hmsPeerConnectionFactory", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "audioMixingMode", "Landroid/content/Intent;", "mediaProjectionPermissionResultData", "Landroid/app/Notification;", "screenShareNotification", "Lkotlin/Function0;", "Ll83/a0;", "endAudioShare", "<init>", "(Landroid/content/Context;Llive/hms/video/factories/HMSPeerConnectionFactory;Llive/hms/video/sdk/models/enums/AudioMixingMode;Landroid/content/Intent;Landroid/app/Notification;Lc93/a;)V", "start", "()V", "stop", "Landroid/content/Context;", "Llive/hms/video/factories/HMSPeerConnectionFactory;", "Llive/hms/video/sdk/models/enums/AudioMixingMode;", "Landroid/content/Intent;", "Lbc3/k1;", "endAudioshareJob", "Lbc3/k1;", "Llive/hms/video/services/HMSScreenCaptureService;", "capturerService", "Llive/hms/video/services/HMSScreenCaptureService;", "audioShareCaptureIntent", "live/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1", "serviceConnection", "Llive/hms/video/media/capturers/HMSAudioCapturer$serviceConnection$1;", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSAudioCapturer implements HMSCapturer {
    public static final String TAG = "HMSAudioCapturer";
    private final AudioMixingMode audioMixingMode;
    private final Intent audioShareCaptureIntent;
    private HMSScreenCaptureService capturerService;
    private final Context context;
    private InterfaceC3027k1 endAudioshareJob;
    private final HMSPeerConnectionFactory hmsPeerConnectionFactory;
    private final Intent mediaProjectionPermissionResultData;
    private final HMSAudioCapturer$serviceConnection$1 serviceConnection;

    /* JADX WARN: Type inference failed for: r2v2, types: [live.hms.video.media.capturers.HMSAudioCapturer$serviceConnection$1] */
    public HMSAudioCapturer(Context context, HMSPeerConnectionFactory hmsPeerConnectionFactory, AudioMixingMode audioMixingMode, Intent intent, Notification notification, final InterfaceC4339a endAudioShare) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(hmsPeerConnectionFactory, "hmsPeerConnectionFactory");
        AbstractC22676k.m65750j(audioMixingMode, "audioMixingMode");
        AbstractC22676k.m65750j(endAudioShare, "endAudioShare");
        this.context = context;
        this.hmsPeerConnectionFactory = hmsPeerConnectionFactory;
        this.audioMixingMode = audioMixingMode;
        this.mediaProjectionPermissionResultData = intent;
        Intent intent2 = new Intent(context, (Class<?>) HMSScreenCaptureService.class);
        intent2.putExtra(HMSConstantsKt.SCREEN_SHARE_NOTIFICATION_INTENT_NAME, notification);
        this.audioShareCaptureIntent = intent2;
        this.serviceConnection = new ServiceConnection() { // from class: live.hms.video.media.capturers.HMSAudioCapturer$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                HMSAudioCapturer hMSAudioCapturer = this.this$0;
                AbstractC22676k.m65748h(service, "null cannot be cast to non-null type live.hms.video.services.HMSScreenCaptureService.LocalBinder");
                hMSAudioCapturer.capturerService = ((HMSScreenCaptureService.LocalBinder) service).getThis$0();
                HMSScreenCaptureService hMSScreenCaptureService = this.this$0.capturerService;
                if (hMSScreenCaptureService != null) {
                    hMSScreenCaptureService.startAudioSharing$lib_release(this.this$0.mediaProjectionPermissionResultData, this.this$0.hmsPeerConnectionFactory, this.this$0.audioMixingMode);
                }
                HMSAudioCapturer hMSAudioCapturer2 = this.this$0;
                hMSAudioCapturer2.endAudioshareJob = AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSAudioCapturer$serviceConnection$1$onServiceConnected$1(hMSAudioCapturer2, endAudioShare, null), 3);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                this.this$0.capturerService = null;
            }
        };
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void dispose() {
        HMSCapturer.DefaultImpls.dispose(this);
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void start() {
        this.context.bindService(this.audioShareCaptureIntent, this.serviceConnection, 1);
    }

    @Override // live.hms.video.media.capturers.HMSCapturer
    public void stop() {
        InterfaceC3027k1 interfaceC3027k1 = this.endAudioshareJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        HMSScreenCaptureService hMSScreenCaptureService = this.capturerService;
        if (hMSScreenCaptureService != null) {
            hMSScreenCaptureService.stopAudioCaptuer();
            this.context.unbindService(this.serviceConnection);
        }
        this.capturerService = null;
        HMSLogger.INSTANCE.m71140v(HMSScreenCapturer.TAG, "destroyed from capturer");
    }
}
