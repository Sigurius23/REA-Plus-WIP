package cd1;

import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.C13762f;
import p163g1.AbstractC15011f9;
import p208i2.C17919x;
import p291l0.InterfaceC23013y;
import p390p1.C28655q;
import p602x1.C37816b;
import p700bd1.AbstractC3084b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cd1.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4443g {

    /* JADX INFO: renamed from: a */
    public static final C4443g f17926a = new C4443g();

    /* JADX INFO: renamed from: b */
    private static Function3 f17927b = new C37816b(new C13762f(24), false, 1491687855);

    /* JADX INFO: renamed from: c */
    private static Function3 f17928c = new C37816b(new C13762f(25), false, -1625148910);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m13888e(InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC3084b.m8842b(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m13889f(InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            int i14 = C17919x.f69638o;
            AbstractC15011f9.m43114b("Bottom Sheet Content", null, C17919x.f69629f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 390, 0, 131066);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Function3 m13890c() {
        return f17928c;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m13891d() {
        return f17927b;
    }
}
