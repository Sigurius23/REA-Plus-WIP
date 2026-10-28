package p702ch0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.runtime.Composer;
import gy0.AbstractC16276e;
import l83.C23454a0;
import p000.C13762f;
import p026b2.C2314t;
import p291l0.InterfaceC23004v;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: ch0.g1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4622g1 {

    /* JADX INFO: renamed from: a */
    public static final C4622g1 f18642a = new C4622g1();

    /* JADX INFO: renamed from: b */
    private static Function3 f18643b = new C37816b(new C13762f(27), false, -1231821302);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m14380c(InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC35684p.m113047h(AbstractC1102d.m3419p(((C1101c) BoxWithConstraints).m3403d() / 4, C2314t.f9131w), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 508);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m14381b() {
        return f18643b;
    }
}
