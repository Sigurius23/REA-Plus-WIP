package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.r0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31294r0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC31309z f128833a;

    /* JADX INFO: renamed from: b */
    public final Object f128834b;

    /* JADX INFO: renamed from: c */
    public final String f128835c;

    /* JADX INFO: renamed from: d */
    public final String f128836d;

    public C31294r0(C29662f c29662f) {
        this.f128833a = (AbstractC31309z) c29662f.f121230x;
        this.f128834b = c29662f.f121231y;
        this.f128835c = (String) c29662f.f121232z;
        this.f128836d = (String) c29662f.f121228E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31294r0.class != obj.getClass()) {
            return false;
        }
        C31294r0 c31294r0 = (C31294r0) obj;
        return AbstractC22676k.m65745e(this.f128833a, c31294r0.f128833a) && AbstractC22676k.m65745e(this.f128834b, c31294r0.f128834b) && AbstractC22676k.m65745e(this.f128835c, c31294r0.f128835c) && AbstractC22676k.m65745e(this.f128836d, c31294r0.f128836d);
    }

    public final int hashCode() {
        AbstractC31309z abstractC31309z = this.f128833a;
        int iHashCode = (abstractC31309z != null ? abstractC31309z.hashCode() : 0) * 31;
        Object obj = this.f128834b;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        String str = this.f128835c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 961;
        String str2 = this.f128836d;
        return (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("RespondToAuthChallengeRequest(analyticsMetadata=null,");
        sb4.append("challengeName=" + this.f128833a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("challengeResponses=*** Sensitive Data Redacted ***,clientId=*** Sensitive Data Redacted ***,clientMetadata=null,session=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
