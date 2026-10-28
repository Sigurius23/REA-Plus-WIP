package re;

import cd.C4421a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31254a0 {

    /* JADX INFO: renamed from: a */
    public final String f128758a;

    /* JADX INFO: renamed from: b */
    public final String f128759b;

    /* JADX INFO: renamed from: c */
    public final String f128760c;

    public C31254a0(C4421a c4421a) {
        this.f128758a = c4421a.f17885b;
        this.f128759b = c4421a.f17886c;
        this.f128760c = c4421a.f17887d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31254a0.class != obj.getClass()) {
            return false;
        }
        C31254a0 c31254a0 = (C31254a0) obj;
        return AbstractC22676k.m65745e(this.f128758a, c31254a0.f128758a) && AbstractC22676k.m65745e(this.f128759b, c31254a0.f128759b) && AbstractC22676k.m65745e(this.f128760c, c31254a0.f128760c);
    }

    public final int hashCode() {
        String str = this.f128758a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f128759b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f128760c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ChangePasswordRequest(accessToken=*** Sensitive Data Redacted ***,previousPassword=*** Sensitive Data Redacted ***,proposedPassword=*** Sensitive Data Redacted ***)";
    }
}
