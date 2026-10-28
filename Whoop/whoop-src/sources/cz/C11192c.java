package cz;

import a20.C0168h;
import android.content.Intent;
import androidx.lifecycle.InterfaceC1563a2;
import c93.InterfaceC4339a;
import com.stripe.android.customersheet.CustomerSheetActivity;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11192c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35893w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ CustomerSheetActivity f35894x;

    public /* synthetic */ C11192c(CustomerSheetActivity customerSheetActivity, int i13) {
        this.f35893w = i13;
        this.f35894x = customerSheetActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f35893w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        CustomerSheetActivity customerSheetActivity = this.f35894x;
        switch (i13) {
            case 0:
                int i14 = CustomerSheetActivity.f22164z;
                Intent intent = customerSheetActivity.getIntent();
                AbstractC22676k.m65749i(intent, "getIntent(...)");
                return (C11200g) intent.getParcelableExtra("args");
            case 1:
                int i15 = CustomerSheetActivity.f22164z;
                C11200g c11200g = (C11200g) customerSheetActivity.f22165w.getValue();
                AbstractC22676k.m65747g(c11200g);
                return new C0168h(c11200g, 1);
            case 2:
                return (InterfaceC1563a2) customerSheetActivity.f22166x.invoke();
            case 3:
                int i16 = CustomerSheetActivity.f22164z;
                customerSheetActivity.m16837p().m30338n(C11212m.f35952a);
                return c23454a0;
            default:
                int i17 = CustomerSheetActivity.f22164z;
                customerSheetActivity.m16837p().m30338n(C11224s.f36026a);
                return c23454a0;
        }
    }
}
