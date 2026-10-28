package p723o22;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j93.AbstractC21478l0;
import java.util.List;
import l83.C23454a0;
import p000.C2175b;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17893k;
import p208i2.C17894k0;
import p208i2.C17909s;
import p208i2.C17914u0;
import p208i2.C17919x;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24960o;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: o22.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f²\u0006\f\u0010\u000e\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m65681d2 = {"", "dragPercentage", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "c", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "Li2/x;", "a", "Ljava/util/List;", "firstCircleGradientColors", "b", "secondCircleGradientColors", "circleAlpha", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27468b {

    /* JADX INFO: renamed from: a */
    private static final List<C17919x> f110674a;

    /* JADX INFO: renamed from: b */
    private static final List<C17919x> f110675b;

    static {
        int i13 = C17919x.f69638o;
        f110674a = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(AbstractC17918w0.m51516d(255, 255, 255, 25)));
        f110675b = AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51516d(102, 188, 255, 51)), new C17919x(AbstractC17918w0.m51516d(76, 155, 217, 51)), new C17919x(AbstractC17918w0.m51516d(0, 147, 231, 51)));
    }

    /* JADX INFO: renamed from: c */
    public static final void m82891c(float f13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1048351059);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
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
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13 / 100.0f, null, "circleAlpha", null, c28655q, 3072, 22);
            Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3419p(502, modifier3), 0.0f, 251 - f13, 1);
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2M30588b);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2175b(interfaceC28670t2M30588b, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3392n, (Function1) objM87133R, c28655q, 0);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24960o(f13, modifier2, i13, i14, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final float m82892d(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m82893e(InterfaceC28670t2 interfaceC28670t2, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fMin = Math.min(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) * 1.5f, Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)));
        C17909s c17909s = AbstractC17911t.f69612b;
        float f13 = fMin / 2;
        C17914u0 c17914u0M51489g = C17909s.m51489g(c17909s, f110674a, Canvas.mo721B0(), f13, 8);
        C17894k0 c17894k0M51486d = C17909s.m51486d(c17909s, f110675b, 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)))) & 4294967295L), 10);
        InterfaceC22131e.m63375G(Canvas, c17914u0M51489g, f13, Canvas.mo721B0(), 1.0f - m82892d(interfaceC28670t2), null, 112);
        float f14 = (float) 1.5d;
        InterfaceC22131e.m63379M(Canvas, C17919x.m51541c((1.0f - m82892d(interfaceC28670t2)) * 0.3f, C17919x.f69629f), f13, Canvas.mo721B0(), 0.0f, new C22135i(Canvas.mo743q0(f14), 0.0f, 1, 1, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, (1.0f - m82892d(interfaceC28670t2)) * 10.0f)), 2), 104);
        InterfaceC22131e.m63379M(Canvas, C17919x.m51541c(m82892d(interfaceC28670t2) * 0.7f, AbstractC17918w0.m51516d(103, 174, 230, 255)), f13, Canvas.mo721B0(), 0.0f, new C22135i(Canvas.mo743q0(f14), 0.0f, 1, 1, null, 18), 104);
        InterfaceC22131e.m63375G(Canvas, c17894k0M51486d, f13, Canvas.mo721B0(), m82892d(interfaceC28670t2) * 0.7f, null, 112);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m82894f(float f13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m82891c(f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
