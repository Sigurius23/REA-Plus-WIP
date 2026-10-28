package androidx.compose.foundation.lazy.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p077d0.C11362i1;
import p077d0.InterfaceC11337c0;
import p389p0.C28530j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "La3/h1;", "Lp0/j;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC11337c0 f4601w;

    /* JADX INFO: renamed from: x */
    public final C11362i1 f4602x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC11337c0 f4603y;

    public LazyLayoutAnimateItemElement(InterfaceC11337c0 interfaceC11337c0, C11362i1 c11362i1, InterfaceC11337c0 interfaceC11337c1) {
        this.f4601w = interfaceC11337c0;
        this.f4602x = c11362i1;
        this.f4603y = interfaceC11337c1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C28530j c28530j = new C28530j();
        c28530j.f115442O = this.f4601w;
        c28530j.f115443P = this.f4602x;
        c28530j.f115444Q = this.f4603y;
        return c28530j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return AbstractC22676k.m65745e(this.f4601w, lazyLayoutAnimateItemElement.f4601w) && this.f4602x.equals(lazyLayoutAnimateItemElement.f4602x) && AbstractC22676k.m65745e(this.f4603y, lazyLayoutAnimateItemElement.f4603y);
    }

    public final int hashCode() {
        InterfaceC11337c0 interfaceC11337c0 = this.f4601w;
        int iHashCode = (this.f4602x.hashCode() + ((interfaceC11337c0 == null ? 0 : interfaceC11337c0.hashCode()) * 31)) * 31;
        InterfaceC11337c0 interfaceC11337c1 = this.f4603y;
        return iHashCode + (interfaceC11337c1 != null ? interfaceC11337c1.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "animateItem";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4601w, "fadeInSpec");
        c2365d3.m7292c(this.f4602x, "placementSpec");
        c2365d3.m7292c(this.f4603y, "fadeOutSpec");
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f4601w + ", placementSpec=" + this.f4602x + ", fadeOutSpec=" + this.f4603y + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C28530j c28530j = (C28530j) abstractC2316v;
        c28530j.f115442O = this.f4601w;
        c28530j.f115443P = this.f4602x;
        c28530j.f115444Q = this.f4603y;
    }
}
