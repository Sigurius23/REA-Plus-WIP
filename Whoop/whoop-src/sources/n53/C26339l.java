package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C26339l {

    /* JADX INFO: renamed from: a */
    public final String f104669a;

    public C26339l(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104669a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26339l) && AbstractC22676k.m65745e(this.f104669a, ((C26339l) obj).f104669a);
    }

    public final int hashCode() {
        return this.f104669a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpBfcpuserid(value=", this.f104669a, ")");
    }
}
