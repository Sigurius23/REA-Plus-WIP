package lh2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gf1.C15786e;
import kf0.C22437l;
import l83.C23454a0;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lh2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24070a {

    /* JADX INFO: renamed from: a */
    public static final C24070a f95108a = new C24070a();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4351m f95109b = new C37816b(new C22437l(29), false, -2056761886);

    /* JADX INFO: renamed from: c */
    private static Function3 f95110c = new C37816b(new C15786e(23), false, -1553483008);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m70989e(InterfaceC22997s1 Button, Composer composer, int i13) {
        AbstractC22676k.m65750j(Button, "$this$Button");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC15011f9.m43114b("Launch", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70990f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC15011f9.m43114b("Onboarding Story Name", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 6, 0, 131070);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Function3 m70991c() {
        return f95110c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4351m m70992d() {
        return f95109b;
    }
}
