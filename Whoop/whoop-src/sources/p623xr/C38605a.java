package p623xr;

import androidx.room.ServiceConnectionC1767b0;

/* JADX INFO: renamed from: xr.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38605a extends AbstractRunnableC38625u {

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f166091x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f166092y;

    public /* synthetic */ C38605a(Object obj, int i13) {
        this.f166091x = i13;
        this.f166092y = obj;
    }

    @Override // p623xr.AbstractRunnableC38625u
    /* JADX INFO: renamed from: b */
    public final void mo103289b() {
        switch (this.f166091x) {
            case 0:
                C38606b c38606b = (C38606b) ((ServiceConnectionC1767b0) this.f166092y).f6963x;
                c38606b.f166095b.m123818b("unlinkToDeath", new Object[0]);
                ((C38620p) c38606b.f166107n).f166131f.unlinkToDeath(c38606b.f166104k, 0);
                c38606b.f166107n = null;
                c38606b.f166100g = false;
                return;
            default:
                synchronized (((C38606b) this.f166092y).f166099f) {
                    try {
                        if (((C38606b) this.f166092y).f166105l.get() > 0 && ((C38606b) this.f166092y).f166105l.decrementAndGet() > 0) {
                            ((C38606b) this.f166092y).f166095b.m123818b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C38606b c38606b2 = (C38606b) this.f166092y;
                        if (c38606b2.f166107n != null) {
                            c38606b2.f166095b.m123818b("Unbind from service.", new Object[0]);
                            C38606b c38606b3 = (C38606b) this.f166092y;
                            c38606b3.f166094a.unbindService(c38606b3.f166106m);
                            C38606b c38606b4 = (C38606b) this.f166092y;
                            c38606b4.f166100g = false;
                            c38606b4.f166107n = null;
                            c38606b4.f166106m = null;
                        }
                        ((C38606b) this.f166092y).m123805d();
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
