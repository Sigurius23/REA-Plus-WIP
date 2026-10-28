package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.k1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26338k1 {

    /* JADX INFO: renamed from: a */
    public final String f104668a;

    public C26338k1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104668a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26338k1) && AbstractC22676k.m65745e(this.f104668a, ((C26338k1) obj).f104668a);
    }

    public final int hashCode() {
        return this.f104668a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpSimulcast03(value=", this.f104668a, ")");
    }
}
