package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.s1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26362s1 {

    /* JADX INFO: renamed from: a */
    public final String f104782a;

    public C26362s1(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104782a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26362s1) && AbstractC22676k.m65745e(this.f104782a, ((C26362s1) obj).f104782a);
    }

    public final int hashCode() {
        return this.f104782a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpUri(value=", this.f104782a, ")");
    }
}
