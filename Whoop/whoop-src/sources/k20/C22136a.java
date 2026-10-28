package k20;

import a30.C0314n1;
import a30.EnumC0293g1;
import android.content.Context;
import androidx.room.C1778e;
import b10.C2222b;
import bc3.AbstractC3006f0;
import bz.C3702a;
import bz.C3710i;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import c10.C3818a;
import c10.C3819b;
import c10.C3822e;
import c10.C3823f;
import c10.C3825h;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import h20.C16670i0;
import java.util.List;
import k83.InterfaceC22297a;
import n10.EnumC26121c0;
import n83.C26460c;
import p023ay.C2147u;
import p203hy.AbstractC17719h;
import p408q.C29662f;
import p550vd.AbstractC35902e;
import p664yy.C39865j;
import p664yy.C39873n;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q20.AbstractC29840y;
import q20.C29838w;
import q20.EnumC29836u;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import t20.C33338s;
import t20.C33339t;
import t20.InterfaceC33340u;
import v00.C35459c0;
import v03.InterfaceC35517d;
import v30.InterfaceC35593b;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import y00.EnumC38853i;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: k20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22136a implements InterfaceC35593b {

    /* JADX INFO: renamed from: a */
    public final EventReporter$Mode f85863a;

    /* JADX INFO: renamed from: b */
    public final C39865j f85864b;

    /* JADX INFO: renamed from: c */
    public final C39873n f85865c;

    /* JADX INFO: renamed from: d */
    public final C2222b f85866d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3704c f85867e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC35517d f85868f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC30063j f85869g;

    /* JADX INFO: renamed from: h */
    public final C3710i f85870h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC22297a f85871i;

    /* JADX INFO: renamed from: j */
    public final C29662f f85872j;

    public C22136a(Context context, EventReporter$Mode mode, C39865j analyticsRequestExecutor, C39873n analyticsRequestV2Executor, C2222b paymentAnalyticsRequestFactory, InterfaceC3704c durationProvider, InterfaceC35517d interfaceC35517d, InterfaceC30063j workContext, C3710i logger, InterfaceC22297a paymentMethodMetadataProvider) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(analyticsRequestV2Executor, "analyticsRequestV2Executor");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(durationProvider, "durationProvider");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(paymentMethodMetadataProvider, "paymentMethodMetadataProvider");
        this.f85863a = mode;
        this.f85864b = analyticsRequestExecutor;
        this.f85865c = analyticsRequestV2Executor;
        this.f85866d = paymentAnalyticsRequestFactory;
        this.f85867e = durationProvider;
        this.f85868f = interfaceC35517d;
        this.f85869g = workContext;
        this.f85870h = logger;
        this.f85871i = paymentMethodMetadataProvider;
        this.f85872j = new C29662f(context);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m63387i(C22136a c22136a, AbstractC22155t abstractC22155t) {
        c22136a.m63389h(abstractC22155t, (C35459c0) c22136a.f85871i.get());
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: a */
    public final void mo46109a() {
        m63387i(this, new C22149n(((C3702a) this.f85867e).m11527a(EnumC3703b.f15144E), 0));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: b */
    public final void mo46110b() {
        AbstractC35902e.m113963f0(this.f85867e, EnumC3703b.f15144E);
        m63387i(this, new C22147l(2));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: c */
    public final void mo46111c(Throwable th3) {
        String message;
        m63387i(this, new C22145j(th3));
        if (th3 == null || (message = th3.getMessage()) == null) {
            return;
        }
        this.f85870h.m11528a("Card scan check failed: ".concat(message));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: d */
    public final void mo46112d(Throwable th3) {
        m63387i(this, new C22149n(((C3702a) this.f85867e).m11527a(EnumC3703b.f15144E), th3, 1));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: e */
    public final void mo46113e() {
        m63387i(this, new C22147l(1));
    }

    @Override // v30.InterfaceC35593b
    /* JADX INFO: renamed from: f */
    public final void mo46114f() {
        m63387i(this, new C22149n(((C3702a) this.f85867e).m11527a(EnumC3703b.f15144E), 2));
    }

    /* JADX INFO: renamed from: g */
    public final void m63388g(AbstractC37926s0 abstractC37926s0) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f85869g), null, null, new C1778e(this, abstractC37926s0, null, 17), 3);
    }

    /* JADX INFO: renamed from: h */
    public final void m63389h(AbstractC22155t abstractC22155t, C35459c0 c35459c0) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f85869g), null, null, new C2147u(this, abstractC22155t, c35459c0, null, 8), 3);
    }

    /* JADX INFO: renamed from: j */
    public final void m63390j(EnumC38853i selectedBrand) {
        EnumC22138c[] enumC22138cArr = EnumC22138c.f85883w;
        AbstractC22676k.m65750j(selectedBrand, "selectedBrand");
        m63387i(this, new C22145j(EnumC22148m.Edit, selectedBrand));
    }

    /* JADX INFO: renamed from: k */
    public final void m63391k(AbstractC17719h abstractC17719h) {
        AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(this.f85869g), null, null, new C16670i0(this, new C22149n(abstractC17719h), (InterfaceC30057d) null, 16), 3);
    }

    /* JADX INFO: renamed from: l */
    public final void m63392l(List visiblePaymentMethods, List hiddenPaymentMethods, C0314n1 c0314n1, boolean z4) {
        AbstractC22676k.m65750j(visiblePaymentMethods, "visiblePaymentMethods");
        AbstractC22676k.m65750j(hiddenPaymentMethods, "hiddenPaymentMethods");
        boolean z13 = false;
        boolean z14 = (c0314n1 != null ? c0314n1.m826a(EnumC0293g1.f1026w) : null) != null && c0314n1.f1082d;
        if ((c0314n1 != null ? c0314n1.m827b(EnumC0293g1.f1026w) : null) != null && c0314n1.f1082d) {
            z13 = true;
        }
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (z14) {
            c26460cM119000x.add("google_pay");
        }
        if (z13) {
            c26460cM119000x.add("link");
        }
        c26460cM119000x.addAll(visiblePaymentMethods);
        m63387i(this, new C22150o(AbstractC37056f.m118988k(c26460cM119000x), hiddenPaymentMethods, z4));
    }

    /* JADX INFO: renamed from: m */
    public final void m63393m(AbstractC29840y paymentSelection, AbstractC22143h abstractC22143h) {
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        Duration durationM11527a = ((C3702a) this.f85867e).m11527a(EnumC3703b.f15152x);
        m63387i(this, new C22154s(this.f85863a, new C22151p(abstractC22143h), durationM11527a, paymentSelection, null, null));
    }

    /* JADX INFO: renamed from: n */
    public final void m63394n(String str) {
        m63388g(new C3818a(str));
        m63387i(this, new C22147l(str, 5));
    }

    /* JADX INFO: renamed from: o */
    public final void m63395o(String code) {
        AbstractC22676k.m65750j(code, "code");
        AbstractC35902e.m113963f0(this.f85867e, EnumC3703b.f15154z);
        m63388g(new C3819b(code));
        m63387i(this, new C22147l(code, 9));
    }

    /* JADX INFO: renamed from: p */
    public final void m63396p(AbstractC29840y paymentSelection, EnumC26121c0 enumC26121c0, String str) {
        EnumC29836u enumC29836u;
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        C29838w c29838w = paymentSelection instanceof C29838w ? (C29838w) paymentSelection : null;
        if (c29838w != null && (enumC29836u = c29838w.f121956y) != null) {
            paymentSelection = enumC29836u.f121953w;
        }
        m63387i(this, new C22154s(this.f85863a, C22152q.f85908a, ((C3702a) this.f85867e).m11527a(EnumC3703b.f15152x), paymentSelection, enumC26121c0, str));
    }

    /* JADX INFO: renamed from: q */
    public final void m63397q(AbstractC29840y abstractC29840y) {
        Duration durationM11527a = ((C3702a) this.f85867e).m11527a(EnumC3703b.f15154z);
        m63388g(new C3825h(AbstractC22156u.m63411a(abstractC29840y)));
        m63387i(this, new C22147l(durationM11527a, AbstractC22156u.m63411a(abstractC29840y), AbstractC22156u.m63412b(abstractC29840y)));
    }

    /* JADX INFO: renamed from: r */
    public final void m63398r(String code) {
        AbstractC22676k.m65750j(code, "code");
        m63388g(new C3822e(code));
        String str = null;
        if (code.equals("link")) {
            C35459c0 c35459c0 = (C35459c0) this.f85871i.get();
            str = (c35459c0 != null ? c35459c0.f150977T : null) == EnumC38922p2.LinkCardBrand ? "link_card_brand" : "instant_debits";
        }
        m63387i(this, new C22145j(code, str));
    }

    /* JADX INFO: renamed from: s */
    public final void m63399s(AbstractC29840y paymentSelection) {
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        if (paymentSelection instanceof C29838w) {
            m63388g(new C3823f(AbstractC22156u.m63411a(paymentSelection)));
        }
        m63387i(this, new C22144i(this.f85863a, paymentSelection));
    }

    /* JADX INFO: renamed from: t */
    public final void m63400t(InterfaceC33340u event) {
        AbstractC22155t c22145j;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C33339t) {
            c22145j = new C22146k(0);
        } else {
            if (!(event instanceof C33338s)) {
                throw new NoWhenBranchMatchedException();
            }
            c22145j = new C22145j((C33338s) event);
        }
        m63387i(this, c22145j);
    }
}
