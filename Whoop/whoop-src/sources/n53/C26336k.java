package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C26336k {

    /* JADX INFO: renamed from: a */
    public final String f104665a;

    /* JADX INFO: renamed from: b */
    public final String f104666b;

    public C26336k(String id4, String mStream) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(mStream, "mStream");
        this.f104665a = id4;
        this.f104666b = mStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26336k)) {
            return false;
        }
        C26336k c26336k = (C26336k) obj;
        return AbstractC22676k.m65745e(this.f104665a, c26336k.f104665a) && AbstractC22676k.m65745e(this.f104666b, c26336k.f104666b);
    }

    public final int hashCode() {
        return this.f104666b.hashCode() + (this.f104665a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpBfcpfloorid(id=", this.f104665a, ", mStream=", this.f104666b, ")");
    }
}
