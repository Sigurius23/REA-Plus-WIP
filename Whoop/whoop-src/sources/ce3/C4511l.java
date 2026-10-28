package ce3;

import c93.InterfaceC4339a;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;

/* JADX INFO: renamed from: ce3.l */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4511l implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18173w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4516q f18174x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f18175y;

    public /* synthetic */ C4511l(C4516q c4516q, int i13, Object obj, int i14) {
        this.f18173w = i14;
        this.f18174x = c4516q;
        this.f18175y = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18173w) {
            case 0:
                C4516q c4516q = this.f18174x;
                int i13 = this.f18175y;
                c4516q.f18190K.getClass();
                try {
                    c4516q.f18203X.m14166x(i13, EnumC4496a.CANCEL);
                    synchronized (c4516q) {
                        c4516q.f18205Z.remove(Integer.valueOf(i13));
                    }
                } catch (IOException unused) {
                }
                return C23454a0.f92919a;
            case 1:
                C4516q c4516q2 = this.f18174x;
                int i14 = this.f18175y;
                c4516q2.f18190K.getClass();
                synchronized (c4516q2) {
                    c4516q2.f18205Z.remove(Integer.valueOf(i14));
                }
                return C23454a0.f92919a;
            default:
                C4516q c4516q3 = this.f18174x;
                int i15 = this.f18175y;
                c4516q3.f18190K.getClass();
                try {
                    c4516q3.f18203X.m14166x(i15, EnumC4496a.CANCEL);
                    synchronized (c4516q3) {
                        c4516q3.f18205Z.remove(Integer.valueOf(i15));
                    }
                } catch (IOException unused2) {
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C4511l(C4516q c4516q, int i13, List list, boolean z4) {
        this.f18173w = 2;
        this.f18174x = c4516q;
        this.f18175y = i13;
    }
}
