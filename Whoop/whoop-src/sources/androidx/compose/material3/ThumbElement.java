package androidx.compose.material3;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.C11362i1;
import p238j0.InterfaceC21083i;
import p292l1.C23161q4;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/ThumbElement;", "La3/h1;", "Ll1/q4;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class ThumbElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4746w;

    /* JADX INFO: renamed from: x */
    public final boolean f4747x;

    /* JADX INFO: renamed from: y */
    public final C11362i1 f4748y;

    public ThumbElement(InterfaceC21083i interfaceC21083i, boolean z4, C11362i1 c11362i1) {
        this.f4746w = interfaceC21083i;
        this.f4747x = z4;
        this.f4748y = c11362i1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23161q4 c23161q4 = new C23161q4();
        c23161q4.f91609O = this.f4746w;
        c23161q4.f91610P = this.f4747x;
        c23161q4.f91611Q = this.f4748y;
        c23161q4.f91615U = Float.NaN;
        c23161q4.f91616V = Float.NaN;
        return c23161q4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return AbstractC22676k.m65745e(this.f4746w, thumbElement.f4746w) && this.f4747x == thumbElement.f4747x && this.f4748y.equals(thumbElement.f4748y);
    }

    public final int hashCode() {
        return this.f4748y.hashCode() + AbstractC2875y.m8289b(this.f4746w.hashCode() * 31, 31, this.f4747x);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "switchThumb";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4746w, "interactionSource");
        c2365d3.m7292c(Boolean.valueOf(this.f4747x), "checked");
        c2365d3.m7292c(this.f4748y, "animationSpec");
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.f4746w + ", checked=" + this.f4747x + ", animationSpec=" + this.f4748y + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C23161q4 c23161q4 = (C23161q4) abstractC2316v;
        c23161q4.f91609O = this.f4746w;
        boolean z4 = c23161q4.f91610P;
        boolean z13 = this.f4747x;
        if (z4 != z13) {
            AbstractC0201g.m509i(c23161q4);
        }
        c23161q4.f91610P = z13;
        c23161q4.f91611Q = this.f4748y;
        if (c23161q4.f91614T == null && !Float.isNaN(c23161q4.f91616V)) {
            c23161q4.f91614T = AbstractC11348f.m30553a(c23161q4.f91616V);
        }
        if (c23161q4.f91613S != null || Float.isNaN(c23161q4.f91615U)) {
            return;
        }
        c23161q4.f91613S = AbstractC11348f.m30553a(c23161q4.f91615U);
    }
}
