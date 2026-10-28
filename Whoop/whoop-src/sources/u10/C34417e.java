package u10;

import a20.C0168h;
import android.content.Intent;
import android.os.Bundle;
import c93.InterfaceC4339a;
import com.stripe.android.paymentelement.embedded.manage.ManageActivity;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u10.e */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C34417e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144647w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ManageActivity f144648x;

    public /* synthetic */ C34417e(ManageActivity manageActivity, int i13) {
        this.f144647w = i13;
        this.f144648x = manageActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f144647w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        ManageActivity manageActivity = this.f144648x;
        switch (i13) {
            case 0:
                int i14 = ManageActivity.f22343G;
                Intent intent = manageActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return (C34421i) AbstractC12350b.m34600u(extras, C34421i.class, "extra_activity_args");
                }
                return null;
            case 1:
                int i15 = ManageActivity.f22343G;
                return new C0168h(new C34417e(manageActivity, 2), 10);
            case 2:
                int i16 = ManageActivity.f22343G;
                C34421i c34421i = (C34421i) manageActivity.f22346w.getValue();
                if (c34421i != null) {
                    return c34421i;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 3:
                manageActivity.m16854r().m108796a(C34423k.f144661b);
                return c23454a0;
            default:
                ManageActivity.m16852p(manageActivity, false);
                manageActivity.finish();
                return c23454a0;
        }
    }
}
