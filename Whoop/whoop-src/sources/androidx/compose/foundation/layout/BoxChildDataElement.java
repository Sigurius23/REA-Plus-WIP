package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2302h;
import p027b3.C2404l2;
import p291l0.C22983o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "La3/h1;", "Ll0/o;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class BoxChildDataElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC2302h f4544w;

    /* JADX INFO: renamed from: x */
    public final boolean f4545x;

    public BoxChildDataElement(InterfaceC2302h interfaceC2302h, boolean z4) {
        this.f4544w = interfaceC2302h;
        this.f4545x = z4;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22983o c22983o = new C22983o();
        c22983o.f90672O = this.f4544w;
        c22983o.f90673P = this.f4545x;
        return c22983o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && AbstractC22676k.m65745e(this.f4544w, boxChildDataElement.f4544w) && this.f4545x == boxChildDataElement.f4545x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4545x) + (this.f4544w.hashCode() * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22983o c22983o = (C22983o) abstractC2316v;
        c22983o.f90672O = this.f4544w;
        c22983o.f90673P = this.f4545x;
    }
}
