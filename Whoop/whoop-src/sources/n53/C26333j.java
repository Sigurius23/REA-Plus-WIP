package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C26333j {

    /* JADX INFO: renamed from: a */
    public final String f104662a;

    public C26333j(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104662a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26333j) && AbstractC22676k.m65745e(this.f104662a, ((C26333j) obj).f104662a);
    }

    public final int hashCode() {
        return this.f104662a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpBfcpfloorctrl(value=", this.f104662a, ")");
    }
}
