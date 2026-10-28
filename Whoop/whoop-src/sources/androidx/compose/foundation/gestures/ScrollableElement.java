package androidx.compose.foundation.gestures;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.C16473w2;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16478x2;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "La3/h1;", "Lh0/w2;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ScrollableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC21083i f4529E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC16478x2 f4530w;

    /* JADX INFO: renamed from: x */
    public final EnumC16377d2 f4531x;

    /* JADX INFO: renamed from: y */
    public final boolean f4532y;

    /* JADX INFO: renamed from: z */
    public final boolean f4533z;

    public ScrollableElement(InterfaceC16478x2 interfaceC16478x2, EnumC16377d2 enumC16377d2, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i) {
        this.f4530w = interfaceC16478x2;
        this.f4531x = enumC16377d2;
        this.f4532y = z4;
        this.f4533z = z13;
        this.f4529E = interfaceC21083i;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C16473w2(null, null, null, this.f4531x, this.f4530w, this.f4529E, this.f4532y, this.f4533z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return AbstractC22676k.m65745e(this.f4530w, scrollableElement.f4530w) && this.f4531x == scrollableElement.f4531x && this.f4532y == scrollableElement.f4532y && this.f4533z == scrollableElement.f4533z && AbstractC22676k.m65745e(this.f4529E, scrollableElement.f4529E);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f4531x.hashCode() + (this.f4530w.hashCode() * 31)) * 961, 31, this.f4532y), 961, this.f4533z);
        InterfaceC21083i interfaceC21083i = this.f4529E;
        return (iM8289b + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "scrollable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4531x, "orientation");
        c2365d3.m7292c(this.f4530w, "state");
        c2365d3.m7292c(null, "overscrollEffect");
        c2365d3.m7292c(Boolean.valueOf(this.f4532y), "enabled");
        c2365d3.m7292c(Boolean.valueOf(this.f4533z), "reverseDirection");
        c2365d3.m7292c(null, "flingBehavior");
        c2365d3.m7292c(this.f4529E, "interactionSource");
        c2365d3.m7292c(null, "bringIntoViewSpec");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C16473w2) abstractC2316v).m46645j1(null, null, null, this.f4531x, this.f4530w, this.f4529E, this.f4532y, this.f4533z);
    }
}
