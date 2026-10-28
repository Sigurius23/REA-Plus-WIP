package t61;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import az0.C2158a;
import com.whoop.data.local.room.dao.persistent.C6493d;
import com.whoop.design.util.AbstractC8693b;
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
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import u61.C34554c;
import u61.C34555d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: t61.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu61/c;", "circleState", "Lu61/d;", "labelState", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;Lu61/c;Lu61/d;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "textOffset", "g", "(Lu61/d;FLandroidx/compose/runtime/Composer;I)V", "", "drawBackground", "j", "(FZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33552b {
    /* JADX INFO: renamed from: e */
    public static final void m105950e(Modifier modifier, C34554c circleState, C34555d c34555d, Composer composer, int i13, int i14) {
        int i15;
        C17919x c17919xM31989h;
        long jM95624D;
        AbstractC22676k.m65750j(circleState, "circleState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(39070251);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(circleState) : c28655q.m87157i(circleState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c34555d) : c28655q.m87157i(c34555d) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float size = circleState.getSize();
            InterfaceC39332e color = circleState.getColor();
            if (color == null) {
                c28655q.m87150e0(-164423715);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-1252229980);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, color.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(-1252228677);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1252230537);
                c28655q.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            if (c34555d == null) {
                c28655q.m87150e0(-164350121);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-164350120);
                m105952g(c34555d, (1 * 8) + size, c28655q, 0);
                c28655q.m87173q(false);
            }
            AbstractC33556f.m105964c(null, jM95624D, size, circleState.getShape(), c28655q, 0, 1);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(modifier2, circleState, c34555d, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m105951f(Modifier modifier, C34554c c34554c, C34555d c34555d, int i13, int i14, Composer composer, int i15) {
        m105950e(modifier, c34554c, c34555d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m105952g(C34555d c34555d, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C33551a c33551a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(677416909);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(c34555d) : c28655q2.m87157i(c34555d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            if (AbstractC8693b.m21269c(c34555d.getLabel())) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c33551a = new C33551a(c34555d, f13, i13, 0);
                }
            } else {
                c28655q = c28655q2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34555d.getLabel(), c28655q2, 0), m105955j(c34555d.getDrawLabelBelow() ? f13 : -f13, c34555d.getLabelBackground(), c28655q2, 0), c34555d.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getN8(), null, c28655q, 0, 0, 196600);
            }
            c28677v1M87180u.f115982d = c33551a;
        }
        c28655q = c28655q2;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c33551a = new C33551a(c34555d, f13, i13, 1);
            c28677v1M87180u.f115982d = c33551a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m105953h(C34555d c34555d, float f13, int i13, Composer composer, int i14) {
        m105952g(c34555d, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m105954i(C34555d c34555d, float f13, int i13, Composer composer, int i14) {
        m105952g(c34555d, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final Modifier m105955j(float f13, boolean z4, Composer composer, int i13) {
        C2314t c2314t = C2314t.f9131w;
        if (!z4) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1737227583);
            c28655q.m87173q(false);
            return AbstractC1099a.m3394p(2, AbstractC1099a.m3392n(c2314t, 0.0f, f13, 1));
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1737487518);
        long jM51541c = C17919x.m51541c(0.4f, C38072d.f163053a.m121949b(c28655q2, 6).getBackgroundDarkStd());
        Modifier modifierM3392n = AbstractC1099a.m3392n(c2314t, 0.0f, f13, 1);
        boolean zM87151f = c28655q2.m87151f(jM51541c);
        Object objM87133R = c28655q2.m87133R();
        if (zM87151f || objM87133R == C28635l.f115821a) {
            objM87133R = new C6493d(jM51541c, 3);
            c28655q2.m87172p0(objM87133R);
        }
        Modifier modifierM3394p = AbstractC1099a.m3394p(2, AbstractC1125a.m3478a(modifierM3392n, (Function1) objM87133R));
        c28655q2.m87173q(false);
        return modifierM3394p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105956k(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(6.0f)) << 32) | (((long) Float.floatToRawIntBits(6.0f)) & 4294967295L), null, 0.0f, 246);
        return C23454a0.f92919a;
    }
}
