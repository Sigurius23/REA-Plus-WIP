package bm2;

import com.whoop.design.util.TextResource;
import java.util.List;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: bm2.m0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, m65681d2 = {"Lbm2/m0;", "", "Lcom/whoop/design/util/TextResource;", "title", "Lbm2/o0;", "trendStat", "", "Lbm2/n0;", "mostRecentReading", "previousReading", "<init>", "(Lcom/whoop/design/util/TextResource;Lbm2/o0;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Lbm2/o0;", "d", "()Lbm2/o0;", "Ljava/util/List;", "()Ljava/util/List;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3460m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C3465o0 trendStat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C3463n0> mostRecentReading;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<C3463n0> previousReading;

    public C3460m0(TextResource title, C3465o0 trendStat, List<C3463n0> mostRecentReading, List<C3463n0> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trendStat, "trendStat");
        AbstractC22676k.m65750j(mostRecentReading, "mostRecentReading");
        this.title = title;
        this.trendStat = trendStat;
        this.mostRecentReading = mostRecentReading;
        this.previousReading = list;
    }

    /* JADX INFO: renamed from: a */
    public final List<C3463n0> m10151a() {
        return this.mostRecentReading;
    }

    /* JADX INFO: renamed from: b */
    public final List<C3463n0> m10152b() {
        return this.previousReading;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C3465o0 getTrendStat() {
        return this.trendStat;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3460m0)) {
            return false;
        }
        C3460m0 c3460m0 = (C3460m0) other;
        return AbstractC22676k.m65745e(this.title, c3460m0.title) && AbstractC22676k.m65745e(this.trendStat, c3460m0.trendStat) && AbstractC22676k.m65745e(this.mostRecentReading, c3460m0.mostRecentReading) && AbstractC22676k.m65745e(this.previousReading, c3460m0.previousReading);
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.trendStat.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.mostRecentReading);
        List<C3463n0> list = this.previousReading;
        return iM31983b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        C3465o0 c3465o0 = this.trendStat;
        List<C3463n0> list = this.mostRecentReading;
        List<C3463n0> list2 = this.previousReading;
        StringBuilder sb4 = new StringBuilder("SegmentalAnalysisSegmentViewState(title=");
        sb4.append(textResource);
        sb4.append(", trendStat=");
        sb4.append(c3465o0);
        sb4.append(", mostRecentReading=");
        return AbstractC30007c.m91843m(sb4, list, ", previousReading=", list2, ")");
    }
}
