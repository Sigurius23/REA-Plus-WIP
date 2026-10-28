package kw1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
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

/* JADX INFO: renamed from: kw1.v */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a;\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/ProgressContent;", "content", "Lkotlin/Function1;", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "Ll83/a0;", "onCtaClicked", "", "isFromLto", "f", "(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22871v {
    /* JADX WARN: Code duplicated, block: B:101:0x0160  */
    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    /* JADX WARN: Code duplicated, block: B:104:0x0168  */
    /* JADX WARN: Code duplicated, block: B:106:0x016b  */
    /* JADX WARN: Code duplicated, block: B:107:0x016d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0171  */
    /* JADX WARN: Code duplicated, block: B:111:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x017d  */
    /* JADX WARN: Code duplicated, block: B:118:0x018a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:0x019c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0202  */
    /* JADX WARN: Code duplicated, block: B:145:0x020f  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x0108  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x0117  */
    /* JADX WARN: Code duplicated, block: B:85:0x011f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX INFO: renamed from: f */
    public static final void m66449f(ProgressContent progressContent, Function1 function1, boolean z4, Composer composer, int i13, int i14) {
        ProgressContent progressContent2;
        int i15;
        Function1 function2;
        int i16;
        boolean z13;
        int i17;
        boolean z14;
        C28655q c28655q;
        ProgressContent progressContent3;
        Function1 function3;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM21277k;
        int i18;
        boolean z17;
        int i19;
        boolean z18;
        int i24;
        boolean z19;
        boolean z24;
        Object objM87133R;
        TextResource textResourceM21277k2;
        TextResource textResourceM21267a;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objM87133R2;
        String title;
        TextResource textResourceM21267a2;
        boolean z29;
        boolean z34;
        boolean z35;
        Object objM87133R3;
        Cta secondaryCta;
        String title2;
        Cta secondaryCta2;
        Cta primaryCta;
        String title3;
        String subtitle;
        String title4;
        Object objM87133R4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(516923572);
        int i25 = i14 & 1;
        if (i25 != 0) {
            i15 = i13 | 6;
            progressContent2 = progressContent;
        } else if ((i13 & 6) == 0) {
            progressContent2 = progressContent;
            i15 = (c28655q2.m87153g(progressContent2) ? 4 : 2) | i13;
        } else {
            progressContent2 = progressContent;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q2.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z14)) {
                    if (i25 != 0) {
                        progressContent2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(25);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    if (progressContent2 != null || (title4 = progressContent2.getTitle()) == null || (textResourceM21277k = AbstractC8693b.m21278l(title4)) == null) {
                        textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
                    }
                    TextResource textResource = textResourceM21277k;
                    i18 = i15 & 896;
                    if (i18 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i19 = i15 & 112;
                    if (i19 == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z36 = z17 | z18;
                    i24 = i15 & 14;
                    if (i24 == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z36 | z19;
                    objM87133R = c28655q2.m87133R();
                    if (z24 || objM87133R == c28676v0) {
                        objM87133R = new C22870u(z16, function4, progressContent2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC33208p0.h hVar = new AbstractC33208p0.h(textResource, 0L, (InterfaceC4339a) objM87133R, 2, null);
                    if (progressContent2 != null || (subtitle = progressContent2.getSubtitle()) == null || (textResourceM21277k2 = AbstractC8693b.m21278l(subtitle)) == null) {
                        textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
                    }
                    if (progressContent2 != null || (primaryCta = progressContent2.getPrimaryCta()) == null || (title3 = primaryCta.getTitle()) == null || (textResourceM21267a = AbstractC8693b.m21278l(title3)) == null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    if (i19 == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (i18 == 256) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z37 = z26 | z25;
                    if (i24 == 4) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z37 | z27;
                    objM87133R2 = c28655q2.m87133R();
                    if (z28 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C22870u(function4, z16, progressContent2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    if (progressContent2 != null || (secondaryCta2 = progressContent2.getSecondaryCta()) == null) {
                        title = null;
                    } else {
                        title = secondaryCta2.getTitle();
                    }
                    boolean zM85314d = AbstractC28188o1.m85314d(title);
                    if (progressContent2 != null || (secondaryCta = progressContent2.getSecondaryCta()) == null || (title2 = secondaryCta.getTitle()) == null || (textResourceM21267a2 = AbstractC8693b.m21278l(title2)) == null) {
                        textResourceM21267a2 = AbstractC8693b.m21267a();
                    }
                    if (i24 == 4) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    if (i19 == 32) {
                        z34 = true;
                    } else {
                        z34 = false;
                    }
                    z35 = z29 | z34;
                    objM87133R3 = c28655q2.m87133R();
                    if (z35 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C22860k(progressContent2, function4, 6);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    int i27 = AbstractC33208p0.h.f138482h;
                    int i28 = TextResource.$stable;
                    int i29 = i27 | (i28 << 3) | (i28 << 9) | (i28 << 21);
                    function3 = function4;
                    AbstractC33199m0.m105214F(hVar, textResourceM21277k2, null, textResourceM21267a, interfaceC4339a, zM85314d, false, textResourceM21267a2, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i29, 0, 3652);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    progressContent3 = progressContent2;
                    z15 = z16;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    progressContent3 = progressContent2;
                    function3 = function2;
                    z15 = z13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3226h(progressContent3, function3, z15, i13, i14, 16);
                }
            }
            i15 |= 384;
            z13 = z4;
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    progressContent2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(25);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                if (progressContent2 != null) {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
                } else {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
                }
                TextResource textResource2 = textResourceM21277k;
                i18 = i15 & 896;
                if (i18 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i19 = i15 & 112;
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z38 = z17 | z18;
                i24 = i15 & 14;
                if (i24 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z38 | z19;
                objM87133R = c28655q2.m87133R();
                if (z24) {
                    objM87133R = new C22870u(z16, function4, progressContent2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22870u(z16, function4, progressContent2);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33208p0.h hVar2 = new AbstractC33208p0.h(textResource2, 0L, (InterfaceC4339a) objM87133R, 2, null);
                if (progressContent2 != null) {
                    textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
                } else {
                    textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
                }
                if (progressContent2 != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i19 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i18 == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z39 = z26 | z25;
                if (i24 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z39 | z27;
                objM87133R2 = c28655q2.m87133R();
                if (z28) {
                    objM87133R2 = new C22870u(function4, z16, progressContent2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C22870u(function4, z16, progressContent2);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                if (progressContent2 != null) {
                    title = null;
                } else {
                    title = null;
                }
                boolean zM85314d2 = AbstractC28188o1.m85314d(title);
                if (progressContent2 != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                if (i24 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i19 == 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = z29 | z34;
                objM87133R3 = c28655q2.m87133R();
                if (z35) {
                    objM87133R3 = new C22860k(progressContent2, function4, 6);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C22860k(progressContent2, function4, 6);
                    c28655q2.m87172p0(objM87133R3);
                }
                int i210 = AbstractC33208p0.h.f138482h;
                int i211 = TextResource.$stable;
                int i212 = i210 | (i211 << 3) | (i211 << 9) | (i211 << 21);
                function3 = function4;
                AbstractC33199m0.m105214F(hVar2, textResourceM21277k2, null, textResourceM21267a, interfaceC4339a2, zM85314d2, false, textResourceM21267a2, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i212, 0, 3652);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                progressContent3 = progressContent2;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                progressContent3 = progressContent2;
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(progressContent3, function3, z15, i13, i14, 16);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q2.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    progressContent2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(25);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                if (progressContent2 != null) {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
                } else {
                    textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
                }
                TextResource textResource3 = textResourceM21277k;
                i18 = i15 & 896;
                if (i18 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i19 = i15 & 112;
                if (i19 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z310 = z17 | z18;
                i24 = i15 & 14;
                if (i24 == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z310 | z19;
                objM87133R = c28655q2.m87133R();
                if (z24) {
                    objM87133R = new C22870u(z16, function4, progressContent2);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C22870u(z16, function4, progressContent2);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33208p0.h hVar3 = new AbstractC33208p0.h(textResource3, 0L, (InterfaceC4339a) objM87133R, 2, null);
                if (progressContent2 != null) {
                    textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
                } else {
                    textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
                }
                if (progressContent2 != null) {
                    textResourceM21267a = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a = AbstractC8693b.m21267a();
                }
                if (i19 == 32) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                if (i18 == 256) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z311 = z26 | z25;
                if (i24 == 4) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z311 | z27;
                objM87133R2 = c28655q2.m87133R();
                if (z28) {
                    objM87133R2 = new C22870u(function4, z16, progressContent2);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C22870u(function4, z16, progressContent2);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                if (progressContent2 != null) {
                    title = null;
                } else {
                    title = null;
                }
                boolean zM85314d3 = AbstractC28188o1.m85314d(title);
                if (progressContent2 != null) {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                } else {
                    textResourceM21267a2 = AbstractC8693b.m21267a();
                }
                if (i24 == 4) {
                    z29 = true;
                } else {
                    z29 = false;
                }
                if (i19 == 32) {
                    z34 = true;
                } else {
                    z34 = false;
                }
                z35 = z29 | z34;
                objM87133R3 = c28655q2.m87133R();
                if (z35) {
                    objM87133R3 = new C22860k(progressContent2, function4, 6);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C22860k(progressContent2, function4, 6);
                    c28655q2.m87172p0(objM87133R3);
                }
                int i213 = AbstractC33208p0.h.f138482h;
                int i214 = TextResource.$stable;
                int i215 = i213 | (i214 << 3) | (i214 << 9) | (i214 << 21);
                function3 = function4;
                AbstractC33199m0.m105214F(hVar3, textResourceM21277k2, null, textResourceM21267a, interfaceC4339a3, zM85314d3, false, textResourceM21267a2, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i215, 0, 3652);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                progressContent3 = progressContent2;
                z15 = z16;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                progressContent3 = progressContent2;
                function3 = function2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(progressContent3, function3, z15, i13, i14, 16);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i25 != 0) {
                progressContent2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C22594e(25);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
            if (progressContent2 != null) {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
            } else {
                textResourceM21277k = AbstractC8693b.m21277k(AbstractC29579b.f120736n);
            }
            TextResource textResource4 = textResourceM21277k;
            i18 = i15 & 896;
            if (i18 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            i19 = i15 & 112;
            if (i19 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z312 = z17 | z18;
            i24 = i15 & 14;
            if (i24 == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z312 | z19;
            objM87133R = c28655q2.m87133R();
            if (z24) {
                objM87133R = new C22870u(z16, function4, progressContent2);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C22870u(z16, function4, progressContent2);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC33208p0.h hVar4 = new AbstractC33208p0.h(textResource4, 0L, (InterfaceC4339a) objM87133R, 2, null);
            if (progressContent2 != null) {
                textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
            } else {
                textResourceM21277k2 = AbstractC8693b.m21277k(AbstractC29579b.f120735m);
            }
            if (progressContent2 != null) {
                textResourceM21267a = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a = AbstractC8693b.m21267a();
            }
            if (i19 == 32) {
                z25 = true;
            } else {
                z25 = false;
            }
            if (i18 == 256) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z313 = z26 | z25;
            if (i24 == 4) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = z313 | z27;
            objM87133R2 = c28655q2.m87133R();
            if (z28) {
                objM87133R2 = new C22870u(function4, z16, progressContent2);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C22870u(function4, z16, progressContent2);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            if (progressContent2 != null) {
                title = null;
            } else {
                title = null;
            }
            boolean zM85314d4 = AbstractC28188o1.m85314d(title);
            if (progressContent2 != null) {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            } else {
                textResourceM21267a2 = AbstractC8693b.m21267a();
            }
            if (i24 == 4) {
                z29 = true;
            } else {
                z29 = false;
            }
            if (i19 == 32) {
                z34 = true;
            } else {
                z34 = false;
            }
            z35 = z29 | z34;
            objM87133R3 = c28655q2.m87133R();
            if (z35) {
                objM87133R3 = new C22860k(progressContent2, function4, 6);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C22860k(progressContent2, function4, 6);
                c28655q2.m87172p0(objM87133R3);
            }
            int i216 = AbstractC33208p0.h.f138482h;
            int i217 = TextResource.$stable;
            int i218 = i216 | (i217 << 3) | (i217 << 9) | (i217 << 21);
            function3 = function4;
            AbstractC33199m0.m105214F(hVar4, textResourceM21277k2, null, textResourceM21267a, interfaceC4339a4, zM85314d4, false, textResourceM21267a2, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i218, 0, 3652);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            progressContent3 = progressContent2;
            z15 = z16;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            progressContent3 = progressContent2;
            function3 = function2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(progressContent3, function3, z15, i13, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66450g(CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m66451h(boolean z4, Function1 function1, ProgressContent progressContent) {
        if (z4) {
            function1.invoke(CtaAction.GO_HOME);
        } else if (progressContent == null) {
            function1.invoke(CtaAction.DISMISS_TO_ROOT);
        } else {
            CtaAction autoDismissAction = progressContent.getAutoDismissAction();
            if (autoDismissAction != null) {
                function1.invoke(autoDismissAction);
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m66452i(Function1 function1, boolean z4, ProgressContent progressContent) {
        CtaAction action;
        Cta primaryCta;
        if (z4) {
            action = CtaAction.GO_HOME;
        } else if (progressContent == null || (primaryCta = progressContent.getPrimaryCta()) == null || (action = primaryCta.getAction()) == null) {
            action = CtaAction.UNKNOWN;
        }
        function1.invoke(action);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m66453j(ProgressContent progressContent, Function1 function1) {
        Cta secondaryCta;
        CtaAction action;
        if (progressContent != null && (secondaryCta = progressContent.getSecondaryCta()) != null && (action = secondaryCta.getAction()) != null) {
            function1.invoke(action);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m66454k(ProgressContent progressContent, Function1 function1, boolean z4, int i13, int i14, Composer composer, int i15) {
        m66449f(progressContent, function1, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
