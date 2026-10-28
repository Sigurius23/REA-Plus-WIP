package hy0;

import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17898m0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17910s0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: hy0.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lhy0/h;", "Li2/a1;", "Ly3/f;", "step", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh2/e;", "size", "Ly3/m;", "layoutDirection", "Ly3/c;", "density", "Li2/m0;", "b", "(JLy3/m;Ly3/c;)Li2/m0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "getStep-D9Ej5fM", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C17748h implements InterfaceC17869a1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float step;

    public /* synthetic */ C17748h(float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13);
    }

    @Override // p208i2.InterfaceC17869a1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C17898m0 mo39171a(long size, EnumC39181m layoutDirection, InterfaceC39171c density) {
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        AbstractC22676k.m65750j(density, "density");
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        int i13 = (int) (size >> 32);
        int iM36258X = AbstractC12889b.m36258X(Float.intBitsToFloat(i13) / density.mo743q0(this.step));
        float fIntBitsToFloat = Float.intBitsToFloat(i13) / iM36258X;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (size & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat / 2) << 32);
        for (int i14 = 0; i14 < iM36258X; i14++) {
            InterfaceC17910s0.m51495a(c17891jM51478a, AbstractC17269i.m48896j((((long) Float.floatToRawIntBits(i14 * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), jFloatToRawIntBits));
        }
        c17891jM51478a.m51459f();
        return new C17898m0(c17891jM51478a);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof C17748h) && C39174f.m124782b(this.step, ((C17748h) other).step);
    }

    public int hashCode() {
        return Float.hashCode(this.step);
    }

    public String toString() {
        return AbstractC11895b.m31996o("DottedShape(step=", C39174f.m124783c(this.step), ")");
    }

    private C17748h(float f13) {
        this.step = f13;
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("dotted step size was 0, use a solid line instead");
        }
    }
}
