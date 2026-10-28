package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.l0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26340l0 {

    /* JADX INFO: renamed from: a */
    public final String f104670a;

    public C26340l0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104670a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26340l0) && AbstractC22676k.m65745e(this.f104670a, ((C26340l0) obj).f104670a);
    }

    public final int hashCode() {
        return this.f104670a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpLabel(value=", this.f104670a, ")");
    }
}
