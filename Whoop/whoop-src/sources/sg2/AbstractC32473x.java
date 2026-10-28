package sg2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import n71.EnumC26437r;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rg2.AbstractC31404p;
import rg2.C31408t;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: sg2.x */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0000*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lrg2/t;", "statusMessage", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Lrg2/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrg2/p;", "g", "(Lrg2/p;)Lrg2/t;", "Lcom/whoop/design/util/TextResource;", "f", "(Lrg2/p;)Lcom/whoop/design/util/TextResource;", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32473x {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01d2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m101462c(final C31408t c31408t, Modifier modifier, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C2314t c2314t;
        final Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(161789959);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c31408t) : c28655q.m87157i(c31408t) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                if (c31408t == null) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i17 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: sg2.w
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i17) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC32473x.m101463d(c31408t, modifier4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC32473x.m101464e(c31408t, modifier4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier5 = modifier4;
                    float f13 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1136a.m3599a(modifier5, "pre_session_status_message"), ((float) 6.5d) * f13, 0.0f, 2);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(c31408t.getIcon().toWhoopIcon(), c28655q, 6);
                    C38072d c38072d = C38072d.f163053a;
                    int i18 = C38072d.f163054b;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(6 * 4, c2314t), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                    TextResource title = c31408t.getTitle();
                    int i19 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(title, c28655q, i19);
                    C2886a h7 = c38072d.m121952e(c28655q, i18).getH2();
                    long brandWhite = c38072d.m121949b(c28655q, i18).getBrandWhite();
                    C36775k c36775k = new C36775k(3);
                    int i24 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, i24, 196090);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f13, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31408t.getSubtitle(), c28655q, i19), null, c38072d.m121949b(c28655q, i18).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 0, i24, 196090);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    modifier3 = modifier5;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i25 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: sg2.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i25) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC32473x.m101463d(c31408t, modifier3, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC32473x.m101464e(c31408t, modifier3, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            if (c31408t == null) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i110 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: sg2.w
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC32473x.m101463d(c31408t, modifier4, i13, i14, (Composer) obj, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj2).intValue();
                                return AbstractC32473x.m101464e(c31408t, modifier4, i13, i14, (Composer) obj, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier6 = modifier4;
                float f14 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1136a.m3599a(modifier6, "pre_session_status_message"), ((float) 6.5d) * f14, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
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
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c31408t.getIcon().toWhoopIcon(), c28655q, 6);
                C38072d c38072d2 = C38072d.f163053a;
                int i111 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(6 * 4, c2314t), c38072d2.m121949b(c28655q, i111).getWhite50(), c28655q, 432, 0);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f14, c2314t));
                TextResource title2 = c31408t.getTitle();
                int i112 = TextResource.$stable;
                String strM21274h2 = AbstractC8693b.m21274h(title2, c28655q, i112);
                C2886a h13 = c38072d2.m121952e(c28655q, i111).getH2();
                long brandWhite2 = c38072d2.m121949b(c28655q, i111).getBrandWhite();
                C36775k c36775k2 = new C36775k(3);
                int i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, h13, null, c28655q, 0, i26, 196090);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f14, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31408t.getSubtitle(), c28655q, i112), null, c38072d2.m121949b(c28655q, i111).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i111).getB2(), null, c28655q, 0, i26, 196090);
                c28655q = c28655q;
                c28655q.m87173q(true);
                modifier3 = modifier6;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i27 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: sg2.w
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i27) {
                        case 0:
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC32473x.m101463d(c31408t, modifier3, i13, i14, (Composer) obj, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj2).intValue();
                            return AbstractC32473x.m101464e(c31408t, modifier3, i13, i14, (Composer) obj, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m101463d(C31408t c31408t, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101462c(c31408t, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m101464e(C31408t c31408t, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m101462c(c31408t, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final TextResource m101465f(AbstractC31404p abstractC31404p) {
        AbstractC22676k.m65750j(abstractC31404p, "<this>");
        if (abstractC31404p instanceof AbstractC31404p.a) {
            return EnumC26437r.CALIBRATING.getZoneText();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static final C31408t m101466g(AbstractC31404p abstractC31404p) {
        AbstractC22676k.m65750j(abstractC31404p, "<this>");
        if (abstractC31404p instanceof AbstractC31404p.c) {
            return ((AbstractC31404p.c) abstractC31404p).getStatusMessage();
        }
        return null;
    }
}
