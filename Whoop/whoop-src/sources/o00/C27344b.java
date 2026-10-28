package o00;

import a00.C0072g;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import b30.C2540i1;
import b30.C2571m0;
import b30.C2658y;
import com.stripe.android.core.model.C5597b;
import com.stripe.android.core.model.CountryCode;
import com.whoop.android.R;
import d00.C11433l;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import h00.AbstractC16517n0;
import h20.C16621a;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16760x0;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import n40.C26264d;
import n40.C26267g;
import p322m7.C25158l0;
import p337n8.C26444a;
import p442qy.C30765d;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35330f;
import p599wz.C37699a;
import p599wz.C37701a1;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37737m1;
import p599wz.C37754s0;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;
import y00.C38774a0;
import y00.C38784b0;
import y00.C38793c;
import y00.C38809d5;
import y00.C38942r4;
import y00.C38951s4;
import y00.C38977v3;
import y00.C38991x;
import y00.C39000y;
import y00.EnumC38828f4;
import y00.EnumC38853i;

/* JADX INFO: renamed from: o00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C27344b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C37718g0 f109527E;

    /* JADX INFO: renamed from: F */
    public final C0072g f109528F;

    /* JADX INFO: renamed from: G */
    public final Function1 f109529G;

    /* JADX INFO: renamed from: H */
    public final C13045h2 f109530H;

    /* JADX INFO: renamed from: I */
    public final C13081r1 f109531I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f109532J;

    /* JADX INFO: renamed from: K */
    public final C13081r1 f109533K;

    /* JADX INFO: renamed from: w */
    public final C30765d f109534w;

    /* JADX INFO: renamed from: x */
    public final C38747x f109535x;

    /* JADX INFO: renamed from: y */
    public final C26267g f109536y;

    /* JADX INFO: renamed from: z */
    public final C37737m1 f109537z;

    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    public C27344b(C30765d logger, C38747x linkAccountManager, C26267g navigationManager, C37737m1 dismissalCoordinator, C37718g0 configuration, InterfaceC37739n0 linkLaunchMode, C0072g c0072g, Function1 dismissWithResult, String str, C37701a1 c37701a1) {
        Object objM107888l;
        AbstractC38794c0 abstractC38794c0;
        Object value;
        Object next;
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
        AbstractC22676k.m65750j(navigationManager, "navigationManager");
        AbstractC22676k.m65750j(dismissalCoordinator, "dismissalCoordinator");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(dismissWithResult, "dismissWithResult");
        this.f109534w = logger;
        this.f109535x = linkAccountManager;
        this.f109536y = navigationManager;
        this.f109537z = dismissalCoordinator;
        this.f109527E = configuration;
        this.f109528F = c0072g;
        this.f109529G = dismissWithResult;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C27343a(str, c37701a1, c37701a1 != null ? AbstractC16517n0.m46676e(configuration.f161636w, linkLaunchMode) : AbstractC32128i.m100054h(R.string.stripe_link_update_card_confirm_cta), false, null, null, null, false));
        this.f109530H = c13045h2M36593c;
        this.f109531I = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f109532J = c13045h2M36593c2;
        this.f109533K = AbstractC13091v.m36598h(c13045h2M36593c2);
        try {
            C37699a c37699a = (C37699a) linkAccountManager.f166754i.f45200w.getValue();
            if (c37699a != null) {
                Iterator it = c37699a.f161554a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C37754s0) next).f161721x.getId(), str));
                C37754s0 c37754s0 = (C37754s0) next;
                if (c37754s0 != null) {
                    abstractC38794c0 = c37754s0.f161721x;
                } else {
                    abstractC38794c0 = null;
                }
            } else {
                abstractC38794c0 = null;
            }
            if (abstractC38794c0 == null) {
                throw new IllegalArgumentException(("Payment details with id " + str + " not found").toString());
            }
            C13045h2 c13045h2 = this.f109530H;
            do {
                value = c13045h2.getValue();
            } while (!c13045h2.m36569i(value, C27343a.m82484a((C27343a) value, str, abstractC38794c0.mo124311h(), null, null, null, false, 246)));
            C13045h2 c13045h3 = this.f109532J;
            C2571m0 c2571m0M82487j = m82487j(abstractC38794c0);
            c13045h3.getClass();
            c13045h3.m36571k(null, c2571m0M82487j);
            objM107888l = C23454a0.f92919a;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a != null) {
                this.f109534w.m94512b("Failed to render payment update screen", thM68037a);
                this.f109536y.f104430a.mo36564a(C26264d.f104426a);
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C38809d5 m82486g(C27344b c27344b, C16621a c16621a) {
        c27344b.getClass();
        Integer num = c16621a.f63952a;
        Integer num2 = c16621a.f63953b;
        EnumC38853i enumC38853i = ((C27343a) c27344b.f109531I.f45200w.getValue()).f109524f;
        return C33647p.m106266h(new C38951s4(null, num, num2, null, null, null, enumC38853i != null ? new C38942r4(enumC38853i.f167260w) : null, 48), c16621a.f63955d, 12);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: j */
    public final C2571m0 m82487j(AbstractC38794c0 abstractC38794c0) {
        C2658y c2658y;
        EnumC38853i enumC38853i;
        C38793c c38793c;
        List list;
        EnumC38853i enumC38853i2;
        String strMo124310f;
        CountryCode countryCodeM16833a;
        C39000y c39000y;
        boolean z4;
        AbstractC38794c0 abstractC38794c0M124404i = abstractC38794c0;
        C13081r1 c13081r1 = this.f109531I;
        InterfaceC13037f2 interfaceC13037f2 = c13081r1.f45200w;
        InterfaceC13037f2 interfaceC13037f3 = c13081r1.f45200w;
        boolean zM82485b = ((C27343a) interfaceC13037f2.getValue()).m82485b();
        C38747x c38747x = this.f109535x;
        C37718g0 configuration = this.f109527E;
        if (zM82485b) {
            C11433l c11433l = ((C37708d) c38747x.f166746a.f166664b.f45200w.getValue()).f161571w;
            AbstractC22676k.m65750j(configuration, "configuration");
            if (c11433l != null) {
                C16689l1 c16689l1 = configuration.f161614N;
                C16671i1 c16671i1 = configuration.f161615O;
                if (c16671i1 == null || (strMo124310f = c16671i1.f64115x) == null) {
                    strMo124310f = c11433l.f36653H;
                    if (!c16689l1.m47250f()) {
                        strMo124310f = null;
                    }
                }
                if (c16671i1 == null || c16671i1.f64117z == null) {
                    c11433l.m30677f();
                    c16689l1.m47252i();
                }
                String str = c16671i1 != null ? c16671i1.f64116y : null;
                C16760x0 c16760x0 = c16671i1 != null ? c16671i1.f64114w : null;
                if (c16760x0 == null) {
                    c39000y = null;
                } else {
                    String str2 = c16760x0.f64400y;
                    String str3 = c16760x0.f64401z;
                    String str4 = c16760x0.f64398w;
                    String str5 = c16760x0.f64397F;
                    String str6 = c16760x0.f64396E;
                    String str7 = c16760x0.f64399x;
                    if (str7 != null) {
                        CountryCode.Companion.getClass();
                        countryCodeM16833a = C5597b.m16833a(str7);
                    } else {
                        countryCodeM16833a = null;
                    }
                    c39000y = new C39000y(str, str2, str3, str5, str4, str6, countryCodeM16833a);
                }
                C39000y c39000yMo124309b = abstractC38794c0M124404i.mo124309b();
                if (c39000yMo124309b == null) {
                    z4 = false;
                } else if (!AbstractC22676k.m65745e(c39000y != null ? c39000y.f167865G : null, c39000yMo124309b.f167865G)) {
                    z4 = false;
                } else if (AbstractC22676k.m65745e(c39000y != null ? c39000y.f167864F : null, c39000yMo124309b.f167864F)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (abstractC38794c0M124404i.mo124309b() != null && !z4) {
                    c39000y = abstractC38794c0M124404i.mo124309b();
                }
                if (strMo124310f == null) {
                    strMo124310f = abstractC38794c0M124404i.mo124310f();
                }
                if (abstractC38794c0M124404i instanceof C38774a0) {
                    abstractC38794c0M124404i = C38774a0.m124308i((C38774a0) abstractC38794c0M124404i, false, c39000y, strMo124310f, 4047);
                } else if (abstractC38794c0M124404i instanceof C38991x) {
                    abstractC38794c0M124404i = C38991x.m124404i((C38991x) abstractC38794c0M124404i, false, c39000y, strMo124310f, 63);
                } else if (!(abstractC38794c0M124404i instanceof C38784b0)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        boolean z13 = abstractC38794c0M124404i instanceof C38774a0;
        C38774a0 c38774a0 = z13 ? (C38774a0) abstractC38794c0M124404i : null;
        if (c38774a0 != null) {
            List<String> list2 = c38774a0.f166893L;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (String str8 : list2) {
                EnumC38853i.f167238M.getClass();
                arrayList.add(C33623c0.m106236i(str8));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((EnumC38853i) obj) != EnumC38853i.Unknown) {
                    arrayList2.add(obj);
                }
            }
            c2658y = new C2658y(C35330f.f150532w, arrayList2.size() > 1, true);
        } else {
            c2658y = null;
        }
        C16689l1 c16689l2 = configuration.f161614N;
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        C11433l c11433l2 = ((C37708d) c38747x.f166746a.f166664b.f45200w.getValue()).f161571w;
        String strM30677f = c11433l2 != null ? c11433l2.m30677f() : null;
        C38774a0 c38774a1 = z13 ? (C38774a0) abstractC38794c0M124404i : null;
        String str9 = c38774a1 != null ? c38774a1.f166897z : null;
        Integer numValueOf = c38774a1 != null ? Integer.valueOf(c38774a1.f166891J) : null;
        Integer numValueOf2 = c38774a1 != null ? Integer.valueOf(c38774a1.f166890I) : null;
        if (c38774a1 == null || (enumC38853i = c38774a1.f166892K) == null) {
            enumC38853i = EnumC38853i.Unknown;
        }
        EnumC38853i enumC38853i3 = enumC38853i;
        String str10 = (c38774a1 == null || (enumC38853i2 = c38774a1.f166892K) == null) ? null : enumC38853i2.f167260w;
        Set setM74103I1 = (c38774a1 == null || (list = c38774a1.f166893L) == null) ? null : AbstractC25265s.m74103I1(list);
        Set set = ((setM74103I1 != null ? Integer.valueOf(setM74103I1.size()) : null) == null || setM74103I1.size() <= 1) ? null : setM74103I1;
        C39000y c39000yMo124309b2 = abstractC38794c0M124404i.mo124309b();
        if (c39000yMo124309b2 != null) {
            String str11 = c39000yMo124309b2.f167867x;
            String str12 = c39000yMo124309b2.f167868y;
            String str13 = c39000yMo124309b2.f167863E;
            String str14 = c39000yMo124309b2.f167869z;
            String str15 = c39000yMo124309b2.f167864F;
            CountryCode countryCode = c39000yMo124309b2.f167865G;
            c38793c = new C38793c(str13, countryCode != null ? countryCode.getValue() : null, str11, str12, str15, str14);
        } else {
            c38793c = null;
        }
        String strMo124310f2 = abstractC38794c0M124404i.mo124310f();
        C39000y c39000yMo124309b3 = abstractC38794c0M124404i.mo124309b();
        C2540i1 c2540i1 = new C2540i1(str9, numValueOf, numValueOf2, enumC38853i3, str10, set, new C38977v3(c38793c, strMo124310f2, c39000yMo124309b3 != null ? c39000yMo124309b3.f167866w : null, strM30677f));
        EnumC16683k1 enumC16683k1 = c16689l2.f64189w;
        EnumC16677j1 enumC16677j1 = c16689l2.f64192z;
        EnumC16683k1 enumC16683k2 = c16689l2.f64191y;
        EnumC16683k1 enumC16683k3 = ((C27343a) interfaceC13037f3.getValue()).m82485b() ? c16689l2.f64190x : null;
        if (enumC16683k3 == null) {
            enumC16683k3 = EnumC16683k1.f64150x;
        }
        EnumC16683k1 enumC16683k4 = enumC16683k3;
        String str16 = abstractC38794c0M124404i.f166965x;
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        if (str16.equals("card") && enumC16677j1 == EnumC16677j1.f64132x) {
            enumC16677j1 = EnumC16677j1.f64131w;
        }
        C16689l1 c16689l3 = new C16689l1(enumC16683k1, enumC16683k4, enumC16683k2, enumC16677j1, c16689l2.f64186E, ((C27343a) interfaceC13037f3.getValue()).m82485b() ? c16689l2.m47249b() : C25235a0.f99113w);
        int i13 = 0;
        int i14 = 1;
        return new C2571m0(c2540i1, c16689l3, c2658y, !((C27343a) interfaceC13037f3.getValue()).m82485b(), c26444aM5043b, new C25158l0(i14, this, C27344b.class, "onBrandChoiceChanged", "onBrandChoiceChanged(Lcom/stripe/android/model/CardBrand;)V", i13, 27), new C25158l0(i14, this, C27344b.class, "onCardUpdateParamsChanged", "onCardUpdateParamsChanged$paymentsheet_release(Lcom/stripe/android/paymentsheet/CardUpdateParams;)V", i13, 26));
    }
}
