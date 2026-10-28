package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22962h0;
import p291l0.EnumC22954f0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/FillElement;", "La3/h1;", "Ll0/h0;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class FillElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final EnumC22954f0 f4546w;

    /* JADX INFO: renamed from: x */
    public final float f4547x;

    /* JADX INFO: renamed from: y */
    public final String f4548y;

    public FillElement(EnumC22954f0 enumC22954f0, float f13, String str) {
        this.f4546w = enumC22954f0;
        this.f4547x = f13;
        this.f4548y = str;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22962h0 c22962h0 = new C22962h0();
        c22962h0.f90614O = this.f4546w;
        c22962h0.f90615P = this.f4547x;
        return c22962h0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f4546w == fillElement.f4546w && this.f4547x == fillElement.f4547x;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4547x) + (this.f4546w.hashCode() * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c(this.f4548y);
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4547x), "fraction");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22962h0 c22962h0 = (C22962h0) abstractC2316v;
        c22962h0.f90614O = this.f4546w;
        c22962h0.f90615P = this.f4547x;
    }
}
