package p025b1;

import a33.C0351c;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.C13776c1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.C37816b;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b1.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2212c implements InterfaceC2216g {

    /* JADX INFO: renamed from: a */
    public final C37816b f8828a;

    /* JADX INFO: renamed from: b */
    public final C13776c1 f8829b = new C13776c1();

    /* JADX INFO: renamed from: c */
    public final C28633k1 f8830c = AbstractC28683x.m87272z(null);

    public C2212c(C37816b c37816b) {
        this.f8828a = c37816b;
    }

    @Override // p025b1.InterfaceC2216g
    /* JADX INFO: renamed from: a */
    public final Object mo7049a(InterfaceC2215f interfaceC2215f, AbstractC32275i abstractC32275i) {
        Object objM39137b = C13776c1.m39137b(this.f8829b, new C0351c(this, new C2211b(interfaceC2215f), null, 2), abstractC32275i);
        return objM39137b == EnumC31071a.f128113w ? objM39137b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final void m7050b(final InterfaceC4339a interfaceC4339a, Composer composer, final int i13) {
        final InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(723898654);
        int i14 = (c28655q.m87153g(this) ? 32 : 16) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2211b c2211b = (C2211b) this.f8830c.getValue();
            if (c2211b == null) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i15 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m(this, interfaceC4339a, i13, i15) { // from class: b1.a

                        /* JADX INFO: renamed from: w */
                        public final /* synthetic */ int f8823w;

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C2212c f8824x;

                        /* JADX INFO: renamed from: y */
                        public final /* synthetic */ InterfaceC4339a f8825y;

                        {
                            this.f8823w = i15;
                            this.f8824x = this;
                        }

                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = this.f8823w;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i16) {
                                case 0:
                                    this.f8824x.m7050b(this.f8825y, composer2, AbstractC28683x.m87244L(7));
                                    break;
                                default:
                                    this.f8824x.m7050b(this.f8825y, composer2, AbstractC28683x.m87244L(7));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC4339a2 = interfaceC4339a;
            this.f8828a.invoke(c2211b, c2211b.f8826a, interfaceC4339a2, c28655q, 384);
        } else {
            interfaceC4339a2 = interfaceC4339a;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i16 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m(this, interfaceC4339a2, i13, i16) { // from class: b1.a

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ int f8823w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C2212c f8824x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ InterfaceC4339a f8825y;

                {
                    this.f8823w = i16;
                    this.f8824x = this;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i17 = this.f8823w;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i17) {
                        case 0:
                            this.f8824x.m7050b(this.f8825y, composer2, AbstractC28683x.m87244L(7));
                            break;
                        default:
                            this.f8824x.m7050b(this.f8825y, composer2, AbstractC28683x.m87244L(7));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
