package ce3;

import c93.InterfaceC4339a;
import io.getstream.chat.android.client.api.internal.DistinctChatApi;
import is0.AbstractC20916x;
import is0.C20888j;
import java.io.IOException;
import l83.C23454a0;
import ne3.C26616h;
import p390p1.InterfaceC28593a1;
import uc3.C34775m;

/* JADX INFO: renamed from: ce3.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4510k implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f18168E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18169w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f18170x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f18171y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f18172z;

    public /* synthetic */ C4510k(int i13, int i14, C20888j c20888j, InterfaceC28593a1 interfaceC28593a1) {
        this.f18169w = 2;
        this.f18170x = i13;
        this.f18171y = i14;
        this.f18172z = c20888j;
        this.f18168E = interfaceC28593a1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f18169w) {
            case 0:
                C4516q c4516q = (C4516q) this.f18172z;
                int i13 = this.f18170x;
                C26616h c26616h = (C26616h) this.f18168E;
                int i14 = this.f18171y;
                try {
                    c4516q.f18190K.getClass();
                    c26616h.skip(i14);
                    c4516q.f18203X.m14166x(i13, EnumC4496a.CANCEL);
                    synchronized (c4516q) {
                        c4516q.f18205Z.remove(Integer.valueOf(i13));
                    }
                } catch (IOException unused) {
                }
                return C23454a0.f92919a;
            case 1:
                return DistinctChatApi.m54541a((DistinctChatApi) this.f18172z, (String) this.f18168E, this.f18170x, this.f18171y);
            case 2:
                return AbstractC20916x.m57967z(this.f18170x, this.f18171y, (C20888j) this.f18172z, (InterfaceC28593a1) this.f18168E);
            default:
                C34775m c34775m = (C34775m) this.f18172z;
                String str = (String) this.f18168E;
                int i15 = this.f18170x;
                return "Expected " + c34775m.f146444a + " but got " + str.subSequence(i15, this.f18171y + i15 + 1).toString();
        }
    }

    public /* synthetic */ C4510k(C4516q c4516q, int i13, C26616h c26616h, int i14, boolean z4) {
        this.f18169w = 0;
        this.f18172z = c4516q;
        this.f18170x = i13;
        this.f18168E = c26616h;
        this.f18171y = i14;
    }

    public /* synthetic */ C4510k(String str, int i13, int i14, int i15, Object obj) {
        this.f18169w = i15;
        this.f18172z = obj;
        this.f18168E = str;
        this.f18170x = i13;
        this.f18171y = i14;
    }
}
