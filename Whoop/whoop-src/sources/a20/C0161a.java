package a20;

import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.payments.bankaccount.p054ui.CollectBankAccountActivity;
import p715kotlin.jvm.internal.AbstractC22676k;
import z10.AbstractC39982e;

/* JADX INFO: renamed from: a20.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0161a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f484w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CollectBankAccountActivity f485x;

    public /* synthetic */ C0161a(CollectBankAccountActivity collectBankAccountActivity, int i13) {
        this.f484w = i13;
        this.f485x = collectBankAccountActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f484w;
        CollectBankAccountActivity collectBankAccountActivity = this.f485x;
        switch (i13) {
            case 0:
                int i14 = CollectBankAccountActivity.f22352z;
                Intent intent = collectBankAccountActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (AbstractC39982e) intent.getParcelableExtra("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_args");
            case 1:
                int i15 = CollectBankAccountActivity.f22352z;
                return new C0168h(new C0161a(collectBankAccountActivity, 2), 0);
            default:
                int i16 = CollectBankAccountActivity.f22352z;
                AbstractC39982e abstractC39982e = (AbstractC39982e) collectBankAccountActivity.f22353w.getValue();
                if (abstractC39982e != null) {
                    return abstractC39982e;
                }
                throw new IllegalArgumentException("Required value was null.");
        }
    }
}
