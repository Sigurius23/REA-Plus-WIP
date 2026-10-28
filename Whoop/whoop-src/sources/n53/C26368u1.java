package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.u1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26368u1 {

    /* JADX INFO: renamed from: a */
    public final String f104789a;

    public C26368u1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104789a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26368u1) && AbstractC22676k.m65745e(this.f104789a, ((C26368u1) obj).f104789a);
    }

    public final int hashCode() {
        return this.f104789a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpXgoogleflag(value=", this.f104789a, ")");
    }
}
