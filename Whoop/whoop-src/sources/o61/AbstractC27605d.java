package o61;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j71.AbstractC21394b;
import j93.AbstractC21478l0;
import l83.C23454a0;
import mx1.C26003i;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.C17893k;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: o61.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj71/b$e;", "plotState", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lj71/b$e;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27605d {
    /* JADX INFO: renamed from: c */
    public static final void m83352c(Modifier modifier, AbstractC21394b.e eVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM73366B;
        final AbstractC21394b.e plotState = eVar;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(plotState, "plotState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-69884108);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(modifier) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(plotState) : c28655q2.m87157i(plotState) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            final long black30 = c38072d.m121949b(c28655q2, 6).getBlack30();
            C27606e pointState = plotState.getPointState();
            C17919x c17919xM31989h = null;
            InterfaceC39332e markerColorOverride = pointState != null ? pointState.getMarkerColorOverride() : null;
            if (markerColorOverride == null) {
                c28655q2.m87150e0(1141875130);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1560855335);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, false, markerColorOverride.mo134584toComposableColorWaAFU9c(c28655q2, 0));
            }
            if (c17919xM31989h == null) {
                jM73366B = AbstractC25012a.m73366B(c28655q2, 1560856638, c38072d, c28655q2, 6);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1560854034);
                c28655q2.m87173q(false);
                jM73366B = c17919xM31989h.f69639a;
            }
            final long white50 = c38072d.m121949b(c28655q2, 6).getWhite50();
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            float f13 = (float) 1.5d;
            final float fMo743q0 = interfaceC39171c.mo743q0(f13);
            final float fMo743q1 = interfaceC39171c.mo743q0(f13);
            final float fMo743q2 = interfaceC39171c.mo743q0(1);
            float f14 = 4;
            final float fMo743q3 = interfaceC39171c.mo743q0(f14);
            int i15 = i14;
            final float fMo743q4 = interfaceC39171c.mo743q0(f14 * f14);
            final float fMo743q5 = interfaceC39171c.mo743q0(2 * f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = AbstractC1102d.m3407d(1.0f, c2314t).mo3471e(modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
            final long j7 = jM73366B;
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87151f = ((i15 & 112) == 32 || ((i15 & 64) != 0 && c28655q2.m87157i(plotState))) | c28655q2.m87151f(white50) | c28655q2.m87147d(fMo743q3) | c28655q2.m87147d(fMo743q2) | c28655q2.m87147d(fMo743q0) | c28655q2.m87147d(fMo743q1) | c28655q2.m87151f(black30) | c28655q2.m87147d(fMo743q4) | c28655q2.m87151f(j7) | c28655q2.m87147d(fMo743q5);
            Object objM87133R = c28655q2.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                c28655q = c28655q2;
                plotState = eVar;
                Function1 function1 = new Function1() { // from class: o61.c
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC27605d.m83353d(plotState, white50, fMo743q3, fMo743q2, fMo743q0, fMo743q1, black30, fMo743q4, j7, fMo743q5, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            } else {
                plotState = eVar;
                c28655q = c28655q2;
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(modifier, plotState, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m83353d(AbstractC21394b.e eVar, long j7, float f13, float f14, float f15, float f16, long j13, float f17, long j14, float f18, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C27606e pointState = eVar.getPointState();
        if (pointState != null) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((1 - pointState.getPositionY()) * Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L);
            int i13 = (int) (jFloatToRawIntBits >> 32);
            Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(-f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) + f13))), (496 & 8) != 0 ? 0.0f : f14, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f15, f16}, 0.0f)));
            float f19 = 2;
            InterfaceC22131e.m63379M(Canvas, j13, f17 / f19, jFloatToRawIntBits, 0.0f, null, 120);
            InterfaceC22131e.m63379M(Canvas, j14, f18 / f19, jFloatToRawIntBits, 0.0f, null, 120);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m83354e(Modifier modifier, AbstractC21394b.e eVar, int i13, Composer composer, int i14) {
        m83352c(modifier, eVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
