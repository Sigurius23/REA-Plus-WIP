package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26337k0 {

    /* JADX INFO: renamed from: a */
    public final String f104667a;

    public C26337k0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104667a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26337k0) && AbstractC22676k.m65745e(this.f104667a, ((C26337k0) obj).f104667a);
    }

    public final int hashCode() {
        return this.f104667a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpKeywords(value=", this.f104667a, ")");
    }
}
