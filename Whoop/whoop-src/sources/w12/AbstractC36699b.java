package w12;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import eg2.C13179l;
import gb1.AbstractC15673b0;
import l83.C23454a0;
import lz0.AbstractC24821f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11352g;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w12.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u0011²\u0006\f\u0010\u0010\u001a\u00020\b8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "currentStep", "totalSteps", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(IILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "e", "(II)F", "Ly3/f;", "a", "F", "TRACK_HEIGHT", "TRACK_CORNER", "animatedProgress", "onboarding-personalization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36699b {

    /* JADX INFO: renamed from: a */
    private static final float f157158a;

    /* JADX INFO: renamed from: b */
    private static final float f157159b;

    static {
        float f13 = 4;
        f157158a = 2 * f13;
        f157159b = 1 * f13;
    }

    /* JADX INFO: renamed from: b */
    public static final void m117811b(int i13, int i14, Modifier modifier, Composer composer, int i15) {
        int i16;
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1217780217);
        if ((i15 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= c28655q.m87149e(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 147) != 146)) {
            InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(m117814e(i13, i14), null, "conversationProgress", null, c28655q, 3072, 22);
            Modifier modifierM3411h = AbstractC1102d.m3411h(f157158a, modifier);
            float f13 = f157159b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifierM3411h, AbstractC33253j.m105489e(f13)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC37056f.m118994r(AbstractC1102d.m3409f(m117812c(interfaceC28670t2M30588b), AbstractC1102d.m3406c(1.0f, C2314t.f9131w)), AbstractC33253j.m105489e(f13)), AbstractC15673b0.m43972A(), null, 0.0f, 6), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13179l(i13, i14, i15, modifier);
        }
    }

    /* JADX INFO: renamed from: c */
    private static final float m117812c(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m117813d(int i13, int i14, Modifier modifier, int i15, Composer composer, int i16) {
        m117811b(i13, i14, modifier, composer, AbstractC28683x.m87244L(i15 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final float m117814e(int i13, int i14) {
        if (i14 <= 0) {
            return 0.0f;
        }
        return AbstractC24821f.m72738d(i13, i14);
    }
}
