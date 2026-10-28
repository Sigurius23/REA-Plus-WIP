package androidx.compose.foundation.selection;

import c93.InterfaceC4339a;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p475s0.C32035b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "La3/h1;", "Ls0/b;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class SelectableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final boolean f4629E;

    /* JADX INFO: renamed from: F */
    public final C18027i f4630F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC4339a f4631G;

    /* JADX INFO: renamed from: w */
    public final boolean f4632w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21083i f4633x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC13832v0 f4634y;

    /* JADX INFO: renamed from: z */
    public final boolean f4635z;

    public SelectableElement(boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z13, boolean z14, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f4632w = z4;
        this.f4633x = interfaceC21083i;
        this.f4634y = interfaceC13832v0;
        this.f4635z = z13;
        this.f4629E = z14;
        this.f4630F = c18027i;
        this.f4631G = interfaceC4339a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C32035b c32035b = new C32035b(this.f4633x, this.f4634y, this.f4635z, this.f4629E, null, this.f4630F, this.f4631G);
        c32035b.f132904l0 = this.f4632w;
        return c32035b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f4632w == selectableElement.f4632w && AbstractC22676k.m65745e(this.f4633x, selectableElement.f4633x) && AbstractC22676k.m65745e(this.f4634y, selectableElement.f4634y) && this.f4635z == selectableElement.f4635z && this.f4629E == selectableElement.f4629E && AbstractC22676k.m65745e(this.f4630F, selectableElement.f4630F) && this.f4631G == selectableElement.f4631G;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4632w) * 31;
        InterfaceC21083i interfaceC21083i = this.f4633x;
        int iHashCode2 = (iHashCode + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31;
        InterfaceC13832v0 interfaceC13832v0 = this.f4634y;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC13832v0 != null ? interfaceC13832v0.hashCode() : 0)) * 31, 31, this.f4635z), 31, this.f4629E);
        C18027i c18027i = this.f4630F;
        return this.f4631G.hashCode() + ((iM8289b + (c18027i != null ? Integer.hashCode(c18027i.f69949a) : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("selectable");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4632w), "selected");
        c2404l2.m7400b().m7292c(this.f4633x, "interactionSource");
        c2404l2.m7400b().m7292c(this.f4634y, "indicationNodeFactory");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4629E), "enabled");
        c2404l2.m7400b().m7292c(this.f4630F, "role");
        c2404l2.m7400b().m7292c(this.f4631G, "onClick");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C32035b c32035b = (C32035b) abstractC2316v;
        boolean z4 = c32035b.f132904l0;
        boolean z13 = this.f4632w;
        if (z4 != z13) {
            c32035b.f132904l0 = z13;
            AbstractC0201g.m510j(c32035b);
        }
        c32035b.m39154j1(this.f4633x, this.f4634y, this.f4635z, this.f4629E, null, this.f4630F, this.f4631G);
    }
}
