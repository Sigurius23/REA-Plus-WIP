package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.InterfaceC13037f2;
import g40.InterfaceC15367i1;
import m83.C25271y;
import p000.AbstractC11266d;
import p479s4.AbstractC32128i;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C37883e implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162205a;

    /* JADX INFO: renamed from: b */
    public final String f162206b;

    /* JADX INFO: renamed from: c */
    public final C41210b f162207c;

    public C37883e(IdentifierSpec identifier, String str) {
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162205a = identifier;
        this.f162206b = str;
        this.f162207c = AbstractC32128i.m100064s(R.string.stripe_au_becs_mandate, new Object[]{str}, C25271y.f99162w);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162205a;
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: b */
    public final void mo43548b(boolean z4) {
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43549c() {
        return this.f162207c;
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
        if (!(obj instanceof C37883e)) {
            return false;
        }
        C37883e c37883e = (C37883e) obj;
        return AbstractC22676k.m65745e(this.f162205a, c37883e.f162205a) && this.f162206b.equals(c37883e.f162206b);
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }

    public final int hashCode() {
        return AbstractC11266d.m30450d(this.f162205a.hashCode() * 31, 31, this.f162206b);
    }

    public final String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + this.f162205a + ", merchantName=" + this.f162206b + ", controller=null)";
    }
}
