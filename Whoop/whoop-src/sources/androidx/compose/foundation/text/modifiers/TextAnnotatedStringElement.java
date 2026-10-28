package androidx.compose.foundation.text.modifiers;

import d13.AbstractC11478a;
import java.util.List;
import p000.AbstractC11266d;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p105e1.C12529p;
import p208i2.InterfaceC17868a0;
import p294l3.C23254g;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p510u0.InterfaceC34372z0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "La3/h1;", "Le1/p;", "Li2/a0;", "color", "Li2/a0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TextAnnotatedStringElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final int f4693E;

    /* JADX INFO: renamed from: F */
    public final boolean f4694F;

    /* JADX INFO: renamed from: G */
    public final int f4695G;

    /* JADX INFO: renamed from: H */
    public final int f4696H;

    /* JADX INFO: renamed from: I */
    public final List f4697I;

    /* JADX INFO: renamed from: J */
    public final Function1 f4698J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC34372z0 f4699K;

    /* JADX INFO: renamed from: L */
    public final Function1 f4700L;
    private final InterfaceC17868a0 color;

    /* JADX INFO: renamed from: w */
    public final C23254g f4701w;

    /* JADX INFO: renamed from: x */
    public final C23285v0 f4702x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28770h f4703y;

    /* JADX INFO: renamed from: z */
    public final Function1 f4704z;

    public TextAnnotatedStringElement(C23254g c23254g, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, Function1 function1, int i13, boolean z4, int i14, int i15, List list, Function1 function2, InterfaceC17868a0 interfaceC17868a0, InterfaceC34372z0 interfaceC34372z0, Function1 function3) {
        this.f4701w = c23254g;
        this.f4702x = c23285v0;
        this.f4703y = interfaceC28770h;
        this.f4704z = function1;
        this.f4693E = i13;
        this.f4694F = z4;
        this.f4695G = i14;
        this.f4696H = i15;
        this.f4697I = list;
        this.f4698J = function2;
        this.color = interfaceC17868a0;
        this.f4699K = interfaceC34372z0;
        this.f4700L = function3;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C12529p(this.f4701w, this.f4702x, this.f4703y, this.f4704z, this.f4693E, this.f4694F, this.f4695G, this.f4696H, this.f4697I, this.f4698J, null, this.color, this.f4699K, this.f4700L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return AbstractC22676k.m65745e(this.color, textAnnotatedStringElement.color) && AbstractC22676k.m65745e(this.f4701w, textAnnotatedStringElement.f4701w) && AbstractC22676k.m65745e(this.f4702x, textAnnotatedStringElement.f4702x) && AbstractC22676k.m65745e(this.f4697I, textAnnotatedStringElement.f4697I) && AbstractC22676k.m65745e(this.f4703y, textAnnotatedStringElement.f4703y) && this.f4704z == textAnnotatedStringElement.f4704z && this.f4700L == textAnnotatedStringElement.f4700L && this.f4693E == textAnnotatedStringElement.f4693E && this.f4694F == textAnnotatedStringElement.f4694F && this.f4695G == textAnnotatedStringElement.f4695G && this.f4696H == textAnnotatedStringElement.f4696H && this.f4698J == textAnnotatedStringElement.f4698J;
    }

    public final int hashCode() {
        int iHashCode = (this.f4703y.hashCode() + AbstractC11478a.m30849a(this.f4701w.hashCode() * 31, 31, this.f4702x)) * 31;
        Function1 function1 = this.f4704z;
        int iM8289b = (((AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f4693E, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.f4694F) + this.f4695G) * 31) + this.f4696H) * 31;
        List list = this.f4697I;
        int iHashCode2 = (iM8289b + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.f4698J;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 961;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        int iHashCode4 = (iHashCode3 + (interfaceC17868a0 != null ? interfaceC17868a0.hashCode() : 0)) * 31;
        Function1 function3 = this.f4700L;
        return iHashCode4 + (function3 != null ? function3.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        boolean z4;
        C12529p c12529p = (C12529p) abstractC2316v;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        boolean zM65745e = AbstractC22676k.m65745e(interfaceC17868a0, c12529p.f42810Z);
        c12529p.f42810Z = interfaceC17868a0;
        if (zM65745e) {
            C23285v0 c23285v0 = c12529p.f42800P;
            C23285v0 c23285v1 = this.f4702x;
            if (c23285v1 == c23285v0) {
                c23285v1.getClass();
            } else if (!c23285v1.f92255a.m67327c(c23285v0.f92255a)) {
                z4 = true;
            }
            z4 = false;
        } else {
            z4 = true;
        }
        c12529p.m35198X0(z4, c12529p.m35203c1(this.f4701w), c12529p.m35202b1(this.f4702x, this.f4697I, this.f4696H, this.f4695G, this.f4694F, this.f4703y, this.f4693E, this.f4699K), c12529p.m35201a1(this.f4704z, this.f4698J, null, this.f4700L));
    }
}
