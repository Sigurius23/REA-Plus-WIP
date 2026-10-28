package is0;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: is0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, m65681d2 = {"Lis0/a;", "", "Ly3/f;", "left", "top", "width", "height", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "b", "()F", "c", "d", "community-reactions-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final /* data */ class C20870a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float left;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float height;

    public /* synthetic */ C20870a(float f13, float f14, float f15, float f16, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C20870a)) {
            return false;
        }
        C20870a c20870a = (C20870a) other;
        return C39174f.m124782b(this.left, c20870a.left) && C39174f.m124782b(this.top, c20870a.top) && C39174f.m124782b(this.width, c20870a.width) && C39174f.m124782b(this.height, c20870a.height);
    }

    public int hashCode() {
        return Float.hashCode(this.height) + AbstractC11266d.m30447a(this.width, AbstractC11266d.m30447a(this.top, Float.hashCode(this.left) * 31, 31), 31);
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.left);
        String strM124783c2 = C39174f.m124783c(this.top);
        return AbstractC11266d.m30464r(AbstractC11895b.m32001t("AvatarBounds(left=", strM124783c, ", top=", strM124783c2, ", width="), C39174f.m124783c(this.width), ", height=", C39174f.m124783c(this.height), ")");
    }

    private C20870a(float f13, float f14, float f15, float f16) {
        this.left = f13;
        this.top = f14;
        this.width = f15;
        this.height = f16;
    }
}
