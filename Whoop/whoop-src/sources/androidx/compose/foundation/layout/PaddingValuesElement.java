package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p007a6.C0428i;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22979m1;
import p291l0.InterfaceC22973k1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "La3/h1;", "Ll0/m1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class PaddingValuesElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC22973k1 f4566w;

    /* JADX INFO: renamed from: x */
    public final C0428i f4567x;

    public PaddingValuesElement(InterfaceC22973k1 interfaceC22973k1, C0428i c0428i) {
        this.f4566w = interfaceC22973k1;
        this.f4567x = c0428i;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22979m1 c22979m1 = new C22979m1();
        c22979m1.f90667O = this.f4566w;
        return c22979m1;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f4566w, paddingValuesElement.f4566w);
    }

    public final int hashCode() {
        return this.f4566w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4567x.invoke(c2404l2);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C22979m1) abstractC2316v).f90667O = this.f4566w;
    }
}
