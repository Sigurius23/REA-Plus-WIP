package l00;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.painter.ColorPainter;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2539i0;
import b30.C2641v3;
import b30.C2665z;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsentUi;
import com.whoop.android.R;
import cp0.C10941a;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14932c;
import g00.C14934e;
import ge3.AbstractC15751g;
import h00.AbstractC16495c0;
import h00.C16493b0;
import i00.AbstractC17837a;
import ih0.AbstractC18489d0;
import j00.C21123z;
import j41.C21313a;
import j93.InterfaceC21467g;
import java.util.WeakHashMap;
import kk1.C22541b;
import kotlin.C1990b0;
import kotlin.C2032u;
import l83.C23454a0;
import m40.C25046w;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p132f0.C13821r1;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l00.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23024f {
    static {
        ConsentUi.Icon icon = new ConsentUi.Icon("https://b.stripecdn.com/connections-statics-srv/assets/SailIcon--lock-primary-3x.png");
        new ConsentUi.ConsentPane("Connect Powdur with Link", new ConsentUi.ConsentPane.ScopesSection("Powdur will have access to:", AbstractC37056f.m118959K(new ConsentUi.ConsentPane.ScopesSection.Scope(icon, "Account", "View and manage your name, email, phone, and shipping addresses"), new ConsentUi.ConsentPane.ScopesSection.Scope(icon, "Wallet", "View and manage your cards and bank accounts"), new ConsentUi.ConsentPane.ScopesSection.Scope(icon, "Identity", "View your identity information (date of birth, address, <a href=''>ID documents</a>)"))), "Lorem ipsum <a href=''>dolor</a> sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", "Cancel", "Continue");
    }

    /* JADX INFO: renamed from: a */
    public static final void m66782a(EnumC23019a enumC23019a, String str, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13) {
        int i14;
        InterfaceC4339a interfaceC4339a2;
        long j7;
        long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1509596713);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(enumC23019a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            int iOrdinal = enumC23019a.ordinal();
            if (iOrdinal == 0) {
                c28655q.m87150e0(-1803369176);
                c28655q.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                j7 = c14931b.f55664c;
                c28655q.m87173q(false);
            } else {
                if (iOrdinal != 1) {
                    throw AbstractC11895b.m32003v(-1803371242, c28655q, false);
                }
                c28655q.m87150e0(-1803366939);
                c28655q.m87150e0(-443512897);
                C14931b c14931b2 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                j7 = c14931b2.f55670i;
                c28655q.m87173q(false);
            }
            int iOrdinal2 = enumC23019a.ordinal();
            if (iOrdinal2 == 0) {
                c28655q.m87150e0(-1803363451);
                c28655q.m87150e0(-443512897);
                C14931b c14931b3 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                j13 = c14931b3.f55675n;
                c28655q.m87173q(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw AbstractC11895b.m32003v(-1803365515, c28655q, false);
                }
                c28655q.m87150e0(-1803361305);
                c28655q.m87150e0(-443512897);
                C14931b c14931b4 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                j13 = c14931b4.f55680s;
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(-1165442303);
            C14932c c14932c = (C14932c) c28655q.m87161k(AbstractC14936g.f55707d);
            c28655q.m87173q(false);
            float f13 = 32;
            float f14 = 16;
            AbstractC12350b.m34583d(interfaceC4339a2, AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier, c14932c.f55689b), j7, AbstractC17918w0.f69621a), false, null, null, null, new C22976l1(f13, f14, f13, f14), AbstractC37817c.m121344e(-2124640134, c28655q, new C21123z(str, j13)), c28655q, ((i14 >> 6) & 14) | 905969664, 252);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(enumC23019a, str, interfaceC4339a, modifier, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m66783b(String str, String str2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        float f13;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1509806540);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i14;
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-653261932);
            if (str == null || interfaceC4339a2 == null) {
                f13 = Float.MAX_VALUE;
                z4 = true;
            } else {
                f13 = Float.MAX_VALUE;
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                z4 = true;
                m66782a(EnumC23019a.f90762w, str, interfaceC4339a2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c28655q, ((i15 << 3) & 112) | 6 | ((i15 >> 3) & 896));
            }
            c28655q.m87173q(false);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m66782a(EnumC23019a.f90763x, str2, interfaceC4339a, new LayoutWeightElement(1.0f > f13 ? f13 : 1.0f, z4), c28655q, (i15 & 112) | 6 | (i15 & 896));
            c28655q.m87173q(z4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21313a(str, str2, interfaceC4339a, interfaceC4339a2, i13, 28);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m66784c(Modifier modifier, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1491147988);
        if ((((c28655q.m87153g(modifier) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Modifier modifierM3394p = AbstractC1099a.m3394p(18, modifier);
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(R.drawable.stripe_ic_business, c28655q, 0);
            c28655q.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            AbstractC29125c.m88522c(abstractC26165aM88500I, null, modifierM3394p, null, null, 0.0f, new C17903p(c14931b.f55682u, 5), c28655q, 48, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier, i13, 4);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m66785d(Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1215245440);
        int i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(R.drawable.stripe_ic_lock, c28655q, 0), null, modifier2, null, null, 0.0f, null, c28655q, ((i14 << 6) & 896) | 48, 120);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2641v3(modifier2, i13, 5);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m66786e(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(748009717);
        int i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            long j7 = c14931b.f55676o;
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            AbstractC35148d.m111173d(str, null, null, j7, C23285v0.m67364b(c14934e.f55699f, 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), false, null, 0, null, c28655q, i14 & 14, 486);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2665z(str, i13, 6);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m66787f(InterfaceC41211c interfaceC41211c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1751175068);
        if ((((c28655q.m87157i(interfaceC41211c) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            AbstractC22674j.m65716b(AbstractC35785b.m113396S(interfaceC41211c, c28655q), AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3396r(AbstractC15751g.m44455h(C2314t.f9131w, 1, c14931b.f55661A, AbstractC33253j.m105489e(12)), 16, 0.0f, 2)), null, AbstractC22977m.f90650a, c28655q, 3072, 4);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23021c(interfaceC41211c, i13, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m66788g(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(146922349);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C25046w c25046w = (C25046w) c28655q.m87161k(AbstractC17837a.f69350a);
            Modifier modifierM3419p = AbstractC1102d.m3419p(56, AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(16)));
            c28655q.m87150e0(-443512897);
            C28674u2 c28674u2 = AbstractC14936g.f55706c;
            C14931b c14931b = (C14931b) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3419p, c14931b.f55664c, AbstractC17918w0.f69621a);
            if (str == null) {
                c28655q.m87150e0(927811570);
                m66784c(modifierM3358c, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(927873725);
                c28655q.m87150e0(-443512897);
                C14931b c14931b2 = (C14931b) c28655q.m87161k(c28674u2);
                c28655q.m87173q(false);
                AbstractC12314q.m34329i(str, c25046w, modifierM3358c, null, null, new ColorPainter(c14931b2.f55686y), null, false, AbstractC37817c.m121344e(-1531626800, c28655q, new C23022d(0, modifierM3358c)), AbstractC37817c.m121344e(-1235292612, c28655q, new C23022d(1, modifierM3358c)), c28655q, (i14 & 14) | 805306816, 6, 432);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 17);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m66789h(String str, String userEmail, ConsentUi.ConsentPane pane, InterfaceC41211c interfaceC41211c, InterfaceC4339a onAllowClick, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C0213j c0213j;
        boolean z4;
        AbstractC22676k.m65750j(userEmail, "userEmail");
        AbstractC22676k.m65750j(pane, "pane");
        AbstractC22676k.m65750j(onAllowClick, "onAllowClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1103039436);
        int i14 = i13 | (c28655q.m87153g(str) ? 4 : 2) | (c28655q.m87153g(userEmail) ? 32 : 16) | (c28655q.m87157i(pane) ? 256 : 128) | (c28655q.m87157i(interfaceC41211c) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(onAllowClick) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87157i(interfaceC4339a) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
        if ((74899 & i14) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C16493b0 c16493b0 = (C16493b0) c28655q.m87161k(AbstractC16495c0.f63391a);
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            Boolean boolValueOf = Boolean.valueOf(c13821r1M92099U.mo39182c());
            c28655q.m87150e0(-141714334);
            boolean zM87153g = c28655q.m87153g(c16493b0) | c28655q.m87153g(c13821r1M92099U);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C23023e(c16493b0, c13821r1M92099U, null);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, boolValueOf);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            WeakHashMap weakHashMap = C22944c2.f90553v;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifierM3407d, 0.0f, 0.0f, 0.0f, AbstractC22953f.m66717e(C22949e.m66712e(c28655q).f90558e, c28655q).mo43109a(), 7);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f13 = 20;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f13, 0.0f, 2), c13821r1M92099U, 14);
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m66788g(str, c28655q, i14 & 14);
            float f14 = 16;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            m66793l(pane.getTitle(), c28655q, 0);
            float f15 = 24;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            m66794m(userEmail, c28655q, (i14 >> 3) & 14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            m66792k(pane.getScopesSection(), c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(8, c2314t));
            c28655q.m87150e0(-110208576);
            if (interfaceC41211c != null) {
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                m66787f(interfaceC41211c, c28655q, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String disclaimer = pane.getDisclaimer();
            c28655q.m87150e0(-110197698);
            if (disclaimer == null) {
                z4 = false;
            } else {
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                z4 = false;
                m66786e(disclaimer, c28655q, 0);
            }
            AbstractC18489d0.m53356B(c28655q, z4, c2314t, f14, c28655q);
            m66783b(pane.getDenyButtonLabel(), pane.getAllowButtonLabel(), onAllowClick, interfaceC4339a, c28655q, (i14 >> 6) & 8064);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1990b0(str, userEmail, pane, interfaceC41211c, onAllowClick, interfaceC4339a, i13, 3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m66790i(final C23027i viewModel, Composer composer, final int i13) {
        AbstractC22676k.m65750j(viewModel, "viewModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1585765649);
        if ((((c28655q.m87157i(viewModel) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(viewModel.f90780E, c28655q, 0);
            ConsentUi.ConsentPane consentPane = ((C23028j) interfaceC28601c1M83597t.getValue()).f90788d;
            if (consentPane == null) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    final int i14 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m(viewModel, i13, i14) { // from class: l00.b

                        /* JADX INFO: renamed from: w */
                        public final /* synthetic */ int f90765w;

                        /* JADX INFO: renamed from: x */
                        public final /* synthetic */ C23027i f90766x;

                        {
                            this.f90765w = i14;
                        }

                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f90765w;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    AbstractC23024f.m66790i(this.f90766x, composer2, AbstractC28683x.m87244L(1));
                                    break;
                                default:
                                    AbstractC23024f.m66790i(this.f90766x, composer2, AbstractC28683x.m87244L(1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            String str = ((C23028j) interfaceC28601c1M83597t.getValue()).f90787c;
            String str2 = ((C23028j) interfaceC28601c1M83597t.getValue()).f90786b;
            InterfaceC41211c interfaceC41211c = ((C23028j) interfaceC28601c1M83597t.getValue()).f90789e;
            c28655q.m87150e0(-141730154);
            boolean zM87157i = c28655q.m87157i(viewModel);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                C2539i0 c2539i0 = new C2539i0(0, viewModel, C23027i.class, "onAllowClick", "onAllowClick()V", 0, 21);
                c28655q.m87172p0(c2539i0);
                objM87133R = c2539i0;
            }
            c28655q.m87173q(false);
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
            c28655q.m87150e0(-141728651);
            boolean zM87157i2 = c28655q.m87157i(viewModel);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C2539i0 c2539i1 = new C2539i0(0, viewModel, C23027i.class, "onDenyClick", "onDenyClick()V", 0, 22);
                c28655q.m87172p0(c2539i1);
                objM87133R2 = c2539i1;
            }
            c28655q.m87173q(false);
            m66789h(str, str2, consentPane, interfaceC41211c, interfaceC4339a, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), c28655q, 0);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i15 = 1;
            c28677v1M87180u2.f115982d = new InterfaceC4351m(viewModel, i13, i15) { // from class: l00.b

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ int f90765w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ C23027i f90766x;

                {
                    this.f90765w = i15;
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = this.f90765w;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i16) {
                        case 0:
                            AbstractC23024f.m66790i(this.f90766x, composer2, AbstractC28683x.m87244L(1));
                            break;
                        default:
                            AbstractC23024f.m66790i(this.f90766x, composer2, AbstractC28683x.m87244L(1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m66791j(C25046w c25046w, String str, String str2, String str3, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1439610918);
        int i14 = i13 | (c28655q.m87157i(c25046w) ? 4 : 2) | (c28655q.m87153g(str) ? 32 : 16) | (c28655q.m87153g(str2) ? 256 : 128) | (c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 10;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC1102d.m3419p(36, AbstractC37056f.m118994r(AbstractC1099a.m3398t(c2314t, 0.0f, 2, 0.0f, 0.0f, 13), AbstractC33253j.m105489e(f13))), AbstractC4482w.m13975K(c28655q).f55664c, AbstractC17918w0.f69621a));
            boolean z4 = false;
            AbstractC12314q.m34329i(str, c25046w, modifierM3394p, null, new C17903p(AbstractC4482w.m13975K(c28655q).f55682u, 5), AbstractC29125c.m88500I(R.drawable.stripe_ic_lock, c28655q, 0), null, true, AbstractC37817c.m121344e(-1493716393, c28655q, new C23022d(2, modifierM3394p)), AbstractC37817c.m121344e(1988859755, c28655q, new C23022d(3, modifierM3394p)), c28655q, ((i14 >> 3) & 14) | 905970112 | ((i14 << 3) & 112), 6, 144);
            c28655q = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 16, 0.0f, 0.0f, 0.0f, 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-701081472);
            if (str2 != null) {
                AbstractC15011f9.m43114b(str2, null, AbstractC4482w.m13975K(c28655q).f55674m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC4482w.m13983T(c28655q).f55698e, c28655q, (i14 >> 6) & 14, 0, 65530);
                c28655q = c28655q;
                z4 = false;
            }
            c28655q.m87173q(z4);
            AbstractC35148d.m111173d(str3, null, null, AbstractC4482w.m13975K(c28655q).f55676o, AbstractC4482w.m13983T(c28655q).f55697d, false, null, 0, null, c28655q, (i14 >> 9) & 14, 486);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(c25046w, str, str2, str3, i13, 17);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m66792k(ConsentUi.ConsentPane.ScopesSection scopesSection, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-548230449);
        if (((i13 | (c28655q.m87157i(scopesSection) ? 4 : 2)) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C25046w c25046w = (C25046w) c28655q.m87161k(AbstractC17837a.f69350a);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            String header = scopesSection.getHeader();
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55697d;
            c28655q.m87150e0(-443512897);
            C28674u2 c28674u2 = AbstractC14936g.f55706c;
            C14931b c14931b = (C14931b) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(header, modifierM3409f, c14931b.f55676o, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q, 48, 0, 65528);
            c28655q = c28655q;
            float f13 = 16;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            c28655q.m87150e0(-443512897);
            C14931b c14931b2 = (C14931b) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(f13, AbstractC15751g.m44455h(c2314t, 1, c14931b2.f55661A, AbstractC33253j.m105489e(12))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-628096217);
            for (ConsentUi.ConsentPane.ScopesSection.Scope scope : scopesSection.getScopes()) {
                m66791j(c25046w, scope.getIcon().getDefault(), scope.getHeader(), scope.getDescription(), c28655q, 8);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22541b(scopesSection, i13, 5);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m66793l(String str, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1078057706);
        int i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        if ((i14 & 3) == 2 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            c28655q2.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q2.m87161k(AbstractC14936g.f55705b);
            c28655q2.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55694a;
            c28655q2.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q2.m87161k(AbstractC14936g.f55706c);
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            AbstractC15011f9.m43114b(str, modifierM3409f, c14931b.f55674m, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0, c28655q, (i14 & 14) | 48, 0, 65016);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2665z(str, i13, 7);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m66794m(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1548937944);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            c28655q.m87150e0(-443512897);
            C28674u2 c28674u2 = AbstractC14936g.f55706c;
            C14931b c14931b = (C14931b) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            long j7 = c14931b.f55661A;
            C33252i c33252i = AbstractC33253j.f138651a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44455h = AbstractC15751g.m44455h(c2314t, 1, j7, c33252i);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44455h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, 12, 10);
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55697d;
            c28655q.m87150e0(-443512897);
            C14931b c14931b2 = (C14931b) c28655q.m87161k(c28674u2);
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(str, modifierM3395q, c14931b2.f55674m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q, (i14 & 14) | 48, 0, 65528);
            c28655q = c28655q;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 16);
        }
    }
}
