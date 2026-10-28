package ch3;

import io.sentry.CallableC20367i0;
import p098dt.AbstractC12350b;
import u92.C34661e;
import xg3.AbstractC38291r;
import xg3.C38280g;
import xg3.InterfaceC38288o;

/* JADX INFO: renamed from: ch3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C4707s implements InterfaceC38288o {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19268w;

    /* JADX INFO: renamed from: x */
    public final Object f19269x;

    public /* synthetic */ C4707s(Object obj, int i13) {
        this.f19268w = i13;
        this.f19269x = obj;
    }

    /* JADX INFO: renamed from: a */
    public static C4707s m14773a(C38280g c38280g) {
        return new C4707s(c38280g, 0);
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f19268w) {
            case 0:
                AbstractC38291r abstractC38291r = (AbstractC38291r) obj;
                C4705r c4705r = new C4705r(abstractC38291r);
                abstractC38291r.m122687c(c4705r);
                ((C38280g) this.f19269x).m122671W(c4705r);
                break;
            case 1:
                AbstractC38291r abstractC38291r2 = (AbstractC38291r) obj;
                try {
                    abstractC38291r2.mo14743e(((C34661e) ((CallableC20367i0) this.f19269x).f76397x).m109546c());
                } catch (Throwable th3) {
                    AbstractC12350b.m34573V(th3);
                    abstractC38291r2.mo14742d(th3);
                    return;
                }
                break;
            default:
                AbstractC38291r abstractC38291r3 = (AbstractC38291r) obj;
                C4720y0 c4720y0 = new C4720y0(abstractC38291r3);
                abstractC38291r3.m122687c(c4720y0);
                ((C4697n) this.f19269x).mo9472b(c4720y0);
                break;
        }
    }
}
