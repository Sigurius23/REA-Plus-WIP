package p33;

import org.webrtc.MediaStreamTrack;
import p088dc.AbstractC11895b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.PeerType;

/* JADX INFO: renamed from: p33.q */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC28824q {
    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ String m87680a(MediaStreamTrack mediaStreamTrack) {
        String strM85628id = mediaStreamTrack.m85628id();
        String strKind = mediaStreamTrack.kind();
        boolean zEnabled = mediaStreamTrack.enabled();
        MediaStreamTrack.State state = mediaStreamTrack.state();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MediaStreamTrack(id=", strM85628id, ", kind=", strKind, ", enabled: ");
        sbM32001t.append(zEnabled);
        sbM32001t.append(", state=");
        sbM32001t.append(state);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ String m87681b(PeerType peerType) {
        AbstractC22676k.m65750j(peerType, "<this>");
        int i13 = AbstractC28823p.f116694a[peerType.ordinal()];
        if (i13 == 1) {
            return "publisher";
        }
        if (i13 == 2) {
            return "subscriber";
        }
        throw new NoWhenBranchMatchedException();
    }
}
