package h30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.stripe.android.shoppay.ShopPayActivity;
import l83.C23454a0;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: h30.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16797b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64554w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ShopPayActivity f64555x;

    public /* synthetic */ C16797b(ShopPayActivity shopPayActivity, int i13, int i14) {
        this.f64554w = i14;
        this.f64555x = shopPayActivity;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f64554w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        ShopPayActivity shopPayActivity = this.f64555x;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        int i14 = ShopPayActivity.f22413E;
        switch (i13) {
            case 0:
                shopPayActivity.m16871m(composer, AbstractC28683x.m87244L(1));
                break;
            default:
                shopPayActivity.m16873o(composer, AbstractC28683x.m87244L(1));
                break;
        }
        return c23454a0;
    }
}
