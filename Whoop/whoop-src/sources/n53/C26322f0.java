package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26322f0 {

    /* JADX INFO: renamed from: a */
    public final String f104647a;

    public C26322f0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104647a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26322f0) && AbstractC22676k.m65745e(this.f104647a, ((C26322f0) obj).f104647a);
    }

    public final int hashCode() {
        return this.f104647a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpIceoptions(value=", this.f104647a, ")");
    }
}
