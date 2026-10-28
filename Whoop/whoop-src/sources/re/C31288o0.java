package re;

import b30.C2570m;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31288o0 {

    /* JADX INFO: renamed from: a */
    public final C31273h f128821a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f128822b;

    /* JADX INFO: renamed from: c */
    public final AbstractC31309z f128823c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f128824d;

    /* JADX INFO: renamed from: e */
    public final String f128825e;

    public C31288o0(C2570m c2570m) {
        this.f128821a = (C31273h) c2570m.f9987x;
        this.f128822b = (ArrayList) c2570m.f9988y;
        this.f128823c = (AbstractC31309z) c2570m.f9989z;
        this.f128824d = (LinkedHashMap) c2570m.f9984E;
        this.f128825e = (String) c2570m.f9985F;
    }

    /* JADX INFO: renamed from: a */
    public final C31273h m96301a() {
        return this.f128821a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC31309z m96302b() {
        return this.f128823c;
    }

    /* JADX INFO: renamed from: c */
    public final Map m96303c() {
        return this.f128824d;
    }

    /* JADX INFO: renamed from: d */
    public final String m96304d() {
        return this.f128825e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31288o0.class != obj.getClass()) {
            return false;
        }
        C31288o0 c31288o0 = (C31288o0) obj;
        return AbstractC22676k.m65745e(this.f128821a, c31288o0.f128821a) && AbstractC22676k.m65745e(this.f128822b, c31288o0.f128822b) && AbstractC22676k.m65745e(this.f128823c, c31288o0.f128823c) && AbstractC22676k.m65745e(this.f128824d, c31288o0.f128824d) && AbstractC22676k.m65745e(this.f128825e, c31288o0.f128825e);
    }

    public final int hashCode() {
        C31273h c31273h = this.f128821a;
        int iHashCode = (c31273h != null ? c31273h.hashCode() : 0) * 31;
        ArrayList arrayList = this.f128822b;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        AbstractC31309z abstractC31309z = this.f128823c;
        int iHashCode3 = (iHashCode2 + (abstractC31309z != null ? abstractC31309z.hashCode() : 0)) * 31;
        LinkedHashMap linkedHashMap = this.f128824d;
        int iHashCode4 = (iHashCode3 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0)) * 31;
        String str = this.f128825e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InitiateAuthResponse(");
        sb4.append("authenticationResult=" + this.f128821a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("availableChallenges=" + this.f128822b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("challengeName=" + this.f128823c + DateTimeRange.lowerUpperDelimiter);
        sb4.append("challengeParameters=" + this.f128824d + DateTimeRange.lowerUpperDelimiter);
        sb4.append("session=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
