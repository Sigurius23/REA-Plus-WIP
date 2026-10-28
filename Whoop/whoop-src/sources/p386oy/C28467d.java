package p386oy;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import p00.AbstractC28571h;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: oy.d */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C28467d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114772w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f114773x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f114774y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f114775z;

    public /* synthetic */ C28467d(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f114772w = i14;
        this.f114773x = z4;
        this.f114774y = z13;
        this.f114775z = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f114772w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC20301a.m56334d(this.f114773x, this.f114774y, this.f114775z, composer, AbstractC28683x.m87244L(7));
                break;
            default:
                AbstractC28571h.m86901d(this.f114773x, this.f114774y, this.f114775z, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
