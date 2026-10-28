package b30;

import androidx.compose.material.AbstractC1118c;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g40.AbstractC15448y0;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: b30.a3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2478a3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f9651E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9652w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f9653x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9654y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f9655z;

    public /* synthetic */ C2478a3(int i13, String str, boolean z4, long j7) {
        this.f9654y = str;
        this.f9653x = j7;
        this.f9655z = z4;
        this.f9651E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9652w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC2526g3.m7462a(this.f9651E, this.f9655z, this.f9653x, (InterfaceC4339a) this.f9654y, (Composer) obj, iM87244L);
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC1118c.m3459b(this.f9653x, (InterfaceC4339a) this.f9654y, this.f9655z, (Composer) obj, AbstractC28683x.m87244L(this.f9651E | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC15448y0.m43613d((String) this.f9654y, this.f9653x, this.f9655z, (Composer) obj, AbstractC28683x.m87244L(this.f9651E | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2478a3(int i13, boolean z4, long j7, InterfaceC4339a interfaceC4339a, int i14) {
        this.f9651E = i13;
        this.f9655z = z4;
        this.f9653x = j7;
        this.f9654y = interfaceC4339a;
    }

    public /* synthetic */ C2478a3(long j7, InterfaceC4339a interfaceC4339a, boolean z4, int i13) {
        this.f9653x = j7;
        this.f9654y = interfaceC4339a;
        this.f9655z = z4;
        this.f9651E = i13;
    }
}
