package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import f01.C13857f;
import java.util.WeakHashMap;
import kotlin.C2032u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p114eb.C12991u0;
import p291l0.C22944c2;
import p291l0.C22949e;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39176h;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;

/* JADX INFO: renamed from: h00.f0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC16501f0 {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f63424a;

    /* JADX INFO: renamed from: b */
    public static final C28596b0 f63425b;

    static {
        C28596b0 c28596b0 = new C28596b0(new C16497d0(0));
        f63424a = c28596b0;
        f63425b = c28596b0;
    }

    /* JADX INFO: renamed from: a */
    public static final void m46669a(C12991u0 c12991u0, String startDestination, Modifier modifier, Function1 builder, Composer composer, int i13) {
        Modifier modifier2;
        AbstractC22676k.m65750j(startDestination, "startDestination");
        AbstractC22676k.m65750j(builder, "builder");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1633503243);
        if ((((c28655q.m87157i(c12991u0) ? 4 : 2) | i13 | (c28655q.m87153g(startDestination) ? 32 : 16) | 384 | (c28655q.m87157i(builder) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            WeakHashMap weakHashMap = C22944c2.f90553v;
            boolean z4 = !AbstractC22676k.m65745e(C22949e.m66712e(c28655q).f90571r, C22949e.m66712e(c28655q).f90570q);
            c28655q.m87150e0(-228117693);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            m46670b((C39180l) interfaceC28601c1.getValue(), AbstractC37817c.m121344e(-1551798703, c28655q, new C16499e0(z4, c12991u0, startDestination, builder, interfaceC28601c1)), c28655q, 48);
            modifier2 = C2314t.f9131w;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2032u(i13, 12, c12991u0, startDestination, modifier2, builder);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m46670b(C39180l c39180l, C37816b c37816b, Composer composer, int i13) {
        C39176h c39176h;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-649629311);
        if ((((c28655q.m87153g(c39180l) ? 4 : 2) | i13) & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            if (c39180l != null) {
                long j7 = c39180l.f168422a;
                c39176h = new C39176h(AbstractC35952b.m114193a(interfaceC39171c.mo733e0((int) (j7 >> 32)), interfaceC39171c.mo733e0((int) (j7 & 4294967295L))));
            } else {
                c39176h = null;
            }
            AbstractC28683x.m87247a(f63424a.mo86977a(c39176h), c37816b, c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(c39180l, c37816b, i13, 22);
        }
    }
}
