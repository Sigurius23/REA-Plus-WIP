package androidx.compose.foundation.layout;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p291l0.C22963h1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/OffsetPxElement;", "La3/h1;", "Ll0/h1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class OffsetPxElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4558w;

    /* JADX INFO: renamed from: x */
    public final boolean f4559x;

    /* JADX INFO: renamed from: y */
    public final Function1 f4560y;

    public OffsetPxElement(Function1 function1, Function1 function2, boolean z4) {
        this.f4558w = function1;
        this.f4559x = z4;
        this.f4560y = function2;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22963h1 c22963h1 = new C22963h1();
        c22963h1.f90616O = this.f4558w;
        c22963h1.f90617P = this.f4559x;
        return c22963h1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.f4558w == offsetPxElement.f4558w && this.f4559x == offsetPxElement.f4559x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4559x) + (this.f4558w.hashCode() * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        this.f4560y.invoke(c2404l2);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("OffsetPxModifier(offset=");
        sb4.append(this.f4558w);
        sb4.append(", rtlAware=");
        return AbstractC2875y.m8305r(sb4, this.f4559x, ')');
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C22963h1 c22963h1 = (C22963h1) abstractC2316v;
        Function1 function1 = c22963h1.f90616O;
        Function1 function2 = this.f4558w;
        boolean z4 = this.f4559x;
        if (function1 != function2 || c22963h1.f90617P != z4) {
            AbstractC0201g.m516p(c22963h1).m645u0(false);
        }
        c22963h1.f90616O = function2;
        c22963h1.f90617P = z4;
    }
}
