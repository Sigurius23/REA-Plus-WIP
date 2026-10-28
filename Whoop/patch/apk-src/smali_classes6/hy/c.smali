.class public final Lhy/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk20/a;

.field public final b:Le00/w;

.field public final c:Ljava/lang/String;

.field public final d:Lq83/j;

.field public final e:La30/e0;

.field public final f:Lwz/l1;

.field public final g:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

.field public final h:Lqy/d;


# direct methods
.method public constructor <init>(Lk20/a;Le00/w;Ljava/lang/String;Lq83/j;La30/e0;Lwz/l1;Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Lqy/d;)V
    .locals 1

    const-string v0, "eventReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkDisabledApiRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mobileSessionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveCustomerEmail"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkConfigurationCoordinator"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy/c;->a:Lk20/a;

    iput-object p2, p0, Lhy/c;->b:Le00/w;

    iput-object p3, p0, Lhy/c;->c:Ljava/lang/String;

    iput-object p4, p0, Lhy/c;->d:Lq83/j;

    iput-object p5, p0, Lhy/c;->e:La30/e0;

    iput-object p6, p0, Lhy/c;->f:Lwz/l1;

    iput-object p7, p0, Lhy/c;->g:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iput-object p8, p0, Lhy/c;->h:Lqy/d;

    return-void
.end method

.method public static final a(Lhy/c;Ly00/u1;La30/v0;Ljava/util/List;Ls83/c;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v4, v3, Lhy/b;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lhy/b;

    iget v5, v4, Lhy/b;->J:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lhy/b;->J:I

    goto :goto_0

    :cond_0
    new-instance v4, Lhy/b;

    invoke-direct {v4, v0, v3}, Lhy/b;-><init>(Lhy/c;Ls83/c;)V

    :goto_0
    iget-object v3, v4, Lhy/b;->H:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lhy/b;->J:I

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v10, :cond_2

    if-ne v6, v7, :cond_1

    iget-object v0, v4, Lhy/b;->G:Lhy/e;

    iget-object v1, v4, Lhy/b;->F:Ljava/lang/String;

    iget-object v2, v4, Lhy/b;->E:Ly00/r1;

    iget-object v5, v4, Lhy/b;->z:Ljava/util/List;

    check-cast v5, Ljava/util/List;

    iget-object v6, v4, Lhy/b;->y:La30/v0;

    iget-object v7, v4, Lhy/b;->x:Ly00/u1;

    iget-object v4, v4, Lhy/b;->w:Lhy/c;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v4, Lhy/b;->E:Ly00/r1;

    iget-object v1, v4, Lhy/b;->z:Ljava/util/List;

    check-cast v1, Ljava/util/List;

    iget-object v2, v4, Lhy/b;->y:La30/v0;

    iget-object v6, v4, Lhy/b;->x:Ly00/u1;

    iget-object v11, v4, Lhy/b;->w:Lhy/c;

    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v29, v3

    move-object v3, v0

    move-object v0, v1

    move-object v1, v6

    move-object/from16 v6, v29

    goto :goto_2

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Ly00/u1;->F:Ljava/util/Map;

    sget-object v6, Ly00/s1;->z:Ly00/s1;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_16

    :cond_4
    iget-object v3, v1, Ly00/u1;->G:Ly00/r1;

    if-eqz v3, :cond_1c

    iput-object v0, v4, Lhy/b;->w:Lhy/c;

    iput-object v1, v4, Lhy/b;->x:Ly00/u1;

    iput-object v2, v4, Lhy/b;->y:La30/v0;

    move-object/from16 v6, p3

    check-cast v6, Ljava/util/List;

    iput-object v6, v4, Lhy/b;->z:Ljava/util/List;

    iput-object v3, v4, Lhy/b;->E:Ly00/r1;

    iput v10, v4, Lhy/b;->J:I

    iget-object v6, v2, La30/v0;->E:Lv00/c0;

    iget-object v11, v6, Lv00/c0;->l0:La30/l0;

    if-eqz v11, :cond_5

    iget-object v11, v11, La30/l0;->w:Lwz/g0;

    if-eqz v11, :cond_5

    iget-object v11, v11, Lwz/g0;->F:Lwz/f0;

    if-eqz v11, :cond_5

    iget-object v11, v11, Lwz/f0;->x:Ljava/lang/String;

    if-nez v11, :cond_7

    :cond_5
    iget-object v11, v0, Lhy/c;->e:La30/e0;

    iget-object v12, v2, La30/v0;->w:Lmy/a;

    iget-object v6, v6, Lv00/c0;->P:Lv00/p;

    if-eqz v6, :cond_6

    new-instance v13, Lz20/h;

    iget-object v14, v6, Lv00/p;->w:Ljava/lang/String;

    iget-object v15, v6, Lv00/p;->x:Ljava/lang/String;

    iget-object v6, v6, Lv00/p;->y:Ljava/lang/String;

    invoke-direct {v13, v14, v15, v6}, Lz20/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v13, v8

    :goto_1
    invoke-virtual {v11, v12, v13, v4}, La30/e0;->a(Lmy/a;Lz20/h;Ls83/c;)Ljava/lang/Object;

    move-result-object v6

    move-object v11, v6

    :cond_7
    if-ne v11, v5, :cond_8

    goto :goto_9

    :cond_8
    move-object v6, v11

    move-object v11, v0

    move-object/from16 v0, p3

    :goto_2
    check-cast v6, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v2, La30/v0;->w:Lmy/a;

    iget-object v12, v12, Lmy/a;->E:Lh20/i1;

    if-eqz v12, :cond_9

    iget-object v13, v12, Lh20/i1;->x:Ljava/lang/String;

    goto :goto_3

    :cond_9
    move-object v13, v8

    :goto_3
    if-eqz v13, :cond_a

    move v13, v10

    goto :goto_4

    :cond_a
    move v13, v9

    :goto_4
    if-eqz v12, :cond_b

    iget-object v14, v12, Lh20/i1;->z:Ljava/lang/String;

    goto :goto_5

    :cond_b
    move-object v14, v8

    :goto_5
    if-eqz v14, :cond_c

    move v14, v10

    goto :goto_6

    :cond_c
    move v14, v9

    :goto_6
    if-eqz v12, :cond_d

    iget-object v12, v12, Lh20/i1;->y:Ljava/lang/String;

    goto :goto_7

    :cond_d
    move-object v12, v8

    :goto_7
    if-eqz v12, :cond_e

    move v12, v10

    goto :goto_8

    :cond_e
    move v12, v9

    :goto_8
    new-instance v15, Lhy/e;

    invoke-direct {v15, v13, v12, v14}, Lhy/e;-><init>(ZZZ)V

    if-eqz v6, :cond_11

    iget-object v12, v1, Ly00/u1;->O:Ljava/lang/String;

    iput-object v11, v4, Lhy/b;->w:Lhy/c;

    iput-object v1, v4, Lhy/b;->x:Ly00/u1;

    iput-object v2, v4, Lhy/b;->y:La30/v0;

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    iput-object v13, v4, Lhy/b;->z:Ljava/util/List;

    iput-object v3, v4, Lhy/b;->E:Ly00/r1;

    iput-object v6, v4, Lhy/b;->F:Ljava/lang/String;

    iput-object v15, v4, Lhy/b;->G:Lhy/e;

    iput v7, v4, Lhy/b;->J:I

    invoke-virtual {v11, v6, v12, v4}, Lhy/c;->b(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_f

    :goto_9
    return-object v5

    :cond_f
    move-object v5, v0

    move-object v7, v1

    move-object v1, v6

    move-object v0, v15

    move-object v6, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v11

    :goto_a
    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_10

    move-object/from16 v23, v0

    move/from16 v20, v10

    goto :goto_b

    :cond_10
    move-object v15, v0

    move-object v3, v2

    move-object v11, v4

    move-object v0, v5

    move-object v2, v6

    move-object v6, v1

    move-object v1, v7

    :cond_11
    move-object v5, v0

    move-object v7, v1

    move-object v1, v6

    move/from16 v20, v9

    move-object v4, v11

    move-object/from16 v23, v15

    move-object v6, v2

    move-object v2, v3

    :goto_b
    iget-object v0, v6, La30/v0;->E:Lv00/c0;

    iget-object v0, v0, Lv00/c0;->l0:La30/l0;

    if-eqz v0, :cond_12

    iget-object v0, v0, La30/l0;->w:Lwz/g0;

    if-eqz v0, :cond_12

    iget-object v3, v4, Lhy/c;->f:Lwz/l1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v0}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object v0

    invoke-virtual {v0}, Ln20/e;->b()Lb00/a;

    move-result-object v0

    invoke-virtual {v0}, Lb00/a;->b()Z

    move-result v0

    if-ne v0, v10, :cond_12

    move/from16 v21, v10

    goto :goto_c

    :cond_12
    move/from16 v21, v9

    :goto_c
    sget-object v0, Lhy/d;->w:Lhy/d;

    if-eqz v1, :cond_13

    move-object/from16 v22, v0

    goto :goto_d

    :cond_13
    move-object/from16 v22, v8

    :goto_d
    iget-object v0, v6, La30/v0;->E:Lv00/c0;

    iget-object v0, v0, Lv00/c0;->l0:La30/l0;

    if-eqz v0, :cond_14

    move/from16 v26, v10

    goto :goto_e

    :cond_14
    move/from16 v26, v9

    :goto_e
    iget-object v0, v4, Lhy/c;->g:Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;

    iget-object v0, v0, Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;->w:Ljava/lang/String;

    iget-object v1, v7, Ly00/u1;->H:Ly00/p1;

    if-eqz v1, :cond_15

    iget-object v1, v1, Ly00/p1;->y:Ly00/o1;

    if-eqz v1, :cond_15

    iget-object v1, v1, Ly00/o1;->F:Ly00/n1;

    if-eqz v1, :cond_15

    iget-object v8, v1, Ly00/n1;->w:Ly00/k1;

    :cond_15
    instance-of v1, v8, Ly00/j1;

    if-eqz v1, :cond_16

    check-cast v8, Ly00/j1;

    iget-boolean v1, v8, Ly00/j1;->w:Z

    if-ne v1, v10, :cond_16

    move v1, v10

    goto :goto_f

    :cond_16
    move v1, v9

    :goto_f
    if-eqz v26, :cond_18

    iget-object v3, v7, Ly00/u1;->F:Ljava/util/Map;

    sget-object v6, Ly00/s1;->E:Ly00/s1;

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_17

    goto :goto_10

    :cond_17
    move v3, v9

    goto :goto_11

    :cond_18
    :goto_10
    move v3, v10

    :goto_11
    if-eqz v1, :cond_19

    if-eqz v3, :cond_19

    move/from16 v24, v10

    goto :goto_12

    :cond_19
    move/from16 v24, v9

    :goto_12
    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly00/q1;

    iget-object v5, v7, Ly00/u1;->G:Ly00/r1;

    if-eqz v5, :cond_1a

    iget-object v5, v5, Ly00/r1;->x:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_1a

    :goto_14
    move-object/from16 v18, v5

    goto :goto_15

    :cond_1a
    const-string v5, "control"

    goto :goto_14

    :goto_15
    iget-object v5, v4, Lhy/c;->a:Lk20/a;

    iget-object v6, v2, Ly00/r1;->w:Ljava/lang/String;

    iget-object v8, v7, Ly00/u1;->O:Ljava/lang/String;

    iget-object v9, v4, Lhy/c;->c:Ljava/lang/String;

    new-instance v16, Lhy/f;

    move-object/from16 v25, v0

    move-object/from16 v19, v3

    move-object/from16 v17, v6

    move-object/from16 v27, v8

    move-object/from16 v28, v9

    invoke-direct/range {v16 .. v28}, Lhy/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ly00/q1;ZZLhy/d;Lhy/e;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v16

    invoke-virtual {v5, v0}, Lk20/a;->k(Lhy/h;)V

    move-object/from16 v0, v25

    goto :goto_13

    :cond_1b
    :goto_16
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Experiments data required to log exposures"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lhy/a;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lhy/a;

    iget v1, v0, Lhy/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhy/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhy/a;

    invoke-direct {v0, p0, p3}, Lhy/a;-><init>(Lhy/c;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lhy/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhy/a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lhy/a;->w:Lhy/c;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p2, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lhy/a;->w:Lhy/c;

    iput v3, v0, Lhy/a;->z:I

    iget-object p3, p0, Lhy/c;->b:Le00/w;

    invoke-virtual {p3, p1, p2, v0}, Le00/w;->m(Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    instance-of p3, p2, Ll83/m;

    if-nez p3, :cond_4

    check-cast p2, Lcom/stripe/android/model/ConsumerSessionLookup;

    invoke-virtual {p2}, Lcom/stripe/android/model/ConsumerSessionLookup;->getExists()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    :cond_4
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p3

    if-eqz p3, :cond_5

    iget-object p1, p1, Lhy/c;->h:Lqy/d;

    const-string v0, "Failed to check if user is returning"

    invoke-virtual {p1, v0, p3}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2
.end method
