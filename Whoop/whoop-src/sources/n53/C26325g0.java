package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26325g0 {

    /* JADX INFO: renamed from: a */
    public final String f104650a;

    public C26325g0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104650a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26325g0) && AbstractC22676k.m65745e(this.f104650a, ((C26325g0) obj).f104650a);
    }

    public final int hashCode() {
        return this.f104650a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpIcepwd(value=", this.f104650a, ")");
    }
}
