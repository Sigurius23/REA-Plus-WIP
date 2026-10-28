package xk2;

import com.mapbox.common.HttpHeaders;
import com.whoop.domain.model.GenderBaseline;
import hc3.AbstractC17176i;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0016\u0010\u0011¨\u0006!"}, m65681d2 = {"Lxk2/h;", "", "", "restingHeartRate", "maximumHeartRate", "Lcom/whoop/domain/model/GenderBaseline;", "baseline", "weightKg", "heightM", "", HttpHeaders.AGE, "<init>", "(DDLcom/whoop/domain/model/GenderBaseline;DDI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "e", "()D", "b", "d", "c", "Lcom/whoop/domain/model/GenderBaseline;", "()Lcom/whoop/domain/model/GenderBaseline;", "f", "I", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38442h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double restingHeartRate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double maximumHeartRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final GenderBaseline baseline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double weightKg;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double heightM;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int age;

    public C38442h(double d3, double d14, GenderBaseline baseline, double d15, double d16, int i13) {
        AbstractC22676k.m65750j(baseline, "baseline");
        this.restingHeartRate = d3;
        this.maximumHeartRate = d14;
        this.baseline = baseline;
        this.weightKg = d15;
        this.heightM = d16;
        this.age = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAge() {
        return this.age;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GenderBaseline getBaseline() {
        return this.baseline;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getHeightM() {
        return this.heightM;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getMaximumHeartRate() {
        return this.maximumHeartRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getRestingHeartRate() {
        return this.restingHeartRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38442h)) {
            return false;
        }
        C38442h c38442h = (C38442h) other;
        return Double.compare(this.restingHeartRate, c38442h.restingHeartRate) == 0 && Double.compare(this.maximumHeartRate, c38442h.maximumHeartRate) == 0 && this.baseline == c38442h.baseline && Double.compare(this.weightKg, c38442h.weightKg) == 0 && Double.compare(this.heightM, c38442h.heightM) == 0 && this.age == c38442h.age;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getWeightKg() {
        return this.weightKg;
    }

    public int hashCode() {
        return Integer.hashCode(this.age) + AbstractC17176i.m48499a(AbstractC17176i.m48499a((this.baseline.hashCode() + AbstractC17176i.m48499a(Double.hashCode(this.restingHeartRate) * 31, 31, this.maximumHeartRate)) * 31, 31, this.weightKg), 31, this.heightM);
    }

    public String toString() {
        double d3 = this.restingHeartRate;
        double d14 = this.maximumHeartRate;
        GenderBaseline genderBaseline = this.baseline;
        double d15 = this.weightKg;
        double d16 = this.heightM;
        int i13 = this.age;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("StrainProfile(restingHeartRate=", d3, ", maximumHeartRate=");
        sbM8306s.append(d14);
        sbM8306s.append(", baseline=");
        sbM8306s.append(genderBaseline);
        AbstractC31061c.m95622B(sbM8306s, ", weightKg=", d15, ", heightM=");
        sbM8306s.append(d16);
        sbM8306s.append(", age=");
        sbM8306s.append(i13);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }
}
