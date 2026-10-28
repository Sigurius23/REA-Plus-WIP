package zk2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;

/* JADX INFO: renamed from: zk2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40841b {

    /* JADX INFO: renamed from: a */
    public static final C40841b f176056a = new C40841b();

    /* JADX INFO: renamed from: b */
    private static Function3 f176057b = new C37816b(new C40840a(0), false, 1653733415);

    /* JADX INFO: renamed from: c */
    private static Function3 f176058c = new C37816b(new C40840a(1), false, 999509995);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132353d(String it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132354e(String tagId, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(tagId, "tagId");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(tagId) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC30795n.m94707h(tagId.concat(" content placeholder"), AbstractC1099a.m3394p(4 * 8, C2314t.f9131w), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 48, 0, 262140);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final Function3 m132355c() {
        return f176057b;
    }
}
