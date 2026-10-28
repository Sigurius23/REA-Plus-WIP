package kw1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.Cta;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import km2.C22594e;
import l83.C23454a0;
import or2.AbstractC28188o1;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import pv1.AbstractC29579b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kw1.m */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "Lkotlin/Function1;", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "Ll83/a0;", "onCtaClicked", "e", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22862m {
    /* JADX WARN: Code duplicated, block: B:101:0x016b  */
    /* JADX WARN: Code duplicated, block: B:102:0x016d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0170  */
    /* JADX WARN: Code duplicated, block: B:108:0x017a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:81:0x012c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x0165  */
    /* JADX INFO: renamed from: e */
    public static final void m66395e(ProgressContent progressContent, Function1 function1, Composer composer, int i13, int i14) {
        ProgressContent progressContent2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        String title;
        ProgressContent progressContent3;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM21277k;
        TextResource textResourceM21277k2;
        TextResource textResourceM21277k3;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        boolean z15;
        Object objM87133R;
        TextResource textResourceM21267a;
        boolean z16;
        boolean z17;
        Object objM87133R2;
        Cta secondaryCta;
        String title2;
        Cta secondaryCta2;
        Cta primaryCta;
        String title3;
        String subtitle;
        String title4;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-474551868);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            progressContent2 = progressContent;
        } else if ((i13 & 6) == 0) {
            progressContent2 = progressContent;
            i15 = i13 | (c28655q.m87153g(progressContent2) ? 4 : 2);
        } else {
            progressContent2 = progressContent;
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                title = null;
                if (i18 != 0) {
                    progressContent3 = null;
                } else {
                    progressContent3 = progressContent2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22594e(20);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (progressContent3 != null || (title4 = progressContent3.getTitle()) == null || (textResourceM21277k = AbstractC8693b.m21278l(title4)) == null) {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120730h);
                }
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(textResourceM21277k, false, null, 6, null);
                if (progressContent3 != null || (subtitle = progressContent3.getSubtitle()) == null || (textResourceM21277k2 = AbstractC8693b.m21278l(subtitle)) == null) {
                    textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120729g);
                }
                if (progressContent3 != null || (primaryCta = progressContent3.getPrimaryCta()) == null || (title3 = primaryCta.getTitle()) == null || (textResourceM21277k3 = AbstractC8693b.m21278l(title3)) == null) {
                    textResourceM21277k3 = AbstractC8693b.m21277k(AbstractC29579b.f120728f);
                }
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i17 = i15 & 14;
                if (i17 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C22860k(function4, progressContent3, 0);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                if (progressContent3 != null && (secondaryCta2 = progressContent3.getSecondaryCta()) != null) {
                    title = secondaryCta2.getTitle();
                }
                boolean zM85314d = AbstractC28188o1.m85314d(title);
                if (progressContent3 != null || (secondaryCta = progressContent3.getSecondaryCta()) == null || (title2 = secondaryCta.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title2)) == null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i17 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | (i16 == 32);
                objM87133R2 = c28655q.m87133R();
                if (z17 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C22860k(progressContent3, function4, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                int i24 = AbstractC33208p0.b.f138467h;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(bVar, textResourceM21277k2, null, textResourceM21277k3, interfaceC4339a, zM85314d, false, textResourceM21267a, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                c28655q.m87173q(true);
                function3 = function4;
                progressContent2 = progressContent3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22861l(progressContent2, function3, i13, i14, 0);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            title = null;
            if (i18 != 0) {
                progressContent3 = null;
            } else {
                progressContent3 = progressContent2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22594e(20);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (progressContent3 != null) {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120730h);
            } else {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120730h);
            }
            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(textResourceM21277k, false, null, 6, null);
            if (progressContent3 != null) {
                textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120729g);
            } else {
                textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120729g);
            }
            if (progressContent3 != null) {
                textResourceM21277k3 = AbstractC8693b.m21277k(AbstractC29579b.f120728f);
            } else {
                textResourceM21277k3 = AbstractC8693b.m21277k(AbstractC29579b.f120728f);
            }
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            i17 = i15 & 14;
            if (i17 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C22860k(function4, progressContent3, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C22860k(function4, progressContent3, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
            if (progressContent3 != null) {
                title = secondaryCta2.getTitle();
            }
            boolean zM85314d2 = AbstractC28188o1.m85314d(title);
            if (progressContent3 != null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            if (i17 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z16 | (i16 == 32);
            objM87133R2 = c28655q.m87133R();
            if (z17) {
                objM87133R2 = new C22860k(progressContent3, function4, 1);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C22860k(progressContent3, function4, 1);
                c28655q.m87172p0(objM87133R2);
            }
            int i26 = AbstractC33208p0.b.f138467h;
            int i27 = TextResource.$stable;
            AbstractC33199m0.m105214F(bVar2, textResourceM21277k2, null, textResourceM21277k3, interfaceC4339a2, zM85314d2, false, textResourceM21267a, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i26 | (i27 << 3) | (i27 << 9) | (i27 << 21), 0, 3652);
            c28655q.m87173q(true);
            function3 = function4;
            progressContent2 = progressContent3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22861l(progressContent2, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m66396f(CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66397g(Function1 function1, ProgressContent progressContent) {
        CtaAction action;
        Cta primaryCta;
        if (progressContent == null || (primaryCta = progressContent.getPrimaryCta()) == null || (action = primaryCta.getAction()) == null) {
            action = CtaAction.RETRY;
        }
        function1.invoke(action);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66398h(ProgressContent progressContent, Function1 function1) {
        Cta secondaryCta;
        CtaAction action;
        if (progressContent != null && (secondaryCta = progressContent.getSecondaryCta()) != null && (action = secondaryCta.getAction()) != null) {
            function1.invoke(action);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66399i(ProgressContent progressContent, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m66395e(progressContent, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
