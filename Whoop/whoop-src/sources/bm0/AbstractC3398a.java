package bm0;

import android.graphics.CornerPathEffect;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bb2.C2925a;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17893k;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p699b70.C2775a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x81.C38072d;

/* JADX INFO: renamed from: bm0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3398a {
    /* JADX INFO: renamed from: c */
    public static final void m9779c(Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-169856441);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long brandBlack = c38072d.m121949b(c28655q, i17).getBrandBlack();
            long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
            float f13 = 4;
            Modifier modifierM3411h = AbstractC1102d.m3411h(((float) 2.5d) * f13, AbstractC1102d.m3424u(f13 * f13, modifier));
            boolean zM87151f = c28655q.m87151f(brandWhite) | c28655q.m87151f(brandBlack);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                C2925a c2925a = new C2925a(brandWhite, brandBlack, 1);
                c28655q.m87172p0(c2925a);
                objM87133R = c2925a;
            }
            AbstractC21478l0.m60421a(modifierM3411h, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2775a(i13, i14, 1, modifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m9780d(long j7, long j13, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        long jMo721B0 = Canvas.mo721B0();
        C0237p c0237pMo744t0 = Canvas.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2358v(180.0f, jMo721B0);
            float f13 = 2;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            C17891j c17891jM51478a = AbstractC17897m.m51478a();
            int i13 = (int) (jFloatToRawIntBits >> 32);
            int i14 = (int) (jFloatToRawIntBits & 4294967295L);
            c17891jM51478a.m51462i(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            c17891jM51478a.m51461h(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)));
            c17891jM51478a.m51461h(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
            c17891jM51478a.m51461h(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14));
            c17891jM51478a.m51459f();
            InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j7, 0.0f, C22134h.f85857a, 52);
            InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j13, 0.0f, new C22135i(Canvas.mo743q0(f13), 0.0f, 1, 1, new C17893k(new CornerPathEffect(Canvas.mo743q0(f13))), 2), 52);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m9781e(Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m9779c(modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
