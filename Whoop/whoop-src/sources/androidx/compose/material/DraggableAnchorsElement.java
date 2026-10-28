package androidx.compose.material;

import ej1.C13242h;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p163g1.C14947a0;
import p163g1.C14982d2;
import p180h0.EnumC16377d2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "La3/h1;", "Lg1/d2;", "material"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class DraggableAnchorsElement<T> extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C14947a0 f4716w;

    /* JADX INFO: renamed from: x */
    public final C13242h f4717x;

    public DraggableAnchorsElement(C14947a0 c14947a0, C13242h c13242h) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f4716w = c14947a0;
        this.f4717x = c13242h;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        C14982d2 c14982d2 = new C14982d2();
        c14982d2.f55998O = this.f4716w;
        c14982d2.f55999P = this.f4717x;
        c14982d2.f56000Q = enumC16377d2;
        return c14982d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        if (!AbstractC22676k.m65745e(this.f4716w, draggableAnchorsElement.f4716w) || this.f4717x != draggableAnchorsElement.f4717x) {
            return false;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return true;
    }

    public final int hashCode() {
        return EnumC16377d2.f62971w.hashCode() + ((this.f4717x.hashCode() + (this.f4716w.hashCode() * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C14982d2 c14982d2 = (C14982d2) abstractC2316v;
        c14982d2.f55998O = this.f4716w;
        c14982d2.f55999P = this.f4717x;
        c14982d2.f56000Q = EnumC16377d2.f62971w;
    }
}
