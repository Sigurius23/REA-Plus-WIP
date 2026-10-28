package n53;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C26381z {

    /* JADX INFO: renamed from: a */
    public final String f104828a;

    /* JADX INFO: renamed from: b */
    public final String f104829b;

    public C26381z(String type, String hash) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(hash, "hash");
        this.f104828a = type;
        this.f104829b = hash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26381z)) {
            return false;
        }
        C26381z c26381z = (C26381z) obj;
        return AbstractC22676k.m65745e(this.f104828a, c26381z.f104828a) && AbstractC22676k.m65745e(this.f104829b, c26381z.f104829b);
    }

    public final int hashCode() {
        return this.f104829b.hashCode() + (this.f104828a.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SdpFingerprint(type=", this.f104828a, ", hash=", this.f104829b, ")");
    }
}
