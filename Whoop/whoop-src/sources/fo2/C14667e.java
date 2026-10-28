package fo2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import dw1.C12413a;
import gz0.EnumC16313m0;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: fo2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14667e {

    /* JADX INFO: renamed from: a */
    public static final C14667e f54169a = new C14667e();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f54170b = new C37816b(new C12413a(17), false, 1483704531);

    /* JADX INFO: renamed from: c */
    private static InterfaceC4351m f54171c = new C37816b(new C12413a(18), false, -2142599204);

    /* JADX INFO: renamed from: d */
    private static InterfaceC4351m f54172d = new C37816b(new C12413a(19), false, -534949320);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m41924g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(EnumC16313m0.DELETE.toWhoopIcon(), c28655q, 0), "Remove from cart", AbstractC1102d.m3419p(f13 * f13, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m41925h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("−", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m41926i(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("+", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH4(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m m41927d() {
        return f54171c;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC4351m m41928e() {
        return f54172d;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC4351m m41929f() {
        return f54170b;
    }
}
