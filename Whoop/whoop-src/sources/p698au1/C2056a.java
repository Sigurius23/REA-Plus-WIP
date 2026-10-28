package p698au1;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.C13762f;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: au1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2056a {

    /* JADX INFO: renamed from: a */
    public static final C2056a f8176a = new C2056a();

    /* JADX INFO: renamed from: b */
    private static Function3 f8177b = new C37816b(new C13762f(13), false, -1747230974);

    /* JADX INFO: renamed from: c */
    private static Function3 f8178c = new C37816b(new C13762f(14), false, -641164935);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m6479e(InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC2062g.m6491b(InterfaceC1103a.m3430a(item, C2314t.f9131w, 7), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m6480f(InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(item) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC2062g.m6491b(InterfaceC1103a.m3430a(item, C2314t.f9131w, 7), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Function3 m6481c() {
        return f8177b;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m6482d() {
        return f8178c;
    }
}
