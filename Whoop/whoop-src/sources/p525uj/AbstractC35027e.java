package p525uj;

import androidx.compose.runtime.Composer;
import com.amplitude.android.engagement.types.ButtonType;
import p088dc.AbstractC11894a;
import p208i2.C17919x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p427qj.C30416a;
import p490t0.AbstractC33253j;
import p602x1.C37816b;
import p636y3.C39174f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uj.e */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC35027e {

    /* JADX INFO: renamed from: a */
    public static final C35023a f148215a;

    /* JADX INFO: renamed from: b */
    public static final C35023a f148216b;

    /* JADX INFO: renamed from: c */
    public static final C35023a f148217c;

    /* JADX INFO: renamed from: d */
    public static final C35023a f148218d;

    /* JADX INFO: renamed from: e */
    public static final C35023a f148219e;

    /* JADX INFO: renamed from: f */
    public static final C35023a f148220f;

    /* JADX INFO: renamed from: g */
    public static final C28674u2 f148221g;

    /* JADX INFO: renamed from: h */
    public static final C28674u2 f148222h;

    /* JADX INFO: renamed from: i */
    public static final C28674u2 f148223i;

    /* JADX INFO: renamed from: j */
    public static final C28674u2 f148224j;

    static {
        long j7 = AbstractC35028f.f148228c;
        long j13 = AbstractC35028f.f148226a;
        long j14 = AbstractC35028f.f148227b;
        C35023a c35023a = new C35023a(j7, j7, j13, j14);
        f148215a = c35023a;
        f148216b = c35023a;
        long j15 = AbstractC35028f.f148238m;
        long j16 = AbstractC35028f.f148229d;
        f148217c = new C35023a(j14, j15, j16, j14);
        long j17 = AbstractC35028f.f148239n;
        long j18 = AbstractC35028f.f148230e;
        f148218d = new C35023a(j14, j17, j18, j14);
        f148219e = new C35023a(j14, j14, j16, j14);
        f148220f = new C35023a(j14, j14, j18, j14);
        f148221g = new C28674u2(C35025c.f148210x);
        f148222h = new C28674u2(C35025c.f148208E);
        f148223i = new C28674u2(C35025c.f148212z);
        f148224j = new C28674u2(C35025c.f148211y);
    }

    /* JADX INFO: renamed from: a */
    public static final void m110696a(ButtonType type, boolean z4, C37816b c37816b, Composer composer, int i13) {
        boolean zM31939G;
        C35031i c35031i;
        C35023a c35023a;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(249355699);
        if (((i13 | (c28655q.m87153g(type) ? 4 : 2) | 16) & 731) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            zM31939G = z4;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                zM31939G = AbstractC11894a.m31939G(c28655q);
            } else {
                c28655q.m87138X();
                zM31939G = z4;
            }
            c28655q.m87175r();
            c28655q.m87152f0(-412521741);
            C35035m c35035m = (C35035m) c28655q.m87161k(AbstractC35033k.f148295a);
            c28655q.m87173q(false);
            int[] iArr = AbstractC35026d.f148214a;
            int i14 = iArr[type.ordinal()];
            if (i14 == 1) {
                c35031i = c35035m.f148328Y;
            } else if (i14 == 2 || i14 == 3) {
                c35031i = c35035m.f148329Z;
            } else {
                if (i14 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                c35031i = c35035m.f148331a0;
            }
            int i15 = iArr[type.ordinal()];
            if (i15 == 1) {
                c35023a = zM31939G ? f148216b : f148215a;
            } else if (i15 == 2 || i15 == 3) {
                c35023a = zM31939G ? f148218d : f148217c;
            } else {
                if (i15 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                c35023a = zM31939G ? f148220f : f148219e;
            }
            long j7 = c35031i.f148283e;
            C17919x c17919x = new C17919x(j7);
            long j13 = C17919x.f69637n;
            if (C17919x.m51542d(j7, j13)) {
                c17919x = null;
            }
            long j14 = c17919x != null ? c17919x.f69639a : c35023a.f148203a;
            long j15 = c35031i.f148284f;
            C17919x c17919x2 = new C17919x(j15);
            if (C17919x.m51542d(j15, j13)) {
                c17919x2 = null;
            }
            long j16 = c17919x2 != null ? c17919x2.f69639a : c35023a.f148204b;
            long j17 = c35031i.f148285g;
            C17919x c17919x3 = C17919x.m51542d(j17, j13) ? null : new C17919x(j17);
            AbstractC28683x.m87248b(new C28673u1[]{f148221g.mo86977a(new C35023a(j14, j16, c17919x3 != null ? c17919x3.f69639a : c35023a.f148205c, c35023a.f148206d)), f148222h.mo86977a(new C35024b(AbstractC33253j.m105489e(c35031i.f148282d))), f148223i.mo86977a(new C39174f(c35031i.f148281c)), f148224j.mo86977a(new C39174f(c35031i.f148279a))}, c37816b, c28655q, 56);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C30416a(type, zM31939G, c37816b, i13, 1);
    }
}
