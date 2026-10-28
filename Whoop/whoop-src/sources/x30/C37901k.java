package x30;

import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import g40.C15333c3;
import g40.C15351f3;
import g40.InterfaceC15367i1;
import java.util.List;
import m83.C25271y;
import n53.C26318e;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import uo1.C35141b;
import w20.C36727q;

/* JADX INFO: renamed from: x30.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C37901k implements InterfaceC15367i1 {

    /* JADX INFO: renamed from: a */
    public final IdentifierSpec f162280a;

    /* JADX INFO: renamed from: b */
    public final List f162281b;

    /* JADX INFO: renamed from: c */
    public final C15333c3 f162282c;

    /* JADX INFO: renamed from: d */
    public final C26318e f162283d;

    public C37901k(IdentifierSpec identifierSpec, List banks, String str) {
        AbstractC22676k.m65750j(identifierSpec, "identifierSpec");
        AbstractC22676k.m65750j(banks, "banks");
        this.f162280a = identifierSpec;
        this.f162281b = banks;
        IdentifierSpec.Companion.getClass();
        C15333c3 c15333c3 = new C15333c3(C5705a.m16892a("au_becs_debit[bsb_number]"), new C15351f3(new C37898j(banks), str, null, 4));
        this.f162282c = c15333c3;
        this.f162283d = AbstractC3269g.m9484M(c15333c3.f57610c.mo43570p(), new C35141b(this, 26));
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43547a() {
        return this.f162280a;
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
        C15333c3 c15333c3 = this.f162282c;
        return AbstractC3269g.m9509p(c15333c3.f57610c.mo43559c(), c15333c3.f57610c.mo43570p(), new C36727q(this, 6));
    }

    @Override // g40.InterfaceC15367i1
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43552f() {
        return AbstractC3269g.m9493Z(C25271y.f99162w);
    }
}
