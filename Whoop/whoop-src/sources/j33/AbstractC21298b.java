package j33;

import org.webrtc.RtpParameters;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.DegradationPreference;

/* JADX INFO: renamed from: j33.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC21298b {
    /* JADX INFO: renamed from: a */
    public static final RtpParameters.DegradationPreference m59802a(DegradationPreference degradationPreference) {
        AbstractC22676k.m65750j(degradationPreference, "<this>");
        int i13 = AbstractC21297a.f81375a[degradationPreference.ordinal()];
        if (i13 == 1) {
            return RtpParameters.DegradationPreference.BALANCED;
        }
        if (i13 == 2) {
            return RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE;
        }
        if (i13 == 3) {
            return RtpParameters.DegradationPreference.MAINTAIN_RESOLUTION;
        }
        if (i13 == 4) {
            return RtpParameters.DegradationPreference.MAINTAIN_FRAMERATE_AND_RESOLUTION;
        }
        if (i13 == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
