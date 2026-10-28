package live.hms.video.factories.noisecancellation;

import android.util.Log;
import hms.webrtc.AudioProcessingFactory;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/NoiseCancellationFake;", "Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "", "libraryPresent", "enabledFromDashboard", "<init>", "(ZZ)V", "enabled", "Lhms/webrtc/AudioProcessingFactory;", "getAudioProcessingFactory", "(Z)Lhms/webrtc/AudioProcessingFactory;", "Ll83/a0;", "setNoiseCancellationEnabled", "(Z)V", "getNoiseCancellationEnabled", "()Z", "Z", "getLibraryPresent", "getEnabledFromDashboard", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class NoiseCancellationFake implements NoiseCancellation {
    private final boolean enabledFromDashboard;
    private final boolean libraryPresent;

    public NoiseCancellationFake(boolean z4, boolean z13) {
        this.libraryPresent = z4;
        this.enabledFromDashboard = z13;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public AudioProcessingFactory getAudioProcessingFactory(boolean enabled) {
        Log.w(getNcLogTag(), "Noise Cancellation not loaded. Library added: " + this.libraryPresent + ", Enabled from dashboard " + this.enabledFromDashboard);
        return null;
    }

    public final boolean getEnabledFromDashboard() {
        return this.enabledFromDashboard;
    }

    public final boolean getLibraryPresent() {
        return this.libraryPresent;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public String getNcLogTag() {
        return NoiseCancellation.DefaultImpls.getNcLogTag(this);
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public boolean getNoiseCancellationEnabled() {
        return false;
    }

    @Override // live.hms.video.factories.noisecancellation.NoiseCancellation
    public void setNoiseCancellationEnabled(boolean enabled) {
        Log.w(getNcLogTag(), "Ignored because noise cancellation is disabled");
    }
}
