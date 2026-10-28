package t10;

import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.form.FormActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C33289i extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138833w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FormActivity f138834x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33289i(FormActivity formActivity, int i13) {
        super(0);
        this.f138833w = i13;
        this.f138834x = formActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138833w) {
            case 0:
                return this.f138834x.getViewModelStore();
            default:
                return this.f138834x.getDefaultViewModelCreationExtras();
        }
    }
}
