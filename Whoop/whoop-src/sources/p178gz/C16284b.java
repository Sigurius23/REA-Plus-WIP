package p178gz;

import a40.InterfaceC0356a;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import cz.C11210l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C16284b implements InterfaceC0356a {

    /* JADX INFO: renamed from: w */
    public final Function1 f62457w;

    public C16284b(Function1 viewActionHandler) {
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        this.f62457w = viewActionHandler;
    }

    @Override // a40.InterfaceC0356a
    /* JADX INFO: renamed from: a */
    public final void mo991a() {
        PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.TokenCreate;
        this.f62457w.invoke(new C11210l());
    }
}
