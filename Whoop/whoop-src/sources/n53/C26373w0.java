package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26373w0 {

    /* JADX INFO: renamed from: a */
    public final String f104802a;

    public C26373w0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104802a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26373w0) && AbstractC22676k.m65745e(this.f104802a, ((C26373w0) obj).f104802a);
    }

    public final int hashCode() {
        return this.f104802a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpPhone(value=", this.f104802a, ")");
    }
}
