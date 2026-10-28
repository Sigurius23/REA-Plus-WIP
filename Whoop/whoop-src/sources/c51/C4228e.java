package c51;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: c51.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, m65681d2 = {"Lc51/e;", "", "", "addedScale", "strokeWidth", "baseAlpha", "Ly3/f;", "blurRadius", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(FFFF)Lc51/e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "c", "()F", "b", "f", "d", "e", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4228e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float addedScale;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float strokeWidth;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float baseAlpha;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float blurRadius;

    public /* synthetic */ C4228e(float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4228e m13119b(C4228e c4228e, float f13, float f14, float f15, float f16, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c4228e.addedScale;
        }
        if ((i13 & 2) != 0) {
            f14 = c4228e.strokeWidth;
        }
        if ((i13 & 4) != 0) {
            f15 = c4228e.baseAlpha;
        }
        if ((i13 & 8) != 0) {
            f16 = c4228e.blurRadius;
        }
        return c4228e.m13120a(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: a */
    public final C4228e m13120a(float addedScale, float strokeWidth, float baseAlpha, float blurRadius) {
        return new C4228e(addedScale, strokeWidth, baseAlpha, blurRadius, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAddedScale() {
        return this.addedScale;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBaseAlpha() {
        return this.baseAlpha;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4228e)) {
            return false;
        }
        C4228e c4228e = (C4228e) other;
        return Float.compare(this.addedScale, c4228e.addedScale) == 0 && Float.compare(this.strokeWidth, c4228e.strokeWidth) == 0 && Float.compare(this.baseAlpha, c4228e.baseAlpha) == 0 && C39174f.m124782b(this.blurRadius, c4228e.blurRadius);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        return Float.hashCode(this.blurRadius) + AbstractC11266d.m30447a(this.baseAlpha, AbstractC11266d.m30447a(this.strokeWidth, Float.hashCode(this.addedScale) * 31, 31), 31);
    }

    public String toString() {
        float f13 = this.addedScale;
        float f14 = this.strokeWidth;
        float f15 = this.baseAlpha;
        String strM124783c = C39174f.m124783c(this.blurRadius);
        StringBuilder sbM8307t = AbstractC2875y.m8307t("AmoebaEdgeFadeSettings(addedScale=", f13, ", strokeWidth=", f14, ", baseAlpha=");
        sbM8307t.append(f15);
        sbM8307t.append(", blurRadius=");
        sbM8307t.append(strM124783c);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    private C4228e(float f13, float f14, float f15, float f16) {
        this.addedScale = f13;
        this.strokeWidth = f14;
        this.baseAlpha = f15;
        this.blurRadius = f16;
    }

    public C4228e(float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? 150.0f : f14, (i13 & 4) != 0 ? 0.7f : f15, (i13 & 8) != 0 ? 50 : f16, null);
    }
}
