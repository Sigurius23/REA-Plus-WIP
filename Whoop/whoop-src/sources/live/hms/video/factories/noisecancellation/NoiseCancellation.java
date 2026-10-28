package live.hms.video.factories.noisecancellation;

import hms.webrtc.AudioProcessingFactory;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Llive/hms/video/factories/noisecancellation/NoiseCancellation;", "", "", "enabled", "Lhms/webrtc/AudioProcessingFactory;", "getAudioProcessingFactory", "(Z)Lhms/webrtc/AudioProcessingFactory;", "Ll83/a0;", "setNoiseCancellationEnabled", "(Z)V", "getNoiseCancellationEnabled", "()Z", "", "getNcLogTag", "()Ljava/lang/String;", "ncLogTag", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public interface NoiseCancellation {

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static String getNcLogTag(NoiseCancellation noiseCancellation) {
            return "HmsNoiseCancellation";
        }
    }

    AudioProcessingFactory getAudioProcessingFactory(boolean enabled);

    String getNcLogTag();

    boolean getNoiseCancellationEnabled();

    void setNoiseCancellationEnabled(boolean enabled);
}
