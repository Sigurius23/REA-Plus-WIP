package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C26330i {

    /* JADX INFO: renamed from: a */
    public final String f104659a;

    public C26330i(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104659a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26330i) && AbstractC22676k.m65745e(this.f104659a, ((C26330i) obj).f104659a);
    }

    public final int hashCode() {
        return this.f104659a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpBfcpconfid(value=", this.f104659a, ")");
    }
}
