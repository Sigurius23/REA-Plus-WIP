package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C26351p {

    /* JADX INFO: renamed from: a */
    public final String f104764a;

    public C26351p(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104764a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26351p) && AbstractC22676k.m65745e(this.f104764a, ((C26351p) obj).f104764a);
    }

    public final int hashCode() {
        return this.f104764a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpConnectiontype(value=", this.f104764a, ")");
    }
}
