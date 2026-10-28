package n53;

import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.o1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26350o1 {

    /* JADX INFO: renamed from: a */
    public final String f104761a;

    /* JADX INFO: renamed from: b */
    public final String f104762b;

    /* JADX INFO: renamed from: c */
    public final String f104763c;

    public C26350o1(String id4, String str, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        this.f104761a = id4;
        this.f104762b = str;
        this.f104763c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26350o1)) {
            return false;
        }
        C26350o1 c26350o1 = (C26350o1) obj;
        return AbstractC22676k.m65745e(this.f104761a, c26350o1.f104761a) && AbstractC22676k.m65745e(this.f104762b, c26350o1.f104762b) && AbstractC22676k.m65745e(this.f104763c, c26350o1.f104763c);
    }

    public final int hashCode() {
        int iHashCode = this.f104761a.hashCode() * 31;
        String str = this.f104762b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104763c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f104763c, ")", AbstractC11895b.m32001t("SdpSsrcs(id=", this.f104761a, ", attribute=", this.f104762b, ", value="));
    }
}
