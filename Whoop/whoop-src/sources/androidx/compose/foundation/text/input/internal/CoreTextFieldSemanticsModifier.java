package androidx.compose.foundation.text.input.internal;

import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p078d1.C11450c;
import p078d1.C11452e;
import p133f1.C13977s1;
import p164g2.C15247s;
import p294l3.C23283u0;
import p412q3.C29869e0;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p510u0.C34354s0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifier;", "La3/h1;", "Ld1/e;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class CoreTextFieldSemanticsModifier extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final boolean f4668E;

    /* JADX INFO: renamed from: F */
    public final boolean f4669F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC29884r f4670G;

    /* JADX INFO: renamed from: H */
    public final C13977s1 f4671H;

    /* JADX INFO: renamed from: I */
    public final C29878l f4672I;

    /* JADX INFO: renamed from: J */
    public final C15247s f4673J;

    /* JADX INFO: renamed from: w */
    public final C29869e0 f4674w;

    /* JADX INFO: renamed from: x */
    public final C29891y f4675x;

    /* JADX INFO: renamed from: y */
    public final C34354s0 f4676y;

    /* JADX INFO: renamed from: z */
    public final boolean f4677z;

    public CoreTextFieldSemanticsModifier(C29869e0 c29869e0, C29891y c29891y, C34354s0 c34354s0, boolean z4, boolean z13, boolean z14, InterfaceC29884r interfaceC29884r, C13977s1 c13977s1, C29878l c29878l, C15247s c15247s) {
        this.f4674w = c29869e0;
        this.f4675x = c29891y;
        this.f4676y = c34354s0;
        this.f4677z = z4;
        this.f4668E = z13;
        this.f4669F = z14;
        this.f4670G = interfaceC29884r;
        this.f4671H = c13977s1;
        this.f4672I = c29878l;
        this.f4673J = c15247s;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C11452e c11452e = new C11452e();
        c11452e.f36734Q = this.f4674w;
        c11452e.f36735R = this.f4675x;
        c11452e.f36736S = this.f4676y;
        c11452e.f36737T = this.f4677z;
        c11452e.f36738U = this.f4668E;
        c11452e.f36739V = this.f4669F;
        c11452e.f36740W = this.f4670G;
        C13977s1 c13977s1 = this.f4671H;
        c11452e.f36741X = c13977s1;
        c11452e.f36742Y = this.f4672I;
        c11452e.f36743Z = this.f4673J;
        c13977s1.f49851g = new C11450c(c11452e, 4);
        return c11452e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return AbstractC22676k.m65745e(this.f4674w, coreTextFieldSemanticsModifier.f4674w) && AbstractC22676k.m65745e(this.f4675x, coreTextFieldSemanticsModifier.f4675x) && AbstractC22676k.m65745e(this.f4676y, coreTextFieldSemanticsModifier.f4676y) && this.f4677z == coreTextFieldSemanticsModifier.f4677z && this.f4668E == coreTextFieldSemanticsModifier.f4668E && this.f4669F == coreTextFieldSemanticsModifier.f4669F && AbstractC22676k.m65745e(this.f4670G, coreTextFieldSemanticsModifier.f4670G) && AbstractC22676k.m65745e(this.f4671H, coreTextFieldSemanticsModifier.f4671H) && AbstractC22676k.m65745e(this.f4672I, coreTextFieldSemanticsModifier.f4672I) && AbstractC22676k.m65745e(this.f4673J, coreTextFieldSemanticsModifier.f4673J);
    }

    public final int hashCode() {
        return this.f4673J.hashCode() + ((this.f4672I.hashCode() + ((this.f4671H.hashCode() + ((this.f4670G.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f4676y.hashCode() + ((this.f4675x.hashCode() + (this.f4674w.hashCode() * 31)) * 31)) * 31, 31, this.f4677z), 31, this.f4668E), 31, this.f4669F)) * 31)) * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f4674w + ", value=" + this.f4675x + ", state=" + this.f4676y + ", readOnly=" + this.f4677z + ", enabled=" + this.f4668E + ", isPassword=" + this.f4669F + ", offsetMapping=" + this.f4670G + ", manager=" + this.f4671H + ", imeOptions=" + this.f4672I + ", focusRequester=" + this.f4673J + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C11452e c11452e = (C11452e) abstractC2316v;
        boolean z4 = c11452e.f36738U;
        boolean z13 = false;
        boolean z14 = z4 && !c11452e.f36737T;
        boolean z15 = c11452e.f36739V;
        C29878l c29878l = c11452e.f36742Y;
        C13977s1 c13977s1 = c11452e.f36741X;
        boolean z16 = this.f4677z;
        boolean z17 = this.f4668E;
        if (z17 && !z16) {
            z13 = true;
        }
        c11452e.f36734Q = this.f4674w;
        C29891y c29891y = this.f4675x;
        c11452e.f36735R = c29891y;
        c11452e.f36736S = this.f4676y;
        c11452e.f36737T = z16;
        c11452e.f36738U = z17;
        c11452e.f36740W = this.f4670G;
        C13977s1 c13977s2 = this.f4671H;
        c11452e.f36741X = c13977s2;
        C29878l c29878l2 = this.f4672I;
        c11452e.f36742Y = c29878l2;
        c11452e.f36743Z = this.f4673J;
        if (z17 != z4 || z13 != z14 || !AbstractC22676k.m65745e(c29878l2, c29878l) || this.f4669F != z15 || !C23283u0.m67357c(c29891y.f122126b)) {
            AbstractC0201g.m510j(c11452e);
        }
        if (c13977s2.equals(c13977s1)) {
            return;
        }
        c13977s2.f49851g = new C11450c(c11452e, 0);
    }
}
