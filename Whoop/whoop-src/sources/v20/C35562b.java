package v20;

import a20.C0168h;
import android.content.Intent;
import android.os.Bundle;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v20.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C35562b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151289w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BacsMandateConfirmationActivity f151290x;

    public /* synthetic */ C35562b(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, int i13) {
        this.f151289w = i13;
        this.f151290x = bacsMandateConfirmationActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f151289w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C35572l c35572l = C35572l.f151305a;
        BacsMandateConfirmationActivity bacsMandateConfirmationActivity = this.f151290x;
        switch (i13) {
            case 0:
                int i14 = BacsMandateConfirmationActivity.f22387y;
                Intent intent = bacsMandateConfirmationActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                Bundle extras = intent.getExtras();
                C35566f c35566f = extras != null ? (C35566f) AbstractC12350b.m34600u(extras, C35566f.class, "extra_activity_args") : null;
                if (c35566f != null) {
                    return c35566f;
                }
                throw new IllegalStateException("Cannot start Bacs mandate confirmation flow without arguments");
            case 1:
                int i15 = BacsMandateConfirmationActivity.f22387y;
                return new C0168h((C35566f) bacsMandateConfirmationActivity.f22388w.getValue());
            case 2:
                int i16 = BacsMandateConfirmationActivity.f22387y;
                bacsMandateConfirmationActivity.m16865o().m112770g(c35572l);
                return c23454a0;
            default:
                int i17 = BacsMandateConfirmationActivity.f22387y;
                bacsMandateConfirmationActivity.m16865o().m112770g(c35572l);
                return c23454a0;
        }
    }
}
