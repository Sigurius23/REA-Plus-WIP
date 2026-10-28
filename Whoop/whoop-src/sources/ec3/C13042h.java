package ec3;

import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import dc3.InterfaceC11938w;
import fc3.AbstractC14373d;
import fc3.C14392w;
import java.util.Iterator;
import l83.C23454a0;
import p007a6.C0410c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.h */
/* JADX INFO: loaded from: classes5.dex */
public class C13042h extends AbstractC14373d {

    /* JADX INFO: renamed from: E */
    public final Object f45081E;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f45082z = 0;

    public C13042h(Iterable iterable, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        super(interfaceC30063j, i13, enumC11916a);
        this.f45081E = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: e */
    public Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d) {
        switch (this.f45082z) {
            case 0:
                Object objInvoke = ((AbstractC32275i) this.f45081E).invoke(interfaceC11936u, interfaceC30057d);
                return objInvoke == EnumC31071a.f128113w ? objInvoke : C23454a0.f92919a;
            default:
                C14392w c14392w = new C14392w(interfaceC11936u);
                Iterator it = this.f45081E.iterator();
                while (it.hasNext()) {
                    AbstractC3006f0.m8732z(interfaceC11936u, null, null, new C0410c((InterfaceC13058l) it.next(), c14392w, null, 16), 3);
                }
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c93.m, s83.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        switch (this.f45082z) {
            case 0:
                return new C13042h((InterfaceC4351m) this.f45081E, interfaceC30063j, i13, enumC11916a);
            default:
                return new C13042h((Iterable) this.f45081E, interfaceC30063j, i13, enumC11916a);
        }
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: h */
    public InterfaceC11938w mo36563h(InterfaceC2994c0 interfaceC2994c0) {
        switch (this.f45082z) {
            case 1:
                InterfaceC4351m c0410c = new C0410c(this, null, 15);
                EnumC11916a enumC11916a = EnumC11916a.f38982w;
                EnumC2998d0 enumC2998d0 = EnumC2998d0.f12004w;
                C11935t c11935t = new C11935t(AbstractC3006f0.m8695A(interfaceC2994c0, this.f52480w), AbstractC30060g.m92111d(this.f52481x, 4, enumC11916a), true, true);
                c11935t.m8676b0(enumC2998d0, c11935t, c0410c);
                return c11935t;
            default:
                return super.mo36563h(interfaceC2994c0);
        }
    }

    @Override // fc3.AbstractC14373d
    public String toString() {
        switch (this.f45082z) {
            case 0:
                return "block[" + ((AbstractC32275i) this.f45081E) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13042h(InterfaceC4351m interfaceC4351m, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        super(interfaceC30063j, i13, enumC11916a);
        this.f45081E = (AbstractC32275i) interfaceC4351m;
    }
}
