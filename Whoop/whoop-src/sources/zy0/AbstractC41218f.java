package zy0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.AbstractC17918w0;
import p208i2.InterfaceC17869a1;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33209p1;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40670c0;

/* JADX INFO: renamed from: zy0.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li2/a1;", "shape", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41218f {
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m133900c(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC17869a1 interfaceC17869a2;
        boolean z4;
        Modifier modifier3;
        InterfaceC17869a1 interfaceC17869a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifierM3411h;
        InterfaceC17869a1 interfaceC17869a4;
        long white10;
        boolean zM87151f;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1521758051);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC17869a2 = interfaceC17869a1;
                i15 |= c28655q.m87153g(interfaceC17869a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    float f13 = 4;
                    modifierM3411h = AbstractC1102d.m3411h(f13 * f13, c2314t);
                } else {
                    modifierM3411h = modifier2;
                }
                if (i17 != 0) {
                    interfaceC17869a4 = AbstractC17918w0.f69621a;
                } else {
                    interfaceC17869a4 = interfaceC17869a2;
                }
                white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                Modifier modifierMo3471e = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), interfaceC17869a4).mo3471e(modifierM3411h);
                zM87151f = c28655q.m87151f(white10);
                objM87133R = c28655q.m87133R();
                if (zM87151f || objM87133R == C28635l.f115821a) {
                    objM87133R = new C33209p1(white10, 12);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierMo3471e, (Function1) objM87133R, c28655q, 0);
                modifier3 = modifierM3411h;
                interfaceC17869a3 = interfaceC17869a4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC17869a3 = interfaceC17869a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C40670c0(modifier3, i13, interfaceC17869a3, i14, 10);
            }
        }
        i15 |= 48;
        interfaceC17869a2 = interfaceC17869a1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                float f14 = 4;
                modifierM3411h = AbstractC1102d.m3411h(f14 * f14, c2314t);
            } else {
                modifierM3411h = modifier2;
            }
            if (i17 != 0) {
                interfaceC17869a4 = AbstractC17918w0.f69621a;
            } else {
                interfaceC17869a4 = interfaceC17869a2;
            }
            white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
            Modifier modifierMo3471e2 = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, c2314t), interfaceC17869a4).mo3471e(modifierM3411h);
            zM87151f = c28655q.m87151f(white10);
            objM87133R = c28655q.m87133R();
            if (zM87151f) {
                objM87133R = new C33209p1(white10, 12);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C33209p1(white10, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierMo3471e2, (Function1) objM87133R, c28655q, 0);
            modifier3 = modifierM3411h;
            interfaceC17869a3 = interfaceC17869a4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC17869a3 = interfaceC17869a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(modifier3, i13, interfaceC17869a3, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m133901d(long j7, InterfaceC22131e interfaceC22131e) throws Throwable {
        C0237p c0237p;
        long j13;
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        char c3 = ' ';
        int iM36258X = AbstractC12889b.m36258X(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / Canvas.mo743q0(6));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) / iM36258X;
        long j14 = 4294967295L;
        float f13 = 2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) * f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat / 3) << 32);
        int i13 = iM36258X + 1;
        int i14 = -1;
        if (-1 <= i13) {
            while (true) {
                C16618c c16618cM48896j = AbstractC17269i.m48896j((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (Canvas.mo731d() & j14)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & j14))) / f13)) & j14) | (Float.floatToRawIntBits(i14 * fIntBitsToFloat) << c3), jFloatToRawIntBits);
                long jM47198d = c16618cM48896j.m47198d();
                C0237p c0237pMo744t0 = Canvas.mo744t0();
                long jM670A = c0237pMo744t0.m670A();
                c0237pMo744t0.m716w().mo51426q();
                try {
                    ((C0929d) c0237pMo744t0.f812x).m2358v(45.0f, jM47198d);
                    long j15 = jFloatToRawIntBits;
                    int i15 = i14;
                    float f14 = f13;
                    int i16 = i13;
                    float f15 = fIntBitsToFloat;
                    c0237p = c0237pMo744t0;
                    j13 = jM670A;
                    try {
                        InterfaceC22131e.m63383i0(Canvas, j7, c16618cM48896j.m47200f(), c16618cM48896j.m47199e(), 0.0f, null, 0, 120);
                        AbstractC11266d.m30472z(c0237p, j13);
                        if (i15 == i16) {
                            break;
                        }
                        i14 = i15 + 1;
                        Canvas = interfaceC22131e;
                        i13 = i16;
                        fIntBitsToFloat = f15;
                        jFloatToRawIntBits = j15;
                        f13 = f14;
                        c3 = ' ';
                        j14 = 4294967295L;
                    } catch (Throwable th3) {
                        th = th3;
                        AbstractC11266d.m30472z(c0237p, j13);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c0237p = c0237pMo744t0;
                    j13 = jM670A;
                }
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m133902e(Modifier modifier, InterfaceC17869a1 interfaceC17869a1, int i13, int i14, Composer composer, int i15) {
        m133900c(modifier, interfaceC17869a1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
