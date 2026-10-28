package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26355q0 {

    /* JADX INFO: renamed from: a */
    public final String f104768a;

    public C26355q0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104768a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26355q0) && AbstractC22676k.m65745e(this.f104768a, ((C26355q0) obj).f104768a);
    }

    public final int hashCode() {
        return this.f104768a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpMid(value=", this.f104768a, ")");
    }
}
