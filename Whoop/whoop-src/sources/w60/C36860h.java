package w60;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import gy0.AbstractC16276e;
import l83.C23454a0;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15005f3;
import p390p1.C28635l;
import p390p1.C28655q;
import p545v6.C35728q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import vw0.C36541a;
import vx0.C36553a;
import x81.C38072d;

/* JADX INFO: renamed from: w60.h */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36860h {

    /* JADX INFO: renamed from: a */
    public static final C36860h f157656a = new C36860h();

    /* JADX INFO: renamed from: b */
    private static Function3 f157657b = new C37816b(new C36553a(13), false, 1567999057);

    /* JADX INFO: renamed from: c */
    private static InterfaceC4351m f157658c = new C37816b(new C35728q(13, 0), false, -366750424);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118211e(InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3419p = AbstractC1102d.m3419p(8 * 4, C2314t.f9131w);
        InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d));
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C36541a(28);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC35684p.m113047h(modifierM3419p, dVarM113128a, false, 0.0f, 0, (InterfaceC4339a) objM87133R, null, null, null, c28655q, 196614, 476);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118212f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118213g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(c38072d.m121951d().getVarious().getWrench(), c28655q, 0), "Lottie tester", null, c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 48, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m118214d() {
        return f157657b;
    }
}
