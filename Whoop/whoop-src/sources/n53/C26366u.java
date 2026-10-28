package n53;

import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C26366u {

    /* JADX INFO: renamed from: a */
    public final String f104787a;

    public C26366u(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f104787a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26366u) && AbstractC22676k.m65745e(this.f104787a, ((C26366u) obj).f104787a);
    }

    public final int hashCode() {
        return this.f104787a.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SdpDirection(value=", this.f104787a, ")");
    }
}
