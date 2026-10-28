package fc3;

import androidx.room.C1769b2;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import dc3.C11935t;
import dc3.EnumC11916a;
import dc3.InterfaceC11936u;
import dc3.InterfaceC11938w;
import ec3.C13015a0;
import l83.C23454a0;
import mc3.AbstractC25444j;
import p007a6.C0410c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;

/* JADX INFO: renamed from: fc3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C14375f extends AbstractC14373d {

    /* JADX INFO: renamed from: E */
    public final int f52488E;

    /* JADX INFO: renamed from: z */
    public final C13015a0 f52489z;

    public C14375f(C13015a0 c13015a0, int i13, InterfaceC30063j interfaceC30063j, int i14, EnumC11916a enumC11916a) {
        super(interfaceC30063j, i14, enumC11916a);
        this.f52489z = c13015a0;
        this.f52488E = i13;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: c */
    public final String mo36561c() {
        return "concurrency=" + this.f52488E;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: e */
    public final Object mo36558e(InterfaceC11936u interfaceC11936u, InterfaceC30057d interfaceC30057d) {
        Object objCollect = this.f52489z.collect(new C1769b2((InterfaceC3027k1) interfaceC30057d.getContext().get(C3023j1.f12041w), AbstractC25444j.m74674a(this.f52488E), interfaceC11936u, new C14392w(interfaceC11936u), 2), interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: f */
    public final AbstractC14373d mo36559f(InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return new C14375f(this.f52489z, this.f52488E, interfaceC30063j, i13, enumC11916a);
    }

    @Override // fc3.AbstractC14373d
    /* JADX INFO: renamed from: h */
    public final InterfaceC11938w mo36563h(InterfaceC2994c0 interfaceC2994c0) {
        InterfaceC4351m c0410c = new C0410c(this, null, 15);
        EnumC11916a enumC11916a = EnumC11916a.f38982w;
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12004w;
        C11935t c11935t = new C11935t(AbstractC3006f0.m8695A(interfaceC2994c0, this.f52480w), AbstractC30060g.m92111d(this.f52481x, 4, enumC11916a), true, true);
        c11935t.m8676b0(enumC2998d0, c11935t, c0410c);
        return c11935t;
    }
}
