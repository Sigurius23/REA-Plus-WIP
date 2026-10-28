package n53;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n53.c1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26314c1 {

    /* JADX INFO: renamed from: a */
    public final String f104623a;

    /* JADX INFO: renamed from: b */
    public final String f104624b;

    /* JADX INFO: renamed from: c */
    public final String f104625c;

    public C26314c1(String payload, String type, String str) {
        AbstractC22676k.m65750j(payload, "payload");
        AbstractC22676k.m65750j(type, "type");
        this.f104623a = payload;
        this.f104624b = type;
        this.f104625c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26314c1)) {
            return false;
        }
        C26314c1 c26314c1 = (C26314c1) obj;
        return AbstractC22676k.m65745e(this.f104623a, c26314c1.f104623a) && AbstractC22676k.m65745e(this.f104624b, c26314c1.f104624b) && AbstractC22676k.m65745e(this.f104625c, c26314c1.f104625c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f104623a.hashCode() * 31, 31, this.f104624b);
        String str = this.f104625c;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f104625c, ")", AbstractC11895b.m32001t("SdpRtcpfb(payload=", this.f104623a, ", type=", this.f104624b, ", subtype="));
    }
}
