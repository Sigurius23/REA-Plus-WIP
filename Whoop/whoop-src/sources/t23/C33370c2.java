package t23;

import c43.C4207w;
import ih0.AbstractC18489d0;
import p460rg.AbstractC31375j;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.TrackType;

/* JADX INFO: renamed from: t23.c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33370c2 extends AbstractC31375j {

    /* JADX INFO: renamed from: a */
    public final String f139318a;

    /* JADX INFO: renamed from: b */
    public final C4207w f139319b;

    /* JADX INFO: renamed from: c */
    public final boolean f139320c;

    public C33370c2(String sessionId, C4207w c4207w, boolean z4) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        TrackType.Companion companion = TrackType.INSTANCE;
        this.f139318a = sessionId;
        this.f139319b = c4207w;
        this.f139320c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33370c2)) {
            return false;
        }
        C33370c2 c33370c2 = (C33370c2) obj;
        return AbstractC22676k.m65745e(this.f139318a, c33370c2.f139318a) && AbstractC22676k.m65745e(this.f139319b, c33370c2.f139319b) && this.f139320c == c33370c2.f139320c;
    }

    public final int hashCode() {
        int iHashCode = this.f139318a.hashCode() * 31;
        C4207w c4207w = this.f139319b;
        return Boolean.hashCode(this.f139320c) + ((iHashCode + (c4207w == null ? 0 : c4207w.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ScreenSharing(sessionId=");
        sb4.append(this.f139318a);
        sb4.append(", track=");
        sb4.append(this.f139319b);
        sb4.append(", enabled=");
        return AbstractC18489d0.m53372m(sb4, this.f139320c, ")");
    }
}
