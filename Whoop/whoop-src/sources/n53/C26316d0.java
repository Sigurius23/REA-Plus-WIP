package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26316d0 {

    /* JADX INFO: renamed from: a */
    public final String f104629a;

    /* JADX INFO: renamed from: b */
    public final String f104630b;

    public C26316d0(String type, String mids) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(mids, "mids");
        this.f104629a = type;
        this.f104630b = mids;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26316d0)) {
            return false;
        }
        C26316d0 c26316d0 = (C26316d0) obj;
        return AbstractC22676k.m65745e(this.f104629a, c26316d0.f104629a) && AbstractC22676k.m65745e(this.f104630b, c26316d0.f104630b);
    }

    public final int hashCode() {
        return this.f104630b.hashCode() + (this.f104629a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpGroups(type=", this.f104629a, ", mids=", this.f104630b, ")");
    }
}
