package ak1;

import hy0.EnumC17727b2;
import java.util.Map;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ak1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lak1/a;", "", "Lhy0/b2;", "highestSeverityStatus", "", "metricsWithValues", "metricsInRange", "", "", "ranges", "<init>", "(Lhy0/b2;IILjava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhy0/b2;", "()Lhy0/b2;", "b", "I", "c", "d", "Ljava/util/Map;", "()Ljava/util/Map;", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0948a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC17727b2 highestSeverityStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int metricsWithValues;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int metricsInRange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, EnumC17727b2> ranges;

    /* JADX WARN: Multi-variable type inference failed */
    public C0948a(EnumC17727b2 highestSeverityStatus, int i13, int i14, Map<String, ? extends EnumC17727b2> ranges) {
        AbstractC22676k.m65750j(highestSeverityStatus, "highestSeverityStatus");
        AbstractC22676k.m65750j(ranges, "ranges");
        this.highestSeverityStatus = highestSeverityStatus;
        this.metricsWithValues = i13;
        this.metricsInRange = i14;
        this.ranges = ranges;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC17727b2 getHighestSeverityStatus() {
        return this.highestSeverityStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMetricsInRange() {
        return this.metricsInRange;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMetricsWithValues() {
        return this.metricsWithValues;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, EnumC17727b2> m2386d() {
        return this.ranges;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0948a)) {
            return false;
        }
        C0948a c0948a = (C0948a) other;
        return this.highestSeverityStatus == c0948a.highestSeverityStatus && this.metricsWithValues == c0948a.metricsWithValues && this.metricsInRange == c0948a.metricsInRange && AbstractC22676k.m65745e(this.ranges, c0948a.ranges);
    }

    public int hashCode() {
        return this.ranges.hashCode() + AbstractC11266d.m30448b(this.metricsInRange, AbstractC11266d.m30448b(this.metricsWithValues, this.highestSeverityStatus.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "ComposableHealthMonitorAnalyticsState(highestSeverityStatus=" + this.highestSeverityStatus + ", metricsWithValues=" + this.metricsWithValues + ", metricsInRange=" + this.metricsInRange + ", ranges=" + this.ranges + ")";
    }
}
