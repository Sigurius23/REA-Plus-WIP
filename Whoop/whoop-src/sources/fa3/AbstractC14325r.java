package fa3;

import l83.C23461g;
import l83.C23465k;
import m83.AbstractC25247g0;
import p031b9.AbstractC2875y;
import p581we.C37199o;
import va3.C35847e;

/* JADX INFO: renamed from: fa3.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14325r {

    /* JADX INFO: renamed from: a */
    public static final C35847e f52289a;

    /* JADX INFO: renamed from: b */
    public static final C35847e[] f52290b;

    /* JADX INFO: renamed from: c */
    public static final C37199o f52291c;

    /* JADX INFO: renamed from: d */
    public static final C14326s f52292d;

    static {
        C35847e c35847e = new C35847e("org.jspecify.nullness");
        C35847e c35847e2 = new C35847e("org.jspecify.annotations");
        f52289a = c35847e2;
        C35847e c35847e3 = new C35847e("io.reactivex.rxjava3.annotations");
        C35847e c35847e4 = new C35847e("org.checkerframework.checker.nullness.compatqual");
        String str = c35847e3.f152613a.f152616a;
        f52290b = new C35847e[]{new C35847e(AbstractC2875y.m8299l(str, ".Nullable")), new C35847e(AbstractC2875y.m8299l(str, ".NonNull"))};
        C35847e c35847e5 = new C35847e("org.jetbrains.annotations");
        C14326s c14326s = C14326s.f52293d;
        C23465k c23465k = new C23465k(c35847e5, c14326s);
        C23465k c23465k2 = new C23465k(new C35847e("androidx.annotation"), c14326s);
        C23465k c23465k3 = new C23465k(new C35847e("android.support.annotation"), c14326s);
        C23465k c23465k4 = new C23465k(new C35847e("android.annotation"), c14326s);
        C23465k c23465k5 = new C23465k(new C35847e("com.android.annotations"), c14326s);
        C23465k c23465k6 = new C23465k(new C35847e("org.eclipse.jdt.annotation"), c14326s);
        C23465k c23465k7 = new C23465k(new C35847e("org.checkerframework.checker.nullness.qual"), c14326s);
        C23465k c23465k8 = new C23465k(c35847e4, c14326s);
        C23465k c23465k9 = new C23465k(new C35847e("javax.annotation"), c14326s);
        C23465k c23465k10 = new C23465k(new C35847e("edu.umd.cs.findbugs.annotations"), c14326s);
        C23465k c23465k11 = new C23465k(new C35847e("io.reactivex.annotations"), c14326s);
        C35847e c35847e6 = new C35847e("androidx.annotation.RecentlyNullable");
        EnumC14304b0 enumC14304b0 = EnumC14304b0.WARN;
        C23465k c23465k12 = new C23465k(c35847e6, new C14326s(enumC14304b0, 4));
        C23465k c23465k13 = new C23465k(new C35847e("androidx.annotation.RecentlyNonNull"), new C14326s(enumC14304b0, 4));
        C23465k c23465k14 = new C23465k(new C35847e("lombok"), c14326s);
        C23461g c23461g = new C23461g(2, 1, 0);
        EnumC14304b0 enumC14304b1 = EnumC14304b0.STRICT;
        f52291c = new C37199o(AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, c23465k9, c23465k10, c23465k11, c23465k12, c23465k13, c23465k14, new C23465k(c35847e, new C14326s(enumC14304b0, c23461g, enumC14304b1)), new C23465k(c35847e2, new C14326s(enumC14304b0, new C23461g(2, 1, 0), enumC14304b1)), new C23465k(c35847e3, new C14326s(enumC14304b0, new C23461g(1, 8, 0), enumC14304b1)), new C23465k(new C35847e("jakarta.annotation"), new C14326s(enumC14304b0, new C23461g(2, 4, 0), enumC14304b1))));
        f52292d = new C14326s(enumC14304b0, 4);
    }
}
