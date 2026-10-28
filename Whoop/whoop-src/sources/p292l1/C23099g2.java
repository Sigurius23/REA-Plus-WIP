package p292l1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33090m;

/* JADX INFO: renamed from: l1.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23099g2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC23459e f91209E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91210w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f91211x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f91212y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f91213z;

    public /* synthetic */ C23099g2(long j7, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, int i13) {
        this.f91213z = j7;
        this.f91209E = interfaceC4339a;
        this.f91211x = z4;
        this.f91212y = z13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91210w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC23141n2.m67122d(this.f91213z, (InterfaceC4339a) this.f91209E, this.f91211x, this.f91212y, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33090m.m104838f(this.f91211x, (Function1) this.f91209E, this.f91212y, this.f91213z, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C23099g2(boolean z4, Function1 function1, boolean z13, long j7) {
        this.f91211x = z4;
        this.f91209E = function1;
        this.f91212y = z13;
        this.f91213z = j7;
    }
}
