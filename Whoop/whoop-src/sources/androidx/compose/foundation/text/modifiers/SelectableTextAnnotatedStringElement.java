package androidx.compose.foundation.text.modifiers;

import d13.AbstractC11478a;
import java.util.List;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p105e1.C12521h;
import p105e1.C12523j;
import p105e1.C12529p;
import p208i2.InterfaceC17868a0;
import p294l3.C23254g;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p510u0.C34311e;
import p510u0.InterfaceC34372z0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "La3/h1;", "Le1/h;", "Li2/a0;", "color", "Li2/a0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SelectableTextAnnotatedStringElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final int f4681E;

    /* JADX INFO: renamed from: F */
    public final boolean f4682F;

    /* JADX INFO: renamed from: G */
    public final int f4683G;

    /* JADX INFO: renamed from: H */
    public final int f4684H;

    /* JADX INFO: renamed from: I */
    public final List f4685I;

    /* JADX INFO: renamed from: J */
    public final Function1 f4686J;

    /* JADX INFO: renamed from: K */
    public final C12523j f4687K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC34372z0 f4688L;
    private final InterfaceC17868a0 color;

    /* JADX INFO: renamed from: w */
    public final C23254g f4689w;

    /* JADX INFO: renamed from: x */
    public final C23285v0 f4690x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28770h f4691y;

    /* JADX INFO: renamed from: z */
    public final Function1 f4692z;

    public SelectableTextAnnotatedStringElement(C23254g c23254g, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, Function1 function1, int i13, boolean z4, int i14, int i15, List list, Function1 function2, C12523j c12523j, InterfaceC17868a0 interfaceC17868a0, InterfaceC34372z0 interfaceC34372z0) {
        this.f4689w = c23254g;
        this.f4690x = c23285v0;
        this.f4691y = interfaceC28770h;
        this.f4692z = function1;
        this.f4681E = i13;
        this.f4682F = z4;
        this.f4683G = i14;
        this.f4684H = i15;
        this.f4685I = list;
        this.f4686J = function2;
        this.f4687K = c12523j;
        this.color = interfaceC17868a0;
        this.f4688L = interfaceC34372z0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C12521h(this.f4689w, this.f4690x, this.f4691y, this.f4692z, this.f4681E, this.f4682F, this.f4683G, this.f4684H, this.f4685I, this.f4686J, this.f4687K, this.color, this.f4688L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return AbstractC22676k.m65745e(this.color, selectableTextAnnotatedStringElement.color) && AbstractC22676k.m65745e(this.f4689w, selectableTextAnnotatedStringElement.f4689w) && AbstractC22676k.m65745e(this.f4690x, selectableTextAnnotatedStringElement.f4690x) && AbstractC22676k.m65745e(this.f4685I, selectableTextAnnotatedStringElement.f4685I) && AbstractC22676k.m65745e(this.f4691y, selectableTextAnnotatedStringElement.f4691y) && AbstractC22676k.m65745e(this.f4688L, selectableTextAnnotatedStringElement.f4688L) && this.f4692z == selectableTextAnnotatedStringElement.f4692z && this.f4681E == selectableTextAnnotatedStringElement.f4681E && this.f4682F == selectableTextAnnotatedStringElement.f4682F && this.f4683G == selectableTextAnnotatedStringElement.f4683G && this.f4684H == selectableTextAnnotatedStringElement.f4684H && this.f4686J == selectableTextAnnotatedStringElement.f4686J && AbstractC22676k.m65745e(this.f4687K, selectableTextAnnotatedStringElement.f4687K);
    }

    public final int hashCode() {
        int iHashCode = (this.f4691y.hashCode() + AbstractC11478a.m30849a(this.f4689w.hashCode() * 31, 31, this.f4690x)) * 31;
        Function1 function1 = this.f4692z;
        int iM8289b = (((AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f4681E, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f4682F) + this.f4683G) * 31) + this.f4684H) * 31;
        List list = this.f4685I;
        int iHashCode2 = (iM8289b + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.f4686J;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 31;
        C12523j c12523j = this.f4687K;
        int iHashCode4 = (iHashCode3 + (c12523j != null ? c12523j.hashCode() : 0)) * 31;
        InterfaceC34372z0 interfaceC34372z0 = this.f4688L;
        int iHashCode5 = (iHashCode4 + (interfaceC34372z0 != null ? ((C34311e) interfaceC34372z0).hashCode() : 0)) * 31;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        return iHashCode5 + (interfaceC17868a0 != null ? interfaceC17868a0.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        boolean z4;
        C12521h c12521h = (C12521h) abstractC2316v;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        C12529p c12529p = c12521h.f42774R;
        boolean zM65745e = AbstractC22676k.m65745e(interfaceC17868a0, c12529p.f42810Z);
        c12529p.f42810Z = interfaceC17868a0;
        C23285v0 c23285v0 = this.f4690x;
        if (zM65745e) {
            C23285v0 c23285v1 = c12529p.f42800P;
            if (c23285v0 == c23285v1) {
                c23285v0.getClass();
            } else if (!c23285v0.f92255a.m67327c(c23285v1.f92255a)) {
                z4 = true;
            }
            z4 = false;
        } else {
            z4 = true;
        }
        boolean zM35203c1 = c12529p.m35203c1(this.f4689w);
        boolean zM35202b1 = c12521h.f42774R.m35202b1(c23285v0, this.f4685I, this.f4684H, this.f4683G, this.f4682F, this.f4691y, this.f4681E, this.f4688L);
        Function1 function1 = this.f4692z;
        Function1 function2 = this.f4686J;
        C12523j c12523j = this.f4687K;
        c12529p.m35198X0(z4, zM35203c1, zM35202b1, c12529p.m35201a1(function1, function2, c12523j, null));
        c12521h.f42773Q = c12523j;
        AbstractC0201g.m509i(c12521h);
    }
}
