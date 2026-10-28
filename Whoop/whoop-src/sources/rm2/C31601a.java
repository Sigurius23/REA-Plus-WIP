package rm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p114eb.C12991u0;

/* JADX INFO: renamed from: rm2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31601a implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130609w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f130610x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12991u0 f130611y;

    public /* synthetic */ C31601a(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a) {
        this.f130609w = 1;
        this.f130610x = interfaceC4339a;
        this.f130611y = c12991u0;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f130609w) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                InterfaceC4339a interfaceC4339a = this.f130610x;
                return AbstractC31605e.m97614o0(this.f130611y, interfaceC4339a, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj4).intValue();
                return AbstractC31605e.m97580V(this.f130610x, this.f130611y, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj4).intValue();
                InterfaceC4339a interfaceC4339a2 = this.f130610x;
                return AbstractC31605e.m97561F0(this.f130611y, interfaceC4339a2, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj4).intValue();
                InterfaceC4339a interfaceC4339a3 = this.f130610x;
                return AbstractC31605e.m97600h0(this.f130611y, interfaceC4339a3, (InterfaceC3764o) obj, (C12982q) obj2, (Composer) obj3, iIntValue4);
        }
    }

    public /* synthetic */ C31601a(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a, int i13) {
        this.f130609w = i13;
        this.f130611y = c12991u0;
        this.f130610x = interfaceC4339a;
    }
}
