package p000;

import c31.AbstractC3932p;
import e93.AbstractC12889b;
import l83.C23454a0;
import o73.C27648a;
import p005a3.C0237p;
import p014aj.C0929d;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17891j;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p390p1.C28617g1;
import p390p1.InterfaceC28690z0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C38770y implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f166863E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f166864F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f166865G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f166866w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f166867x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f166868y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f166869z;

    public /* synthetic */ C38770y(C12476e0 c12476e0, float f13, InterfaceC28690z0 interfaceC28690z0, float f14, float f15, float f16) {
        this.f166864F = c12476e0;
        this.f166867x = f13;
        this.f166865G = interfaceC28690z0;
        this.f166868y = f14;
        this.f166869z = f15;
        this.f166863E = f16;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        float f13;
        float f14;
        float f15;
        InterfaceC22131e interfaceC22131e;
        long jM51518f;
        long j7;
        int i13;
        switch (this.f166866w) {
            case 0:
                C12476e0 c12476e0 = (C12476e0) this.f166864F;
                InterfaceC28690z0 interfaceC28690z0 = (InterfaceC28690z0) this.f166865G;
                float f16 = this.f166868y;
                float f17 = this.f166869z;
                float f18 = this.f166863E;
                InterfaceC22131e Canvas = (InterfaceC22131e) obj;
                AbstractC22676k.m65750j(Canvas, "$this$Canvas");
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) / 2.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / 2.0f)) << 32);
                float fM47212d = C16620e.m47212d(Canvas.mo731d()) / 2.2f;
                float f19 = c12476e0.f42581e;
                long j13 = c12476e0.f42584h;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((((float) ((((double) 1) - Math.sin(Math.toRadians(((double) f19) / 2.0d))) * ((double) fM47212d))) / 2.0f) + Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32);
                float f24 = c12476e0.f42581e;
                int i14 = c12476e0.f42580d;
                float f25 = i14;
                float f26 = f24 / f25;
                float f27 = c12476e0.f42582f;
                float f28 = ((c12476e0.f42595s * 3.0f) / 100.0f) * f25;
                int i15 = (int) ((this.f166867x / 100.0f) * f25);
                long j14 = c12476e0.f42585i;
                int i16 = 0;
                while (i16 < i14) {
                    float f29 = i16;
                    C28617g1 c28617g1 = (C28617g1) interfaceC28690z0;
                    float fM87022x = c28617g1.m87022x();
                    float f34 = fM87022x - f28;
                    long j15 = j13;
                    if (f34 > f29 || f29 > fM87022x) {
                        f13 = 1.0f;
                        f14 = f17;
                        f15 = f18;
                        interfaceC22131e = Canvas;
                        if (f29 <= c28617g1.m87022x()) {
                            jM51518f = i16 < i15 ? c12476e0.f42583g : j15;
                        } else {
                            jM51518f = C17919x.f69636m;
                        }
                    } else {
                        float fM36283m = AbstractC12889b.m36283m((f29 - f34) / f28, 0.0f, 1.0f);
                        f13 = 1.0f;
                        f14 = f17;
                        f15 = f18;
                        interfaceC22131e = Canvas;
                        jM51518f = AbstractC17918w0.m51518f(C27648a.m83569T(C17919x.m51547i(j15), C17919x.m51547i(j14), fM36283m), C27648a.m83569T(C17919x.m51546h(j15), C17919x.m51546h(j14), fM36283m), C27648a.m83569T(C17919x.m51544f(j15), C17919x.m51544f(j14), fM36283m), C27648a.m83569T(C17919x.m51543e(j15), C17919x.m51543e(j14), fM36283m), 16);
                    }
                    C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                    long jM670A = c0237pMo744t0.m670A();
                    c0237pMo744t0.m716w().mo51426q();
                    try {
                        ((C0929d) c0237pMo744t0.f812x).m2358v(f27, jFloatToRawIntBits2);
                        float f35 = (f13 - c12476e0.f42589m) * f16;
                        float f36 = f27;
                        C17891j c17891jM51478a = AbstractC17897m.m51478a();
                        long j16 = jFloatToRawIntBits2;
                        int i17 = (int) (j16 >> 32);
                        float f37 = f16 / 2.0f;
                        int i18 = i15;
                        long j17 = j14;
                        int i19 = (int) (j16 & 4294967295L);
                        c17891jM51478a.m51462i(Float.intBitsToFloat(i17) - f37, Float.intBitsToFloat(i19) - fM47212d);
                        c17891jM51478a.m51461h(Float.intBitsToFloat(i17) + f37, Float.intBitsToFloat(i19) - fM47212d);
                        float f38 = f35 / 2.0f;
                        c17891jM51478a.m51461h(Float.intBitsToFloat(i17) + f38, (Float.intBitsToFloat(i19) - fM47212d) + f14);
                        c17891jM51478a.m51461h(Float.intBitsToFloat(i17) - f38, (Float.intBitsToFloat(i19) - fM47212d) + f14);
                        c17891jM51478a.m51459f();
                        long j18 = C17919x.f69636m;
                        if (C17919x.m51542d(jM51518f, j18)) {
                            i13 = i17;
                            Canvas = interfaceC22131e;
                        } else {
                            i13 = i17;
                            Canvas = interfaceC22131e;
                            InterfaceC22131e.m63378L(Canvas, c17891jM51478a, C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.4f, jM51518f)), new C17919x(j18)), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i19) - fM47212d)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13))) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i19) - fM47212d) + f14)) & 4294967295L), 8), 0.0f, null, 60);
                        }
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i13) - f37)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat(i19) - fM47212d) - f15)) & 4294967295L);
                        int i24 = i16;
                        int i25 = i14;
                        float f39 = fM47212d;
                        long j19 = jM51518f;
                        j7 = jM670A;
                        try {
                            InterfaceC22131e.m63383i0(Canvas, j19, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f16)) << 32), 0.0f, null, 0, 120);
                            c0237pMo744t0.m716w().mo51417g();
                            c0237pMo744t0.m690U(j7);
                            i16 = i24 + 1;
                            f27 = f26 + (i16 % c12476e0.f42590n == 0 ? c12476e0.f42591o : 0.0f) + f36;
                            i15 = i18;
                            fM47212d = f39;
                            i14 = i25;
                            f17 = f14;
                            j13 = j15;
                            f18 = f15;
                            jFloatToRawIntBits2 = j16;
                            j14 = j17;
                        } catch (Throwable th3) {
                            th = th3;
                            AbstractC11266d.m30472z(c0237pMo744t0, j7);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        j7 = jM670A;
                    }
                }
                return C23454a0.f92919a;
            default:
                return AbstractC3932p.m11966h((AbstractC17911t) this.f166864F, (C17919x) this.f166865G, this.f166867x, this.f166868y, this.f166869z, this.f166863E, (InterfaceC22131e) obj);
        }
    }

    public /* synthetic */ C38770y(AbstractC17911t abstractC17911t, C17919x c17919x, float f13, float f14, float f15, float f16) {
        this.f166864F = abstractC17911t;
        this.f166865G = c17919x;
        this.f166867x = f13;
        this.f166868y = f14;
        this.f166869z = f15;
        this.f166863E = f16;
    }
}
