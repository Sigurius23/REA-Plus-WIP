package w20;

import a20.C0168h;
import android.content.Intent;
import android.os.Bundle;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionActivity;
import l83.C23454a0;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C36717g implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157199w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CvcRecollectionActivity f157200x;

    public /* synthetic */ C36717g(CvcRecollectionActivity cvcRecollectionActivity, int i13) {
        this.f157199w = i13;
        this.f157200x = cvcRecollectionActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f157199w;
        CvcRecollectionActivity cvcRecollectionActivity = this.f157200x;
        switch (i13) {
            case 0:
                int i14 = CvcRecollectionActivity.f22390y;
                Intent intent = cvcRecollectionActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                Bundle extras = intent.getExtras();
                C36721k c36721k = extras != null ? (C36721k) AbstractC12350b.m34600u(extras, C36721k.class, "extra_activity_args") : null;
                if (c36721k != null) {
                    return c36721k;
                }
                throw new IllegalStateException("Cannot start CVC Recollection flow without args");
            case 1:
                int i15 = CvcRecollectionActivity.f22390y;
                return new C0168h((C36721k) cvcRecollectionActivity.f22391w.getValue());
            default:
                ((C36734x) cvcRecollectionActivity.f22392x.getValue()).m117841g(C36730t.f157230a);
                return C23454a0.f92919a;
        }
    }
}
