package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26328h0 {

    /* JADX INFO: renamed from: a */
    public final String f104657a;

    public C26328h0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104657a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26328h0) && AbstractC22676k.m65745e(this.f104657a, ((C26328h0) obj).f104657a);
    }

    public final int hashCode() {
        return this.f104657a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpIceufrag(value=", this.f104657a, ")");
    }
}
