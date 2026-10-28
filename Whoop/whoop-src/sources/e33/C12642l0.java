package e33;

import c43.AbstractC4191g;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: e33.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12642l0 {

    /* JADX INFO: renamed from: a */
    public final String f43177a;

    /* JADX INFO: renamed from: b */
    public final TrackType f43178b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4191g f43179c;

    public C12642l0(String str, TrackType trackType, AbstractC4191g abstractC4191g) {
        this.f43177a = str;
        this.f43178b = trackType;
        this.f43179c = abstractC4191g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12642l0)) {
            return false;
        }
        C12642l0 c12642l0 = (C12642l0) obj;
        return AbstractC22676k.m65745e(this.f43177a, c12642l0.f43177a) && this.f43178b == c12642l0.f43178b && AbstractC22676k.m65745e(this.f43179c, c12642l0.f43179c);
    }

    public final int hashCode() {
        return this.f43179c.hashCode() + ((this.f43178b.hashCode() + (this.f43177a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ReceivedMediaStream(sessionId=" + this.f43177a + ", trackType=" + this.f43178b + ", mediaStream=" + this.f43179c + ")";
    }
}
