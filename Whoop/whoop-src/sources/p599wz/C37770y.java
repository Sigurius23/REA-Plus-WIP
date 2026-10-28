package p599wz;

import a00.C0072g;
import a00.C0074i;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.C1836v0;
import androidx.room.C1844y;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import c00.C3795a;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.stripe.android.model.ConsumerSessionRefresh;
import com.stripe.android.model.LinkAuthIntent;
import d00.AbstractC11435n;
import d00.C11422a;
import d00.C11423b;
import d00.C11424c;
import d00.C11425d;
import d00.C11426e;
import d00.C11429h;
import d00.C11433l;
import d00.InterfaceC11427f;
import d00.InterfaceC11432k;
import e10.C12560n0;
import e10.C12568r0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import f20.EnumC14023b;
import h00.C16508j;
import i20.C17988y0;
import java.util.Set;
import k20.C22136a;
import l83.C23454a0;
import m83.AbstractC25265s;
import n40.C26265e;
import n40.C26267g;
import n40.C26269i;
import n83.C26460c;
import p000.AbstractC11266d;
import p478s3.AbstractC32098d;
import p505ts.AbstractC34132o;
import p619xl.C38445a;
import p631xz.C38721f0;
import p631xz.C38747x;
import p697zz.C41234a;
import p697zz.C41235b;
import p697zz.C41236c;
import p697zz.C41237d;
import p697zz.C41238e;
import p697zz.InterfaceC41239f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.AbstractC29713f;
import q00.C29709d;
import q00.C29711e;
import q00.C29715g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import v00.C35459c0;
import v03.InterfaceC35521h;
import wb3.AbstractC37056f;
import y00.EnumC38886l2;

/* JADX INFO: renamed from: wz.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C37770y extends AbstractC1637w1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E */
    public final C37718g0 f161760E;

    /* JADX INFO: renamed from: F */
    public final C35459c0 f161761F;

    /* JADX INFO: renamed from: G */
    public final C41234a f161762G;

    /* JADX INFO: renamed from: H */
    public final C1601k1 f161763H;

    /* JADX INFO: renamed from: I */
    public final EnumC37721h0 f161764I;

    /* JADX INFO: renamed from: J */
    public final C26267g f161765J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC37739n0 f161766K;

    /* JADX INFO: renamed from: L */
    public final C17988y0 f161767L;

    /* JADX INFO: renamed from: M */
    public final C29715g f161768M;

    /* JADX INFO: renamed from: N */
    public final C12568r0 f161769N;

    /* JADX INFO: renamed from: O */
    public final C0072g f161770O;

    /* JADX INFO: renamed from: P */
    public final C13045h2 f161771P;

    /* JADX INFO: renamed from: Q */
    public final C13081r1 f161772Q;

    /* JADX INFO: renamed from: R */
    public final C13096w1 f161773R;

    /* JADX INFO: renamed from: S */
    public final C13078q1 f161774S;

    /* JADX INFO: renamed from: T */
    public final C13078q1 f161775T;

    /* JADX INFO: renamed from: U */
    public final C13045h2 f161776U;

    /* JADX INFO: renamed from: V */
    public final C13045h2 f161777V;

    /* JADX INFO: renamed from: W */
    public C1836v0 f161778W;

    /* JADX INFO: renamed from: w */
    public final C3795a f161779w;

    /* JADX INFO: renamed from: x */
    public final C38747x f161780x;

    /* JADX INFO: renamed from: y */
    public final C38721f0 f161781y;

    /* JADX INFO: renamed from: z */
    public final C22136a f161782z;

    public C37770y(C3795a activityRetainedComponent, C12560n0 confirmationHandlerFactory, C0074i linkConfirmationHandlerFactory, C38747x linkAccountManager, C38721f0 linkAccountHolder, C22136a eventReporter, C37718g0 linkConfiguration, C35459c0 paymentMethodMetadata, C41234a linkAttestationCheck, C1601k1 savedStateHandle, EnumC37721h0 linkExpressMode, C26267g navigationManager, InterfaceC37739n0 linkLaunchMode, C17988y0 autocompleteLauncher, C29715g addPaymentMethodOptionsFactory) {
        AbstractC22676k.m65750j(activityRetainedComponent, "activityRetainedComponent");
        AbstractC22676k.m65750j(confirmationHandlerFactory, "confirmationHandlerFactory");
        AbstractC22676k.m65750j(linkConfirmationHandlerFactory, "linkConfirmationHandlerFactory");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(linkAttestationCheck, "linkAttestationCheck");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        AbstractC22676k.m65750j(navigationManager, "navigationManager");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(autocompleteLauncher, "autocompleteLauncher");
        AbstractC22676k.m65750j(addPaymentMethodOptionsFactory, "addPaymentMethodOptionsFactory");
        this.f161779w = activityRetainedComponent;
        this.f161780x = linkAccountManager;
        this.f161781y = linkAccountHolder;
        this.f161782z = eventReporter;
        this.f161760E = linkConfiguration;
        this.f161761F = paymentMethodMetadata;
        this.f161762G = linkAttestationCheck;
        this.f161763H = savedStateHandle;
        this.f161764I = linkExpressMode;
        this.f161765J = navigationManager;
        this.f161766K = linkLaunchMode;
        this.f161767L = autocompleteLauncher;
        this.f161768M = addPaymentMethodOptionsFactory;
        C12568r0 c12568r0M35244a = confirmationHandlerFactory.m35244a(AbstractC1640x1.m5043b(this));
        this.f161769N = c12568r0M35244a;
        this.f161770O = linkConfirmationHandlerFactory.m208a(c12568r0M35244a);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C16508j(true, false, null, false));
        this.f161771P = c13045h2M36593c;
        this.f161772Q = AbstractC13091v.m36598h(c13045h2M36593c);
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 1, null, 4);
        this.f161773R = c13096w1M36592b;
        this.f161774S = AbstractC13091v.m36597g(c13096w1M36592b);
        this.f161775T = navigationManager.f104431b;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(C37746p1.f161711a);
        this.f161776U = c13045h2M36593c2;
        this.f161777V = c13045h2M36593c2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d8, code lost:
    
        if (r0 == r7) goto L59;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m121165g(p599wz.C37770y r8, p599wz.AbstractC37760u0 r9, s83.AbstractC32269c r10) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p599wz.C37770y.m121165g(wz.y, wz.u0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public static final Object m121166j(C37770y c37770y, AbstractC32269c abstractC32269c) {
        C37765w c37765w;
        if (abstractC32269c instanceof C37765w) {
            c37765w = (C37765w) abstractC32269c;
            int i13 = c37765w.f161750z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37765w.f161750z = i13 - Integer.MIN_VALUE;
            } else {
                c37765w = new C37765w(c37770y, abstractC32269c);
            }
        } else {
            c37765w = new C37765w(c37770y, abstractC32269c);
        }
        Object objM8705K = c37765w.f161748x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37765w.f161750z;
        C41238e c41238e = C41238e.f177940a;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C41234a c41234a = c37770y.f161762G;
            c37765w.f161747w = c37770y;
            c37765w.f161750z = 1;
            objM8705K = !c41234a.f177931a.m6860a() ? c41238e : AbstractC3006f0.m8705K(c41234a.f177936f, new C32139c0(c41234a, interfaceC30057d, 29), c37765w);
            if (objM8705K != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                AbstractC34132o.m107864I(objM8705K);
                return c23454a0;
            }
            if (i14 == 3) {
                AbstractC34132o.m107864I(objM8705K);
                return c23454a0;
            }
            if (i14 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
            return c23454a0;
        }
        c37770y = c37765w.f161747w;
        AbstractC34132o.m107864I(objM8705K);
        InterfaceC41239f interfaceC41239f = (InterfaceC41239f) objM8705K;
        if (interfaceC41239f instanceof C41236c) {
            int iOrdinal = c37770y.f161764I.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                c37770y.m121172p(((C41236c) interfaceC41239f).f177938a);
                return c23454a0;
            }
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            c37765w.f161747w = null;
            c37765w.f161750z = 2;
            if (m121168t(c37770y, true, null, c37765w, 6) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
        if (AbstractC22676k.m65745e(interfaceC41239f, c41238e)) {
            c37765w.f161747w = null;
            c37765w.f161750z = 3;
            if (m121168t(c37770y, true, null, c37765w, 6) == enumC31071a) {
                return enumC31071a;
            }
            return c23454a0;
        }
        if (!(interfaceC41239f instanceof C41237d) && !(interfaceC41239f instanceof C41235b)) {
            throw new NoWhenBranchMatchedException();
        }
        c37765w.f161747w = null;
        c37765w.f161750z = 4;
        if (c37770y.m121171o(c37765w) == enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: q */
    public static void m121167q(C37770y c37770y, AbstractC37713e1 screen, boolean z4) {
        c37770y.getClass();
        AbstractC22676k.m65750j(screen, "screen");
        C26267g c26267g = c37770y.f161765J;
        String route = screen.m121144a();
        C26269i c26269i = z4 ? C26269i.f104433a : null;
        c26267g.getClass();
        AbstractC22676k.m65750j(route, "route");
        c26267g.f104430a.mo36564a(new C26265e(route, c26269i, false));
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ Object m121168t(C37770y c37770y, boolean z4, ConsumerSessionRefresh consumerSessionRefresh, AbstractC32269c abstractC32269c, int i13) {
        if ((i13 & 2) != 0) {
            consumerSessionRefresh = null;
        }
        return c37770y.m121173r(z4, consumerSessionRefresh, (i13 & 4) == 0, abstractC32269c);
    }

    /* JADX INFO: renamed from: l */
    public final void m121169l(AbstractC37747q abstractC37747q) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C32139c0(this, abstractC37747q, (InterfaceC30057d) null, 23), 3);
    }

    /* JADX INFO: renamed from: n */
    public final C11433l m121170n() {
        return ((C37708d) this.f161780x.f166746a.f166664b.f45200w.getValue()).f161571w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (m121168t(r2, true, null, r0, 6) == r1) goto L22;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121171o(s83.AbstractC32269c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p599wz.C37759u
            if (r0 == 0) goto L13
            r0 = r9
            wz.u r0 = (p599wz.C37759u) r0
            int r1 = r0.f161737z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161737z = r1
            goto L18
        L13:
            wz.u r0 = new wz.u
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f161735x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f161737z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r9)
            goto L67
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            wz.y r2 = r0.f161734w
            p505ts.AbstractC34132o.m107864I(r9)
            l83.n r9 = (l83.C23468n) r9
            r9.getClass()
            goto L4e
        L3d:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.f161734w = r8
            r0.f161737z = r4
            xz.x r9 = r8.f161780x
            java.lang.Object r9 = r9.m124158i(r0)
            if (r9 != r1) goto L4d
            goto L66
        L4d:
            r2 = r8
        L4e:
            xz.f0 r9 = r2.f161781y
            wz.d r5 = new wz.d
            wz.c r6 = p599wz.EnumC37705c.f161563w
            r7 = 0
            r5.<init>(r7, r6)
            r9.m124147a(r5)
            r0.f161734w = r7
            r0.f161737z = r3
            r9 = 6
            java.lang.Object r9 = m121168t(r2, r4, r7, r0, r9)
            if (r9 != r1) goto L67
        L66:
            return r1
        L67:
            l83.a0 r9 = l83.C23454a0.f92919a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p599wz.C37770y.m121171o(s83.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onCreate(owner);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C37762v(this, null, 1), 3);
    }

    /* JADX INFO: renamed from: p */
    public final void m121172p(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        InterfaceC37739n0 interfaceC37739n0 = this.f161766K;
        boolean z4 = interfaceC37739n0 instanceof C37724i0;
        C37702b c37702b = C37702b.f161559w;
        if (z4) {
            m121169l(new C37741o(error, c37702b));
            return;
        }
        if (interfaceC37739n0 instanceof C37727j0) {
            m121169l(new C37741o(new IllegalStateException("Authorization mode is not supported in web"), c37702b));
            return;
        }
        if (interfaceC37739n0 instanceof C37736m0) {
            m121169l(new C37738n(c37702b, null, null, null, 8));
            return;
        }
        if (!(interfaceC37739n0 instanceof C37730k0) && !AbstractC22676k.m65745e(interfaceC37739n0, C37733l0.f161684w)) {
            throw new NoWhenBranchMatchedException();
        }
        C1836v0 c1836v0 = this.f161778W;
        if (c1836v0 != null) {
            m121167q(this, C37766w0.f161751d, true);
            c1836v0.invoke(this.f161760E, this.f161761F);
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: r */
    public final Object m121173r(boolean z4, ConsumerSessionRefresh consumerSessionRefresh, boolean z13, AbstractC32269c abstractC32269c) {
        C37768x c37768x;
        ConsumerSessionRefresh consumerSessionRefresh2;
        boolean z14;
        boolean z15;
        C37770y c37770y;
        Object c37743o1;
        Object obj;
        boolean z16;
        C37770y c37770y2;
        AbstractC37713e1 abstractC37713e1;
        Object c37743o2;
        if (abstractC32269c instanceof C37768x) {
            c37768x = (C37768x) abstractC32269c;
            int i13 = c37768x.f161754G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37768x.f161754G = i13 - Integer.MIN_VALUE;
            } else {
                c37768x = new C37768x(this, abstractC32269c);
            }
        } else {
            c37768x = new C37768x(this, abstractC32269c);
        }
        Object objM36575A = c37768x.f161752E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37768x.f161754G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            C1844y c1844y = this.f161780x.f166758m;
            c37768x.f161755w = this;
            consumerSessionRefresh2 = consumerSessionRefresh;
            c37768x.f161756x = consumerSessionRefresh2;
            z14 = z4;
            c37768x.f161757y = z14;
            z15 = z13;
            c37768x.f161758z = z15;
            c37768x.f161754G = 1;
            objM36575A = AbstractC13091v.m36575A(c1844y, c37768x);
            if (objM36575A != enumC31071a) {
                c37770y = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            boolean z17 = c37768x.f161758z;
            z14 = c37768x.f161757y;
            ConsumerSessionRefresh consumerSessionRefresh3 = (ConsumerSessionRefresh) c37768x.f161756x;
            c37770y = c37768x.f161755w;
            AbstractC34132o.m107864I(objM36575A);
            z15 = z17;
            consumerSessionRefresh2 = consumerSessionRefresh3;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z16 = c37768x.f161757y;
            obj = (InterfaceC37752r1) c37768x.f161756x;
            c37770y2 = c37768x.f161755w;
            AbstractC34132o.m107864I(objM36575A);
        }
        c37770y = c37770y2;
        z15 = z16;
        if (z15 || !(obj instanceof C37743o1)) {
            c37770y.f161776U.m36570j(obj);
            return c23454a0;
        }
        m121167q(c37770y, ((C37743o1) obj).f161706a, true);
        return c23454a0;
        InterfaceC11427f interfaceC11427f = (InterfaceC11427f) objM36575A;
        C11433l c11433lM121170n = c37770y.m121170n();
        EnumC37721h0 enumC37721h0 = c37770y.f161764I;
        InterfaceC37739n0 interfaceC37739n0 = c37770y.f161766K;
        boolean z18 = interfaceC37739n0 instanceof C37727j0;
        boolean z19 = c37770y.f161760E.f161624X;
        boolean z24 = interfaceC37739n0 instanceof C37724i0;
        Object noLinkAccountFoundException = null;
        C37724i0 c37724i0 = z24 ? (C37724i0) interfaceC37739n0 : null;
        boolean z25 = false;
        if (c37724i0 != null && c37724i0.f161656w) {
            z25 = true;
        }
        boolean z26 = interfaceC11427f instanceof C11422a;
        if (z26 || AbstractC22676k.m65745e(interfaceC11427f, C11424c.f36644a)) {
            if (!z19 || z25 || z18) {
                C11422a c11422a = z26 ? (C11422a) interfaceC11427f : null;
                noLinkAccountFoundException = c11422a != null ? c11422a.f36642a : null;
                if (noLinkAccountFoundException == null) {
                    noLinkAccountFoundException = new NoLinkAccountFoundException();
                }
                c37770y.m121169l(new C37741o(noLinkAccountFoundException, C37702b.f161559w));
                return c23454a0;
            }
            c37743o1 = new C37743o1(C37773z0.f161799d);
        } else {
            if (!(interfaceC11427f instanceof C11423b)) {
                if (AbstractC22676k.m65745e(interfaceC11427f, C11425d.f36645a)) {
                    c37743o1 = (c11433lM121170n == null || enumC37721h0 == EnumC37721h0.f161649w) ? new C37743o1(C37707c1.f161570d) : new C37749q1(c11433lM121170n);
                } else {
                    if (!(interfaceC11427f instanceof C11426e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C11426e c11426e = (C11426e) interfaceC11427f;
                    InterfaceC11432k interfaceC11432k = c11426e.f36647b;
                    AbstractC22676k.m65747g(c11433lM121170n);
                    C38747x c38747x = c37770y.f161780x;
                    if (z24) {
                        if (c11426e.f36646a) {
                            c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, null, 14));
                        } else {
                            c37743o2 = new C37749q1(c11433lM121170n);
                            noLinkAccountFoundException = c37743o2;
                        }
                    } else if (z18) {
                        if (consumerSessionRefresh2 != null) {
                            LinkAuthIntent linkAuthIntent = consumerSessionRefresh2.getLinkAuthIntent();
                            EnumC38886l2 status = linkAuthIntent != null ? linkAuthIntent.getStatus() : null;
                            int i15 = status == null ? -1 : AbstractC37753s.f161720a[status.ordinal()];
                            if (i15 != -1) {
                                if (i15 == 1) {
                                    c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, Boolean.TRUE, 6));
                                } else if (i15 == 2) {
                                    c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, Boolean.FALSE, 6));
                                } else if (i15 == 3 || i15 == 4) {
                                    c37770y.m121169l(new C37741o(new IllegalStateException(AbstractC11266d.m30461o("Unexpected LAI status when account is verified: ", status.name())), AbstractC32098d.m99844j(c38747x)));
                                } else {
                                    if (i15 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (interfaceC11432k instanceof C11429h) {
                                        c37743o2 = new C37743o1(C37769x0.f161759d);
                                    } else {
                                        c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, null, 14));
                                    }
                                }
                                c37743o2 = null;
                            } else if (interfaceC11432k instanceof C11429h) {
                                c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, null, 14));
                                c37743o2 = null;
                            } else {
                                c37743o2 = new C37743o1(C37769x0.f161759d);
                            }
                            if (c37743o2 != null) {
                                noLinkAccountFoundException = c37743o2;
                            }
                        } else if (interfaceC11432k instanceof C11429h) {
                            c37743o2 = new C37743o1(C37769x0.f161759d);
                            noLinkAccountFoundException = c37743o2;
                        } else {
                            c37770y.m121169l(new C37738n(AbstractC32098d.m99844j(c38747x), null, null, null, 14));
                        }
                    } else {
                        if (!(interfaceC37739n0 instanceof C37730k0) && !AbstractC22676k.m65745e(interfaceC37739n0, C37733l0.f161684w) && !(interfaceC37739n0 instanceof C37736m0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (c11433lM121170n.f36656K && interfaceC37739n0.mo121146n0() == null) {
                            C38445a c38445a = c37770y.f161768M.f121514a;
                            C37718g0 configuration = (C37718g0) ((InterfaceC35521h) c38445a.f164636x).get();
                            InterfaceC37739n0 linkLaunchMode = (InterfaceC37739n0) ((InterfaceC35521h) c38445a.f164637y).get();
                            AbstractC22676k.m65750j(configuration, "configuration");
                            EnumC14023b enumC14023b = configuration.f161613M;
                            AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
                            Set setM30678a = AbstractC11435n.m30678a(configuration.f161636w, c11433lM121170n);
                            C37736m0 c37736m0 = linkLaunchMode instanceof C37736m0 ? (C37736m0) linkLaunchMode : null;
                            EnumC37763v0 enumC37763v0 = c37736m0 != null ? c37736m0.f161691x : null;
                            C26460c c26460cM119000x = AbstractC37056f.m119000x();
                            if (c11433lM121170n.f36660x != null && enumC14023b != null && setM30678a.contains("bank_account") && (enumC37763v0 == null || enumC37763v0 == EnumC37763v0.f161744x)) {
                                c26460cM119000x.add(new C29709d(enumC14023b));
                            }
                            if (setM30678a.contains("card") && (enumC37763v0 == null || enumC37763v0 == EnumC37763v0.f161743w)) {
                                c26460cM119000x.add(C29711e.f121490c);
                            }
                            C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                            abstractC37713e1 = (c26460cM118988k.mo74007a() > 1 ? C29711e.f121490c : (AbstractC29713f) AbstractC25265s.m74100H0(c26460cM118988k)) instanceof C29709d ? C37710d1.f161577d : C37771y0.f161783d;
                        } else {
                            abstractC37713e1 = C37710d1.f161577d;
                        }
                        noLinkAccountFoundException = new C37743o1(abstractC37713e1);
                    }
                    if (noLinkAccountFoundException == null) {
                        return c23454a0;
                    }
                    obj = noLinkAccountFoundException;
                }
                if ((obj instanceof C37743o1) && z14) {
                    c37768x.f161755w = c37770y;
                    c37768x.f161756x = obj;
                    c37768x.f161757y = z15;
                    c37768x.f161754G = 2;
                    if (AbstractC3034m0.m8782b(650L, c37768x) != enumC31071a) {
                        z16 = z15;
                        c37770y2 = c37770y;
                        c37770y = c37770y2;
                        z15 = z16;
                    }
                    return enumC31071a;
                }
                if (z15) {
                }
                c37770y.f161776U.m36570j(obj);
                return c23454a0;
            }
            c37743o1 = (c11433lM121170n == null || enumC37721h0 == EnumC37721h0.f161649w) ? new C37743o1(C37707c1.f161570d) : new C37749q1(c11433lM121170n);
        }
        obj = c37743o1;
        if (obj instanceof C37743o1) {
            c37768x.f161755w = c37770y;
            c37768x.f161756x = obj;
            c37768x.f161757y = z15;
            c37768x.f161754G = 2;
            if (AbstractC3034m0.m8782b(650L, c37768x) != enumC31071a) {
                z16 = z15;
                c37770y2 = c37770y;
                c37770y = c37770y2;
                z15 = z16;
            }
            return enumC31071a;
        }
        if (z15) {
        }
        c37770y.f161776U.m36570j(obj);
        return c23454a0;
    }
}
