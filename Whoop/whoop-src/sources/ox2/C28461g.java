package ox2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p715kotlin.jvm.functions.Function1;
import px2.InterfaceC29603f;

/* JADX INFO: renamed from: ox2.g */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28461g implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114740w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC29603f.a f114741x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f114742y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f114743z;

    public /* synthetic */ C28461g(InterfaceC29603f.a aVar, Function1 function1, int i13, int i14) {
        this.f114740w = i14;
        this.f114741x = aVar;
        this.f114742y = function1;
        this.f114743z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f114740w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC28462h.m86343a0(this.f114741x, this.f114742y, this.f114743z, composer, iIntValue);
            case 1:
                return AbstractC28462h.m86338W(this.f114741x, this.f114742y, this.f114743z, composer, iIntValue);
            default:
                return AbstractC28462h.m86368z(this.f114741x, this.f114742y, this.f114743z, composer, iIntValue);
        }
    }
}
