package a20;

import c93.InterfaceC4339a;
import com.stripe.android.payments.bankaccount.p054ui.CollectBankAccountActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C0163c extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CollectBankAccountActivity f490x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0163c(CollectBankAccountActivity collectBankAccountActivity, int i13) {
        super(0);
        this.f489w = i13;
        this.f490x = collectBankAccountActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f489w) {
            case 0:
                return this.f490x.getViewModelStore();
            default:
                return this.f490x.getDefaultViewModelCreationExtras();
        }
    }
}
