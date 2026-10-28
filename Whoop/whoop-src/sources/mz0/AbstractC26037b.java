package mz0;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import br2.C3565g;
import j93.AbstractC21478l0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p133f1.C13933e;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17893k;
import p208i2.InterfaceC17910s0;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mz0.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lmz0/a;", "orientation", "Li2/x;", "color", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Lmz0/a;JLandroidx/compose/runtime/Composer;II)V", "", "canvasHeight", "canvasWidth", "Li2/s0;", "f", "(FF)Li2/s0;", "g", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26037b {

    /* JADX INFO: renamed from: mz0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f103017a;

        static {
            int[] iArr = new int[EnumC26036a.values().length];
            try {
                iArr[EnumC26036a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26036a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f103017a = iArr;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m77457c(Modifier modifier, EnumC26036a orientation, long j7, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(orientation, "orientation");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1367543968);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(orientation.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            float f13 = 4;
            Modifier modifierMo3471e = AbstractC1102d.m3424u(((float) 7.75d) * f13, AbstractC1102d.m3411h(((float) 23.75d) * f13, modifier2)).mo3471e(modifier2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            boolean z4 = c28655q.m87161k(AbstractC2453v1.f9575n) == EnumC39181m.f168424x;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            boolean zM87155h = ((i15 & 112) == 32) | c28655q.m87155h(z4) | ((i15 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87155h || objM87133R == C28635l.f115821a) {
                objM87133R = new C13933e(orientation, z4, j7);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3407d, (Function1) objM87133R, c28655q, 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier3 = modifier2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(modifier3, orientation, j7, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m77458d(EnumC26036a enumC26036a, boolean z4, long j7, InterfaceC22131e Canvas) {
        InterfaceC17910s0 interfaceC17910s0M77461g;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32));
        int i13 = a.f103017a[enumC26036a.ordinal()];
        if (i13 == 1) {
            interfaceC17910s0M77461g = z4 ? m77461g(fIntBitsToFloat, fIntBitsToFloat2) : m77460f(fIntBitsToFloat, fIntBitsToFloat2);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC17910s0M77461g = z4 ? m77460f(fIntBitsToFloat, fIntBitsToFloat2) : m77461g(fIntBitsToFloat, fIntBitsToFloat2);
        }
        InterfaceC22131e.m63386z(Canvas, interfaceC17910s0M77461g, j7, 0.0f, new C22135i(2.0f, 0.0f, 0, 0, new C17893k(new ComposePathEffect(new DashPathEffect(new float[]{8.0f, 4.0f}, 0.0f), new CornerPathEffect(Canvas.mo743q0(8)))), 14), 52);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m77459e(Modifier modifier, EnumC26036a enumC26036a, long j7, int i13, int i14, Composer composer, int i15) {
        m77457c(modifier, enumC26036a, j7, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final InterfaceC17910s0 m77460f(float f13, float f14) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(0.0f, f13);
        c17891jM51478a.m51461h(0.0f, 0.0f);
        c17891jM51478a.m51461h(f14, 0.0f);
        return c17891jM51478a;
    }

    /* JADX INFO: renamed from: g */
    private static final InterfaceC17910s0 m77461g(float f13, float f14) {
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        c17891jM51478a.m51462i(0.0f, 0.0f);
        c17891jM51478a.m51461h(f14, 0.0f);
        c17891jM51478a.m51461h(f14, f13);
        return c17891jM51478a;
    }
}
