package d11;

import p636y3.C39174f;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: d11.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ld11/j;", "Ld11/a;", "Lj91/b;", "brush", "Ly3/f;", "borderWidth", "<init>", "(Lj91/b;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lj91/b;", "b", "()Lj91/b;", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11475j implements InterfaceC11466a {

    /* JADX INFO: renamed from: c */
    public static final int f36886c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21430b brush;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float borderWidth;

    public /* synthetic */ C11475j(InterfaceC21430b interfaceC21430b, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21430b, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC21430b getBrush() {
        return this.brush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11475j)) {
            return false;
        }
        C11475j c11475j = (C11475j) other;
        return AbstractC22676k.m65745e(this.brush, c11475j.brush) && C39174f.m124782b(this.borderWidth, c11475j.borderWidth);
    }

    public int hashCode() {
        return Float.hashCode(this.borderWidth) + (this.brush.hashCode() * 31);
    }

    public String toString() {
        return "WhoopBrushBorder(brush=" + this.brush + ", borderWidth=" + C39174f.m124783c(this.borderWidth) + ")";
    }

    private C11475j(InterfaceC21430b brush, float f13) {
        AbstractC22676k.m65750j(brush, "brush");
        this.brush = brush;
        this.borderWidth = f13;
    }

    public C11475j(InterfaceC21430b interfaceC21430b, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21430b, (i13 & 2) != 0 ? (float) 1.5d : f13, null);
    }
}
