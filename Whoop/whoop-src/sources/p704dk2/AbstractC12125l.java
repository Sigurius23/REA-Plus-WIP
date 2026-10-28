package p704dk2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import d62.C11736b;
import dh0.C12040a;
import l83.C23454a0;
import l83.C23465k;
import p005a3.C0238p0;
import p026b2.C2314t;
import p181h2.C16618c;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import x81.C38072d;

/* JADX INFO: renamed from: dk2.l */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh2/c;", "plotPadding", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V", "tilt-graph_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12125l {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m33576c(Modifier modifier, C16618c c16618c, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C16618c c16618c2;
        boolean z4;
        Modifier modifier3;
        C16618c c16618c3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C16618c c16618c4;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2038550235);
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
                c16618c2 = c16618c;
                i15 |= c28655q.m87153g(c16618c2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    c16618c4 = C16618c.f63938e;
                } else {
                    c16618c4 = c16618c2;
                }
                Modifier modifierM3488c = AbstractC1127a.m3488c(AbstractC29011e.m88145f(modifier4, 0.0f, 0.0f, 0.0f, c16618c4.f63940b, null, 23, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C12040a(21);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1125a.m3480c(modifierM3488c, (Function1) objM87133R), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), c28655q, 0);
                c16618c3 = c16618c4;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c16618c3 = c16618c2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11736b(modifier3, i13, c16618c3, i14, 4);
            }
        }
        i15 |= 48;
        c16618c2 = c16618c;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                c16618c4 = C16618c.f63938e;
            } else {
                c16618c4 = c16618c2;
            }
            Modifier modifierM3488c2 = AbstractC1127a.m3488c(AbstractC29011e.m88145f(modifier4, 0.0f, 0.0f, 0.0f, c16618c4.f63940b, null, 23, null), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1, 458751);
            objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C12040a(21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1125a.m3480c(modifierM3488c2, (Function1) objM87133R), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), c28655q, 0);
            c16618c3 = c16618c4;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c16618c3 = c16618c2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier3, i13, c16618c3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m33577d(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        C23465k c23465k = new C23465k(Float.valueOf(0.0f), new C17919x(C17919x.f69636m));
        Float fValueOf = Float.valueOf(0.1f);
        long j7 = C17919x.f69625b;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51484b(c17909s, new C23465k[]{c23465k, new C23465k(fValueOf, new C17919x(j7))}), 0L, 0L, 0.0f, null, 6, 62);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        C22128b c22128b = c0238p0.f815w;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32))) << 32);
        float f13 = 1;
        drawWithContent.mo732d0(j7, jFloatToRawIntBits, jFloatToRawIntBits2, (496 & 8) != 0 ? 0.0f : c0238p0.mo743q0(f13), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        drawWithContent.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) & 4294967295L), (496 & 8) != 0 ? 0.0f : c0238p0.mo743q0(f13), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m33578e(Modifier modifier, C16618c c16618c, int i13, int i14, Composer composer, int i15) {
        m33576c(modifier, c16618c, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
