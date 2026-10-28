package g40;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import eg.C13161j;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.v2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15435v2 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f58018a;

    /* JADX INFO: renamed from: b */
    public final C15430u2 f58019b;

    public C15435v2(IdentifierSpec identifier, C15430u2 c15430u2) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f58018a = identifier;
        this.f58019b = c15430u2;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f58018a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return null;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: d */
    public final boolean mo43550d() {
        return true;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9484M(this.f58019b.f58002d, new C13161j(this, 23));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15435v2)) {
            return false;
        }
        C15435v2 c15435v2 = (C15435v2) obj;
        return AbstractC22676k.m65745e(this.f58018a, c15435v2.f58018a) && AbstractC22676k.m65745e(this.f58019b, c15435v2.f58019b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return this.f58019b.hashCode() + (this.f58018a.hashCode() * 31);
    }

    public final String toString() {
        return "SameAsShippingElement(identifier=" + this.f58018a + ", controller=" + this.f58019b + ")";
    }
}
