.class public final synthetic Lm83/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lm83/p;->w:I

    iput-object p1, p0, Lm83/p;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget v0, v1, Lm83/p;->w:I

    const/16 v2, 0x8

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lz1/v;

    :goto_0
    iget-object v5, v3, Lz1/v;->g:Ljava/lang/Object;

    monitor-enter v5

    :try_start_0
    iget-boolean v0, v3, Lz1/v;->c:Z

    if-nez v0, :cond_6

    const/4 v0, 0x1

    iput-boolean v0, v3, Lz1/v;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v0, v3, Lz1/v;->f:Lr1/c;

    iget-object v6, v0, Lr1/c;->w:[Ljava/lang/Object;

    iget v0, v0, Lr1/c;->y:I

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v0, :cond_5

    aget-object v8, v6, v7

    check-cast v8, Lz1/u;

    iget-object v9, v8, Lz1/u;->g:La0/w0;

    iget-object v8, v8, Lz1/u;->a:Lkotlin/jvm/functions/Function1;

    iget-object v10, v9, La0/w0;->b:[Ljava/lang/Object;

    iget-object v11, v9, La0/w0;->a:[J

    array-length v12, v11

    add-int/lit8 v12, v12, -0x2

    if-ltz v12, :cond_3

    const/4 v13, 0x0

    :goto_2
    aget-wide v14, v11, v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v17, v5

    not-long v4, v14

    const/16 v18, 0x7

    shl-long v4, v4, v18

    and-long/2addr v4, v14

    const-wide v18, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long v4, v4, v18

    cmp-long v4, v4, v18

    if-eqz v4, :cond_2

    sub-int v4, v13, v12

    not-int v4, v4

    ushr-int/lit8 v4, v4, 0x1f

    rsub-int/lit8 v4, v4, 0x8

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_1

    const-wide/16 v18, 0xff

    and-long v18, v14, v18

    const-wide/16 v20, 0x80

    cmp-long v18, v18, v20

    if-gez v18, :cond_0

    shl-int/lit8 v18, v13, 0x3

    add-int v18, v18, v5

    move/from16 v19, v2

    :try_start_2
    aget-object v2, v10, v18

    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_0
    move/from16 v19, v2

    :goto_4
    shr-long v14, v14, v19

    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v19

    goto :goto_3

    :cond_1
    if-ne v4, v2, :cond_4

    :cond_2
    if-eq v13, v12, :cond_4

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v5, v17

    const/16 v2, 0x8

    goto :goto_2

    :cond_3
    move-object/from16 v17, v5

    :cond_4
    invoke-virtual {v9}, La0/w0;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v5, v17

    const/16 v2, 0x8

    goto :goto_1

    :goto_5
    const/4 v2, 0x0

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object/from16 v17, v5

    goto :goto_5

    :cond_5
    move-object/from16 v17, v5

    const/4 v2, 0x0

    :try_start_3
    iput-boolean v2, v3, Lz1/v;->c:Z

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_8

    :goto_6
    iput-boolean v2, v3, Lz1/v;->c:Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_3
    move-exception v0

    move-object/from16 v17, v5

    goto :goto_8

    :cond_6
    move-object/from16 v17, v5

    :goto_7
    monitor-exit v17

    invoke-virtual {v3}, Lz1/v;->c()Z

    move-result v0

    if-nez v0, :cond_7

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_7
    const/16 v2, 0x8

    goto/16 :goto_0

    :goto_8
    monitor-exit v17

    throw v0

    :pswitch_0
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lyc3/h;

    iget-object v2, v0, Lyc3/h;->k:[Lyc3/g;

    invoke-static {v0, v2}, Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt;->hashCodeImpl(Lyc3/g;[Lyc3/g;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Ly1/i;

    const/4 v2, 0x0

    new-array v4, v2, [Ll83/k;

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll83/k;

    invoke-static {v2}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object v2

    iget-object v0, v0, Ly1/i;->x:Lpb/e;

    invoke-virtual {v0, v2}, Lpb/e;->b(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_9

    :cond_8
    move-object v3, v2

    :goto_9
    return-object v3

    :pswitch_2
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Ly1/b;

    iget-object v2, v0, Ly1/b;->w:Ly1/j;

    iget-object v3, v0, Ly1/b;->z:Ljava/lang/Object;

    if-eqz v3, :cond_9

    invoke-interface {v2, v0, v3}, Ly1/j;->a(Ly1/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_9
    const-string v0, "Value should be initialized"

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_3
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lwc3/e;

    const-string v2, "kotlinx.serialization.Polymorphic"

    sget-object v3, Lyc3/c;->a:Lyc3/c;

    const/4 v4, 0x0

    new-array v4, v4, [Lyc3/g;

    new-instance v5, Lrf/p;

    const/16 v6, 0x8

    invoke-direct {v5, v0, v6}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v3, v4, v5}, Lvf3/b;->d(Ljava/lang/String;Lyc3/k;[Lyc3/g;Lkotlin/jvm/functions/Function1;)Lyc3/h;

    move-result-object v2

    iget-object v0, v0, Lwc3/e;->a:Lj93/d;

    const-string v3, "context"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lyc3/b;

    invoke-direct {v3, v2, v0}, Lyc3/b;-><init>(Lyc3/h;Lj93/d;)V

    return-object v3

    :pswitch_4
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lwc/m0;

    new-instance v2, Luo1/b;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v3}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lds/q;->A(Lkotlin/jvm/functions/Function1;)Lbe/g;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lwc/c;

    new-instance v2, Luo1/b;

    const/16 v3, 0x10

    invoke-direct {v2, v0, v3}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lds/q;->A(Lkotlin/jvm/functions/Function1;)Lbe/g;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lw3/o;

    check-cast v0, Lw3/b;

    iget v0, v0, Lw3/b;->b:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/r0;

    invoke-static {v0}, Lvm2/d;->g(Landroidx/fragment/app/r0;)Leb/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    invoke-static {v0}, Lvm2/d;->j(Lkotlin/jvm/internal/b0;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    return-object v0

    :pswitch_a
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lvb/i;

    iget-object v2, v0, Lvb/i;->x:Ljava/lang/String;

    const/16 v3, 0x1c

    if-eqz v2, :cond_a

    iget-boolean v4, v0, Lvb/i;->z:Z

    if-eqz v4, :cond_a

    new-instance v4, Ljava/io/File;

    iget-object v5, v0, Lvb/i;->w:Landroid/content/Context;

    const-string v6, "context"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v5

    const-string v6, "getNoBackupFilesDir(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v7, Lvb/h;

    iget-object v8, v0, Lvb/i;->w:Landroid/content/Context;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lbu/c;

    invoke-direct {v10, v3}, Lbu/c;-><init>(I)V

    iget-object v11, v0, Lvb/i;->y:Lub/b;

    iget-boolean v12, v0, Lvb/i;->E:Z

    invoke-direct/range {v7 .. v12}, Lvb/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lbu/c;Lub/b;Z)V

    goto :goto_a

    :cond_a
    new-instance v8, Lvb/h;

    iget-object v9, v0, Lvb/i;->w:Landroid/content/Context;

    iget-object v10, v0, Lvb/i;->x:Ljava/lang/String;

    new-instance v11, Lbu/c;

    invoke-direct {v11, v3}, Lbu/c;-><init>(I)V

    iget-object v12, v0, Lvb/i;->y:Lub/b;

    iget-boolean v13, v0, Lvb/i;->E:Z

    invoke-direct/range {v8 .. v13}, Lvb/h;-><init>(Landroid/content/Context;Ljava/lang/String;Lbu/c;Lub/b;Z)V

    move-object v7, v8

    :goto_a
    iget-boolean v0, v0, Lvb/i;->G:Z

    invoke-virtual {v7, v0}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    return-object v7

    :pswitch_b
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lld1/c;

    invoke-static {v0}, Lum1/d;->f(Lld1/c;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0

    :pswitch_d
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lt92/b;

    invoke-static {v0}, Lt92/b;->e1(Lt92/b;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lrm0/c;->i(Ljava/util/Map;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lrf/o;

    iget-object v2, v0, Lrf/o;->E:Lud3/l0;

    iget-object v4, v0, Lrf/o;->z:Lrf/r;

    iget-object v0, v0, Lrf/o;->F:Lqf/b;

    if-eqz v2, :cond_b

    invoke-static {v2, v0, v4}, Lx30/s0;->j(Lud3/l0;Lqf/b;Lrf/r;)Lud3/l0;

    move-result-object v0

    goto :goto_b

    :cond_b
    filled-new-array {v3}, [Lud3/a0;

    move-result-object v2

    invoke-static {v4, v0, v2}, Lx30/s0;->k(Lrf/r;Lqf/b;[Lud3/a0;)Lud3/l0;

    move-result-object v0

    :goto_b
    return-object v0

    :pswitch_10
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lpf/a;

    return-object v0

    :pswitch_11
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lpb/f;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v2

    new-instance v3, Lpb/a;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v4}, Lpb/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_12
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lp6/n0;

    sget-object v2, Lp6/n0;->d:Lp6/j0;

    monitor-enter v2

    :try_start_4
    sget-object v4, Lp6/n0;->f:La6/g;

    if-nez v4, :cond_e

    iget-object v4, v0, Lp6/n0;->a:Landroid/content/Context;

    const-string v5, "GlanceAppWidgetManager"

    invoke-static {v4, v5}, Ljc/x;->i0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v3, v4

    :cond_c
    if-eqz v3, :cond_d

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    goto :goto_c

    :catchall_4
    move-exception v0

    goto :goto_d

    :cond_d
    :goto_c
    iget-object v0, v0, Lp6/n0;->a:Landroid/content/Context;

    sget-object v3, Lp6/n0;->e:Le6/a;

    sget-object v4, Lp6/j0;->a:[Lj93/z;

    const/16 v16, 0x0

    aget-object v4, v4, v16

    invoke-virtual {v3, v0, v4}, Le6/a;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, La6/g;

    sput-object v4, Lp6/n0;->f:La6/g;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :cond_e
    monitor-exit v2

    return-object v4

    :goto_d
    monitor-exit v2

    throw v0

    :pswitch_13
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lp1/y1;

    iget-object v2, v0, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_5
    invoke-virtual {v0}, Lp1/y1;->w()Lbc3/k;

    move-result-object v3

    iget-object v4, v0, Lp1/y1;->u:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp1/w1;

    sget-object v5, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-lez v4, :cond_10

    monitor-exit v2

    if-eqz v3, :cond_f

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    check-cast v3, Lbc3/m;

    invoke-virtual {v3, v0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_f
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_10
    :try_start_6
    const-string v3, "Recomposer shutdown; frame clock awaiter will never resume"

    iget-object v0, v0, Lp1/y1;->e:Ljava/lang/Throwable;

    invoke-static {v3, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :catchall_5
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_14
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->n()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/metrics/worker/BaseReportingWorker;

    invoke-static {v0}, Lcom/whoop/metrics/worker/BaseReportingWorker;->a(Lcom/whoop/metrics/worker/BaseReportingWorker;)Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository;

    invoke-static {v0}, Lor2/u0;->a(Lcom/whoop/data/repositories/LanguageRepository;)Ljava/util/Locale;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Loe3/g;

    iget-object v2, v0, Loe3/g;->y:Ljava/lang/ClassLoader;

    iget-object v0, v0, Loe3/g;->z:Lne3/p;

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v4

    const-string v5, "getResources(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v4

    const-string v6, "list(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_11
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/URL;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v9

    const-string v10, "file"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    move-object v9, v3

    goto :goto_f

    :cond_12
    sget-object v9, Lne3/e0;->x:Ljava/lang/String;

    new-instance v9, Ljava/io/File;

    invoke-virtual {v8}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v8

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    invoke-static {v9}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v0, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_f
    if-eqz v9, :cond_11

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_13
    const-string v4, "META-INF/MANIFEST.MF"

    invoke-virtual {v2, v4}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/net/URL;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "toString(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "jar:file:"

    const/4 v8, 0x0

    invoke-static {v5, v6, v8}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-nez v6, :cond_15

    :goto_11
    move-object v9, v3

    goto :goto_12

    :cond_15
    const-string v6, "!"

    const/4 v9, 0x6

    invoke-static {v5, v6, v8, v9}, Lyb3/r;->l0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    move-result v6

    const/4 v9, -0x1

    if-ne v6, v9, :cond_16

    goto :goto_11

    :cond_16
    sget-object v9, Lne3/e0;->x:Ljava/lang/String;

    new-instance v9, Ljava/io/File;

    const/4 v10, 0x4

    invoke-virtual {v5, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "substring(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v5

    invoke-direct {v9, v5}, Ljava/io/File;-><init>(Ljava/net/URI;)V

    invoke-static {v9}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object v5

    new-instance v6, Lo72/e;

    const/16 v9, 0x9

    invoke-direct {v6, v9}, Lo72/e;-><init>(I)V

    invoke-static {v5, v0, v6}, Lv8/b;->L(Lne3/e0;Lne3/p;Lkotlin/jvm/functions/Function1;)Lne3/s0;

    move-result-object v5

    sget-object v6, Loe3/g;->F:Lne3/e0;

    new-instance v9, Ll83/k;

    invoke-direct {v9, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_12
    if-eqz v9, :cond_14

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_17
    invoke-static {v7, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lmi1/f;

    invoke-static {v0}, Lmi1/f;->h(Lmi1/f;)Lec3/l;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Lm92/b;

    invoke-static {v0}, Lm92/b;->b(Lm92/b;)Ltr2/n;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, v1, Lm83/p;->x:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
