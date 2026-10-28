package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26334j0 {

    /* JADX INFO: renamed from: a */
    public final String f104663a;

    public C26334j0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104663a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26334j0) && AbstractC22676k.m65745e(this.f104663a, ((C26334j0) obj).f104663a);
    }

    public final int hashCode() {
        return this.f104663a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpInvalid(value=", this.f104663a, ")");
    }
}
