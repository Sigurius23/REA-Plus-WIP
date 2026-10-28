package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26379y0 {

    /* JADX INFO: renamed from: a */
    public final String f104824a;

    public C26379y0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104824a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26379y0) && AbstractC22676k.m65745e(this.f104824a, ((C26379y0) obj).f104824a);
    }

    public final int hashCode() {
        return this.f104824a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpRemotecandidates(value=", this.f104824a, ")");
    }
}
