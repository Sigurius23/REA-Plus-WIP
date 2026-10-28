package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26361s0 {

    /* JADX INFO: renamed from: a */
    public final String f104781a;

    public C26361s0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104781a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26361s0) && AbstractC22676k.m65745e(this.f104781a, ((C26361s0) obj).f104781a);
    }

    public final int hashCode() {
        return this.f104781a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpMsid(value=", this.f104781a, ")");
    }
}
