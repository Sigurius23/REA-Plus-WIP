package d20;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import c93.InterfaceC4339a;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity;
import com.whoop.android.R;
import p235iz.C21037a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d20.j */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11494j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36957w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Stripe3ds2TransactionActivity f36958x;

    public /* synthetic */ C11494j(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, int i13) {
        this.f36957w = i13;
        this.f36958x = stripe3ds2TransactionActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f36957w;
        Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = this.f36958x;
        switch (i13) {
            case 0:
                return stripe3ds2TransactionActivity.f22359y;
            case 1:
                int i14 = Stripe3ds2TransactionActivity.f22356z;
                View viewInflate = stripe3ds2TransactionActivity.getLayoutInflater().inflate(R.layout.stripe_3ds2_transaction_layout, (ViewGroup) null, false);
                if (viewInflate != null) {
                    return new C21037a((FragmentContainerView) viewInflate);
                }
                throw new NullPointerException("rootView");
            default:
                int i15 = Stripe3ds2TransactionActivity.f22356z;
                C11496l c11496l = stripe3ds2TransactionActivity.f22358x;
                if (c11496l != null) {
                    return c11496l;
                }
                AbstractC22676k.m65757q("args");
                throw null;
        }
    }
}
