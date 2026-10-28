package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13062m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p180h0.C16463u2;
import p673z7.C40137a;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import v33.AbstractC35638w;
import v33.C35629n;

/* JADX INFO: renamed from: t23.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C33394h implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139455w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33368c0 f139456x;

    public /* synthetic */ C33394h(C33368c0 c33368c0, int i13) {
        this.f139455w = i13;
        this.f139456x = c33368c0;
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        int i13 = this.f139455w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C33368c0 c33368c0 = this.f139456x;
        switch (i13) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C40137a c40137a = c33368c0.f139311y;
                if (c40137a.f173192a == 0 || (fFloatValue != 0.0f && fFloatValue >= ((Number) ((C13081r1) c40137a.f173195d).f45200w.getValue()).floatValue())) {
                    C2996c2 c2996c2 = (C2996c2) c40137a.f173194c;
                    if (c2996c2 != null) {
                        c2996c2.cancel((CancellationException) null);
                    }
                    c40137a.f173194c = AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(interfaceC30057d.getContext()), null, null, new C16463u2(c40137a, ((Number) ((C13045h2) c40137a.f173193b).getValue()).floatValue(), fFloatValue, null, 1), 3);
                }
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                break;
            default:
                AbstractC35638w abstractC35638w = (AbstractC35638w) obj;
                if (abstractC35638w instanceof C35629n) {
                    c33368c0.f139282Q = ((C35629n) abstractC35638w).f151425c * 1000;
                    C2345k c2345kM105816g = c33368c0.m105816g();
                    InterfaceC2339e interfaceC2339e = c2345kM105816g.f9275c;
                    String str = c2345kM105816g.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345kM105816g.f9274b.log(enumC2341g, str, AbstractC2875y.m8296i(c33368c0.f139282Q / 1000, "[join] #deadline for reconnect is ", " seconds"), null);
                    }
                }
                break;
        }
        return c23454a0;
    }
}
