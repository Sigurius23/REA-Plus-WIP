package re;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;

/* JADX INFO: renamed from: re.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31261c1 {

    /* JADX INFO: renamed from: a */
    public final String f128773a;

    /* JADX INFO: renamed from: b */
    public final List f128774b;

    public C31261c1(C29205p c29205p) {
        this.f128773a = (String) c29205p.f118204x;
        this.f128774b = (List) c29205p.f118205y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31261c1.class != obj.getClass()) {
            return false;
        }
        C31261c1 c31261c1 = (C31261c1) obj;
        return AbstractC22676k.m65745e(this.f128773a, c31261c1.f128773a) && AbstractC22676k.m65745e(this.f128774b, c31261c1.f128774b);
    }

    public final int hashCode() {
        String str = this.f128773a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 961;
        List list = this.f128774b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("UpdateUserAttributesRequest(accessToken=*** Sensitive Data Redacted ***,clientMetadata=null,");
        sb4.append("userAttributes=" + this.f128774b);
        sb4.append(")");
        return sb4.toString();
    }
}
