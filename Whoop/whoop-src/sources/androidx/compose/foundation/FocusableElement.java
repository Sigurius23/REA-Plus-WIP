package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p132f0.C13793i0;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/FocusableElement;", "La3/h1;", "Lf0/i0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class FocusableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4493w;

    public FocusableElement(InterfaceC21083i interfaceC21083i) {
        this.f4493w = interfaceC21083i;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13793i0(this.f4493w, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return AbstractC22676k.m65745e(this.f4493w, ((FocusableElement) obj).f4493w);
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC21083i interfaceC21083i = this.f4493w;
        if (interfaceC21083i != null) {
            return interfaceC21083i.hashCode();
        }
        return 0;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "focusable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(Boolean.TRUE, "enabled");
        c2365d3.m7292c(this.f4493w, "interactionSource");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C13793i0) abstractC2316v).m39159c1(this.f4493w);
    }
}
