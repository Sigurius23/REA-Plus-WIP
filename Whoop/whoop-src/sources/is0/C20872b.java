package is0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: is0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001a"}, m65681d2 = {"Lis0/b;", "", "Ly3/f;", "x", "y", "size", "", "alpha", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "c", "()F", "b", "d", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C20872b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float alpha;

    public /* synthetic */ C20872b(float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getY() {
        return this.y;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20872b)) {
            return false;
        }
        C20872b c20872b = (C20872b) other;
        return C39174f.m124782b(this.x, c20872b.x) && C39174f.m124782b(this.y, c20872b.y) && C39174f.m124782b(this.size, c20872b.size) && Float.compare(this.alpha, c20872b.alpha) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + AbstractC11266d.m30447a(this.size, AbstractC11266d.m30447a(this.y, Float.hashCode(this.x) * 31, 31), 31);
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.x);
        String strM124783c2 = C39174f.m124783c(this.y);
        String strM124783c3 = C39174f.m124783c(this.size);
        float f13 = this.alpha;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AvatarSlot(x=", strM124783c, ", y=", strM124783c2, ", size=");
        sbM32001t.append(strM124783c3);
        sbM32001t.append(", alpha=");
        sbM32001t.append(f13);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C20872b(float f13, float f14, float f15, float f16) {
        this.x = f13;
        this.y = f14;
        this.size = f15;
        this.alpha = f16;
    }
}
