package c00;

import android.os.LocaleList;
import bc3.AbstractC3050q0;
import bz.C3702a;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import i20.C17988y0;
import i20.C17989z;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p029b5.C2728g;
import p098dt.AbstractC12350b;
import s93.AbstractC32309k;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: c00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C3799e implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15547w;

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f15547w) {
            case 0:
                return null;
            case 1:
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return executorC22364d;
            case 2:
                return Boolean.TRUE;
            case 3:
                return new C17988y0(C17989z.f69832w);
            case 4:
                C3702a c3702a = C3702a.f15142b;
                AbstractC32309k.m100574c(c3702a);
                return c3702a;
            case 5:
                return EventReporter$Mode.Custom;
            case 6:
                C2728g c2728g = C2728g.f10738b;
                C2728g c2728gM7699f = C2728g.m7699f(LocaleList.getAdjustedDefault());
                if (c2728gM7699f.m7701c()) {
                    c2728gM7699f = null;
                }
                if (c2728gM7699f != null) {
                    return c2728gM7699f.m7700b(0);
                }
                return null;
            case 7:
                return AbstractC12350b.m34570S("PaymentSheet");
            default:
                return Boolean.FALSE;
        }
    }
}
