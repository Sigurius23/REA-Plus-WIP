package g40;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.g2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15356g2 {

    /* JADX INFO: renamed from: a */
    public final String f57729a;

    /* JADX INFO: renamed from: b */
    public final String f57730b;

    /* JADX INFO: renamed from: c */
    public final String f57731c;

    public /* synthetic */ C15356g2(String str, String str2) {
        this(str, str2, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15356g2)) {
            return false;
        }
        C15356g2 c15356g2 = (C15356g2) obj;
        return AbstractC22676k.m65745e(this.f57729a, c15356g2.f57729a) && AbstractC22676k.m65745e(this.f57730b, c15356g2.f57730b) && AbstractC22676k.m65745e(this.f57731c, c15356g2.f57731c);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f57729a.hashCode() * 31, 31, this.f57730b);
        String str = this.f57731c;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f57731c, ")", AbstractC11895b.m32001t("Metadata(prefix=", this.f57729a, ", regionCode=", this.f57730b, ", pattern="));
    }

    public C15356g2(String str, String str2, String str3) {
        this.f57729a = str;
        this.f57730b = str2;
        this.f57731c = str3;
        if (str3 != null && str3.length() <= 0) {
            throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.");
        }
    }
}
