package i20;

import a20.C0168h;
import android.content.Intent;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivity;
import hm.C17417d;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.w */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17983w implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69820w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AutocompleteActivity f69821x;

    public /* synthetic */ C17983w(AutocompleteActivity autocompleteActivity, int i13) {
        this.f69820w = i13;
        this.f69821x = autocompleteActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f69820w;
        AutocompleteActivity autocompleteActivity = this.f69821x;
        switch (i13) {
            case 0:
                int i14 = AutocompleteActivity.f22378y;
                Intent intent = autocompleteActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (C17932c0) intent.getParcelableExtra("com.stripe.android.paymentsheet.addresselement.AutocompleteContract.extra_args");
            case 1:
                int i15 = AutocompleteActivity.f22378y;
                C17932c0 c17932c0 = (C17932c0) autocompleteActivity.f22379w.getValue();
                if (c17932c0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i16 = 6;
                return new C0168h(new C17417d(c17932c0, i16), i16);
            default:
                ((C17982v0) autocompleteActivity.f22380x.getValue()).m51592g();
                return C23454a0.f92919a;
        }
    }
}
