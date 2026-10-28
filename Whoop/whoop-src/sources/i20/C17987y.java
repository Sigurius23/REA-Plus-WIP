package i20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: i20.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C17987y extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69827w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AutocompleteActivity f69828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17987y(AutocompleteActivity autocompleteActivity, int i13) {
        super(0);
        this.f69827w = i13;
        this.f69828x = autocompleteActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f69827w) {
            case 0:
                return this.f69828x.getViewModelStore();
            default:
                return this.f69828x.getDefaultViewModelCreationExtras();
        }
    }
}
