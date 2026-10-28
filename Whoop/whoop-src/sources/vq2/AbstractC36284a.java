package vq2;

import a01.C0091k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jr2.AbstractC21903b;
import jr2.C21905d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import qz0.AbstractC30795n;
import t80.C33592b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vq2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvq2/c;", "stepState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lvq2/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "graphStartPosition", "graphEndPosition", "Ljr2/d;", "background", "d", "(FFLjr2/d;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/whoop/design/util/TextResource;", "times", "f", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36284a {
    /* JADX INFO: renamed from: d */
    public static final void m115987d(float f13, float f14, C21905d background, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(background, "background");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1302755496);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(background) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC22989q.m66760a(AbstractC21903b.m62312a(AbstractC29011e.m88145f(C2314t.f9131w, f13, 0.0f, f14 - f13, 1.0f, null, 16, null), background), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0091k(f13, f14, background, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m115988e(float f13, float f14, C21905d c21905d, int i13, Composer composer, int i14) {
        m115987d(f13, f14, c21905d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m115989f(List<? extends TextResource> times, Composer composer, int i13) {
        C28655q c28655q;
        long jM51541c;
        AbstractC22676k.m65750j(times, "times");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(718276692);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(times) ? 4 : 2) | i13 : i13;
        boolean z4 = false;
        boolean z13 = true;
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3 * 4, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(1090481325);
            int i15 = 0;
            for (Object obj : times) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                TextResource textResource = (TextResource) obj;
                if (i15 % 2 == 0) {
                    c28655q2.m87150e0(-458454151);
                    jM51541c = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                } else {
                    c28655q2.m87150e0(-458453018);
                    jM51541c = C17919x.m51541c(0.5f, C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String());
                }
                c28655q2.m87173q(z4);
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, TextResource.$stable), null, jM51541c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getN8(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                z4 = z4;
                c28655q2 = c28655q3;
                i15 = i16;
                z13 = true;
            }
            c28655q = c28655q2;
            c28655q.m87173q(z4);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(times, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m115990g(List list, int i13, Composer composer, int i14) {
        m115989f(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m115991h(C36286c stepState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        AbstractC22676k.m65750j(stepState, "stepState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-72917150);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(stepState) ? 4 : 2);
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
                    modifier2 = c2314t;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC21903b.m62312a(c2314t, stepState.getHorizontalBarBackground()));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3409f, true, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                m115987d(stepState.getSleepFillPercentageLower(), stepState.getSleepFillPercentageHigher(), stepState.getSleepFillBackground(), c28655q, 0);
                c28655q.m87173q(true);
                m115989f(stepState.m115996e(), c28655q, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(stepState, i13, modifier3, i14, 19);
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
                modifier2 = c2314t;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * 4), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC21903b.m62312a(c2314t, stepState.getHorizontalBarBackground()));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g2 = AbstractC11895b.m31988g(modifierM3409f2, true, 1.0f);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM31988g2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            m115987d(stepState.getSleepFillPercentageLower(), stepState.getSleepFillPercentageHigher(), stepState.getSleepFillBackground(), c28655q, 0);
            c28655q.m87173q(true);
            m115989f(stepState.m115996e(), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(stepState, i13, modifier3, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m115992i(C36286c c36286c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m115991h(c36286c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
