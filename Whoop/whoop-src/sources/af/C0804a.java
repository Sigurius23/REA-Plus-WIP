package af;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: af.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0804a {

    /* JADX INFO: renamed from: a */
    public final String f2967a;

    /* JADX INFO: renamed from: b */
    public final String f2968b;

    /* JADX INFO: renamed from: c */
    public final String f2969c;

    public C0804a(String str, String str2, String str3) {
        this.f2967a = str;
        this.f2968b = str2;
        this.f2969c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804a)) {
            return false;
        }
        C0804a c0804a = (C0804a) obj;
        return AbstractC22676k.m65745e(this.f2967a, c0804a.f2967a) && AbstractC22676k.m65745e(this.f2968b, c0804a.f2968b) && AbstractC22676k.m65745e(this.f2969c, c0804a.f2969c);
    }

    public final int hashCode() {
        String str = this.f2967a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2968b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2969c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("XmlError(requestId=");
        sb4.append(this.f2967a);
        sb4.append(", code=");
        sb4.append(this.f2968b);
        sb4.append(", message=");
        return AbstractC25012a.m73377j(sb4, this.f2969c, ')');
    }
}
