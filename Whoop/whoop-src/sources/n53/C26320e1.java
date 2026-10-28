package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26320e1 {

    /* JADX INFO: renamed from: a */
    public final String f104637a;

    public C26320e1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104637a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26320e1) && AbstractC22676k.m65745e(this.f104637a, ((C26320e1) obj).f104637a);
    }

    public final int hashCode() {
        return this.f104637a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpRtcpmux(value=", this.f104637a, ")");
    }
}
