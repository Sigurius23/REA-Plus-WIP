package androidx.compose.foundation.lazy.layout;

import p005a3.AbstractC0207h1;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.EnumC16377d2;
import p389p0.C28538n;
import p389p0.InterfaceC28540o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "La3/h1;", "Lp0/n;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class LazyLayoutBeyondBoundsModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC28540o f4604w;

    /* JADX INFO: renamed from: x */
    public final C0929d f4605x;

    /* JADX INFO: renamed from: y */
    public final EnumC16377d2 f4606y;

    public LazyLayoutBeyondBoundsModifierElement(InterfaceC28540o interfaceC28540o, C0929d c0929d, EnumC16377d2 enumC16377d2) {
        this.f4604w = interfaceC28540o;
        this.f4605x = c0929d;
        this.f4606y = enumC16377d2;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C28538n c28538n = new C28538n();
        c28538n.f115458O = this.f4604w;
        c28538n.f115459P = this.f4605x;
        c28538n.f115460Q = this.f4606y;
        return c28538n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return AbstractC22676k.m65745e(this.f4604w, lazyLayoutBeyondBoundsModifierElement.f4604w) && AbstractC22676k.m65745e(this.f4605x, lazyLayoutBeyondBoundsModifierElement.f4605x) && this.f4606y == lazyLayoutBeyondBoundsModifierElement.f4606y;
    }

    public final int hashCode() {
        return this.f4606y.hashCode() + AbstractC2875y.m8289b((this.f4605x.hashCode() + (this.f4604w.hashCode() * 31)) * 31, 31, false);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C28538n c28538n = (C28538n) abstractC2316v;
        c28538n.f115458O = this.f4604w;
        c28538n.f115459P = this.f4605x;
        c28538n.f115460Q = this.f4606y;
    }
}
