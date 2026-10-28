package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C22939b1;
import p291l0.EnumC22935a1;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "La3/h1;", "Ll0/b1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class IntrinsicWidthElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final EnumC22935a1 f4551w;

    public IntrinsicWidthElement(EnumC22935a1 enumC22935a1) {
        this.f4551w = enumC22935a1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22939b1 c22939b1 = new C22939b1(1);
        c22939b1.f90546P = this.f4551w;
        c22939b1.f90547Q = true;
        return c22939b1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.f4551w == intrinsicWidthElement.f4551w;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f4551w.hashCode() * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22939b1 c22939b1 = (C22939b1) abstractC2316v;
        c22939b1.f90546P = this.f4551w;
        c22939b1.f90547Q = true;
    }
}
