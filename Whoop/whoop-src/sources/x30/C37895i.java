package x30;

import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import g40.AbstractC15327b3;
import g40.C15351f3;
import g40.C15392n;
import g40.InterfaceC15379k1;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import uo1.C35141b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: x30.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C37895i extends AbstractC15327b3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f162255b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC15379k1 f162256c;

    /* JADX INFO: renamed from: d */
    public final boolean f162257d;

    /* JADX INFO: renamed from: e */
    public final IdentifierSpec f162258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37895i(IdentifierSpec identifier, C41210b c41210b, InterfaceC4339a interfaceC4339a) {
        super(identifier);
        this.f162255b = 2;
        AbstractC22676k.m65750j(identifier, "identifier");
        this.f162258e = identifier;
        this.f162257d = true;
        this.f162256c = new C15392n(c41210b, interfaceC4339a);
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: a */
    public final IdentifierSpec mo43531a() {
        switch (this.f162255b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f162258e;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: c */
    public final InterfaceC41211c mo43532c() {
        switch (this.f162255b) {
        }
        return null;
    }

    @Override // g40.InterfaceC15450y2
    /* JADX INFO: renamed from: d */
    public final boolean mo43533d() {
        switch (this.f162255b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f162257d;
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: e */
    public InterfaceC13037f2 mo43535e() {
        switch (this.f162255b) {
            case 0:
                return AbstractC3269g.m9484M(this.f162256c.mo43564j(), new C35141b(this, 25));
            default:
                return super.mo43535e();
        }
    }

    @Override // g40.AbstractC15327b3, g40.InterfaceC15450y2
    /* JADX INFO: renamed from: f */
    public InterfaceC13037f2 mo43538f() {
        switch (this.f162255b) {
            case 2:
                return AbstractC13091v.m36593c(AbstractC37056f.m118958J(this.f162258e));
            default:
                return super.mo43538f();
        }
    }

    @Override // g40.AbstractC15327b3
    /* JADX INFO: renamed from: k */
    public final InterfaceC15379k1 mo43534k() {
        switch (this.f162255b) {
            case 0:
                return this.f162256c;
            case 1:
                return this.f162256c;
            default:
                return (C15392n) this.f162256c;
        }
    }

    public C37895i(int i13) {
        this.f162255b = i13;
        switch (i13) {
            case 1:
                C15351f3 c15351f3 = new C15351f3(new C37892h(1), null, null, 6);
                IdentifierSpec.Companion.getClass();
                super(IdentifierSpec.Vpa);
                this.f162256c = c15351f3;
                this.f162257d = true;
                this.f162258e = IdentifierSpec.Vpa;
                break;
            default:
                IdentifierSpec.Companion.getClass();
                IdentifierSpec identifier = IdentifierSpec.BlikCode;
                C15351f3 c15351f4 = new C15351f3(new C37892h(0), null, null, 6);
                AbstractC22676k.m65750j(identifier, "identifier");
                super(identifier);
                this.f162258e = identifier;
                this.f162256c = c15351f4;
                this.f162257d = true;
                break;
        }
    }
}
