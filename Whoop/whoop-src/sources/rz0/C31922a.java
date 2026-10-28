package rz0;

import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: rz0.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lrz0/a;", "", "Ly3/f;", "cornerRadiusDp", "strokeWidth", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C31922a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float cornerRadiusDp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float strokeWidth;

    public /* synthetic */ C31922a(float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCornerRadiusDp() {
        return this.cornerRadiusDp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C31922a)) {
            return false;
        }
        C31922a c31922a = (C31922a) other;
        return C39174f.m124782b(this.cornerRadiusDp, c31922a.cornerRadiusDp) && C39174f.m124782b(this.strokeWidth, c31922a.strokeWidth);
    }

    public int hashCode() {
        return Float.hashCode(this.strokeWidth) + (Float.hashCode(this.cornerRadiusDp) * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("DashedEffect(cornerRadiusDp=", C39174f.m124783c(this.cornerRadiusDp), ", strokeWidth=", C39174f.m124783c(this.strokeWidth), ")");
    }

    private C31922a(float f13, float f14) {
        this.cornerRadiusDp = f13;
        this.strokeWidth = f14;
    }

    public C31922a(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1 * 4 : f13, (i13 & 2) != 0 ? ((float) 0.5d) * 4 : f14, null);
    }
}
