package x30;

import bi.AbstractC3269g;
import c13.AbstractC3855a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.C15430u2;
import g40.InterfaceC15367i1;
import m83.C25271y;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37897i1 implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final boolean f162263a;

    /* JADX INFO: renamed from: b */
    public final String f162264b;

    /* JADX INFO: renamed from: c */
    public final C15430u2 f162265c;

    /* JADX INFO: renamed from: d */
    public final IdentifierSpec f162266d;

    public C37897i1(boolean z4, String str) {
        this.f162263a = z4;
        this.f162264b = str;
        this.f162265c = new C15430u2(str, z4);
        IdentifierSpec.Companion.getClass();
        this.f162266d = IdentifierSpec.SaveForFutureUse;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162266d;
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
        return AbstractC3269g.m9484M(this.f162265c.f58002d, new C37894h1(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37897i1)) {
            return false;
        }
        C37897i1 c37897i1 = (C37897i1) obj;
        return this.f162263a == c37897i1.f162263a && AbstractC22676k.m65745e(this.f162264b, c37897i1.f162264b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f162263a) * 31;
        String str = this.f162264b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC3855a.m11825i("SaveForFutureUseElement(initialValue=", ", merchantName=", this.f162264b, ")", this.f162263a);
    }
}
