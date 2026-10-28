package androidx.compose.foundation.lazy;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p329n0.C26072y;
import p390p1.C28621h1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "La3/h1;", "Ln0/y;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ParentSizeElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final float f4595w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC28670t2 f4596x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28670t2 f4597y;

    /* JADX INFO: renamed from: z */
    public final String f4598z;

    public ParentSizeElement(float f13, C28621h1 c28621h1, C28621h1 c28621h2, String str, int i13) {
        c28621h1 = (i13 & 2) != 0 ? null : c28621h1;
        c28621h2 = (i13 & 4) != 0 ? null : c28621h2;
        this.f4595w = f13;
        this.f4596x = c28621h1;
        this.f4597y = c28621h2;
        this.f4598z = str;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C26072y c26072y = new C26072y();
        c26072y.f103244O = this.f4595w;
        c26072y.f103245P = this.f4596x;
        c26072y.f103246Q = this.f4597y;
        return c26072y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f4595w == parentSizeElement.f4595w && AbstractC22676k.m65745e(this.f4596x, parentSizeElement.f4596x) && AbstractC22676k.m65745e(this.f4597y, parentSizeElement.f4597y);
    }

    public final int hashCode() {
        InterfaceC28670t2 interfaceC28670t2 = this.f4596x;
        int iHashCode = (interfaceC28670t2 != null ? interfaceC28670t2.hashCode() : 0) * 31;
        InterfaceC28670t2 interfaceC28670t3 = this.f4597y;
        return Float.hashCode(this.f4595w) + ((iHashCode + (interfaceC28670t3 != null ? interfaceC28670t3.hashCode() : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = this.f4598z;
        c2404l2.f9458b = Float.valueOf(this.f4595w);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C26072y c26072y = (C26072y) abstractC2316v;
        c26072y.f103244O = this.f4595w;
        c26072y.f103245P = this.f4596x;
        c26072y.f103246Q = this.f4597y;
    }
}
