package w20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: w20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C36719i extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157203w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CvcRecollectionActivity f157204x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36719i(CvcRecollectionActivity cvcRecollectionActivity, int i13) {
        super(0);
        this.f157203w = i13;
        this.f157204x = cvcRecollectionActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f157203w) {
            case 0:
                return this.f157204x.getViewModelStore();
            default:
                return this.f157204x.getDefaultViewModelCreationExtras();
        }
    }
}
