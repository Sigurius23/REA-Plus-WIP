package m63;

import a00.C0072g;
import ab3.C0714f;
import ab3.C0716h;
import ab3.C0717i;
import ab3.C0726r;
import ab3.C0728t;
import ad3.AbstractC0757c;
import ag.C0855e;
import ag.EnumC0856f;
import android.content.Context;
import android.util.Base64;
import b30.C2570m;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bi.AbstractC3269g;
import com.google.crypto.tink.internal.C5099k0;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationErrorCode;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.maps.MapboxLogger;
import com.stripe.android.core.model.C5597b;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.uicore.elements.AddressFieldConfiguration;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13054k;
import ec3.C13105z1;
import eg.C13166o;
import g40.C15383l0;
import g40.C15388m0;
import g40.C15393n0;
import g40.C15432v;
import g40.InterfaceC15398o0;
import g40.InterfaceC15403p0;
import gf.C15760a;
import gm.C15990r;
import hc3.AbstractC17182o;
import hc3.C17171d;
import hm.C17418e;
import hn.C17508p;
import hu1.C17650g;
import i20.AbstractC17960l1;
import i20.C17954j1;
import i20.C17973r;
import i20.C17975s;
import i63.C18163d;
import im.InterfaceC18653b;
import io.sentry.android.replay.video.C20245d;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import je.C21615a;
import k83.InterfaceC22297a;
import kc3.C22365e;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n20.C26175j;
import n53.C26318e;
import n93.AbstractC26487a;
import ng3.C26701n;
import ng3.C26702o;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import om.InterfaceC28023b;
import p076d.AbstractC11267a;
import p076d.AbstractC11272b1;
import p076d.AbstractC11290h1;
import p076d.AbstractC11322x0;
import p076d.C11277d0;
import p076d.C11294j0;
import p076d.InterfaceC11307q;
import p091dg.C12002a;
import p127ev.C13668i;
import p127ev.EnumC13677r;
import p163g1.C15160u4;
import p344nm.InterfaceC26821c;
import p344nm.InterfaceC26822d;
import p470rv.C31821a;
import p470rv.C31830j;
import p479s4.AbstractC32128i;
import p522uf.AbstractC34881i;
import p522uf.C34895v;
import p522uf.InterfaceC34879h;
import p522uf.InterfaceC34885l;
import p522uf.InterfaceC34888o;
import p530up.AbstractC35148d;
import p565vy.AbstractC36561a;
import p582wg.AbstractC37250c;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import ro.C31624i;
import s63.C32236a;
import s93.C32301c;
import sb3.AbstractC32350a;
import u93.C34673e0;
import va3.C35845c;
import va3.C35850h;
import vg.C35973t;
import wb3.AbstractC37056f;
import ws.C37596r;
import ws.C37597s;
import ws.C37603y;
import ws.C37604z;

/* JADX INFO: renamed from: m63.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C25126d implements InterfaceC15403p0, InterfaceC18653b, InterfaceC27771n {

    /* JADX INFO: renamed from: E */
    public Object f98479E;

    /* JADX INFO: renamed from: F */
    public Object f98480F;

    /* JADX INFO: renamed from: G */
    public Object f98481G;

    /* JADX INFO: renamed from: H */
    public Object f98482H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98483w;

    /* JADX INFO: renamed from: x */
    public Object f98484x;

    /* JADX INFO: renamed from: y */
    public Object f98485y;

    /* JADX INFO: renamed from: z */
    public Object f98486z;

    public /* synthetic */ C25126d(int i13) {
        this.f98483w = i13;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: H */
    public boolean mo845H() {
        return false;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: M */
    public ArrayList mo849M() {
        return (ArrayList) this.f98482H;
    }

    /* JADX INFO: renamed from: a */
    public C37596r m73679a() throws GeneralSecurityException {
        C31624i c31624i;
        C31624i c31624i2;
        C37597s c37597s = (C37597s) this.f98484x;
        if (c37597s == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C31624i c31624i3 = (C31624i) this.f98486z;
        if (c31624i3 == null || (c31624i = (C31624i) this.f98479E) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C31624i c31624i4 = (C31624i) this.f98485y;
        if (c31624i4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C31624i c31624i5 = (C31624i) this.f98480F;
        if (c31624i5 == null || (c31624i2 = (C31624i) this.f98481G) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C31624i c31624i6 = (C31624i) this.f98482H;
        if (c31624i6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c37597s.f160792b.f160782b;
        BigInteger bigInteger2 = c37597s.f160793c;
        BigInteger bigInteger3 = (BigInteger) c31624i3.f130665x;
        BigInteger bigInteger4 = (BigInteger) c31624i.f130665x;
        BigInteger bigInteger5 = (BigInteger) c31624i4.f130665x;
        BigInteger bigInteger6 = (BigInteger) c31624i5.f130665x;
        BigInteger bigInteger7 = (BigInteger) c31624i2.f130665x;
        BigInteger bigInteger8 = (BigInteger) c31624i6.f130665x;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new C37596r((C37597s) this.f98484x, (C31624i) this.f98486z, (C31624i) this.f98479E, (C31624i) this.f98485y, (C31624i) this.f98480F, (C31624i) this.f98481G, (C31624i) this.f98482H);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: b */
    public String mo853b(String rawValue) {
        ArrayList arrayList = (ArrayList) this.f98482H;
        AbstractC22676k.m65750j(rawValue, "rawValue");
        Set set = AbstractC36561a.f156562a;
        CountryCode.Companion.getClass();
        CountryCode countryCodeM16833a = C5597b.m16833a(rawValue);
        Locale locale = Locale.getDefault();
        AbstractC22676k.m65749i(locale, "getDefault(...)");
        Country countryM117288a = AbstractC36561a.m117288a(countryCodeM16833a, locale);
        if (countryM117288a != null) {
            int iIndexOf = ((ArrayList) this.f98480F).indexOf(countryM117288a);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            if (iIndexOf == -1) {
                numValueOf = null;
            }
            String str = numValueOf != null ? (String) arrayList.get(numValueOf.intValue()) : null;
            if (str != null) {
                return str;
            }
        }
        String str2 = (String) AbstractC25265s.m74100H0(arrayList);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: c */
    public C37603y m73680c() throws GeneralSecurityException {
        C31624i c31624i;
        C31624i c31624i2;
        C37604z c37604z = (C37604z) this.f98484x;
        if (c37604z == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        C31624i c31624i3 = (C31624i) this.f98486z;
        if (c31624i3 == null || (c31624i = (C31624i) this.f98479E) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        C31624i c31624i4 = (C31624i) this.f98485y;
        if (c31624i4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        C31624i c31624i5 = (C31624i) this.f98480F;
        if (c31624i5 == null || (c31624i2 = (C31624i) this.f98481G) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        C31624i c31624i6 = (C31624i) this.f98482H;
        if (c31624i6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = c37604z.f160833b.f160821b;
        BigInteger bigInteger2 = c37604z.f160834c;
        BigInteger bigInteger3 = (BigInteger) c31624i3.f130665x;
        BigInteger bigInteger4 = (BigInteger) c31624i.f130665x;
        BigInteger bigInteger5 = (BigInteger) c31624i4.f130665x;
        BigInteger bigInteger6 = (BigInteger) c31624i5.f130665x;
        BigInteger bigInteger7 = (BigInteger) c31624i2.f130665x;
        BigInteger bigInteger8 = (BigInteger) c31624i6.f130665x;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new C37603y((C37604z) this.f98484x, (C31624i) this.f98486z, (C31624i) this.f98479E, (C31624i) this.f98485y, (C31624i) this.f98480F, (C31624i) this.f98481G, (C31624i) this.f98482H);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    /* JADX INFO: renamed from: d */
    public C12002a m73681d() {
        return (C12002a) this.f98485y;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: e */
    public String mo855e(int i13) {
        String str;
        Country country = (Country) AbstractC25265s.m74102I0(i13, (ArrayList) this.f98480F);
        return (country == null || (str = (String) ((Function1) this.f98486z).invoke(country)) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList m73682f() {
        return (ArrayList) this.f98482H;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: g */
    public InterfaceC15398o0 mo857g() {
        return (InterfaceC15398o0) this.f98485y;
    }

    @Override // k83.InterfaceC22297a
    public Object get() {
        Context context = (Context) ((InterfaceC22297a) this.f98484x).get();
        C17418e c17418e = (C17418e) ((InterfaceC22297a) this.f98485y).get();
        InterfaceC26822d interfaceC26822d = (InterfaceC26822d) ((InterfaceC22297a) this.f98486z).get();
        C15990r c15990r = (C15990r) ((C15990r) this.f98479E).get();
        Executor executor = (Executor) ((InterfaceC22297a) this.f98480F).get();
        InterfaceC28023b interfaceC28023b = (InterfaceC28023b) ((InterfaceC22297a) this.f98481G).get();
        C26701n c26701n = new C26701n(14);
        C26702o c26702o = new C26702o(13, false);
        InterfaceC26821c interfaceC26821c = (InterfaceC26821c) ((InterfaceC22297a) this.f98482H).get();
        C13668i c13668i = new C13668i();
        c13668i.f48454a = context;
        c13668i.f48455b = c17418e;
        c13668i.f48456c = interfaceC26822d;
        c13668i.f48457d = c15990r;
        c13668i.f48458e = executor;
        c13668i.f48459f = interfaceC28023b;
        c13668i.f48460g = c26701n;
        c13668i.f48461h = c26702o;
        c13668i.f48462i = interfaceC26821c;
        return c13668i;
    }

    @Override // g40.InterfaceC15403p0
    public InterfaceC41211c getLabel() {
        return (C41210b) this.f98479E;
    }

    /* JADX INFO: renamed from: h */
    public void m73683h(C21615a c21615a) {
        C20245d c20245d = (C20245d) this.f98484x;
        c21615a.f82955b = Integer.valueOf(((C13166o) c20245d.f76051g).mo36845f().f2964b);
        ((C0855e) c20245d.f76047c).m2064c(c21615a, EnumC0856f.f3062x);
    }

    /* JADX INFO: renamed from: i */
    public void m73684i(InterfaceC34888o middleware) {
        AbstractC22676k.m65750j(middleware, "middleware");
        middleware.mo9061c(this);
    }

    /* JADX INFO: renamed from: j */
    public void m73685j(C31624i c31624i) {
        switch (this.f98483w) {
            case 11:
                this.f98482H = c31624i;
                break;
            default:
                this.f98482H = c31624i;
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m73686k(C31624i c31624i, C31624i c31624i2) {
        switch (this.f98483w) {
            case 11:
                this.f98480F = c31624i;
                this.f98481G = c31624i2;
                break;
            default:
                this.f98480F = c31624i;
                this.f98481G = c31624i2;
                break;
        }
    }

    @Override // oa3.InterfaceC27771n, oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public void mo195l() {
        C5099k0 c5099k0 = (C5099k0) this.f98486z;
        C35845c c35845c = (C35845c) this.f98480F;
        HashMap arguments = (HashMap) this.f98485y;
        AbstractC22676k.m65750j(arguments, "arguments");
        boolean zM15986D = false;
        if (c35845c.equals(AbstractC26487a.f105200b)) {
            Object obj = arguments.get(C35850h.m113814e("value"));
            C0728t c0728t = obj instanceof C0728t ? (C0728t) obj : null;
            if (c0728t != null) {
                Object obj2 = c0728t.f2696a;
                C0726r c0726r = obj2 instanceof C0726r ? (C0726r) obj2 : null;
                if (c0726r != null) {
                    zM15986D = c5099k0.m15986D(c0726r.f2705a.f2694a);
                }
            }
        }
        if (zM15986D || c5099k0.m15986D(c35845c)) {
            return;
        }
        ((List) this.f98481G).add(new C32301c(((InterfaceC31117e) this.f98479E).mo60594i(), arguments, (InterfaceC31155s0) this.f98482H));
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: m */
    public InterfaceC27772o mo196m(C35850h c35850h) {
        return new C0072g((C5099k0) this.f98484x, c35850h, this);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: n */
    public void mo197n(C35850h c35850h, C0714f c0714f) {
        ((HashMap) this.f98485y).put(c35850h, new C0728t(new C0726r(c0714f)));
    }

    /* JADX INFO: renamed from: o */
    public void m73687o(C31624i c31624i, C31624i c31624i2) {
        switch (this.f98483w) {
            case 11:
                this.f98486z = c31624i;
                this.f98479E = c31624i2;
                break;
            default:
                this.f98486z = c31624i;
                this.f98479E = c31624i2;
                break;
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: p */
    public void mo198p(C35850h c35850h, Object obj) {
        Object objM1780c = C0716h.m1780c(obj, (C34673e0) ((C5099k0) this.f98484x).f21441z);
        if (objM1780c == null) {
            objM1780c = AbstractC35148d.m111188s("Unsupported annotation argument: " + c35850h);
        }
        ((HashMap) this.f98485y).put(c35850h, objM1780c);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: q */
    public void mo199q(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
        ((HashMap) this.f98485y).put(c35850h, new C0717i(c35845c, c35850h2));
    }

    /* JADX INFO: renamed from: r */
    public void m73688r(C31624i c31624i) {
        switch (this.f98483w) {
            case 11:
                this.f98485y = c31624i;
                break;
            default:
                this.f98485y = c31624i;
                break;
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: s */
    public InterfaceC27771n mo201s(C35845c c35845c, C35850h c35850h) {
        ArrayList arrayList = new ArrayList();
        return new C2570m(((C5099k0) this.f98484x).m15988F(c35845c, InterfaceC31155s0.f128370q, arrayList), this, c35850h, arrayList);
    }

    /* JADX INFO: renamed from: t */
    public void m73689t(C37597s c37597s) {
        this.f98484x = c37597s;
    }

    /* JADX INFO: renamed from: u */
    public void m73690u(C37604z c37604z) {
        this.f98484x = c37604z;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: w */
    public List mo865w() {
        return (ArrayList) this.f98481G;
    }

    public /* synthetic */ C25126d(int i13, boolean z4) {
        this.f98483w = i13;
        this.f98484x = null;
        this.f98485y = null;
        this.f98486z = null;
        this.f98479E = null;
        this.f98480F = null;
        this.f98481G = null;
        this.f98482H = null;
    }

    public C25126d(AbstractC11290h1 abstractC11290h1) {
        this.f98483w = 4;
        this.f98484x = new ArrayList();
        for (int i13 = 0; i13 < abstractC11290h1.mo30507o(); i13++) {
            try {
                InterfaceC11307q interfaceC11307qMo30505l = abstractC11290h1.mo30505l(i13);
                if (interfaceC11307qMo30505l instanceof C11277d0) {
                    C11277d0 c11277d0 = (C11277d0) interfaceC11307qMo30505l;
                    InterfaceC11307q interfaceC11307q = c11277d0.f36196d;
                    AbstractC11272b1 abstractC11272b1Mo30482d = interfaceC11307q instanceof AbstractC11272b1 ? (AbstractC11272b1) interfaceC11307q : interfaceC11307q.mo30482d();
                    int i14 = c11277d0.f36195c;
                    ((ArrayList) this.f98484x).add(Integer.valueOf(i14));
                    if (i14 == 701) {
                        this.f98480F = ((C11294j0) abstractC11272b1Mo30482d).m30510m();
                    } else if (i14 != 709) {
                        switch (i14) {
                            case 704:
                                this.f98485y = new C0072g((AbstractC11290h1) abstractC11272b1Mo30482d);
                                break;
                            case 705:
                                this.f98481G = ((C11294j0) abstractC11272b1Mo30482d).m30510m();
                                break;
                            case 706:
                                this.f98482H = ((C11294j0) abstractC11272b1Mo30482d).m30510m();
                                break;
                        }
                    } else {
                        AbstractC11290h1 abstractC11290h1M30504m = AbstractC11290h1.m30504m(AbstractC11322x0.m30532l(abstractC11272b1Mo30482d).f36277a);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        try {
                            AbstractC11267a abstractC11267a = (AbstractC11267a) abstractC11290h1M30504m.mo30505l(0);
                            int i15 = 0;
                            while (true) {
                                InterfaceC11307q[] interfaceC11307qArr = abstractC11267a.f36181a;
                                if (i15 < interfaceC11307qArr.length) {
                                    AbstractC11290h1 abstractC11290h2 = (AbstractC11290h1) interfaceC11307qArr[i15];
                                    AbstractC11322x0 abstractC11322x0M30532l = AbstractC11322x0.m30532l(abstractC11290h2.mo30505l(0));
                                    arrayList.add(AbstractC37250c.m119390b(abstractC11322x0M30532l.f36277a));
                                    i15++;
                                }
                                try {
                                    AbstractC11267a abstractC11267a2 = (AbstractC11267a) abstractC11290h1M30504m.mo30505l(1);
                                    int i16 = 0;
                                    while (true) {
                                        InterfaceC11307q[] interfaceC11307qArr2 = abstractC11267a2.f36181a;
                                        if (i16 < interfaceC11307qArr2.length) {
                                            arrayList2.add(Base64.encodeToString(AbstractC11322x0.m30532l(interfaceC11307qArr2[i16]).f36277a, 0).trim());
                                            i16++;
                                        }
                                        this.f98486z = arrayList;
                                        this.f98479E = arrayList2;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            } catch (Exception unused3) {
            }
        }
    }

    public C25126d(Map map, C17975s c17975s, C17954j1 c17954j1) {
        Set set;
        C17973r c17973r;
        this.f98483w = 3;
        this.f98484x = map;
        this.f98485y = c17954j1;
        IdentifierSpec.Companion.getClass();
        IdentifierSpec identifierSpecM16892a = C5705a.m16892a("address");
        if (c17975s != null) {
            set = c17975s.f69806y;
        } else {
            set = AbstractC36561a.f156562a;
        }
        C15432v c15432v = new C15432v(identifierSpecM16892a, map, set, null, AbstractC17960l1.m51586m((c17975s == null || (c17973r = c17975s.f69799E) == null) ? null : c17973r.f69796w), AddressFieldConfiguration.REQUIRED, null, null, null, new C17508p(this, 1), false, 1096);
        this.f98486z = c15432v;
        this.f98479E = AbstractC37056f.m118958J(C15383l0.m43594b(c15432v, null));
        C26318e c26318eM9484M = AbstractC3269g.m9484M(c15432v.m43608k().f57954p, new C17650g(12));
        this.f98480F = c26318eM9484M;
        this.f98481G = AbstractC3269g.m9484M(c26318eM9484M, new C17650g(13));
        this.f98482H = AbstractC3269g.m9484M(c15432v.m43608k().f57955q, new C17650g(14));
    }

    public C25126d(Set onlyShowCountryCodes, C15160u4 c15160u4, C15160u4 c15160u5, int i13) {
        Object c15393n0;
        this.f98483w = 2;
        Locale locale = Locale.getDefault();
        if ((i13 & 4) != 0) {
            c15393n0 = new C15393n0(true);
        } else {
            c15393n0 = C15388m0.f57831a;
        }
        c15160u4 = (i13 & 16) != 0 ? new C15160u4(20) : c15160u4;
        c15160u5 = (i13 & 32) != 0 ? new C15160u4(21) : c15160u5;
        AbstractC22676k.m65750j(onlyShowCountryCodes, "onlyShowCountryCodes");
        AbstractC22676k.m65750j(locale, "locale");
        this.f98484x = onlyShowCountryCodes;
        this.f98485y = c15393n0;
        this.f98486z = c15160u4;
        this.f98479E = AbstractC32128i.m100064s(R.string.stripe_address_label_country_or_region, new Object[0], C25271y.f99162w);
        Set set = AbstractC36561a.f156562a;
        List listM117289b = AbstractC36561a.m117289b(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM117289b) {
            Country country = (Country) obj;
            if (((Set) this.f98484x).isEmpty() || ((Set) this.f98484x).contains(country.getCode().getValue())) {
                arrayList.add(obj);
            }
        }
        this.f98480F = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Country) it.next()).getCode().getValue());
        }
        this.f98481G = arrayList2;
        ArrayList arrayList3 = (ArrayList) this.f98480F;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(c15160u5.invoke(it3.next()));
        }
        this.f98482H = arrayList4;
    }

    public C25126d(C20245d execution, C12002a context, InterfaceC34885l serializer, InterfaceC34879h deserializer, C34895v c34895v, C2570m telemetry) {
        this.f98483w = 10;
        AbstractC22676k.m65750j(execution, "execution");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(serializer, "serializer");
        AbstractC22676k.m65750j(deserializer, "deserializer");
        AbstractC22676k.m65750j(telemetry, "telemetry");
        this.f98484x = execution;
        this.f98485y = context;
        this.f98486z = serializer;
        this.f98479E = deserializer;
        this.f98480F = c34895v;
        this.f98481G = telemetry;
        C15760a c15760a = AbstractC34881i.f146917e;
        char[] cArr = C35973t.f153162d;
        context.mo33083c(c15760a, AbstractC32350a.m100709q().f153170c);
        this.f98482H = new ArrayList();
    }

    public C25126d(AbstractC0757c abstractC0757c, Object obj, C32236a c32236a, Charset charset, C18163d contentType) {
        this.f98483w = 0;
        AbstractC22676k.m65750j(charset, "charset");
        AbstractC22676k.m65750j(contentType, "contentType");
        this.f98484x = obj;
        this.f98479E = abstractC0757c;
        this.f98485y = obj;
        this.f98480F = c32236a;
        this.f98481G = charset;
        this.f98482H = contentType;
    }

    public C25126d(InterfaceC22297a interfaceC22297a, InterfaceC22297a interfaceC22297a2, InterfaceC22297a interfaceC22297a3, C15990r c15990r, InterfaceC22297a interfaceC22297a4, InterfaceC22297a interfaceC22297a5, InterfaceC22297a interfaceC22297a6) {
        this.f98483w = 5;
        this.f98484x = interfaceC22297a;
        this.f98485y = interfaceC22297a2;
        this.f98486z = interfaceC22297a3;
        this.f98479E = c15990r;
        this.f98480F = interfaceC22297a4;
        this.f98481G = interfaceC22297a5;
        this.f98482H = interfaceC22297a6;
    }

    public C25126d(C17171d c17171d) {
        this.f98483w = 8;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(0);
        this.f98484x = c13045h2M36593c;
        this.f98485y = c13045h2M36593c;
        this.f98486z = AbstractC13091v.m36593c("");
        this.f98479E = AbstractC13091v.m36593c("");
        this.f98480F = AbstractC13091v.m36593c(0);
        this.f98481G = AbstractC13091v.m36593c(Float.valueOf(0.0f));
        this.f98482H = AbstractC13091v.m36593c("");
    }

    public C25126d(Context context) {
        Object objM36586L;
        this.f98483w = 7;
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "context.applicationContext");
        C31830j c31830j = new C31830j(applicationContext);
        LocationService orCreate = LocationServiceFactory.getOrCreate();
        AbstractC22676k.m65749i(orCreate, "getOrCreate()");
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 mainCoroutineDispatcher = AbstractC17182o.f65999a.mo8825s();
        AbstractC22676k.m65750j(mainCoroutineDispatcher, "mainCoroutineDispatcher");
        this.f98484x = c31830j;
        this.f98485y = mainCoroutineDispatcher;
        C17171d c17171dM8708b = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), mainCoroutineDispatcher));
        this.f98479E = AbstractC13091v.m36593c(EnumC13677r.f48475x);
        this.f98480F = AbstractC13091v.m36586L(AbstractC13091v.m36600j(new C26175j(this, (InterfaceC30057d) null, 27)), c17171dM8708b, C13105z1.m36630a(1, 0L), 1);
        this.f98482H = new ConcurrentHashMap();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(new LocationProviderRequest.Builder().accuracy(AccuracyLevel.HIGH).interval(new IntervalSettings.Builder().minimumInterval(1000L).interval(1000L).build()).displacement(Float.valueOf(0.1f)).build());
        if (deviceLocationProvider.isValue()) {
            Context applicationContext2 = context.getApplicationContext();
            DeviceLocationProvider value = deviceLocationProvider.getValue();
            AbstractC22676k.m65747g(value);
            objM36586L = AbstractC13091v.m36586L(AbstractC13091v.m36600j(new C31821a(applicationContext2, value, this, null)), c17171dM8708b, C13105z1.m36630a(1, 0L), 1);
        } else {
            LocationError error = deviceLocationProvider.getError();
            AbstractC22676k.m65747g(error);
            MapboxLogger.logE("MapboxLocationProvider", "LocationService error: " + error);
            this.f98486z = new LocationError(LocationErrorCode.NOT_AVAILABLE, "LiveTrackingClient not available");
            objM36586L = C13054k.f45116w;
        }
        this.f98481G = objM36586L;
    }

    public C25126d(C5099k0 c5099k0, InterfaceC31117e interfaceC31117e, C35845c c35845c, List list, InterfaceC31155s0 interfaceC31155s0) {
        this.f98483w = 6;
        this.f98486z = c5099k0;
        this.f98479E = interfaceC31117e;
        this.f98480F = c35845c;
        this.f98481G = list;
        this.f98482H = interfaceC31155s0;
        this.f98484x = c5099k0;
        this.f98485y = new HashMap();
    }
}
