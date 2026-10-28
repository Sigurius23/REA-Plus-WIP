package live.hms.video.sdk;

import android.util.Log;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import live.hms.video.events.AnalyticsEvent;
import live.hms.video.events.AnalyticsEventFactory;
import live.hms.video.factories.noisecancellation.AvailabilityStatus;
import live.hms.video.factories.noisecancellation.NoiseCancellationStatusChecker;
import live.hms.video.media.settings.HMSAudioTrackSettings;
import live.hms.video.media.settings.HMSTrackSettings;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, m65681d2 = {"Llive/hms/video/sdk/NoiseCancellationReportingUseCase;", "", "Llive/hms/video/media/settings/HMSTrackSettings;", "hmsTrackSettings", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "ncStatusChecker", "Lkotlin/Function1;", "Llive/hms/video/events/AnalyticsEvent;", "Ll83/a0;", "sendRealtimeEvent", "<init>", "(Llive/hms/video/media/settings/HMSTrackSettings;Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;Lkotlin/jvm/functions/Function1;)V", "", "isNcEnabledInTrackSettings", "()Z", "isWebrtcPeer", "peerJoined", "(ZLlive/hms/video/media/settings/HMSTrackSettings;)V", "enabled", "noiseCancellationState", "(Z)V", "getReport", "()Llive/hms/video/events/AnalyticsEvent;", "reset", "()V", "wasWebrtcPeer", "joined", "localPeerRoleChanged", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "Llive/hms/video/media/settings/HMSTrackSettings;", "Llive/hms/video/factories/noisecancellation/NoiseCancellationStatusChecker;", "Lkotlin/jvm/functions/Function1;", "", "TAG", "Ljava/lang/String;", "", "startTime", "J", AttachmentExtensionsKt.EXTRA_DURATION, "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NoiseCancellationReportingUseCase {
    private final String TAG;
    private long duration;
    private final HMSTrackSettings hmsTrackSettings;
    private final NoiseCancellationStatusChecker ncStatusChecker;
    private final Function1 sendRealtimeEvent;
    private long startTime;

    public NoiseCancellationReportingUseCase(HMSTrackSettings hmsTrackSettings, NoiseCancellationStatusChecker ncStatusChecker, Function1 sendRealtimeEvent) {
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        AbstractC22676k.m65750j(ncStatusChecker, "ncStatusChecker");
        AbstractC22676k.m65750j(sendRealtimeEvent, "sendRealtimeEvent");
        this.hmsTrackSettings = hmsTrackSettings;
        this.ncStatusChecker = ncStatusChecker;
        this.sendRealtimeEvent = sendRealtimeEvent;
        this.TAG = "NCReportingUseCase";
    }

    private final boolean isNcEnabledInTrackSettings() {
        HMSAudioTrackSettings audioSettings = this.hmsTrackSettings.getAudioSettings();
        return audioSettings != null && audioSettings.getEnableNoiseCancellation();
    }

    public final AnalyticsEvent getReport() {
        noiseCancellationState(false);
        long j7 = this.duration;
        if (j7 == 0) {
            return null;
        }
        AnalyticsEvent analyticsEventNoiseCancellationStats = AnalyticsEventFactory.INSTANCE.noiseCancellationStats(j7);
        Log.d(this.TAG, " Generating event " + analyticsEventNoiseCancellationStats);
        return analyticsEventNoiseCancellationStats;
    }

    public final void localPeerRoleChanged(Boolean isWebrtcPeer, Boolean wasWebrtcPeer, boolean joined) {
        if (!isNcEnabledInTrackSettings() || !joined) {
            Log.d(this.TAG, "Local peer role changed, ignoring since NC is not enabled by default or join: " + joined);
            return;
        }
        Log.d(this.TAG, "Local peer role changed wasWebrtc: " + wasWebrtcPeer + ", isWebrtc: " + isWebrtcPeer);
        Boolean bool = Boolean.TRUE;
        if (AbstractC22676k.m65745e(isWebrtcPeer, bool) && !AbstractC22676k.m65745e(wasWebrtcPeer, bool)) {
            noiseCancellationState(true);
        } else if (AbstractC22676k.m65745e(isWebrtcPeer, Boolean.FALSE) && AbstractC22676k.m65745e(wasWebrtcPeer, bool)) {
            noiseCancellationState(false);
        }
    }

    public final void noiseCancellationState(boolean enabled) {
        Log.d(this.TAG, "NC " + enabled);
        if (AbstractC22676k.m65745e(this.ncStatusChecker.isNoiseCancellationAvailable(), AvailabilityStatus.Available.INSTANCE)) {
            if (!enabled || this.startTime == 0) {
                if (enabled || this.startTime != 0) {
                    if (enabled) {
                        this.startTime = System.currentTimeMillis();
                    } else {
                        this.duration = (System.currentTimeMillis() - this.startTime) + this.duration;
                        this.startTime = 0L;
                    }
                    this.sendRealtimeEvent.invoke(AnalyticsEventFactory.INSTANCE.noiseCancellationStats(enabled));
                }
            }
        }
    }

    public final void peerJoined(boolean isWebrtcPeer, HMSTrackSettings hmsTrackSettings) {
        HMSAudioTrackSettings audioSettings;
        AbstractC22676k.m65750j(hmsTrackSettings, "hmsTrackSettings");
        if (isWebrtcPeer && (audioSettings = hmsTrackSettings.getAudioSettings()) != null && audioSettings.getEnableNoiseCancellation()) {
            Log.d(this.TAG, "Enabling noise cancellation from join");
            noiseCancellationState(true);
        }
    }

    public final void reset() {
        Log.d(this.TAG, "Resetting all values");
        this.startTime = 0L;
        this.duration = 0L;
    }
}
