package u10;

import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: u10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C34420h extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144654w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ManageActivity f144655x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34420h(ManageActivity manageActivity, int i13) {
        super(0);
        this.f144654w = i13;
        this.f144655x = manageActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f144654w) {
            case 0:
                return this.f144655x.getViewModelStore();
            default:
                return this.f144655x.getDefaultViewModelCreationExtras();
        }
    }
}
