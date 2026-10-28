package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26331i0 {

    /* JADX INFO: renamed from: a */
    public final String f104660a;

    public C26331i0(String pt3) {
        AbstractC22676k.m65750j(pt3, "pt");
        this.f104660a = pt3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26331i0) && AbstractC22676k.m65745e(this.f104660a, ((C26331i0) obj).f104660a);
    }

    public final int hashCode() {
        return this.f104660a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpImageattrs(pt=", this.f104660a, ")");
    }
}
