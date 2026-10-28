package androidx.compose.foundation.lazy.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p389p0.C28525g1;
import p389p0.C28535l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "La3/h1;", "Lp0/g1;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class TraversablePrefetchStateModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C28535l0 f4612w;

    public TraversablePrefetchStateModifierElement(C28535l0 c28535l0) {
        this.f4612w = c28535l0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C28525g1 c28525g1 = new C28525g1();
        c28525g1.f115432O = this.f4612w;
        return c28525g1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && AbstractC22676k.m65745e(this.f4612w, ((TraversablePrefetchStateModifierElement) obj).f4612w);
    }

    public final int hashCode() {
        return this.f4612w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "traversablePrefetchState";
        c2404l2.f9458b = this.f4612w;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f4612w + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C28525g1) abstractC2316v).f115432O = this.f4612w;
    }
}
