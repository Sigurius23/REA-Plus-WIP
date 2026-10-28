package p322m7;

import com.google.android.gms.location.FusedLocationProviderClient;
import hc3.AbstractC17176i;
import java.time.Instant;
import p452r7.C31036s;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m7.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C25167q {

    /* JADX INFO: renamed from: a */
    public final Instant f98743a;

    /* JADX INFO: renamed from: b */
    public final double f98744b;

    /* JADX INFO: renamed from: c */
    public final double f98745c;

    /* JADX INFO: renamed from: d */
    public final C31036s f98746d;

    /* JADX INFO: renamed from: e */
    public final C31036s f98747e;

    /* JADX INFO: renamed from: f */
    public final C31036s f98748f;

    public C25167q(Instant instant, double d3, double d14, C31036s c31036s, C31036s c31036s2, C31036s c31036s3) {
        this.f98743a = instant;
        this.f98744b = d3;
        this.f98745c = d14;
        this.f98746d = c31036s;
        this.f98747e = c31036s2;
        this.f98748f = c31036s3;
        AbstractC32073e.m99736b0(Double.valueOf(d3), Double.valueOf(-90.0d), "latitude");
        AbstractC32073e.m99738c0(Double.valueOf(d3), Double.valueOf(90.0d), "latitude");
        AbstractC32073e.m99736b0(Double.valueOf(d14), Double.valueOf(-180.0d), "longitude");
        AbstractC32073e.m99738c0(Double.valueOf(d14), Double.valueOf(180.0d), "longitude");
        if (c31036s != null) {
            AbstractC32073e.m99736b0(c31036s, c31036s.m95563b(), "horizontalAccuracy");
        }
        if (c31036s2 != null) {
            AbstractC32073e.m99736b0(c31036s2, c31036s2.m95563b(), FusedLocationProviderClient.KEY_VERTICAL_ACCURACY);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25167q)) {
            return false;
        }
        C25167q c25167q = (C25167q) obj;
        return AbstractC22676k.m65745e(this.f98743a, c25167q.f98743a) && this.f98744b == c25167q.f98744b && this.f98745c == c25167q.f98745c && AbstractC22676k.m65745e(this.f98746d, c25167q.f98746d) && AbstractC22676k.m65745e(this.f98747e, c25167q.f98747e) && AbstractC22676k.m65745e(this.f98748f, c25167q.f98748f);
    }

    public final int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(this.f98743a.hashCode() * 31, 31, this.f98744b), 31, this.f98745c);
        C31036s c31036s = this.f98746d;
        int iHashCode = (iM48499a + (c31036s != null ? c31036s.hashCode() : 0)) * 31;
        C31036s c31036s2 = this.f98747e;
        int iHashCode2 = (iHashCode + (c31036s2 != null ? c31036s2.hashCode() : 0)) * 31;
        C31036s c31036s3 = this.f98748f;
        return iHashCode2 + (c31036s3 != null ? c31036s3.hashCode() : 0);
    }
}
