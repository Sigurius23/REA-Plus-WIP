package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.p1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26353p1 {

    /* JADX INFO: renamed from: a */
    public final String f104766a;

    public C26353p1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104766a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26353p1) && AbstractC22676k.m65745e(this.f104766a, ((C26353p1) obj).f104766a);
    }

    public final int hashCode() {
        return this.f104766a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpTimezones(value=", this.f104766a, ")");
    }
}
