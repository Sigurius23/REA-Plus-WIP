package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37877c implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162192a;

    /* JADX INFO: renamed from: b */
    public final String f162193b;

    public C37877c(IdentifierSpec identifier, String str) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162192a = identifier;
        this.f162193b = str;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162192a;
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
        if (!(obj instanceof C37877c)) {
            return false;
        }
        C37877c c37877c = (C37877c) obj;
        return AbstractC22676k.m65745e(this.f162192a, c37877c.f162192a) && AbstractC22676k.m65745e(this.f162193b, c37877c.f162193b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        int iHashCode = this.f162192a.hashCode() * 961;
        String str = this.f162193b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AfterpayClearpayHeaderElement(identifier=" + this.f162192a + ", controller=null, currency=" + this.f162193b + ")";
    }
}
