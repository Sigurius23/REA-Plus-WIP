package androidx.compose.p018ui.layout;

import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p241j3.C21266c;
import p635y2.C39092f1;
import p635y2.C39141w;
import p702ch0.C4626i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/OnVisibilityChangedElement;", "La3/h1;", "Ly2/f1;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class OnVisibilityChangedElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C39141w f4847w;

    /* JADX INFO: renamed from: x */
    public final C4626i f4848x;

    public OnVisibilityChangedElement(C39141w c39141w, C4626i c4626i) {
        this.f4847w = c39141w;
        this.f4848x = c4626i;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C39092f1(this.f4847w, this.f4848x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnVisibilityChangedElement.class != obj.getClass()) {
            return false;
        }
        OnVisibilityChangedElement onVisibilityChangedElement = (OnVisibilityChangedElement) obj;
        return AbstractC22676k.m65745e(this.f4847w, onVisibilityChangedElement.f4847w) && this.f4848x == onVisibilityChangedElement.f4848x;
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(0.0f, Long.hashCode(0L) * 31, 31);
        C39141w c39141w = this.f4847w;
        return this.f4848x.hashCode() + ((iM30447a + (c39141w != null ? c39141w.hashCode() : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "onViewportVisibilityChanged";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(0L, "minDurationMs");
        c2365d3.m7292c(Float.valueOf(0.0f), "minFractionVisible");
        c2365d3.m7292c(this.f4847w, "viewportRef");
        c2365d3.m7292c(this.f4848x, "callback");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C39092f1 c39092f1 = (C39092f1) abstractC2316v;
        c39092f1.getClass();
        c39092f1.f168170O = this.f4848x;
        c39092f1.f168171P = this.f4847w;
        c39092f1.m124619Z0();
        C21266c c21266c = c39092f1.f168176U;
        if (c21266c != null) {
            c39092f1.m124617X0(c21266c, c39092f1.f168177V);
        }
    }
}
