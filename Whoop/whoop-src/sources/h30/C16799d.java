package h30;

import c93.InterfaceC4339a;
import com.stripe.android.shoppay.ShopPayActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16799d extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64558w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ShopPayActivity f64559x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16799d(ShopPayActivity shopPayActivity, int i13) {
        super(0);
        this.f64558w = i13;
        this.f64559x = shopPayActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f64558w) {
            case 0:
                return this.f64559x.getViewModelStore();
            default:
                return this.f64559x.getDefaultViewModelCreationExtras();
        }
    }
}
