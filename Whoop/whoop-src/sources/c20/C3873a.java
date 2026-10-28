package c20;

import android.content.Context;
import bs1.C3603v;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23470p;
import m83.AbstractC25247g0;
import n83.C26466i;
import p098dt.AbstractC12350b;
import p236j.AbstractC21065d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import y00.AbstractC38792b8;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: c20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3873a {

    /* JADX INFO: renamed from: a */
    public final C3875c f15849a;

    /* JADX INFO: renamed from: b */
    public final Map f15850b;

    /* JADX INFO: renamed from: c */
    public final boolean f15851c;

    /* JADX INFO: renamed from: d */
    public final C23470p f15852d;

    /* JADX INFO: renamed from: e */
    public AbstractC21065d f15853e;

    /* JADX INFO: renamed from: f */
    public AbstractC21065d f15854f;

    public C3873a(C3875c noOpIntentNextActionHandler, Map paymentNextActionHandlers, boolean z4, Context applicationContext) {
        AbstractC22676k.m65750j(noOpIntentNextActionHandler, "noOpIntentNextActionHandler");
        AbstractC22676k.m65750j(paymentNextActionHandlers, "paymentNextActionHandlers");
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        this.f15849a = noOpIntentNextActionHandler;
        this.f15850b = paymentNextActionHandlers;
        this.f15851c = z4;
        this.f15852d = AbstractC30060g.m92088H(new C3603v(3, this, applicationContext));
    }

    /* JADX INFO: renamed from: a */
    public final C26466i m11854a() {
        C26466i c26466i = new C26466i();
        c26466i.add(this.f15849a);
        c26466i.addAll(this.f15850b.values());
        c26466i.addAll(((Map) this.f15852d.getValue()).values());
        return AbstractC12350b.m34586g(c26466i);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC3877e m11855b(Object obj) {
        AbstractC3877e abstractC3877e;
        if (!(obj instanceof InterfaceC38802c8)) {
            throw new IllegalStateException(("No suitable PaymentNextActionHandler for " + obj).toString());
        }
        InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
        boolean zMo124339z = interfaceC38802c8.mo124339z();
        AbstractC3877e abstractC3877e2 = this.f15849a;
        if (!zMo124339z) {
            AbstractC22676k.m65748h(abstractC3877e2, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
            return abstractC3877e2;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(this.f15850b, (Map) this.f15852d.getValue());
        AbstractC38792b8 abstractC38792b8Mo124335m = interfaceC38802c8.mo124335m();
        if (abstractC38792b8Mo124335m != null && (abstractC3877e = (AbstractC3877e) linkedHashMapM73995d0.get(abstractC38792b8Mo124335m.getClass())) != null) {
            abstractC3877e2 = abstractC3877e;
        }
        AbstractC22676k.m65748h(abstractC3877e2, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>");
        return abstractC3877e2;
    }
}
