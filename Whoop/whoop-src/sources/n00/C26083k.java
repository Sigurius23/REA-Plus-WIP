package n00;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1601k1;
import b30.C2539i0;
import bc3.AbstractC3006f0;
import c93.InterfaceC4339a;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.whoop.android.R;
import d00.C11433l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import g40.AbstractC15380k2;
import g40.C15351f3;
import g40.C15383l0;
import g40.C15384l1;
import g40.C15453z0;
import g40.C15454z1;
import j00.EnumC21098e0;
import java.util.regex.Pattern;
import l83.C23454a0;
import l83.C23468n;
import p442qy.C30765d;
import p479s4.AbstractC32128i;
import p505ts.AbstractC34132o;
import p599wz.C37707c1;
import p599wz.C37708d;
import p599wz.C37710d1;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p599wz.C37724i0;
import p599wz.C37737m1;
import p599wz.C37738n;
import p599wz.C37771y0;
import p599wz.InterfaceC37739n0;
import p631xz.C38725h0;
import p631xz.C38727i0;
import p631xz.C38729j0;
import p631xz.C38731k0;
import p631xz.C38733l0;
import p631xz.C38747x;
import p631xz.InterfaceC38735m0;
import p665yz.C39899b;
import p665yz.C39901d;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s30.AbstractC32100b;
import s83.AbstractC32269c;
import se.AbstractC32416g;
import x30.AbstractC37926s0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: n00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26083k extends AbstractC1637w1 {

    /* JADX INFO: renamed from: Q */
    public static final long f103292Q;

    /* JADX INFO: renamed from: R */
    public static final /* synthetic */ int f103293R = 0;

    /* JADX INFO: renamed from: E */
    public final C37737m1 f103294E;

    /* JADX INFO: renamed from: F */
    public final Function1 f103295F;

    /* JADX INFO: renamed from: G */
    public final Function1 f103296G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC37739n0 f103297H;

    /* JADX INFO: renamed from: I */
    public final Function1 f103298I;

    /* JADX INFO: renamed from: J */
    public final C2539i0 f103299J;

    /* JADX INFO: renamed from: K */
    public final C15351f3 f103300K;

    /* JADX INFO: renamed from: L */
    public final C15454z1 f103301L;

    /* JADX INFO: renamed from: M */
    public final C15351f3 f103302M;

    /* JADX INFO: renamed from: N */
    public final C13045h2 f103303N;

    /* JADX INFO: renamed from: O */
    public final C13081r1 f103304O;

    /* JADX INFO: renamed from: P */
    public boolean f103305P;

    /* JADX INFO: renamed from: w */
    public final C37718g0 f103306w;

    /* JADX INFO: renamed from: x */
    public final C39899b f103307x;

    /* JADX INFO: renamed from: y */
    public final C30765d f103308y;

    /* JADX INFO: renamed from: z */
    public final C38747x f103309z;

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f103292Q = DurationKt.toDuration(1, DurationUnit.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    public C26083k(C37718g0 configuration, C39899b linkEventsReporter, C30765d logger, C38747x linkAccountManager, C1601k1 c1601k1, C37737m1 dismissalCoordinator, Function1 navigateAndClearStack, Function1 moveToWeb, InterfaceC37739n0 linkLaunchMode, Function1 dismissWithResult, C2539i0 c2539i0) {
        boolean z4;
        String str;
        String str2;
        String str3;
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkEventsReporter, "linkEventsReporter");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(dismissalCoordinator, "dismissalCoordinator");
        AbstractC22676k.m65750j(navigateAndClearStack, "navigateAndClearStack");
        AbstractC22676k.m65750j(moveToWeb, "moveToWeb");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f103306w = configuration;
        this.f103307x = linkEventsReporter;
        this.f103308y = logger;
        this.f103309z = linkAccountManager;
        this.f103294E = dismissalCoordinator;
        this.f103295F = navigateAndClearStack;
        this.f103296G = moveToWeb;
        this.f103297H = linkLaunchMode;
        this.f103298I = dismissWithResult;
        this.f103299J = c2539i0;
        Boolean bool = (Boolean) c1601k1.m5001b("use_link_configuration_customer_info");
        int i13 = 1;
        InterfaceC30057d interfaceC30057d = null;
        C37715f0 c37715f0 = bool != null ? bool.booleanValue() : true ? configuration.f161606F : null;
        Pattern pattern = C15453z0.f58040F;
        int i14 = 0;
        this.f103300K = new C15351f3(new C15453z0(false, 1), c37715f0 != null ? c37715f0.f161585x : null, null, 4);
        String str4 = c37715f0 != null ? c37715f0.f161586y : null;
        this.f103301L = C15383l0.m43593a(str4 == null ? "" : str4, 28, c37715f0 != null ? c37715f0.f161587z : null, false, false);
        this.f103302M = new C15351f3(new C15384l1(), c37715f0 != null ? c37715f0.f161584w : null, null, 4);
        EnumC26076d enumC26076d = (c37715f0 == null || (str3 = c37715f0.f161585x) == null || AbstractC39414r.m125890i0(str3)) ? EnumC26076d.f103266w : EnumC26076d.f103268y;
        if (c37715f0 != null) {
            boolean zM101134C = AbstractC32416g.m101134C(configuration);
            String str5 = c37715f0.f161585x;
            if (str5 == null || AbstractC39414r.m125890i0(str5) || (str = c37715f0.f161586y) == null || AbstractC39414r.m125890i0(str) || (zM101134C && ((str2 = c37715f0.f161584w) == null || AbstractC39414r.m125890i0(str2)))) {
                z4 = false;
            } else {
                z4 = true;
            }
        } else {
            z4 = false;
        }
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C26075c(configuration.f161637x, z4, AbstractC32416g.m101134C(configuration), configuration.f161624X, enumC26076d, false, null, null));
        this.f103303N = c13045h2M36593c;
        this.f103304O = AbstractC13091v.m36598h(c13045h2M36593c);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C26077e(this, interfaceC30057d, i14), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C26077e(this, interfaceC30057d, i13), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C26077e(this, interfaceC30057d, 2), 3);
        linkEventsReporter.m128003a(C39901d.f172297w, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r8.m77574l(r9, r10, r6) == r0) goto L22;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m77571g(n00.C26083k r8, java.lang.String r9, s83.AbstractC32269c r10) {
        /*
            boolean r0 = r10 instanceof n00.C26078f
            if (r0 == 0) goto L14
            r0 = r10
            n00.f r0 = (n00.C26078f) r0
            int r1 = r0.f103276z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f103276z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            n00.f r0 = new n00.f
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f103274x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f103276z
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L34
            if (r1 != r7) goto L2c
            p505ts.AbstractC34132o.m107864I(r10)
            goto L78
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            n00.k r8 = r6.f103273w
            p505ts.AbstractC34132o.m107864I(r10)
            l83.n r10 = (l83.C23468n) r10
            java.lang.Object r9 = r10.f92940w
            goto L5d
        L3e:
            p505ts.AbstractC34132o.m107864I(r10)
            n00.d r10 = n00.EnumC26076d.f103267x
            r8.m77577q(r10)
            xz.x r1 = r8.f103309z
            y00.c2 r3 = y00.EnumC38796c2.USER_ACTION
            wz.g0 r10 = r8.f103306w
            java.lang.String r5 = r10.m121145b()
            r6.f103273w = r8
            r6.f103276z = r2
            r4 = 1
            r2 = r9
            java.lang.Object r9 = r1.m124160k(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L5d
            goto L77
        L5d:
            n00.d r10 = n00.EnumC26076d.f103266w
            r8.m77577q(r10)
            xz.m0 r9 = s30.AbstractC32100b.m99873w(r9)
            d0.d r10 = new d0.d
            r1 = 3
            r2 = 0
            r10.<init>(r8, r2, r1)
            r6.f103273w = r2
            r6.f103276z = r7
            java.lang.Object r8 = r8.m77574l(r9, r10, r6)
            if (r8 != r0) goto L78
        L77:
            return r0
        L78:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n00.C26083k.m77571g(n00.k, java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: j */
    public static final Object m77572j(C26083k c26083k, AbstractC32269c abstractC32269c) throws Throwable {
        C26079g c26079g;
        C37737m1 c37737m1;
        Throwable th3;
        boolean z4;
        Object obj;
        C26083k c26083k2;
        InterfaceC38735m0 interfaceC38735m0M99873w;
        C15454z1 c15454z1 = c26083k.f103301L;
        if (abstractC32269c instanceof C26079g) {
            c26079g = (C26079g) abstractC32269c;
            int i13 = c26079g.f103278F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26079g.f103278F = i13 - Integer.MIN_VALUE;
            } else {
                c26079g = new C26079g(c26083k, abstractC32269c);
            }
        } else {
            c26079g = new C26079g(c26083k, abstractC32269c);
        }
        C26079g c26079g2 = c26079g;
        Object obj2 = c26079g2.f103282z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26079g2.f103278F;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c26079g2.f103281y;
            c37737m1 = c26079g2.f103280x;
            c26083k2 = c26079g2.f103279w;
            try {
                AbstractC34132o.m107864I(obj2);
                obj = ((C23468n) obj2).f92940w;
                c37737m1.f161694a = z4;
                interfaceC38735m0M99873w = AbstractC32100b.m99873w(obj);
                if (interfaceC38735m0M99873w instanceof C38727i0) {
                    c26083k2.f103296G.invoke(((C38727i0) interfaceC38735m0M99873w).f166680a);
                } else if (interfaceC38735m0M99873w instanceof C38729j0) {
                    Throwable th4 = ((C38729j0) interfaceC38735m0M99873w).f166684a;
                    m77573p(c26083k2, th4);
                    c26083k2.f103307x.m128007e(th4);
                } else if (interfaceC38735m0M99873w instanceof C38733l0) {
                    c26083k2.m77575n(((C38733l0) interfaceC38735m0M99873w).f166696a);
                    c26083k2.f103307x.m128006d();
                } else if (interfaceC38735m0M99873w.equals(C38731k0.f166690a)) {
                    m77573p(c26083k2, new NoLinkAccountFoundException());
                    c26083k2.f103307x.m128007e(new NoLinkAccountFoundException());
                } else {
                    if (interfaceC38735m0M99873w instanceof C38725h0) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c26083k2.getClass();
                    c26083k2.m77577q(EnumC26076d.f103266w);
                    c26083k2.m77576o(((C38725h0) interfaceC38735m0M99873w).f166675a, AbstractC32128i.m100054h(R.string.stripe_signup_deactivated_account_message));
                }
                return C23454a0.f92919a;
            } catch (Throwable th5) {
                th3 = th5;
                c37737m1.f161694a = z4;
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj2);
        C37737m1 c37737m2 = c26083k.f103294E;
        boolean z13 = c37737m2.f161694a;
        c37737m2.f161694a = false;
        try {
            C38747x c38747x = c26083k.f103309z;
            String str = (String) c26083k.f103300K.f57715n.f45200w.getValue();
            String phoneNumber = (String) c15454z1.f58051f.f45200w.getValue();
            AbstractC22676k.m65750j(phoneNumber, "phoneNumber");
            String strMo43579e = ((AbstractC15380k2) ((InterfaceC4339a) c15454z1.f58056k.f104635y).invoke()).mo43579e(phoneNumber);
            String strM43614u = c15454z1.m43614u();
            String str2 = (String) c26083k.f103302M.f57715n.f45200w.getValue();
            EnumC21098e0 enumC21098e0 = EnumC21098e0.f80006z;
            c26079g2.f103279w = c26083k;
            c26079g2.f103280x = c37737m2;
            c26079g2.f103281y = z13;
            c26079g2.f103278F = 1;
            Object objM124169u = c38747x.m124169u(str, strMo43579e, strM43614u, "PHONE_NUMBER", str2, enumC21098e0, c26079g2);
            if (objM124169u == enumC31071a) {
                return enumC31071a;
            }
            c37737m1 = c37737m2;
            obj = objM124169u;
            c26083k2 = c26083k;
            z4 = z13;
            c37737m1.f161694a = z4;
            interfaceC38735m0M99873w = AbstractC32100b.m99873w(obj);
            if (interfaceC38735m0M99873w instanceof C38727i0) {
                c26083k2.f103296G.invoke(((C38727i0) interfaceC38735m0M99873w).f166680a);
            } else if (interfaceC38735m0M99873w instanceof C38729j0) {
                Throwable th6 = ((C38729j0) interfaceC38735m0M99873w).f166684a;
                m77573p(c26083k2, th6);
                c26083k2.f103307x.m128007e(th6);
            } else if (interfaceC38735m0M99873w instanceof C38733l0) {
                c26083k2.m77575n(((C38733l0) interfaceC38735m0M99873w).f166696a);
                c26083k2.f103307x.m128006d();
            } else if (interfaceC38735m0M99873w.equals(C38731k0.f166690a)) {
                m77573p(c26083k2, new NoLinkAccountFoundException());
                c26083k2.f103307x.m128007e(new NoLinkAccountFoundException());
            } else {
                if (interfaceC38735m0M99873w instanceof C38725h0) {
                    throw new NoWhenBranchMatchedException();
                }
                c26083k2.getClass();
                c26083k2.m77577q(EnumC26076d.f103266w);
                c26083k2.m77576o(((C38725h0) interfaceC38735m0M99873w).f166675a, AbstractC32128i.m100054h(R.string.stripe_signup_deactivated_account_message));
            }
            return C23454a0.f92919a;
        } catch (Throwable th7) {
            c37737m1 = c37737m2;
            th3 = th7;
            z4 = z13;
            c37737m1.f161694a = z4;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m77573p(C26083k c26083k, Throwable th3) {
        c26083k.m77576o(th3, th3 != null ? AbstractC37926s0.m121456H(th3) : null);
    }

    /* JADX INFO: renamed from: l */
    public final Object m77574l(InterfaceC38735m0 interfaceC38735m0, Function1 function1, AbstractC32269c abstractC32269c) {
        boolean z4 = interfaceC38735m0 instanceof C38727i0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (z4) {
            this.f103296G.invoke(((C38727i0) interfaceC38735m0).f166680a);
            return c23454a0;
        }
        if (interfaceC38735m0 instanceof C38729j0) {
            m77577q(EnumC26076d.f103268y);
            m77573p(this, ((C38729j0) interfaceC38735m0).f166684a);
            return c23454a0;
        }
        if (interfaceC38735m0 instanceof C38733l0) {
            m77575n(((C38733l0) interfaceC38735m0).f166696a);
            this.f103307x.m128006d();
            return c23454a0;
        }
        if (interfaceC38735m0.equals(C38731k0.f166690a)) {
            Object objInvoke = function1.invoke(abstractC32269c);
            return objInvoke == EnumC31071a.f128113w ? objInvoke : c23454a0;
        }
        if (!(interfaceC38735m0 instanceof C38725h0)) {
            throw new NoWhenBranchMatchedException();
        }
        m77577q(EnumC26076d.f103266w);
        m77576o(((C38725h0) interfaceC38735m0).f166675a, AbstractC32128i.m100054h(R.string.stripe_signup_deactivated_account_message));
        return c23454a0;
    }

    /* JADX INFO: renamed from: n */
    public final void m77575n(C11433l c11433l) {
        Object obj;
        if (c11433l.f36656K) {
            obj = C37771y0.f161783d;
        } else {
            obj = c11433l.f36655J ? C37710d1.f161577d : C37707c1.f161570d;
        }
        if ((this.f103297H instanceof C37724i0) && !AbstractC22676k.m65745e(obj, C37707c1.f161570d)) {
            this.f103298I.invoke(new C37738n(new C37708d(c11433l, null), null, null, null, 12));
        } else if (AbstractC22676k.m65745e(obj, C37707c1.f161570d)) {
            this.f103299J.invoke();
        } else {
            this.f103295F.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m77576o(Throwable th3, InterfaceC41211c interfaceC41211c) {
        if (th3 != null) {
            this.f103308y.m94512b("SignUpViewModel Error: ", th3);
        }
        while (true) {
            C13045h2 c13045h2 = this.f103303N;
            Object value = c13045h2.getValue();
            C26075c it = (C26075c) value;
            AbstractC22676k.m65750j(it, "it");
            InterfaceC41211c interfaceC41211c2 = interfaceC41211c;
            if (c13045h2.m36569i(value, C26075c.m77570a(it, false, null, false, interfaceC41211c2, null, 191))) {
                return;
            } else {
                interfaceC41211c = interfaceC41211c2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m77577q(EnumC26076d enumC26076d) {
        while (true) {
            C13045h2 c13045h2 = this.f103303N;
            Object value = c13045h2.getValue();
            C26075c old = (C26075c) value;
            AbstractC22676k.m65750j(old, "old");
            EnumC26076d enumC26076d2 = enumC26076d;
            if (c13045h2.m36569i(value, C26075c.m77570a(old, false, enumC26076d2, false, null, null, 239))) {
                return;
            } else {
                enumC26076d = enumC26076d2;
            }
        }
    }
}
