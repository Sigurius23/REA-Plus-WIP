package p720m91;

import p031b9.AbstractC2875y;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: m91.c0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lm91/c0;", "Lm91/u;", "Ly3/f;", "width", "height", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25292c0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float height;

    public /* synthetic */ C25292c0(float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25292c0)) {
            return false;
        }
        C25292c0 c25292c0 = (C25292c0) other;
        return C39174f.m124782b(this.width, c25292c0.width) && C39174f.m124782b(this.height, c25292c0.height);
    }

    public int hashCode() {
        return Float.hashCode(this.height) + (Float.hashCode(this.width) * 31);
    }

    public String toString() {
        return AbstractC2875y.m8300m("SpacerItemState(width=", C39174f.m124783c(this.width), ", height=", C39174f.m124783c(this.height), ")");
    }

    private C25292c0(float f13, float f14) {
        this.width = f13;
        this.height = f14;
    }

    public C25292c0(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : f13, (i13 & 2) != 0 ? 0 : f14, null);
    }
}
