package androidx.compose.p018ui.input.nestedscroll;

import p005a3.AbstractC0207h1;
import p005a3.C0222l0;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p492t2.C33316d;
import p492t2.C33319g;
import p492t2.InterfaceC33313a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "La3/h1;", "Lt2/g;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class NestedScrollElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC33313a f4832w;

    /* JADX INFO: renamed from: x */
    public final C33316d f4833x;

    public NestedScrollElement(InterfaceC33313a interfaceC33313a, C33316d c33316d) {
        this.f4832w = interfaceC33313a;
        this.f4833x = c33316d;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C33319g(this.f4832w, this.f4833x);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return AbstractC22676k.m65745e(nestedScrollElement.f4832w, this.f4832w) && AbstractC22676k.m65745e(nestedScrollElement.f4833x, this.f4833x);
    }

    public final int hashCode() {
        int iHashCode = this.f4832w.hashCode() * 31;
        C33316d c33316d = this.f4833x;
        return iHashCode + (c33316d != null ? c33316d.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("nestedScroll");
        c2404l2.m7400b().m7292c(this.f4832w, "connection");
        c2404l2.m7400b().m7292c(this.f4833x, "dispatcher");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C33319g c33319g = (C33319g) abstractC2316v;
        c33319g.f138990O = this.f4832w;
        C33316d c33316d = c33319g.f138991P;
        if (c33316d.f138977a == c33319g) {
            c33316d.f138977a = null;
        }
        C33316d c33316d2 = this.f4833x;
        if (c33316d2 == null) {
            c33319g.f138991P = new C33316d();
        } else if (!c33316d2.equals(c33316d)) {
            c33319g.f138991P = c33316d2;
        }
        if (c33319g.f9141N) {
            C33316d c33316d3 = c33319g.f138991P;
            c33316d3.f138977a = c33319g;
            c33316d3.f138978b = null;
            c33319g.f138992Q = null;
            c33316d3.f138979c = new C0222l0(c33319g, 20);
            c33316d3.f138980d = c33319g.m7158L0();
        }
    }
}
