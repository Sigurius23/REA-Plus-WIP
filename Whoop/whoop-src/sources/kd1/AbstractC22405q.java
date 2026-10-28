package kd1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16277f;
import ig0.C18464d;
import iy0.C21026a;
import j21.C21245d;
import l83.C23454a0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p043c4.C3948a0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import se.AbstractC32411b;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: kd1.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lkd1/o;", "image", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "d", "(Lkd1/o;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22405q {
    /* JADX INFO: renamed from: d */
    public static final void m64507d(AbstractC22403o image, InterfaceC4339a onDismiss, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1815454726);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(image) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C21026a(onDismiss, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(true, false, false), AbstractC37817c.m121344e(815558415, c28655q, new C21245d(5, onDismiss, image)), c28655q, 432);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(image, onDismiss, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m64508e(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64509f(InterfaceC4339a interfaceC4339a, AbstractC22403o abstractC22403o, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q, 6).getBrandBlack(), AbstractC17918w0.f69621a);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, AbstractC39383f.m125595a(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62257L, c28655q, 0);
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, c2314t);
            C1100b c1100b = C1100b.f4583a;
            AbstractC27242b1.m82092d(c27270o, strM21273g, c1100b.mo3400a(modifierM3394p, c2307m), null, interfaceC4339a, c28655q, 0, 8);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3), "", c1100b.mo3400a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "ImageViewer")), C2299e.f9102E), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64510g(AbstractC22403o abstractC22403o, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m64507d(abstractC22403o, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
