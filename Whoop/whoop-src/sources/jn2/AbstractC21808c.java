package jn2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import cz0.C11251l;
import e93.AbstractC12889b;
import java.util.Arrays;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.error.ErrorCodes;
import p005a3.C0238p0;
import p026b2.C2314t;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: jn2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t0\b2\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "Li2/x;", "animationAccentColor", "", "alpha", "e", "(Landroidx/compose/ui/Modifier;JF)Landroidx/compose/ui/Modifier;", "color", "", "Ll83/k;", "j", "(JF)[Ll83/k;", "opacity", "d", "(JF)J", "angle", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21808c {
    /* JADX INFO: renamed from: d */
    private static final long m61735d(long j7, float f13) {
        float fM36283m = AbstractC12889b.m36283m(f13, 0.0f, 1.0f);
        if (Math.abs(C17919x.m51547i(j7)) > Float.MAX_VALUE || Math.abs(C17919x.m51546h(j7)) > Float.MAX_VALUE || Math.abs(C17919x.m51544f(j7)) > Float.MAX_VALUE) {
            return C17919x.f69629f;
        }
        float f14 = 1.0f - fM36283m;
        return AbstractC17918w0.m51518f((C17919x.m51547i(j7) * fM36283m) + f14, (C17919x.m51546h(j7) * fM36283m) + f14, (C17919x.m51544f(j7) * fM36283m) + f14, 1.0f, 16);
    }

    /* JADX INFO: renamed from: e */
    public static final Modifier m61736e(Modifier rotatingGradientBorder, long j7, float f13) {
        AbstractC22676k.m65750j(rotatingGradientBorder, "$this$rotatingGradientBorder");
        return AbstractC37056f.m118997u(rotatingGradientBorder, new C21806a(j7, f13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m61737f(long j7, float f13, Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1956226878);
        C11365j0 c11365j0M30559g = AbstractC11348f.m30559g(AbstractC11348f.m30571s("streak-rotation", c28655q, 0), 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(ErrorCodes.InitAPIErrors.cServerErrors, 0, AbstractC11333b0.f36312c, 2), null, 6), "streak rotation transition", c28655q, 29112, 0);
        boolean zM87153g = c28655q.m87153g(c11365j0M30559g) | c28655q.m87151f(j7) | c28655q.m87147d(f13);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            C11251l c11251l = new C11251l(j7, f13, c11365j0M30559g, 2);
            c28655q.m87172p0(c11251l);
            objM87133R = c11251l;
        }
        Modifier modifierMo3471e = composed.mo3471e(AbstractC1125a.m3479b(C2314t.f9131w, (Function1) objM87133R));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }

    /* JADX INFO: renamed from: g */
    private static final float m61738g(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C14018g m61739h(final long j7, final float f13, final InterfaceC28670t2 interfaceC28670t2, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        float f14 = 4;
        final float density = drawWithCache.getDensity() * ((float) 0.25d) * f14;
        final float density2 = drawWithCache.getDensity() * 3 * f14;
        return drawWithCache.m39910a(new Function1() { // from class: jn2.b
            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC21808c.m61740i(j7, f13, density2, density, interfaceC28670t2, (InterfaceC22129c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m61740i(long j7, float f13, float f14, float f15, InterfaceC28670t2 interfaceC28670t2, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        C0238p0 c0238p0 = (C0238p0) onDrawWithContent;
        c0238p0.m728a();
        C22128b c22128b = c0238p0.f815w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32));
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (fIntBitsToFloat > 0.0f && Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) > 0.0f) {
            double radians = (float) Math.toRadians(m61738g(interfaceC28670t2));
            float fCos = (float) Math.cos(radians);
            float fSin = (float) Math.sin(radians);
            float fHypot = ((float) Math.hypot(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)), Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) / 2.0f;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) / 2.0f;
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) / 2.0f;
            if (Math.abs(fHypot) <= Float.MAX_VALUE && Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE && Math.abs(fIntBitsToFloat3) <= Float.MAX_VALUE) {
                float f16 = fCos * fHypot;
                float f17 = fSin * fHypot;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - f16)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3 - f17)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2 + f16)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3 + f17)) & 4294967295L);
                C17909s c17909s = AbstractC17911t.f69612b;
                C23465k[] c23465kArrM61741j = m61741j(j7, f13);
                InterfaceC22131e.m63376J0(onDrawWithContent, C17909s.m51487e(c17909s, (C23465k[]) Arrays.copyOf(c23465kArrM61741j, c23465kArrM61741j.length), jFloatToRawIntBits, jFloatToRawIntBits2, 8), 0L, c22128b.mo731d(), (((long) Float.floatToRawIntBits(f14)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f14))), 0.0f, new C22135i(f15, 0.0f, 0, 0, null, 30), 210);
            }
        }
        return c23454a0;
    }

    /* JADX INFO: renamed from: j */
    private static final C23465k[] m61741j(long j7, float f13) {
        long jM61735d = m61735d(j7, 0.6f);
        Float fValueOf = Float.valueOf(0.0f);
        long j13 = C17919x.f69636m;
        return new C23465k[]{new C23465k(fValueOf, new C17919x(j13)), new C23465k(Float.valueOf(0.296f), new C17919x(C17919x.m51541c(C17919x.m51543e(j7) * f13, j7))), new C23465k(Float.valueOf(0.4f), new C17919x(C17919x.m51541c(C17919x.m51543e(jM61735d) * f13, jM61735d))), new C23465k(Float.valueOf(0.52f), new C17919x(C17919x.m51541c(C17919x.m51543e(j7) * f13, j7))), new C23465k(Float.valueOf(0.8f), new C17919x(j13)), new C23465k(Float.valueOf(1.0f), new C17919x(j13))};
    }
}
