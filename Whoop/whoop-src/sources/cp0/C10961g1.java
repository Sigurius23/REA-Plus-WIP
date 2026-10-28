package cp0;

import p000.AbstractC11266d;
import p181h2.C16618c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: cp0.g1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lcp0/g1;", "", "Lh2/c;", "rect", "", "cornerRadius", "padding", "<init>", "(Lh2/c;FF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh2/c;", "c", "()Lh2/c;", "b", "F", "()F", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C10961g1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C16618c rect;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float cornerRadius;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float padding;

    public C10961g1(C16618c rect, float f13, float f14) {
        AbstractC22676k.m65750j(rect, "rect");
        this.rect = rect;
        this.cornerRadius = f13;
        this.padding = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C16618c getRect() {
        return this.rect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C10961g1)) {
            return false;
        }
        C10961g1 c10961g1 = (C10961g1) other;
        return AbstractC22676k.m65745e(this.rect, c10961g1.rect) && Float.compare(this.cornerRadius, c10961g1.cornerRadius) == 0 && Float.compare(this.padding, c10961g1.padding) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.padding) + AbstractC11266d.m30447a(this.cornerRadius, this.rect.hashCode() * 31, 31);
    }

    public String toString() {
        C16618c c16618c = this.rect;
        float f13 = this.cornerRadius;
        float f14 = this.padding;
        StringBuilder sb4 = new StringBuilder("HighlightTarget(rect=");
        sb4.append(c16618c);
        sb4.append(", cornerRadius=");
        sb4.append(f13);
        sb4.append(", padding=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }
}
