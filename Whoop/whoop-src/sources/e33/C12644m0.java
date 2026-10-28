package e33;

import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: e33.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12644m0 {

    /* JADX INFO: renamed from: a */
    public final String f43183a;

    /* JADX INFO: renamed from: b */
    public final TrackType f43184b;

    public C12644m0(String str, TrackType trackType) {
        this.f43183a = str;
        this.f43184b = trackType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12644m0)) {
            return false;
        }
        C12644m0 c12644m0 = (C12644m0) obj;
        return AbstractC22676k.m65745e(this.f43183a, c12644m0.f43183a) && this.f43184b == c12644m0.f43184b;
    }

    public final int hashCode() {
        return this.f43184b.hashCode() + (this.f43183a.hashCode() * 31);
    }

    public final String toString() {
        return "RemovedMediaStream(sessionId=" + this.f43183a + ", trackType=" + this.f43184b + ")";
    }
}
