package qx0;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: qx0.e */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30749e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f126582w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30753i f126583x;

    public /* synthetic */ C30749e(C30753i c30753i, int i13) {
        this.f126582w = i13;
        this.f126583x = c30753i;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f126582w;
        InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i13) {
            case 0:
                return AbstractC30751g.m94461p(this.f126583x, interfaceC1103a, composer, iIntValue);
            default:
                return AbstractC30751g.m94465t(this.f126583x, interfaceC1103a, composer, iIntValue);
        }
    }
}
