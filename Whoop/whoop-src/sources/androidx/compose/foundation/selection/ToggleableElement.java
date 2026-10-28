package androidx.compose.foundation.selection;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p475s0.C32036c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "La3/h1;", "Ls0/c;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ToggleableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final boolean f4636E;

    /* JADX INFO: renamed from: F */
    public final C18027i f4637F;

    /* JADX INFO: renamed from: G */
    public final Function1 f4638G;

    /* JADX INFO: renamed from: w */
    public final boolean f4639w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21083i f4640x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC13832v0 f4641y;

    /* JADX INFO: renamed from: z */
    public final boolean f4642z;

    public ToggleableElement(boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z13, boolean z14, C18027i c18027i, Function1 function1) {
        this.f4639w = z4;
        this.f4640x = interfaceC21083i;
        this.f4641y = interfaceC13832v0;
        this.f4642z = z13;
        this.f4636E = z14;
        this.f4637F = c18027i;
        this.f4638G = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C32036c(this.f4639w, this.f4640x, this.f4641y, this.f4642z, this.f4636E, this.f4637F, this.f4638G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f4639w == toggleableElement.f4639w && AbstractC22676k.m65745e(this.f4640x, toggleableElement.f4640x) && AbstractC22676k.m65745e(this.f4641y, toggleableElement.f4641y) && this.f4642z == toggleableElement.f4642z && this.f4636E == toggleableElement.f4636E && AbstractC22676k.m65745e(this.f4637F, toggleableElement.f4637F) && this.f4638G == toggleableElement.f4638G;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4639w) * 31;
        InterfaceC21083i interfaceC21083i = this.f4640x;
        int iHashCode2 = (iHashCode + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31;
        InterfaceC13832v0 interfaceC13832v0 = this.f4641y;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC13832v0 != null ? interfaceC13832v0.hashCode() : 0)) * 31, 31, this.f4642z), 31, this.f4636E);
        C18027i c18027i = this.f4637F;
        return this.f4638G.hashCode() + ((iM8289b + (c18027i != null ? Integer.hashCode(c18027i.f69949a) : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "toggleable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(c2404l2.f9458b, "value");
        c2365d3.m7292c(this.f4640x, "interactionSource");
        c2365d3.m7292c(this.f4641y, "indicationNodeFactory");
        c2365d3.m7292c(Boolean.valueOf(this.f4636E), "enabled");
        c2365d3.m7292c(this.f4637F, "role");
        c2365d3.m7292c(this.f4638G, "onValueChange");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C32036c c32036c = (C32036c) abstractC2316v;
        boolean z4 = c32036c.f132905l0;
        boolean z13 = this.f4639w;
        if (z4 != z13) {
            c32036c.f132905l0 = z13;
            AbstractC0201g.m510j(c32036c);
        }
        c32036c.f132906m0 = this.f4638G;
        c32036c.m39154j1(this.f4640x, this.f4641y, this.f4642z, this.f4636E, null, this.f4637F, c32036c.f132907n0);
    }
}
