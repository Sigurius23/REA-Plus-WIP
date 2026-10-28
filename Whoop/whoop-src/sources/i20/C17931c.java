package i20;

import android.app.Application;
import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivity;
import l83.C23454a0;
import p114eb.C12991u0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17931c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69690w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AddressElementActivity f69691x;

    public /* synthetic */ C17931c(AddressElementActivity addressElementActivity, int i13) {
        this.f69690w = i13;
        this.f69691x = addressElementActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f69690w;
        AddressElementActivity addressElementActivity = this.f69691x;
        switch (i13) {
            case 0:
                int i14 = AddressElementActivity.f22374z;
                Application application = addressElementActivity.getApplication();
                AbstractC22676k.m65749i(application, "getApplication(...)");
                return application;
            case 1:
                int i15 = AddressElementActivity.f22374z;
                C17946h c17946h = (C17946h) addressElementActivity.f22377y.getValue();
                if (c17946h != null) {
                    return c17946h;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 2:
                return addressElementActivity.f22375w;
            case 3:
                int i16 = AddressElementActivity.f22374z;
                Intent intent = addressElementActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (C17946h) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args");
            default:
                C17957k1 c17957k1 = ((C17969p) addressElementActivity.f22376x.getValue()).f69790w;
                C12991u0 c12991u0 = c17957k1.f69766a;
                if (c12991u0 != null && !c12991u0.m36410z()) {
                    AbstractC17960l1.m51584k(c17957k1);
                }
                return C23454a0.f92919a;
        }
    }
}
