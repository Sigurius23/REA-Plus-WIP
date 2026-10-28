package re;

import b30.C2570m;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: re.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31284m0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f128810a;

    /* JADX INFO: renamed from: b */
    public final String f128811b;

    /* JADX INFO: renamed from: c */
    public final Object f128812c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f128813d;

    /* JADX INFO: renamed from: e */
    public final String f128814e;

    public C31284m0(C2570m c2570m) {
        this.f128810a = (ArrayList) c2570m.f9987x;
        this.f128811b = (String) c2570m.f9988y;
        Object obj = c2570m.f9989z;
        if (obj == null) {
            throw new IllegalArgumentException("A non-null value must be provided for userAttributes");
        }
        this.f128812c = obj;
        this.f128813d = (ArrayList) c2570m.f9984E;
        String str = (String) c2570m.f9985F;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for username");
        }
        this.f128814e = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m96298a() {
        return this.f128811b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final List m96299b() {
        return this.f128812c;
    }

    /* JADX INFO: renamed from: c */
    public final List m96300c() {
        return this.f128813d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31284m0.class != obj.getClass()) {
            return false;
        }
        C31284m0 c31284m0 = (C31284m0) obj;
        return AbstractC22676k.m65745e(this.f128810a, c31284m0.f128810a) && AbstractC22676k.m65745e(this.f128811b, c31284m0.f128811b) && AbstractC22676k.m65745e(this.f128812c, c31284m0.f128812c) && AbstractC22676k.m65745e(this.f128813d, c31284m0.f128813d) && AbstractC22676k.m65745e(this.f128814e, c31284m0.f128814e);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f128810a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        String str = this.f128811b;
        int iM106644c = AbstractC33745d.m106644c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f128812c);
        ArrayList arrayList2 = this.f128813d;
        return this.f128814e.hashCode() + ((iM106644c + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GetUserResponse(");
        sb4.append("mfaOptions=" + this.f128810a + DateTimeRange.lowerUpperDelimiter);
        StringBuilder sbM94768q = AbstractC30802r.m94768q(new StringBuilder("preferredMfaSetting="), this.f128811b, DateTimeRange.lowerUpperDelimiter, sb4, "userAttributes=");
        sbM94768q.append(this.f128812c);
        sbM94768q.append(DateTimeRange.lowerUpperDelimiter);
        sb4.append(sbM94768q.toString());
        sb4.append("userMfaSettingList=" + this.f128813d + DateTimeRange.lowerUpperDelimiter);
        sb4.append("username=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
