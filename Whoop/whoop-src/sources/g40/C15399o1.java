package g40;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import eg.C13161j;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g40.o1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15399o1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f57853a;

    /* JADX INFO: renamed from: b */
    public final C15389m1 f57854b;

    public C15399o1(IdentifierSpec identifier, C15389m1 c15389m1) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f57853a = identifier;
        this.f57854b = c15389m1;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f57853a;
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
        return AbstractC3269g.m9484M(this.f57854b.f57835c, new C13161j(this, 21));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15399o1)) {
            return false;
        }
        C15399o1 c15399o1 = (C15399o1) obj;
        return AbstractC22676k.m65745e(this.f57853a, c15399o1.f57853a) && AbstractC22676k.m65745e(this.f57854b, c15399o1.f57854b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return this.f57854b.hashCode() + (this.f57853a.hashCode() * 31);
    }

    public final String toString() {
        return "OTPElement(identifier=" + this.f57853a + ", controller=" + this.f57854b + ")";
    }
}
