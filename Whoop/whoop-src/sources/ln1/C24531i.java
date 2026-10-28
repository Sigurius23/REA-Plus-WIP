package ln1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import in1.InterfaceC18724d;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ln1.i */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24531i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95701w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC18724d f95702x;

    public /* synthetic */ C24531i(InterfaceC18724d interfaceC18724d, int i13) {
        this.f95701w = i13;
        this.f95702x = interfaceC18724d;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f95701w) {
            case 0:
                return AbstractC24533k.m71466t((InterfaceC18724d.c) this.f95702x, (InterfaceC1103a) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC24539q.m71504O(this.f95702x, (InterfaceC1103a) obj, (Composer) obj2, iIntValue);
        }
    }
}
