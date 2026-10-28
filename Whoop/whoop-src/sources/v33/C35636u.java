package v33;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v33.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C35636u extends AbstractC35638w {

    /* JADX INFO: renamed from: a */
    public final String f151439a;

    public C35636u(String sdp) {
        AbstractC22676k.m65750j(sdp, "sdp");
        this.f151439a = sdp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35636u) && AbstractC22676k.m65745e(this.f151439a, ((C35636u) obj).f151439a);
    }

    public final int hashCode() {
        return this.f151439a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PublisherAnswerEvent(sdp=", this.f151439a, ")");
    }
}
