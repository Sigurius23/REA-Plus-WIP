package e81;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: e81.x */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, m65681d2 = {"Le81/x;", "", "", "startAngle", "sweepAngle", "hitTargetStartAngle", "hitTargetSweepAngle", "<init>", "(FFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "c", "getHitTargetStartAngle", "d", "getHitTargetSweepAngle", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C12850x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float startAngle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float sweepAngle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float hitTargetStartAngle;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float hitTargetSweepAngle;

    public C12850x(float f13, float f14, float f15, float f16) {
        this.startAngle = f13;
        this.sweepAngle = f14;
        this.hitTargetStartAngle = f15;
        this.hitTargetSweepAngle = f16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getStartAngle() {
        return this.startAngle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSweepAngle() {
        return this.sweepAngle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C12850x)) {
            return false;
        }
        C12850x c12850x = (C12850x) other;
        return Float.compare(this.startAngle, c12850x.startAngle) == 0 && Float.compare(this.sweepAngle, c12850x.sweepAngle) == 0 && Float.compare(this.hitTargetStartAngle, c12850x.hitTargetStartAngle) == 0 && Float.compare(this.hitTargetSweepAngle, c12850x.hitTargetSweepAngle) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.hitTargetSweepAngle) + AbstractC11266d.m30447a(this.hitTargetStartAngle, AbstractC11266d.m30447a(this.sweepAngle, Float.hashCode(this.startAngle) * 31, 31), 31);
    }

    public String toString() {
        float f13 = this.startAngle;
        float f14 = this.sweepAngle;
        float f15 = this.hitTargetStartAngle;
        float f16 = this.hitTargetSweepAngle;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("PieChartDialSliceLayout(startAngle=", f13, ", sweepAngle=", f14, ", hitTargetStartAngle=");
        sbM8307t.append(f15);
        sbM8307t.append(", hitTargetSweepAngle=");
        sbM8307t.append(f16);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }
}
