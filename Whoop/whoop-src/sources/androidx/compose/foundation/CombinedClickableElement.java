package androidx.compose.foundation;

import c93.InterfaceC4339a;
import p000.AbstractC30802r;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.C13775c0;
import p238j0.InterfaceC21083i;
import p512u2.C34462h0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "La3/h1;", "Lf0/c0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class CombinedClickableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4490w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4339a f4491x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC4339a f4492y;

    public CombinedClickableElement(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC21083i interfaceC21083i) {
        this.f4490w = interfaceC21083i;
        this.f4491x = interfaceC4339a;
        this.f4492y = interfaceC4339a2;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13775c0(this.f4491x, this.f4492y, this.f4490w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC22676k.m65745e(this.f4490w, combinedClickableElement.f4490w) && this.f4491x == combinedClickableElement.f4491x && this.f4492y == combinedClickableElement.f4492y;
    }

    public final int hashCode() {
        InterfaceC21083i interfaceC21083i = this.f4490w;
        int iM94755d = AbstractC30802r.m94755d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((interfaceC21083i != null ? interfaceC21083i.hashCode() : 0) * 961, 31, false), 29791, true), 961, this.f4491x);
        InterfaceC4339a interfaceC4339a = this.f4492y;
        return Boolean.hashCode(true) + ((iM94755d + (interfaceC4339a != null ? interfaceC4339a.hashCode() : 0)) * 961);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "combinedClickable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(null, "indicationNodeFactory");
        c2365d3.m7292c(this.f4490w, "interactionSource");
        Boolean bool = Boolean.TRUE;
        c2365d3.m7292c(bool, "enabled");
        c2365d3.m7292c(null, "onClickLabel");
        c2365d3.m7292c(null, "role");
        c2365d3.m7292c(this.f4491x, "onClick");
        c2365d3.m7292c(null, "onDoubleClick");
        c2365d3.m7292c(this.f4492y, "onLongClick");
        c2365d3.m7292c(null, "onLongClickLabel");
        c2365d3.m7292c(bool, "hapticFeedbackEnabled");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C34462h0 c34462h0;
        C13775c0 c13775c0 = (C13775c0) abstractC2316v;
        c13775c0.f49146l0 = true;
        boolean z4 = false;
        boolean z13 = c13775c0.f49145k0 == null;
        InterfaceC4339a interfaceC4339a = this.f4492y;
        if (z13 != (interfaceC4339a == null)) {
            c13775c0.m39151d1();
            AbstractC0201g.m510j(c13775c0);
            z4 = true;
        }
        c13775c0.f49145k0 = interfaceC4339a;
        boolean z14 = c13775c0.f49201V ? z4 : true;
        c13775c0.m39154j1(this.f4490w, null, false, true, null, null, this.f4491x);
        if (!z14 || (c34462h0 = c13775c0.f49205Z) == null) {
            return;
        }
        c34462h0.m108936Z0();
    }
}
