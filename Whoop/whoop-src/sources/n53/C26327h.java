package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C26327h {

    /* JADX INFO: renamed from: a */
    public final String f104655a;

    /* JADX INFO: renamed from: b */
    public final String f104656b;

    public C26327h(String type, String limit) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(limit, "limit");
        this.f104655a = type;
        this.f104656b = limit;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26327h)) {
            return false;
        }
        C26327h c26327h = (C26327h) obj;
        return AbstractC22676k.m65745e(this.f104655a, c26327h.f104655a) && AbstractC22676k.m65745e(this.f104656b, c26327h.f104656b);
    }

    public final int hashCode() {
        return this.f104656b.hashCode() + (this.f104655a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpBandwidth(type=", this.f104655a, ", limit=", this.f104656b, ")");
    }
}
