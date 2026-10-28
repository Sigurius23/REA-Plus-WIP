package yt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p390p1.C28655q;
import p602x1.C37816b;
import p636y3.C39169a;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import vx0.C36553a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: yt2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39770a {

    /* JADX INFO: renamed from: a */
    public static final C39770a f171309a = new C39770a();

    /* JADX INFO: renamed from: b */
    private static Function3 f171310b = new C37816b(new C36553a(24), false, -1947261980);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m127319c(InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            long j7 = ((C1101c) BoxWithConstraints).f4585b;
            float fM124765i = C39169a.m124765i(j7);
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1102d.m3411h(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo734f0(C39169a.m124764h(j7)), AbstractC1102d.m3409f(1.0f, C2314t.f9131w)), C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(3426503508L)), new C17919x(AbstractC17918w0.m51517e(4279244056L))), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM124765i / 2.0f)) << 32), fM124765i * 1.8f, 8), null, 0.0f, 6), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b */
    public final Function3 m127320b() {
        return f171310b;
    }
}
