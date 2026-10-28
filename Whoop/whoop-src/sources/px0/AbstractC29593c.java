package px0;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp0.C10941a;
import eo2.C13392l;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import j02.EnumC21172v;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25249h0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27271o0;
import ny0.AbstractC27292z;
import os0.C28308d;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.C23134m1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p72.C28958a;
import p725ot1.C28329e;
import pc3.C29096r;
import pt2.C29529k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: px0.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001am\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u001a\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\r2\b\b\u0002\u0010!\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lpx0/d;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onPush", "onPresent", "Lkotlin/Function1;", "Lj02/v;", "onDismiss", "onClearLog", "onNavigateBack", "o", "(Lpx0/d;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "title", "x", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lpx0/f;", "group", "z", "(Lpx0/f;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "Ly3/f;", "cornerRadius", "G", "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;", "Lpx0/e;", "entry", "B", "(Lpx0/e;Landroidx/compose/runtime/Composer;I)V", "style", "modifier", "D", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29593c {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m90732A(C29596f c29596f, int i13, Composer composer, int i14) {
        m90765z(c29596f, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    private static final void m90733B(C29595e c29595e, Composer composer, int i13) {
        int i14;
        long jM125379a1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1557854938);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(c29595e) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13 * 0.5f, 7), 2, f14);
            if (c29595e.getIsCurrent()) {
                c28655q.m87150e0(1844999469);
                jM125379a1 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1845000460);
                jM125379a1 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                c28655q.m87173q(false);
            }
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, jM125379a1, AbstractC17918w0.f69621a);
            float f15 = 1;
            float f16 = f13 * f15;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3358c, f16, f15 * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            String str = c29595e.getIsCurrent() ? "▸" : " ";
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8422c = c38072d.m121952e(c28655q, i15).getB3();
            long jM125377a = c38072d.m121949b(c28655q, i15).getAccentAction();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, null, jM125377a, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q, 0, i16, 196602);
            AbstractC30795n.m94707h(c29595e.getIndex(), AbstractC1102d.m3424u(f14 * f14, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 48, i16, 196600);
            m90735D(c29595e.getStyle(), AbstractC1102d.m3424u(18 * f14, c2314t), c28655q, 48, 0);
            String strM90770b = c29595e.getName();
            C2886a c2886aM8422c2 = c38072d.m121952e(c28655q, i15).getB3();
            long jM125386d = c38072d.m121949b(c28655q, i15).getAccentFocus();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM90770b, new LayoutWeightElement(1.0f, true), jM125386d, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q, 0, i16, 196600);
            c28655q = c28655q;
            if (c29595e.getIsBoundary()) {
                c28655q.m87150e0(-534286337);
                AbstractC30795n.m94707h("BOUNDARY", null, c38072d.m121949b(c28655q, i15).getCoachBlue(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB4(), null, c28655q, 6, i16, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-534121696);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c29595e, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m90734C(C29595e c29595e, int i13, Composer composer, int i14) {
        m90733B(c29595e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0161  */
    /* JADX WARN: Code duplicated, block: B:48:0x016d  */
    /* JADX WARN: Code duplicated, block: B:49:0x017b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    private static final void m90735D(String str, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C13392l c13392l;
        Modifier modifier4;
        String upperCase;
        long jM125385c1;
        long jM95628d;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1298547918);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (AbstractC39414r.m125890i0(str)) {
                    c28655q2.m87150e0(-270502954);
                    AbstractC22953f.m66715b(c28655q2, modifier4);
                    c28655q2.m87173q(false);
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    } else {
                        c13392l = new C13392l(str, modifier4, i13, i14, 5);
                    }
                } else {
                    c28655q2.m87150e0(-270447216);
                    c28655q2.m87173q(false);
                    upperCase = str.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    if (upperCase.equals("ROOT")) {
                        c28655q2.m87150e0(-270337631);
                        C38072d c38072d = C38072d.f163053a;
                        int i17 = C38072d.f163054b;
                        jM125385c1 = c38072d.m121949b(c28655q2, i17).getAccentPositiveTrend();
                        jM95628d = c38072d.m121949b(c28655q2, i17).getAccentPositiveTrend15();
                        c28655q2.m87173q(false);
                    } else if (upperCase.equals("PRESENT")) {
                        c28655q2.m87150e0(-270172556);
                        C38072d c38072d2 = C38072d.f163053a;
                        int i18 = C38072d.f163054b;
                        jM125385c1 = c38072d2.m121949b(c28655q2, i18).getCoachBlue();
                        jM95628d = C17919x.m51541c(0.15f, c38072d2.m121949b(c28655q2, i18).getCoachBlue());
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-270001157);
                        C38072d c38072d3 = C38072d.f163053a;
                        int i19 = C38072d.f163054b;
                        jM125385c1 = c38072d3.m121949b(c28655q2, i19).getWhite70();
                        jM95628d = AbstractC31061c.m95628d(c38072d3, c28655q2, i19, false);
                    }
                    float f13 = 1 * 4;
                    c28655q = c28655q2;
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier4, AbstractC33253j.m105489e(f13)), jM95628d, AbstractC17918w0.f69621a), 0.0f, f13, 1), jM125385c1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB4(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196088);
                    modifier3 = modifier4;
                }
                c28677v1M87180u.f115982d = c13392l;
            }
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c13392l = new C13392l(str, modifier3, i13, i14, 6);
                c28677v1M87180u.f115982d = c13392l;
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (AbstractC39414r.m125890i0(str)) {
                c28655q2.m87150e0(-270502954);
                AbstractC22953f.m66715b(c28655q2, modifier4);
                c28655q2.m87173q(false);
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                } else {
                    c13392l = new C13392l(str, modifier4, i13, i14, 5);
                }
            } else {
                c28655q2.m87150e0(-270447216);
                c28655q2.m87173q(false);
                upperCase = str.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                if (upperCase.equals("ROOT")) {
                    c28655q2.m87150e0(-270337631);
                    C38072d c38072d4 = C38072d.f163053a;
                    int i110 = C38072d.f163054b;
                    jM125385c1 = c38072d4.m121949b(c28655q2, i110).getAccentPositiveTrend();
                    jM95628d = c38072d4.m121949b(c28655q2, i110).getAccentPositiveTrend15();
                    c28655q2.m87173q(false);
                } else if (upperCase.equals("PRESENT")) {
                    c28655q2.m87150e0(-270172556);
                    C38072d c38072d5 = C38072d.f163053a;
                    int i111 = C38072d.f163054b;
                    jM125385c1 = c38072d5.m121949b(c28655q2, i111).getCoachBlue();
                    jM95628d = C17919x.m51541c(0.15f, c38072d5.m121949b(c28655q2, i111).getCoachBlue());
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-270001157);
                    C38072d c38072d6 = C38072d.f163053a;
                    int i112 = C38072d.f163054b;
                    jM125385c1 = c38072d6.m121949b(c28655q2, i112).getWhite70();
                    jM95628d = AbstractC31061c.m95628d(c38072d6, c28655q2, i112, false);
                }
                float f14 = 1 * 4;
                c28655q = c28655q2;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier4, AbstractC33253j.m105489e(f14)), jM95628d, AbstractC17918w0.f69621a), 0.0f, f14, 1), jM125385c1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getB4(), null, c28655q, i15 & 14, C2886a.f11498d << 18, 196088);
                modifier3 = modifier4;
            }
            c28677v1M87180u.f115982d = c13392l;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c13392l = new C13392l(str, modifier3, i13, i14, 6);
            c28677v1M87180u.f115982d = c13392l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m90736E(String str, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m90735D(str, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m90737F(String str, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m90735D(str, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private static final Modifier m90738G(Modifier modifier, long j7, float f13) {
        return AbstractC1125a.m3478a(modifier, new C23134m1(j7, f13, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m90739H(long j7, float f13, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(f13);
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), new C22135i(drawBehind.mo743q0(1), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{drawBehind.mo743q0(6), drawBehind.mo743q0(4)}, 0.0f)), 14), 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0135  */
    /* JADX WARN: Code duplicated, block: B:103:0x01af  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:112:0x0247  */
    /* JADX WARN: Code duplicated, block: B:113:0x024d  */
    /* JADX WARN: Code duplicated, block: B:116:0x025a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0268  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e2 A[LOOP:0: B:120:0x02d5->B:122:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x031e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0322  */
    /* JADX WARN: Code duplicated, block: B:129:0x0335  */
    /* JADX WARN: Code duplicated, block: B:131:0x0343  */
    /* JADX WARN: Code duplicated, block: B:135:0x0355  */
    /* JADX WARN: Code duplicated, block: B:138:0x0361  */
    /* JADX WARN: Code duplicated, block: B:139:0x0363  */
    /* JADX WARN: Code duplicated, block: B:143:0x0390  */
    /* JADX WARN: Code duplicated, block: B:146:0x0399  */
    /* JADX WARN: Code duplicated, block: B:147:0x039b  */
    /* JADX WARN: Code duplicated, block: B:151:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x040a  */
    /* JADX WARN: Code duplicated, block: B:154:0x040c  */
    /* JADX WARN: Code duplicated, block: B:157:0x041c  */
    /* JADX WARN: Code duplicated, block: B:160:0x0421  */
    /* JADX WARN: Code duplicated, block: B:161:0x0424  */
    /* JADX WARN: Code duplicated, block: B:166:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:167:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:170:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:175:0x052f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0531  */
    /* JADX WARN: Code duplicated, block: B:179:0x0538 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x053e  */
    /* JADX WARN: Code duplicated, block: B:185:0x0592  */
    /* JADX WARN: Code duplicated, block: B:187:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:190:0x05ed A[LOOP:2: B:188:0x05e7->B:190:0x05ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x0657  */
    /* JADX WARN: Code duplicated, block: B:196:0x0667  */
    /* JADX WARN: Code duplicated, block: B:198:0x02ed A[EDGE_INSN: B:198:0x02ed->B:123:0x02ed BREAK  A[LOOP:0: B:120:0x02d5->B:122:0x02e2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX INFO: renamed from: o */
    public static final void m90754o(C29594d state, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a5;
        int i15;
        int i16;
        int i17;
        Function1 function2;
        int i18;
        int i19;
        InterfaceC4339a interfaceC4339a6;
        int i24;
        int i25;
        int i26;
        boolean z4;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        Function1 function3;
        InterfaceC4339a interfaceC4339a10;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a11;
        InterfaceC4339a interfaceC4339a12;
        Function1 function4;
        InterfaceC4339a interfaceC4339a13;
        InterfaceC4339a interfaceC4339a14;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i27;
        C28676v0 c28676v1;
        Function1 function5;
        int iHashCode2;
        Iterator it;
        ListIterator listIterator;
        boolean z13;
        float f13;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i2;
        float f14;
        float f15;
        C28655q c28655q;
        int i28;
        float f16;
        int iHashCode4;
        C0213j c0213j3;
        C0209i c0209i3;
        C38072d c38072d;
        int i29;
        int i34;
        C28655q c28655q2;
        boolean z14;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a16;
        int i35;
        boolean z15;
        boolean zM87149e;
        Object objM87133R2;
        C28676v0 c28676v2;
        Function1 function6;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        C2306l c2306l = C2299e.f9107J;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(797559643);
        int i36 = (i13 & 6) == 0 ? (c28655q3.m87157i(state) ? 4 : 2) | i13 : i13;
        int i37 = i14 & 2;
        if (i37 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a5 = interfaceC4339a;
                i36 |= c28655q3.m87157i(interfaceC4339a5) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i36 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q3.m87157i(function2)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i36 |= i18;
                    }
                    i19 = i14 & 16;
                    if (i19 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a6 = interfaceC4339a3;
                            if (c28655q3.m87157i(interfaceC4339a6)) {
                                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i24 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i36 |= i24;
                        }
                        i25 = i14 & 32;
                        if (i25 != 0) {
                            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q3.m87157i(interfaceC4339a4)) {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i36 |= i26;
                        }
                        if ((i36 & 74899) != 74898) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q3.m87135U(i36 & 1, z4)) {
                            c28676v0 = C28635l.f115821a;
                            if (i37 != 0) {
                                objM87133R7 = c28655q3.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C29096r(18);
                                    c28655q3.m87172p0(objM87133R7);
                                }
                                interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                            } else {
                                interfaceC4339a11 = interfaceC4339a5;
                            }
                            if (i15 != 0) {
                                objM87133R6 = c28655q3.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C29096r(19);
                                    c28655q3.m87172p0(objM87133R6);
                                }
                                interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                            } else {
                                interfaceC4339a12 = interfaceC4339a2;
                            }
                            if (i17 != 0) {
                                objM87133R5 = c28655q3.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C29529k(13);
                                    c28655q3.m87172p0(objM87133R5);
                                }
                                function4 = (Function1) objM87133R5;
                            } else {
                                function4 = function2;
                            }
                            if (i19 != 0) {
                                objM87133R4 = c28655q3.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C29096r(20);
                                    c28655q3.m87172p0(objM87133R4);
                                }
                                interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                            } else {
                                interfaceC4339a13 = interfaceC4339a6;
                            }
                            if (i25 != 0) {
                                objM87133R3 = c28655q3.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C29096r(21);
                                    c28655q3.m87172p0(objM87133R3);
                                }
                                interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                            } else {
                                interfaceC4339a14 = interfaceC4339a4;
                            }
                            c2314t = C2314t.f9131w;
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                            C38072d c38072d2 = C38072d.f163053a;
                            int i38 = C38072d.f163054b;
                            interfaceC4339a15 = interfaceC4339a13;
                            float f17 = 8;
                            float f18 = 3 * f17;
                            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d, c38072d2.m121949b(c28655q3, i38).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f18, 7);
                            C22957g c22957g = AbstractC22977m.f90652c;
                            C2305k c2305k = C2299e.f9110M;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                            iHashCode = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q3.m87158i0();
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a11;
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            C0209i c0209i4 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
                            C0209i c0209i5 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            InterfaceC4339a interfaceC4339a18 = interfaceC4339a12;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                            }
                            C0209i c0209i6 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N);
                            i27 = i36;
                            c28676v1 = c28676v0;
                            function5 = function4;
                            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                            InterfaceC4339a interfaceC4339a19 = interfaceC4339a14;
                            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f17, 0.0f, 2);
                            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                            iHashCode2 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a2);
                            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N2);
                            AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d2.m121949b(c28655q3, i38).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q3, i38).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                            m90763x("Back stack", c28655q3, 6);
                            c28655q3.m87150e0(1705700877);
                            it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                            while (true) {
                                listIterator = (ListIterator) ((C25249h0) it).f99126x;
                                if (listIterator.hasPrevious()) {
                                    break;
                                } else {
                                    m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                                }
                            }
                            c28655q3.m87173q(false);
                            m90763x("NAVIGATE", c28655q3, 6);
                            z13 = true;
                            f13 = 1 * f17;
                            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                            iHashCode3 = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t);
                            InterfaceC0221l.f734a.getClass();
                            c0213j2 = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j2);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                            c0209i2 = C0217k.f732j;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f14 = Float.MAX_VALUE;
                            } else {
                                f14 = 1.0f;
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
                            TextResource textResourceM21278l = AbstractC8693b.m21278l("Push");
                            int i39 = TextResource.$stable;
                            AbstractC27271o0.m82253b(layoutWeightElement, false, textResourceM21278l, null, null, null, null, null, false, null, interfaceC4339a17, c28655q3, i39 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                            if (1.0f <= 0.0d) {
                                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f15 = Float.MAX_VALUE;
                            } else {
                                f15 = 1.0f;
                            }
                            AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a18, c28655q3, i39 << 18, (i27 << 3) & 7168, 8126);
                            c28655q = c28655q3;
                            c28655q.m87173q(true);
                            m90763x("DISMISS WITH", c28655q, 6);
                            c28655q.m87150e0(1705721970);
                            for (EnumC21172v enumC21172v : EnumC21172v.getEntries()) {
                                float f19 = f13;
                                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f19, 7);
                                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(enumC21172v.name());
                                i35 = i27;
                                if ((i35 & 7168) == 2048) {
                                    z15 = z13;
                                } else {
                                    z15 = false;
                                }
                                zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                                objM87133R2 = c28655q.m87133R();
                                if (zM87149e) {
                                    c28676v2 = c28676v1;
                                } else {
                                    c28676v2 = c28676v1;
                                    if (objM87133R2 == c28676v2) {
                                        function6 = function5;
                                    }
                                    C28655q c28655q4 = c28655q;
                                    AbstractC27271o0.m82253b(modifierM3398t2, false, textResourceM21278l2, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q4, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                    c28676v1 = c28676v2;
                                    function5 = function6;
                                    i27 = i35;
                                    c28655q = c28655q4;
                                    f13 = f19;
                                    z13 = true;
                                }
                                function6 = function5;
                                objM87133R2 = new C28448b(24, function6, enumC21172v);
                                c28655q.m87172p0(objM87133R2);
                                C28655q c28655q5 = c28655q;
                                AbstractC27271o0.m82253b(modifierM3398t2, false, textResourceM21278l2, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q5, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                c28676v1 = c28676v2;
                                function5 = function6;
                                i27 = i35;
                                c28655q = c28655q5;
                                f13 = f19;
                                z13 = true;
                            }
                            Function1 function7 = function5;
                            C28676v0 c28676v3 = c28676v1;
                            i28 = i27;
                            c28655q.m87173q(false);
                            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f18, 0.0f, f13, 5);
                            f16 = f13;
                            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                            iHashCode4 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                            InterfaceC0221l.f734a.getClass();
                            c0213j3 = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j3);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                            c0209i3 = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                            c38072d = C38072d.f163053a;
                            i29 = C38072d.f163054b;
                            C2886a c2886aM8439t = c38072d.m121952e(c28655q, i29).getH6();
                            long jM125382b1 = c38072d.m121949b(c28655q, i29).getWhite50();
                            i34 = C2886a.f11498d << 18;
                            c28655q2 = c28655q;
                            AbstractC30795n.m94707h("LOG", null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q2, 6, i34, 196602);
                            C2886a c2886aM8422c = c38072d.m121952e(c28655q2, i29).getB3();
                            long jM125382b2 = c38072d.m121949b(c28655q2, i29).getWhite50();
                            if ((57344 & i28) == 16384) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (!z14 || objM87133R == c28676v3) {
                                interfaceC4339a16 = interfaceC4339a15;
                                objM87133R = new C28329e(interfaceC4339a16, 16);
                                c28655q2.m87172p0(objM87133R);
                            } else {
                                interfaceC4339a16 = interfaceC4339a15;
                            }
                            AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c, null, c28655q2, 6, i34, 196600);
                            c28655q3 = c28655q2;
                            c28655q3.m87173q(true);
                            if (state.m90766a().isEmpty()) {
                                c28655q3.m87150e0(1338853219);
                                AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                                c28655q3 = c28655q3;
                                c28655q3.m87173q(false);
                            } else {
                                c28655q3.m87150e0(1339061229);
                                for (String str : state.m90766a()) {
                                    C38072d c38072d3 = C38072d.f163053a;
                                    int i44 = C38072d.f163054b;
                                    C28655q c28655q6 = c28655q3;
                                    AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d3.m121949b(c28655q3, i44).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q3, i44).getB3(), null, c28655q6, 48, C2886a.f11498d << 18, 196600);
                                    c28655q3 = c28655q6;
                                }
                                c28655q3.m87173q(false);
                            }
                            c28655q3.m87173q(true);
                            c28655q3.m87173q(true);
                            function3 = function7;
                            interfaceC4339a10 = interfaceC4339a16;
                            interfaceC4339a9 = interfaceC4339a17;
                            interfaceC4339a7 = interfaceC4339a18;
                            interfaceC4339a8 = interfaceC4339a19;
                        } else {
                            c28655q3.m87138X();
                            interfaceC4339a7 = interfaceC4339a2;
                            interfaceC4339a8 = interfaceC4339a4;
                            interfaceC4339a9 = interfaceC4339a5;
                            function3 = function2;
                            interfaceC4339a10 = interfaceC4339a6;
                        }
                        c28677v1M87180u = c28655q3.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                        }
                    }
                    i36 |= 24576;
                    interfaceC4339a6 = interfaceC4339a3;
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i36 |= i26;
                    }
                    if ((i36 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i36 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i37 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29096r(18);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i15 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29096r(19);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a12 = interfaceC4339a2;
                        }
                        if (i17 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C29529k(13);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        } else {
                            function4 = function2;
                        }
                        if (i19 != 0) {
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C29096r(20);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a13 = interfaceC4339a6;
                        }
                        if (i25 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C29096r(21);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a14 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C38072d c38072d4 = C38072d.f163053a;
                        int i310 = C38072d.f163054b;
                        interfaceC4339a15 = interfaceC4339a13;
                        float f110 = 8;
                        float f111 = 3 * f110;
                        Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d2, c38072d4.m121949b(c28655q3, i310).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f111, 7);
                        C22957g c22957g2 = AbstractC22977m.f90652c;
                        C2305k c2305k2 = C2299e.f9110M;
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a11;
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i7 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a3);
                        C0209i c0209i8 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a12;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N5);
                        i27 = i36;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a14;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 2 * f110, 0.0f, 2);
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3396r2);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i7, c23010xM66775a4);
                        AbstractC28683x.m87239G(c28655q3, c0209i8, interfaceC28653p1M87165m6);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N6);
                        AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d4.m121949b(c28655q3, i310).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q3, i310).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                        m90763x("Back stack", c28655q3, 6);
                        c28655q3.m87150e0(1705700877);
                        it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                        while (true) {
                            listIterator = (ListIterator) ((C25249h0) it).f99126x;
                            if (listIterator.hasPrevious()) {
                                break;
                                break;
                            }
                            m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                        }
                        c28655q3.m87173q(false);
                        m90763x("NAVIGATE", c28655q3, 6);
                        z13 = true;
                        f13 = 1 * f110;
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f14, true);
                        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("Push");
                        int i311 = TextResource.$stable;
                        AbstractC27271o0.m82253b(layoutWeightElement2, false, textResourceM21278l3, null, null, null, null, null, false, null, interfaceC4339a110, c28655q3, i311 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a111, c28655q3, i311 << 18, (i27 << 3) & 7168, 8126);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        m90763x("DISMISS WITH", c28655q, 6);
                        c28655q.m87150e0(1705721970);
                        while (r4.hasNext()) {
                            float f112 = f13;
                            Modifier modifierM3398t5 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f112, 7);
                            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(enumC21172v.name());
                            i35 = i27;
                            if ((i35 & 7168) == 2048) {
                                z15 = z13;
                            } else {
                                z15 = false;
                            }
                            zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v2 = c28676v1;
                                if (objM87133R2 == c28676v2) {
                                    function6 = function5;
                                }
                                C28655q c28655q7 = c28655q;
                                AbstractC27271o0.m82253b(modifierM3398t5, false, textResourceM21278l4, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q7, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                c28676v1 = c28676v2;
                                function5 = function6;
                                i27 = i35;
                                c28655q = c28655q7;
                                f13 = f112;
                                z13 = true;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function6 = function5;
                            objM87133R2 = new C28448b(24, function6, enumC21172v);
                            c28655q.m87172p0(objM87133R2);
                            C28655q c28655q8 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t5, false, textResourceM21278l4, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q8, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q8;
                            f13 = f112;
                            z13 = true;
                        }
                        Function1 function8 = function5;
                        C28676v0 c28676v4 = c28676v1;
                        i28 = i27;
                        c28655q.m87173q(false);
                        Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111, 0.0f, f13, 5);
                        f16 = f13;
                        C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                        c38072d = C38072d.f163053a;
                        i29 = C38072d.f163054b;
                        C2886a c2886aM8439t2 = c38072d.m121952e(c28655q, i29).getH6();
                        long jM125382b3 = c38072d.m121949b(c28655q, i29).getWhite50();
                        i34 = C2886a.f11498d << 18;
                        c28655q2 = c28655q;
                        AbstractC30795n.m94707h("LOG", null, jM125382b3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t2, null, c28655q2, 6, i34, 196602);
                        C2886a c2886aM8422c2 = c38072d.m121952e(c28655q2, i29).getB3();
                        long jM125382b4 = c38072d.m121949b(c28655q2, i29).getWhite50();
                        if ((57344 & i28) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c2, null, c28655q2, 6, i34, 196600);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        if (state.m90766a().isEmpty()) {
                            c28655q3.m87150e0(1338853219);
                            AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        } else {
                            c28655q3.m87150e0(1339061229);
                            while (r0.hasNext()) {
                                C38072d c38072d5 = C38072d.f163053a;
                                int i45 = C38072d.f163054b;
                                C28655q c28655q9 = c28655q3;
                                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d5.m121949b(c28655q3, i45).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q3, i45).getB3(), null, c28655q9, 48, C2886a.f11498d << 18, 196600);
                                c28655q3 = c28655q9;
                            }
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        function3 = function8;
                        interfaceC4339a10 = interfaceC4339a16;
                        interfaceC4339a9 = interfaceC4339a110;
                        interfaceC4339a7 = interfaceC4339a111;
                        interfaceC4339a8 = interfaceC4339a112;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4339a7 = interfaceC4339a2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        function3 = function2;
                        interfaceC4339a10 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                    }
                }
                i36 |= 3072;
                function2 = function1;
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q3.m87157i(interfaceC4339a6)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i36 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i36 |= i26;
                    }
                    if ((i36 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i36 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i37 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29096r(18);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i15 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29096r(19);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a12 = interfaceC4339a2;
                        }
                        if (i17 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C29529k(13);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        } else {
                            function4 = function2;
                        }
                        if (i19 != 0) {
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C29096r(20);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a13 = interfaceC4339a6;
                        }
                        if (i25 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C29096r(21);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a14 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i312 = C38072d.f163054b;
                        interfaceC4339a15 = interfaceC4339a13;
                        float f113 = 8;
                        float f114 = 3 * f113;
                        Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d3, c38072d6.m121949b(c28655q3, i312).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f114, 7);
                        C22957g c22957g3 = AbstractC22977m.f90652c;
                        C2305k c2305k3 = C2299e.f9110M;
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3398t7);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a11;
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a5);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a114 = interfaceC4339a12;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        C0209i c0209i12 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N9);
                        i27 = i36;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                        InterfaceC4339a interfaceC4339a115 = interfaceC4339a14;
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 2 * f113, 0.0f, 2);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q3, 0);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3396r3);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i10, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q3, c0209i11, interfaceC28653p1M87165m10);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N10);
                        AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d6.m121949b(c28655q3, i312).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q3, i312).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                        m90763x("Back stack", c28655q3, 6);
                        c28655q3.m87150e0(1705700877);
                        it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                        while (true) {
                            listIterator = (ListIterator) ((C25249h0) it).f99126x;
                            if (listIterator.hasPrevious()) {
                                break;
                                break;
                            }
                            m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                        }
                        c28655q3.m87173q(false);
                        m90763x("NAVIGATE", c28655q3, 6);
                        z13 = true;
                        f13 = 1 * f113;
                        C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a5);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f14, true);
                        TextResource textResourceM21278l5 = AbstractC8693b.m21278l("Push");
                        int i313 = TextResource.$stable;
                        AbstractC27271o0.m82253b(layoutWeightElement3, false, textResourceM21278l5, null, null, null, null, null, false, null, interfaceC4339a113, c28655q3, i313 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a114, c28655q3, i313 << 18, (i27 << 3) & 7168, 8126);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        m90763x("DISMISS WITH", c28655q, 6);
                        c28655q.m87150e0(1705721970);
                        while (r4.hasNext()) {
                            float f115 = f13;
                            Modifier modifierM3398t8 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f115, 7);
                            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(enumC21172v.name());
                            i35 = i27;
                            if ((i35 & 7168) == 2048) {
                                z15 = z13;
                            } else {
                                z15 = false;
                            }
                            zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v2 = c28676v1;
                                if (objM87133R2 == c28676v2) {
                                    function6 = function5;
                                }
                                C28655q c28655q10 = c28655q;
                                AbstractC27271o0.m82253b(modifierM3398t8, false, textResourceM21278l6, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q10, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                c28676v1 = c28676v2;
                                function5 = function6;
                                i27 = i35;
                                c28655q = c28655q10;
                                f13 = f115;
                                z13 = true;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function6 = function5;
                            objM87133R2 = new C28448b(24, function6, enumC21172v);
                            c28655q.m87172p0(objM87133R2);
                            C28655q c28655q11 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t8, false, textResourceM21278l6, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q11;
                            f13 = f115;
                            z13 = true;
                        }
                        Function1 function9 = function5;
                        C28676v0 c28676v5 = c28676v1;
                        i28 = i27;
                        c28655q.m87173q(false);
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f114, 0.0f, f13, 5);
                        f16 = f13;
                        C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                        Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3398t9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                        c38072d = C38072d.f163053a;
                        i29 = C38072d.f163054b;
                        C2886a c2886aM8439t3 = c38072d.m121952e(c28655q, i29).getH6();
                        long jM125382b5 = c38072d.m121949b(c28655q, i29).getWhite50();
                        i34 = C2886a.f11498d << 18;
                        c28655q2 = c28655q;
                        AbstractC30795n.m94707h("LOG", null, jM125382b5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t3, null, c28655q2, 6, i34, 196602);
                        C2886a c2886aM8422c3 = c38072d.m121952e(c28655q2, i29).getB3();
                        long jM125382b6 = c38072d.m121949b(c28655q2, i29).getWhite50();
                        if ((57344 & i28) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c3, null, c28655q2, 6, i34, 196600);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        if (state.m90766a().isEmpty()) {
                            c28655q3.m87150e0(1338853219);
                            AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        } else {
                            c28655q3.m87150e0(1339061229);
                            while (r0.hasNext()) {
                                C38072d c38072d7 = C38072d.f163053a;
                                int i46 = C38072d.f163054b;
                                C28655q c28655q12 = c28655q3;
                                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d7.m121949b(c28655q3, i46).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q3, i46).getB3(), null, c28655q12, 48, C2886a.f11498d << 18, 196600);
                                c28655q3 = c28655q12;
                            }
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        function3 = function9;
                        interfaceC4339a10 = interfaceC4339a16;
                        interfaceC4339a9 = interfaceC4339a113;
                        interfaceC4339a7 = interfaceC4339a114;
                        interfaceC4339a8 = interfaceC4339a115;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4339a7 = interfaceC4339a2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        function3 = function2;
                        interfaceC4339a10 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                    }
                }
                i36 |= 24576;
                interfaceC4339a6 = interfaceC4339a3;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d8 = C38072d.f163053a;
                    int i314 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f116 = 8;
                    float f117 = 3 * f116;
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d4, c38072d8.m121949b(c28655q3, i314).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f117, 7);
                    C22957g c22957g4 = AbstractC22977m.f90652c;
                    C2305k c2305k4 = C2299e.f9110M;
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3398t10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a116 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i13 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a7);
                    C0209i c0209i14 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i15 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N13);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a14;
                    Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, 2 * f116, 0.0f, 2);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, modifierM3396r4);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i13, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q3, c0209i14, interfaceC28653p1M87165m14);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i15, modifierM118962N14);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d8.m121949b(c28655q3, i314).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d8.m121952e(c28655q3, i314).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f116;
                    C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a7);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m15);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N15);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l7 = AbstractC8693b.m21278l("Push");
                    int i315 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement4, false, textResourceM21278l7, null, null, null, null, null, false, null, interfaceC4339a116, c28655q3, i315 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a117, c28655q3, i315 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f118 = f13;
                        Modifier modifierM3398t11 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f118, 7);
                        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q13 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t11, false, textResourceM21278l8, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q13, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q13;
                            f13 = f118;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q14 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t11, false, textResourceM21278l8, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q14, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q14;
                        f13 = f118;
                        z13 = true;
                    }
                    Function1 function10 = function5;
                    C28676v0 c28676v6 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t12 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f117, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3398t12);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t4 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b7 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t4, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c4 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b8 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c4, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d9 = C38072d.f163053a;
                            int i47 = C38072d.f163054b;
                            C28655q c28655q15 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d9.m121949b(c28655q3, i47).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d9.m121952e(c28655q3, i47).getB3(), null, c28655q15, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q15;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function10;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a116;
                    interfaceC4339a7 = interfaceC4339a117;
                    interfaceC4339a8 = interfaceC4339a118;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 384;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q3.m87157i(function2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i36 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q3.m87157i(interfaceC4339a6)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i36 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i36 |= i26;
                    }
                    if ((i36 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i36 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i37 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29096r(18);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i15 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29096r(19);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a12 = interfaceC4339a2;
                        }
                        if (i17 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C29529k(13);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        } else {
                            function4 = function2;
                        }
                        if (i19 != 0) {
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C29096r(20);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a13 = interfaceC4339a6;
                        }
                        if (i25 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C29096r(21);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a14 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C38072d c38072d10 = C38072d.f163053a;
                        int i316 = C38072d.f163054b;
                        interfaceC4339a15 = interfaceC4339a13;
                        float f119 = 8;
                        float f1110 = 3 * f119;
                        Modifier modifierM3398t13 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d5, c38072d10.m121949b(c28655q3, i316).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1110, 7);
                        C22957g c22957g5 = AbstractC22977m.f90652c;
                        C2305k c2305k5 = C2299e.f9110M;
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q3.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q3, modifierM3398t13);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        InterfaceC4339a interfaceC4339a119 = interfaceC4339a11;
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i16 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i16, c23010xM66775a9);
                        C0209i c0209i17 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i17, interfaceC28653p1M87165m17);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a1110 = interfaceC4339a12;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        C0209i c0209i18 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i18, modifierM118962N17);
                        i27 = i36;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                        InterfaceC4339a interfaceC4339a1111 = interfaceC4339a14;
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 2 * f119, 0.0f, 2);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g5, c2305k5, c28655q3, 0);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q3.m87165m();
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q3, modifierM3396r5);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i16, c23010xM66775a10);
                        AbstractC28683x.m87239G(c28655q3, c0209i17, interfaceC28653p1M87165m18);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i18, modifierM118962N18);
                        AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d10.m121949b(c28655q3, i316).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d10.m121952e(c28655q3, i316).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                        m90763x("Back stack", c28655q3, 6);
                        c28655q3.m87150e0(1705700877);
                        it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                        while (true) {
                            listIterator = (ListIterator) ((C25249h0) it).f99126x;
                            if (listIterator.hasPrevious()) {
                                break;
                                break;
                            }
                            m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                        }
                        c28655q3.m87173q(false);
                        m90763x("NAVIGATE", c28655q3, 6);
                        z13 = true;
                        f13 = 1 * f119;
                        C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q3.m87165m();
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a9);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m19);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N19);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(f14, true);
                        TextResource textResourceM21278l9 = AbstractC8693b.m21278l("Push");
                        int i317 = TextResource.$stable;
                        AbstractC27271o0.m82253b(layoutWeightElement5, false, textResourceM21278l9, null, null, null, null, null, false, null, interfaceC4339a119, c28655q3, i317 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1110, c28655q3, i317 << 18, (i27 << 3) & 7168, 8126);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        m90763x("DISMISS WITH", c28655q, 6);
                        c28655q.m87150e0(1705721970);
                        while (r4.hasNext()) {
                            float f1111 = f13;
                            Modifier modifierM3398t14 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f1111, 7);
                            TextResource textResourceM21278l10 = AbstractC8693b.m21278l(enumC21172v.name());
                            i35 = i27;
                            if ((i35 & 7168) == 2048) {
                                z15 = z13;
                            } else {
                                z15 = false;
                            }
                            zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v2 = c28676v1;
                                if (objM87133R2 == c28676v2) {
                                    function6 = function5;
                                }
                                C28655q c28655q16 = c28655q;
                                AbstractC27271o0.m82253b(modifierM3398t14, false, textResourceM21278l10, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q16, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                c28676v1 = c28676v2;
                                function5 = function6;
                                i27 = i35;
                                c28655q = c28655q16;
                                f13 = f1111;
                                z13 = true;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function6 = function5;
                            objM87133R2 = new C28448b(24, function6, enumC21172v);
                            c28655q.m87172p0(objM87133R2);
                            C28655q c28655q17 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t14, false, textResourceM21278l10, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q17, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q17;
                            f13 = f1111;
                            z13 = true;
                        }
                        Function1 function11 = function5;
                        C28676v0 c28676v7 = c28676v1;
                        i28 = i27;
                        c28655q.m87173q(false);
                        Modifier modifierM3398t15 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1110, 0.0f, f13, 5);
                        f16 = f13;
                        C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3398t15);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m110);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N110);
                        c38072d = C38072d.f163053a;
                        i29 = C38072d.f163054b;
                        C2886a c2886aM8439t5 = c38072d.m121952e(c28655q, i29).getH6();
                        long jM125382b9 = c38072d.m121949b(c28655q, i29).getWhite50();
                        i34 = C2886a.f11498d << 18;
                        c28655q2 = c28655q;
                        AbstractC30795n.m94707h("LOG", null, jM125382b9, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t5, null, c28655q2, 6, i34, 196602);
                        C2886a c2886aM8422c5 = c38072d.m121952e(c28655q2, i29).getB3();
                        long jM125382b10 = c38072d.m121949b(c28655q2, i29).getWhite50();
                        if ((57344 & i28) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b10, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c5, null, c28655q2, 6, i34, 196600);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        if (state.m90766a().isEmpty()) {
                            c28655q3.m87150e0(1338853219);
                            AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        } else {
                            c28655q3.m87150e0(1339061229);
                            while (r0.hasNext()) {
                                C38072d c38072d11 = C38072d.f163053a;
                                int i48 = C38072d.f163054b;
                                C28655q c28655q18 = c28655q3;
                                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d11.m121949b(c28655q3, i48).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d11.m121952e(c28655q3, i48).getB3(), null, c28655q18, 48, C2886a.f11498d << 18, 196600);
                                c28655q3 = c28655q18;
                            }
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        function3 = function11;
                        interfaceC4339a10 = interfaceC4339a16;
                        interfaceC4339a9 = interfaceC4339a119;
                        interfaceC4339a7 = interfaceC4339a1110;
                        interfaceC4339a8 = interfaceC4339a1111;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4339a7 = interfaceC4339a2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        function3 = function2;
                        interfaceC4339a10 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                    }
                }
                i36 |= 24576;
                interfaceC4339a6 = interfaceC4339a3;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d12 = C38072d.f163053a;
                    int i318 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f1112 = 8;
                    float f1113 = 3 * f1112;
                    Modifier modifierM3398t16 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d6, c38072d12.m121949b(c28655q3, i318).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1113, 7);
                    C22957g c22957g6 = AbstractC22977m.f90652c;
                    C2305k c2305k6 = C2299e.f9110M;
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q3.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q3, modifierM3398t16);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a1112 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i19 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i19, c23010xM66775a11);
                    C0209i c0209i110 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i110, interfaceC28653p1M87165m111);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a1113 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i111, modifierM118962N111);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a1114 = interfaceC4339a14;
                    Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 2 * f1112, 0.0f, 2);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g6, c2305k6, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q3.m87165m();
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q3, modifierM3396r6);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i19, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q3, c0209i110, interfaceC28653p1M87165m112);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i111, modifierM118962N112);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d12.m121949b(c28655q3, i318).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d12.m121952e(c28655q3, i318).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f1112;
                    C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q3.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a11);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m113);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N113);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l11 = AbstractC8693b.m21278l("Push");
                    int i319 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement6, false, textResourceM21278l11, null, null, null, null, null, false, null, interfaceC4339a1112, c28655q3, i319 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1113, c28655q3, i319 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f1114 = f13;
                        Modifier modifierM3398t17 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f1114, 7);
                        TextResource textResourceM21278l12 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q19 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t17, false, textResourceM21278l12, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q19, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q19;
                            f13 = f1114;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q110 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t17, false, textResourceM21278l12, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q110, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q110;
                        f13 = f1114;
                        z13 = true;
                    }
                    Function1 function12 = function5;
                    C28676v0 c28676v8 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t18 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1113, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                    Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3398t18);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m114);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N114);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t6 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b11 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b11, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t6, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c6 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b12 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b12, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c6, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d13 = C38072d.f163053a;
                            int i49 = C38072d.f163054b;
                            C28655q c28655q111 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d13.m121949b(c28655q3, i49).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d13.m121952e(c28655q3, i49).getB3(), null, c28655q111, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q111;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function12;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a1112;
                    interfaceC4339a7 = interfaceC4339a1113;
                    interfaceC4339a8 = interfaceC4339a1114;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 3072;
            function2 = function1;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q3.m87157i(interfaceC4339a6)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i36 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d14 = C38072d.f163053a;
                    int i3110 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f1115 = 8;
                    float f1116 = 3 * f1115;
                    Modifier modifierM3398t19 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d7, c38072d14.m121949b(c28655q3, i3110).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1116, 7);
                    C22957g c22957g7 = AbstractC22977m.f90652c;
                    C2305k c2305k7 = C2299e.f9110M;
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q3.m87165m();
                    Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q3, modifierM3398t19);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a1115 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i112, c23010xM66775a13);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i113, interfaceC28653p1M87165m115);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a1116 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i114 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i114, modifierM118962N115);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a1117 = interfaceC4339a14;
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, 2 * f1115, 0.0f, 2);
                    C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g7, c2305k7, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q3.m87165m();
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q3, modifierM3396r7);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i112, c23010xM66775a14);
                    AbstractC28683x.m87239G(c28655q3, c0209i113, interfaceC28653p1M87165m116);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i114, modifierM118962N116);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d14.m121949b(c28655q3, i3110).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d14.m121952e(c28655q3, i3110).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f1115;
                    C22994r1 c22994r1M66759a13 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q3.m87165m();
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a13);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m117);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N117);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l13 = AbstractC8693b.m21278l("Push");
                    int i3111 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement7, false, textResourceM21278l13, null, null, null, null, null, false, null, interfaceC4339a1115, c28655q3, i3111 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1116, c28655q3, i3111 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f1117 = f13;
                        Modifier modifierM3398t110 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f1117, 7);
                        TextResource textResourceM21278l14 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q112 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t110, false, textResourceM21278l14, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q112, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q112;
                            f13 = f1117;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q113 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t110, false, textResourceM21278l14, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q113, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q113;
                        f13 = f1117;
                        z13 = true;
                    }
                    Function1 function13 = function5;
                    C28676v0 c28676v9 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t111 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1116, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a14 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3398t111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m118);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N118);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t7 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b13 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t7, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c7 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b14 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b14, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c7, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d15 = C38072d.f163053a;
                            int i410 = C38072d.f163054b;
                            C28655q c28655q114 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d15.m121949b(c28655q3, i410).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d15.m121952e(c28655q3, i410).getB3(), null, c28655q114, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q114;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function13;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a1115;
                    interfaceC4339a7 = interfaceC4339a1116;
                    interfaceC4339a8 = interfaceC4339a1117;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 24576;
            interfaceC4339a6 = interfaceC4339a3;
            i25 = i14 & 32;
            if (i25 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a4)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i36 |= i26;
            }
            if ((i36 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i36 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i37 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29096r(18);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29096r(19);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a12 = interfaceC4339a2;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(13);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29096r(20);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a13 = interfaceC4339a6;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(21);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a14 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
                C38072d c38072d16 = C38072d.f163053a;
                int i3112 = C38072d.f163054b;
                interfaceC4339a15 = interfaceC4339a13;
                float f1118 = 8;
                float f1119 = 3 * f1118;
                Modifier modifierM3398t112 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d8, c38072d16.m121949b(c28655q3, i3112).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1119, 7);
                C22957g c22957g8 = AbstractC22977m.f90652c;
                C2305k c2305k8 = C2299e.f9110M;
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q3.m87165m();
                Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q3, modifierM3398t112);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                InterfaceC4339a interfaceC4339a1118 = interfaceC4339a11;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i115 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i115, c23010xM66775a15);
                C0209i c0209i116 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i116, interfaceC28653p1M87165m119);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a1119 = interfaceC4339a12;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i117, modifierM118962N119);
                i27 = i36;
                c28676v1 = c28676v0;
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a11110 = interfaceC4339a14;
                Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, 2 * f1118, 0.0f, 2);
                C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g8, c2305k8, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q3.m87165m();
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r8);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i115, c23010xM66775a16);
                AbstractC28683x.m87239G(c28655q3, c0209i116, interfaceC28653p1M87165m1110);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i117, modifierM118962N1110);
                AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d16.m121949b(c28655q3, i3112).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d16.m121952e(c28655q3, i3112).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                m90763x("Back stack", c28655q3, 6);
                c28655q3.m87150e0(1705700877);
                it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                while (true) {
                    listIterator = (ListIterator) ((C25249h0) it).f99126x;
                    if (listIterator.hasPrevious()) {
                        break;
                        break;
                    }
                    m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                }
                c28655q3.m87173q(false);
                m90763x("NAVIGATE", c28655q3, 6);
                z13 = true;
                f13 = 1 * f1118;
                C22994r1 c22994r1M66759a15 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q3.m87165m();
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a15);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m1111);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N1111);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(f14, true);
                TextResource textResourceM21278l15 = AbstractC8693b.m21278l("Push");
                int i3113 = TextResource.$stable;
                AbstractC27271o0.m82253b(layoutWeightElement8, false, textResourceM21278l15, null, null, null, null, null, false, null, interfaceC4339a1118, c28655q3, i3113 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                } else {
                    f15 = 1.0f;
                }
                AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1119, c28655q3, i3113 << 18, (i27 << 3) & 7168, 8126);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                m90763x("DISMISS WITH", c28655q, 6);
                c28655q.m87150e0(1705721970);
                while (r4.hasNext()) {
                    float f11110 = f13;
                    Modifier modifierM3398t113 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f11110, 7);
                    TextResource textResourceM21278l16 = AbstractC8693b.m21278l(enumC21172v.name());
                    i35 = i27;
                    if ((i35 & 7168) == 2048) {
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v2 = c28676v1;
                        if (objM87133R2 == c28676v2) {
                            function6 = function5;
                        }
                        C28655q c28655q115 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t113, false, textResourceM21278l16, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q115, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q115;
                        f13 = f11110;
                        z13 = true;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function6 = function5;
                    objM87133R2 = new C28448b(24, function6, enumC21172v);
                    c28655q.m87172p0(objM87133R2);
                    C28655q c28655q116 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3398t113, false, textResourceM21278l16, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q116, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28676v1 = c28676v2;
                    function5 = function6;
                    i27 = i35;
                    c28655q = c28655q116;
                    f13 = f11110;
                    z13 = true;
                }
                Function1 function14 = function5;
                C28676v0 c28676v10 = c28676v1;
                i28 = i27;
                c28655q.m87173q(false);
                Modifier modifierM3398t114 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1119, 0.0f, f13, 5);
                f16 = f13;
                C22994r1 c22994r1M66759a16 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
                Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3398t114);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a16);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1112);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1112);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8439t8 = c38072d.m121952e(c28655q, i29).getH6();
                long jM125382b15 = c38072d.m121949b(c28655q, i29).getWhite50();
                i34 = C2886a.f11498d << 18;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h("LOG", null, jM125382b15, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t8, null, c28655q2, 6, i34, 196602);
                C2886a c2886aM8422c8 = c38072d.m121952e(c28655q2, i29).getB3();
                long jM125382b16 = c38072d.m121949b(c28655q2, i29).getWhite50();
                if ((57344 & i28) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b16, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c8, null, c28655q2, 6, i34, 196600);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                if (state.m90766a().isEmpty()) {
                    c28655q3.m87150e0(1338853219);
                    AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(1339061229);
                    while (r0.hasNext()) {
                        C38072d c38072d17 = C38072d.f163053a;
                        int i411 = C38072d.f163054b;
                        C28655q c28655q117 = c28655q3;
                        AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d17.m121949b(c28655q3, i411).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d17.m121952e(c28655q3, i411).getB3(), null, c28655q117, 48, C2886a.f11498d << 18, 196600);
                        c28655q3 = c28655q117;
                    }
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function3 = function14;
                interfaceC4339a10 = interfaceC4339a16;
                interfaceC4339a9 = interfaceC4339a1118;
                interfaceC4339a7 = interfaceC4339a1119;
                interfaceC4339a8 = interfaceC4339a11110;
            } else {
                c28655q3.m87138X();
                interfaceC4339a7 = interfaceC4339a2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                function3 = function2;
                interfaceC4339a10 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
            }
        }
        i36 |= 48;
        interfaceC4339a5 = interfaceC4339a;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q3.m87157i(interfaceC4339a2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i36 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q3.m87157i(function2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i36 |= i18;
                }
                i19 = i14 & 16;
                if (i19 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a6 = interfaceC4339a3;
                        if (c28655q3.m87157i(interfaceC4339a6)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i36 |= i24;
                    }
                    i25 = i14 & 32;
                    if (i25 != 0) {
                        i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a4)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i36 |= i26;
                    }
                    if ((i36 & 74899) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i36 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i37 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C29096r(18);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                        } else {
                            interfaceC4339a11 = interfaceC4339a5;
                        }
                        if (i15 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C29096r(19);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a12 = interfaceC4339a2;
                        }
                        if (i17 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C29529k(13);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        } else {
                            function4 = function2;
                        }
                        if (i19 != 0) {
                            objM87133R4 = c28655q3.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C29096r(20);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                        } else {
                            interfaceC4339a13 = interfaceC4339a6;
                        }
                        if (i25 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C29096r(21);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                        } else {
                            interfaceC4339a14 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, c2314t);
                        C38072d c38072d18 = C38072d.f163053a;
                        int i3114 = C38072d.f163054b;
                        interfaceC4339a15 = interfaceC4339a13;
                        float f11111 = 8;
                        float f11112 = 3 * f11111;
                        Modifier modifierM3398t115 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d9, c38072d18.m121949b(c28655q3, i3114).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f11112, 7);
                        C22957g c22957g9 = AbstractC22977m.f90652c;
                        C2305k c2305k9 = C2299e.f9110M;
                        C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g9, c2305k9, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q3.m87165m();
                        Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q3, modifierM3398t115);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        InterfaceC4339a interfaceC4339a11111 = interfaceC4339a11;
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        C0209i c0209i118 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q3, c0209i118, c23010xM66775a17);
                        C0209i c0209i119 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q3, c0209i119, interfaceC28653p1M87165m1113);
                        c0209i = C0217k.f732j;
                        InterfaceC4339a interfaceC4339a11112 = interfaceC4339a12;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        C0209i c0209i1110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i1110, modifierM118962N1113);
                        i27 = i36;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                        InterfaceC4339a interfaceC4339a11113 = interfaceC4339a14;
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t, 2 * f11111, 0.0f, 2);
                        C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g9, c2305k9, c28655q3, 0);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q3.m87165m();
                        Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q3, modifierM3396r9);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i118, c23010xM66775a18);
                        AbstractC28683x.m87239G(c28655q3, c0209i119, interfaceC28653p1M87165m1114);
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i1110, modifierM118962N1114);
                        AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d18.m121949b(c28655q3, i3114).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d18.m121952e(c28655q3, i3114).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                        m90763x("Back stack", c28655q3, 6);
                        c28655q3.m87150e0(1705700877);
                        it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                        while (true) {
                            listIterator = (ListIterator) ((C25249h0) it).f99126x;
                            if (listIterator.hasPrevious()) {
                                break;
                                break;
                            }
                            m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                        }
                        c28655q3.m87173q(false);
                        m90763x("NAVIGATE", c28655q3, 6);
                        z13 = true;
                        f13 = 1 * f11111;
                        C22994r1 c22994r1M66759a17 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                        iHashCode3 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q3.m87165m();
                        Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q3, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j2);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a17);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m1115);
                        c0209i2 = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N1115);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f14 = Float.MAX_VALUE;
                        } else {
                            f14 = 1.0f;
                        }
                        LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(f14, true);
                        TextResource textResourceM21278l17 = AbstractC8693b.m21278l("Push");
                        int i3115 = TextResource.$stable;
                        AbstractC27271o0.m82253b(layoutWeightElement9, false, textResourceM21278l17, null, null, null, null, null, false, null, interfaceC4339a11111, c28655q3, i3115 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f15 = Float.MAX_VALUE;
                        } else {
                            f15 = 1.0f;
                        }
                        AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a11112, c28655q3, i3115 << 18, (i27 << 3) & 7168, 8126);
                        c28655q = c28655q3;
                        c28655q.m87173q(true);
                        m90763x("DISMISS WITH", c28655q, 6);
                        c28655q.m87150e0(1705721970);
                        while (r4.hasNext()) {
                            float f11113 = f13;
                            Modifier modifierM3398t116 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f11113, 7);
                            TextResource textResourceM21278l18 = AbstractC8693b.m21278l(enumC21172v.name());
                            i35 = i27;
                            if ((i35 & 7168) == 2048) {
                                z15 = z13;
                            } else {
                                z15 = false;
                            }
                            zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                            objM87133R2 = c28655q.m87133R();
                            if (zM87149e) {
                                c28676v2 = c28676v1;
                                if (objM87133R2 == c28676v2) {
                                    function6 = function5;
                                }
                                C28655q c28655q118 = c28655q;
                                AbstractC27271o0.m82253b(modifierM3398t116, false, textResourceM21278l18, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q118, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                                c28676v1 = c28676v2;
                                function5 = function6;
                                i27 = i35;
                                c28655q = c28655q118;
                                f13 = f11113;
                                z13 = true;
                            } else {
                                c28676v2 = c28676v1;
                            }
                            function6 = function5;
                            objM87133R2 = new C28448b(24, function6, enumC21172v);
                            c28655q.m87172p0(objM87133R2);
                            C28655q c28655q119 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t116, false, textResourceM21278l18, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q119, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q119;
                            f13 = f11113;
                            z13 = true;
                        }
                        Function1 function15 = function5;
                        C28676v0 c28676v11 = c28676v1;
                        i28 = i27;
                        c28655q.m87173q(false);
                        Modifier modifierM3398t117 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11112, 0.0f, f13, 5);
                        f16 = f13;
                        C22994r1 c22994r1M66759a18 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q.m87165m();
                        Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q, modifierM3398t117);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j3);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a18);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1116);
                        c0209i3 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        } else {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1116);
                        c38072d = C38072d.f163053a;
                        i29 = C38072d.f163054b;
                        C2886a c2886aM8439t9 = c38072d.m121952e(c28655q, i29).getH6();
                        long jM125382b17 = c38072d.m121949b(c28655q, i29).getWhite50();
                        i34 = C2886a.f11498d << 18;
                        c28655q2 = c28655q;
                        AbstractC30795n.m94707h("LOG", null, jM125382b17, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t9, null, c28655q2, 6, i34, 196602);
                        C2886a c2886aM8422c9 = c38072d.m121952e(c28655q2, i29).getB3();
                        long jM125382b18 = c38072d.m121949b(c28655q2, i29).getWhite50();
                        if ((57344 & i28) == 16384) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (z14) {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a16 = interfaceC4339a15;
                            objM87133R = new C28329e(interfaceC4339a16, 16);
                            c28655q2.m87172p0(objM87133R);
                        }
                        AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b18, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c9, null, c28655q2, 6, i34, 196600);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        if (state.m90766a().isEmpty()) {
                            c28655q3.m87150e0(1338853219);
                            AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        } else {
                            c28655q3.m87150e0(1339061229);
                            while (r0.hasNext()) {
                                C38072d c38072d19 = C38072d.f163053a;
                                int i412 = C38072d.f163054b;
                                C28655q c28655q1110 = c28655q3;
                                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d19.m121949b(c28655q3, i412).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d19.m121952e(c28655q3, i412).getB3(), null, c28655q1110, 48, C2886a.f11498d << 18, 196600);
                                c28655q3 = c28655q1110;
                            }
                            c28655q3.m87173q(false);
                        }
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(true);
                        function3 = function15;
                        interfaceC4339a10 = interfaceC4339a16;
                        interfaceC4339a9 = interfaceC4339a11111;
                        interfaceC4339a7 = interfaceC4339a11112;
                        interfaceC4339a8 = interfaceC4339a11113;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4339a7 = interfaceC4339a2;
                        interfaceC4339a8 = interfaceC4339a4;
                        interfaceC4339a9 = interfaceC4339a5;
                        function3 = function2;
                        interfaceC4339a10 = interfaceC4339a6;
                    }
                    c28677v1M87180u = c28655q3.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                    }
                }
                i36 |= 24576;
                interfaceC4339a6 = interfaceC4339a3;
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d110 = C38072d.f163053a;
                    int i3116 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f11114 = 8;
                    float f11115 = 3 * f11114;
                    Modifier modifierM3398t118 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d10, c38072d110.m121949b(c28655q3, i3116).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f11115, 7);
                    C22957g c22957g10 = AbstractC22977m.f90652c;
                    C2305k c2305k10 = C2299e.f9110M;
                    C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g10, c2305k10, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q3.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q3, modifierM3398t118);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a11114 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i1111 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i1111, c23010xM66775a19);
                    C0209i c0209i1112 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i1112, interfaceC28653p1M87165m1117);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a11115 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i1113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i1113, modifierM118962N1117);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a11116 = interfaceC4339a14;
                    Modifier modifierM3396r10 = AbstractC1099a.m3396r(c2314t, 2 * f11114, 0.0f, 2);
                    C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g10, c2305k10, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q3.m87165m();
                    Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r10);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1111, c23010xM66775a110);
                    AbstractC28683x.m87239G(c28655q3, c0209i1112, interfaceC28653p1M87165m1118);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1113, modifierM118962N1118);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d110.m121949b(c28655q3, i3116).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d110.m121952e(c28655q3, i3116).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f11114;
                    C22994r1 c22994r1M66759a19 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q3.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a19);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m1119);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N1119);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l19 = AbstractC8693b.m21278l("Push");
                    int i3117 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement10, false, textResourceM21278l19, null, null, null, null, null, false, null, interfaceC4339a11114, c28655q3, i3117 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a11115, c28655q3, i3117 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f11116 = f13;
                        Modifier modifierM3398t119 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f11116, 7);
                        TextResource textResourceM21278l110 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q1111 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t119, false, textResourceM21278l110, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1111, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q1111;
                            f13 = f11116;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q1112 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t119, false, textResourceM21278l110, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1112, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q1112;
                        f13 = f11116;
                        z13 = true;
                    }
                    Function1 function16 = function5;
                    C28676v0 c28676v12 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t1110 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11115, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a110 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q.m87165m();
                    Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q, modifierM3398t1110);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a110);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11110);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11110);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t10 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b19 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b19, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t10, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c10 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b110 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c10, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d111 = C38072d.f163053a;
                            int i413 = C38072d.f163054b;
                            C28655q c28655q1113 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d111.m121949b(c28655q3, i413).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d111.m121952e(c28655q3, i413).getB3(), null, c28655q1113, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q1113;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function16;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a11114;
                    interfaceC4339a7 = interfaceC4339a11115;
                    interfaceC4339a8 = interfaceC4339a11116;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 3072;
            function2 = function1;
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q3.m87157i(interfaceC4339a6)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i36 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d112 = C38072d.f163053a;
                    int i3118 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f11117 = 8;
                    float f11118 = 3 * f11117;
                    Modifier modifierM3398t1111 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d11, c38072d112.m121949b(c28655q3, i3118).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f11118, 7);
                    C22957g c22957g11 = AbstractC22977m.f90652c;
                    C2305k c2305k11 = C2299e.f9110M;
                    C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22957g11, c2305k11, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q3.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q3, modifierM3398t1111);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i1114 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i1114, c23010xM66775a111);
                    C0209i c0209i1115 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i1115, interfaceC28653p1M87165m11111);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a11118 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i1116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i1116, modifierM118962N11111);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a11119 = interfaceC4339a14;
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t, 2 * f11117, 0.0f, 2);
                    C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g11, c2305k11, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q3.m87165m();
                    Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q3, modifierM3396r11);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1114, c23010xM66775a112);
                    AbstractC28683x.m87239G(c28655q3, c0209i1115, interfaceC28653p1M87165m11112);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i1116, modifierM118962N11112);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d112.m121949b(c28655q3, i3118).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d112.m121952e(c28655q3, i3118).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f11117;
                    C22994r1 c22994r1M66759a111 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q3.m87165m();
                    Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a111);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11113);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11113);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l111 = AbstractC8693b.m21278l("Push");
                    int i3119 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement11, false, textResourceM21278l111, null, null, null, null, null, false, null, interfaceC4339a11117, c28655q3, i3119 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a11118, c28655q3, i3119 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f11119 = f13;
                        Modifier modifierM3398t1112 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f11119, 7);
                        TextResource textResourceM21278l112 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q1114 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t1112, false, textResourceM21278l112, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1114, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q1114;
                            f13 = f11119;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q1115 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t1112, false, textResourceM21278l112, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1115, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q1115;
                        f13 = f11119;
                        z13 = true;
                    }
                    Function1 function17 = function5;
                    C28676v0 c28676v13 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t1113 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f11118, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a112 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q, modifierM3398t1113);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a112);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11114);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11114);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t11 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b111 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t11, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c11 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b112 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c11, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d113 = C38072d.f163053a;
                            int i414 = C38072d.f163054b;
                            C28655q c28655q1116 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d113.m121949b(c28655q3, i414).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d113.m121952e(c28655q3, i414).getB3(), null, c28655q1116, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q1116;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function17;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a11117;
                    interfaceC4339a7 = interfaceC4339a11118;
                    interfaceC4339a8 = interfaceC4339a11119;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 24576;
            interfaceC4339a6 = interfaceC4339a3;
            i25 = i14 & 32;
            if (i25 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a4)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i36 |= i26;
            }
            if ((i36 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i36 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i37 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29096r(18);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29096r(19);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a12 = interfaceC4339a2;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(13);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29096r(20);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a13 = interfaceC4339a6;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(21);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a14 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, c2314t);
                C38072d c38072d114 = C38072d.f163053a;
                int i31110 = C38072d.f163054b;
                interfaceC4339a15 = interfaceC4339a13;
                float f111110 = 8;
                float f111111 = 3 * f111110;
                Modifier modifierM3398t1114 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d12, c38072d114.m121949b(c28655q3, i31110).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f111111, 7);
                C22957g c22957g12 = AbstractC22977m.f90652c;
                C2305k c2305k12 = C2299e.f9110M;
                C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g12, c2305k12, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q3.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q3, modifierM3398t1114);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                InterfaceC4339a interfaceC4339a111110 = interfaceC4339a11;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i1117 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i1117, c23010xM66775a113);
                C0209i c0209i1118 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i1118, interfaceC28653p1M87165m11115);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a111111 = interfaceC4339a12;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i1119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i1119, modifierM118962N11115);
                i27 = i36;
                c28676v1 = c28676v0;
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a111112 = interfaceC4339a14;
                Modifier modifierM3396r12 = AbstractC1099a.m3396r(c2314t, 2 * f111110, 0.0f, 2);
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g12, c2305k12, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q3.m87165m();
                Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q3, modifierM3396r12);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1117, c23010xM66775a114);
                AbstractC28683x.m87239G(c28655q3, c0209i1118, interfaceC28653p1M87165m11116);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i1119, modifierM118962N11116);
                AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d114.m121949b(c28655q3, i31110).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d114.m121952e(c28655q3, i31110).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                m90763x("Back stack", c28655q3, 6);
                c28655q3.m87150e0(1705700877);
                it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                while (true) {
                    listIterator = (ListIterator) ((C25249h0) it).f99126x;
                    if (listIterator.hasPrevious()) {
                        break;
                        break;
                    }
                    m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                }
                c28655q3.m87173q(false);
                m90763x("NAVIGATE", c28655q3, 6);
                z13 = true;
                f13 = 1 * f111110;
                C22994r1 c22994r1M66759a113 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q3.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a113);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11117);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11117);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(f14, true);
                TextResource textResourceM21278l113 = AbstractC8693b.m21278l("Push");
                int i31111 = TextResource.$stable;
                AbstractC27271o0.m82253b(layoutWeightElement12, false, textResourceM21278l113, null, null, null, null, null, false, null, interfaceC4339a111110, c28655q3, i31111 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                } else {
                    f15 = 1.0f;
                }
                AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a111111, c28655q3, i31111 << 18, (i27 << 3) & 7168, 8126);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                m90763x("DISMISS WITH", c28655q, 6);
                c28655q.m87150e0(1705721970);
                while (r4.hasNext()) {
                    float f111112 = f13;
                    Modifier modifierM3398t1115 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f111112, 7);
                    TextResource textResourceM21278l114 = AbstractC8693b.m21278l(enumC21172v.name());
                    i35 = i27;
                    if ((i35 & 7168) == 2048) {
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v2 = c28676v1;
                        if (objM87133R2 == c28676v2) {
                            function6 = function5;
                        }
                        C28655q c28655q1117 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t1115, false, textResourceM21278l114, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1117, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q1117;
                        f13 = f111112;
                        z13 = true;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function6 = function5;
                    objM87133R2 = new C28448b(24, function6, enumC21172v);
                    c28655q.m87172p0(objM87133R2);
                    C28655q c28655q1118 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3398t1115, false, textResourceM21278l114, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q1118, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28676v1 = c28676v2;
                    function5 = function6;
                    i27 = i35;
                    c28655q = c28655q1118;
                    f13 = f111112;
                    z13 = true;
                }
                Function1 function18 = function5;
                C28676v0 c28676v14 = c28676v1;
                i28 = i27;
                c28655q.m87173q(false);
                Modifier modifierM3398t1116 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111111, 0.0f, f13, 5);
                f16 = f13;
                C22994r1 c22994r1M66759a114 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q.m87165m();
                Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q, modifierM3398t1116);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a114);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11118);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11118);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8439t12 = c38072d.m121952e(c28655q, i29).getH6();
                long jM125382b113 = c38072d.m121949b(c28655q, i29).getWhite50();
                i34 = C2886a.f11498d << 18;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h("LOG", null, jM125382b113, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t12, null, c28655q2, 6, i34, 196602);
                C2886a c2886aM8422c12 = c38072d.m121952e(c28655q2, i29).getB3();
                long jM125382b114 = c38072d.m121949b(c28655q2, i29).getWhite50();
                if ((57344 & i28) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b114, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c12, null, c28655q2, 6, i34, 196600);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                if (state.m90766a().isEmpty()) {
                    c28655q3.m87150e0(1338853219);
                    AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(1339061229);
                    while (r0.hasNext()) {
                        C38072d c38072d115 = C38072d.f163053a;
                        int i415 = C38072d.f163054b;
                        C28655q c28655q1119 = c28655q3;
                        AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d115.m121949b(c28655q3, i415).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d115.m121952e(c28655q3, i415).getB3(), null, c28655q1119, 48, C2886a.f11498d << 18, 196600);
                        c28655q3 = c28655q1119;
                    }
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function3 = function18;
                interfaceC4339a10 = interfaceC4339a16;
                interfaceC4339a9 = interfaceC4339a111110;
                interfaceC4339a7 = interfaceC4339a111111;
                interfaceC4339a8 = interfaceC4339a111112;
            } else {
                c28655q3.m87138X();
                interfaceC4339a7 = interfaceC4339a2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                function3 = function2;
                interfaceC4339a10 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
            }
        }
        i36 |= 384;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q3.m87157i(function2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i36 |= i18;
            }
            i19 = i14 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q3.m87157i(interfaceC4339a6)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i36 |= i24;
                }
                i25 = i14 & 32;
                if (i25 != 0) {
                    i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i36 |= i26;
                }
                if ((i36 & 74899) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i36 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i37 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29096r(18);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                    } else {
                        interfaceC4339a11 = interfaceC4339a5;
                    }
                    if (i15 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29096r(19);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a12 = interfaceC4339a2;
                    }
                    if (i17 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C29529k(13);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    } else {
                        function4 = function2;
                    }
                    if (i19 != 0) {
                        objM87133R4 = c28655q3.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C29096r(20);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                    } else {
                        interfaceC4339a13 = interfaceC4339a6;
                    }
                    if (i25 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C29096r(21);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a14 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C38072d c38072d116 = C38072d.f163053a;
                    int i31112 = C38072d.f163054b;
                    interfaceC4339a15 = interfaceC4339a13;
                    float f111113 = 8;
                    float f111114 = 3 * f111113;
                    Modifier modifierM3398t1117 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d13, c38072d116.m121949b(c28655q3, i31112).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f111114, 7);
                    C22957g c22957g13 = AbstractC22977m.f90652c;
                    C2305k c2305k13 = C2299e.f9110M;
                    C23010x c23010xM66775a115 = AbstractC23007w.m66775a(c22957g13, c2305k13, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11119 = c28655q3.m87165m();
                    Modifier modifierM118962N11119 = AbstractC37056f.m118962N(c28655q3, modifierM3398t1117);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    InterfaceC4339a interfaceC4339a111113 = interfaceC4339a11;
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    C0209i c0209i11110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i11110, c23010xM66775a115);
                    C0209i c0209i11111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i11111, interfaceC28653p1M87165m11119);
                    c0209i = C0217k.f732j;
                    InterfaceC4339a interfaceC4339a111114 = interfaceC4339a12;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    C0209i c0209i11112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i11112, modifierM118962N11119);
                    i27 = i36;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                    InterfaceC4339a interfaceC4339a111115 = interfaceC4339a14;
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(c2314t, 2 * f111113, 0.0f, 2);
                    C23010x c23010xM66775a116 = AbstractC23007w.m66775a(c22957g13, c2305k13, c28655q3, 0);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111110 = c28655q3.m87165m();
                    Modifier modifierM118962N111110 = AbstractC37056f.m118962N(c28655q3, modifierM3396r13);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11110, c23010xM66775a116);
                    AbstractC28683x.m87239G(c28655q3, c0209i11111, interfaceC28653p1M87165m111110);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11112, modifierM118962N111110);
                    AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d116.m121949b(c28655q3, i31112).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d116.m121952e(c28655q3, i31112).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                    m90763x("Back stack", c28655q3, 6);
                    c28655q3.m87150e0(1705700877);
                    it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                    while (true) {
                        listIterator = (ListIterator) ((C25249h0) it).f99126x;
                        if (listIterator.hasPrevious()) {
                            break;
                            break;
                        }
                        m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                    }
                    c28655q3.m87173q(false);
                    m90763x("NAVIGATE", c28655q3, 6);
                    z13 = true;
                    f13 = 1 * f111113;
                    C22994r1 c22994r1M66759a115 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                    iHashCode3 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111111 = c28655q3.m87165m();
                    Modifier modifierM118962N111111 = AbstractC37056f.m118962N(c28655q3, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j2);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a115);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m111111);
                    c0209i2 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N111111);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f14 = Float.MAX_VALUE;
                    } else {
                        f14 = 1.0f;
                    }
                    LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(f14, true);
                    TextResource textResourceM21278l115 = AbstractC8693b.m21278l("Push");
                    int i31113 = TextResource.$stable;
                    AbstractC27271o0.m82253b(layoutWeightElement13, false, textResourceM21278l115, null, null, null, null, null, false, null, interfaceC4339a111113, c28655q3, i31113 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f15 = Float.MAX_VALUE;
                    } else {
                        f15 = 1.0f;
                    }
                    AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a111114, c28655q3, i31113 << 18, (i27 << 3) & 7168, 8126);
                    c28655q = c28655q3;
                    c28655q.m87173q(true);
                    m90763x("DISMISS WITH", c28655q, 6);
                    c28655q.m87150e0(1705721970);
                    while (r4.hasNext()) {
                        float f111115 = f13;
                        Modifier modifierM3398t1118 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f111115, 7);
                        TextResource textResourceM21278l116 = AbstractC8693b.m21278l(enumC21172v.name());
                        i35 = i27;
                        if ((i35 & 7168) == 2048) {
                            z15 = z13;
                        } else {
                            z15 = false;
                        }
                        zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                        objM87133R2 = c28655q.m87133R();
                        if (zM87149e) {
                            c28676v2 = c28676v1;
                            if (objM87133R2 == c28676v2) {
                                function6 = function5;
                            }
                            C28655q c28655q11110 = c28655q;
                            AbstractC27271o0.m82253b(modifierM3398t1118, false, textResourceM21278l116, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11110, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                            c28676v1 = c28676v2;
                            function5 = function6;
                            i27 = i35;
                            c28655q = c28655q11110;
                            f13 = f111115;
                            z13 = true;
                        } else {
                            c28676v2 = c28676v1;
                        }
                        function6 = function5;
                        objM87133R2 = new C28448b(24, function6, enumC21172v);
                        c28655q.m87172p0(objM87133R2);
                        C28655q c28655q11111 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t1118, false, textResourceM21278l116, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11111, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q11111;
                        f13 = f111115;
                        z13 = true;
                    }
                    Function1 function19 = function5;
                    C28676v0 c28676v15 = c28676v1;
                    i28 = i27;
                    c28655q.m87173q(false);
                    Modifier modifierM3398t1119 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111114, 0.0f, f13, 5);
                    f16 = f13;
                    C22994r1 c22994r1M66759a116 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111112 = c28655q.m87165m();
                    Modifier modifierM118962N111112 = AbstractC37056f.m118962N(c28655q, modifierM3398t1119);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j3);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a116);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111112);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111112);
                    c38072d = C38072d.f163053a;
                    i29 = C38072d.f163054b;
                    C2886a c2886aM8439t13 = c38072d.m121952e(c28655q, i29).getH6();
                    long jM125382b115 = c38072d.m121949b(c28655q, i29).getWhite50();
                    i34 = C2886a.f11498d << 18;
                    c28655q2 = c28655q;
                    AbstractC30795n.m94707h("LOG", null, jM125382b115, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t13, null, c28655q2, 6, i34, 196602);
                    C2886a c2886aM8422c13 = c38072d.m121952e(c28655q2, i29).getB3();
                    long jM125382b116 = c38072d.m121949b(c28655q2, i29).getWhite50();
                    if ((57344 & i28) == 16384) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z14) {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a16 = interfaceC4339a15;
                        objM87133R = new C28329e(interfaceC4339a16, 16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b116, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c13, null, c28655q2, 6, i34, 196600);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    if (state.m90766a().isEmpty()) {
                        c28655q3.m87150e0(1338853219);
                        AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        c28655q3.m87150e0(1339061229);
                        while (r0.hasNext()) {
                            C38072d c38072d117 = C38072d.f163053a;
                            int i416 = C38072d.f163054b;
                            C28655q c28655q11112 = c28655q3;
                            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d117.m121949b(c28655q3, i416).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d117.m121952e(c28655q3, i416).getB3(), null, c28655q11112, 48, C2886a.f11498d << 18, 196600);
                            c28655q3 = c28655q11112;
                        }
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(true);
                    function3 = function19;
                    interfaceC4339a10 = interfaceC4339a16;
                    interfaceC4339a9 = interfaceC4339a111113;
                    interfaceC4339a7 = interfaceC4339a111114;
                    interfaceC4339a8 = interfaceC4339a111115;
                } else {
                    c28655q3.m87138X();
                    interfaceC4339a7 = interfaceC4339a2;
                    interfaceC4339a8 = interfaceC4339a4;
                    interfaceC4339a9 = interfaceC4339a5;
                    function3 = function2;
                    interfaceC4339a10 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
                }
            }
            i36 |= 24576;
            interfaceC4339a6 = interfaceC4339a3;
            i25 = i14 & 32;
            if (i25 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a4)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i36 |= i26;
            }
            if ((i36 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i36 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i37 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29096r(18);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29096r(19);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a12 = interfaceC4339a2;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(13);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29096r(20);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a13 = interfaceC4339a6;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(21);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a14 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, c2314t);
                C38072d c38072d118 = C38072d.f163053a;
                int i31114 = C38072d.f163054b;
                interfaceC4339a15 = interfaceC4339a13;
                float f111116 = 8;
                float f111117 = 3 * f111116;
                Modifier modifierM3398t11110 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d14, c38072d118.m121949b(c28655q3, i31114).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f111117, 7);
                C22957g c22957g14 = AbstractC22977m.f90652c;
                C2305k c2305k14 = C2299e.f9110M;
                C23010x c23010xM66775a117 = AbstractC23007w.m66775a(c22957g14, c2305k14, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111113 = c28655q3.m87165m();
                Modifier modifierM118962N111113 = AbstractC37056f.m118962N(c28655q3, modifierM3398t11110);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                InterfaceC4339a interfaceC4339a111116 = interfaceC4339a11;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i11113 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i11113, c23010xM66775a117);
                C0209i c0209i11114 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i11114, interfaceC28653p1M87165m111113);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a111117 = interfaceC4339a12;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i11115 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i11115, modifierM118962N111113);
                i27 = i36;
                c28676v1 = c28676v0;
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a111118 = interfaceC4339a14;
                Modifier modifierM3396r14 = AbstractC1099a.m3396r(c2314t, 2 * f111116, 0.0f, 2);
                C23010x c23010xM66775a118 = AbstractC23007w.m66775a(c22957g14, c2305k14, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111114 = c28655q3.m87165m();
                Modifier modifierM118962N111114 = AbstractC37056f.m118962N(c28655q3, modifierM3396r14);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11113, c23010xM66775a118);
                AbstractC28683x.m87239G(c28655q3, c0209i11114, interfaceC28653p1M87165m111114);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11115, modifierM118962N111114);
                AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d118.m121949b(c28655q3, i31114).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d118.m121952e(c28655q3, i31114).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                m90763x("Back stack", c28655q3, 6);
                c28655q3.m87150e0(1705700877);
                it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                while (true) {
                    listIterator = (ListIterator) ((C25249h0) it).f99126x;
                    if (listIterator.hasPrevious()) {
                        break;
                        break;
                    }
                    m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                }
                c28655q3.m87173q(false);
                m90763x("NAVIGATE", c28655q3, 6);
                z13 = true;
                f13 = 1 * f111116;
                C22994r1 c22994r1M66759a117 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111115 = c28655q3.m87165m();
                Modifier modifierM118962N111115 = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a117);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m111115);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N111115);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(f14, true);
                TextResource textResourceM21278l117 = AbstractC8693b.m21278l("Push");
                int i31115 = TextResource.$stable;
                AbstractC27271o0.m82253b(layoutWeightElement14, false, textResourceM21278l117, null, null, null, null, null, false, null, interfaceC4339a111116, c28655q3, i31115 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                } else {
                    f15 = 1.0f;
                }
                AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a111117, c28655q3, i31115 << 18, (i27 << 3) & 7168, 8126);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                m90763x("DISMISS WITH", c28655q, 6);
                c28655q.m87150e0(1705721970);
                while (r4.hasNext()) {
                    float f111118 = f13;
                    Modifier modifierM3398t11111 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f111118, 7);
                    TextResource textResourceM21278l118 = AbstractC8693b.m21278l(enumC21172v.name());
                    i35 = i27;
                    if ((i35 & 7168) == 2048) {
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v2 = c28676v1;
                        if (objM87133R2 == c28676v2) {
                            function6 = function5;
                        }
                        C28655q c28655q11113 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t11111, false, textResourceM21278l118, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11113, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q11113;
                        f13 = f111118;
                        z13 = true;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function6 = function5;
                    objM87133R2 = new C28448b(24, function6, enumC21172v);
                    c28655q.m87172p0(objM87133R2);
                    C28655q c28655q11114 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3398t11111, false, textResourceM21278l118, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11114, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28676v1 = c28676v2;
                    function5 = function6;
                    i27 = i35;
                    c28655q = c28655q11114;
                    f13 = f111118;
                    z13 = true;
                }
                Function1 function110 = function5;
                C28676v0 c28676v16 = c28676v1;
                i28 = i27;
                c28655q.m87173q(false);
                Modifier modifierM3398t11112 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f111117, 0.0f, f13, 5);
                f16 = f13;
                C22994r1 c22994r1M66759a118 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111116 = c28655q.m87165m();
                Modifier modifierM118962N111116 = AbstractC37056f.m118962N(c28655q, modifierM3398t11112);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a118);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111116);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111116);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8439t14 = c38072d.m121952e(c28655q, i29).getH6();
                long jM125382b117 = c38072d.m121949b(c28655q, i29).getWhite50();
                i34 = C2886a.f11498d << 18;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h("LOG", null, jM125382b117, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t14, null, c28655q2, 6, i34, 196602);
                C2886a c2886aM8422c14 = c38072d.m121952e(c28655q2, i29).getB3();
                long jM125382b118 = c38072d.m121949b(c28655q2, i29).getWhite50();
                if ((57344 & i28) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b118, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c14, null, c28655q2, 6, i34, 196600);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                if (state.m90766a().isEmpty()) {
                    c28655q3.m87150e0(1338853219);
                    AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(1339061229);
                    while (r0.hasNext()) {
                        C38072d c38072d119 = C38072d.f163053a;
                        int i417 = C38072d.f163054b;
                        C28655q c28655q11115 = c28655q3;
                        AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d119.m121949b(c28655q3, i417).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d119.m121952e(c28655q3, i417).getB3(), null, c28655q11115, 48, C2886a.f11498d << 18, 196600);
                        c28655q3 = c28655q11115;
                    }
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function3 = function110;
                interfaceC4339a10 = interfaceC4339a16;
                interfaceC4339a9 = interfaceC4339a111116;
                interfaceC4339a7 = interfaceC4339a111117;
                interfaceC4339a8 = interfaceC4339a111118;
            } else {
                c28655q3.m87138X();
                interfaceC4339a7 = interfaceC4339a2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                function3 = function2;
                interfaceC4339a10 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
            }
        }
        i36 |= 3072;
        function2 = function1;
        i19 = i14 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a6 = interfaceC4339a3;
                if (c28655q3.m87157i(interfaceC4339a6)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i36 |= i24;
            }
            i25 = i14 & 32;
            if (i25 != 0) {
                i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a4)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i36 |= i26;
            }
            if ((i36 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i36 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i37 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29096r(18);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
                } else {
                    interfaceC4339a11 = interfaceC4339a5;
                }
                if (i15 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29096r(19);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a12 = interfaceC4339a2;
                }
                if (i17 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C29529k(13);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                if (i19 != 0) {
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C29096r(20);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a13 = interfaceC4339a6;
                }
                if (i25 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C29096r(21);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a14 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, c2314t);
                C38072d c38072d1110 = C38072d.f163053a;
                int i31116 = C38072d.f163054b;
                interfaceC4339a15 = interfaceC4339a13;
                float f111119 = 8;
                float f1111110 = 3 * f111119;
                Modifier modifierM3398t11113 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d15, c38072d1110.m121949b(c28655q3, i31116).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1111110, 7);
                C22957g c22957g15 = AbstractC22977m.f90652c;
                C2305k c2305k15 = C2299e.f9110M;
                C23010x c23010xM66775a119 = AbstractC23007w.m66775a(c22957g15, c2305k15, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111117 = c28655q3.m87165m();
                Modifier modifierM118962N111117 = AbstractC37056f.m118962N(c28655q3, modifierM3398t11113);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                InterfaceC4339a interfaceC4339a111119 = interfaceC4339a11;
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i11116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i11116, c23010xM66775a119);
                C0209i c0209i11117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i11117, interfaceC28653p1M87165m111117);
                c0209i = C0217k.f732j;
                InterfaceC4339a interfaceC4339a1111110 = interfaceC4339a12;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i11118 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i11118, modifierM118962N111117);
                i27 = i36;
                c28676v1 = c28676v0;
                function5 = function4;
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a1111111 = interfaceC4339a14;
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(c2314t, 2 * f111119, 0.0f, 2);
                C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(c22957g15, c2305k15, c28655q3, 0);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111118 = c28655q3.m87165m();
                Modifier modifierM118962N111118 = AbstractC37056f.m118962N(c28655q3, modifierM3396r15);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11116, c23010xM66775a1110);
                AbstractC28683x.m87239G(c28655q3, c0209i11117, interfaceC28653p1M87165m111118);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i11118, modifierM118962N111118);
                AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d1110.m121949b(c28655q3, i31116).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d1110.m121952e(c28655q3, i31116).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                m90763x("Back stack", c28655q3, 6);
                c28655q3.m87150e0(1705700877);
                it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
                while (true) {
                    listIterator = (ListIterator) ((C25249h0) it).f99126x;
                    if (listIterator.hasPrevious()) {
                        break;
                        break;
                    }
                    m90765z((C29596f) listIterator.previous(), c28655q3, 0);
                }
                c28655q3.m87173q(false);
                m90763x("NAVIGATE", c28655q3, 6);
                z13 = true;
                f13 = 1 * f111119;
                C22994r1 c22994r1M66759a119 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
                iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111119 = c28655q3.m87165m();
                Modifier modifierM118962N111119 = AbstractC37056f.m118962N(c28655q3, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a119);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m111119);
                c0209i2 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N111119);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f14 = Float.MAX_VALUE;
                } else {
                    f14 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement15 = new LayoutWeightElement(f14, true);
                TextResource textResourceM21278l119 = AbstractC8693b.m21278l("Push");
                int i31117 = TextResource.$stable;
                AbstractC27271o0.m82253b(layoutWeightElement15, false, textResourceM21278l119, null, null, null, null, null, false, null, interfaceC4339a111119, c28655q3, i31117 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                } else {
                    f15 = 1.0f;
                }
                AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1111110, c28655q3, i31117 << 18, (i27 << 3) & 7168, 8126);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                m90763x("DISMISS WITH", c28655q, 6);
                c28655q.m87150e0(1705721970);
                while (r4.hasNext()) {
                    float f1111111 = f13;
                    Modifier modifierM3398t11114 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f1111111, 7);
                    TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(enumC21172v.name());
                    i35 = i27;
                    if ((i35 & 7168) == 2048) {
                        z15 = z13;
                    } else {
                        z15 = false;
                    }
                    zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                    objM87133R2 = c28655q.m87133R();
                    if (zM87149e) {
                        c28676v2 = c28676v1;
                        if (objM87133R2 == c28676v2) {
                            function6 = function5;
                        }
                        C28655q c28655q11116 = c28655q;
                        AbstractC27271o0.m82253b(modifierM3398t11114, false, textResourceM21278l1110, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11116, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                        c28676v1 = c28676v2;
                        function5 = function6;
                        i27 = i35;
                        c28655q = c28655q11116;
                        f13 = f1111111;
                        z13 = true;
                    } else {
                        c28676v2 = c28676v1;
                    }
                    function6 = function5;
                    objM87133R2 = new C28448b(24, function6, enumC21172v);
                    c28655q.m87172p0(objM87133R2);
                    C28655q c28655q11117 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3398t11114, false, textResourceM21278l1110, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11117, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28676v1 = c28676v2;
                    function5 = function6;
                    i27 = i35;
                    c28655q = c28655q11117;
                    f13 = f1111111;
                    z13 = true;
                }
                Function1 function111 = function5;
                C28676v0 c28676v17 = c28676v1;
                i28 = i27;
                c28655q.m87173q(false);
                Modifier modifierM3398t11115 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111110, 0.0f, f13, 5);
                f16 = f13;
                C22994r1 c22994r1M66759a1110 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1111110 = c28655q.m87165m();
                Modifier modifierM118962N1111110 = AbstractC37056f.m118962N(c28655q, modifierM3398t11115);
                InterfaceC0221l.f734a.getClass();
                c0213j3 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a1110);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1111110);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1111110);
                c38072d = C38072d.f163053a;
                i29 = C38072d.f163054b;
                C2886a c2886aM8439t15 = c38072d.m121952e(c28655q, i29).getH6();
                long jM125382b119 = c38072d.m121949b(c28655q, i29).getWhite50();
                i34 = C2886a.f11498d << 18;
                c28655q2 = c28655q;
                AbstractC30795n.m94707h("LOG", null, jM125382b119, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t15, null, c28655q2, 6, i34, 196602);
                C2886a c2886aM8422c15 = c38072d.m121952e(c28655q2, i29).getB3();
                long jM125382b1110 = c38072d.m121949b(c28655q2, i29).getWhite50();
                if ((57344 & i28) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    interfaceC4339a16 = interfaceC4339a15;
                    objM87133R = new C28329e(interfaceC4339a16, 16);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b1110, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c15, null, c28655q2, 6, i34, 196600);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                if (state.m90766a().isEmpty()) {
                    c28655q3.m87150e0(1338853219);
                    AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(1339061229);
                    while (r0.hasNext()) {
                        C38072d c38072d1111 = C38072d.f163053a;
                        int i418 = C38072d.f163054b;
                        C28655q c28655q11118 = c28655q3;
                        AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d1111.m121949b(c28655q3, i418).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1111.m121952e(c28655q3, i418).getB3(), null, c28655q11118, 48, C2886a.f11498d << 18, 196600);
                        c28655q3 = c28655q11118;
                    }
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function3 = function111;
                interfaceC4339a10 = interfaceC4339a16;
                interfaceC4339a9 = interfaceC4339a111119;
                interfaceC4339a7 = interfaceC4339a1111110;
                interfaceC4339a8 = interfaceC4339a1111111;
            } else {
                c28655q3.m87138X();
                interfaceC4339a7 = interfaceC4339a2;
                interfaceC4339a8 = interfaceC4339a4;
                interfaceC4339a9 = interfaceC4339a5;
                function3 = function2;
                interfaceC4339a10 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
            }
        }
        i36 |= 24576;
        interfaceC4339a6 = interfaceC4339a3;
        i25 = i14 & 32;
        if (i25 != 0) {
            i36 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q3.m87157i(interfaceC4339a4)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i36 |= i26;
        }
        if ((i36 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i36 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i37 != 0) {
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29096r(18);
                    c28655q3.m87172p0(objM87133R7);
                }
                interfaceC4339a11 = (InterfaceC4339a) objM87133R7;
            } else {
                interfaceC4339a11 = interfaceC4339a5;
            }
            if (i15 != 0) {
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C29096r(19);
                    c28655q3.m87172p0(objM87133R6);
                }
                interfaceC4339a12 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a12 = interfaceC4339a2;
            }
            if (i17 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C29529k(13);
                    c28655q3.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            if (i19 != 0) {
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C29096r(20);
                    c28655q3.m87172p0(objM87133R4);
                }
                interfaceC4339a13 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a13 = interfaceC4339a6;
            }
            if (i25 != 0) {
                objM87133R3 = c28655q3.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C29096r(21);
                    c28655q3.m87172p0(objM87133R3);
                }
                interfaceC4339a14 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a14 = interfaceC4339a4;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, c2314t);
            C38072d c38072d1112 = C38072d.f163053a;
            int i31118 = C38072d.f163054b;
            interfaceC4339a15 = interfaceC4339a13;
            float f1111112 = 8;
            float f1111113 = 3 * f1111112;
            Modifier modifierM3398t11116 = AbstractC1099a.m3398t(AbstractC30060g.m92116f0(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1092a.m3358c(modifierM3407d16, c38072d1112.m121949b(c28655q3, i31118).getBackgroundDarkStd(), AbstractC17918w0.f69621a))), AbstractC30060g.m92099U(0, c28655q3, 1), 14), 0.0f, 0.0f, 0.0f, f1111113, 7);
            C22957g c22957g16 = AbstractC22977m.f90652c;
            C2305k c2305k16 = C2299e.f9110M;
            C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(c22957g16, c2305k16, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111111 = c28655q3.m87165m();
            Modifier modifierM118962N1111111 = AbstractC37056f.m118962N(c28655q3, modifierM3398t11116);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            InterfaceC4339a interfaceC4339a1111112 = interfaceC4339a11;
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i11119 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i11119, c23010xM66775a1111);
            C0209i c0209i111110 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i111110, interfaceC28653p1M87165m1111111);
            c0209i = C0217k.f732j;
            InterfaceC4339a interfaceC4339a1111113 = interfaceC4339a12;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i111111 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i111111, modifierM118962N1111111);
            i27 = i36;
            c28676v1 = c28676v0;
            function5 = function4;
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("Dismissal Playground")), null, interfaceC4339a14, null, null, c28655q3, ((i36 >> 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            InterfaceC4339a interfaceC4339a1111114 = interfaceC4339a14;
            Modifier modifierM3396r16 = AbstractC1099a.m3396r(c2314t, 2 * f1111112, 0.0f, 2);
            C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(c22957g16, c2305k16, c28655q3, 0);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111112 = c28655q3.m87165m();
            Modifier modifierM118962N1111112 = AbstractC37056f.m118962N(c28655q3, modifierM3396r16);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i11119, c23010xM66775a1112);
            AbstractC28683x.m87239G(c28655q3, c0209i111110, interfaceC28653p1M87165m1111112);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i111111, modifierM118962N1111112);
            AbstractC30795n.m94707h(state.getScreenName(), AbstractC1102d.m3409f(1.0f, c2314t), c38072d1112.m121949b(c28655q3, i31118).getAccentFocus(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d1112.m121952e(c28655q3, i31118).getH3(), null, c28655q3, 48, C2886a.f11498d << 18, 196088);
            m90763x("Back stack", c28655q3, 6);
            c28655q3.m87150e0(1705700877);
            it = AbstractC25265s.m74143q0(state.m90768c()).iterator();
            while (true) {
                listIterator = (ListIterator) ((C25249h0) it).f99126x;
                if (listIterator.hasPrevious()) {
                    break;
                    break;
                }
                m90765z((C29596f) listIterator.previous(), c28655q3, 0);
            }
            c28655q3.m87173q(false);
            m90763x("NAVIGATE", c28655q3, 6);
            z13 = true;
            f13 = 1 * f1111112;
            C22994r1 c22994r1M66759a1111 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q3, 6);
            iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111113 = c28655q3.m87165m();
            Modifier modifierM118962N1111113 = AbstractC37056f.m118962N(c28655q3, c2314t);
            InterfaceC0221l.f734a.getClass();
            c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a1111);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m1111113);
            c0209i2 = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N1111113);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f14 = Float.MAX_VALUE;
            } else {
                f14 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement16 = new LayoutWeightElement(f14, true);
            TextResource textResourceM21278l1111 = AbstractC8693b.m21278l("Push");
            int i31119 = TextResource.$stable;
            AbstractC27271o0.m82253b(layoutWeightElement16, false, textResourceM21278l1111, null, null, null, null, null, false, null, interfaceC4339a1111112, c28655q3, i31119 << 6, (i27 >> 3) & 14, MessageListItemViewType.POLL);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f15 = Float.MAX_VALUE;
            } else {
                f15 = 1.0f;
            }
            AbstractC27292z.m82343j(new LayoutWeightElement(f15, true), false, false, null, null, null, AbstractC8693b.m21278l("Present"), null, null, null, 0.0f, null, null, interfaceC4339a1111113, c28655q3, i31119 << 18, (i27 << 3) & 7168, 8126);
            c28655q = c28655q3;
            c28655q.m87173q(true);
            m90763x("DISMISS WITH", c28655q, 6);
            c28655q.m87150e0(1705721970);
            while (r4.hasNext()) {
                float f1111114 = f13;
                Modifier modifierM3398t11117 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f1111114, 7);
                TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(enumC21172v.name());
                i35 = i27;
                if ((i35 & 7168) == 2048) {
                    z15 = z13;
                } else {
                    z15 = false;
                }
                zM87149e = z15 | c28655q.m87149e(enumC21172v.ordinal());
                objM87133R2 = c28655q.m87133R();
                if (zM87149e) {
                    c28676v2 = c28676v1;
                    if (objM87133R2 == c28676v2) {
                        function6 = function5;
                    }
                    C28655q c28655q11119 = c28655q;
                    AbstractC27271o0.m82253b(modifierM3398t11117, false, textResourceM21278l1112, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q11119, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                    c28676v1 = c28676v2;
                    function5 = function6;
                    i27 = i35;
                    c28655q = c28655q11119;
                    f13 = f1111114;
                    z13 = true;
                } else {
                    c28676v2 = c28676v1;
                }
                function6 = function5;
                objM87133R2 = new C28448b(24, function6, enumC21172v);
                c28655q.m87172p0(objM87133R2);
                C28655q c28655q111110 = c28655q;
                AbstractC27271o0.m82253b(modifierM3398t11117, false, textResourceM21278l1112, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R2, c28655q111110, (TextResource.$stable << 6) | 6, 0, MessageListItemViewType.POLL);
                c28676v1 = c28676v2;
                function5 = function6;
                i27 = i35;
                c28655q = c28655q111110;
                f13 = f1111114;
                z13 = true;
            }
            Function1 function112 = function5;
            C28676v0 c28676v18 = c28676v1;
            i28 = i27;
            c28655q.m87173q(false);
            Modifier modifierM3398t11118 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f1111113, 0.0f, f13, 5);
            f16 = f13;
            C22994r1 c22994r1M66759a1112 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m1111114 = c28655q.m87165m();
            Modifier modifierM118962N1111114 = AbstractC37056f.m118962N(c28655q, modifierM3398t11118);
            InterfaceC0221l.f734a.getClass();
            c0213j3 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a1112);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1111114);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1111114);
            c38072d = C38072d.f163053a;
            i29 = C38072d.f163054b;
            C2886a c2886aM8439t16 = c38072d.m121952e(c28655q, i29).getH6();
            long jM125382b1111 = c38072d.m121949b(c28655q, i29).getWhite50();
            i34 = C2886a.f11498d << 18;
            c28655q2 = c28655q;
            AbstractC30795n.m94707h("LOG", null, jM125382b1111, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t16, null, c28655q2, 6, i34, 196602);
            C2886a c2886aM8422c16 = c38072d.m121952e(c28655q2, i29).getB3();
            long jM125382b1112 = c38072d.m121949b(c28655q2, i29).getWhite50();
            if ((57344 & i28) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z14) {
                interfaceC4339a16 = interfaceC4339a15;
                objM87133R = new C28329e(interfaceC4339a16, 16);
                c28655q2.m87172p0(objM87133R);
            } else {
                interfaceC4339a16 = interfaceC4339a15;
                objM87133R = new C28329e(interfaceC4339a16, 16);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC30795n.m94707h("clear", AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), jM125382b1112, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8422c16, null, c28655q2, 6, i34, 196600);
            c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            if (state.m90766a().isEmpty()) {
                c28655q3.m87150e0(1338853219);
                AbstractC30795n.m94707h("no dismissals yet", null, c38072d.m121949b(c28655q3, i29).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i29).getB3(), null, c28655q3, 6, i34, 196602);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1339061229);
                while (r0.hasNext()) {
                    C38072d c38072d1113 = C38072d.f163053a;
                    int i419 = C38072d.f163054b;
                    C28655q c28655q111111 = c28655q3;
                    AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d1113.m121949b(c28655q3, i419).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d1113.m121952e(c28655q3, i419).getB3(), null, c28655q111111, 48, C2886a.f11498d << 18, 196600);
                    c28655q3 = c28655q111111;
                }
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            function3 = function112;
            interfaceC4339a10 = interfaceC4339a16;
            interfaceC4339a9 = interfaceC4339a1111112;
            interfaceC4339a7 = interfaceC4339a1111113;
            interfaceC4339a8 = interfaceC4339a1111114;
        } else {
            c28655q3.m87138X();
            interfaceC4339a7 = interfaceC4339a2;
            interfaceC4339a8 = interfaceC4339a4;
            interfaceC4339a9 = interfaceC4339a5;
            function3 = function2;
            interfaceC4339a10 = interfaceC4339a6;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(state, interfaceC4339a9, interfaceC4339a7, function3, interfaceC4339a10, interfaceC4339a8, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m90755p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m90756q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m90757r(EnumC21172v it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m90758s() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m90759t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m90760u(Function1 function1, EnumC21172v enumC21172v) {
        function1.invoke(enumC21172v);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m90761v(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m90762w(C29594d c29594d, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, int i13, int i14, Composer composer, int i15) {
        m90754o(c29594d, interfaceC4339a, interfaceC4339a2, function1, interfaceC4339a3, interfaceC4339a4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m90763x(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1690305662);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f13 = 8;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 3 * f13, 0.0f, 1 * f13, 5), c38072d.m121949b(c28655q2, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH6(), null, c28655q, (i14 & 14) | 48, C2886a.f11498d << 18, 196600);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m90764y(String str, int i13, Composer composer, int i14) {
        m90763x(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0179  */
    /* JADX WARN: Code duplicated, block: B:35:0x0181  */
    /* JADX WARN: Code duplicated, block: B:40:0x019f  */
    /* JADX WARN: Code duplicated, block: B:46:0x01cb A[LOOP:0: B:44:0x01be->B:46:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x01d5 A[EDGE_INSN: B:53:0x01d5->B:47:0x01d5 BREAK  A[LOOP:0: B:44:0x01be->B:46:0x01cb], SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    private static final void m90765z(C29596f c29596f, Composer composer, int i13) {
        int i14;
        long jM53363d;
        C0213j c0213j;
        C0213j c0213j2;
        int iHashCode;
        Iterator it;
        ListIterator listIterator;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-730005474);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c29596f) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (c29596f.getIsPresentedFlow()) {
                c28655q.m87150e0(2121407577);
                jM53363d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getCoachBlue();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2121456123);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            float f13 = 8;
            float f14 = 1 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j3 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0213j = c0213j3;
            } else {
                c0213j = c0213j3;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                long j7 = jM53363d;
                c0213j2 = c0213j;
                AbstractC30795n.m94707h(c29596f.getCaption(), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.5f * f13, 6), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB4(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, m90738G(AbstractC1102d.m3409f(1.0f, c2314t), j7, 2 * 4));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(748945014);
                it = AbstractC25265s.m74143q0(c29596f.m90775b()).iterator();
                while (true) {
                    listIterator = (ListIterator) ((C25249h0) it).f99126x;
                    if (listIterator.hasPrevious()) {
                        break;
                    } else {
                        m90733B((C29595e) listIterator.previous(), c28655q, 0);
                    }
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            long j13 = jM53363d;
            c0213j2 = c0213j;
            AbstractC30795n.m94707h(c29596f.getCaption(), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.5f * f13, 6), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getB4(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, m90738G(AbstractC1102d.m3409f(1.0f, c2314t), j13, 2 * 4));
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            c28655q.m87150e0(748945014);
            it = AbstractC25265s.m74143q0(c29596f.m90775b()).iterator();
            while (true) {
                listIterator = (ListIterator) ((C25249h0) it).f99126x;
                if (listIterator.hasPrevious()) {
                    break;
                    break;
                }
                m90733B((C29595e) listIterator.previous(), c28655q, 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(c29596f, i13, 12);
        }
    }
}
