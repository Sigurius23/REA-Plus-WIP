package p112e9;

import android.net.Uri;
import bb.C2919f;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import p171g9.C15587d;
import p299l9.C23527t;
import p398p9.C28987k;
import p398p9.C28990n;
import p398p9.InterfaceC28983g;
import p398p9.InterfaceC28985i;
import p418q9.AbstractC30067b;

/* JADX INFO: renamed from: e9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C12868g implements InterfaceC28983g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44249w;

    /* JADX INFO: renamed from: x */
    public final Object f44250x;

    public /* synthetic */ C12868g(Object obj, int i13) {
        this.f44249w = i13;
        this.f44250x = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m36142a(InterfaceC28985i interfaceC28985i, long j7, long j13, boolean z4) {
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: p */
    public final void mo36137p(InterfaceC28985i interfaceC28985i, long j7, long j13) {
        boolean z4;
        switch (this.f44249w) {
            case 0:
                C28990n c28990n = (C28990n) interfaceC28985i;
                C12869h c12869h = (C12869h) this.f44250x;
                long j14 = c28990n.f117262w;
                Uri uri = c28990n.f117265z.f173387y;
                C23527t c23527t = new C23527t();
                c12869h.f44272m.getClass();
                c12869h.f44276q.m43886d(c23527t, c28990n.f117264y, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                c12869h.f44262L = ((Long) c28990n.f117261F).longValue() - j7;
                c12869h.m36154w(true);
                return;
            default:
                C12865d c12865d = (C12865d) this.f44250x;
                synchronized (AbstractC30067b.f122682b) {
                    z4 = AbstractC30067b.f122683c;
                    break;
                }
                if (z4) {
                    c12865d.m36135a();
                    return;
                } else {
                    c12865d.f44237w.m36153v(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: q */
    public final void mo36138q(InterfaceC28985i interfaceC28985i, long j7, long j13, boolean z4) {
        switch (this.f44249w) {
            case 0:
                ((C12869h) this.f44250x).m36152u((C28990n) interfaceC28985i);
                break;
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: r */
    public final C2919f mo36139r(InterfaceC28985i interfaceC28985i, IOException iOException, int i13) {
        switch (this.f44249w) {
            case 0:
                C28990n c28990n = (C28990n) interfaceC28985i;
                C12869h c12869h = (C12869h) this.f44250x;
                C15587d c15587d = c12869h.f44276q;
                long j7 = c28990n.f117262w;
                Uri uri = c28990n.f117265z.f173387y;
                c15587d.m43887e(new C23527t(), c28990n.f117264y, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                c12869h.f44272m.getClass();
                c12869h.m36153v(iOException);
                break;
            default:
                ((C12865d) this.f44250x).f44237w.m36153v(iOException);
                break;
        }
        return C28987k.f117256z;
    }
}
