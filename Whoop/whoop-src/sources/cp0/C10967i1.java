package cp0;

import androidx.compose.runtime.Composer;
import iw0.AbstractC20992x;
import nw0.AbstractC27200g;
import p291l0.InterfaceC22997s1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39133t0;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import w01.AbstractC36682g;
import y01.C39020c;

/* JADX INFO: renamed from: cp0.i1 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C10967i1 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34070w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f34071x;

    public /* synthetic */ C10967i1(boolean z4, int i13) {
        this.f34070w = i13;
        this.f34071x = z4;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f34070w) {
            case 0:
                return AbstractC10979m1.m29260l(this.f34071x, (InterfaceC39133t0) obj, (InterfaceC39124q0) obj2, (C39169a) obj3);
            case 1:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC20992x.m58348E1(this.f34071x, (C39020c) obj, (Composer) obj2, iIntValue);
            case 2:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC27200g.m81785J(this.f34071x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC27200g.m81787L(this.f34071x, (InterfaceC22997s1) obj, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC36682g.m117751w(this.f34071x, (InterfaceC25312u) obj, (Composer) obj2, iIntValue4);
        }
    }
}
