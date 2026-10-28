package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26364t0 {

    /* JADX INFO: renamed from: a */
    public final String f104784a;

    /* JADX INFO: renamed from: b */
    public final String f104785b;

    public C26364t0(String semantic, String token) {
        AbstractC22676k.m65750j(semantic, "semantic");
        AbstractC22676k.m65750j(token, "token");
        this.f104784a = semantic;
        this.f104785b = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26364t0)) {
            return false;
        }
        C26364t0 c26364t0 = (C26364t0) obj;
        return AbstractC22676k.m65745e(this.f104784a, c26364t0.f104784a) && AbstractC22676k.m65745e(this.f104785b, c26364t0.f104785b);
    }

    public final int hashCode() {
        return this.f104785b.hashCode() + (this.f104784a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpMsidsemantic(semantic=", this.f104784a, ", token=", this.f104785b, ")");
    }
}
