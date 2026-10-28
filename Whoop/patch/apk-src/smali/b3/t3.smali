.class public abstract Lb3/t3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lb3/t3;->a:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lec3/f2;
    .locals 9

    sget-object v1, Lb3/t3;->a:Ljava/util/LinkedHashMap;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v0, "animator_duration_scale"

    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    const/4 v0, -0x1

    const/4 v2, 0x6

    const/4 v5, 0x0

    invoke-static {v0, v2, v5}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object v6

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Handler;->createAsync(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    new-instance v5, Lb3/s3;

    invoke-direct {v5, v6, v0}, Lb3/s3;-><init>(Ldc3/h;Landroid/os/Handler;)V

    new-instance v2, Landroidx/lifecycle/g1;

    const/4 v8, 0x0

    move-object v7, p0

    invoke-direct/range {v2 .. v8}, Landroidx/lifecycle/g1;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lb3/s3;Ldc3/h;Landroid/content/Context;Lq83/d;)V

    new-instance p0, Lec3/s1;

    invoke-direct {p0, v2}, Lec3/s1;-><init>(Lc93/m;)V

    new-instance v0, Lhc3/d;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    invoke-static {v2, v3}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-direct {v0, v2}, Lhc3/d;-><init>(Lq83/j;)V

    const-wide/16 v2, 0x0

    const/4 v4, 0x3

    invoke-static {v4, v2, v3}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object v2

    invoke-virtual {v7}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "animator_duration_scale"

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v3, v4, v5}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {p0, v0, v2, v3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    invoke-interface {v1, v7, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_0
    :goto_0
    check-cast v0, Lec3/f2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :goto_1
    monitor-exit v1

    throw p0
.end method

.method public static final b(Landroid/view/View;)Lp1/t;
    .locals 1

    const v0, 0x7f0a015f

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lp1/t;

    if-eqz v0, :cond_0

    check-cast p0, Lp1/t;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
