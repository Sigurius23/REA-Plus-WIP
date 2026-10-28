package d33;

import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import e33.C12645n;
import e33.C12662v0;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import t23.C33368c0;
import t23.C33432o2;
import z33.C40053b;

/* JADX INFO: renamed from: d33.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C11624r extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37534w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37535x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11624r(C11602h1 c11602h1, int i13) {
        super(0);
        this.f37534w = i13;
        this.f37535x = c11602h1;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [c93.a, kotlin.jvm.internal.m] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC30057d interfaceC30057d = null;
        int i13 = 3;
        switch (this.f37534w) {
            case 0:
                return (Boolean) ((AbstractC22680m) this.f37535x.f37440b.m105817h().f139758f.f139201l.f104635y).invoke();
            case 1:
                C2345k c2345kM31043s = this.f37535x.m31043s();
                InterfaceC2339e interfaceC2339e = c2345kM31043s.f9275c;
                EnumC2341g enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, c2345kM31043s.f9273a)) {
                    c2345kM31043s.f9274b.log(enumC2341g, c2345kM31043s.f9273a, "[cleanup] #sfu; #track; no args", null);
                }
                C11602h1 c11602h1 = this.f37535x;
                AbstractC3006f0.m8732z(c11602h1.f37448j, null, null, new C11614m(c11602h1, interfaceC30057d, i13), 3);
                C12662v0 c12662v0 = (C12662v0) this.f37535x.f37464z.getValue();
                if (c12662v0 != null) {
                    c12662v0.f43298K.m78094b();
                    c12662v0.f43297J.clear();
                    c12662v0.f43293F.clear();
                    c12662v0.f43294G.clear();
                }
                C11602h1 c11602h2 = this.f37535x;
                try {
                    C12662v0 c12662v1 = (C12662v0) c11602h2.f37464z.getValue();
                    if (c12662v1 != null) {
                        c12662v1.m35413b();
                    }
                    C12645n c12645n = (C12645n) c11602h2.f37421A.getValue();
                    if (c12645n != null) {
                        c12645n.m35400p();
                    }
                    break;
                } catch (Exception e5) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e2 = C2343i.f9272d;
                    EnumC2341g enumC2341g2 = EnumC2341g.ERROR;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g2, "SafeCall", AbstractC11266d.m30461o("Exception occurred: ", e5.getMessage()), e5);
                    }
                }
                this.f37535x.f37464z.m36570j(null);
                this.f37535x.f37421A.m36570j(null);
                if (!this.f37535x.f37461w.isEmpty()) {
                    C2345k c2345kM31043s2 = this.f37535x.m31043s();
                    C11602h1 c11602h3 = this.f37535x;
                    InterfaceC2339e interfaceC2339e3 = c2345kM31043s2.f9275c;
                    EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, c2345kM31043s2.f9273a)) {
                        c2345kM31043s2.f9274b.log(enumC2341g3, c2345kM31043s2.f9273a, AbstractC2875y.m8296i(c11602h3.f37461w.size(), "[cleanup] #orphaned-track; Clearing ", " orphaned tracks that were never reconciled"), null);
                    }
                    this.f37535x.f37461w.clear();
                }
                C11602h1 c11602h4 = this.f37535x;
                AbstractC3006f0.m8732z(c11602h4.f37448j, null, null, new C11614m(c11602h4, interfaceC30057d, 4), 3);
                AbstractC3006f0.m8714h(this.f37535x.f37428H, null);
                this.f37535x.f37447i.cancel((CancellationException) null);
                return C23454a0.f92919a;
            case 2:
                C11602h1 c11602h5 = this.f37535x;
                C2345k c2345kM31043s3 = c11602h5.m31043s();
                C33368c0 c33368c0 = c11602h5.f37440b;
                InterfaceC2339e interfaceC2339e4 = c2345kM31043s3.f9275c;
                EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
                String str = c2345kM31043s3.f9273a;
                if (interfaceC2339e4.isLoggable(enumC2341g4, str)) {
                    c2345kM31043s3.f9274b.log(enumC2341g4, str, AbstractC25012a.m73375h(c33368c0.f139302p.f139652h.getValue(), "[createPublisher] rejoin attempt, connection state: "), null);
                }
                if (!(c33368c0.f139302p.f139652h.getValue() instanceof C33432o2)) {
                    AbstractC3006f0.m8732z(c33368c0.f139300n, null, null, new C11614m(c11602h5, interfaceC30057d, 6), 3);
                }
                return C23454a0.f92919a;
            default:
                return (C40053b) this.f37535x.f37446h.f139232E.f168480h.getValue();
        }
    }
}
