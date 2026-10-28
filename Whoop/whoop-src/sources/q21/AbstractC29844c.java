package q21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b30.C2559k4;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import eg2.C13171d;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a-\u0010\u001b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Ll0/s1;", "Lq21/d;", "cell", "", "isFirstColumn", "isHighlightedColumn", "isDifferentialSpacing", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Ll0/s1;Lq21/d;ZZZLandroidx/compose/runtime/Composer;II)V", "i", "(Ll0/s1;ZZLandroidx/compose/runtime/Composer;II)V", "Lgz0/m0;", "icon", "Lq21/e;", "style", "m", "(Ll0/s1;Lgz0/m0;ZLq21/e;Landroidx/compose/runtime/Composer;I)V", "", "content", "q", "(Ll0/s1;Ljava/lang/String;ZLq21/e;Landroidx/compose/runtime/Composer;I)V", "u", "(Ll0/s1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "s", "(Ll0/s1;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "k", "(Ll0/s1;Lcom/whoop/design/util/TextResource;ZZLandroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "image", "o", "(Ll0/s1;Lkd1/o;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29844c {
    /* JADX INFO: renamed from: i */
    private static final void m91345i(InterfaceC22997s1 interfaceC22997s1, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1247607617);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                z13 = true;
            }
            AbstractC22953f.m66715b(c28655q, interfaceC22997s1.mo66772c(C2314t.f9131w, true, (z4 && z13) ? 2.0f : 1.0f));
        } else {
            c28655q.m87138X();
        }
        boolean z14 = z13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29843b(interfaceC22997s1, z4, z14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m91346j(InterfaceC22997s1 interfaceC22997s1, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m91345i(interfaceC22997s1, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    private static final void m91347k(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        C28655q c28655q;
        boolean z16;
        C28677v1 c28677v1M87180u;
        boolean z17;
        float f13;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-643847238);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                i15 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                if (i16 != 0) {
                    z17 = true;
                } else {
                    z17 = z14;
                }
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 3) & 14);
                C38072d c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                C2886a c2886aM8438s = c38072d.m121952e(c28655q2, 6).getH5();
                int i17 = z4 ? 1 : 3;
                if (z4 || !z17) {
                    f13 = 1.0f;
                } else {
                    f13 = 2.0f;
                }
                c28655q = c28655q2;
                AbstractC30795n.m94707h(strM21274h, interfaceC22997s1.mo66772c(C2314t.f9131w, true, f13), jM125430y, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, 0, 196088);
                z16 = z17;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(interfaceC22997s1, textResource, z4, z16, i13, i14, 4);
            }
        }
        i15 |= 3072;
        z14 = z13;
        if ((i15 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            if (i16 != 0) {
                z17 = true;
            } else {
                z17 = z14;
            }
            String strM21274h2 = AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 3) & 14);
            C38072d c38072d2 = C38072d.f163053a;
            long jM125430y2 = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
            C2886a c2886aM8438s2 = c38072d2.m121952e(c28655q2, 6).getH5();
            if (z4) {
            }
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f;
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, interfaceC22997s1.mo66772c(C2314t.f9131w, true, f13), jM125430y2, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 0, false, 0, 0, null, c2886aM8438s2, null, c28655q, 0, 0, 196088);
            z16 = z17;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(interfaceC22997s1, textResource, z4, z16, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91348l(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m91347k(interfaceC22997s1, textResource, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m91349m(InterfaceC22997s1 interfaceC22997s1, EnumC16313m0 enumC16313m0, boolean z4, C29846e c29846e, Composer composer, int i13) {
        int i14;
        Modifier modifierM3358c;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1814935644);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0.ordinal()) ? 32 : 16;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c29846e) : c28655q.m87157i(c29846e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1043) != 1042)) {
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
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
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, c29846e.getShape());
            if (c29846e.getIconBackgroundColor() == null) {
                c28655q.m87150e0(-1559563914);
                c28655q.m87173q(false);
                modifierM3358c = null;
            } else {
                c28655q.m87150e0(-1559563913);
                modifierM3358c = AbstractC1092a.m3358c(c2314t, c29846e.getIconBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c29846e.getShape());
                c28655q.m87173q(false);
            }
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC15676d.m44103f(AbstractC15676d.m44103f(modifierM118994r, modifierM3358c), c29846e.getIconBackgroundBrush() != null ? AbstractC1092a.m3357b(c2314t, c29846e.getIconBackgroundBrush(), c29846e.getShape(), 0.0f, 4) : null));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), enumC16313m0.toString(), AbstractC1102d.m3419p(2 * 4, c2314t), c29846e.getIconTintColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 384, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(interfaceC22997s1, enumC16313m0, z4, c29846e, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m91350n(InterfaceC22997s1 interfaceC22997s1, EnumC16313m0 enumC16313m0, boolean z4, C29846e c29846e, int i13, Composer composer, int i14) {
        m91349m(interfaceC22997s1, enumC16313m0, z4, c29846e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m91351o(InterfaceC22997s1 interfaceC22997s1, AbstractC22403o abstractC22403o, Composer composer, int i13) {
        int i14;
        AbstractC22403o abstractC22403o2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1286204191);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(abstractC22403o) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(interfaceC22997s1.mo66772c(AbstractC1102d.m3411h(3 * 4, C2314t.f9131w), true, 1.0f), 1 * 8, 0.0f, 2);
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, (i14 >> 3) & 14, 3);
            abstractC22403o2 = abstractC22403o;
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM3396r, null, C39102j.f168200b, 0.0f, null, c28655q, 24624, 104);
            c28655q = c28655q;
        } else {
            abstractC22403o2 = abstractC22403o;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(interfaceC22997s1, abstractC22403o2, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m91352p(InterfaceC22997s1 interfaceC22997s1, AbstractC22403o abstractC22403o, int i13, Composer composer, int i14) {
        m91351o(interfaceC22997s1, abstractC22403o, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m91353q(InterfaceC22997s1 interfaceC22997s1, String str, boolean z4, C29846e c29846e, Composer composer, int i13) {
        int i14;
        String str2;
        C28655q c28655q;
        long jM95624D;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-440794059);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            str2 = str;
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q2.m87153g(c29846e) : c28655q2.m87157i(c29846e) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C17919x c17919xM31989h = null;
            InterfaceC39332e interfaceC39332eM91377i = c29846e != null ? c29846e.m91377i(z4) : null;
            if (interfaceC39332eM91377i == null) {
                c28655q2.m87150e0(-1980533255);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1598679816);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, interfaceC39332eM91377i.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            if (c17919xM31989h == null) {
                c28655q2.m87150e0(1598681119);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(1598678546);
                c28655q2.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str2, interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f), jM95624D, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN7(), null, c28655q, (i14 >> 3) & 14, 0, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(interfaceC22997s1, str, z4, c29846e, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m91354r(InterfaceC22997s1 interfaceC22997s1, String str, boolean z4, C29846e c29846e, int i13, Composer composer, int i14) {
        m91353q(interfaceC22997s1, str, z4, c29846e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    private static final void m91355s(InterfaceC22997s1 interfaceC22997s1, String str, boolean z4, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        C28655q c28655q;
        boolean z16;
        C28677v1 c28677v1M87180u;
        int i16;
        float f13;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(546105296);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 3072) == 0) {
                z14 = z13;
                i15 |= c28655q2.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z15)) {
                if (i17 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                C38072d c38072d = C38072d.f163053a;
                long jM125430y = c38072d.m121949b(c28655q2, 6).getBrandWhite();
                C2886a c2886aM8421b = c38072d.m121952e(c28655q2, 6).getB2();
                if (z4) {
                    i16 = 1;
                } else {
                    i16 = 3;
                }
                if (z4 || !z16) {
                    f13 = 1.0f;
                } else {
                    f13 = 2.0f;
                }
                c28655q = c28655q2;
                AbstractC30795n.m94707h(str, interfaceC22997s1.mo66772c(C2314t.f9131w, true, f13), jM125430y, 0L, null, null, null, 0L, null, new C36775k(i16), 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q, (i15 >> 3) & 14, 0, 196088);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z16 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2559k4(interfaceC22997s1, str, z4, z16, i13, i14, 5, false);
            }
        }
        i15 |= 3072;
        z14 = z13;
        if ((i15 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z15)) {
            if (i17 != 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            C38072d c38072d2 = C38072d.f163053a;
            long jM125430y2 = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
            C2886a c2886aM8421b2 = c38072d2.m121952e(c28655q2, 6).getB2();
            if (z4) {
                i16 = 1;
            } else {
                i16 = 3;
            }
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 1.0f;
            }
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, interfaceC22997s1.mo66772c(C2314t.f9131w, true, f13), jM125430y2, 0L, null, null, null, 0L, null, new C36775k(i16), 0L, 0, false, 0, 0, null, c2886aM8421b2, null, c28655q, (i15 >> 3) & 14, 0, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z16 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2559k4(interfaceC22997s1, str, z4, z16, i13, i14, 5, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m91356t(InterfaceC22997s1 interfaceC22997s1, String str, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) {
        m91355s(interfaceC22997s1, str, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m91357u(InterfaceC22997s1 interfaceC22997s1, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1018805757);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(interfaceC22997s1) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getH5(), null, c28655q, (i14 >> 3) & 14, 0, 196088);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(interfaceC22997s1, str, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m91358v(InterfaceC22997s1 interfaceC22997s1, String str, int i13, Composer composer, int i14) {
        m91357u(interfaceC22997s1, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0146  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: w */
    public static final void m91359w(InterfaceC22997s1 interfaceC22997s1, AbstractC29845d cell, boolean z4, boolean z13, boolean z14, Composer composer, int i13, int i14) {
        int i15;
        boolean z15;
        boolean z16;
        C28677v1 c28677v1M87180u;
        boolean z17;
        boolean z18;
        int i16;
        boolean z19;
        AbstractC22676k.m65750j(interfaceC22997s1, "<this>");
        AbstractC22676k.m65750j(cell, "cell");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1895019229);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(cell) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i14 & 8;
        if (i17 == 0) {
            if ((i13 & 24576) == 0) {
                z15 = z14;
                i15 |= c28655q.m87155h(z15) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                if (i17 != 0) {
                    z17 = false;
                } else {
                    z17 = z15;
                }
                if (cell.equals(AbstractC29845d.a.f121968a)) {
                    c28655q.m87150e0(-47337033);
                    boolean z24 = z17;
                    m91345i(interfaceC22997s1, z4, z24, c28655q, ((i15 >> 6) & 896) | (i15 & 14) | ((i15 >> 3) & 112), 0);
                    z18 = z24;
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    z18 = z17;
                    if (cell instanceof AbstractC29845d.c) {
                        c28655q.m87150e0(-47331431);
                        AbstractC29845d.c cVar = (AbstractC29845d.c) cell;
                        int i18 = i15;
                        m91349m(interfaceC22997s1, cVar.getIcon(), z13, cVar.getStyle(), c28655q, (i18 & 14) | ((i18 >> 3) & 896));
                        c28655q.m87173q(false);
                    } else {
                        i16 = i15;
                        if (cell instanceof AbstractC29845d.e) {
                            c28655q.m87150e0(-47325563);
                            AbstractC29845d.e eVar = (AbstractC29845d.e) cell;
                            m91353q(interfaceC22997s1, eVar.getContent(), z13, eVar.getStyle(), c28655q, (i16 & 14) | ((i16 >> 3) & 896));
                            c28655q.m87173q(false);
                        } else {
                            if (cell instanceof AbstractC29845d.g) {
                                c28655q.m87150e0(-47319551);
                                m91357u(interfaceC22997s1, ((AbstractC29845d.g) cell).getContent(), c28655q, i16 & 14);
                                c28655q.m87173q(false);
                            } else if (cell instanceof AbstractC29845d.f) {
                                c28655q.m87150e0(-47315602);
                                z19 = z18;
                                m91355s(interfaceC22997s1, ((AbstractC29845d.f) cell).getContent(), z4, z19, c28655q, (i16 & 910) | ((i16 >> 3) & 7168), 0);
                                c28655q.m87173q(false);
                            } else {
                                z19 = z18;
                                if (cell instanceof AbstractC29845d.b) {
                                    c28655q.m87150e0(-47309200);
                                    m91347k(interfaceC22997s1, ((AbstractC29845d.b) cell).getContent(), z4, z19, c28655q, (i16 & 910) | ((i16 >> 3) & 7168), 0);
                                    c28655q.m87173q(false);
                                } else {
                                    if (cell instanceof AbstractC29845d.d) {
                                        throw AbstractC11895b.m32003v(-47338185, c28655q, false);
                                    }
                                    c28655q.m87150e0(-47302851);
                                    m91351o(interfaceC22997s1, ((AbstractC29845d.d) cell).getImage(), c28655q, i16 & 14);
                                    c28655q.m87173q(false);
                                }
                            }
                            z15 = z19;
                        }
                    }
                }
                z19 = z18;
                z15 = z19;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13171d(interfaceC22997s1, cell, z4, z13, z15, i13, i14);
            }
        }
        i15 |= 24576;
        z15 = z14;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            if (i17 != 0) {
                z17 = false;
            } else {
                z17 = z15;
            }
            if (cell.equals(AbstractC29845d.a.f121968a)) {
                c28655q.m87150e0(-47337033);
                boolean z25 = z17;
                m91345i(interfaceC22997s1, z4, z25, c28655q, ((i15 >> 6) & 896) | (i15 & 14) | ((i15 >> 3) & 112), 0);
                z18 = z25;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z18 = z17;
                if (cell instanceof AbstractC29845d.c) {
                    c28655q.m87150e0(-47331431);
                    AbstractC29845d.c cVar2 = (AbstractC29845d.c) cell;
                    int i19 = i15;
                    m91349m(interfaceC22997s1, cVar2.getIcon(), z13, cVar2.getStyle(), c28655q, (i19 & 14) | ((i19 >> 3) & 896));
                    c28655q.m87173q(false);
                } else {
                    i16 = i15;
                    if (cell instanceof AbstractC29845d.e) {
                        c28655q.m87150e0(-47325563);
                        AbstractC29845d.e eVar2 = (AbstractC29845d.e) cell;
                        m91353q(interfaceC22997s1, eVar2.getContent(), z13, eVar2.getStyle(), c28655q, (i16 & 14) | ((i16 >> 3) & 896));
                        c28655q.m87173q(false);
                    } else {
                        if (cell instanceof AbstractC29845d.g) {
                            c28655q.m87150e0(-47319551);
                            m91357u(interfaceC22997s1, ((AbstractC29845d.g) cell).getContent(), c28655q, i16 & 14);
                            c28655q.m87173q(false);
                        } else if (cell instanceof AbstractC29845d.f) {
                            c28655q.m87150e0(-47315602);
                            z19 = z18;
                            m91355s(interfaceC22997s1, ((AbstractC29845d.f) cell).getContent(), z4, z19, c28655q, (i16 & 910) | ((i16 >> 3) & 7168), 0);
                            c28655q.m87173q(false);
                        } else {
                            z19 = z18;
                            if (cell instanceof AbstractC29845d.b) {
                                c28655q.m87150e0(-47309200);
                                m91347k(interfaceC22997s1, ((AbstractC29845d.b) cell).getContent(), z4, z19, c28655q, (i16 & 910) | ((i16 >> 3) & 7168), 0);
                                c28655q.m87173q(false);
                            } else {
                                if (cell instanceof AbstractC29845d.d) {
                                    throw AbstractC11895b.m32003v(-47338185, c28655q, false);
                                }
                                c28655q.m87150e0(-47302851);
                                m91351o(interfaceC22997s1, ((AbstractC29845d.d) cell).getImage(), c28655q, i16 & 14);
                                c28655q.m87173q(false);
                            }
                        }
                        z15 = z19;
                    }
                }
            }
            z19 = z18;
            z15 = z19;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13171d(interfaceC22997s1, cell, z4, z13, z15, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m91360x(InterfaceC22997s1 interfaceC22997s1, AbstractC29845d abstractC29845d, boolean z4, boolean z13, boolean z14, int i13, int i14, Composer composer, int i15) {
        m91359w(interfaceC22997s1, abstractC29845d, z4, z13, z14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
