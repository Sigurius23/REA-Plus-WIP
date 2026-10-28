package e81;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: e81.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 62\u00020\u0001:\u0003\u0018\u001d\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0017R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b%\u0010\u0019R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b'\u0010\u0019R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b)\u0010\u0019R\u0017\u0010.\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b#\u0010-R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b \u0010\u0019R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019¨\u00067"}, m65681d2 = {"Le81/t;", "", "", "outerRadius", "", "sliceCount", "tickThicknessPercent", "highlightThicknessPercent", "hitTargetPaddingPx", "<init>", "(FIFFF)V", "radius", "", "k", "(F)Z", "x", "y", "centerX", "centerY", "Le81/t$c;", "j", "(FFFF)Le81/t$c;", "a", "F", "b", "()F", "I", "getSliceCount", "()I", "c", "i", "sliceThickness", "d", "f", "shadowThickness", "e", "hitTargetPadding", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "sliceOuterRadius", "g", "sliceInnerRadius", "getShadowInnerRadius", "shadowInnerRadius", "Le81/t$b;", "Le81/t$b;", "()Le81/t$b;", "shadowGradientRadii", "shadowBandOuterRadius", "shadowBandInnerRadius", "l", "interactiveInnerRadius", "m", "getInteractiveOuterRadius", "interactiveOuterRadius", "n", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12846t {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float outerRadius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int sliceCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float sliceThickness;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float shadowThickness;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float hitTargetPadding;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float sliceOuterRadius;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float sliceInnerRadius;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final float shadowInnerRadius;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final b shadowGradientRadii;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float shadowBandOuterRadius;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float shadowBandInnerRadius;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float interactiveInnerRadius;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float interactiveOuterRadius;

    /* JADX INFO: renamed from: e81.t$b */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Le81/t$b;", "", "", "start", "end", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float end;

        public b(float f13, float f14) {
            this.start = f13;
            this.end = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Float.compare(this.start, bVar.start) == 0 && Float.compare(this.end, bVar.end) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.end) + (Float.hashCode(this.start) * 31);
        }

        public String toString() {
            return AbstractC31061c.m95638n("GradientRadii(start=", this.start, ", end=", this.end, ")");
        }
    }

    /* JADX INFO: renamed from: e81.t$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Le81/t$c;", "", "", "angleDegrees", "radius", "<init>", "(FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final float angleDegrees;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final float radius;

        public c(float f13, float f14) {
            this.angleDegrees = f13;
            this.radius = f14;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getAngleDegrees() {
            return this.angleDegrees;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Float.compare(this.angleDegrees, cVar.angleDegrees) == 0 && Float.compare(this.radius, cVar.radius) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.radius) + (Float.hashCode(this.angleDegrees) * 31);
        }

        public String toString() {
            return AbstractC31061c.m95638n("PolarPosition(angleDegrees=", this.angleDegrees, ", radius=", this.radius, ")");
        }
    }

    public C12846t(float f13, int i13, float f14, float f15, float f16) {
        this.outerRadius = f13;
        this.sliceCount = i13;
        float f17 = 2.0f * f13;
        float fMax = Math.max(0.0f, f14 * f17);
        this.sliceThickness = fMax;
        float fMax2 = Math.max(0.0f, f17 * f15);
        this.shadowThickness = fMax2;
        float fMax3 = Math.max(0.0f, f16);
        this.hitTargetPadding = fMax3;
        this.sliceOuterRadius = f13;
        float fMax4 = Math.max(0.0f, f13 - fMax);
        this.sliceInnerRadius = fMax4;
        float fMax5 = Math.max(0.0f, fMax4 - fMax2);
        this.shadowInnerRadius = fMax5;
        this.shadowGradientRadii = new b(fMax5, fMax4);
        this.shadowBandOuterRadius = fMax4 + 10.0f;
        this.shadowBandInnerRadius = fMax5 + 10.0f;
        this.interactiveInnerRadius = Math.max(0.0f, fMax4 - fMax3);
        this.interactiveOuterRadius = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getInteractiveInnerRadius() {
        return this.interactiveInnerRadius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getOuterRadius() {
        return this.outerRadius;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getShadowBandInnerRadius() {
        return this.shadowBandInnerRadius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getShadowBandOuterRadius() {
        return this.shadowBandOuterRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getShadowGradientRadii() {
        return this.shadowGradientRadii;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getShadowThickness() {
        return this.shadowThickness;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getSliceInnerRadius() {
        return this.sliceInnerRadius;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSliceOuterRadius() {
        return this.sliceOuterRadius;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getSliceThickness() {
        return this.sliceThickness;
    }

    /* JADX INFO: renamed from: j */
    public final c m36070j(float x3, float y13, float centerX, float centerY) {
        float f13 = x3 - centerX;
        float f14 = y13 - centerY;
        return new c((float) Math.toDegrees(Math.atan2(f14, f13)), (float) Math.sqrt((f14 * f14) + (f13 * f13)));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36071k(float radius) {
        return this.sliceCount > 0 && radius >= this.interactiveInnerRadius && radius <= this.interactiveOuterRadius;
    }

    public /* synthetic */ C12846t(float f13, int i13, float f14, float f15, float f16, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, i13, f14, f15, (i14 & 16) != 0 ? 0.0f : f16);
    }
}
