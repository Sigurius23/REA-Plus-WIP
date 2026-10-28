package p748zc1;

import androidx.compose.runtime.Composer;
import c41.AbstractC4072m3;
import c41.C4044i3;
import c41.C4051j3;
import java.util.Iterator;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p291l0.InterfaceC22996s0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import z72.C40160f;

/* JADX INFO: renamed from: zc1.d1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40299d1 {

    /* JADX INFO: renamed from: a */
    public static final C40299d1 f174222a = new C40299d1();

    /* JADX INFO: renamed from: b */
    private static Function3 f174223b = new C37816b(new C40518y0(7), false, -1804412841);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m129496e(InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22399k.m64473c("Mini Health Monitor", c28655q, 6);
            c28655q.m87150e0(1126050133);
            Iterator<T> it = C4051j3.f16444a.m12387a().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c28676v0 = C28635l.f115821a;
                if (!zHasNext) {
                    break;
                }
                C4044i3 c4044i3 = (C4044i3) it.next();
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C40160f(17);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC4072m3.m12489i(null, c4044i3, (Function1) objM87133R, c28655q, (C4044i3.f16407i << 3) | 384, 1);
            }
            c28655q.m87173q(false);
            AbstractC22399k.m64473c("Mini Stress Monitor", c28655q, 6);
            for (C4044i3 c4044i4 : C4051j3.f16444a.m12393g()) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40160f(18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC4072m3.m12489i(null, c4044i4, (Function1) objM87133R2, c28655q, (C4044i3.f16407i << 3) | 384, 1);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m129497f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129498g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final Function3 m129499d() {
        return f174223b;
    }
}
