package xy0;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b21.C2330c;
import j93.AbstractC21478l0;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22135i;
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
import x81.C38072d;

/* JADX INFO: renamed from: xy0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ly3/f;", "radius", "", "startPercent", "endPercent", "Ll83/a0;", "c", "(FFFLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38699b {
    /* JADX INFO: renamed from: c */
    public static final void m124109c(float f13, final float f14, final float f15, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-885930963);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f14) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87147d(f15) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            final float f16 = f15 - f14;
            float f17 = 2;
            final float f18 = (f16 / f17) + f14;
            C38072d c38072d = C38072d.f163053a;
            final long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
            final long jM38559f = AbstractC13673n.m38559f(c38072d, c28655q, 6, 0.0f);
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(4);
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f17);
            final float fMo743q2 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(f17);
            Modifier modifierM3394p = AbstractC1099a.m3394p(f17 * f17, AbstractC1102d.m3419p(f13 * f17, C2314t.f9131w));
            boolean zM87147d = ((i14 & 112) == 32) | c28655q.m87147d(f16) | c28655q.m87151f(jM38559f) | c28655q.m87147d(f18) | c28655q.m87151f(jM125430y) | ((i14 & 896) == 256) | c28655q.m87147d(fMo743q2) | c28655q.m87147d(fMo743q0) | c28655q.m87147d(fMo743q1);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                Function1 function1 = new Function1() { // from class: xy0.a
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC38699b.m124110d(f14, f16, jM38559f, f18, jM125430y, f15, fMo743q2, fMo743q0, fMo743q1, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3394p, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2330c(f13, f14, f15, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m124110d(float f13, float f14, long j7, float f15, long j13, float f16, float f17, float f18, float f19, InterfaceC22131e Canvas) throws Throwable {
        long j14;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(-90.0f, jMo721B0);
            try {
                InterfaceC22131e.m63381X(Canvas, C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(f13), new C17919x(j7)), new C23465k(Float.valueOf(f15), new C17919x(j13)), new C23465k(Float.valueOf(f16), new C17919x(j7))}), f13 * 360.0f, 360.0f * f14, false, 0L, 0L, new C22135i(f17, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{f18, f19}, 0.0f)), 14), 0, 880);
                AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
                return C23454a0.f92919a;
            } catch (Throwable th3) {
                th = th3;
                j14 = jM670A;
                AbstractC11266d.m30472z(c0237pMo744t0, j14);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j14 = jM670A;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m124111e(float f13, float f14, float f15, int i13, Composer composer, int i14) {
        m124109c(f13, f14, f15, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
