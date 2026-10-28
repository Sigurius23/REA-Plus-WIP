package androidx.compose.foundation.layout;

import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p291l0.C22959g1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "La3/h1;", "Ll0/g1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class OffsetElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4554w;

    /* JADX INFO: renamed from: x */
    public final float f4555x;

    /* JADX INFO: renamed from: y */
    public final boolean f4556y;

    /* JADX INFO: renamed from: z */
    public final Function1 f4557z;

    public OffsetElement(float f13, float f14, boolean z4, Function1 function1) {
        this.f4554w = f13;
        this.f4555x = f14;
        this.f4556y = z4;
        this.f4557z = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22959g1 c22959g1 = new C22959g1();
        c22959g1.f90604O = this.f4554w;
        c22959g1.f90605P = this.f4555x;
        c22959g1.f90606Q = this.f4556y;
        return c22959g1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && C39174f.m124782b(this.f4554w, offsetElement.f4554w) && C39174f.m124782b(this.f4555x, offsetElement.f4555x) && this.f4556y == offsetElement.f4556y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4556y) + AbstractC11266d.m30447a(this.f4555x, Float.hashCode(this.f4554w) * 31, 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4557z.invoke(c2404l2);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OffsetModifierElement(x=");
        AbstractC13673n.m38572s(this.f4554w, ", y=", sb4);
        AbstractC13673n.m38572s(this.f4555x, ", rtlAware=", sb4);
        return AbstractC2875y.m8305r(sb4, this.f4556y, ')');
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22959g1 c22959g1 = (C22959g1) abstractC2316v;
        float f13 = c22959g1.f90604O;
        float f14 = this.f4554w;
        boolean zM124782b = C39174f.m124782b(f13, f14);
        float f15 = this.f4555x;
        boolean z4 = this.f4556y;
        if (!zM124782b || !C39174f.m124782b(c22959g1.f90605P, f15) || c22959g1.f90606Q != z4) {
            AbstractC0201g.m516p(c22959g1).m645u0(false);
        }
        c22959g1.f90604O = f14;
        c22959g1.f90605P = f15;
        c22959g1.f90606Q = z4;
    }
}
