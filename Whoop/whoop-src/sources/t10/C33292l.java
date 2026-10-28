package t10;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: t10.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33292l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138845w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33290j f138846x;

    public /* synthetic */ C33292l(C33290j c33290j, int i13, int i14) {
        this.f138845w = i14;
        this.f138846x = c33290j;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f138845w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC33295o.m105603a(this.f138846x, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC33295o.m105607e(this.f138846x, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
