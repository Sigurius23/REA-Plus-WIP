package p161g;

import android.app.AlertDialog;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.whoop.android.R;
import io.getstream.chat.android.p226ui.utils.DialogInterfaceOnClickListenerC19904c;
import p313lz.DialogInterfaceOnClickListenerC24814k;
import p715kotlin.jvm.functions.Function1;
import q30.C29897c;

/* JADX INFO: renamed from: g.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14895a0 extends AbstractC14917t {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f55566d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f55567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14895a0(Object obj, int i13) {
        super(true);
        this.f55566d = i13;
        this.f55567e = obj;
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: d */
    public final void mo4073d() {
        switch (this.f55566d) {
            case 0:
                ((Function1) this.f55567e).invoke(this);
                break;
            case 1:
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) this.f55567e;
                new AlertDialog.Builder(financialConnectionsSheetLiteActivity).setTitle(R.string.stripe_fc_lite_exit_title).setMessage(R.string.stripe_fc_lite_exit_message).setCancelable(true).setPositiveButton(R.string.stripe_fc_lite_exit_confirm, new DialogInterfaceOnClickListenerC24814k(financialConnectionsSheetLiteActivity, 0)).setNegativeButton(R.string.stripe_fc_lite_exit_cancel, new DialogInterfaceOnClickListenerC19904c(2)).create().show();
                break;
            default:
                ((ChallengeActivity) this.f55567e).m16877r().m105885g(C29897c.f122151w);
                break;
        }
    }
}
