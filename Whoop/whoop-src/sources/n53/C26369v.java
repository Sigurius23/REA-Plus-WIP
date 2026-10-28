package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C26369v {

    /* JADX INFO: renamed from: a */
    public final String f104790a;

    public C26369v(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104790a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26369v) && AbstractC22676k.m65745e(this.f104790a, ((C26369v) obj).f104790a);
    }

    public final int hashCode() {
        return this.f104790a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpEmail(value=", this.f104790a, ")");
    }
}
