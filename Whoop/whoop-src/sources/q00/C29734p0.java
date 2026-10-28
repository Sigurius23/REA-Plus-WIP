package q00;

import a00.C0066a;
import a00.C0067b;
import a00.C0068c;
import a00.C0071f;
import a00.C0072g;
import a00.InterfaceC0069d;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import d00.AbstractC11435n;
import d00.C11433l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import g40.C15351f3;
import g40.C15372j0;
import h00.AbstractC16517n0;
import h20.C16689l1;
import java.util.Iterator;
import java.util.Set;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import l83.C23468n;
import la.C23548b;
import m83.AbstractC25247g0;
import m83.C25271y;
import n40.AbstractC26268h;
import n40.C26267g;
import n83.C26460c;
import p077d0.C11387o2;
import p442qy.C30765d;
import p478s3.AbstractC32098d;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p550vd.AbstractC35902e;
import p599wz.AbstractC37740n1;
import p599wz.C37699a;
import p599wz.C37704b1;
import p599wz.C37718g0;
import p599wz.C37724i0;
import p599wz.C37727j0;
import p599wz.C37730k0;
import p599wz.C37733l0;
import p599wz.C37736m0;
import p599wz.C37737m1;
import p599wz.C37741o;
import p599wz.C37754s0;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p696zy.C41210b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt2.C29529k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import x30.AbstractC37926s0;
import x30.C37884e0;
import y00.AbstractC38794c0;
import y00.C38840g6;
import y00.C38887l3;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: q00.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29734p0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C23548b f121599E;

    /* JADX INFO: renamed from: F */
    public final C30765d f121600F;

    /* JADX INFO: renamed from: G */
    public final C26267g f121601G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC37739n0 f121602H;

    /* JADX INFO: renamed from: I */
    public final C37737m1 f121603I;

    /* JADX INFO: renamed from: J */
    public final Function1 f121604J;

    /* JADX INFO: renamed from: K */
    public final Function1 f121605K;

    /* JADX INFO: renamed from: L */
    public final InterfaceC38802c8 f121606L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f121607M;

    /* JADX INFO: renamed from: N */
    public final C13081r1 f121608N;

    /* JADX INFO: renamed from: O */
    public final C15351f3 f121609O;

    /* JADX INFO: renamed from: P */
    public final C37884e0 f121610P;

    /* JADX INFO: renamed from: w */
    public final C37718g0 f121611w;

    /* JADX INFO: renamed from: x */
    public final C11433l f121612x;

    /* JADX INFO: renamed from: y */
    public final C38747x f121613y;

    /* JADX INFO: renamed from: z */
    public final C0072g f121614z;

    /* JADX WARN: Code duplicated, block: B:44:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x0115  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    public C29734p0(C37718g0 configuration, C11433l c11433l, C38747x linkAccountManager, C0072g c0072g, C23548b c23548b, C30765d logger, C26267g navigationManager, InterfaceC37739n0 linkLaunchMode, C37737m1 dismissalCoordinator, Function1 navigateAndClearStack, Function1 dismissWithResult) {
        boolean z4;
        C41210b c41210bM100054h;
        C41210b c41210b;
        Integer numValueOf;
        C41210b c41210bM100054h2;
        boolean z13;
        C13045h2 c13045h2M36593c;
        Object value;
        boolean zM124359b;
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        C26460c c26460c = (C26460c) c23548b.f93280x;
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(navigationManager, "navigationManager");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(dismissalCoordinator, "dismissalCoordinator");
        AbstractC22676k.m65750j(navigateAndClearStack, "navigateAndClearStack");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f121611w = configuration;
        this.f121612x = c11433l;
        this.f121613y = linkAccountManager;
        this.f121614z = c0072g;
        this.f121599E = c23548b;
        this.f121600F = logger;
        this.f121601G = navigationManager;
        this.f121602H = linkLaunchMode;
        this.f121603I = dismissalCoordinator;
        this.f121604J = navigateAndClearStack;
        this.f121605K = dismissWithResult;
        InterfaceC38802c8 interfaceC38802c8 = configuration.f161636w;
        this.f121606L = interfaceC38802c8;
        String str = c11433l.f36653H;
        boolean z14 = configuration.f161625Y;
        boolean z15 = configuration.f161608H;
        AbstractC22676k.m65750j(interfaceC38802c8, "<this>");
        boolean z16 = interfaceC38802c8 instanceof C38887l3;
        if (z16) {
            if (z15) {
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                zM124359b = ((C38887l3) interfaceC38802c8).m124359b("card");
            } else {
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                zM124359b = ((C38887l3) interfaceC38802c8).m124359b("link");
            }
            z4 = zM124359b;
        } else {
            if (!(interfaceC38802c8 instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = true;
        }
        String str2 = configuration.f161637x;
        String str3 = configuration.f161638y;
        InterfaceC35320a interfaceC35320a = configuration.f161611K;
        InterfaceC35322b interfaceC35322b = configuration.f161612L;
        boolean z17 = configuration.f161623W;
        boolean z18 = m91180n(linkLaunchMode) != null;
        C41210b c41210bM46676e = AbstractC16517n0.m46676e(interfaceC38802c8, linkLaunchMode);
        InterfaceC30057d interfaceC30057d = null;
        if ((linkLaunchMode instanceof C37733l0) || (linkLaunchMode instanceof C37730k0)) {
            if (z16) {
                c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_wallet_pay_another_way);
            } else {
                if (!(interfaceC38802c8 instanceof C38840g6)) {
                    throw new NoWhenBranchMatchedException();
                }
                c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_wallet_continue_another_way);
            }
        } else {
            if (linkLaunchMode instanceof C37736m0) {
                if (((C37736m0) linkLaunchMode).f161693z) {
                    c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_wallet_continue_another_way);
                } else {
                    c41210b = null;
                }
                numValueOf = (AbstractC22676k.m65745e(configuration.f161609I.get("link_show_prefer_debit_card_hint"), Boolean.TRUE) || !c26460c.contains(C29711e.f121490c)) ? null : Integer.valueOf(R.string.stripe_wallet_prefer_debit_card_hint);
                if (numValueOf != null) {
                    c41210bM100054h2 = AbstractC32128i.m100054h(numValueOf.intValue());
                } else {
                    c41210bM100054h2 = null;
                }
                if (!(linkLaunchMode instanceof C37736m0) && ((C37736m0) linkLaunchMode).f161690w == null && configuration.f161627a0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                int i13 = 0;
                c13045h2M36593c = AbstractC13091v.m36593c(new C29720i0(C25271y.f99162w, str, z14, interfaceC35320a, interfaceC35322b, null, false, z4, str2, str3, c41210bM46676e, c41210b, c26460c, z17, Boolean.valueOf(z18), null, null, new C23328a(null, false), new C23328a(null, false), C29703a.f121459a, null, c41210bM100054h2, z13, false, configuration.f161629c0, configuration.f161614N, false));
                this.f121607M = c13045h2M36593c;
                C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
                this.f121608N = c13081r1M36598h;
                this.f121609O = new C15351f3(new C15372j0(), null, null, 6);
                this.f121610P = new C37884e0((C11387o2) null, AbstractC3269g.m9484M(c13081r1M36598h, new C29529k(18)), 5);
                do {
                    value = c13045h2M36593c.getValue();
                } while (!c13045h2M36593c.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, true, null, null, null, null, null, null, null, 268435391)));
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, i13), 3);
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 1), 3);
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 2), 3);
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 3), 3);
            }
            if (!(linkLaunchMode instanceof C37724i0) && !(linkLaunchMode instanceof C37727j0)) {
                throw new NoWhenBranchMatchedException();
            }
            c41210bM100054h = AbstractC32128i.m100054h(R.string.stripe_wallet_continue_another_way);
        }
        c41210b = c41210bM100054h;
        if (AbstractC22676k.m65745e(configuration.f161609I.get("link_show_prefer_debit_card_hint"), Boolean.TRUE)) {
        }
        if (numValueOf != null) {
            c41210bM100054h2 = AbstractC32128i.m100054h(numValueOf.intValue());
        } else {
            c41210bM100054h2 = null;
        }
        if (!(linkLaunchMode instanceof C37736m0)) {
            z13 = false;
        } else {
            z13 = false;
        }
        int i14 = 0;
        c13045h2M36593c = AbstractC13091v.m36593c(new C29720i0(C25271y.f99162w, str, z14, interfaceC35320a, interfaceC35322b, null, false, z4, str2, str3, c41210bM46676e, c41210b, c26460c, z17, Boolean.valueOf(z18), null, null, new C23328a(null, false), new C23328a(null, false), C29703a.f121459a, null, c41210bM100054h2, z13, false, configuration.f161629c0, configuration.f161614N, false));
        this.f121607M = c13045h2M36593c;
        C13081r1 c13081r1M36598h2 = AbstractC13091v.m36598h(c13045h2M36593c);
        this.f121608N = c13081r1M36598h2;
        this.f121609O = new C15351f3(new C15372j0(), null, null, 6);
        this.f121610P = new C37884e0((C11387o2) null, AbstractC3269g.m9484M(c13081r1M36598h2, new C29529k(18)), 5);
        do {
            value = c13045h2M36593c.getValue();
        } while (!c13045h2M36593c.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, true, null, null, null, null, null, null, null, 268435391)));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, i14), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 1), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 2), 3);
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
    
        if (r3.m91184q((y00.AbstractC38794c0) r13, r1) == r2) goto L41;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m91177g(q00.C29734p0 r12, y00.AbstractC38794c0 r13, s83.AbstractC32269c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q00.C29734p0.m91177g(q00.p0, y00.c0, s83.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: j */
    public static final void m91178j(C29734p0 c29734p0, Throwable th3, String str) {
        Object value;
        c29734p0.f121600F.m94512b("WalletViewModel: ".concat(str), th3);
        C13045h2 c13045h2 = c29734p0.f121607M;
        do {
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, C29703a.f121459a, AbstractC37926s0.m121456H(th3), 265289727)));
    }

    /* JADX INFO: renamed from: l */
    public static final void m91179l(C29734p0 c29734p0, Throwable th3, String str) {
        Object value;
        c29734p0.f121600F.m94512b("WalletViewModel: ".concat(str), th3);
        C13045h2 c13045h2 = c29734p0.f121607M;
        do {
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, null, AbstractC37926s0.m121456H(th3), 266272703)));
    }

    /* JADX INFO: renamed from: n */
    public static String m91180n(InterfaceC37739n0 interfaceC37739n0) {
        if ((interfaceC37739n0 instanceof C37733l0) || (interfaceC37739n0 instanceof C37730k0)) {
            return null;
        }
        if (interfaceC37739n0 instanceof C37736m0) {
            AbstractC38794c0 abstractC38794c0 = ((C37736m0) interfaceC37739n0).f161690w;
            if (abstractC38794c0 != null) {
                return abstractC38794c0.getId();
            }
            return null;
        }
        if ((interfaceC37739n0 instanceof C37724i0) || (interfaceC37739n0 instanceof C37727j0)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: t */
    public static void m91181t(C29734p0 c29734p0, boolean z4) {
        C13045h2 c13045h2 = c29734p0.f121607M;
        while (true) {
            Object value = c13045h2.getValue();
            boolean z13 = z4;
            if (c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, z13, null, null, null, null, null, null, null, 268304319))) {
                return;
            } else {
                z4 = z13;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: o */
    public final Object m91182o(String str, boolean z4, AbstractC32269c abstractC32269c) {
        C29728m0 c29728m0;
        String str2;
        Object objM124156g;
        C29734p0 c29734p0;
        boolean z13;
        Object value;
        C29720i0 c29720i0;
        if (abstractC32269c instanceof C29728m0) {
            c29728m0 = (C29728m0) abstractC32269c;
            int i13 = c29728m0.f121581F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29728m0.f121581F = i13 - Integer.MIN_VALUE;
            } else {
                c29728m0 = new C29728m0(this, abstractC32269c);
            }
        } else {
            c29728m0 = new C29728m0(this, abstractC32269c);
        }
        Object obj = c29728m0.f121585z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29728m0.f121581F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Set setM30678a = AbstractC11435n.m30678a(this.f121606L, this.f121612x);
            c29728m0.f121582w = this;
            str2 = str;
            c29728m0.f121583x = str2;
            c29728m0.f121584y = z4;
            c29728m0.f121581F = 1;
            objM124156g = this.f121613y.m124156g(setM30678a, c29728m0);
            if (objM124156g == enumC31071a) {
                return enumC31071a;
            }
            c29734p0 = this;
            z13 = z4;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = c29728m0.f121584y;
            str2 = c29728m0.f121583x;
            c29734p0 = c29728m0.f121582w;
            AbstractC34132o.m107864I(obj);
            objM124156g = ((C23468n) obj).f92940w;
        }
        String str3 = str2;
        Throwable thM68037a = C23468n.m68037a(objM124156g);
        if (thM68037a == null) {
            C13045h2 c13045h2 = c29734p0.f121607M;
            do {
                value = c13045h2.getValue();
                c29720i0 = (C29720i0) value;
            } while (!c13045h2.m36569i(value, C29720i0.m91172a(c29720i0, null, str3, false, z13 ? Boolean.FALSE : c29720i0.f121550o, null, z13 ? null : c29720i0.f121552q, null, null, z13 ? C29703a.f121459a : c29720i0.f121555t, null, 267223007)));
        } else {
            c29734p0.f121600F.m94512b("WalletViewModel Fatal error: ", thM68037a);
            c29734p0.f121605K.invoke(new C37741o(thM68037a, AbstractC32098d.m99844j(c29734p0.f121613y)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public final void m91183p(boolean z4) {
        Object value;
        Object value2;
        C13045h2 c13045h2 = this.f121607M;
        if (z4) {
            do {
                value2 = c13045h2.getValue();
            } while (!c13045h2.m36569i(value2, C29720i0.m91172a((C29720i0) value2, null, null, false, null, null, null, null, null, new C29705b(null), null, 267386879)));
        } else {
            this.f121600F.m94514d("WalletViewModel: Failed to present Financial Connections");
            do {
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, C29703a.f121459a, null, 267386879)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final Object m91184q(AbstractC38794c0 abstractC38794c0, AbstractC32269c abstractC32269c) {
        C29732o0 c29732o0;
        C37754s0 c37754s0;
        String strM30677f;
        C29734p0 c29734p0;
        Object next;
        Object value;
        Object value2;
        if (abstractC32269c instanceof C29732o0) {
            c29732o0 = (C29732o0) abstractC32269c;
            int i13 = c29732o0.f121595z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29732o0.f121595z = i13 - Integer.MIN_VALUE;
            } else {
                c29732o0 = new C29732o0(this, abstractC32269c);
            }
        } else {
            c29732o0 = new C29732o0(this, abstractC32269c);
        }
        Object objM191i = c29732o0.f121593x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29732o0.f121595z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM191i);
            C16689l1 c16689l1 = this.f121611w.f161614N;
            C11433l c11433l = this.f121612x;
            boolean zM113966h0 = AbstractC35902e.m113966h0(abstractC38794c0, c16689l1, c11433l);
            C37884e0 c37884e0 = this.f121610P;
            Object[] objArr = 0;
            if (!zM113966h0 && ((C29720i0) this.f121607M.getValue()).f121549n) {
                m91181t(this, false);
                Object objInvoke = ((InterfaceC4339a) c37884e0.f162224q.f104635y).invoke();
                if (!((C23328a) objInvoke).f92492b) {
                    objInvoke = null;
                }
                C23328a c23328a = (C23328a) objInvoke;
                String str = c23328a != null ? c23328a.f92491a : null;
                C37704b1 c37704b1 = C37704b1.f161562d;
                String paymentDetailsId = abstractC38794c0.getId();
                c37704b1.getClass();
                AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
                AbstractC26268h.m77946b(this.f121601G, AbstractC37740n1.m121154c(c37704b1.f161580a, AbstractC25247g0.m73990Y(new C23465k("payment_details", paymentDetailsId), new C23465k("is_billing_update_flow", String.valueOf(true)), new C23465k("billing_update_cvc", str))));
                return c23454a0;
            }
            Object objInvoke2 = ((InterfaceC4339a) c37884e0.f162224q.f104635y).invoke();
            if (!((C23328a) objInvoke2).f92492b) {
                objInvoke2 = null;
            }
            C23328a c23328a2 = (C23328a) objInvoke2;
            String str2 = c23328a2 != null ? c23328a2.f92491a : null;
            C37699a c37699a = (C37699a) this.f121613y.f166754i.f45200w.getValue();
            if (c37699a != null) {
                Iterator it = c37699a.f161554a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C37754s0) next).f161721x.getId(), abstractC38794c0.getId()));
                c37754s0 = (C37754s0) next;
            } else {
                c37754s0 = null;
            }
            if (c37754s0 == null || (strM30677f = c37754s0.f161723z) == null) {
                strM30677f = c11433l.m30677f();
            }
            C37754s0 c37754s1 = new C37754s0(abstractC38794c0, str2, strM30677f);
            c29732o0.f121592w = this;
            c29732o0.f121595z = 1;
            C0072g c0072g = this.f121614z;
            objM191i = c0072g.m191i((InterfaceC37739n0) c0072g.f221E, new C0071f(c37754s1, c0072g, c11433l, objArr == true ? 1 : 0, 0), c37754s1, c29732o0);
            if (objM191i == enumC31071a) {
                return enumC31071a;
            }
            c29734p0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29734p0 = c29732o0.f121592w;
            AbstractC34132o.m107864I(objM191i);
        }
        InterfaceC0069d interfaceC0069d = (InterfaceC0069d) objM191i;
        if (interfaceC0069d instanceof C0066a) {
            C13045h2 c13045h2 = c29734p0.f121607M;
            do {
                value2 = c13045h2.getValue();
            } while (!c13045h2.m36569i(value2, C29720i0.m91172a((C29720i0) value2, null, null, false, null, null, null, null, null, null, null, 268435391)));
        } else {
            if (!(interfaceC0069d instanceof C0068c)) {
                if (!(interfaceC0069d instanceof C0067b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c29734p0.f121605K.invoke(((C0067b) interfaceC0069d).f206a);
                return c23454a0;
            }
            C13045h2 c13045h3 = c29734p0.f121607M;
            do {
                value = c13045h3.getValue();
            } while (!c13045h3.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, ((C0068c) interfaceC0069d).f207a, null, null, null, null, 268304319)));
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: r */
    public final void m91185r() {
        C13045h2 c13045h2;
        Object value;
        InterfaceC30057d interfaceC30057d;
        do {
            c13045h2 = this.f121607M;
            value = c13045h2.getValue();
            interfaceC30057d = null;
        } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, new C29705b(null), null, 267386879)));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C29722j0(this, interfaceC30057d, 4), 3);
    }
}
