package cz;

import c93.InterfaceC4339a;
import com.stripe.android.customersheet.CustomerSheetActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: cz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C11198f extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35918w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CustomerSheetActivity f35919x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11198f(CustomerSheetActivity customerSheetActivity, int i13) {
        super(0);
        this.f35918w = i13;
        this.f35919x = customerSheetActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35918w) {
            case 0:
                return this.f35919x.getViewModelStore();
            default:
                return this.f35919x.getDefaultViewModelCreationExtras();
        }
    }
}
