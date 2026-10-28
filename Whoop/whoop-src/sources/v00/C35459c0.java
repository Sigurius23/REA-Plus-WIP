package v00;

import a30.C0289f0;
import a30.C0307l0;
import a30.InterfaceC0310m0;
import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.stripe.android.p056ui.core.elements.ExternalPaymentMethodSpec;
import d13.AbstractC11478a;
import f20.EnumC14023b;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16756w2;
import h20.EnumC16673i3;
import i20.C17928b;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p133f1.C13982u0;
import p319m4.AbstractC25012a;
import p537ux.C35332g;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29810c;
import s40.AbstractC32145e0;
import t00.C33254a;
import te0.AbstractC33745d;
import u00.C34378f;
import u30.C34496a;
import w00.C36635e0;
import w00.C36664t;
import w00.C36670w;
import w30.InterfaceC36786c;
import wb3.AbstractC37056f;
import y00.AbstractC38963t7;
import y00.C38797c3;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38901n;
import y00.C38939r1;
import y00.EnumC38828f4;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: v00.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35459c0 implements Parcelable {
    public static final Parcelable.Creator<C35459c0> CREATOR = new C35332g(27);

    /* JADX INFO: renamed from: E */
    public final boolean f150962E;

    /* JADX INFO: renamed from: F */
    public final List f150963F;

    /* JADX INFO: renamed from: G */
    public final List f150964G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC36786c f150965H;

    /* JADX INFO: renamed from: I */
    public final String f150966I;

    /* JADX INFO: renamed from: J */
    public final String f150967J;

    /* JADX INFO: renamed from: K */
    public final C16671i1 f150968K;

    /* JADX INFO: renamed from: L */
    public final C17928b f150969L;

    /* JADX INFO: renamed from: M */
    public final List f150970M;

    /* JADX INFO: renamed from: N */
    public final List f150971N;

    /* JADX INFO: renamed from: O */
    public final List f150972O;

    /* JADX INFO: renamed from: P */
    public final C35484p f150973P;

    /* JADX INFO: renamed from: Q */
    public final boolean f150974Q;

    /* JADX INFO: renamed from: R */
    public final C16756w2 f150975R;

    /* JADX INFO: renamed from: S */
    public final InterfaceC35471i0 f150976S;

    /* JADX INFO: renamed from: T */
    public final EnumC38922p2 f150977T;

    /* JADX INFO: renamed from: U */
    public final InterfaceC0310m0 f150978U;

    /* JADX INFO: renamed from: V */
    public final C29810c f150979V;

    /* JADX INFO: renamed from: W */
    public final EnumC14023b f150980W;

    /* JADX INFO: renamed from: X */
    public final InterfaceC35320a f150981X;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC35322b f150982Y;

    /* JADX INFO: renamed from: Z */
    public final Map f150983Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f150984a0;

    /* JADX INFO: renamed from: b0 */
    public final C38797c3 f150985b0;

    /* JADX INFO: renamed from: c0 */
    public final boolean f150986c0;

    /* JADX INFO: renamed from: d0 */
    public final C38901n f150987d0;

    /* JADX INFO: renamed from: e0 */
    public final boolean f150988e0;

    /* JADX INFO: renamed from: f0 */
    public final C16665h1 f150989f0;

    /* JADX INFO: renamed from: g0 */
    public final String f150990g0;

    /* JADX INFO: renamed from: h0 */
    public final AbstractC35455a0 f150991h0;

    /* JADX INFO: renamed from: i0 */
    public final C35480n f150992i0;

    /* JADX INFO: renamed from: j0 */
    public final C38939r1 f150993j0;

    /* JADX INFO: renamed from: k0 */
    public final boolean f150994k0;

    /* JADX INFO: renamed from: l0 */
    public final C0307l0 f150995l0;

    /* JADX INFO: renamed from: w */
    public final InterfaceC38802c8 f150996w;

    /* JADX INFO: renamed from: x */
    public final C16689l1 f150997x;

    /* JADX INFO: renamed from: y */
    public final boolean f150998y;

    /* JADX INFO: renamed from: z */
    public final boolean f150999z;

    public C35459c0(InterfaceC38802c8 stripeIntent, C16689l1 billingDetailsCollectionConfiguration, boolean z4, boolean z13, boolean z14, List list, List paymentMethodOrder, InterfaceC36786c cbcEligibility, String merchantName, String str, C16671i1 c16671i1, C17928b c17928b, List list2, List list3, List list4, C35484p c35484p, boolean z15, C16756w2 linkConfiguration, InterfaceC35471i0 paymentMethodSaveConsentBehavior, EnumC38922p2 enumC38922p2, InterfaceC0310m0 interfaceC0310m0, C29810c c29810c, EnumC14023b enumC14023b, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter, Map termsDisplay, boolean z16, C38797c3 c38797c3, boolean z17, C38901n clientAttributionMetadata, boolean z18, C16665h1 appearance, String str2, AbstractC35455a0 integrationMetadata, C35480n analyticsMetadata, C38939r1 c38939r1, boolean z19) {
        C0307l0 c0307l0;
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(termsDisplay, "termsDisplay");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(appearance, "appearance");
        AbstractC22676k.m65750j(integrationMetadata, "integrationMetadata");
        AbstractC22676k.m65750j(analyticsMetadata, "analyticsMetadata");
        this.f150996w = stripeIntent;
        this.f150997x = billingDetailsCollectionConfiguration;
        this.f150998y = z4;
        this.f150999z = z13;
        this.f150962E = z14;
        this.f150963F = list;
        this.f150964G = paymentMethodOrder;
        this.f150965H = cbcEligibility;
        this.f150966I = merchantName;
        this.f150967J = str;
        this.f150968K = c16671i1;
        this.f150969L = c17928b;
        this.f150970M = list2;
        this.f150971N = list3;
        this.f150972O = list4;
        this.f150973P = c35484p;
        this.f150974Q = z15;
        this.f150975R = linkConfiguration;
        this.f150976S = paymentMethodSaveConsentBehavior;
        this.f150977T = enumC38922p2;
        this.f150978U = interfaceC0310m0;
        this.f150979V = c29810c;
        this.f150980W = enumC14023b;
        this.f150981X = cardBrandFilter;
        this.f150982Y = cardFundingFilter;
        this.f150983Z = termsDisplay;
        this.f150984a0 = z16;
        this.f150985b0 = c38797c3;
        this.f150986c0 = z17;
        this.f150987d0 = clientAttributionMetadata;
        this.f150988e0 = z18;
        this.f150989f0 = appearance;
        this.f150990g0 = str2;
        this.f150991h0 = integrationMetadata;
        this.f150992i0 = analyticsMetadata;
        this.f150993j0 = c38939r1;
        this.f150994k0 = z19;
        if (interfaceC0310m0 instanceof C0307l0) {
            c0307l0 = (C0307l0) interfaceC0310m0;
        } else {
            if (!(interfaceC0310m0 instanceof C0289f0) && interfaceC0310m0 != null) {
                throw new NoWhenBranchMatchedException();
            }
            c0307l0 = null;
        }
        this.f150995l0 = c0307l0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m112530C(String code) {
        AbstractC22676k.m65750j(code, "code");
        return m112539h().contains(code);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m112531H(EnumC38828f4 enumC38828f4) {
        return this.f150983Z.get(enumC38828f4) != EnumC16673i3.f64122x;
    }

    /* JADX INFO: renamed from: J */
    public final ArrayList m112532J() {
        List listM112535S = m112535S();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM112535S.iterator();
        while (it.hasNext()) {
            C34378f c34378fM112534R = m112534R((String) it.next());
            if (c34378fM112534R != null) {
                arrayList.add(c34378fM112534R);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final ArrayList m112533N() {
        InterfaceC38802c8 interfaceC38802c8 = this.f150996w;
        List listMo124336p = interfaceC38802c8.mo124336p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listMo124336p.iterator();
        while (it.hasNext()) {
            InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) ((Map) AbstractC35461d0.f151001b.getValue()).get((String) it.next());
            if (interfaceC35457b0 != null) {
                arrayList.add(interfaceC35457b0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (AbstractC32145e0.m100098e((InterfaceC35457b0) obj, this)) {
                arrayList2.add(obj);
            }
        }
        List listM118958J = AbstractC37056f.m118958J(C36635e0.f156989a);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM118958J) {
            if (AbstractC32145e0.m100098e((C36635e0) obj2, this)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList2, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayListM74129g1) {
            InterfaceC35457b0 interfaceC35457b1 = (InterfaceC35457b0) obj3;
            if (!interfaceC38802c8.mo124338q0() || !interfaceC38802c8.mo124332g0().contains(interfaceC35457b1.getType().f167132w)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList4) {
            InterfaceC35457b0 interfaceC35457b2 = (InterfaceC35457b0) obj4;
            if (interfaceC35457b2.mo112527b().mo112556g(interfaceC35457b2, this.f150970M)) {
                arrayList5.add(obj4);
            }
        }
        return arrayList5;
    }

    /* JADX INFO: renamed from: R */
    public final C34378f m112534R(String code) {
        Object next;
        AbstractC22676k.m65750j(code, "code");
        if (m112530C(code)) {
            C36670w c36670wM112542s = m112542s(code);
            if (c36670wM112542s != null) {
                return c36670wM112542s.mo112560l(this);
            }
        } else if (m112544y(code)) {
            C36664t c36664tM112541k = m112541k(code);
            if (c36664tM112541k != null) {
                return c36664tM112541k.mo112560l(this);
            }
        } else {
            Iterator it = m112533N().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((InterfaceC35457b0) next).getType().f167132w, code));
            InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) next;
            if (interfaceC35457b0 != null) {
                return interfaceC35457b0.mo112527b().mo112555b(this, interfaceC35457b0, this.f150970M);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final List m112535S() {
        ArrayList arrayListM112533N = m112533N();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayListM112533N, 10));
        Iterator it = arrayListM112533N.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC35457b0) it.next()).getType().f167132w);
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(arrayList, m112539h()), m112538f());
        List<String> list = this.f150964G;
        if (list.isEmpty()) {
            return arrayListM74129g1;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(this.f150996w.mo124336p(), m112539h()), m112538f()));
        ArrayList arrayList2 = new ArrayList();
        for (String str : list) {
            if (arrayListM74097F1.contains(str)) {
                arrayList2.add(str);
                arrayListM74097F1.remove(str);
            }
        }
        arrayList2.addAll(arrayListM74097F1);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        int i13 = 0;
        for (Object obj : arrayList2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(new C23465k((String) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        return AbstractC25265s.m74152u1(arrayListM74129g1, new C13982u0(AbstractC25247g0.m74000i0(arrayList3), 5));
    }

    /* JADX INFO: renamed from: T */
    public final ArrayList m112536T() {
        ArrayList arrayListM112533N = m112533N();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM112533N) {
            if (((InterfaceC35457b0) obj).mo112529d()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC35457b0) it.next()).getType());
        }
        return this.f150962E ? AbstractC25265s.m74129g1(arrayList2, AbstractC37056f.m118958J(EnumC38828f4.f167089H)) : arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public final C34496a m112537b() {
        InterfaceC38802c8 interfaceC38802c8 = this.f150996w;
        if (!(interfaceC38802c8 instanceof C38887l3)) {
            return null;
        }
        Long l7 = ((C38887l3) interfaceC38802c8).f167393y;
        if (l7 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        long jLongValue = l7.longValue();
        String str = ((C38887l3) interfaceC38802c8).f167376K;
        if (str != null) {
            return new C34496a(jLongValue, str);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35459c0)) {
            return false;
        }
        C35459c0 c35459c0 = (C35459c0) obj;
        return AbstractC22676k.m65745e(this.f150996w, c35459c0.f150996w) && AbstractC22676k.m65745e(this.f150997x, c35459c0.f150997x) && this.f150998y == c35459c0.f150998y && this.f150999z == c35459c0.f150999z && this.f150962E == c35459c0.f150962E && AbstractC22676k.m65745e(this.f150963F, c35459c0.f150963F) && AbstractC22676k.m65745e(this.f150964G, c35459c0.f150964G) && AbstractC22676k.m65745e(this.f150965H, c35459c0.f150965H) && AbstractC22676k.m65745e(this.f150966I, c35459c0.f150966I) && AbstractC22676k.m65745e(this.f150967J, c35459c0.f150967J) && AbstractC22676k.m65745e(this.f150968K, c35459c0.f150968K) && AbstractC22676k.m65745e(this.f150969L, c35459c0.f150969L) && AbstractC22676k.m65745e(this.f150970M, c35459c0.f150970M) && AbstractC22676k.m65745e(this.f150971N, c35459c0.f150971N) && AbstractC22676k.m65745e(this.f150972O, c35459c0.f150972O) && AbstractC22676k.m65745e(this.f150973P, c35459c0.f150973P) && this.f150974Q == c35459c0.f150974Q && AbstractC22676k.m65745e(this.f150975R, c35459c0.f150975R) && AbstractC22676k.m65745e(this.f150976S, c35459c0.f150976S) && this.f150977T == c35459c0.f150977T && AbstractC22676k.m65745e(this.f150978U, c35459c0.f150978U) && AbstractC22676k.m65745e(this.f150979V, c35459c0.f150979V) && this.f150980W == c35459c0.f150980W && AbstractC22676k.m65745e(this.f150981X, c35459c0.f150981X) && AbstractC22676k.m65745e(this.f150982Y, c35459c0.f150982Y) && AbstractC22676k.m65745e(this.f150983Z, c35459c0.f150983Z) && this.f150984a0 == c35459c0.f150984a0 && AbstractC22676k.m65745e(this.f150985b0, c35459c0.f150985b0) && this.f150986c0 == c35459c0.f150986c0 && AbstractC22676k.m65745e(this.f150987d0, c35459c0.f150987d0) && this.f150988e0 == c35459c0.f150988e0 && AbstractC22676k.m65745e(this.f150989f0, c35459c0.f150989f0) && AbstractC22676k.m65745e(this.f150990g0, c35459c0.f150990g0) && AbstractC22676k.m65745e(this.f150991h0, c35459c0.f150991h0) && AbstractC22676k.m65745e(this.f150992i0, c35459c0.f150992i0) && AbstractC22676k.m65745e(this.f150993j0, c35459c0.f150993j0) && this.f150994k0 == c35459c0.f150994k0;
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m112538f() {
        List list = this.f150971N;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C35486q) it.next()).f151064w);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m112539h() {
        List list = this.f150972O;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ExternalPaymentMethodSpec) it.next()).getType());
        }
        return arrayList;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f150965H.hashCode() + AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.f150997x.hashCode() + (this.f150996w.hashCode() * 31)) * 31, 31, this.f150998y), 31, this.f150999z), 31, this.f150962E), 31, this.f150963F), 31, this.f150964G)) * 31, 31, this.f150966I);
        String str = this.f150967J;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        C16671i1 c16671i1 = this.f150968K;
        int iHashCode2 = (iHashCode + (c16671i1 == null ? 0 : c16671i1.hashCode())) * 31;
        C17928b c17928b = this.f150969L;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode2 + (c17928b == null ? 0 : c17928b.hashCode())) * 31, 31, this.f150970M), 31, this.f150971N), 31, this.f150972O);
        C35484p c35484p = this.f150973P;
        int iHashCode3 = (this.f150976S.hashCode() + ((this.f150975R.hashCode() + AbstractC2875y.m8289b((iM31983b + (c35484p == null ? 0 : c35484p.hashCode())) * 31, 31, this.f150974Q)) * 31)) * 31;
        EnumC38922p2 enumC38922p2 = this.f150977T;
        int iHashCode4 = (iHashCode3 + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31;
        InterfaceC0310m0 interfaceC0310m0 = this.f150978U;
        int iHashCode5 = (iHashCode4 + (interfaceC0310m0 == null ? 0 : interfaceC0310m0.hashCode())) * 31;
        C29810c c29810c = this.f150979V;
        int iHashCode6 = (iHashCode5 + (c29810c == null ? 0 : c29810c.hashCode())) * 31;
        EnumC14023b enumC14023b = this.f150980W;
        int iM8289b = AbstractC2875y.m8289b(AbstractC3855a.m11821e(this.f150983Z, (this.f150982Y.hashCode() + ((this.f150981X.hashCode() + ((iHashCode6 + (enumC14023b == null ? 0 : enumC14023b.hashCode())) * 31)) * 31)) * 31, 31), 31, this.f150984a0);
        C38797c3 c38797c3 = this.f150985b0;
        int iHashCode7 = (this.f150989f0.hashCode() + AbstractC2875y.m8289b((this.f150987d0.hashCode() + AbstractC2875y.m8289b((iM8289b + (c38797c3 == null ? 0 : c38797c3.hashCode())) * 31, 31, this.f150986c0)) * 31, 31, this.f150988e0)) * 31;
        String str2 = this.f150990g0;
        int iM106644c = AbstractC33745d.m106644c((this.f150991h0.hashCode() + ((iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.f150992i0.f151052w);
        C38939r1 c38939r1 = this.f150993j0;
        return Boolean.hashCode(this.f150994k0) + ((iM106644c + (c38939r1 != null ? c38939r1.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final C33254a m112540i(String code, boolean z4) {
        Object next;
        AbstractC22676k.m65750j(code, "code");
        if (m112530C(code)) {
            C36670w c36670wM112542s = m112542s(code);
            if (c36670wM112542s != null) {
                return c36670wM112542s.mo112560l(this).m108679a(null);
            }
        } else if (m112544y(code)) {
            C36664t c36664tM112541k = m112541k(code);
            if (c36664tM112541k != null) {
                return c36664tM112541k.mo112560l(this).m108679a(null);
            }
        } else {
            Iterator it = m112533N().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC22676k.m65745e(((InterfaceC35457b0) next).getType().f167132w, code));
            InterfaceC35457b0 interfaceC35457b0 = (InterfaceC35457b0) next;
            if (interfaceC35457b0 != null) {
                return interfaceC35457b0.mo112527b().mo112558i(interfaceC35457b0, this, this.f150970M, z4);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final C36664t m112541k(String str) {
        Object next;
        Iterator it = this.f150971N.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C35486q) next).f151064w, str));
        C35486q c35486q = (C35486q) next;
        if (c35486q == null) {
            return null;
        }
        return new C36664t(c35486q);
    }

    /* JADX INFO: renamed from: s */
    public final C36670w m112542s(String str) {
        Object next;
        Iterator it = this.f150972O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((ExternalPaymentMethodSpec) next).getType(), str));
        ExternalPaymentMethodSpec externalPaymentMethodSpec = (ExternalPaymentMethodSpec) next;
        if (externalPaymentMethodSpec == null) {
            return null;
        }
        return new C36670w(externalPaymentMethodSpec);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaymentMethodMetadata(stripeIntent=");
        sb4.append(this.f150996w);
        sb4.append(", billingDetailsCollectionConfiguration=");
        sb4.append(this.f150997x);
        sb4.append(", allowsDelayedPaymentMethods=");
        AbstractC38963t7.m124392v(sb4, this.f150998y, ", allowsPaymentMethodsRequiringShippingAddress=", this.f150999z, ", allowsLinkInSavedPaymentMethods=");
        AbstractC25012a.m73391x(", availableWallets=", ", paymentMethodOrder=", sb4, this.f150963F, this.f150962E);
        sb4.append(this.f150964G);
        sb4.append(", cbcEligibility=");
        sb4.append(this.f150965H);
        sb4.append(", merchantName=");
        AbstractC11266d.m30444B(sb4, this.f150966I, ", sellerBusinessName=", this.f150967J, ", defaultBillingDetails=");
        sb4.append(this.f150968K);
        sb4.append(", shippingDetails=");
        sb4.append(this.f150969L);
        sb4.append(", sharedDataSpecs=");
        AbstractC21702c.m61148s(sb4, this.f150970M, ", displayableCustomPaymentMethods=", this.f150971N, ", externalPaymentMethodSpecs=");
        sb4.append(this.f150972O);
        sb4.append(", customerMetadata=");
        sb4.append(this.f150973P);
        sb4.append(", isGooglePayReady=");
        sb4.append(this.f150974Q);
        sb4.append(", linkConfiguration=");
        sb4.append(this.f150975R);
        sb4.append(", paymentMethodSaveConsentBehavior=");
        sb4.append(this.f150976S);
        sb4.append(", linkMode=");
        sb4.append(this.f150977T);
        sb4.append(", linkStateResult=");
        sb4.append(this.f150978U);
        sb4.append(", paymentMethodIncentive=");
        sb4.append(this.f150979V);
        sb4.append(", financialConnectionsAvailability=");
        sb4.append(this.f150980W);
        sb4.append(", cardBrandFilter=");
        sb4.append(this.f150981X);
        sb4.append(", cardFundingFilter=");
        sb4.append(this.f150982Y);
        sb4.append(", termsDisplay=");
        sb4.append(this.f150983Z);
        sb4.append(", forceSetupFutureUseBehaviorAndNewMandate=");
        sb4.append(this.f150984a0);
        sb4.append(", passiveCaptchaParams=");
        sb4.append(this.f150985b0);
        sb4.append(", openCardScanAutomatically=");
        sb4.append(this.f150986c0);
        sb4.append(", clientAttributionMetadata=");
        sb4.append(this.f150987d0);
        sb4.append(", attestOnIntentConfirmation=");
        sb4.append(this.f150988e0);
        sb4.append(", appearance=");
        sb4.append(this.f150989f0);
        sb4.append(", onBehalfOf=");
        sb4.append(this.f150990g0);
        sb4.append(", integrationMetadata=");
        sb4.append(this.f150991h0);
        sb4.append(", analyticsMetadata=");
        sb4.append(this.f150992i0);
        sb4.append(", experimentsData=");
        sb4.append(this.f150993j0);
        sb4.append(", isTapToAddSupported=");
        return AbstractC18489d0.m53372m(sb4, this.f150994k0, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f150996w, i13);
        this.f150997x.writeToParcel(dest, i13);
        dest.writeInt(this.f150998y ? 1 : 0);
        dest.writeInt(this.f150999z ? 1 : 0);
        dest.writeInt(this.f150962E ? 1 : 0);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f150963F, dest);
        while (itM30863o.hasNext()) {
            dest.writeString(((EnumC35491s0) itM30863o.next()).name());
        }
        dest.writeStringList(this.f150964G);
        dest.writeParcelable(this.f150965H, i13);
        dest.writeString(this.f150966I);
        dest.writeString(this.f150967J);
        C16671i1 c16671i1 = this.f150968K;
        if (c16671i1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16671i1.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f150969L, i13);
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f150970M, dest);
        while (itM30863o2.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o2.next(), i13);
        }
        Iterator itM30863o3 = AbstractC11478a.m30863o(this.f150971N, dest);
        while (itM30863o3.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o3.next(), i13);
        }
        Iterator itM30863o4 = AbstractC11478a.m30863o(this.f150972O, dest);
        while (itM30863o4.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o4.next(), i13);
        }
        dest.writeParcelable(this.f150973P, i13);
        dest.writeInt(this.f150974Q ? 1 : 0);
        this.f150975R.writeToParcel(dest, i13);
        dest.writeParcelable(this.f150976S, i13);
        EnumC38922p2 enumC38922p2 = this.f150977T;
        if (enumC38922p2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38922p2.name());
        }
        dest.writeParcelable(this.f150978U, i13);
        dest.writeParcelable(this.f150979V, i13);
        EnumC14023b enumC14023b = this.f150980W;
        if (enumC14023b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC14023b.name());
        }
        dest.writeParcelable(this.f150981X, i13);
        dest.writeParcelable(this.f150982Y, i13);
        Map map = this.f150983Z;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i13);
            dest.writeString(((EnumC16673i3) entry.getValue()).name());
        }
        dest.writeInt(this.f150984a0 ? 1 : 0);
        dest.writeParcelable(this.f150985b0, i13);
        dest.writeInt(this.f150986c0 ? 1 : 0);
        dest.writeParcelable(this.f150987d0, i13);
        dest.writeInt(this.f150988e0 ? 1 : 0);
        this.f150989f0.writeToParcel(dest, i13);
        dest.writeString(this.f150990g0);
        dest.writeParcelable(this.f150991h0, i13);
        dest.writeParcelable(this.f150992i0, i13);
        dest.writeParcelable(this.f150993j0, i13);
        dest.writeInt(this.f150994k0 ? 1 : 0);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m112543x(String code) {
        AbstractC22676k.m65750j(code, "code");
        InterfaceC38802c8 interfaceC38802c8 = this.f150996w;
        if (interfaceC38802c8 instanceof C38887l3) {
            return ((C38887l3) interfaceC38802c8).m124359b(code);
        }
        if (interfaceC38802c8 instanceof C38840g6) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m112544y(String code) {
        AbstractC22676k.m65750j(code, "code");
        return m112538f().contains(code);
    }
}
