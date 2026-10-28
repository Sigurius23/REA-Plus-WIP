package k20;

import androidx.lifecycle.C1601k1;
import bc3.AbstractC3006f0;
import c10.C3820c;
import c10.C3824g;
import e30.C12603a;
import h20.C16670i0;
import n53.C26318e;
import p337n8.C26444a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: k20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C22139d {

    /* JADX INFO: renamed from: a */
    public final C1601k1 f85884a;

    /* JADX INFO: renamed from: b */
    public final C22136a f85885b;

    /* JADX INFO: renamed from: c */
    public final C12603a f85886c;

    public C22139d(C1601k1 savedStateHandle, C22136a eventReporter, C26318e currentScreen, C26444a c26444a, C12603a c12603a) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        this.f85884a = savedStateHandle;
        this.f85885b = eventReporter;
        this.f85886c = c12603a;
        AbstractC3006f0.m8732z(c26444a, null, null, new C16670i0(currentScreen, this, (InterfaceC30057d) null, 17), 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m63401a() {
        C1601k1 c1601k1 = this.f85884a;
        Boolean bool = (Boolean) c1601k1.m5001b("previously_sent_deep_link_event");
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        C22136a c22136a = this.f85885b;
        C22136a.m63387i(c22136a, new C22144i(c22136a.f85863a, 1));
        c1601k1.m5004e(Boolean.TRUE, "previously_sent_deep_link_event");
    }

    /* JADX INFO: renamed from: b */
    public final void m63402b(String code) {
        AbstractC22676k.m65750j(code, "code");
        C1601k1 c1601k1 = this.f85884a;
        if (AbstractC22676k.m65745e((String) c1601k1.m5001b("previously_interacted_payment_form"), code)) {
            return;
        }
        C22136a c22136a = this.f85885b;
        c22136a.getClass();
        c22136a.m63388g(new C3824g(code));
        C22136a.m63387i(c22136a, new C22147l(code, 6));
        c1601k1.m5004e(code, "previously_interacted_payment_form");
    }

    /* JADX INFO: renamed from: c */
    public final void m63403c(boolean z4) {
        C1601k1 c1601k1 = this.f85884a;
        Boolean bool = (Boolean) c1601k1.m5001b("previously_presented_sheet");
        if (!(bool != null ? bool.booleanValue() : false)) {
            C22136a c22136a = this.f85885b;
            if (z4) {
                c22136a.m63388g(new C3820c());
                C22136a.m63387i(c22136a, new C22144i(c22136a.f85863a, 3));
            } else {
                c22136a.m63388g(new C3820c());
                C22136a.m63387i(c22136a, new C22144i(c22136a.f85863a, 5));
            }
        }
        c1601k1.m5004e(Boolean.TRUE, "previously_presented_sheet");
    }
}
