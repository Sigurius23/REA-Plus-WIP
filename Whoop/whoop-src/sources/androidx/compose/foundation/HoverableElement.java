package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p132f0.C13817q0;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/HoverableElement;", "La3/h1;", "Lf0/q0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class HoverableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4494w;

    public HoverableElement(InterfaceC21083i interfaceC21083i) {
        this.f4494w = interfaceC21083i;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C13817q0 c13817q0 = new C13817q0();
        c13817q0.f49300O = this.f4494w;
        return c13817q0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && AbstractC22676k.m65745e(((HoverableElement) obj).f4494w, this.f4494w);
    }

    public final int hashCode() {
        return this.f4494w.hashCode() * 31;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "hoverable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4494w, "interactionSource");
        c2365d3.m7292c(Boolean.TRUE, "enabled");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13817q0 c13817q0 = (C13817q0) abstractC2316v;
        InterfaceC21083i interfaceC21083i = c13817q0.f49300O;
        InterfaceC21083i interfaceC21083i2 = this.f4494w;
        if (AbstractC22676k.m65745e(interfaceC21083i, interfaceC21083i2)) {
            return;
        }
        c13817q0.m39181Z0();
        c13817q0.f49300O = interfaceC21083i2;
    }
}
