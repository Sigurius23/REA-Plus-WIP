.class public Lad3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnh/i;
.implements Ld0/s;
.implements Lio/sentry/t0;
.implements Lio/sentry/l4;
.implements Lio/sentry/featureflags/b;
.implements Llc3/c;
.implements Ls/z0;
.implements Luf/c;
.implements Lp73/c;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lad3/z;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 14
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 16
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    .line 18
    invoke-static {p1}, Landroid/os/Handler;->createAsync(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    .line 19
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 20
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance p1, Lio/sentry/util/a;

    .line 22
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 23
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_3
    new-instance p1, Lio/sentry/android/core/k0;

    sget-object v0, Lio/sentry/t2;->w:Lio/sentry/t2;

    invoke-direct {p1, v0}, Lio/sentry/android/core/k0;-><init>(Lio/sentry/v0;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Li5/g;

    .line 29
    invoke-direct {p1, p0}, Li5/g;-><init>(Lad3/z;)V

    .line 30
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 31
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance p1, Landroid/graphics/Region;

    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance p1, Lp63/a;

    invoke-direct {p1}, Lp63/a;-><init>()V

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 35
    :sswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance p1, Lr1/c;

    const/16 v0, 0x10

    new-array v0, v0, [Lh0/v;

    invoke-direct {p1, v0}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 37
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 38
    :sswitch_8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance p1, Ldl/q;

    const-wide/16 v0, 0x1f4

    .line 40
    invoke-direct {p1, v0, v1}, Ltl/h;-><init>(J)V

    .line 41
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    .line 42
    :sswitch_9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 43
    :sswitch_a
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v0, 0x10

    invoke-direct {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(I)V

    .line 45
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_a
        0x6 -> :sswitch_9
        0x8 -> :sswitch_8
        0xb -> :sswitch_7
        0xc -> :sswitch_6
        0xd -> :sswitch_5
        0xe -> :sswitch_4
        0x11 -> :sswitch_3
        0x12 -> :sswitch_2
        0x13 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Lad3/c;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, Lad3/z;->w:I

    const-string v0, "format"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lad3/z;->w:I

    .line 5
    new-instance v0, Lbl/d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lbl/d;-><init>(Landroid/content/Context;I)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/t1;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    const/16 p1, 0x15

    iput p1, p0, Lad3/z;->w:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p2, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbh/j;Lbu/c;)V
    .locals 0

    const/16 p2, 0x14

    iput p2, p0, Lad3/z;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lad3/z;->w:I

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lne/b;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lad3/z;->w:I

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lad3/z;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    return-void
.end method

.method public static o(Lhh/h;Lmh/j;Lkh/a;Lkh/b;)Lmh/o;
    .locals 8

    new-instance v0, Lmh/o;

    iget-object v1, p3, Lkh/b;->a:Landroid/graphics/Bitmap;

    iget-object v2, p1, Lmh/j;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    move-object v3, v1

    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    sget-object v3, Ldh/g;->w:Ldh/g;

    iget-object p3, p3, Lkh/b;->b:Ljava/util/Map;

    const-string v2, "coil#disk_cache_key"

    invoke-interface {p3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v4, v2, Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v2, v5

    :goto_0
    const-string v4, "coil#is_sampled"

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    instance-of v4, p3, Ljava/lang/Boolean;

    if-eqz v4, :cond_1

    move-object v5, p3

    check-cast v5, Ljava/lang/Boolean;

    :cond_1
    const/4 p3, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move v6, v4

    goto :goto_1

    :cond_2
    move v6, p3

    :goto_1
    sget-object v4, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    instance-of v4, p0, Lhh/k;

    if-eqz v4, :cond_3

    check-cast p0, Lhh/k;

    iget-boolean p0, p0, Lhh/k;->g:Z

    if-eqz p0, :cond_3

    const/4 p3, 0x1

    :cond_3
    move-object v4, p2

    move v7, p3

    move-object v5, v2

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lmh/o;-><init>(Landroid/graphics/drawable/Drawable;Lmh/j;Ldh/g;Lkh/a;Ljava/lang/String;ZZ)V

    return-object v0
.end method

.method public static x(Lad3/z;I)Lp0/j0;
    .locals 9

    iget-object p0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p0, Ln0/u;

    invoke-static {}, Lyl/a;->c()Lz1/f;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lz1/f;->e()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {v1}, Lyl/a;->e(Lz1/f;)Lz1/f;

    move-result-object v3

    :try_start_0
    iget-object v0, p0, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Ln0/u;->p:Lp0/l0;

    iget-wide v4, v0, Ln0/n;->j:J

    iget-boolean v7, p0, Ln0/u;->d:Z

    new-instance v8, Lmx1/o;

    invoke-direct {v8, p1, v0}, Lmx1/o;-><init>(ILn0/n;)V

    iget-object v2, v1, Lp0/l0;->c:Lb9/b;

    if-eqz v2, :cond_1

    iget-object v6, v1, Lp0/l0;->b:La3/p;

    move v3, p1

    invoke-virtual/range {v2 .. v8}, Lb9/b;->y(IJLa3/p;ZLkotlin/jvm/functions/Function1;)Lp0/y0;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lp0/g;->a:Lp0/g;

    return-object p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-static {v1, v3, v2}, Lyl/a;->g(Lz1/f;Lz1/f;Lkotlin/jvm/functions/Function1;)V

    throw p0
.end method


# virtual methods
.method public a(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public b(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h4;

    invoke-virtual {v0, p1}, Lio/sentry/h4;->E(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public c(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h4;

    invoke-interface {v0, p1}, Lio/sentry/d1;->w(Lio/sentry/protocol/j;)Lio/sentry/protocol/v;

    move-result-object p1

    return-object p1
.end method

.method public clone()Lio/sentry/featureflags/b;
    .locals 2

    .line 1
    new-instance v0, Lad3/z;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lad3/z;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Lad3/z;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lad3/z;-><init>(I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public d(ILi5/f;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public e()Lkotlinx/serialization/json/JsonObject;
    .locals 2

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    iget-object v1, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public f(Luf/u;Luf/a;)Ljava/lang/Object;
    .locals 1

    new-instance p2, Ldb/j0;

    const/16 v0, 0x8

    invoke-direct {p2, v0}, Ldb/j0;-><init>(I)V

    invoke-virtual {p1}, Luf/u;->b()Ldg/a;

    move-result-object p1

    invoke-static {}, Lcf/l;->c()Lgf/a;

    move-result-object v0

    invoke-static {p1, v0}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p2, p1}, Ldb/j0;->o(Ljava/lang/String;)V

    invoke-virtual {p2}, Ldb/j0;->g()Loe/a;

    move-result-object p1

    iget-object p2, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p2, Lne/b;

    iget-object p2, p2, Lne/b;->P:La3/p;

    iget-object v0, p2, La3/p;->y:Ljava/lang/Object;

    invoke-virtual {p1}, Loe/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p2, La3/p;->z:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    :cond_0
    check-cast p1, Ljava/util/List;

    iget-object p2, p2, La3/p;->x:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-static {p2, p1}, Lds/p;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public g(Ljava/util/concurrent/CancellationException;)V
    .locals 6

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    iget v1, v0, Lr1/c;->y:I

    new-array v2, v1, [Lbc3/k;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    iget-object v5, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v5, v5, v4

    check-cast v5, Lh0/v;

    iget-object v5, v5, Lh0/v;->b:Lbc3/m;

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v4, v2, v3

    invoke-interface {v4, p1}, Lbc3/k;->cancel(Ljava/lang/Throwable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iget p1, v0, Lr1/c;->y:I

    if-nez p1, :cond_2

    return-void

    :cond_2
    const-string p1, "uncancelled requests present"

    invoke-static {p1}, Lk0/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method public get(I)Ld0/d0;
    .locals 0

    iget-object p1, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Ld0/d0;

    return-object p1
.end method

.method public h(Lio/sentry/android/core/o0;)V
    .locals 2

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/content/ContentProvider;->getCallingPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Provider does not allow for granting of Uri permissions"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public i(I)Li5/f;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public j(Lbh/g;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lcoil/compose/AsyncImagePainter;

    iget-object v0, v0, Lcoil/compose/AsyncImagePainter;->F:Lec3/h2;

    new-instance v1, Lch/i;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    invoke-static {v1, p1}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(I)Li5/f;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Lyc3/g;Lqt/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    return-object p1
.end method

.method public m(Lmh/j;Lkh/a;Lnh/h;Lnh/g;)Lkh/b;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    iget-object v3, v0, Lmh/j;->q:Lmh/b;

    iget-boolean v3, v3, Lmh/b;->w:Z

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    :cond_0
    const/16 v17, 0x0

    goto/16 :goto_e

    :cond_1
    move-object/from16 v3, p0

    iget-object v5, v3, Lad3/z;->x:Ljava/lang/Object;

    check-cast v5, Lbh/j;

    iget-object v5, v5, Lbh/j;->c:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lkh/c;

    if-eqz v5, :cond_2

    iget-object v6, v5, Lkh/c;->a:Lkh/g;

    invoke-interface {v6, v1}, Lkh/g;->p(Lkh/a;)Lkh/b;

    move-result-object v6

    if-nez v6, :cond_3

    iget-object v5, v5, Lkh/c;->b:Lbd3/v;

    invoke-virtual {v5, v1}, Lbd3/v;->g(Lkh/a;)Lkh/b;

    move-result-object v6

    goto :goto_0

    :cond_2
    const/4 v6, 0x0

    :cond_3
    :goto_0
    if-eqz v6, :cond_0

    iget-object v5, v6, Lkh/b;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v7

    if-nez v7, :cond_4

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_4
    sget-object v8, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne v7, v8, :cond_5

    iget-boolean v7, v0, Lmh/j;->n:Z

    if-nez v7, :cond_5

    const/4 v9, 0x0

    :goto_1
    const/16 v17, 0x0

    goto/16 :goto_d

    :cond_5
    iget-object v7, v6, Lkh/b;->b:Ljava/util/Map;

    const-string v8, "coil#is_sampled"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/Boolean;

    if-eqz v8, :cond_6

    check-cast v7, Ljava/lang/Boolean;

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_3

    :cond_7
    const/4 v7, 0x0

    :goto_3
    sget-object v8, Lnh/h;->c:Lnh/h;

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    if-eqz v7, :cond_8

    const/16 v17, 0x0

    goto/16 :goto_b

    :cond_8
    const/4 v8, 0x1

    const/16 v17, 0x0

    goto/16 :goto_c

    :cond_9
    iget-object v1, v1, Lkh/a;->x:Ljava/util/Map;

    const-string v8, "coil#transformation_size"

    invoke-interface {v1, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    invoke-virtual {v2}, Lnh/h;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_1

    :cond_a
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    iget-object v8, v2, Lnh/h;->a:Ldt/b;

    instance-of v11, v8, Lnh/a;

    const v12, 0x7fffffff

    if-eqz v11, :cond_b

    check-cast v8, Lnh/a;

    iget v8, v8, Lnh/a;->a:I

    goto :goto_4

    :cond_b
    move v8, v12

    :goto_4
    iget-object v2, v2, Lnh/h;->b:Ldt/b;

    instance-of v11, v2, Lnh/a;

    if-eqz v11, :cond_c

    check-cast v2, Lnh/a;

    iget v2, v2, Lnh/a;->a:I

    :goto_5
    move-object/from16 v11, p4

    goto :goto_6

    :cond_c
    move v2, v12

    goto :goto_5

    :goto_6
    invoke-static {v1, v5, v8, v2, v11}, Landroidx/room/c1;->k(IIIILnh/g;)D

    move-result-wide v13

    invoke-static {v0}, Lqh/b;->a(Lmh/j;)Z

    move-result v0

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    if-eqz v0, :cond_10

    cmpl-double v11, v13, v15

    if-lez v11, :cond_d

    move-wide v11, v15

    goto :goto_7

    :cond_d
    move-wide v11, v13

    :goto_7
    int-to-double v9, v8

    move/from16 p2, v5

    const/16 v17, 0x0

    int-to-double v4, v1

    mul-double/2addr v4, v11

    sub-double/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v4

    cmpg-double v1, v4, v15

    if-lez v1, :cond_e

    int-to-double v1, v2

    move/from16 v4, p2

    int-to-double v4, v4

    mul-double/2addr v11, v4

    sub-double/2addr v1, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v1

    cmpg-double v1, v1, v15

    if-gtz v1, :cond_f

    :cond_e
    const/4 v8, 0x1

    goto :goto_c

    :cond_f
    const/4 v8, 0x1

    goto :goto_9

    :cond_10
    move v4, v5

    const/16 v17, 0x0

    const/high16 v5, -0x80000000

    if-eq v8, v5, :cond_11

    if-ne v8, v12, :cond_12

    :cond_11
    const/4 v8, 0x1

    goto :goto_8

    :cond_12
    sub-int/2addr v8, v1

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v1

    const/4 v8, 0x1

    if-gt v1, v8, :cond_14

    :goto_8
    if-eq v2, v5, :cond_17

    if-ne v2, v12, :cond_13

    goto :goto_c

    :cond_13
    sub-int/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-gt v1, v8, :cond_14

    goto :goto_c

    :cond_14
    :goto_9
    cmpg-double v1, v13, v15

    if-nez v1, :cond_15

    goto :goto_a

    :cond_15
    if-nez v0, :cond_16

    goto :goto_b

    :cond_16
    :goto_a
    cmpl-double v0, v13, v15

    if-lez v0, :cond_17

    if-eqz v7, :cond_17

    :goto_b
    const/4 v9, 0x0

    goto :goto_d

    :cond_17
    :goto_c
    move v9, v8

    :goto_d
    if-eqz v9, :cond_18

    return-object v6

    :cond_18
    :goto_e
    return-object v17
.end method

.method public n(Lmh/j;Ljava/lang/Object;Lmh/m;Lbh/c;)Lkh/a;
    .locals 8

    iget-object p4, p1, Lmh/j;->e:Lkh/a;

    iget-object v0, p1, Lmh/j;->i:Ljava/util/List;

    if-eqz p4, :cond_0

    return-object p4

    :cond_0
    iget-object p4, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p4, Lbh/j;

    iget-object p4, p4, Lbh/j;->h:Lbh/b;

    iget-object p4, p4, Lbh/b;->c:Ljava/util/List;

    move-object v1, p4

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x0

    if-ge v3, v1, :cond_2

    invoke-interface {p4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v6, v5, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Lih/b;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v6, p2, p3}, Lih/b;->a(Ljava/lang/Object;Lmh/m;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v4

    :goto_1
    if-nez v5, :cond_3

    return-object v4

    :cond_3
    iget-object p1, p1, Lmh/j;->A:Lmh/n;

    iget-object p1, p1, Lmh/n;->w:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    sget-object p1, Lm83/z;->w:Lm83/z;

    goto :goto_2

    :cond_4
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-nez p4, :cond_8

    move-object p1, p2

    :goto_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p1, Lkh/a;

    invoke-direct {p1, v5}, Lkh/a;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_5
    invoke-static {p1}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    move-object p2, v0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p4

    if-nez p4, :cond_7

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    if-gtz p2, :cond_6

    iget-object p2, p3, Lmh/m;->d:Lnh/h;

    invoke-virtual {p2}, Lnh/h;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "coil#transformation_size"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_7
    :goto_3
    new-instance p2, Lkh/a;

    invoke-direct {p2, v5, p1}, Lkh/a;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object p2

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public p(Landroid/view/View;IZ)V
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/autofill/AutofillManager;

    invoke-static {p1, v0, p2, p3}, Lo73/a;->V(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V

    return-void
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lgj/d;

    iget-object v1, v0, Lgj/d;->k:Lfk/a;

    const-string v2, "AndroidNetworkListener, onNetworkUnavailable."

    invoke-interface {v1, v2}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v0, v0, Lgj/d;->a:Lgj/g;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lgj/g;->p:Ljava/lang/Boolean;

    return-void
.end method

.method public r()Lio/sentry/protocol/i;
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public s(IILandroid/os/Bundle;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public t(Lio/sentry/d1;Lio/sentry/q6;)Lio/sentry/k4;
    .locals 10

    const-string v0, "Scopes are required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SentryOptions is required"

    invoke-static {p2, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/p;

    iget-object v0, v0, Lio/sentry/android/core/p;->x:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-static {v1, v0}, Lio/sentry/l4;->y(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lio/sentry/l3;

    invoke-virtual {p2}, Lio/sentry/q6;->getEnvelopeReader()Lio/sentry/s0;

    move-result-object v4

    invoke-virtual {p2}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v5

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    invoke-virtual {p2}, Lio/sentry/q6;->getFlushTimeoutMillis()J

    move-result-wide v7

    invoke-virtual {p2}, Lio/sentry/q6;->getMaxQueueSize()I

    move-result v9

    move-object v3, p1

    invoke-direct/range {v2 .. v9}, Lio/sentry/l3;-><init>(Lio/sentry/d1;Lio/sentry/s0;Lio/sentry/j1;Lio/sentry/v0;JI)V

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lio/sentry/k4;

    invoke-direct {v1, p1, v0, v2, p2}, Lio/sentry/k4;-><init>(Lio/sentry/v0;Ljava/lang/String;Lio/sentry/v;Ljava/io/File;)V

    return-object v1

    :cond_1
    :goto_0
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "No outbox dir path is defined in options."

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public u(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    return-object p1
.end method

.method public v(Lio/sentry/hints/j;)V
    .locals 2

    const-string v0, "definition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lp63/a;

    invoke-virtual {v0, p1}, Lp63/a;->a(Lio/sentry/hints/j;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/x1;

    if-eqz p1, :cond_0

    sget-object v0, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhc3/k;

    :goto_0
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lhc3/k;->f()Lhc3/k;

    move-result-object v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public w()V
    .locals 5

    iget-object v0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    const/4 v1, 0x0

    iget v2, v0, Lr1/c;->y:I

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v1

    iget v2, v1, Li93/h;->w:I

    iget v1, v1, Li93/h;->x:I

    if-gt v2, v1, :cond_0

    :goto_0
    iget-object v3, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v3, v3, v2

    check-cast v3, Lh0/v;

    iget-object v3, v3, Lh0/v;->b:Lbc3/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v3, v4}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    if-eq v2, v1, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lr1/c;->g()V

    return-void
.end method
