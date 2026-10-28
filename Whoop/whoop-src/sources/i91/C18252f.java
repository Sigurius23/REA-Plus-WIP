package i91;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: i91.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Li91/f;", "Li91/a;", "Ly81/e;", "color", "", "alpha", "<init>", "(Ly81/e;Ljava/lang/Float;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ly81/e;", "()Ly81/e;", "c", "Ljava/lang/Float;", "a", "()Ljava/lang/Float;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18252f extends AbstractC18247a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Float alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18252f(InterfaceC39332e color, Float f13) {
        super(null);
        AbstractC22676k.m65750j(color, "color");
        this.color = color;
        this.alpha = f13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18252f)) {
            return false;
        }
        C18252f c18252f = (C18252f) other;
        return AbstractC22676k.m65745e(this.color, c18252f.color) && AbstractC22676k.m65745e(this.alpha, c18252f.alpha);
    }

    public int hashCode() {
        int iHashCode = this.color.hashCode() * 31;
        Float f13 = this.alpha;
        return iHashCode + (f13 == null ? 0 : f13.hashCode());
    }

    public String toString() {
        return "ColorBackground(color=" + this.color + ", alpha=" + this.alpha + ")";
    }

    public /* synthetic */ C18252f(InterfaceC39332e interfaceC39332e, Float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, (i13 & 2) != 0 ? null : f13);
    }
}
