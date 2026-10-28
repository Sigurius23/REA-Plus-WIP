package gb1;

import android.graphics.DashPathEffect;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import e81.C12819b0;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p005a3.C0238p0;
import p014aj.C0929d;
import p026b2.C2314t;
import p134f2.C14015d;
import p134f2.C14018g;
import p181h2.C16619d;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17911t;
import p208i2.C17875c1;
import p208i2.C17891j;
import p208i2.C17893k;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17910s0;
import p270k2.AbstractC22132f;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22669g0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gb1.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Ly3/f;", "width", "Li2/x;", "color", "Li2/a1;", "shape", "on", "off", "d", "(Landroidx/compose/ui/Modifier;FJLi2/a1;FF)Landroidx/compose/ui/Modifier;", "Li2/t;", "brush", "e", "(Landroidx/compose/ui/Modifier;FLi2/t;Li2/a1;FF)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15679g {
    /* JADX INFO: renamed from: d */
    public static final Modifier m44107d(Modifier dashedBorder, float f13, long j7, InterfaceC17869a1 shape, float f14, float f15) {
        AbstractC22676k.m65750j(dashedBorder, "$this$dashedBorder");
        AbstractC22676k.m65750j(shape, "shape");
        return m44108e(dashedBorder, f13, new C17875c1(j7), shape, f14, f15);
    }

    /* JADX INFO: renamed from: e */
    public static final Modifier m44108e(Modifier dashedBorder, final float f13, final AbstractC17911t brush, final InterfaceC17869a1 shape, final float f14, final float f15) {
        AbstractC22676k.m65750j(dashedBorder, "$this$dashedBorder");
        AbstractC22676k.m65750j(brush, "brush");
        AbstractC22676k.m65750j(shape, "shape");
        return AbstractC37056f.m118997u(dashedBorder, new Function3() { // from class: gb1.e
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC15679g.m44109f(shape, f13, f14, f15, brush, (Modifier) obj, (Composer) obj2, iIntValue);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m44109f(InterfaceC17869a1 interfaceC17869a1, float f13, float f14, float f15, AbstractC17911t abstractC17911t, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(491537174);
        boolean zM87153g = c28655q.m87153g(interfaceC17869a1) | c28655q.m87147d(f13) | c28655q.m87147d(f14) | c28655q.m87147d(f15) | c28655q.m87153g(abstractC17911t);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C12819b0 c12819b0 = new C12819b0(interfaceC17869a1, f13, f14, f15, abstractC17911t);
            c28655q.m87172p0(c12819b0);
            objM87133R = c12819b0;
        }
        Modifier modifierMo3471e = composed.mo3471e(AbstractC1125a.m3479b(C2314t.f9131w, (Function1) objM87133R));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C14018g m44110g(InterfaceC17869a1 interfaceC17869a1, float f13, final float f14, final float f15, final AbstractC17911t abstractC17911t, C14015d drawWithCache) {
        final C22669g0 c22669g0;
        InterfaceC17910s0 interfaceC17910s0M51478a;
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        final AbstractC17904p0 abstractC17904p0Mo39171a = interfaceC17869a1.mo39171a(drawWithCache.f50036w.mo468d(), drawWithCache.f50036w.getLayoutDirection(), drawWithCache);
        float density = C39174f.m124782b(f13, 0.0f) ? 1.0f : f13 * drawWithCache.getDensity();
        final C22669g0 c22669g1 = new C22669g0();
        C22669g0 c22669g2 = new C22669g0();
        final C22669g0 c22669g3 = new C22669g0();
        final C22663d0 c22663d0 = new C22663d0();
        final C22669g0 c22669g4 = new C22669g0();
        if (density <= 0.0f || C16620e.m47212d(drawWithCache.f50036w.mo468d()) <= 0.0f) {
            c22669g0 = c22669g2;
        } else if (abstractC17904p0Mo39171a instanceof C17900n0) {
            c22669g2.f89336w = new C22135i(density, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{drawWithCache.getDensity() * f14, drawWithCache.getDensity() * f15}, 0.0f)), 14);
            c22669g0 = c22669g2;
        } else {
            float f16 = density * 1.2f;
            float f17 = 2;
            c22663d0.f89331w = density - (f16 / f17);
            c22669g1.f89336w = interfaceC17869a1.mo39171a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() & 4294967295L)) - (c22663d0.f89331w * f17))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) - (c22663d0.f89331w * f17))) << 32), drawWithCache.f50036w.getLayoutDirection(), drawWithCache);
            c22669g2.f89336w = new C22135i(f16, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{drawWithCache.getDensity() * f14, drawWithCache.getDensity() * f15}, 0.0f)), 14);
            C17891j c17891jM51478a = null;
            if (abstractC17904p0Mo39171a instanceof C17902o0) {
                interfaceC17910s0M51478a = AbstractC17897m.m51478a();
                InterfaceC17910s0.m51496b(interfaceC17910s0M51478a, ((C17902o0) abstractC17904p0Mo39171a).f69602a);
            } else {
                interfaceC17910s0M51478a = abstractC17904p0Mo39171a instanceof C17898m0 ? ((C17898m0) abstractC17904p0Mo39171a).f69599a : null;
            }
            c22669g3.f89336w = interfaceC17910s0M51478a;
            Object obj = c22669g1.f89336w;
            if ((obj instanceof C17902o0) && !AbstractC21478l0.m60409O(((C17902o0) obj).f69602a)) {
                c17891jM51478a = AbstractC17897m.m51478a();
                InterfaceC17910s0.m51496b(c17891jM51478a, ((C17902o0) c22669g1.f89336w).f69602a);
                float f18 = c22663d0.f89331w;
                c17891jM51478a.m51466m((((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f18)) & 4294967295L));
            } else if (c22669g1.f89336w instanceof C17898m0) {
                c17891jM51478a = AbstractC17897m.m51478a();
                InterfaceC17910s0 interfaceC17910s0 = ((C17898m0) c22669g1.f89336w).f69599a;
                float f19 = c22663d0.f89331w;
                c17891jM51478a.m51457d(interfaceC17910s0, (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f19)) << 32));
            }
            c22669g4.f89336w = c17891jM51478a;
            c22669g0 = c22669g2;
        }
        return drawWithCache.m39910a(new Function1() { // from class: gb1.f
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AbstractC15679g.m44111h(c22669g0, c22669g1, c22669g3, abstractC17911t, c22663d0, c22669g4, abstractC17904p0Mo39171a, f14, f15, (InterfaceC22129c) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m44111h(C22669g0 c22669g0, C22669g0 c22669g1, C22669g0 c22669g2, AbstractC17911t abstractC17911t, C22663d0 c22663d0, C22669g0 c22669g3, AbstractC17904p0 abstractC17904p0, float f13, float f14, InterfaceC22129c onDrawWithContent) throws Throwable {
        C0237p c0237p;
        long jMo731d;
        C0237p c0237p2;
        int i13;
        C22128b c22128b;
        long j7;
        char c3;
        String str;
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        C0238p0 c0238p0 = (C0238p0) onDrawWithContent;
        C22128b c22128b2 = c0238p0.f815w;
        c0238p0.m728a();
        Object obj = c22669g0.f89336w;
        if (obj != null) {
            Object obj2 = c22669g1.f89336w;
            if (obj2 == null || c22669g2.f89336w == null) {
                float f15 = ((C22135i) obj).f85858a;
                float f16 = f15 / 2;
                InterfaceC22131e.m63385u(onDrawWithContent, abstractC17911t, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b2.mo731d() >> 32)) - f15)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b2.mo731d() & 4294967295L)) - f15)) & 4294967295L), 0.0f, (AbstractC22132f) c22669g0.f89336w, 0, 104);
            } else {
                boolean z4 = (obj2 instanceof C17902o0) && AbstractC21478l0.m60409O(((C17902o0) obj2).f69602a);
                C0237p c0237p3 = c22128b2.f85852x;
                long jM670A = c0237p3.m670A();
                c0237p3.m716w().mo51426q();
                try {
                    C0929d c0929d = (C0929d) c0237p3.f812x;
                    c0929d.m2344b((InterfaceC17910s0) c22669g2.f89336w, 1);
                    if (z4) {
                        float f17 = c22663d0.f89331w;
                        c0929d.m2339B(f17, f17);
                    }
                    try {
                        if (z4) {
                            try {
                                Object obj3 = c22669g1.f89336w;
                                AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded");
                                C16619d c16619d = ((C17902o0) obj3).f69602a;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(c16619d.f63943a)) << 32) | (((long) Float.floatToRawIntBits(c16619d.f63944b)) & 4294967295L);
                                c0237p2 = c0237p3;
                                try {
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(c16619d.m47208b())) << 32) | (((long) Float.floatToRawIntBits(c16619d.m47207a())) & 4294967295L);
                                    long j13 = c16619d.f63947e;
                                    i13 = 2;
                                    c22128b = c22128b2;
                                    j7 = jM670A;
                                    c3 = 1;
                                    InterfaceC22131e.m63376J0(onDrawWithContent, abstractC17911t, jFloatToRawIntBits, jFloatToRawIntBits2, j13, 0.0f, (AbstractC22132f) c22669g0.f89336w, 208);
                                    str = "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded";
                                } catch (Throwable th3) {
                                    th = th3;
                                    jMo731d = jM670A;
                                    c0237p = c0237p2;
                                    AbstractC11266d.m30472z(c0237p, jMo731d);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                c0237p2 = c0237p3;
                            }
                        } else {
                            c0237p2 = c0237p3;
                            c22128b = c22128b2;
                            c3 = 1;
                            j7 = jM670A;
                            i13 = 2;
                            str = "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded";
                            Object obj4 = c22669g3.f89336w;
                            if (obj4 != null) {
                                InterfaceC22131e.m63378L(onDrawWithContent, (InterfaceC17910s0) obj4, abstractC17911t, 0.0f, (AbstractC22132f) c22669g0.f89336w, 52);
                            }
                        }
                        c0237p2.m716w().mo51417g();
                        c0237p2.m690U(j7);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32));
                        jMo731d = c22128b.mo731d() & 4294967295L;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) jMo731d);
                        C0237p c0237p4 = c22128b.f85852x;
                        long jM670A2 = c0237p4.m670A();
                        c0237p4.m716w().mo51426q();
                        try {
                            ((C0929d) c0237p4.f812x).m2346d(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            if (z4) {
                                AbstractC22676k.m65748h(abstractC17904p0, str);
                                C16619d c16619d2 = ((C17902o0) abstractC17904p0).f69602a;
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(c16619d2.f63944b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c16619d2.f63943a)) << 32);
                                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(c16619d2.m47207a())) & 4294967295L) | (((long) Float.floatToRawIntBits(c16619d2.m47208b())) << 32);
                                long j14 = c16619d2.f63947e;
                                C0238p0 c0238p1 = (C0238p0) onDrawWithContent;
                                float fMo743q0 = c0238p1.mo743q0(f13);
                                float fMo743q1 = c0238p1.mo743q0(f14);
                                float[] fArr = new float[i13];
                                fArr[0] = fMo743q0;
                                fArr[c3] = fMo743q1;
                                InterfaceC22131e.m63376J0(onDrawWithContent, abstractC17911t, jFloatToRawIntBits3, jFloatToRawIntBits4, j14, 0.0f, new C22135i(0.0f, 0.0f, 0, 0, new C17893k(new DashPathEffect(fArr, 0.0f)), 14), 192);
                            } else {
                                InterfaceC17910s0 interfaceC17910s0 = (InterfaceC17910s0) c22669g2.f89336w;
                                C0238p0 c0238p2 = (C0238p0) onDrawWithContent;
                                float fMo743q2 = c0238p2.mo743q0(f13);
                                float fMo743q3 = c0238p2.mo743q0(f14);
                                float[] fArr2 = new float[i13];
                                fArr2[0] = fMo743q2;
                                fArr2[c3] = fMo743q3;
                                InterfaceC22131e.m63378L(onDrawWithContent, interfaceC17910s0, abstractC17911t, 0.0f, new C22135i(0.0f, 0.0f, 0, 0, new C17893k(new DashPathEffect(fArr2, 0.0f)), 14), 48);
                            }
                        } finally {
                            AbstractC11266d.m30472z(c0237p4, jM670A2);
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    c0237p = c0237p3;
                    jMo731d = jM670A;
                }
            }
        }
        return C23454a0.f92919a;
    }
}
