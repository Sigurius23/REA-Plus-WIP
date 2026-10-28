package rl0;

import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import qz0.AbstractC30795n;
import re1.C31314a;
import x81.C38072d;

/* JADX INFO: renamed from: rl0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31510a {

    /* JADX INFO: renamed from: a */
    public static final C31510a f130008a = new C31510a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f130009b = new C37816b(new C31314a(5), false, -471526865);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m97089c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h("Welcome to the new coach!", null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getH1(), null, c28655q, 6, C2886a.f11498d << 18, 196602);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m m97090b() {
        return f130009b;
    }
}
