package i20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: i20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C17943g extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69723w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AddressElementActivity f69724x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17943g(AddressElementActivity addressElementActivity, int i13) {
        super(0);
        this.f69723w = i13;
        this.f69724x = addressElementActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f69723w) {
            case 0:
                return this.f69724x.getViewModelStore();
            default:
                return this.f69724x.getDefaultViewModelCreationExtras();
        }
    }
}
