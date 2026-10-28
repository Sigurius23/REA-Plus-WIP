package t23;

import c43.C4185a;
import ih0.AbstractC18489d0;
import p460rg.AbstractC31375j;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: t23.b2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33364b2 extends AbstractC31375j {

    /* JADX INFO: renamed from: a */
    public final String f139228a;

    /* JADX INFO: renamed from: b */
    public final C4185a f139229b;

    /* JADX INFO: renamed from: c */
    public final boolean f139230c;

    public C33364b2(String sessionId, C4185a c4185a, boolean z4) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        TrackType.Companion companion = TrackType.INSTANCE;
        this.f139228a = sessionId;
        this.f139229b = c4185a;
        this.f139230c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33364b2)) {
            return false;
        }
        C33364b2 c33364b2 = (C33364b2) obj;
        return AbstractC22676k.m65745e(this.f139228a, c33364b2.f139228a) && AbstractC22676k.m65745e(this.f139229b, c33364b2.f139229b) && this.f139230c == c33364b2.f139230c;
    }

    public final int hashCode() {
        int iHashCode = this.f139228a.hashCode() * 31;
        C4185a c4185a = this.f139229b;
        return Boolean.hashCode(this.f139230c) + ((iHashCode + (c4185a == null ? 0 : c4185a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Audio(sessionId=");
        sb4.append(this.f139228a);
        sb4.append(", track=");
        sb4.append(this.f139229b);
        sb4.append(", enabled=");
        return AbstractC18489d0.m53372m(sb4, this.f139230c, ")");
    }
}
