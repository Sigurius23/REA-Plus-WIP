package c41;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import java.util.Locale;
import l83.C23454a0;
import p000.C26047n;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import x81.C38072d;

/* JADX INFO: renamed from: c41.x0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4146x0 {

    /* JADX INFO: renamed from: a */
    public static final C4146x0 f16884a = new C4146x0();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f16885b = new C37816b(new C26047n(29), false, -1779186762);

    /* JADX INFO: renamed from: c */
    private static InterfaceC4351m f16886c = new C37816b(new C4139w0(0), false, -52041800);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m12902e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            String upperCase = AbstractC8693b.m21275i("REPLACE ME", c28655q, 6).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH3(), null, c28655q, 0, 0, 196090);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12903f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3419p = AbstractC1102d.m3419p(10 * 4, C2314t.f9131w);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getRecovery().getMaxHeartRate(), c28655q, 6), "a heart Rate", modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4351m m12904c() {
        return f16885b;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m m12905d() {
        return f16886c;
    }
}
