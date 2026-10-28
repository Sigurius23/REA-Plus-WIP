package androidx.compose.foundation.lazy.layout;

import c93.InterfaceC4339a;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.EnumC16377d2;
import p389p0.C28555v0;
import p389p0.InterfaceC28549s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "La3/h1;", "Lp0/v0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class LazyLayoutSemanticsModifier extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC4339a f4608w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC28549s0 f4609x;

    /* JADX INFO: renamed from: y */
    public final EnumC16377d2 f4610y;

    /* JADX INFO: renamed from: z */
    public final boolean f4611z;

    public LazyLayoutSemanticsModifier(InterfaceC4339a interfaceC4339a, InterfaceC28549s0 interfaceC28549s0, EnumC16377d2 enumC16377d2, boolean z4) {
        this.f4608w = interfaceC4339a;
        this.f4609x = interfaceC28549s0;
        this.f4610y = enumC16377d2;
        this.f4611z = z4;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C28555v0(this.f4608w, this.f4609x, this.f4610y, this.f4611z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f4608w == lazyLayoutSemanticsModifier.f4608w && AbstractC22676k.m65745e(this.f4609x, lazyLayoutSemanticsModifier.f4609x) && this.f4610y == lazyLayoutSemanticsModifier.f4610y && this.f4611z == lazyLayoutSemanticsModifier.f4611z;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + AbstractC2875y.m8289b((this.f4610y.hashCode() + ((this.f4609x.hashCode() + (this.f4608w.hashCode() * 31)) * 31)) * 31, 31, this.f4611z);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C28555v0 c28555v0 = (C28555v0) abstractC2316v;
        c28555v0.f115525O = this.f4608w;
        c28555v0.f115526P = this.f4609x;
        EnumC16377d2 enumC16377d2 = c28555v0.f115527Q;
        EnumC16377d2 enumC16377d3 = this.f4610y;
        if (enumC16377d2 != enumC16377d3) {
            c28555v0.f115527Q = enumC16377d3;
            AbstractC0201g.m510j(c28555v0);
        }
        boolean z4 = c28555v0.f115528R;
        boolean z13 = this.f4611z;
        if (z4 == z13) {
            return;
        }
        c28555v0.f115528R = z13;
        c28555v0.m86862X0();
        AbstractC0201g.m510j(c28555v0);
    }
}
