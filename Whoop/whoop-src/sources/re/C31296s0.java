package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.LinkedHashMap;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31296s0 {

    /* JADX INFO: renamed from: a */
    public final C31273h f128838a;

    /* JADX INFO: renamed from: b */
    public final AbstractC31309z f128839b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f128840c;

    /* JADX INFO: renamed from: d */
    public final String f128841d;

    public C31296s0(C29662f c29662f) {
        this.f128838a = (C31273h) c29662f.f121230x;
        this.f128839b = (AbstractC31309z) c29662f.f121231y;
        this.f128840c = (LinkedHashMap) c29662f.f121232z;
        this.f128841d = (String) c29662f.f121228E;
    }

    /* JADX INFO: renamed from: a */
    public final C31273h m96305a() {
        return this.f128838a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC31309z m96306b() {
        return this.f128839b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31296s0.class != obj.getClass()) {
            return false;
        }
        C31296s0 c31296s0 = (C31296s0) obj;
        return AbstractC22676k.m65745e(this.f128838a, c31296s0.f128838a) && AbstractC22676k.m65745e(this.f128839b, c31296s0.f128839b) && AbstractC22676k.m65745e(this.f128840c, c31296s0.f128840c) && AbstractC22676k.m65745e(this.f128841d, c31296s0.f128841d);
    }

    public final int hashCode() {
        C31273h c31273h = this.f128838a;
        int iHashCode = (c31273h != null ? c31273h.hashCode() : 0) * 31;
        AbstractC31309z abstractC31309z = this.f128839b;
        int iHashCode2 = (iHashCode + (abstractC31309z != null ? abstractC31309z.hashCode() : 0)) * 31;
        LinkedHashMap linkedHashMap = this.f128840c;
        int iHashCode3 = (iHashCode2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0)) * 31;
        String str = this.f128841d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RespondToAuthChallengeResponse(");
        sb4.append("authenticationResult=" + this.f128838a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("challengeName=" + this.f128839b + DateTimeRange.lowerUpperDelimiter);
        sb4.append("challengeParameters=" + this.f128840c + DateTimeRange.lowerUpperDelimiter);
        sb4.append("session=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
