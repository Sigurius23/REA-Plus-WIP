package z20;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C40014h {

    /* JADX INFO: renamed from: a */
    public final String f172626a;

    /* JADX INFO: renamed from: b */
    public final String f172627b;

    /* JADX INFO: renamed from: c */
    public final String f172628c;

    public C40014h(String id4, String ephemeralKeySecret, String str) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(ephemeralKeySecret, "ephemeralKeySecret");
        this.f172626a = id4;
        this.f172627b = ephemeralKeySecret;
        this.f172628c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40014h)) {
            return false;
        }
        C40014h c40014h = (C40014h) obj;
        return AbstractC22676k.m65745e(this.f172626a, c40014h.f172626a) && AbstractC22676k.m65745e(this.f172627b, c40014h.f172627b) && AbstractC22676k.m65745e(this.f172628c, c40014h.f172628c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f172626a.hashCode() * 31, 31, this.f172627b);
        String str = this.f172628c;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f172628c, ")", AbstractC11895b.m32001t("CustomerInfo(id=", this.f172626a, ", ephemeralKeySecret=", this.f172627b, ", customerSessionClientSecret="));
    }
}
