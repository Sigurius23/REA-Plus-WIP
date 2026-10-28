package re;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.Map;
import p408q.C29662f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: re.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31286n0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC31268f f128816a;

    /* JADX INFO: renamed from: b */
    public final Map f128817b;

    /* JADX INFO: renamed from: c */
    public final String f128818c;

    /* JADX INFO: renamed from: d */
    public final Map f128819d;

    public C31286n0(C29662f c29662f) {
        this.f128816a = (AbstractC31268f) c29662f.f121230x;
        this.f128817b = (Map) c29662f.f121231y;
        this.f128818c = (String) c29662f.f121232z;
        this.f128819d = (Map) c29662f.f121228E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31286n0.class != obj.getClass()) {
            return false;
        }
        C31286n0 c31286n0 = (C31286n0) obj;
        return AbstractC22676k.m65745e(this.f128816a, c31286n0.f128816a) && AbstractC22676k.m65745e(this.f128817b, c31286n0.f128817b) && AbstractC22676k.m65745e(this.f128818c, c31286n0.f128818c) && AbstractC22676k.m65745e(this.f128819d, c31286n0.f128819d);
    }

    public final int hashCode() {
        AbstractC31268f abstractC31268f = this.f128816a;
        int iHashCode = (abstractC31268f != null ? abstractC31268f.hashCode() : 0) * 31;
        Map map = this.f128817b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f128818c;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Map map2 = this.f128819d;
        return (iHashCode3 + (map2 != null ? map2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InitiateAuthRequest(analyticsMetadata=null,");
        sb4.append("authFlow=" + this.f128816a + DateTimeRange.lowerUpperDelimiter);
        sb4.append("authParameters=*** Sensitive Data Redacted ***,clientId=*** Sensitive Data Redacted ***,");
        sb4.append("clientMetadata=" + this.f128819d + DateTimeRange.lowerUpperDelimiter);
        sb4.append("session=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***)");
        return sb4.toString();
    }
}
