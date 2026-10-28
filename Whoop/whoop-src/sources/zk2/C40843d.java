package zk2;

import c93.InterfaceC4339a;
import java.util.List;
import p409q0.AbstractC29701y;

/* JADX INFO: renamed from: zk2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40843d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f176060w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f176061x;

    public /* synthetic */ C40843d(Object obj, int i13) {
        this.f176060w = i13;
        this.f176061x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM132368h;
        switch (this.f176060w) {
            case 0:
                iM132368h = AbstractC40844e.a.m132368h((AbstractC29701y) this.f176061x);
                break;
            default:
                iM132368h = AbstractC40844e.m132363h((List) this.f176061x);
                break;
        }
        return Integer.valueOf(iM132368h);
    }
}
