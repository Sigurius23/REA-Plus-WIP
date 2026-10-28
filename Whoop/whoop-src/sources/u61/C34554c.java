package u61;

import p000.AbstractC11266d;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: u61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lu61/c;", "", "Ly81/e;", "color", "Ly3/f;", "size", "Lu61/b;", "shape", "<init>", "(Ly81/e;FLu61/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ly81/e;FLu61/b;)Lu61/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/e;", "b", "()Ly81/e;", "F", "d", "()F", "c", "Lu61/b;", "()Lu61/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34554c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final EnumC34553b shape;

    public /* synthetic */ C34554c(InterfaceC39332e interfaceC39332e, float f13, EnumC34553b enumC34553b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, f13, enumC34553b);
    }

    /* JADX INFO: renamed from: a */
    public final C34554c m109237a(InterfaceC39332e color, float size, EnumC34553b shape) {
        AbstractC22676k.m65750j(shape, "shape");
        return new C34554c(color, size, shape, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC34553b getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34554c)) {
            return false;
        }
        C34554c c34554c = (C34554c) other;
        return AbstractC22676k.m65745e(this.color, c34554c.color) && C39174f.m124782b(this.size, c34554c.size) && this.shape == c34554c.shape;
    }

    public int hashCode() {
        InterfaceC39332e interfaceC39332e = this.color;
        return this.shape.hashCode() + AbstractC11266d.m30447a(this.size, (interfaceC39332e == null ? 0 : interfaceC39332e.hashCode()) * 31, 31);
    }

    public String toString() {
        return "PointCircleState(color=" + this.color + ", size=" + C39174f.m124783c(this.size) + ", shape=" + this.shape + ")";
    }

    private C34554c(InterfaceC39332e interfaceC39332e, float f13, EnumC34553b shape) {
        AbstractC22676k.m65750j(shape, "shape");
        this.color = interfaceC39332e;
        this.size = f13;
        this.shape = shape;
    }

    public C34554c(InterfaceC39332e interfaceC39332e, float f13, EnumC34553b enumC34553b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : interfaceC39332e, (i13 & 2) != 0 ? 10 : f13, (i13 & 4) != 0 ? EnumC34553b.CIRCLE : enumC34553b, null);
    }
}
