package fa3;

import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import o93.AbstractC27741m;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35847e;

/* JADX INFO: renamed from: fa3.y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14332y {

    /* JADX INFO: renamed from: a */
    public static final C35847e f52323a;

    /* JADX INFO: renamed from: b */
    public static final C35847e f52324b;

    /* JADX INFO: renamed from: c */
    public static final C35847e f52325c;

    /* JADX INFO: renamed from: d */
    public static final C35847e f52326d;

    /* JADX INFO: renamed from: e */
    public static final C35847e f52327e;

    /* JADX INFO: renamed from: f */
    public static final C35847e f52328f;

    /* JADX INFO: renamed from: g */
    public static final C35847e f52329g;

    /* JADX INFO: renamed from: h */
    public static final C35847e f52330h;

    /* JADX INFO: renamed from: i */
    public static final C35847e f52331i;

    /* JADX INFO: renamed from: j */
    public static final Set f52332j;

    /* JADX INFO: renamed from: k */
    public static final Set f52333k;

    /* JADX INFO: renamed from: l */
    public static final Set f52334l;

    /* JADX INFO: renamed from: m */
    public static final Set f52335m;

    /* JADX INFO: renamed from: n */
    public static final Set f52336n;

    /* JADX INFO: renamed from: o */
    public static final Set f52337o;

    /* JADX INFO: renamed from: p */
    public static final C35847e f52338p;

    static {
        C35847e c35847e = new C35847e("org.jspecify.nullness.Nullable");
        C35847e c35847e2 = new C35847e("org.jspecify.nullness.NullMarked");
        f52323a = c35847e2;
        C35847e c35847e3 = new C35847e("org.jspecify.nullness.NullnessUnspecified");
        C35847e c35847e4 = new C35847e("org.jspecify.annotations.NonNull");
        C35847e c35847e5 = new C35847e("org.jspecify.annotations.Nullable");
        C35847e c35847e6 = new C35847e("org.jspecify.annotations.NullMarked");
        f52324b = c35847e6;
        C35847e c35847e7 = new C35847e("org.jspecify.annotations.NullnessUnspecified");
        C35847e c35847e8 = new C35847e("org.jspecify.annotations.NullUnmarked");
        f52325c = c35847e8;
        f52326d = new C35847e("javax.annotation.meta.TypeQualifier");
        f52327e = new C35847e("javax.annotation.meta.TypeQualifierNickname");
        f52328f = new C35847e("javax.annotation.meta.TypeQualifierDefault");
        C35847e c35847e9 = new C35847e("javax.annotation.Nonnull");
        f52329g = c35847e9;
        C35847e c35847e10 = new C35847e("javax.annotation.Nullable");
        C35847e c35847e11 = new C35847e("javax.annotation.CheckForNull");
        f52330h = new C35847e("javax.annotation.ParametersAreNonnullByDefault");
        f52331i = new C35847e("javax.annotation.ParametersAreNullableByDefault");
        f52332j = AbstractC25260n.m74059b1(new C35847e[]{c35847e9, c35847e11});
        C35847e JETBRAINS_NOT_NULL_ANNOTATION = AbstractC14331x.f52313h;
        AbstractC22676k.m65749i(JETBRAINS_NOT_NULL_ANNOTATION, "JETBRAINS_NOT_NULL_ANNOTATION");
        Set setM74059b1 = AbstractC25260n.m74059b1(new C35847e[]{JETBRAINS_NOT_NULL_ANNOTATION, c35847e4, new C35847e("android.annotation.NonNull"), new C35847e("androidx.annotation.NonNull"), new C35847e("androidx.annotation.RecentlyNonNull"), new C35847e("androidx.annotation.NonNull"), new C35847e("com.android.annotations.NonNull"), new C35847e("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C35847e("org.checkerframework.checker.nullness.qual.NonNull"), new C35847e("edu.umd.cs.findbugs.annotations.NonNull"), new C35847e("io.reactivex.annotations.NonNull"), new C35847e("io.reactivex.rxjava3.annotations.NonNull"), new C35847e("org.eclipse.jdt.annotation.NonNull"), new C35847e("lombok.NonNull"), new C35847e("jakarta.annotation.Nonnull")});
        f52333k = setM74059b1;
        C35847e JETBRAINS_NULLABLE_ANNOTATION = AbstractC14331x.f52314i;
        AbstractC22676k.m65749i(JETBRAINS_NULLABLE_ANNOTATION, "JETBRAINS_NULLABLE_ANNOTATION");
        Set setM74059b2 = AbstractC25260n.m74059b1(new C35847e[]{JETBRAINS_NULLABLE_ANNOTATION, c35847e, c35847e5, c35847e10, c35847e11, new C35847e("android.annotation.Nullable"), new C35847e("androidx.annotation.Nullable"), new C35847e("androidx.annotation.RecentlyNullable"), new C35847e("androidx.annotation.Nullable"), new C35847e("com.android.annotations.Nullable"), new C35847e("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C35847e("org.checkerframework.checker.nullness.qual.Nullable"), new C35847e("edu.umd.cs.findbugs.annotations.Nullable"), new C35847e("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C35847e("edu.umd.cs.findbugs.annotations.CheckForNull"), new C35847e("io.reactivex.annotations.Nullable"), new C35847e("io.reactivex.rxjava3.annotations.Nullable"), new C35847e("org.eclipse.jdt.annotation.Nullable"), new C35847e("jakarta.annotation.Nullable")});
        f52334l = setM74059b2;
        f52335m = AbstractC25260n.m74059b1(new C35847e[]{c35847e3, c35847e7});
        AbstractC12350b.m34555D(c35847e8, AbstractC12350b.m34555D(c35847e6, AbstractC12350b.m34555D(c35847e2, AbstractC12350b.m34555D(c35847e9, AbstractC12350b.m34556E(AbstractC12350b.m34556E(new LinkedHashSet(), setM74059b1), setM74059b2)))));
        f52336n = AbstractC25260n.m74059b1(new C35847e[]{AbstractC14331x.f52316k, AbstractC14331x.f52317l});
        f52337o = AbstractC25260n.m74059b1(new C35847e[]{AbstractC14331x.f52315j, AbstractC14331x.f52318m});
        AbstractC25247g0.m73990Y(new C23465k(AbstractC14331x.f52308c, AbstractC27741m.f111869t), new C23465k(AbstractC14331x.f52309d, AbstractC27741m.f111872w), new C23465k(AbstractC14331x.f52310e, AbstractC27741m.f111862m), new C23465k(AbstractC14331x.f52311f, AbstractC27741m.f111873x));
        f52338p = new C35847e("kotlin.annotations.jvm.UnderMigration");
    }

    /* JADX INFO: renamed from: a */
    public static final Set m40940a() {
        return f52332j;
    }

    /* JADX INFO: renamed from: b */
    public static final Set m40941b() {
        return f52335m;
    }

    /* JADX INFO: renamed from: c */
    public static final C35847e m40942c() {
        return f52329g;
    }

    /* JADX INFO: renamed from: d */
    public static final C35847e m40943d() {
        return f52326d;
    }

    /* JADX INFO: renamed from: e */
    public static final C35847e m40944e() {
        return f52328f;
    }

    /* JADX INFO: renamed from: f */
    public static final C35847e m40945f() {
        return f52327e;
    }

    /* JADX INFO: renamed from: g */
    public static final Set m40946g() {
        return f52333k;
    }

    /* JADX INFO: renamed from: h */
    public static final Set m40947h() {
        return f52334l;
    }

    /* JADX INFO: renamed from: i */
    public static final C35847e m40948i() {
        return f52338p;
    }
}
