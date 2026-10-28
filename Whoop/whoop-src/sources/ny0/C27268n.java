package ny0;

import androidx.compose.runtime.Composer;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15673b0;
import i91.AbstractC18249c;
import java.util.Iterator;
import l83.C23454a0;
import no0.C26970r0;
import no1.C26993g;
import p026b2.C2314t;
import p291l0.InterfaceC22996s0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ny0.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27268n {

    /* JADX INFO: renamed from: a */
    public static final C27268n f109103a = new C27268n();

    /* JADX INFO: renamed from: b */
    private static Function3 f109104b = new C37816b(new C26970r0(3), false, -315164169);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m82233g(InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        C2314t c2314t;
        C28676v0 c28676v0;
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(2069913076);
            Iterator<E> it = EnumC27272p.getEntries().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (!zHasNext) {
                    break;
                }
                EnumC27272p enumC27272p = (EnumC27272p) it.next();
                C27260j c27260j = new C27260j();
                C27264l c27264lM82202b = C27264l.m82202b(AbstractC27262k.f109089a, null, null, null, false, null, enumC27272p, 31, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C26993g(27);
                    c28655q.m87172p0(objM87133R);
                }
                c27260j.Compose(c2314t, c27264lM82202b, (Function1) objM87133R, c28655q, (C9598e.f28134d << 3) | 390);
            }
            c28655q.m87173q(false);
            C27260j c27260j2 = new C27260j();
            C27264l c27264lM82202b2 = C27264l.m82202b(AbstractC27262k.f109089a, null, null, null, false, AbstractC18249c.m52570h(AbstractC15673b0.m43989I0()), null, 47, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C26993g(28);
                c28655q.m87172p0(objM87133R2);
            }
            c27260j2.Compose(c2314t, c27264lM82202b2, (Function1) objM87133R2, c28655q, (C9598e.f28134d << 3) | 390);
            c28655q.m87150e0(2069930572);
            for (C27264l c27264l : AbstractC27262k.f109090b) {
                C27260j c27260j3 = new C27260j();
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(29);
                    c28655q.m87172p0(objM87133R3);
                }
                c27260j3.Compose(c2314t, c27264l, (Function1) objM87133R3, c28655q, (C9598e.f28134d << 3) | 390);
            }
            c28655q.m87173q(false);
            for (C27264l c27264l2 : AbstractC27262k.f109091c) {
                C27260j c27260j4 = new C27260j();
                Object objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C27266m(0);
                    c28655q.m87172p0(objM87133R4);
                }
                c27260j4.Compose(c2314t, c27264l2, (Function1) objM87133R4, c28655q, (C9598e.f28134d << 3) | 390);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m82234h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m82235i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m82236j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m82237k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public final Function3 m82238f() {
        return f109104b;
    }
}
