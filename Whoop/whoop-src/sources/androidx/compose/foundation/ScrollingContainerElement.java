package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.C13798k;
import p132f0.C13824s1;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16450s;
import p180h0.InterfaceC16478x2;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/ScrollingContainerElement;", "La3/h1;", "Lf0/s1;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ScrollingContainerElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final InterfaceC21083i f4500E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC16450s f4501F;

    /* JADX INFO: renamed from: G */
    public final boolean f4502G;

    /* JADX INFO: renamed from: H */
    public final C13798k f4503H;

    /* JADX INFO: renamed from: w */
    public final InterfaceC16478x2 f4504w;

    /* JADX INFO: renamed from: x */
    public final EnumC16377d2 f4505x;

    /* JADX INFO: renamed from: y */
    public final boolean f4506y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC16432o1 f4507z;

    public ScrollingContainerElement(C13798k c13798k, InterfaceC16450s interfaceC16450s, InterfaceC16432o1 interfaceC16432o1, EnumC16377d2 enumC16377d2, InterfaceC16478x2 interfaceC16478x2, InterfaceC21083i interfaceC21083i, boolean z4, boolean z13) {
        this.f4504w = interfaceC16478x2;
        this.f4505x = enumC16377d2;
        this.f4506y = z4;
        this.f4507z = interfaceC16432o1;
        this.f4500E = interfaceC21083i;
        this.f4501F = interfaceC16450s;
        this.f4502G = z13;
        this.f4503H = c13798k;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C13824s1 c13824s1 = new C13824s1();
        c13824s1.f49332Q = this.f4504w;
        c13824s1.f49333R = this.f4505x;
        c13824s1.f49334S = this.f4506y;
        c13824s1.f49335T = this.f4507z;
        c13824s1.f49336U = this.f4500E;
        c13824s1.f49337V = this.f4501F;
        c13824s1.f49338W = this.f4502G;
        c13824s1.f49339X = this.f4503H;
        return c13824s1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return AbstractC22676k.m65745e(this.f4504w, scrollingContainerElement.f4504w) && this.f4505x == scrollingContainerElement.f4505x && this.f4506y == scrollingContainerElement.f4506y && AbstractC22676k.m65745e(this.f4507z, scrollingContainerElement.f4507z) && AbstractC22676k.m65745e(this.f4500E, scrollingContainerElement.f4500E) && AbstractC22676k.m65745e(this.f4501F, scrollingContainerElement.f4501F) && this.f4502G == scrollingContainerElement.f4502G && AbstractC22676k.m65745e(this.f4503H, scrollingContainerElement.f4503H);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f4505x.hashCode() + (this.f4504w.hashCode() * 31)) * 31, 31, this.f4506y), 31, false);
        InterfaceC16432o1 interfaceC16432o1 = this.f4507z;
        int iHashCode = (iM8289b + (interfaceC16432o1 != null ? interfaceC16432o1.hashCode() : 0)) * 31;
        InterfaceC21083i interfaceC21083i = this.f4500E;
        int iHashCode2 = (iHashCode + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31;
        InterfaceC16450s interfaceC16450s = this.f4501F;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode2 + (interfaceC16450s != null ? interfaceC16450s.hashCode() : 0)) * 31, 31, this.f4502G);
        C13798k c13798k = this.f4503H;
        return iM8289b2 + (c13798k != null ? c13798k.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("scrollingContainer");
        c2404l2.m7400b().m7292c(this.f4504w, "state");
        c2404l2.m7400b().m7292c(this.f4505x, "orientation");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4506y), "enabled");
        c2404l2.m7400b().m7292c(Boolean.FALSE, "reverseScrolling");
        c2404l2.m7400b().m7292c(this.f4507z, "flingBehavior");
        c2404l2.m7400b().m7292c(this.f4500E, "interactionSource");
        c2404l2.m7400b().m7292c(this.f4501F, "bringIntoViewSpec");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4502G), "useLocalOverscrollFactory");
        c2404l2.m7400b().m7292c(this.f4503H, "overscrollEffect");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        InterfaceC21083i interfaceC21083i = this.f4500E;
        ((C13824s1) abstractC2316v).m39188c1(this.f4503H, this.f4501F, this.f4507z, this.f4505x, this.f4504w, interfaceC21083i, this.f4502G, this.f4506y);
    }
}
