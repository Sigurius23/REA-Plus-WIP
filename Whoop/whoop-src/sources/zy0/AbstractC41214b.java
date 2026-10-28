package zy0;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17893k;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wr0.C37564y;
import x81.C38072d;

/* JADX INFO: renamed from: zy0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lzy0/e;", "type", "Ll83/a0;", "c", "(Lzy0/e;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41214b {
    /* JADX INFO: renamed from: c */
    public static final void m133892c(final EnumC41217e type, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1292278763);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87149e(type.ordinal()) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            final float f13 = c38072d.m121948a(c28655q, 6).getStroke1Dp().f49345a;
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(4);
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(2);
            final long white70 = c38072d.m121949b(c28655q, 6).getWhite70();
            final long white10 = c38072d.m121949b(c28655q, 6).getWhite10();
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            boolean zM87147d = c28655q.m87147d(f13) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1) | c28655q.m87151f(white70) | ((i14 & 14) == 4) | c28655q.m87151f(white10);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: zy0.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC41214b.m133893d(f13, fMo743q0, fMo743q1, white70, type, white10, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(type, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m133893d(float f13, float f14, float f15, long j7, EnumC41217e enumC41217e, long j13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32), (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f14, f15}, 0.0f)));
        if (enumC41217e == EnumC41217e.RANGE) {
            InterfaceC22131e.m63383i0(Canvas, j13, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), 0.0f, null, 0, 120);
            Canvas.mo732d0(j7, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - f13)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : f13, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : new C17893k(new DashPathEffect(new float[]{f14, f15}, 0.0f)));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m133894e(EnumC41217e enumC41217e, int i13, Composer composer, int i14) {
        m133892c(enumC41217e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
