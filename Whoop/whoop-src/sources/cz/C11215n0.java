package cz;

import a13.C0150h;
import a33.C0352d;
import android.app.Application;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import androidx.room.C1836v0;
import b20.C2326f;
import b20.EnumC2325e;
import b30.C2476a1;
import b30.C2598p3;
import b30.C2659y0;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import bz.C3710i;
import c93.InterfaceC4339a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.whoop.android.R;
import com.whoop.profile.view.edit.form.C9779c;
import dz.AbstractC12462i;
import dz.AbstractC12465l;
import dz.C12456c;
import dz.C12457d;
import dz.C12459f;
import dz.C12461h;
import dz.EnumC12464k;
import e10.C12560n0;
import e10.C12568r0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import h20.C16621a;
import h20.C16687l;
import h20.C16689l1;
import hm.C17417d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import my.EnumC26028b;
import n53.C26318e;
import p000.C12473e;
import p003a1.C0111j;
import p027b3.C2471z0;
import p029b5.C2725d;
import p098dt.AbstractC12350b;
import p204hz.AbstractC17811a;
import p442qy.C30765d;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p522uf.AbstractC34870c0;
import p537ux.C35363y;
import p550vd.AbstractC35903f;
import p695zx.C41193o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;
import q20.C29824j;
import q20.C29838w;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import u00.C34378f;
import v00.C35473j0;
import wb3.AbstractC37056f;
import y00.C38915o4;
import y00.C38988w5;
import y00.EnumC38853i;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cz.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11215n0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C0352d f35956E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC30063j f35957F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC11204i f35958G;

    /* JADX INFO: renamed from: H */
    public final C2326f f35959H;

    /* JADX INFO: renamed from: I */
    public final C3710i f35960I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f35961J;

    /* JADX INFO: renamed from: K */
    public final boolean f35962K;

    /* JADX INFO: renamed from: L */
    public final C13045h2 f35963L;

    /* JADX INFO: renamed from: M */
    public final C26318e f35964M;

    /* JADX INFO: renamed from: N */
    public final C13045h2 f35965N;

    /* JADX INFO: renamed from: O */
    public final C13045h2 f35966O;

    /* JADX INFO: renamed from: P */
    public final C12568r0 f35967P;

    /* JADX INFO: renamed from: Q */
    public final C13045h2 f35968Q;

    /* JADX INFO: renamed from: R */
    public final C13045h2 f35969R;

    /* JADX INFO: renamed from: S */
    public final C26318e f35970S;

    /* JADX INFO: renamed from: w */
    public final AbstractC29840y f35971w;

    /* JADX INFO: renamed from: x */
    public final C17417d f35972x;

    /* JADX INFO: renamed from: y */
    public final C17417d f35973y;

    /* JADX INFO: renamed from: z */
    public final C11190b f35974z;

    public C11215n0(Application application, AbstractC29840y abstractC29840y, C11190b configuration, EnumC11202h integrationType, C30765d logger, C0352d eventReporter, InterfaceC30063j workContext, C35363y paymentConfiguration, Set productUsage, C12560n0 confirmationHandlerFactory, InterfaceC11204i customerSheetLoader, C2326f errorReporter, C1601k1 savedStateHandle, C3710i userFacingLogger) {
        AbstractC22676k.m65750j(application, "application");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(integrationType, "integrationType");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(paymentConfiguration, "paymentConfiguration");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(confirmationHandlerFactory, "confirmationHandlerFactory");
        AbstractC22676k.m65750j(customerSheetLoader, "customerSheetLoader");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        C17417d c17417dM99755n = AbstractC32073e.m99755n(AbstractC17811a.f69275b);
        C17417d c17417dM99755n2 = AbstractC32073e.m99755n(AbstractC17811a.f69276c);
        this.f35971w = abstractC29840y;
        this.f35972x = c17417dM99755n;
        this.f35973y = c17417dM99755n2;
        this.f35974z = configuration;
        this.f35956E = eventReporter;
        this.f35957F = workContext;
        this.f35958G = customerSheetLoader;
        this.f35959H = errorReporter;
        this.f35960I = userFacingLogger;
        new C41193o(application, productUsage);
        AbstractC29840y abstractC29840y2 = this.f35971w;
        EnumC26028b enumC26028b = EnumC26028b.Full;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C11197e0(C25271y.f99162w, abstractC29840y2, new C11188a(), configuration));
        this.f35961J = c13045h2M36593c;
        String str = paymentConfiguration.f150633w;
        int i13 = 0;
        int i14 = 1;
        this.f35962K = !AbstractC39421y.m125930O(str, "pk_test", false);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(AbstractC37056f.m118958J(new C11221q0(m30339o())));
        this.f35963L = c13045h2M36593c2;
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c13045h2M36593c2, new C9779c(24));
        this.f35964M = c26318eM9484M;
        InterfaceC30057d interfaceC30057d = null;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(null);
        this.f35965N = c13045h2M36593c3;
        this.f35966O = c13045h2M36593c3;
        this.f35967P = confirmationHandlerFactory.m35244a(AbstractC1640x1.m5043b(this));
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f35968Q = c13045h2M36593c4;
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(new C11199f0(false, null));
        this.f35969R = c13045h2M36593c5;
        this.f35970S = AbstractC3269g.m9513t(c13045h2M36593c, c13045h2M36593c5, c13045h2M36593c4, new C2476a1(this, 8));
        new ArrayList();
        new C2725d(false, configuration.f35888K, savedStateHandle);
        AbstractC34870c0.m109996f0(configuration.f35889w);
        eventReporter.m941m(new C12459f(configuration, integrationType));
        boolean z4 = ((InterfaceC4339a) c26318eM9484M.f104635y).invoke() instanceof C11221q0;
        int i15 = 2;
        if (z4) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), workContext, null, new C11193c0(this, interfaceC30057d, i13), 2);
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C11193c0(this, interfaceC30057d, i14), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C11193c0(this, interfaceC30057d, i15), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C11193c0(this, interfaceC30057d, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (bc3.AbstractC3006f0.m8705K(r2, r4, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m30335g(cz.C11215n0 r7, s83.AbstractC32269c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof cz.C11201g0
            if (r0 == 0) goto L13
            r0 = r8
            cz.g0 r0 = (cz.C11201g0) r0
            int r1 = r0.f35928z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35928z = r1
            goto L18
        L13:
            cz.g0 r0 = new cz.g0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f35926x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f35928z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            p505ts.AbstractC34132o.m107864I(r8)
            goto L69
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            cz.n0 r7 = r0.f35925w
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4f
        L39:
            p505ts.AbstractC34132o.m107864I(r8)
            q83.j r8 = r7.f35957F
            cz.c0 r2 = new cz.c0
            r6 = 4
            r2.<init>(r7, r5, r6)
            r0.f35925w = r7
            r0.f35928z = r4
            java.lang.Object r8 = bc3.AbstractC3006f0.m8705K(r8, r2, r0)
            if (r8 != r1) goto L4f
            goto L68
        L4f:
            l83.n r8 = (l83.C23468n) r8
            java.lang.Object r8 = r8.f92940w
            n8.a r2 = androidx.lifecycle.AbstractC1640x1.m5043b(r7)
            q83.j r2 = r2.f105042w
            cz.d0 r4 = new cz.d0
            r4.<init>(r8, r7, r5)
            r0.f35925w = r5
            r0.f35928z = r3
            java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r2, r4, r0)
            if (r7 != r1) goto L69
        L68:
            return r1
        L69:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.C11215n0.m30335g(cz.n0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: j */
    public static final void m30336j(C11215n0 c11215n0, C38915o4 c38915o4, InterfaceC30057d interfaceC30057d) {
        C11207j0 c11207j0;
        c11215n0.getClass();
        if (interfaceC30057d instanceof C11207j0) {
            c11207j0 = (C11207j0) interfaceC30057d;
            int i13 = c11207j0.f35940y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11207j0.f35940y = i13 - Integer.MIN_VALUE;
            } else {
                c11207j0 = new C11207j0(c11215n0, interfaceC30057d);
            }
        } else {
            c11207j0 = new C11207j0(c11215n0, interfaceC30057d);
        }
        Object obj = c11207j0.f35938w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11207j0.f35940y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c11207j0.f35940y = 1;
            c11215n0.m30342r(c38915o4, c11207j0);
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (obj != null) {
                throw new ClassCastException();
            }
            AbstractC5583n.m16797x();
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: l */
    public static final void m30337l(C11215n0 c11215n0, C38915o4 c38915o4, C16621a c16621a, InterfaceC30057d interfaceC30057d) {
        C11213m0 c11213m0;
        c11215n0.getClass();
        if (interfaceC30057d instanceof C11213m0) {
            c11213m0 = (C11213m0) interfaceC30057d;
            int i13 = c11213m0.f35955y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11213m0.f35955y = i13 - Integer.MIN_VALUE;
            } else {
                c11213m0 = new C11213m0(c11215n0, interfaceC30057d);
            }
        } else {
            c11213m0 = new C11213m0(c11215n0, interfaceC30057d);
        }
        Object obj = c11213m0.f35953w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11213m0.f35955y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c11213m0.f35955y = 1;
            c11215n0.m30340p(c38915o4, c16621a, c11213m0);
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (obj != null) {
                throw new ClassCastException();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ec3.h2] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cz.t0] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [cz.p0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [cz.t0] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19, types: [cz.p0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [cz.t0] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [cz.p0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [cz.t0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [cz.p0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: n */
    public final void m30338n(AbstractC11191b0 viewAction) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        ArrayList arrayList4;
        Object value5;
        ArrayList arrayList5;
        Object value6;
        Object value7;
        AbstractC22676k.m65750j(viewAction, "viewAction");
        boolean z4 = viewAction instanceof C11224s;
        C13045h2 c13045h2 = this.f35965N;
        if (z4) {
            do {
                value7 = c13045h2.getValue();
            } while (!c13045h2.m36569i(value7, new C11235x0(this.f35971w)));
            return;
        }
        ?? r10 = 0;
        ?? r14 = 0;
        if (viewAction instanceof C11206j) {
            m30344u(false);
            throw null;
        }
        boolean z13 = viewAction instanceof C11218p;
        C0352d c0352d = this.f35956E;
        if (z13) {
            c0352d.getClass();
            c0352d.m941m(new C12457d(0));
            return;
        }
        if (viewAction instanceof C11222r) {
            EnumC38853i brand = ((C11222r) viewAction).f36011a;
            c0352d.getClass();
            AbstractC22676k.m65750j(brand, "brand");
            c0352d.m941m(new C12456c(brand));
            return;
        }
        if (viewAction instanceof C11210l) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.TokenCreate;
            c0352d.getClass();
            AbstractC3006f0.m8732z(AbstractC3006f0.m8708b((InterfaceC30063j) c0352d.f1239z), null, null, new C0150h(c0352d, null), 3);
            return;
        }
        if (viewAction instanceof C11220q) {
            AbstractC12462i abstractC12462i = ((C11220q) viewAction).f36009a;
            c0352d.getClass();
            c0352d.m941m(abstractC12462i);
            return;
        }
        if (viewAction instanceof C11212m) {
            m30341q();
            return;
        }
        boolean z14 = viewAction instanceof C11226t;
        C13045h2 c13045h3 = this.f35968Q;
        C13045h2 c13045h4 = this.f35961J;
        if (z14) {
            if (((C11197e0) c13045h4.getValue()).f35916g) {
                boolean zBooleanValue = ((Boolean) c13045h3.getValue()).booleanValue();
                if (zBooleanValue) {
                    c0352d.getClass();
                    c0352d.m941m(new C12457d(1));
                } else {
                    c0352d.getClass();
                    c0352d.m941m(new C12457d(2));
                }
                c13045h3.m36571k(null, Boolean.valueOf(!zBooleanValue));
                return;
            }
            return;
        }
        boolean z15 = viewAction instanceof C11234x;
        ?? r15 = this.f35963L;
        if (z15) {
            C16687l c16687l = ((C11234x) viewAction).f36046a;
            C11197e0 c11197e0 = (C11197e0) c13045h4.getValue();
            boolean zM30339o = m30339o();
            boolean z16 = c11197e0.f35914e;
            C11190b c11190b = this.f35974z;
            C16689l1 c16689l1 = c11190b.f35882E;
            int i13 = 0;
            C11225s0 c11225s0 = new C11225s0(new C2659y0(zM30339o, z16, c16687l, new C35473j0(c11197e0.f35913d.f35887J), c16689l1.f64192z, c16689l1.m47249b(), false, EnumC26028b.None.m77436a(c11190b.f35883F), false, false, new C1836v0(2, this, C11215n0.class, "removeExecutor", "removeExecutor(Lcom/stripe/android/model/PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i13, 2), new C11205i0(3, this, C11215n0.class, "updatePaymentMethodExecutor", "updatePaymentMethodExecutor-0E7RQCE(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/CardUpdateParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i13, 0), new C2471z0(2, 2, null), new C4780c(this, 14), new C0111j(this, 29)), m30339o());
            if (c11225s0 instanceof C11225s0) {
                EnumC12464k enumC12464k = EnumC12464k.f42539y;
                c0352d.getClass();
                c0352d.m941m(new C12461h(enumC12464k, 1));
            }
            do {
                value6 = r15.getValue();
            } while (!r15.m36569i(value6, AbstractC25265s.m74128f1(c11225s0, (List) value6)));
            return;
        }
        if (viewAction instanceof C11232w) {
            AbstractC29840y abstractC29840y = ((C11232w) viewAction).f36041a;
            if (!(abstractC29840y instanceof C29824j) && !(abstractC29840y instanceof C29838w)) {
                throw new IllegalStateException(("Unsupported payment selection " + abstractC29840y).toString());
            }
            if (((Boolean) c13045h3.getValue()).booleanValue()) {
                return;
            }
            C11197e0 state = (C11197e0) c13045h4.getValue();
            AbstractC22676k.m65750j(state, "state");
            List list = state.f35910a;
            C11188a c11188a = state.f35912c;
            C11190b configuration = state.f35913d;
            AbstractC22676k.m65750j(configuration, "configuration");
            c13045h4.m36571k(null, new C11197e0(list, abstractC29840y, c11188a, configuration));
            return;
        }
        boolean z17 = viewAction instanceof C11236y;
        C26318e c26318e = this.f35964M;
        if (z17) {
            AbstractC11227t0 abstractC11227t0 = (AbstractC11227t0) ((InterfaceC4339a) c26318e.f104635y).invoke();
            if (abstractC11227t0 instanceof C11219p0) {
                C2598p3 c2598p3 = ((C11219p0) abstractC11227t0).f36003q;
                if (c2598p3 != null) {
                    c2598p3.f10108c.invoke();
                    return;
                }
                ((C11197e0) c13045h4.getValue()).getClass();
                AbstractC35903f.m113990H(this.f35959H, EnumC2325e.CUSTOMER_SHEET_METADATA_NULL_ON_CONFIRM, null, null, 6);
                C11237y0 c11237y0 = new C11237y0(new IllegalStateException("No customer metadata available on confirmation!"));
                c13045h2.getClass();
                c13045h2.m36571k(null, c11237y0);
                return;
            }
            if (!(abstractC11227t0 instanceof C11223r0)) {
                throw new IllegalStateException((((InterfaceC4339a) c26318e.f104635y).invoke() + " is not supported").toString());
            }
            C13045h2 c13045h5 = this.f35969R;
            C11199f0 state2 = (C11199f0) c13045h5.getValue();
            AbstractC22676k.m65750j(state2, "state");
            c13045h5.m36571k(null, new C11199f0(true, state2.f35921b));
            AbstractC29840y abstractC29840y2 = ((C11223r0) abstractC11227t0).f36014e;
            if (abstractC29840y2 instanceof C29824j) {
                ((C11197e0) c13045h4.getValue()).getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), this.f35957F, null, new C12473e(this, (Object) (r14 == true ? 1 : 0), (InterfaceC30057d) (r10 == true ? 1 : 0), 26), 2);
                return;
            } else if (abstractC29840y2 instanceof C29838w) {
                m30343t((C29838w) abstractC29840y2);
                return;
            } else {
                if (abstractC29840y2 == null) {
                    m30343t(null);
                    return;
                }
                throw new IllegalStateException((abstractC29840y2 + " is not supported").toString());
            }
        }
        if (viewAction instanceof C11208k) {
            C34378f c34378f = ((C11208k) viewAction).f35941a;
            Object objInvoke = ((InterfaceC4339a) c26318e.f104635y).invoke();
            C11219p0 c11219p0 = objInvoke instanceof C11219p0 ? (C11219p0) objInvoke : null;
            if (c11219p0 == null || !c11219p0.f35989c.equals(c34378f.f144467a)) {
                ((C11197e0) c13045h4.getValue()).getClass();
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        if (viewAction instanceof C11230v) {
            ((C11197e0) c13045h4.getValue()).getClass();
            return;
        }
        if (viewAction instanceof AbstractC11238z) {
            do {
                value5 = r15.getValue();
                List<AbstractC11227t0> list2 = (List) value5;
                arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                for (AbstractC11227t0 abstractC11227t1 : list2) {
                    if (abstractC11227t1 instanceof C11219p0) {
                        throw null;
                    }
                    arrayList5.add(abstractC11227t1);
                }
            } while (!r15.m36569i(value5, arrayList5));
            return;
        }
        if (viewAction instanceof AbstractC11189a0) {
            do {
                value4 = r15.getValue();
                List<??> list3 = (List) value4;
                arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                for (?? M30345c : list3) {
                    if (M30345c instanceof C11219p0) {
                        M30345c = C11219p0.m30345c((C11219p0) M30345c, null, null, null, null, null, false, false, null, null, false, null, null, false, false, null, 950271);
                    }
                    arrayList4.add(M30345c);
                }
            } while (!r15.m36569i(value4, arrayList4));
            return;
        }
        if (viewAction instanceof AbstractC11214n) {
            do {
                value3 = r15.getValue();
                List<??> list4 = (List) value3;
                arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list4, 10));
                for (?? M30345c2 : list4) {
                    if (M30345c2 instanceof C11219p0) {
                        M30345c2 = C11219p0.m30345c((C11219p0) M30345c2, null, null, null, null, null, false, false, null, AbstractC32128i.m100054h(R.string.stripe_continue_button_label), false, null, null, false, false, null, 782335);
                    }
                    arrayList3.add(M30345c2);
                }
            } while (!r15.m36569i(value3, arrayList3));
            return;
        }
        if (viewAction instanceof AbstractC11228u) {
            do {
                value2 = r15.getValue();
                List<??> list5 = (List) value2;
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
                for (?? M30345c3 : list5) {
                    if (M30345c3 instanceof C11219p0) {
                        M30345c3 = C11219p0.m30345c((C11219p0) M30345c3, null, null, null, null, null, false, false, null, null, false, null, null, false, false, null, 1047551);
                    }
                    arrayList2.add(M30345c3);
                }
            } while (!r15.m36569i(value2, arrayList2));
            return;
        }
        if (!(viewAction instanceof C11216o)) {
            throw new NoWhenBranchMatchedException();
        }
        do {
            value = r15.getValue();
            List<??> list6 = (List) value;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list6, 10));
            for (?? M30345c4 : list6) {
                if (M30345c4 instanceof C11219p0) {
                    M30345c4 = C11219p0.m30345c((C11219p0) M30345c4, null, null, null, null, null, false, false, null, null, false, null, null, false, false, null, 917503);
                }
                arrayList.add(M30345c4);
            }
        } while (!r15.m36569i(value, arrayList));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m30339o() {
        ((C11197e0) this.f35961J.getValue()).getClass();
        return this.f35962K;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final void m30340p(C38915o4 c38915o4, C16621a c16621a, AbstractC32269c abstractC32269c) {
        C11203h0 c11203h0;
        C11215n0 c11215n0;
        if (abstractC32269c instanceof C11203h0) {
            c11203h0 = (C11203h0) abstractC32269c;
            int i13 = c11203h0.f35931F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11203h0.f35931F = i13 - Integer.MIN_VALUE;
            } else {
                c11203h0 = new C11203h0(this, abstractC32269c);
            }
        } else {
            c11203h0 = new C11203h0(this, abstractC32269c);
        }
        Object objM49430e = c11203h0.f35935z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11203h0.f35931F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM49430e);
            c11203h0.f35932w = this;
            c11203h0.f35933x = c38915o4;
            c11203h0.f35934y = c16621a;
            c11203h0.f35931F = 1;
            objM49430e = this.f35972x.m49430e(c11203h0);
            if (objM49430e == enumC31071a) {
                return;
            } else {
                c11215n0 = this;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM49430e);
                if (objM49430e != null) {
                    throw new ClassCastException();
                }
                AbstractC5583n.m16797x();
                throw null;
            }
            c16621a = c11203h0.f35934y;
            c38915o4 = (C38915o4) c11203h0.f35933x;
            c11215n0 = c11203h0.f35932w;
            AbstractC34132o.m107864I(objM49430e);
        }
        if (objM49430e != null) {
            throw new ClassCastException();
        }
        String str = c38915o4.f167527w;
        EnumC38853i enumC38853i = c16621a.f63954c;
        C33623c0.m106234g(c16621a.f63952a, c16621a.f63953b, enumC38853i != null ? new C38988w5(enumC38853i.f167260w) : null, c16621a.f63955d, AbstractC12350b.m34570S("CustomerSheet"));
        c11203h0.f35932w = c11215n0;
        c11203h0.f35933x = c16621a;
        c11203h0.f35934y = null;
        c11203h0.f35931F = 2;
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public final void m30341q() {
        Object value;
        List list;
        EnumC12464k enumC12464k;
        C13045h2 c13045h2 = this.f35963L;
        if (((List) c13045h2.getValue()).size() == 1) {
            C11235x0 c11235x0 = new C11235x0(this.f35971w);
            C13045h2 c13045h3 = this.f35965N;
            c13045h3.getClass();
            c13045h3.m36571k(null, c11235x0);
            return;
        }
        do {
            value = c13045h2.getValue();
            list = (List) value;
            AbstractC11227t0 abstractC11227t0 = (AbstractC11227t0) AbstractC25265s.m74112P0(list);
            if (abstractC11227t0 instanceof C11219p0) {
                enumC12464k = EnumC12464k.f42537w;
            } else if (abstractC11227t0 instanceof C11223r0) {
                enumC12464k = EnumC12464k.f42538x;
            } else {
                enumC12464k = abstractC11227t0 instanceof C11225s0 ? EnumC12464k.f42539y : null;
            }
            if (enumC12464k != null) {
                C0352d c0352d = this.f35956E;
                c0352d.getClass();
                if (AbstractC12465l.f42541a[enumC12464k.ordinal()] == 1) {
                    c0352d.m941m(new C12461h(enumC12464k, 0));
                }
            }
        } while (!c13045h2.m36569i(value, AbstractC25265s.m74086A0(1, list)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final void m30342r(C38915o4 c38915o4, AbstractC32269c abstractC32269c) {
        C11209k0 c11209k0;
        C11215n0 c11215n0;
        if (abstractC32269c instanceof C11209k0) {
            c11209k0 = (C11209k0) abstractC32269c;
            int i13 = c11209k0.f35942E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11209k0.f35942E = i13 - Integer.MIN_VALUE;
            } else {
                c11209k0 = new C11209k0(this, abstractC32269c);
            }
        } else {
            c11209k0 = new C11209k0(this, abstractC32269c);
        }
        Object objM49430e = c11209k0.f35945y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11209k0.f35942E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM49430e);
            c11209k0.f35943w = this;
            c11209k0.f35944x = c38915o4;
            c11209k0.f35942E = 1;
            objM49430e = this.f35972x.m49430e(c11209k0);
            if (objM49430e == enumC31071a) {
                return;
            } else {
                c11215n0 = this;
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM49430e);
                if (objM49430e != null) {
                    throw new ClassCastException();
                }
                AbstractC5583n.m16797x();
                throw null;
            }
            c38915o4 = c11209k0.f35944x;
            c11215n0 = c11209k0.f35943w;
            AbstractC34132o.m107864I(objM49430e);
        }
        if (objM49430e != null) {
            throw new ClassCastException();
        }
        String str = c38915o4.f167527w;
        c11209k0.f35943w = c11215n0;
        c11209k0.f35944x = c38915o4;
        c11209k0.f35942E = 2;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m30343t(C29838w c29838w) {
        ((C11197e0) this.f35961J.getValue()).getClass();
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C11211l0(this, c29838w, null, 0 == true ? 1 : 0, 1), 3);
    }

    /* JADX INFO: renamed from: u */
    public final void m30344u(boolean z4) {
        ((C11197e0) this.f35961J.getValue()).getClass();
        throw new IllegalArgumentException("Required value was null.");
    }
}
