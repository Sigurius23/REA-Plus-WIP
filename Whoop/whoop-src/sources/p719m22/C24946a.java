package p719m22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import live.hms.video.utils.C24405c;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: m22.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24946a {

    /* JADX INFO: renamed from: a */
    public static final C24946a f97663a = new C24946a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f97664b = new C37816b(new C24405c(29), false, 1420471525);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m73107c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC42785i.m73173f(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m m73108b() {
        return f97664b;
    }
}
