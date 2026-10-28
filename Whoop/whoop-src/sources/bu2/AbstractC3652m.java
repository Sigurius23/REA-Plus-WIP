package bu2;

import a01.C0085e;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bs1.C3595n;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.C22931l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: bu2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lbu2/n;", "metricSliderRangeItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3652m {
    /* JADX INFO: renamed from: e */
    public static final void m11271e(C3653n metricSliderRangeItemState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(metricSliderRangeItemState, "metricSliderRangeItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1842383074);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(metricSliderRangeItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3595n(11);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC22953f.m66714a(modifier3, null, false, AbstractC37817c.m121344e(-977865848, c28655q, new C22931l(6, metricSliderRangeItemState, function3)), c28655q, ((i15 >> 3) & 14) | 3072, 6);
            function2 = function3;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(i13, i14, 23, modifier2, function2, metricSliderRangeItemState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11272f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11273g(C3653n c3653n, Function1 function1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fAbs = Math.abs(c3653n.getMaxPercentage() - c3653n.getMinPercentage()) * ((C1101c) BoxWithConstraints).m3402c();
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(fAbs);
            float f13 = 1;
            float f14 = 4;
            float f15 = f13 * f14;
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f15);
            final float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(((float) 0.5d) * f14);
            final float fMo743q3 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f13);
            final float fAbs2 = Math.abs(c3653n.getMaxPercentage() - c3653n.getMinPercentage());
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3414k = AbstractC1102d.m3414k(fAbs, AbstractC1102d.m3424u(f15, AbstractC1136a.m3599a(c2314t, "canvas")));
            boolean zM87147d = c28655q.m87147d(fMo743q1) | c28655q.m87147d(fMo743q2) | c28655q.m87147d(-80.0f) | c28655q.m87147d(fMo743q3) | c28655q.m87147d(fAbs2) | c28655q.m87147d(fMo743q0);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                Function1 function2 = new Function1() { // from class: bu2.l
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC3652m.m11274h(fMo743q1, fMo743q2, 80.0f, -80.0f, fMo743q3, fAbs2, fMo743q0, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function2);
                objM87133R = function2;
            }
            AbstractC21478l0.m60421a(modifierM3414k, (Function1) objM87133R, c28655q, 0);
            float f16 = 0;
            AbstractC3639b.m11213c(c3653n.getTopGoalInfoItemState(), AbstractC1099a.m3383e(c2314t, f16, -20), function1, c28655q, 48, 0);
            float f17 = fAbs + 2;
            float f18 = 12;
            if (f17 < f18) {
                f17 = f18;
            }
            AbstractC3639b.m11213c(c3653n.getBottomGoalInfoItemState(), AbstractC1099a.m3383e(c2314t, f16, f17), function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11274h(float f13, float f14, float f15, float f16, float f17, float f18, float f19, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long j7 = C17919x.f69629f;
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (496 & 8) != 0 ? 0.0f : f17, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        if (f18 > 0.02d) {
            InterfaceC22131e.m63385u(Canvas, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, j7)), new C17919x(C17919x.m51541c(0.2f, j7)), new C17919x(C17919x.m51541c(0.1f, j7)), new C17919x(C17919x.m51541c(0.05f, j7)), new C17919x(C17919x.f69636m)), f16, f15, 8), (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(2 * f15)) << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), 0.0f, null, 0, 120);
            Canvas.mo732d0(C17919x.m51541c(0.7f, j7), (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32), (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f16)) << 32), (496 & 8) != 0 ? 0.0f : f17, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m11275i(C3653n c3653n, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m11271e(c3653n, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
