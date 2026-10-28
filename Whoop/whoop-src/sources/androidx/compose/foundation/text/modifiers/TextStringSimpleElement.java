package androidx.compose.foundation.text.modifiers;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p105e1.C12520g;
import p105e1.C12532s;
import p208i2.InterfaceC17868a0;
import p294l3.C23285v0;
import p392p3.InterfaceC28770h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "La3/h1;", "Le1/s;", "Li2/a0;", "color", "Li2/a0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TextStringSimpleElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final boolean f4705E;

    /* JADX INFO: renamed from: F */
    public final int f4706F;

    /* JADX INFO: renamed from: G */
    public final int f4707G;
    private final InterfaceC17868a0 color;

    /* JADX INFO: renamed from: w */
    public final String f4708w;

    /* JADX INFO: renamed from: x */
    public final C23285v0 f4709x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC28770h f4710y;

    /* JADX INFO: renamed from: z */
    public final int f4711z;

    public TextStringSimpleElement(String str, C23285v0 c23285v0, InterfaceC28770h interfaceC28770h, int i13, boolean z4, int i14, int i15, InterfaceC17868a0 interfaceC17868a0) {
        this.f4708w = str;
        this.f4709x = c23285v0;
        this.f4710y = interfaceC28770h;
        this.f4711z = i13;
        this.f4705E = z4;
        this.f4706F = i14;
        this.f4707G = i15;
        this.color = interfaceC17868a0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        C12532s c12532s = new C12532s();
        c12532s.f42823O = this.f4708w;
        c12532s.f42824P = this.f4709x;
        c12532s.f42825Q = this.f4710y;
        c12532s.f42826R = this.f4711z;
        c12532s.f42827S = this.f4705E;
        c12532s.f42828T = this.f4706F;
        c12532s.f42829U = this.f4707G;
        c12532s.f42830V = interfaceC17868a0;
        return c12532s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return AbstractC22676k.m65745e(this.color, textStringSimpleElement.color) && AbstractC22676k.m65745e(this.f4708w, textStringSimpleElement.f4708w) && AbstractC22676k.m65745e(this.f4709x, textStringSimpleElement.f4709x) && AbstractC22676k.m65745e(this.f4710y, textStringSimpleElement.f4710y) && this.f4711z == textStringSimpleElement.f4711z && this.f4705E == textStringSimpleElement.f4705E && this.f4706F == textStringSimpleElement.f4706F && this.f4707G == textStringSimpleElement.f4707G;
    }

    public final int hashCode() {
        int iM8289b = (((AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f4711z, (this.f4710y.hashCode() + AbstractC11478a.m30849a(this.f4708w.hashCode() * 31, 31, this.f4709x)) * 31, 31), 31, this.f4705E) + this.f4706F) * 31) + this.f4707G) * 31;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        return iM8289b + (interfaceC17868a0 != null ? interfaceC17868a0.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        boolean z4;
        C12532s c12532s = (C12532s) abstractC2316v;
        InterfaceC17868a0 interfaceC17868a0 = this.color;
        boolean zM65745e = AbstractC22676k.m65745e(interfaceC17868a0, c12532s.f42830V);
        c12532s.f42830V = interfaceC17868a0;
        boolean z13 = false;
        boolean z14 = true;
        C23285v0 c23285v0 = this.f4709x;
        if (zM65745e) {
            C23285v0 c23285v1 = c12532s.f42824P;
            if (c23285v0 == c23285v1) {
                c23285v0.getClass();
            } else if (!c23285v0.f92255a.m67327c(c23285v1.f92255a)) {
                z4 = true;
            }
            z4 = false;
        } else {
            z4 = true;
        }
        String str = c12532s.f42823O;
        String str2 = this.f4708w;
        if (!AbstractC22676k.m65745e(str, str2)) {
            c12532s.f42823O = str2;
            c12532s.f42834Z = null;
            z13 = true;
        }
        boolean z15 = !c12532s.f42824P.m67367d(c23285v0);
        c12532s.f42824P = c23285v0;
        int i13 = c12532s.f42829U;
        int i14 = this.f4707G;
        if (i13 != i14) {
            c12532s.f42829U = i14;
            z15 = true;
        }
        int i15 = c12532s.f42828T;
        int i16 = this.f4706F;
        if (i15 != i16) {
            c12532s.f42828T = i16;
            z15 = true;
        }
        boolean z16 = c12532s.f42827S;
        boolean z17 = this.f4705E;
        if (z16 != z17) {
            c12532s.f42827S = z17;
            z15 = true;
        }
        InterfaceC28770h interfaceC28770h = c12532s.f42825Q;
        InterfaceC28770h interfaceC28770h2 = this.f4710y;
        if (!AbstractC22676k.m65745e(interfaceC28770h, interfaceC28770h2)) {
            c12532s.f42825Q = interfaceC28770h2;
            z15 = true;
        }
        int i17 = c12532s.f42826R;
        int i18 = this.f4711z;
        if (i17 == i18) {
            z14 = z15;
        } else {
            c12532s.f42826R = i18;
        }
        if (z13 || z14) {
            C12520g c12520gM35204X0 = c12532s.m35204X0();
            String str3 = c12532s.f42823O;
            C23285v0 c23285v2 = c12532s.f42824P;
            InterfaceC28770h interfaceC28770h3 = c12532s.f42825Q;
            int i19 = c12532s.f42826R;
            boolean z18 = c12532s.f42827S;
            int i24 = c12532s.f42828T;
            int i25 = c12532s.f42829U;
            c12520gM35204X0.f42754a = str3;
            c12520gM35204X0.f42755b = c23285v2;
            c12520gM35204X0.f42756c = interfaceC28770h3;
            c12520gM35204X0.f42757d = i19;
            c12520gM35204X0.f42758e = z18;
            c12520gM35204X0.f42759f = i24;
            c12520gM35204X0.f42760g = i25;
            c12520gM35204X0.f42772s = (c12520gM35204X0.f42772s << 2) | 2;
            c12520gM35204X0.m35179c();
        }
        if (c12532s.f9141N) {
            if (z13 || (z4 && c12532s.f42833Y != null)) {
                AbstractC0201g.m510j(c12532s);
            }
            if (z13 || z14) {
                AbstractC0201g.m509i(c12532s);
                AbstractC0201g.m508h(c12532s);
            }
            if (z4) {
                AbstractC0201g.m508h(c12532s);
            }
        }
    }
}
