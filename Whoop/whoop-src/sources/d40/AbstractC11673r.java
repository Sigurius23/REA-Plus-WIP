package d40;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b90.C2880b;
import cu2.C11132l;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p025b1.C2213d;
import p027b3.AbstractC2399k2;
import p088dc.AbstractC11894a;
import p132f0.C13825t;
import p163g1.AbstractC15044i9;
import p163g1.C15033h9;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.C22976l1;
import p294l3.C23245b0;
import p294l3.C23255g0;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p543v4.AbstractC35642a;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d40.r */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11673r {

    /* JADX INFO: renamed from: a */
    public static final long f37709a = AbstractC17918w0.m51517e(4280595582L);

    /* JADX INFO: renamed from: b */
    public static final long f37710b = AbstractC17918w0.m51515c(1090519039);

    /* JADX INFO: renamed from: c */
    public static final C28674u2 f37711c = new C28674u2(new C11132l(14));

    /* JADX INFO: renamed from: d */
    public static final C28674u2 f37712d = new C28674u2(new C11132l(15));

    /* JADX INFO: renamed from: e */
    public static final C28674u2 f37713e = new C28674u2(new C11132l(16));

    /* JADX INFO: renamed from: f */
    public static final C28674u2 f37714f = new C28674u2(new C11132l(17));

    /* JADX INFO: renamed from: g */
    public static final C28674u2 f37715g = new C28674u2(new C11132l(18));

    /* JADX INFO: renamed from: h */
    public static final C28674u2 f37716h = new C28674u2(new C11132l(19));

    /* JADX INFO: renamed from: i */
    public static final C28674u2 f37717i = new C28674u2(new C11132l(20));

    /* JADX INFO: renamed from: j */
    public static final C28674u2 f37718j = new C28674u2(new C11132l(21));

    /* JADX INFO: renamed from: a */
    public static final void m31072a(C11669n c11669n, C11670o c11670o, C11674s c11674s, Float f13, EnumC11668m enumC11668m, C11662g c11662g, EnumC11663h enumC11663h, C37816b c37816b, Composer composer, int i13, int i14) {
        C11669n c11669n2;
        int i15;
        C11670o c11670o2;
        C11674s c11674s2;
        Float f14;
        EnumC11668m enumC11668m2;
        C11662g c11662g2;
        EnumC11663h enumC11663h2;
        C37816b c37816b2;
        C11670o c11670o3;
        int i16;
        int i17;
        int i18;
        Boolean bool = Boolean.FALSE;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1364556707);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                c11669n2 = c11669n;
                int i19 = c28655q.m87153g(c11669n2) ? 4 : 2;
                i15 = i19 | i13;
            } else {
                c11669n2 = c11669n;
            }
            i15 = i19 | i13;
        } else {
            c11669n2 = c11669n;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                c11670o2 = c11670o;
                int i24 = c28655q.m87153g(c11670o2) ? 32 : 16;
                i15 |= i24;
            } else {
                c11670o2 = c11670o;
            }
            i15 |= i24;
        } else {
            c11670o2 = c11670o;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                c11674s2 = c11674s;
                int i25 = c28655q.m87153g(c11674s2) ? 256 : 128;
                i15 |= i25;
            } else {
                c11674s2 = c11674s;
            }
            i15 |= i25;
        } else {
            c11674s2 = c11674s;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                f14 = f13;
                if (c28655q.m87153g(f14)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i18;
            } else {
                f14 = f13;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i18;
        } else {
            f14 = f13;
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                enumC11668m2 = enumC11668m;
                if (c28655q.m87153g(enumC11668m2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i17;
            } else {
                enumC11668m2 = enumC11668m;
            }
            i17 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i17;
        } else {
            enumC11668m2 = enumC11668m;
        }
        if ((196608 & i13) == 0) {
            if ((i14 & 32) == 0) {
                c11662g2 = c11662g;
                if (c28655q.m87153g(c11662g2)) {
                    i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i15 |= i16;
            } else {
                c11662g2 = c11662g;
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i16;
        } else {
            c11662g2 = c11662g;
        }
        if ((1572864 & i13) == 0) {
            if ((i14 & 64) == 0) {
                enumC11663h2 = enumC11663h;
                int i26 = c28655q.m87153g(enumC11663h2) ? 1048576 : 524288;
                i15 |= i26;
            } else {
                enumC11663h2 = enumC11663h;
            }
            i15 |= i26;
        } else {
            enumC11663h2 = enumC11663h;
        }
        if ((12582912 & i13) == 0) {
            c37816b2 = c37816b;
            i15 |= c28655q.m87157i(c37816b2) ? 8388608 : 4194304;
        } else {
            c37816b2 = c37816b;
        }
        if ((i15 & 4793491) == 4793490 && c28655q.m87121F()) {
            c28655q.m87138X();
            c11670o3 = c11670o2;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 1) != 0) {
                    C11669n c11669n3 = C11671p.f37680a;
                    c11669n2 = AbstractC11894a.m31939G(c28655q) ? C11671p.f37680a : C11671p.f37681b;
                }
                c11670o3 = (i14 & 2) != 0 ? C11671p.f37682c : c11670o2;
                if ((i14 & 4) != 0) {
                    c11674s2 = C11671p.f37683d;
                }
                if ((i14 & 8) != 0) {
                    f14 = C11671p.f37686g;
                }
                if ((i14 & 16) != 0) {
                    enumC11668m2 = C11671p.f37688i;
                }
                if ((i14 & 32) != 0) {
                    c11662g2 = C11671p.f37687h;
                }
                if ((i14 & 64) != 0) {
                    enumC11663h2 = C11671p.f37689j;
                }
            } else {
                c28655q.m87138X();
                c11670o3 = c11670o2;
            }
            c28655q.m87175r();
            boolean zBooleanValue = bool.booleanValue();
            C28674u2 c28674u2 = AbstractC2399k2.f9451a;
            AbstractC28683x.m87248b(new C28673u1[]{f37711c.mo86977a(c11669n2), f37712d.mo86977a(c11670o3), f37713e.mo86977a(c11674s2), f37714f.mo86977a(f14), f37717i.mo86977a(enumC11668m2), f37718j.mo86977a(c11662g2), f37715g.mo86977a(enumC11663h2), c28674u2.mo86977a(Boolean.valueOf(((Boolean) c28655q.m87161k(c28674u2)).booleanValue() || zBooleanValue)), f37716h.mo86977a(bool)}, AbstractC37817c.m121344e(330928227, c28655q, new C2213d((Object) c11669n2, (Object) c11674s2, (Object) c11670o3, c37816b2, 1)), c28655q, 56);
        }
        Float f15 = f14;
        C11662g c11662g3 = c11662g2;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(c11669n2, c11670o3, c11674s2, f15, enumC11668m2, c11662g3, enumC11663h2, c37816b, i13, i14, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final float m31073b(Context context, float f13) {
        return f13 * context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: c */
    public static final int m31074c(C11666k c11666k, Context context) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17918w0.m51506H((m31086o(context) ? c11666k.f37660b : c11666k.f37659a).f37651a);
    }

    /* JADX INFO: renamed from: d */
    public static final C13825t m31075d(boolean z4, Composer composer, int i13) {
        long jM43091f;
        float fM31077f = m31077f(z4, 0.0f, i13 & 126, composer, 2);
        C28655q c28655q = (C28655q) composer;
        if (z4) {
            c28655q.m87150e0(358255896);
            jM43091f = m31082k(c28655q).f37676i.m43091f();
        } else {
            c28655q.m87150e0(358256736);
            jM43091f = m31082k(c28655q).f37669b;
        }
        c28655q.m87173q(false);
        return AbstractC17269i.m48880a(fM31077f, jM43091f);
    }

    /* JADX INFO: renamed from: e */
    public static final int m31076e(C11666k c11666k, Context context) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17918w0.m51506H((m31086o(context) ? c11666k.f37660b : c11666k.f37659a).f37653c);
    }

    /* JADX INFO: renamed from: f */
    public static final float m31077f(boolean z4, float f13, int i13, Composer composer, int i14) {
        float fMax;
        if ((i14 & 2) != 0) {
            f13 = 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (z4) {
            c28655q.m87150e0(749427441);
            fMax = Math.max(m31083l(c28655q).f37679c, f13);
        } else {
            c28655q.m87150e0(749430518);
            fMax = m31083l(c28655q).f37679c;
        }
        c28655q.m87173q(false);
        return fMax;
    }

    /* JADX INFO: renamed from: g */
    public static final C23285v0 m31078g(C11666k c11666k, Composer composer) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        C11667l c11667l = c11666k.f37662d;
        C23285v0 c23285v0M67364b = C23285v0.m67364b(((C15033h9) ((C28655q) composer).m87161k(AbstractC15044i9.f56319b)).f56278e, (AbstractC11894a.m31939G(composer) ? c11666k.f37660b : c11666k.f37659a).f37652b, c11667l.f37664b, null, null, 0L, 0, 0L, null, null, 16777212);
        Integer num = c11667l.f37663a;
        return num != null ? C23285v0.m67364b(c23285v0M67364b, 0L, 0L, null, AbstractC12889b.m36267d(AbstractC17269i.m48882b(num.intValue(), null, 14)), 0L, 0, 0L, null, null, 16777183) : c23285v0M67364b;
    }

    /* JADX INFO: renamed from: h */
    public static final int m31079h(C11666k c11666k, Context context) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17918w0.m51506H((m31086o(context) ? c11666k.f37660b : c11666k.f37659a).f37652b);
    }

    /* JADX INFO: renamed from: i */
    public static final int m31080i(C11666k c11666k, Context context) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17918w0.m51506H((m31086o(context) ? c11666k.f37660b : c11666k.f37659a).f37655e);
    }

    /* JADX INFO: renamed from: j */
    public static final C22976l1 m31081j() {
        C11669n c11669n = C11671p.f37680a;
        C11662g c11662g = C11671p.f37685f;
        return AbstractC1099a.m3381c(c11662g.f37644a, 0.0f, c11662g.f37646c, 0.0f, 10);
    }

    /* JADX INFO: renamed from: k */
    public static final C11669n m31082k(Composer composer) {
        return (C11669n) ((C28655q) composer).m87161k(f37711c);
    }

    /* JADX INFO: renamed from: l */
    public static final C11670o m31083l(Composer composer) {
        return (C11670o) ((C28655q) composer).m87161k(f37712d);
    }

    /* JADX INFO: renamed from: m */
    public static final C11674s m31084m(Composer composer) {
        return (C11674s) ((C28655q) composer).m87161k(f37713e);
    }

    /* JADX INFO: renamed from: n */
    public static final int m31085n(C11666k c11666k, Context context) {
        AbstractC22676k.m65750j(c11666k, "<this>");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC17918w0.m51506H((m31086o(context) ? c11666k.f37660b : c11666k.f37659a).f37654d);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m31086o(Context context) {
        AbstractC22676k.m65750j(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m31087p(long j7) {
        int iM51506H = AbstractC17918w0.m51506H(j7);
        int i13 = C17919x.f69638o;
        double dM112834c = AbstractC35642a.m112834c(iM51506H, AbstractC17918w0.m51506H(C17919x.f69625b));
        double dM112834c2 = AbstractC35642a.m112834c(AbstractC17918w0.m51506H(j7), AbstractC17918w0.m51506H(C17919x.f69629f));
        return dM112834c2 <= 2.2d && dM112834c > dM112834c2;
    }

    /* JADX INFO: renamed from: q */
    public static final C23285v0 m31088q(C23285v0 c23285v0) {
        C23245b0 c23245b0 = C23285v0.f92254d.f92256b;
        return C23285v0.m67364b(c23285v0, 0L, 0L, null, null, 0L, 0, c23245b0.f92106c, new C23255g0(true), c23245b0.f92109f, 15073279);
    }
}
