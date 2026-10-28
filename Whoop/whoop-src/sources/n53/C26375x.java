package n53;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C26375x {

    /* JADX INFO: renamed from: a */
    public final long f104810a;

    /* JADX INFO: renamed from: b */
    public final String f104811b;

    /* JADX INFO: renamed from: c */
    public final String f104812c;

    /* JADX INFO: renamed from: d */
    public final String f104813d;

    /* JADX INFO: renamed from: e */
    public final String f104814e;

    public C26375x(long j7, String str, String str2, String uri, String str3) {
        AbstractC22676k.m65750j(uri, "uri");
        this.f104810a = j7;
        this.f104811b = str;
        this.f104812c = str2;
        this.f104813d = uri;
        this.f104814e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26375x)) {
            return false;
        }
        C26375x c26375x = (C26375x) obj;
        return this.f104810a == c26375x.f104810a && AbstractC22676k.m65745e(this.f104811b, c26375x.f104811b) && AbstractC22676k.m65745e(this.f104812c, c26375x.f104812c) && AbstractC22676k.m65745e(this.f104813d, c26375x.f104813d) && AbstractC22676k.m65745e(this.f104814e, c26375x.f104814e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f104810a) * 31;
        String str = this.f104811b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104812c;
        int iM30450d = AbstractC11266d.m30450d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f104813d);
        String str3 = this.f104814e;
        return iM30450d + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpExt(value=", ", direction=", this.f104810a, this.f104811b);
        AbstractC11266d.m30444B(sbM114685m, ", encryptUri=", this.f104812c, ", uri=", this.f104813d);
        return AbstractC2875y.m8304q(sbM114685m, ", config=", this.f104814e, ")");
    }
}
