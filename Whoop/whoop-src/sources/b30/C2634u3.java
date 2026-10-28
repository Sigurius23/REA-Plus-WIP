package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n03.C26099j;
import p097ds.AbstractC12314q;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: b30.u3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2634u3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10278w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f10279x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Integer f10280y;

    public /* synthetic */ C2634u3(String str, int i13, Integer num) {
        this.f10279x = str;
        this.f10280y = num;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f10278w) {
            case 0:
                num.getClass();
                AbstractC12314q.m34324d(this.f10279x, this.f10280y, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            default:
                return C26099j.m77657w(this.f10279x, this.f10280y, composer, num.intValue());
        }
    }

    public /* synthetic */ C2634u3(String str, Integer num) {
        this.f10279x = str;
        this.f10280y = num;
    }
}
