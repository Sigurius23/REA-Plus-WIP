.class public final Ljc/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqc/q;

.field public final b:Landroid/content/Context;

.field public final c:Ljava/lang/String;

.field public final d:La3/p;

.field public final e:Lsc/b;

.field public final f:Lic/b;

.field public final g:Lic/y;

.field public final h:Lpc/a;

.field public final i:Landroidx/work/impl/WorkDatabase;

.field public final j:Lqc/u;

.field public final k:Lqc/c;

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/lang/String;

.field public final n:Lbc3/l1;


# direct methods
.method public constructor <init>(Ljc/b0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ljc/b0;->e:Ljava/lang/Object;

    check-cast v0, Lqc/q;

    iput-object v0, p0, Ljc/i0;->a:Lqc/q;

    iget-object v1, p1, Ljc/b0;->g:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iput-object v1, p0, Ljc/i0;->b:Landroid/content/Context;

    iget-object v0, v0, Lqc/q;->a:Ljava/lang/String;

    iput-object v0, p0, Ljc/i0;->c:Ljava/lang/String;

    iget-object v1, p1, Ljc/b0;->h:Ljava/lang/Object;

    check-cast v1, La3/p;

    iput-object v1, p0, Ljc/i0;->d:La3/p;

    iget-object v1, p1, Ljc/b0;->b:Ljava/lang/Object;

    check-cast v1, Lsc/b;

    iput-object v1, p0, Ljc/i0;->e:Lsc/b;

    iget-object v1, p1, Ljc/b0;->a:Ljava/lang/Object;

    check-cast v1, Lic/b;

    iput-object v1, p0, Ljc/i0;->f:Lic/b;

    iget-object v1, v1, Lic/b;->d:Lic/y;

    iput-object v1, p0, Ljc/i0;->g:Lic/y;

    iget-object v1, p1, Ljc/b0;->c:Ljava/lang/Object;

    check-cast v1, Lpc/a;

    iput-object v1, p0, Ljc/i0;->h:Lpc/a;

    iget-object v1, p1, Ljc/b0;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/work/impl/WorkDatabase;

    iput-object v1, p0, Ljc/i0;->i:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v2

    iput-object v2, p0, Ljc/i0;->j:Lqc/u;

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->b()Lqc/c;

    move-result-object v1

    iput-object v1, p0, Ljc/i0;->k:Lqc/c;

    iget-object p1, p1, Ljc/b0;->f:Ljava/io/Serializable;

    move-object v1, p1

    check-cast v1, Ljava/util/ArrayList;

    iput-object v1, p0, Ljc/i0;->l:Ljava/util/ArrayList;

    const-string p1, "Work [ id="

    const-string v2, ", tags={ "

    invoke-static {p1, v0, v2}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " } ]"

    invoke-static {v0, v1, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ljc/i0;->m:Ljava/lang/String;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object p1

    iput-object p1, p0, Ljc/i0;->n:Lbc3/l1;

    return-void
.end method

.method public static final a(Ljc/i0;Ls83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v6, v1, Ljc/i0;->m:Ljava/lang/String;

    iget-object v2, v1, Ljc/i0;->c:Ljava/lang/String;

    iget-object v3, v1, Ljc/i0;->e:Lsc/b;

    iget-object v4, v1, Ljc/i0;->i:Landroidx/work/impl/WorkDatabase;

    iget-object v5, v1, Ljc/i0;->f:Lic/b;

    iget-object v7, v5, Lic/b;->m:Lic/y;

    iget-object v8, v1, Ljc/i0;->a:Lqc/q;

    instance-of v9, v0, Ljc/h0;

    if-eqz v9, :cond_0

    move-object v9, v0

    check-cast v9, Ljc/h0;

    iget v10, v9, Ljc/h0;->y:I

    const/high16 v11, -0x80000000

    and-int v12, v10, v11

    if-eqz v12, :cond_0

    sub-int/2addr v10, v11

    iput v10, v9, Ljc/h0;->y:I

    goto :goto_0

    :cond_0
    new-instance v9, Ljc/h0;

    invoke-direct {v9, v1, v0}, Ljc/h0;-><init>(Ljc/i0;Ls83/c;)V

    :goto_0
    iget-object v0, v9, Ljc/h0;->w:Ljava/lang/Object;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v11, v9, Ljc/h0;->y:I

    const/4 v12, 0x1

    if-eqz v11, :cond_2

    if-ne v11, v12, :cond_1

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v16, v6

    goto/16 :goto_9

    :catchall_0
    move-exception v0

    move-object/from16 v16, v6

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move-object v4, v6

    goto/16 :goto_b

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v11, v5, Lic/b;->e:Lic/i;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lpf/c;->E()Z

    move-result v7

    iget-object v13, v8, Lqc/q;->x:Ljava/lang/String;

    iget-object v14, v8, Lqc/q;->c:Ljava/lang/String;

    iget-object v15, v8, Lqc/q;->d:Ljava/lang/String;

    if-eqz v7, :cond_5

    if-eqz v13, :cond_5

    invoke-virtual {v8}, Lqc/q;->hashCode()I

    move-result v0

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v16, v6

    const/16 v6, 0x1d

    if-lt v12, v6, :cond_3

    invoke-static {v13}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lac/a;->a(ILjava/lang/String;)V

    goto :goto_3

    :cond_3
    invoke-static {v13}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v12, "asyncTraceBegin"

    :try_start_1
    sget-object v17, Lpf/c;->c:Ljava/lang/reflect/Method;

    if-nez v17, :cond_4

    move/from16 v17, v0

    const-class v0, Landroid/os/Trace;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-object/from16 v18, v10

    :try_start_2
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    move-object/from16 v19, v9

    :try_start_3
    const-class v9, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move/from16 v20, v7

    :try_start_4
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v10, v9, v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v12, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lpf/c;->c:Ljava/lang/reflect/Method;

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    move/from16 v20, v7

    goto :goto_2

    :catch_3
    move-exception v0

    move/from16 v20, v7

    move-object/from16 v19, v9

    goto :goto_2

    :catch_4
    move-exception v0

    move/from16 v20, v7

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    goto :goto_2

    :cond_4
    move/from16 v17, v0

    move/from16 v20, v7

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    :goto_1
    sget-object v0, Lpf/c;->c:Ljava/lang/reflect/Method;

    sget-wide v9, Lpf/c;->a:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v7, v6, v9}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v0, v7, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_4

    :goto_2
    invoke-static {v0, v12}, Lpf/c;->D(Ljava/lang/Exception;Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    move-object/from16 v16, v6

    :goto_3
    move/from16 v20, v7

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    :goto_4
    new-instance v0, Ljc/z;

    const/4 v6, 0x0

    invoke-direct {v0, v1, v6}, Ljc/z;-><init>(Ljc/i0;I)V

    invoke-virtual {v4, v0}, Landroidx/room/z0;->runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v10, Ljc/e0;

    invoke-direct {v10}, Ljc/e0;-><init>()V

    goto/16 :goto_c

    :cond_6
    invoke-virtual {v8}, Lqc/q;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v8, Lqc/q;->e:Lic/g;

    const/4 v7, 0x0

    goto/16 :goto_8

    :cond_7
    iget-object v0, v5, Lic/b;->f:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "className"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/n;->a:Ljava/lang/String;

    :try_start_5
    invoke-static {v15}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_6

    const/4 v7, 0x0

    :try_start_6
    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v9, "null cannot be cast to non-null type androidx.work.InputMerger"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/work/OverwritingInputMerger;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    goto :goto_5

    :catch_6
    move-exception v0

    const/4 v7, 0x0

    :goto_5
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v9

    sget-object v10, Lic/n;->a:Ljava/lang/String;

    const-string v12, "Trouble instantiating "

    invoke-virtual {v12, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v10, v12, v0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v7

    :goto_6
    if-nez v0, :cond_8

    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    const-string v2, "Could not create Input Merger "

    invoke-virtual {v2, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lic/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Ljc/c0;

    invoke-direct {v10}, Ljc/c0;-><init>()V

    goto/16 :goto_c

    :cond_8
    iget-object v0, v8, Lqc/q;->e:Lic/g;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iget-object v9, v1, Ljc/i0;->j:Lqc/u;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "id"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v9, Lqc/u;->a:Landroidx/room/z0;

    new-instance v10, Le61/g;

    const/16 v12, 0xe

    invoke-direct {v10, v2, v12}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 v12, 0x1

    invoke-static {v9, v12, v6, v10}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v0, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v6, Lb0/b;

    invoke-direct {v6, v12}, Lb0/b;-><init>(I)V

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lic/g;

    iget-object v10, v10, Lic/g;->a:Ljava/util/HashMap;

    invoke-static {v10}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    const-string v12, "unmodifiableMap(...)"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v6, v9}, Lb0/b;->e(Ljava/util/Map;)V

    invoke-virtual {v6}, Lb0/b;->b()Lic/g;

    move-result-object v0

    :goto_8
    new-instance v6, Landroidx/work/WorkerParameters;

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    iget-object v9, v1, Ljc/i0;->l:Ljava/util/ArrayList;

    iget-object v10, v1, Ljc/i0;->d:La3/p;

    iget v8, v8, Lqc/q;->k:I

    iget-object v12, v5, Lic/b;->a:Ljava/util/concurrent/Executor;

    iget-object v5, v5, Lic/b;->b:Lkc3/e;

    new-instance v15, Lrc/n;

    invoke-direct {v15, v4, v3}, Lrc/n;-><init>(Landroidx/work/impl/WorkDatabase;Lsc/b;)V

    new-instance v7, Lrc/m;

    move-object/from16 v17, v13

    iget-object v13, v1, Ljc/i0;->h:Lpc/a;

    invoke-direct {v7, v4, v13, v3}, Lrc/m;-><init>(Landroidx/work/impl/WorkDatabase;Lpc/a;Lsc/b;)V

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iput-object v2, v6, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    iput-object v0, v6, Landroidx/work/WorkerParameters;->b:Lic/g;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, v6, Landroidx/work/WorkerParameters;->c:Ljava/util/HashSet;

    iput-object v10, v6, Landroidx/work/WorkerParameters;->d:La3/p;

    iput v8, v6, Landroidx/work/WorkerParameters;->e:I

    iput-object v12, v6, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/Executor;

    iput-object v5, v6, Landroidx/work/WorkerParameters;->g:Lq83/j;

    iput-object v3, v6, Landroidx/work/WorkerParameters;->h:Lsc/b;

    iput-object v11, v6, Landroidx/work/WorkerParameters;->i:Lic/i;

    iput-object v15, v6, Landroidx/work/WorkerParameters;->j:Lrc/n;

    iput-object v7, v6, Landroidx/work/WorkerParameters;->k:Lrc/m;

    :try_start_7
    iget-object v0, v1, Ljc/i0;->b:Landroid/content/Context;

    invoke-virtual {v11, v0, v14, v6}, Lic/t0;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lic/v;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-virtual {v2}, Lic/v;->setUsed()V

    invoke-interface/range {v19 .. v19}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v5, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v5}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lbc3/k1;

    new-instance v5, Ljc/a0;

    move-object/from16 v8, v17

    move/from16 v6, v20

    invoke-direct {v5, v2, v6, v8, v1}, Ljc/a0;-><init>(Lic/v;ZLjava/lang/String;Ljc/i0;)V

    invoke-interface {v0, v5}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    new-instance v5, Ljc/z;

    const/4 v12, 0x1

    invoke-direct {v5, v1, v12}, Ljc/z;-><init>(Ljc/i0;I)V

    invoke-virtual {v4, v5}, Landroidx/room/z0;->runInTransaction(Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "runInTransaction(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_a

    new-instance v10, Ljc/e0;

    invoke-direct {v10}, Ljc/e0;-><init>()V

    goto/16 :goto_c

    :cond_a
    invoke-interface {v0}, Lbc3/k1;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v10, Ljc/e0;

    invoke-direct {v10}, Ljc/e0;-><init>()V

    goto/16 :goto_c

    :cond_b
    iget-object v0, v3, Lsc/b;->d:Lcq/s;

    const-string v3, "getMainThreadExecutor(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lbc3/f0;->q(Ljava/util/concurrent/Executor;)Lbc3/z;

    move-result-object v6

    :try_start_8
    new-instance v0, La6/v;

    const/16 v5, 0xd

    move-object v3, v7

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v5}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v9, v19

    const/4 v12, 0x1

    iput v12, v9, Ljc/h0;->y:I

    invoke-static {v6, v0, v9}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v18

    if-ne v0, v1, :cond_c

    move-object v10, v1

    goto :goto_c

    :cond_c
    :goto_9
    check-cast v0, Lic/u;

    new-instance v10, Ljc/d0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v10, v0}, Ljc/d0;-><init>(Lic/u;)V
    :try_end_8
    .catch Ljava/util/concurrent/CancellationException; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    goto :goto_a

    :catch_7
    move-exception v0

    move-object/from16 v4, v16

    goto :goto_b

    :goto_a
    sget-object v1, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v4, v16

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " failed because it threw an exception/error"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3, v0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v10, Ljc/c0;

    invoke-direct {v10}, Ljc/c0;-><init>()V

    goto :goto_c

    :goto_b
    sget-object v1, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    const-string v3, " was cancelled"

    invoke-static {v4, v3}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget v2, v2, Lic/w;->a:I

    const/4 v4, 0x4

    if-gt v2, v4, :cond_d

    invoke-static {v1, v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_d
    throw v0

    :catchall_2
    sget-object v0, Ljc/j0;->a:Ljava/lang/String;

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Could not create Worker "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lic/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v10, Ljc/c0;

    invoke-direct {v10}, Ljc/c0;-><init>()V

    :goto_c
    return-object v10
.end method


# virtual methods
.method public final b(I)V
    .locals 5

    sget-object v0, Lic/m0;->w:Lic/m0;

    iget-object v1, p0, Ljc/i0;->j:Lqc/u;

    iget-object v2, p0, Ljc/i0;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    iget-object v0, p0, Ljc/i0;->g:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4, v2}, Lqc/u;->i(JLjava/lang/String;)V

    iget-object v0, p0, Ljc/i0;->a:Lqc/q;

    iget v0, v0, Lqc/q;->v:I

    invoke-virtual {v1, v0, v2}, Lqc/u;->h(ILjava/lang/String;)V

    const-wide/16 v3, -0x1

    invoke-virtual {v1, v3, v4, v2}, Lqc/u;->g(JLjava/lang/String;)I

    invoke-virtual {v1, p1, v2}, Lqc/u;->k(ILjava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 7

    iget-object v0, p0, Ljc/i0;->g:Lic/y;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Ljc/i0;->j:Lqc/u;

    iget-object v3, p0, Ljc/i0;->c:Ljava/lang/String;

    invoke-virtual {v2, v0, v1, v3}, Lqc/u;->i(JLjava/lang/String;)V

    sget-object v0, Lic/m0;->w:Lic/m0;

    invoke-virtual {v2, v0, v3}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v1, Le61/g;

    const/16 v4, 0xc

    invoke-direct {v1, v3, v4}, Le61/g;-><init>(Ljava/lang/String;I)V

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v4, v5, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    iget-object v0, p0, Ljc/i0;->a:Lqc/q;

    iget v0, v0, Lqc/q;->v:I

    invoke-virtual {v2, v0, v3}, Lqc/u;->h(ILjava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lqc/u;->a:Landroidx/room/z0;

    new-instance v1, Le61/g;

    const/16 v6, 0xd

    invoke-direct {v1, v3, v6}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-static {v0, v4, v5, v1}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    const-wide/16 v0, -0x1

    invoke-virtual {v2, v0, v1, v3}, Lqc/u;->g(JLjava/lang/String;)I

    return-void
.end method

.method public final d(Lic/u;)V
    .locals 6

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljc/i0;->c:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    iget-object v3, p0, Ljc/i0;->j:Lqc/u;

    if-nez v2, :cond_1

    invoke-static {v1}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Lqc/u;->d(Ljava/lang/String;)Lic/m0;

    move-result-object v4

    sget-object v5, Lic/m0;->F:Lic/m0;

    if-eq v4, v5, :cond_0

    sget-object v4, Lic/m0;->z:Lic/m0;

    invoke-virtual {v3, v4, v2}, Lqc/u;->j(Lic/m0;Ljava/lang/String;)I

    :cond_0
    iget-object v3, p0, Ljc/i0;->k:Lqc/c;

    invoke-virtual {v3, v2}, Lqc/c;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    check-cast p1, Lic/r;

    iget-object p1, p1, Lic/r;->a:Lic/g;

    const-string v1, "getOutputData(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ljc/i0;->a:Lqc/q;

    iget v1, v1, Lqc/q;->v:I

    invoke-virtual {v3, v1, v0}, Lqc/u;->h(ILjava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v3, Lqc/u;->a:Landroidx/room/z0;

    new-instance v2, Lp3/b0;

    const/4 v3, 0x6

    invoke-direct {v2, v3, p1, v0}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-static {v1, p1, v0, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    return-void
.end method
