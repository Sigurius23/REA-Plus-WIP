package bm2;

import cm2.EnumC4822j;
import hc3.AbstractC17176i;
import org.joda.time.DateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bm2.f0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, m65681d2 = {"Lbm2/f0;", "", "Lorg/joda/time/DateTime;", "dateTime", "", "weight", "bodyFat", "leanBodyMass", "Lcm2/j;", "metricType", "<init>", "(Lorg/joda/time/DateTime;DLjava/lang/Double;Ljava/lang/Double;Lcm2/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lorg/joda/time/DateTime;", "b", "()Lorg/joda/time/DateTime;", "D", "e", "()D", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "d", "Lcm2/j;", "()Lcm2/j;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3439f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DateTime dateTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double weight;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Double bodyFat;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Double leanBodyMass;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC4822j metricType;

    public C3439f0(DateTime dateTime, double d3, Double d14, Double d15, EnumC4822j metricType) {
        AbstractC22676k.m65750j(dateTime, "dateTime");
        AbstractC22676k.m65750j(metricType, "metricType");
        this.dateTime = dateTime;
        this.weight = d3;
        this.bodyFat = d14;
        this.leanBodyMass = d15;
        this.metricType = metricType;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getBodyFat() {
        return this.bodyFat;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getLeanBodyMass() {
        return this.leanBodyMass;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final EnumC4822j getMetricType() {
        return this.metricType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3439f0)) {
            return false;
        }
        C3439f0 c3439f0 = (C3439f0) other;
        return AbstractC22676k.m65745e(this.dateTime, c3439f0.dateTime) && Double.compare(this.weight, c3439f0.weight) == 0 && AbstractC22676k.m65745e(this.bodyFat, c3439f0.bodyFat) && AbstractC22676k.m65745e(this.leanBodyMass, c3439f0.leanBodyMass) && this.metricType == c3439f0.metricType;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(this.dateTime.hashCode() * 31, 31, this.weight);
        Double d3 = this.bodyFat;
        int iHashCode = (iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d14 = this.leanBodyMass;
        return this.metricType.hashCode() + ((iHashCode + (d14 != null ? d14.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ManualMeasurementResult(dateTime=" + this.dateTime + ", weight=" + this.weight + ", bodyFat=" + this.bodyFat + ", leanBodyMass=" + this.leanBodyMass + ", metricType=" + this.metricType + ")";
    }
}
