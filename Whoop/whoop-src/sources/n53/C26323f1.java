package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26323f1 {

    /* JADX INFO: renamed from: a */
    public final String f104648a;

    public C26323f1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104648a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26323f1) && AbstractC22676k.m65745e(this.f104648a, ((C26323f1) obj).f104648a);
    }

    public final int hashCode() {
        return this.f104648a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpRtcprsize(value=", this.f104648a, ")");
    }
}
