package t10;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p477s2.AbstractC32072d;

/* JADX INFO: renamed from: t10.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C33291k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138842w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f138843x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f138844y;

    public /* synthetic */ C33291k(boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f138842w = i14;
        this.f138843x = z4;
        this.f138844y = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f138842w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC33295o.m105605c(this.f138843x, this.f138844y, composer, AbstractC28683x.m87244L(1));
                break;
            case 1:
                AbstractC32072d.m99692a(this.f138843x, this.f138844y, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC32072d.m99697f(this.f138843x, this.f138844y, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
