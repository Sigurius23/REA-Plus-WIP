package o42;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import n42.C26278b;
import p291l0.InterfaceC23013y;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: o42.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C27525e implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110818w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26278b f110819x;

    public /* synthetic */ C27525e(C26278b c26278b, int i13) {
        this.f110818w = i13;
        this.f110819x = c26278b;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f110818w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC27531k.m82978L(this.f110819x, (InterfaceC23013y) obj, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC27531k.m82983Q(this.f110819x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue2);
        }
    }
}
