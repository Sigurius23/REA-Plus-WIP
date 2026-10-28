package h30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.stripe.android.shoppay.ShopPayActivity;
import l83.C23454a0;
import p390p1.C28655q;

/* JADX INFO: renamed from: h30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16798c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64556w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ShopPayActivity f64557x;

    public /* synthetic */ C16798c(ShopPayActivity shopPayActivity, int i13) {
        this.f64556w = i13;
        this.f64557x = shopPayActivity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f64556w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        ShopPayActivity shopPayActivity = this.f64557x;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    int i14 = ShopPayActivity.f22413E;
                    shopPayActivity.m16873o(composer, 0);
                } else {
                    C28655q c28655q = (C28655q) composer;
                    if (!c28655q.m87121F()) {
                        int i15 = ShopPayActivity.f22413E;
                        shopPayActivity.m16873o(composer, 0);
                    } else {
                        c28655q.m87138X();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    int i16 = ShopPayActivity.f22413E;
                    shopPayActivity.m16871m(composer2, 0);
                } else {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87121F()) {
                        int i17 = ShopPayActivity.f22413E;
                        shopPayActivity.m16871m(composer2, 0);
                    } else {
                        c28655q2.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }
}
