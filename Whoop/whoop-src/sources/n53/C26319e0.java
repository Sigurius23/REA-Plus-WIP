package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26319e0 {

    /* JADX INFO: renamed from: a */
    public final String f104636a;

    public C26319e0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104636a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26319e0) && AbstractC22676k.m65745e(this.f104636a, ((C26319e0) obj).f104636a);
    }

    public final int hashCode() {
        return this.f104636a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpIcelite(value=", this.f104636a, ")");
    }
}
