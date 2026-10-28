package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37874b implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162191a;

    public C37874b(IdentifierSpec identifier) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162191a = identifier;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162191a;
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
        return false;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: e */
    public final InterfaceC13037f2 mo43551e() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37874b) && AbstractC22676k.m65745e(this.f162191a, ((C37874b) obj).f162191a);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return this.f162191a.hashCode() * 31;
    }

    public final String toString() {
        return "AffirmHeaderElement(identifier=" + this.f162191a + ", controller=null)";
    }
}
