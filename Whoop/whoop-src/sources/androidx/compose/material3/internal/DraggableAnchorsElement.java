package androidx.compose.material3.internal;

import c93.InterfaceC4351m;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p180h0.EnumC16377d2;
import p316m1.C24902g;
import p316m1.C24924v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/material3/internal/DraggableAnchorsElement;", "T", "La3/h1;", "Lm1/v;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class DraggableAnchorsElement<T> extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C24902g f4762w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4351m f4763x;

    public DraggableAnchorsElement(C24902g c24902g, InterfaceC4351m interfaceC4351m) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f4762w = c24902g;
        this.f4763x = interfaceC4351m;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        C24924v c24924v = new C24924v();
        c24924v.f97609O = this.f4762w;
        c24924v.f97610P = this.f4763x;
        c24924v.f97611Q = enumC16377d2;
        return c24924v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (!AbstractC22676k.m65745e(this.f4762w, draggableAnchorsElement.f4762w) || this.f4763x != draggableAnchorsElement.f4763x) {
            return false;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return true;
    }

    public final int hashCode() {
        return EnumC16377d2.f62971w.hashCode() + ((this.f4763x.hashCode() + (this.f4762w.hashCode() * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C24924v c24924v = (C24924v) abstractC2316v;
        c24924v.f97609O = this.f4762w;
        c24924v.f97610P = this.f4763x;
        c24924v.f97611Q = EnumC16377d2.f62971w;
    }
}
