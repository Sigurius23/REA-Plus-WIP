package xk2;

import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xk2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lxk2/e;", "", "", "bodyWeightCorrection", "averageRepDurationSeconds", "maxAllowedRawStrain", "fixedLoadKg", "<init>", "(DDDD)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "c", "d", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38439e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double bodyWeightCorrection;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double averageRepDurationSeconds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final double maxAllowedRawStrain;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double fixedLoadKg;

    public C38439e(double d3, double d14, double d15, double d16) {
        this.bodyWeightCorrection = d3;
        this.averageRepDurationSeconds = d14;
        this.maxAllowedRawStrain = d15;
        this.fixedLoadKg = d16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAverageRepDurationSeconds() {
        return this.averageRepDurationSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getBodyWeightCorrection() {
        return this.bodyWeightCorrection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getFixedLoadKg() {
        return this.fixedLoadKg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getMaxAllowedRawStrain() {
        return this.maxAllowedRawStrain;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38439e)) {
            return false;
        }
        C38439e c38439e = (C38439e) other;
        return Double.compare(this.bodyWeightCorrection, c38439e.bodyWeightCorrection) == 0 && Double.compare(this.averageRepDurationSeconds, c38439e.averageRepDurationSeconds) == 0 && Double.compare(this.maxAllowedRawStrain, c38439e.maxAllowedRawStrain) == 0 && Double.compare(this.fixedLoadKg, c38439e.fixedLoadKg) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.fixedLoadKg) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.bodyWeightCorrection) * 31, 31, this.averageRepDurationSeconds), 31, this.maxAllowedRawStrain);
    }

    public String toString() {
        double d3 = this.bodyWeightCorrection;
        double d14 = this.averageRepDurationSeconds;
        double d15 = this.maxAllowedRawStrain;
        double d16 = this.fixedLoadKg;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("PassiveMskParameters(bodyWeightCorrection=", d3, ", averageRepDurationSeconds=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", maxAllowedRawStrain=", d15, ", fixedLoadKg=");
        return AbstractC30007c.m91836f(d16, ")", sbM8306s);
    }

    public /* synthetic */ C38439e(double d3, double d14, double d15, double d16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, d14, d15, (i13 & 8) != 0 ? 0.0d : d16);
    }
}
