package vy0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p355o2.C27430e;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p545v6.C35728q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import x81.C38072d;

/* JADX INFO: renamed from: vy0.r */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36590r {

    /* JADX INFO: renamed from: a */
    public static final C36590r f156740a = new C36590r();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f156741b = new C37816b(new C35728q(8, 0), false, 2078871065);

    /* JADX INFO: renamed from: c */
    private static InterfaceC4351m f156742c = new C37816b(new C35728q(9, 0), false, -806222226);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m117507e(Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoop(), c28655q, 6);
            long brandWhite = c38072d.m121949b(c28655q, 6).getBrandWhite();
            float f13 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13 * f13, C2314t.f9131w), brandWhite, c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m117508f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16272a.f62074f, c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62260M), AbstractC1102d.m3419p(f13 * f13, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 384, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m m117509c() {
        return f156742c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m m117510d() {
        return f156741b;
    }
}
