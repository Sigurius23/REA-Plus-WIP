package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p132f0.C13790h0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureElement;", "La3/h1;", "Lf0/h0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ExcludeFromSystemGestureElement extends AbstractC0207h1 {
    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13790h0();
    }

    public final boolean equals(Object obj) {
        return obj instanceof ExcludeFromSystemGestureElement;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "systemGestureExclusion";
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C13790h0) abstractC2316v).getClass();
    }
}
