package live.hms.video.factories.noisecancellation;

import android.util.Log;
import c93.InterfaceC4339a;
import hms.webrtc.AudioProcessingFactory;
import hms.webrtc.KrispAudioProcessingImpl;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "Lhms/webrtc/KrispAudioProcessingImpl;", "krisp", "Lkotlin/Function0;", "", "isNoiseCancellationFlagEnabled", "<init>", "(Lhms/webrtc/KrispAudioProcessingImpl;Lc93/a;)V", "enabled", "Lhms/webrtc/AudioProcessingFactory;", "getAudioProcessingFactory", "(Z)Lhms/webrtc/AudioProcessingFactory;", "Ll83/a0;", "setNoiseCancellationEnabled", "(Z)V", "getNoiseCancellationEnabled", "()Z", "Lhms/webrtc/KrispAudioProcessingImpl;", "Lc93/a;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NoiseCancellationImpl implements NoiseCancellation {
    private final InterfaceC4339a isNoiseCancellationFlagEnabled;
    private final KrispAudioProcessingImpl krisp;

    public NoiseCancellationImpl(KrispAudioProcessingImpl krisp, InterfaceC4339a isNoiseCancellationFlagEnabled) {
        AbstractC22676k.m65750j(krisp, "krisp");
        AbstractC22676k.m65750j(isNoiseCancellationFlagEnabled, "isNoiseCancellationFlagEnabled");
        this.krisp = krisp;
        this.isNoiseCancellationFlagEnabled = isNoiseCancellationFlagEnabled;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public AudioProcessingFactory getAudioProcessingFactory(boolean enabled) {
        Log.d(getNcLogTag(), "Noise Cancellation Loaded!, initial state " + enabled + ", dashboard " + ((Boolean) this.isNoiseCancellationFlagEnabled.invoke()).booleanValue());
        setNoiseCancellationEnabled(enabled);
        return this.krisp;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public String getNcLogTag() {
        return NoiseCancellation.DefaultImpls.getNcLogTag(this);
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public boolean getNoiseCancellationEnabled() {
        return this.krisp.IsEnabled();
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public void setNoiseCancellationEnabled(boolean enabled) {
        this.krisp.Enable(enabled && ((Boolean) this.isNoiseCancellationFlagEnabled.invoke()).booleanValue());
    }
}
