package g00;

import androidx.compose.runtime.Composer;
import b30.C2567l4;
import d40.AbstractC11672q;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11670o;
import d40.EnumC11668m;
import fc0.C14361e;
import p048ce.AbstractC4482w;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;

/* JADX INFO: renamed from: g00.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14930a {

    /* JADX INFO: renamed from: a */
    public static final long f55646a = AbstractC17918w0.m51517e(4279703319L);

    /* JADX INFO: renamed from: b */
    public static final long f55647b = AbstractC17918w0.m51517e(4280690214L);

    /* JADX INFO: renamed from: c */
    public static final long f55648c = AbstractC17918w0.m51517e(4282400832L);

    /* JADX INFO: renamed from: d */
    public static final long f55649d = AbstractC17918w0.m51517e(4285558896L);

    /* JADX INFO: renamed from: e */
    public static final long f55650e = AbstractC17918w0.m51517e(4288914339L);

    /* JADX INFO: renamed from: f */
    public static final long f55651f = AbstractC17918w0.m51517e(4292138196L);

    /* JADX INFO: renamed from: g */
    public static final long f55652g = AbstractC17918w0.m51517e(4293256677L);

    /* JADX INFO: renamed from: h */
    public static final long f55653h = AbstractC17918w0.m51517e(4294309365L);

    /* JADX INFO: renamed from: i */
    public static final long f55654i = AbstractC17918w0.m51517e(4294967295L);

    /* JADX INFO: renamed from: j */
    public static final long f55655j = AbstractC17918w0.m51517e(4278216245L);

    /* JADX INFO: renamed from: k */
    public static final long f55656k = AbstractC17918w0.m51517e(4278231893L);

    /* JADX INFO: renamed from: l */
    public static final long f55657l = AbstractC17918w0.m51517e(4278244975L);

    /* JADX INFO: renamed from: m */
    public static final long f55658m = AbstractC17918w0.m51517e(4290777660L);

    /* JADX INFO: renamed from: n */
    public static final long f55659n = AbstractC17918w0.m51517e(4293269831L);

    /* JADX INFO: renamed from: o */
    public static final long f55660o = AbstractC17918w0.m51517e(4294593127L);

    /* JADX INFO: renamed from: a */
    public static final void m43026a(EnumC11668m enumC11668m, C37816b c37816b, Composer composer, int i13, int i14) {
        EnumC11668m enumC11668m2;
        int i15;
        C37816b c37816b2;
        EnumC11668m enumC11668m3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-896902563);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            enumC11668m2 = enumC11668m;
        } else if ((i13 & 6) == 0) {
            enumC11668m2 = enumC11668m;
            i15 = i13 | (c28655q.m87153g(enumC11668m2) ? 4 : 2);
        } else {
            enumC11668m2 = enumC11668m;
            i15 = i13;
        }
        if ((i15 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            c37816b2 = c37816b;
            enumC11668m3 = enumC11668m2;
        } else {
            EnumC11668m enumC11668m4 = i16 != 0 ? EnumC11668m.f37666x : enumC11668m2;
            C11669n c11669n = AbstractC11672q.f37691a;
            C11669n c11669n2 = AbstractC4482w.m13975K(c28655q).f55662a ? AbstractC11672q.f37692b : AbstractC11672q.f37691a;
            c37816b2 = c37816b;
            AbstractC11673r.m31072a(C11669n.m31071a(c11669n2, AbstractC4482w.m13975K(c28655q).f55664c, AbstractC4482w.m13975K(c28655q).f55664c, AbstractC4482w.m13975K(c28655q).f55667f, AbstractC4482w.m13975K(c28655q).f55674m, 0L, AbstractC4482w.m13975K(c28655q).f55676o, 0L, C14970c1.m43086a(c11669n2.f37676i, AbstractC4482w.m13975K(c28655q).f55668g, 0L, AbstractC4482w.m13975K(c28655q).f55679r, 8126), 176), new C11670o(12.0f, 24.0f, AbstractC11672q.f37693c.f37679c), AbstractC11672q.f37694d, null, enumC11668m4, AbstractC11672q.f37706p, AbstractC11672q.f37708r, AbstractC37817c.m121344e(-1570603149, c28655q, new C2567l4(c37816b2, 4)), c28655q, 12582912 | ((i15 << 12) & 57344), 0);
            enumC11668m3 = enumC11668m4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(enumC11668m3, i13, c37816b2, i14, 3);
        }
    }
}
