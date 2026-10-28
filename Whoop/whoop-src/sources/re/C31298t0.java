package re;

import p255jk.C21745c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31298t0 {

    /* JADX INFO: renamed from: a */
    public final String f128843a;

    /* JADX INFO: renamed from: b */
    public final String f128844b;

    public C31298t0(C21745c c21745c) {
        this.f128843a = c21745c.f83655a;
        this.f128844b = c21745c.f83656b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31298t0.class != obj.getClass()) {
            return false;
        }
        C31298t0 c31298t0 = (C31298t0) obj;
        return AbstractC22676k.m65745e(this.f128843a, c31298t0.f128843a) && AbstractC22676k.m65745e(this.f128844b, c31298t0.f128844b);
    }

    public final int hashCode() {
        String str = this.f128843a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 961;
        String str2 = this.f128844b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RevokeTokenRequest(clientId=*** Sensitive Data Redacted ***,clientSecret=*** Sensitive Data Redacted ***,token=*** Sensitive Data Redacted ***)";
    }
}
