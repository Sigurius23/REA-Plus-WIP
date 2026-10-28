package n53;

import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C26360s {

    /* JADX INFO: renamed from: a */
    public final long f104777a;

    /* JADX INFO: renamed from: b */
    public final String f104778b;

    /* JADX INFO: renamed from: c */
    public final String f104779c;

    /* JADX INFO: renamed from: d */
    public final String f104780d;

    public C26360s(String suite, String config, long j7, String str) {
        AbstractC22676k.m65750j(suite, "suite");
        AbstractC22676k.m65750j(config, "config");
        this.f104777a = j7;
        this.f104778b = suite;
        this.f104779c = config;
        this.f104780d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26360s)) {
            return false;
        }
        C26360s c26360s = (C26360s) obj;
        return this.f104777a == c26360s.f104777a && AbstractC22676k.m65745e(this.f104778b, c26360s.f104778b) && AbstractC22676k.m65745e(this.f104779c, c26360s.f104779c) && AbstractC22676k.m65745e(this.f104780d, c26360s.f104780d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Long.hashCode(this.f104777a) * 31, 31, this.f104778b), 31, this.f104779c);
        String str = this.f104780d;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpCrypto(id=", ", suite=", this.f104777a, this.f104778b);
        AbstractC11266d.m30444B(sbM114685m, ", config=", this.f104779c, ", sessionConfig=", this.f104780d);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
