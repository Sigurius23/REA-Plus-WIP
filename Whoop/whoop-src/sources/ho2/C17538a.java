package ho2;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import iy1.InterfaceC21030c;
import j02.InterfaceC21153l0;
import jo2.C21842e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import po2.InterfaceC29402a;
import q20.C29814e;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ho2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lho2/a;", "", "Lfi0/a;", "analytics", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "Lj02/l0;", "navigationReporter", "Ljo2/e;", "stripeFlowControllerManager", "<init>", "(Lfi0/a;Liy1/c;Ltr2/n;Lj02/l0;Ljo2/e;)V", "Lpo2/a$o;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lpo2/a$o;)V", "", "paymentMethod", "", "c", "(Ljava/lang/String;)Z", "Lpo2/a$a;", "a", "(Lpo2/a$a;)V", "Lfi0/a;", "Liy1/c;", "Ltr2/n;", "d", "Lj02/l0;", "e", "Ljo2/e;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17538a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21153l0 navigationReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C21842e stripeFlowControllerManager;

    public C17538a(InterfaceC14515a analytics, InterfaceC21030c metricWriter, InterfaceC34116n logger, InterfaceC21153l0 navigationReporter, C21842e stripeFlowControllerManager) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(navigationReporter, "navigationReporter");
        AbstractC22676k.m65750j(stripeFlowControllerManager, "stripeFlowControllerManager");
        this.analytics = analytics;
        this.metricWriter = metricWriter;
        this.logger = logger;
        this.navigationReporter = navigationReporter;
        this.stripeFlowControllerManager = stripeFlowControllerManager;
    }

    /* JADX INFO: renamed from: b */
    private final void m49841b(InterfaceC29402a.o event) {
    }

    /* JADX INFO: renamed from: c */
    private final boolean m49842c(String paymentMethod) {
        String strM91322b;
        C29814e c29814eM61822t = this.stripeFlowControllerManager.m61822t();
        return (c29814eM61822t == null || (strM91322b = c29814eM61822t.m91322b()) == null || !AbstractC39414r.m125876U(strM91322b, paymentMethod, true)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final void m49843a(InterfaceC29402a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC29402a.l0) {
            InterfaceC29402a.l0 l0Var = (InterfaceC29402a.l0) event;
            AbstractC17539b.m49861r(this.analytics, l0Var.getSource(), l0Var.m89623a());
            return;
        }
        if (event instanceof InterfaceC29402a.f0) {
            InterfaceC29402a.f0 f0Var = (InterfaceC29402a.f0) event;
            AbstractC17539b.m49851h(this.analytics, f0Var.getSource(), f0Var.getErrorMessage(), f0Var.m89606b());
            AbstractC17539b.m49852i(this.metricWriter);
            InterfaceC34116n interfaceC34116n = this.logger;
            String errorMessage = f0Var.getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "Unknown stripe error";
            }
            interfaceC34116n.mo85222m(errorMessage, new AbstractC30556a.a[0]);
            return;
        }
        if (event instanceof InterfaceC29402a.j) {
            AbstractC17539b.m49844a(this.analytics, ((InterfaceC29402a.j) event).getSource());
            return;
        }
        if (event instanceof InterfaceC29402a.y) {
            InterfaceC29402a.y yVar = (InterfaceC29402a.y) event;
            AbstractC17539b.m49855l(this.analytics, yVar.getSource(), yVar.m89643a());
            return;
        }
        if (event instanceof InterfaceC29402a.z) {
            InterfaceC29402a.z zVar = (InterfaceC29402a.z) event;
            AbstractC17539b.m49856m(this.analytics, zVar.getSource(), zVar.m89645a());
            return;
        }
        if (event instanceof InterfaceC29402a.a0) {
            InterfaceC29402a.a0 a0Var = (InterfaceC29402a.a0) event;
            AbstractC17539b.m49857n(this.analytics, a0Var.getSource(), a0Var.m89589a());
            return;
        }
        if (event instanceof InterfaceC29402a.b0) {
            InterfaceC29402a.b0 b0Var = (InterfaceC29402a.b0) event;
            AbstractC17539b.m49849f(this.analytics, b0Var.getSource(), b0Var.m89592a());
            return;
        }
        if (event instanceof InterfaceC29402a.d0) {
            InterfaceC29402a.d0 d0Var = (InterfaceC29402a.d0) event;
            AbstractC17539b.m49850g(this.analytics, d0Var.getSource(), d0Var.m89599a());
            return;
        }
        if (event instanceof InterfaceC29402a.e0) {
            InterfaceC29402a.e0 e0Var = (InterfaceC29402a.e0) event;
            AbstractC17539b.m49858o(this.analytics, e0Var.getErrorMessage(), e0Var.getSource(), e0Var.m89602b());
            return;
        }
        if (event instanceof InterfaceC29402a.m0) {
            InterfaceC29402a.m0 m0Var = (InterfaceC29402a.m0) event;
            if (AbstractC22676k.m65745e(m0Var.getSelectedPaymentMethod(), this.stripeFlowControllerManager.m61821r())) {
                return;
            }
            InterfaceC14515a interfaceC14515a = this.analytics;
            String source = m0Var.getSource();
            C29814e c29814eM61822t = this.stripeFlowControllerManager.m61822t();
            AbstractC17539b.m49860q(interfaceC14515a, source, c29814eM61822t != null ? c29814eM61822t.m91322b() : null, m0Var.m89625a());
            return;
        }
        if (event instanceof InterfaceC29402a.w) {
            InterfaceC14515a interfaceC14515a2 = this.analytics;
            InterfaceC29402a.w wVar = (InterfaceC29402a.w) event;
            String source2 = wVar.getSource();
            C29814e c29814eM61822t2 = this.stripeFlowControllerManager.m61822t();
            AbstractC17539b.m49854k(interfaceC14515a2, source2, c29814eM61822t2 != null ? c29814eM61822t2.m91322b() : null, this.stripeFlowControllerManager.m61824w(), wVar.m89640a());
            if (m49842c("Klarna")) {
                AbstractC17539b.m49847d(this.navigationReporter);
                return;
            } else {
                if (m49842c("Affirm")) {
                    AbstractC17539b.m49846c(this.navigationReporter);
                    return;
                }
                return;
            }
        }
        if (!(event instanceof InterfaceC29402a.v)) {
            if (event instanceof InterfaceC29402a.t) {
                InterfaceC29402a.t tVar = (InterfaceC29402a.t) event;
                AbstractC17539b.m49853j(this.analytics, tVar.getSource(), tVar.m89635a());
                return;
            } else {
                if (!(event instanceof InterfaceC29402a.o)) {
                    throw new NoWhenBranchMatchedException();
                }
                m49841b((InterfaceC29402a.o) event);
                return;
            }
        }
        InterfaceC29402a.v vVar = (InterfaceC29402a.v) event;
        String errorMessage2 = vVar.getErrorMessage();
        if (errorMessage2 == null) {
            errorMessage2 = "Unknown error";
        }
        String str = errorMessage2;
        InterfaceC14515a interfaceC14515a3 = this.analytics;
        String source3 = vVar.getSource();
        C29814e c29814eM61822t3 = this.stripeFlowControllerManager.m61822t();
        AbstractC17539b.m49848e(interfaceC14515a3, source3, str, c29814eM61822t3 != null ? c29814eM61822t3.m91322b() : null, this.stripeFlowControllerManager.m61824w(), vVar.m89638b());
    }
}
