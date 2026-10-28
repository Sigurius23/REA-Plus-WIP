package ec3;

import bc3.C3033m;
import fc3.AbstractC14370a;
import fc3.AbstractC14372c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ec3.x1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13099x1 extends AbstractC14372c {

    /* JADX INFO: renamed from: a */
    public long f45265a;

    /* JADX INFO: renamed from: b */
    public C3033m f45266b;

    @Override // fc3.AbstractC14372c
    /* JADX INFO: renamed from: a */
    public final boolean mo36572a(AbstractC14370a abstractC14370a) {
        C13096w1 c13096w1 = (C13096w1) abstractC14370a;
        if (this.f45265a >= 0) {
            return false;
        }
        long j7 = c13096w1.f45254I;
        if (j7 < c13096w1.f45255J) {
            c13096w1.f45255J = j7;
        }
        this.f45265a = j7;
        return true;
    }

    @Override // fc3.AbstractC14372c
    /* JADX INFO: renamed from: b */
    public final InterfaceC30057d[] mo36573b(AbstractC14370a abstractC14370a) {
        long j7 = this.f45265a;
        this.f45265a = -1L;
        this.f45266b = null;
        return ((C13096w1) abstractC14370a).m36629u(j7);
    }
}
