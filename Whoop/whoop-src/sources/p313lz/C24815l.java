package p313lz;

import c93.InterfaceC4339a;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: lz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C24815l extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97145w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FinancialConnectionsSheetLiteActivity f97146x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24815l(FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity, int i13) {
        super(0);
        this.f97145w = i13;
        this.f97146x = financialConnectionsSheetLiteActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f97145w) {
            case 0:
                return this.f97146x.getViewModelStore();
            default:
                return this.f97146x.getDefaultViewModelCreationExtras();
        }
    }
}
