package u31;

import c93.InterfaceC4339a;
import java.util.List;
import p409q0.AbstractC29701y;

/* JADX INFO: renamed from: u31.f */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34505f implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f145057w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f145058x;

    public /* synthetic */ C34505f(Object obj, int i13) {
        this.f145057w = i13;
        this.f145058x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int iM109062h;
        switch (this.f145057w) {
            case 0:
                iM109062h = AbstractC34504e.b.m109062h((AbstractC29701y) this.f145058x);
                break;
            default:
                iM109062h = AbstractC34504e.m109049n((List) this.f145058x);
                break;
        }
        return Integer.valueOf(iM109062h);
    }
}
