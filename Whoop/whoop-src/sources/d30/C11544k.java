package d30;

import a33.C0352d;
import b30.C2598p3;
import bi.AbstractC3269g;
import c31.C3927k;
import c93.InterfaceC4339a;
import c93.InterfaceC4354p;
import c93.InterfaceC4356r;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.android.R;
import g80.C15566g;
import h20.C16687l;
import h20.C16735t;
import h20.C16741u;
import h20.C16761x1;
import java.util.List;
import k20.AbstractC22156u;
import l80.AbstractC23437n;
import p133f1.C13984v;
import p133f1.C13988w0;
import p181h2.C16617b;
import p479s4.AbstractC32128i;
import p635y2.InterfaceC39147y;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import r20.C30863a;
import r20.C30864b;
import r20.C30868f;
import r20.C30869g;
import r20.C30875m;
import r20.C30877o;
import r20.C30880r;
import r20.InterfaceC30881s;
import u30.C34496a;
import v00.C35459c0;
import y00.C38887l3;
import y00.C38915o4;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: d30.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11544k implements InterfaceC4354p {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37226w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f37227x;

    public /* synthetic */ C11544k(Object obj, int i13) {
        this.f37226w = i13;
        this.f37227x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c7  */
    @Override // c93.InterfaceC4354p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        InterfaceC11559r0 c11555p0;
        InterfaceC11559r0 interfaceC11559r0;
        InterfaceC11559r0 c11555p1;
        String str;
        InterfaceC41211c interfaceC41211c;
        String strM30996a;
        switch (this.f37226w) {
            case 0:
                C11564u c11564u = (C11564u) this.f37227x;
                C11556q c11556q = c11564u.f37296b;
                List displayablePaymentMethods = (List) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj3;
                C16687l c16687l = (C16687l) obj4;
                EnumC11553o0 action = (EnumC11553o0) obj5;
                String strM63411a = (String) obj6;
                AbstractC22676k.m65750j(displayablePaymentMethods, "displayablePaymentMethods");
                AbstractC22676k.m65750j(action, "action");
                InterfaceC41211c interfaceC41211c2 = null;
                if (strM63411a != null) {
                    if (strM63411a.equals(abstractC29840y != null ? AbstractC22156u.m63411a(abstractC29840y) : null)) {
                        AbstractC29835t abstractC29835t = abstractC29840y instanceof AbstractC29835t ? (AbstractC29835t) abstractC29840y : null;
                        if (abstractC29835t != null) {
                            strM30996a = C11564u.m30996a(abstractC29835t);
                        } else {
                            strM30996a = null;
                        }
                    } else {
                        strM30996a = null;
                    }
                    AbstractC29835t abstractC29835t2 = abstractC29840y instanceof AbstractC29835t ? (AbstractC29835t) abstractC29840y : null;
                    c11555p0 = new C11555p0(strM63411a, strM30996a, strM63411a.equals(abstractC29835t2 != null ? AbstractC22156u.m63411a(abstractC29835t2) : null));
                } else {
                    c11555p0 = null;
                }
                if (c11555p0 != null) {
                    interfaceC11559r0 = c11555p0;
                } else if (abstractC29840y != null) {
                    if (abstractC29840y instanceof C29838w) {
                        c11555p1 = C11557q0.f37278a;
                    } else if (abstractC29840y instanceof C29824j) {
                        c11555p1 = new C11555p0("google_pay", null, false);
                    } else if (abstractC29840y instanceof C29828m) {
                        c11555p1 = new C11555p0("link", null, false);
                    } else if (abstractC29840y instanceof C29839x) {
                        c11555p1 = new C11555p0("shop_pay", null, false);
                    } else if (abstractC29840y instanceof AbstractC29835t) {
                        AbstractC29835t abstractC29835t3 = (AbstractC29835t) abstractC29840y;
                        c11555p1 = new C11555p0(abstractC29835t3.mo91330i().f167026w, C11564u.m30996a(abstractC29835t3), c11556q.invoke(abstractC29835t3.mo91330i().f167026w).equals(C16735t.f64290b));
                    } else if (abstractC29840y instanceof C29822i) {
                        c11555p1 = new C11555p0(((C29822i) abstractC29840y).f121901x);
                    } else {
                        if (!(abstractC29840y instanceof C29818g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c11555p1 = new C11555p0(((C29818g) abstractC29840y).f121888x);
                    }
                    c11555p0 = c11555p1;
                    interfaceC11559r0 = c11555p0;
                } else {
                    interfaceC11559r0 = null;
                }
                if (strM63411a == null) {
                    AbstractC29835t abstractC29835t4 = abstractC29840y instanceof AbstractC29835t ? (AbstractC29835t) abstractC29840y : null;
                    strM63411a = abstractC29835t4 != null ? AbstractC22156u.m63411a(abstractC29835t4) : null;
                }
                if (strM63411a == null) {
                    C29838w c29838w = abstractC29840y instanceof C29838w ? (C29838w) abstractC29840y : null;
                    if (c29838w != null) {
                        C35459c0 metadata = c11564u.f37295a;
                        AbstractC22676k.m65750j(metadata, "metadata");
                        String str2 = metadata.f150966I;
                        C38915o4 c38915o4 = c29838w.f121955x;
                        EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
                        if (enumC38828f4 == null || (str = enumC38828f4.f167132w) == null) {
                            str = "";
                        }
                        InterfaceC41211c interfaceC41211cMo91324f = c29838w.mo91324f(str2, metadata.m112543x(str));
                        if (metadata.m112531H(c38915o4.f167511E)) {
                            interfaceC41211c = interfaceC41211cMo91324f;
                        }
                    }
                    return new C11561s0(displayablePaymentMethods, zBooleanValue, interfaceC11559r0, c16687l, action, interfaceC41211c);
                }
                Object objInvoke = c11556q.invoke(strM63411a);
                C16741u c16741u = objInvoke instanceof C16741u ? (C16741u) objInvoke : null;
                if (c16741u != null) {
                    interfaceC41211c2 = c16741u.f64301a;
                }
                interfaceC41211c = interfaceC41211c2;
                return new C11561s0(displayablePaymentMethods, zBooleanValue, interfaceC11559r0, c16687l, action, interfaceC41211c);
            case 1:
                final C0352d c0352d = (C0352d) this.f37227x;
                final InterfaceC30881s screen = (InterfaceC30881s) obj;
                final boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                final C35459c0 c35459c0 = (C35459c0) obj3;
                final AbstractC29840y abstractC29840y2 = (AbstractC29840y) obj4;
                final C2598p3 c2598p3 = (C2598p3) obj5;
                final boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
                AbstractC22676k.m65750j(screen, "screen");
                return AbstractC3269g.m9484M(screen.mo94927b(), new Function1() { // from class: e30.e
                    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
                    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        InterfaceC41211c interfaceC41211cM100054h;
                        boolean z4;
                        AbstractC29840y abstractC29840y3;
                        boolean z13;
                        C38915o4 c38915o5;
                        C30864b buyButtonState = (C30864b) obj7;
                        AbstractC22676k.m65750j(buyButtonState, "buyButtonState");
                        C30863a c30863a = buyButtonState.f127260b;
                        InterfaceC30881s interfaceC30881s = screen;
                        boolean z14 = interfaceC30881s instanceof C30880r;
                        boolean z15 = zBooleanValue2;
                        boolean z16 = (z14 || (interfaceC30881s instanceof C30868f) || (interfaceC30881s instanceof C30869g)) && z15;
                        C2598p3 c2598p4 = c2598p3;
                        if (c2598p4 != null) {
                            return c2598p4;
                        }
                        C0352d c0352d2 = c0352d;
                        if (c30863a != null) {
                            interfaceC41211cM100054h = c30863a.f127258a;
                        } else {
                            C35459c0 c35459c1 = c35459c0;
                            C34496a c34496aM112537b = c35459c1 != null ? c35459c1.m112537b() : null;
                            String str3 = ((C16761x1) c0352d2.f1237x).f64406I;
                            boolean z17 = (c35459c1 != null ? c35459c1.f150996w : null) instanceof C38887l3;
                            if (str3 != null) {
                                interfaceC41211cM100054h = AbstractC32128i.m100055i(str3);
                            } else if (z17) {
                                interfaceC41211cM100054h = AbstractC32128i.m100054h(R.string.stripe_paymentsheet_pay_button_label);
                                if (c34496aM112537b != null) {
                                    interfaceC41211cM100054h = c34496aM112537b.m109035b();
                                }
                            } else {
                                interfaceC41211cM100054h = AbstractC32128i.m100054h(R.string.stripe_setup_button_label);
                            }
                        }
                        InterfaceC41211c interfaceC41211c3 = interfaceC41211cM100054h;
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c0352d2.f1238y;
                        if (!z15 || (abstractC29840y3 = abstractC29840y2) == null) {
                            z4 = false;
                        } else {
                            C30877o c30877o = interfaceC30881s instanceof C30877o ? (C30877o) interfaceC30881s : null;
                            if ((c30877o != null ? c30877o.f127315x : null) instanceof C30875m) {
                                C29838w c29838w2 = abstractC29840y3 instanceof C29838w ? (C29838w) abstractC29840y3 : null;
                                if (((c29838w2 == null || (c38915o5 = c29838w2.f121955x) == null) ? null : c38915o5.f167511E) == EnumC38828f4.f167090I) {
                                    z13 = zBooleanValue3;
                                } else {
                                    z13 = true;
                                }
                            } else {
                                z13 = true;
                            }
                            if (z13) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        C2598p3 c2598p5 = new C2598p3(interfaceC41211c3, z16, interfaceC4339a, new C12608f(z16, c0352d2, 1), z4, c30863a == null);
                        if (buyButtonState.f127259a) {
                            return c2598p5;
                        }
                        return null;
                    }
                });
            case 2:
                C13988w0 c13988w0 = (C13988w0) this.f37227x;
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) obj2;
                long jM39797b = c13988w0.m39797b(interfaceC39147y, ((C16617b) obj3).f63937a);
                long jM39797b2 = c13988w0.m39797b(interfaceC39147y, ((C16617b) obj4).f63937a);
                c13988w0.m39807l(zBooleanValue4);
                return Boolean.valueOf(c13988w0.m39810o(jM39797b, jM39797b2, ((Boolean) obj5).booleanValue(), (C13984v) obj6));
            default:
                return AbstractC23437n.m67930P((InterfaceC4356r) this.f37227x, (InterfaceC25312u) obj, (C3927k) obj2, (C15566g) obj3, (Function1) obj4, (Function1) obj5, (SignUpSource) obj6);
        }
    }
}
