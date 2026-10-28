package gb1;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: gb1.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001b"}, m65681d2 = {"Lgb1/j;", "", "Ly3/f;", "circleSize", "blurRadius", "", "alpha", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getCircleSize-D9Ej5fM", "()F", "b", "getBlurRadius-D9Ej5fM", "c", "visualRadius", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C15682j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float circleSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float blurRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float alpha;

    public /* synthetic */ C15682j(float f13, float f14, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: b */
    public final float m44116b() {
        return (this.circleSize / 2) + this.blurRadius;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15682j)) {
            return false;
        }
        C15682j c15682j = (C15682j) other;
        return C39174f.m124782b(this.circleSize, c15682j.circleSize) && C39174f.m124782b(this.blurRadius, c15682j.blurRadius) && Float.compare(this.alpha, c15682j.alpha) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + AbstractC11266d.m30447a(this.blurRadius, Float.hashCode(this.circleSize) * 31, 31);
    }

    public String toString() {
        return AbstractC30007c.m91837g(this.alpha, ")", AbstractC11895b.m32001t("GlowLayer(circleSize=", C39174f.m124783c(this.circleSize), ", blurRadius=", C39174f.m124783c(this.blurRadius), ", alpha="));
    }

    private C15682j(float f13, float f14, float f15) {
        this.circleSize = f13;
        this.blurRadius = f14;
        this.alpha = f15;
    }
}
