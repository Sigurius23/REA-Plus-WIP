package n53;

import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26326g1 {

    /* JADX INFO: renamed from: a */
    public final long f104651a;

    /* JADX INFO: renamed from: b */
    public final String f104652b;

    /* JADX INFO: renamed from: c */
    public final Long f104653c;

    /* JADX INFO: renamed from: d */
    public final String f104654d;

    public C26326g1(long j7, String codec, Long l7, String str) {
        AbstractC22676k.m65750j(codec, "codec");
        this.f104651a = j7;
        this.f104652b = codec;
        this.f104653c = l7;
        this.f104654d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26326g1)) {
            return false;
        }
        C26326g1 c26326g1 = (C26326g1) obj;
        return this.f104651a == c26326g1.f104651a && AbstractC22676k.m65745e(this.f104652b, c26326g1.f104652b) && AbstractC22676k.m65745e(this.f104653c, c26326g1.f104653c) && AbstractC22676k.m65745e(this.f104654d, c26326g1.f104654d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.f104651a) * 31, 31, this.f104652b);
        Long l7 = this.f104653c;
        int iHashCode = (iM30450d + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str = this.f104654d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("SdpRtp(payload=", ", codec=", this.f104651a, this.f104652b);
        sbM114685m.append(", rate=");
        sbM114685m.append(this.f104653c);
        sbM114685m.append(", encoding=");
        sbM114685m.append(this.f104654d);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }
}
