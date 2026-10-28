package bu2;

import a01.C0089i;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j93.AbstractC21478l0;
import l83.C23454a0;
import l83.C23465k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17894k0;
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

/* JADX INFO: renamed from: bu2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lbu2/h;", "metricSliderLevelItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "d", "(Lbu2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3649j {
    /* JADX INFO: renamed from: d */
    public static final void m11258d(C3647h metricSliderLevelItemState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(metricSliderLevelItemState, "metricSliderLevelItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1652156132);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(metricSliderLevelItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier;
            AbstractC22953f.m66714a(modifier3, null, false, AbstractC37817c.m121344e(1691055950, c28655q, new C3645f(1, metricSliderLevelItemState)), c28655q, ((i15 >> 3) & 14) | 3072, 6);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(metricSliderLevelItemState, i13, modifier2, i14, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m11259e(final C3647h c3647h, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 4;
            final float fM3403d = (7 * f13) + ((C1101c) BoxWithConstraints).m3403d();
            final long jM51541c = C17919x.m51541c(0.0f, c3647h.getLineColor());
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float f14 = ((float) 0.5d) * f13;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f14);
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f14);
            float f15 = 1;
            final float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f15);
            Modifier modifierM3418o = AbstractC1102d.m3418o(fM3403d, AbstractC1102d.m3411h(f15 * f13, C2314t.f9131w));
            boolean zM87151f = c28655q.m87151f(jM51541c) | c28655q.m87157i(c3647h) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87147d(fM3403d) | c28655q.m87147d(fMo743q2);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: bu2.i
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC3649j.m11260f(jM51541c, c3647h, fMo743q0, fMo743q1, fM3403d, fMo743q2, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3418o, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11260f(long j7, C3647h c3647h, float f13, float f14, float f15, float f16, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        C17894k0 c17894k0M51487e = C17909s.m51487e(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.05f), new C17919x(j7)), new C23465k(Float.valueOf(0.1f), new C17919x(c3647h.getLineColor())), new C23465k(Float.valueOf(0.9f), new C17919x(c3647h.getLineColor())), new C23465k(Float.valueOf(0.95f), new C17919x(j7))}, 0L, 0L, 14);
        C17893k c17893k = new C17893k(new DashPathEffect(new float[]{f13, f14}, 0.0f));
        Canvas.mo727R(c17894k0M51487e, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Canvas.mo743q0(f15))) << 32), f16, (496 & 32) != 0 ? null : c17893k, (496 & 64) != 0 ? 1.0f : 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11261g(C3647h c3647h, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m11258d(c3647h, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
