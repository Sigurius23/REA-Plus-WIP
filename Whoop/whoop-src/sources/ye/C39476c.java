package ye;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ye.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C39476c {

    /* JADX INFO: renamed from: a */
    public final String f169859a;

    /* JADX INFO: renamed from: b */
    public final String f169860b;

    /* JADX INFO: renamed from: c */
    public final String f169861c;

    public C39476c(String str, String str2, String str3) {
        this.f169859a = str;
        this.f169860b = str2;
        this.f169861c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39476c)) {
            return false;
        }
        C39476c c39476c = (C39476c) obj;
        return AbstractC22676k.m65745e(this.f169859a, c39476c.f169859a) && AbstractC22676k.m65745e(this.f169860b, c39476c.f169860b) && AbstractC22676k.m65745e(this.f169861c, c39476c.f169861c);
    }

    public final int hashCode() {
        String str = this.f169859a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f169860b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f169861c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ErrorDetails(code=");
        sb4.append(this.f169859a);
        sb4.append(", message=");
        sb4.append(this.f169860b);
        sb4.append(", requestId=");
        return AbstractC25012a.m73377j(sb4, this.f169861c, ')');
    }
}
