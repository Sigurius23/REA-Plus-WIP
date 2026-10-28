package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p127ev.AbstractC13673n;
import p132f0.C13822s;
import p134f2.C14014c;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/BorderModifierNodeElement;", "La3/h1;", "Lf0/s;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class BorderModifierNodeElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4480w;

    /* JADX INFO: renamed from: x */
    public final AbstractC17911t f4481x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC17869a1 f4482y;

    public BorderModifierNodeElement(float f13, AbstractC17911t abstractC17911t, InterfaceC17869a1 interfaceC17869a1) {
        this.f4480w = f13;
        this.f4481x = abstractC17911t;
        this.f4482y = interfaceC17869a1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13822s(this.f4480w, this.f4481x, this.f4482y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return C39174f.m124782b(this.f4480w, borderModifierNodeElement.f4480w) && AbstractC22676k.m65745e(this.f4481x, borderModifierNodeElement.f4481x) && AbstractC22676k.m65745e(this.f4482y, borderModifierNodeElement.f4482y);
    }

    public final int hashCode() {
        return this.f4482y.hashCode() + ((this.f4481x.hashCode() + (Float.hashCode(this.f4480w) * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("border");
        c2404l2.m7400b().m7292c(new C39174f(this.f4480w), "width");
        AbstractC17911t abstractC17911t = this.f4481x;
        if (abstractC17911t instanceof C17875c1) {
            C2365d3 c2365d3M7400b = c2404l2.m7400b();
            long j7 = ((C17875c1) abstractC17911t).f69559c;
            c2365d3M7400b.m7292c(new C17919x(j7), "color");
            c2404l2.m7402d(new C17919x(j7));
        } else {
            c2404l2.m7400b().m7292c(abstractC17911t, "brush");
        }
        c2404l2.m7400b().m7292c(this.f4482y, "shape");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BorderModifierNodeElement(width=");
        AbstractC13673n.m38572s(this.f4480w, ", brush=", sb4);
        sb4.append(this.f4481x);
        sb4.append(", shape=");
        sb4.append(this.f4482y);
        sb4.append(')');
        return sb4.toString();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13822s c13822s = (C13822s) abstractC2316v;
        float f13 = c13822s.f49327R;
        C14014c c14014c = c13822s.f49330U;
        float f14 = this.f4480w;
        if (!C39174f.m124782b(f13, f14)) {
            c13822s.f49327R = f14;
            c14014c.m39909X0();
        }
        AbstractC17911t abstractC17911t = c13822s.f49328S;
        AbstractC17911t abstractC17911t2 = this.f4481x;
        if (!AbstractC22676k.m65745e(abstractC17911t, abstractC17911t2)) {
            c13822s.f49328S = abstractC17911t2;
            c14014c.m39909X0();
        }
        InterfaceC17869a1 interfaceC17869a1 = c13822s.f49329T;
        InterfaceC17869a1 interfaceC17869a2 = this.f4482y;
        if (AbstractC22676k.m65745e(interfaceC17869a1, interfaceC17869a2)) {
            return;
        }
        c13822s.f49329T = interfaceC17869a2;
        c14014c.m39909X0();
    }
}
