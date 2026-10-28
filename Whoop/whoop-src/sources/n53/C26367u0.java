package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26367u0 {

    /* JADX INFO: renamed from: a */
    public final String f104788a;

    public C26367u0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104788a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26367u0) && AbstractC22676k.m65745e(this.f104788a, ((C26367u0) obj).f104788a);
    }

    public final int hashCode() {
        return this.f104788a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpName(value=", this.f104788a, ")");
    }
}
