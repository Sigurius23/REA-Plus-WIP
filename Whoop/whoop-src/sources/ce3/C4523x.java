package ce3;

import java.net.SocketTimeoutException;
import ne3.C26608d;
import p003a1.C0111j;
import p319m4.AbstractC25012a;
import yd3.C39472c;

/* JADX INFO: renamed from: ce3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C4523x extends C26608d {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C4524y f18238n;

    public C4523x(C4524y c4524y) {
        this.f18238n = c4524y;
    }

    @Override // ne3.C26608d
    /* JADX INFO: renamed from: k */
    public final void mo14147k() {
        this.f18238n.m14154f(EnumC4496a.CANCEL);
        C4516q c4516q = this.f18238n.f18249x;
        synchronized (c4516q) {
            long j7 = c4516q.f18194O;
            long j13 = c4516q.f18193N;
            if (j7 < j13) {
                return;
            }
            c4516q.f18193N = j13 + 1;
            c4516q.f18195P = System.nanoTime() + ((long) 1000000000);
            C39472c.m126116c(c4516q.f18187H, AbstractC25012a.m73376i(c4516q.f18208y, " ping", new StringBuilder()), 0L, new C0111j(c4516q, 16), 6);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14148l() {
        if (m79171j()) {
            throw new SocketTimeoutException("timeout");
        }
    }
}
