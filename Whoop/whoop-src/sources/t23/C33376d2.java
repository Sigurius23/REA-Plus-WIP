package t23;

import c43.C4207w;
import p031b9.AbstractC2875y;
import p460rg.AbstractC31375j;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: t23.d2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33376d2 extends AbstractC31375j {

    /* JADX INFO: renamed from: a */
    public final String f139332a;

    /* JADX INFO: renamed from: b */
    public final C4207w f139333b;

    /* JADX INFO: renamed from: c */
    public final boolean f139334c;

    /* JADX INFO: renamed from: d */
    public final boolean f139335d;

    public C33376d2(String sessionId, C4207w c4207w, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        TrackType.Companion companion = TrackType.INSTANCE;
        this.f139332a = sessionId;
        this.f139333b = c4207w;
        this.f139334c = z4;
        this.f139335d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33376d2)) {
            return false;
        }
        C33376d2 c33376d2 = (C33376d2) obj;
        return AbstractC22676k.m65745e(this.f139332a, c33376d2.f139332a) && AbstractC22676k.m65745e(this.f139333b, c33376d2.f139333b) && this.f139334c == c33376d2.f139334c && this.f139335d == c33376d2.f139335d;
    }

    public final int hashCode() {
        int iHashCode = this.f139332a.hashCode() * 31;
        C4207w c4207w = this.f139333b;
        return Boolean.hashCode(this.f139335d) + AbstractC2875y.m8289b((iHashCode + (c4207w == null ? 0 : c4207w.hashCode())) * 31, 31, this.f139334c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Video(sessionId=");
        sb4.append(this.f139332a);
        sb4.append(", track=");
        sb4.append(this.f139333b);
        sb4.append(", enabled=");
        return AbstractC36095b.m114682j(sb4, this.f139334c, ", paused=", this.f139335d, ")");
    }
}
