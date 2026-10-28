package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C26354q {

    /* JADX INFO: renamed from: a */
    public final String f104767a;

    public C26354q(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104767a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26354q) && AbstractC22676k.m65745e(this.f104767a, ((C26354q) obj).f104767a);
    }

    public final int hashCode() {
        return this.f104767a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpContent(value=", this.f104767a, ")");
    }
}
