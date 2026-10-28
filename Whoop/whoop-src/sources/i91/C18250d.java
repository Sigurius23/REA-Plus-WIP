package i91;

import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i91.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Li91/d;", "Li91/a;", "Lj91/b;", "brush", "", "alpha", "<init>", "(Lj91/b;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lj91/b;", "()Lj91/b;", "c", "F", "a", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18250d extends AbstractC18247a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21430b brush;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18250d(InterfaceC21430b brush, float f13) {
        super(null);
        AbstractC22676k.m65750j(brush, "brush");
        this.brush = brush;
        this.alpha = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC21430b getBrush() {
        return this.brush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18250d)) {
            return false;
        }
        C18250d c18250d = (C18250d) other;
        return AbstractC22676k.m65745e(this.brush, c18250d.brush) && Float.compare(this.alpha, c18250d.alpha) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.alpha) + (this.brush.hashCode() * 31);
    }

    public String toString() {
        return "BrushBackground(brush=" + this.brush + ", alpha=" + this.alpha + ")";
    }

    public /* synthetic */ C18250d(InterfaceC21430b interfaceC21430b, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21430b, (i13 & 2) != 0 ? 1.0f : f13);
    }
}
