package androidx.compose.foundation.selection;

import androidx.compose.material.C1119d;
import c93.InterfaceC4339a;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p271k3.EnumC22167a;
import p475s0.C32037d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/selection/TriStateToggleableElement;", "La3/h1;", "Ls0/d;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class TriStateToggleableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final C18027i f4643E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC4339a f4644F;

    /* JADX INFO: renamed from: w */
    public final EnumC22167a f4645w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21083i f4646x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC13832v0 f4647y;

    /* JADX INFO: renamed from: z */
    public final boolean f4648z;

    public TriStateToggleableElement(EnumC22167a enumC22167a, InterfaceC21083i interfaceC21083i, C1119d c1119d, boolean z4, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f4645w = enumC22167a;
        this.f4646x = interfaceC21083i;
        this.f4647y = c1119d;
        this.f4648z = z4;
        this.f4643E = c18027i;
        this.f4644F = interfaceC4339a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C32037d c32037d = new C32037d(this.f4646x, this.f4647y, false, this.f4648z, null, this.f4643E, this.f4644F);
        c32037d.f132908l0 = this.f4645w;
        return c32037d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f4645w == triStateToggleableElement.f4645w && AbstractC22676k.m65745e(this.f4646x, triStateToggleableElement.f4646x) && AbstractC22676k.m65745e(this.f4647y, triStateToggleableElement.f4647y) && this.f4648z == triStateToggleableElement.f4648z && this.f4643E.equals(triStateToggleableElement.f4643E) && this.f4644F == triStateToggleableElement.f4644F;
    }

    public final int hashCode() {
        int iHashCode = this.f4645w.hashCode() * 31;
        InterfaceC21083i interfaceC21083i = this.f4646x;
        int iHashCode2 = (iHashCode + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31;
        InterfaceC13832v0 interfaceC13832v0 = this.f4647y;
        return this.f4644F.hashCode() + AbstractC11266d.m30448b(this.f4643E.f69949a, AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode2 + (interfaceC13832v0 != null ? interfaceC13832v0.hashCode() : 0)) * 31, 31, false), 31, this.f4648z), 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "triStateToggleable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4645w, "state");
        c2365d3.m7292c(this.f4646x, "interactionSource");
        c2365d3.m7292c(this.f4647y, "indicationNodeFactory");
        c2365d3.m7292c(Boolean.valueOf(this.f4648z), "enabled");
        c2365d3.m7292c(this.f4643E, "role");
        c2365d3.m7292c(this.f4644F, "onClick");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C32037d c32037d = (C32037d) abstractC2316v;
        EnumC22167a enumC22167a = c32037d.f132908l0;
        EnumC22167a enumC22167a2 = this.f4645w;
        if (enumC22167a != enumC22167a2) {
            c32037d.f132908l0 = enumC22167a2;
            AbstractC0201g.m510j(c32037d);
        }
        c32037d.m39154j1(this.f4646x, this.f4647y, false, this.f4648z, null, this.f4643E, this.f4644F);
    }
}
