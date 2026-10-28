package sq2;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p181h2.C16617b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: sq2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0082\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\b9\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\b4\u0010=R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b2\u0010=R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b>\u0010/R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010+R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\b(\u0010+R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bD\u0010-\u001a\u0004\bE\u0010/R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010/R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010-\u001a\u0004\bI\u0010/R\u0017\u0010\u0019\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\b@\u0010=R\u0017\u0010\u001a\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\b:\u0010=R\u0017\u0010\u001b\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bL\u0010;\u001a\u0004\b8\u0010=¨\u0006M"}, m65681d2 = {"Lsq2/h;", "", "", "sweepAngle", "", "cornerRadius", "startAngleRad", "endAngleRad", "startCos", "startSin", "endCos", "endSin", "Lh2/b;", "startOuter", "startInner", "endOuter", "endInner", "outerArcAdjustment", "innerArcAdjustment", "adjustedOuterStartAngle", "adjustedInnerStartAngle", "adjustedInnerEndAngle", "outerArcStartAngleRad", "innerArcStartAngleRad", "innerArcEndAngleRad", "outerArcStart", "innerArcStart", "innerArcEnd", "<init>", "(DFFFFFFFJJJJFFDDDFFFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "o", "()D", "b", "F", "c", "()F", "l", "d", "e", "getStartCos", "f", "getStartSin", "g", "getEndCos", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getEndSin", "i", "J", "n", "()J", "j", "m", "k", "p", "getAdjustedInnerStartAngle", "q", "r", "getOuterArcStartAngleRad", "s", "getInnerArcStartAngleRad", "t", "getInnerArcEndAngleRad", "u", "v", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C32891h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final double sweepAngle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float startAngleRad;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float endAngleRad;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float startCos;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float startSin;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float endCos;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float endSin;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final long startOuter;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long startInner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final long endOuter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final long endInner;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float outerArcAdjustment;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float innerArcAdjustment;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final double adjustedOuterStartAngle;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final double adjustedInnerStartAngle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final double adjustedInnerEndAngle;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float outerArcStartAngleRad;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final float innerArcStartAngleRad;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final float innerArcEndAngleRad;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final long outerArcStart;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final long innerArcStart;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final long innerArcEnd;

    public /* synthetic */ C32891h(double d3, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j7, long j13, long j14, long j15, float f24, float f25, double d14, double d15, double d16, float f26, float f27, float f28, long j16, long j17, long j18, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, f13, f14, f15, f16, f17, f18, f19, j7, j13, j14, j15, f24, f25, d14, d15, d16, f26, f27, f28, j16, j17, j18);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAdjustedInnerEndAngle() {
        return this.adjustedInnerEndAngle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAdjustedOuterStartAngle() {
        return this.adjustedOuterStartAngle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getEndAngleRad() {
        return this.endAngleRad;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getEndInner() {
        return this.endInner;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32891h)) {
            return false;
        }
        C32891h c32891h = (C32891h) other;
        return Double.compare(this.sweepAngle, c32891h.sweepAngle) == 0 && Float.compare(this.cornerRadius, c32891h.cornerRadius) == 0 && Float.compare(this.startAngleRad, c32891h.startAngleRad) == 0 && Float.compare(this.endAngleRad, c32891h.endAngleRad) == 0 && Float.compare(this.startCos, c32891h.startCos) == 0 && Float.compare(this.startSin, c32891h.startSin) == 0 && Float.compare(this.endCos, c32891h.endCos) == 0 && Float.compare(this.endSin, c32891h.endSin) == 0 && C16617b.m47187c(this.startOuter, c32891h.startOuter) && C16617b.m47187c(this.startInner, c32891h.startInner) && C16617b.m47187c(this.endOuter, c32891h.endOuter) && C16617b.m47187c(this.endInner, c32891h.endInner) && Float.compare(this.outerArcAdjustment, c32891h.outerArcAdjustment) == 0 && Float.compare(this.innerArcAdjustment, c32891h.innerArcAdjustment) == 0 && Double.compare(this.adjustedOuterStartAngle, c32891h.adjustedOuterStartAngle) == 0 && Double.compare(this.adjustedInnerStartAngle, c32891h.adjustedInnerStartAngle) == 0 && Double.compare(this.adjustedInnerEndAngle, c32891h.adjustedInnerEndAngle) == 0 && Float.compare(this.outerArcStartAngleRad, c32891h.outerArcStartAngleRad) == 0 && Float.compare(this.innerArcStartAngleRad, c32891h.innerArcStartAngleRad) == 0 && Float.compare(this.innerArcEndAngleRad, c32891h.innerArcEndAngleRad) == 0 && C16617b.m47187c(this.outerArcStart, c32891h.outerArcStart) && C16617b.m47187c(this.innerArcStart, c32891h.innerArcStart) && C16617b.m47187c(this.innerArcEnd, c32891h.innerArcEnd);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getEndOuter() {
        return this.endOuter;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getInnerArcAdjustment() {
        return this.innerArcAdjustment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getInnerArcEnd() {
        return this.innerArcEnd;
    }

    public int hashCode() {
        return Long.hashCode(this.innerArcEnd) + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.innerArcEndAngleRad, AbstractC11266d.m30447a(this.innerArcStartAngleRad, AbstractC11266d.m30447a(this.outerArcStartAngleRad, AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30447a(this.innerArcAdjustment, AbstractC11266d.m30447a(this.outerArcAdjustment, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30447a(this.endSin, AbstractC11266d.m30447a(this.endCos, AbstractC11266d.m30447a(this.startSin, AbstractC11266d.m30447a(this.startCos, AbstractC11266d.m30447a(this.endAngleRad, AbstractC11266d.m30447a(this.startAngleRad, AbstractC11266d.m30447a(this.cornerRadius, Double.hashCode(this.sweepAngle) * 31, 31), 31), 31), 31), 31), 31), 31), this.startOuter, 31), this.startInner, 31), this.endOuter, 31), this.endInner, 31), 31), 31), 31, this.adjustedOuterStartAngle), 31, this.adjustedInnerStartAngle), 31, this.adjustedInnerEndAngle), 31), 31), 31), this.outerArcStart, 31), this.innerArcStart, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getInnerArcStart() {
        return this.innerArcStart;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getOuterArcAdjustment() {
        return this.outerArcAdjustment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getOuterArcStart() {
        return this.outerArcStart;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getStartAngleRad() {
        return this.startAngleRad;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getStartInner() {
        return this.startInner;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getStartOuter() {
        return this.startOuter;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final double getSweepAngle() {
        return this.sweepAngle;
    }

    public String toString() {
        double d3 = this.sweepAngle;
        float f13 = this.cornerRadius;
        float f14 = this.startAngleRad;
        float f15 = this.endAngleRad;
        float f16 = this.startCos;
        float f17 = this.startSin;
        float f18 = this.endCos;
        float f19 = this.endSin;
        String strM47194j = C16617b.m47194j(this.startOuter);
        String strM47194j2 = C16617b.m47194j(this.startInner);
        String strM47194j3 = C16617b.m47194j(this.endOuter);
        String strM47194j4 = C16617b.m47194j(this.endInner);
        float f24 = this.outerArcAdjustment;
        float f25 = this.innerArcAdjustment;
        double d14 = this.adjustedOuterStartAngle;
        double d15 = this.adjustedInnerStartAngle;
        double d16 = this.adjustedInnerEndAngle;
        float f26 = this.outerArcStartAngleRad;
        float f27 = this.innerArcStartAngleRad;
        float f28 = this.innerArcEndAngleRad;
        String strM47194j5 = C16617b.m47194j(this.outerArcStart);
        String strM47194j6 = C16617b.m47194j(this.innerArcStart);
        String strM47194j7 = C16617b.m47194j(this.innerArcEnd);
        StringBuilder sb4 = new StringBuilder("MaskGeometry(sweepAngle=");
        sb4.append(d3);
        sb4.append(", cornerRadius=");
        sb4.append(f13);
        sb4.append(", startAngleRad=");
        sb4.append(f14);
        sb4.append(", endAngleRad=");
        sb4.append(f15);
        sb4.append(", startCos=");
        sb4.append(f16);
        sb4.append(", startSin=");
        sb4.append(f17);
        sb4.append(", endCos=");
        sb4.append(f18);
        sb4.append(", endSin=");
        sb4.append(f19);
        AbstractC11266d.m30444B(sb4, ", startOuter=", strM47194j, ", startInner=", strM47194j2);
        AbstractC11266d.m30444B(sb4, ", endOuter=", strM47194j3, ", endInner=", strM47194j4);
        sb4.append(", outerArcAdjustment=");
        sb4.append(f24);
        sb4.append(", innerArcAdjustment=");
        sb4.append(f25);
        AbstractC31061c.m95622B(sb4, ", adjustedOuterStartAngle=", d14, ", adjustedInnerStartAngle=");
        sb4.append(d15);
        AbstractC31061c.m95622B(sb4, ", adjustedInnerEndAngle=", d16, ", outerArcStartAngleRad=");
        AbstractC30802r.m94772u(sb4, f26, ", innerArcStartAngleRad=", f27, ", innerArcEndAngleRad=");
        sb4.append(f28);
        sb4.append(", outerArcStart=");
        sb4.append(strM47194j5);
        sb4.append(", innerArcStart=");
        return AbstractC11266d.m30464r(sb4, strM47194j6, ", innerArcEnd=", strM47194j7, ")");
    }

    private C32891h(double d3, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j7, long j13, long j14, long j15, float f24, float f25, double d14, double d15, double d16, float f26, float f27, float f28, long j16, long j17, long j18) {
        this.sweepAngle = d3;
        this.cornerRadius = f13;
        this.startAngleRad = f14;
        this.endAngleRad = f15;
        this.startCos = f16;
        this.startSin = f17;
        this.endCos = f18;
        this.endSin = f19;
        this.startOuter = j7;
        this.startInner = j13;
        this.endOuter = j14;
        this.endInner = j15;
        this.outerArcAdjustment = f24;
        this.innerArcAdjustment = f25;
        this.adjustedOuterStartAngle = d14;
        this.adjustedInnerStartAngle = d15;
        this.adjustedInnerEndAngle = d16;
        this.outerArcStartAngleRad = f26;
        this.innerArcStartAngleRad = f27;
        this.innerArcEndAngleRad = f28;
        this.outerArcStart = j16;
        this.innerArcStart = j17;
        this.innerArcEnd = j18;
    }
}
