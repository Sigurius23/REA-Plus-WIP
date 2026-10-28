package jp2;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.api2.C19054d;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import x81.C38072d;

/* JADX INFO: renamed from: jp2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21870a {

    /* JADX INFO: renamed from: a */
    public static final C21870a f84455a = new C21870a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f84456b = new C37816b(new C19054d(25), false, -65378198);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m61998c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, C2314t.f9131w), c38072d.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m m61999b() {
        return f84456b;
    }
}
