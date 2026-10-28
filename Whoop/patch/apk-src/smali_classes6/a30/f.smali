.class public final La30/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La30/g;

.field public final b:La30/e0;

.field public final c:Lxz/n0;

.field public final d:Lu00/e;

.field public final e:Lt9/p;


# direct methods
.method public constructor <init>(La30/g;La30/e0;Lxz/n0;Lu00/e;Lt9/p;)V
    .locals 1

    const-string v0, "accountStatusProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "retrieveCustomerEmail"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkStore"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkGateFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilterFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La30/f;->a:La30/g;

    iput-object p2, p0, La30/f;->b:La30/e0;

    iput-object p3, p0, La30/f;->c:Lxz/n0;

    iput-object p4, p0, La30/f;->d:Lu00/e;

    iput-object p5, p0, La30/f;->e:Lt9/p;

    return-void
.end method


# virtual methods
.method public final a(La30/t0;Lmy/a;Ls83/c;Ly00/n;Ly00/u1;Lz20/h;)Ljava/lang/Object;
    .locals 49

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    instance-of v4, v2, La30/d;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, La30/d;

    iget v5, v4, La30/d;->K:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, La30/d;->K:I

    goto :goto_0

    :cond_0
    new-instance v4, La30/d;

    invoke-direct {v4, v0, v2}, La30/d;-><init>(La30/f;Ls83/c;)V

    :goto_0
    iget-object v2, v4, La30/d;->I:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, La30/d;->K:I

    const/4 v8, 0x1

    if-eqz v6, :cond_2

    if-ne v6, v8, :cond_1

    iget-object v1, v4, La30/d;->H:Ljava/lang/String;

    iget-object v3, v4, La30/d;->G:Li20/b;

    iget-object v5, v4, La30/d;->F:Lux/a;

    iget-object v6, v4, La30/d;->E:Ly00/n;

    iget-object v10, v4, La30/d;->z:La30/t0;

    iget-object v11, v4, La30/d;->y:Ly00/u1;

    iget-object v12, v4, La30/d;->x:Lmy/a;

    iget-object v4, v4, La30/d;->w:La30/f;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v24, v5

    move-object/from16 v48, v6

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v3, Ly00/u1;->w:Ly00/t1;

    if-eqz v2, :cond_3

    iget-boolean v2, v2, Ly00/t1;->x:Z

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_4

    iget-object v2, v1, Lmy/a;->N:Lh20/t1;

    sget-object v6, Lh20/p1;->w:Lh20/p1;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    new-instance v2, Lv00/j0;

    iget-object v6, v1, Lmy/a;->N:Lh20/t1;

    invoke-direct {v2, v6}, Lv00/j0;-><init>(Lh20/t1;)V

    goto :goto_2

    :cond_4
    sget-object v2, Lux/f;->w:Lux/f;

    :goto_2
    iget-object v6, v1, Lmy/a;->F:Li20/b;

    if-eqz v6, :cond_5

    iget-object v10, v6, Li20/b;->z:Ljava/lang/Boolean;

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    goto :goto_3

    :cond_5
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_6

    iget-object v10, v6, Li20/b;->y:Ljava/lang/String;

    goto :goto_4

    :cond_6
    iget-object v10, v1, Lmy/a;->E:Lh20/i1;

    if-eqz v10, :cond_7

    iget-object v10, v10, Lh20/i1;->z:Ljava/lang/String;

    goto :goto_4

    :cond_7
    const/4 v10, 0x0

    :goto_4
    iput-object v0, v4, La30/d;->w:La30/f;

    iput-object v1, v4, La30/d;->x:Lmy/a;

    iput-object v3, v4, La30/d;->y:Ly00/u1;

    move-object/from16 v11, p1

    iput-object v11, v4, La30/d;->z:La30/t0;

    move-object/from16 v12, p4

    iput-object v12, v4, La30/d;->E:Ly00/n;

    iput-object v2, v4, La30/d;->F:Lux/a;

    iput-object v6, v4, La30/d;->G:Li20/b;

    iput-object v10, v4, La30/d;->H:Ljava/lang/String;

    iput v8, v4, La30/d;->K:I

    iget-object v13, v0, La30/f;->b:La30/e0;

    move-object/from16 v14, p6

    invoke-virtual {v13, v1, v14, v4}, La30/e0;->a(Lmy/a;Lz20/h;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_8

    return-object v5

    :cond_8
    move-object/from16 v24, v2

    move-object v2, v4

    move-object/from16 v48, v12

    move-object v4, v0

    move-object v12, v1

    move-object v1, v10

    move-object v10, v11

    move-object v11, v3

    move-object v3, v6

    :goto_5
    check-cast v2, Ljava/lang/String;

    new-instance v5, Lwz/f0;

    iget-object v6, v12, Lmy/a;->E:Lh20/i1;

    if-eqz v6, :cond_9

    iget-object v13, v6, Lh20/i1;->y:Ljava/lang/String;

    goto :goto_6

    :cond_9
    const/4 v13, 0x0

    :goto_6
    if-eqz v6, :cond_a

    iget-object v6, v6, Lh20/i1;->w:Lh20/x0;

    if-eqz v6, :cond_a

    iget-object v6, v6, Lh20/x0;->x:Ljava/lang/String;

    goto :goto_7

    :cond_a
    const/4 v6, 0x0

    :goto_7
    invoke-direct {v5, v13, v2, v1, v6}, Lwz/f0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v11, Ly00/u1;->K:Ly00/b1;

    iget-object v2, v11, Ly00/u1;->F:Ljava/util/Map;

    iget-object v6, v11, Ly00/u1;->w:Ly00/t1;

    if-eqz v1, :cond_b

    new-instance v13, Lwz/e0;

    iget-boolean v14, v1, Ly00/b1;->w:Z

    iget-object v1, v1, Ly00/b1;->x:Ljava/util/List;

    invoke-direct {v13, v14, v1}, Lwz/e0;-><init>(ZLjava/util/List;)V

    move-object/from16 v23, v13

    goto :goto_8

    :cond_b
    const/16 v23, 0x0

    :goto_8
    iget-object v14, v11, Ly00/u1;->z:Ly00/c8;

    iget-object v15, v12, Lmy/a;->w:Ljava/lang/String;

    invoke-static {v10}, Lvp/c;->X(La30/t0;)Ljava/lang/String;

    move-result-object v16

    iget-object v1, v11, Ly00/u1;->I:Ljava/lang/String;

    iget-object v10, v11, Ly00/u1;->J:Ljava/lang/String;

    if-eqz v3, :cond_c

    iget-object v13, v3, Li20/b;->z:Ljava/lang/Boolean;

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    move-object/from16 v20, v3

    goto :goto_9

    :cond_c
    const/16 v20, 0x0

    :goto_9
    if-eqz v6, :cond_d

    iget-boolean v3, v6, Ly00/t1;->x:Z

    move/from16 v21, v3

    goto :goto_a

    :cond_d
    const/16 v21, 0x0

    :goto_a
    iget-object v3, v4, La30/f;->e:Lt9/p;

    sget-object v4, Ly00/s1;->I:Ly00/s1;

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v4, v12, Lmy/a;->O:Ljava/util/List;

    goto :goto_b

    :cond_e
    sget-object v4, Liy/a;->j:Lt83/b;

    :goto_b
    check-cast v4, Ljava/util/List;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v4, Ljava/util/List;

    const-string v3, "params"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lv00/k0;

    invoke-direct {v3, v4}, Lv00/k0;-><init>(Ljava/util/List;)V

    invoke-static {v11}, Lf20/a;->a(Ly00/u1;)Lf20/b;

    move-result-object v26

    if-eqz v6, :cond_f

    iget-object v4, v6, Ly00/t1;->z:Ljava/util/Map;

    :goto_c
    move-object/from16 v22, v4

    goto :goto_d

    :cond_f
    sget-object v4, Lm83/z;->w:Lm83/z;

    goto :goto_c

    :goto_d
    if-eqz v6, :cond_10

    iget-boolean v4, v6, Ly00/t1;->G:Z

    move/from16 v29, v4

    goto :goto_e

    :cond_10
    const/16 v29, 0x0

    :goto_e
    if-eqz v6, :cond_11

    iget-boolean v4, v6, Ly00/t1;->H:Z

    move/from16 v30, v4

    goto :goto_f

    :cond_11
    const/16 v30, 0x0

    :goto_f
    if-eqz v6, :cond_12

    iget-boolean v4, v6, Ly00/t1;->I:Z

    move/from16 v31, v4

    goto :goto_10

    :cond_12
    const/16 v31, 0x0

    :goto_10
    if-eqz v6, :cond_13

    iget-boolean v4, v6, Ly00/t1;->J:Z

    move/from16 v39, v4

    goto :goto_11

    :cond_13
    const/16 v39, 0x0

    :goto_11
    if-eqz v6, :cond_14

    iget-boolean v4, v6, Ly00/t1;->L:Z

    move/from16 v42, v4

    goto :goto_12

    :cond_14
    const/16 v42, 0x0

    :goto_12
    if-eqz v6, :cond_15

    iget-boolean v4, v6, Ly00/t1;->M:Z

    move/from16 v43, v4

    goto :goto_13

    :cond_15
    const/16 v43, 0x0

    :goto_13
    iget-object v4, v11, Ly00/u1;->O:Ljava/lang/String;

    if-eqz v6, :cond_16

    iget-object v13, v6, Ly00/t1;->y:Ly00/p2;

    move-object/from16 v33, v13

    goto :goto_14

    :cond_16
    const/16 v33, 0x0

    :goto_14
    iget-object v13, v12, Lmy/a;->I:Lh20/l1;

    move/from16 v17, v8

    iget-object v8, v12, Lmy/a;->E:Lh20/i1;

    if-eqz v6, :cond_17

    iget-object v9, v6, Ly00/t1;->z:Ljava/util/Map;

    const-string v0, "link_mobile_disable_default_opt_in"

    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    goto :goto_15

    :cond_17
    const/4 v0, 0x0

    :goto_15
    xor-int/lit8 v34, v0, 0x1

    iget-object v0, v12, Lmy/a;->R:Ljava/lang/String;

    iget-object v9, v12, Lmy/a;->z:Lh20/w2;

    move-object/from16 v35, v0

    iget-boolean v0, v9, Lh20/w2;->x:Z

    move/from16 v36, v0

    iget-boolean v0, v9, Lh20/w2;->y:Z

    iget-boolean v9, v9, Lh20/w2;->z:Z

    move/from16 v37, v0

    if-eqz v6, :cond_18

    iget-boolean v0, v6, Ly00/t1;->K:Z

    move/from16 v40, v0

    goto :goto_16

    :cond_18
    const/16 v40, 0x0

    :goto_16
    iget-object v0, v11, Ly00/u1;->H:Ly00/p1;

    if-eqz v0, :cond_19

    iget-object v0, v0, Ly00/p1;->y:Ly00/o1;

    if-eqz v0, :cond_19

    iget-object v0, v0, Ly00/o1;->E:Ljava/lang/String;

    move-object/from16 v44, v0

    goto :goto_17

    :cond_19
    const/16 v44, 0x0

    :goto_17
    iget-object v0, v12, Lmy/a;->S:Lwz/d0;

    invoke-static {v11}, Ls6/a;->j(Ly00/u1;)Lv00/i0;

    move-result-object v45

    sget-object v11, Ly00/s1;->G:Ly00/s1;

    invoke-interface {v2, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v46

    if-eqz v6, :cond_1a

    iget-object v2, v6, Ly00/t1;->N:Ljava/util/List;

    goto :goto_18

    :cond_1a
    const/4 v2, 0x0

    :goto_18
    if-nez v2, :cond_1b

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_1b
    move-object/from16 v47, v2

    move-object/from16 v27, v13

    new-instance v13, Lwz/g0;

    move-object/from16 v41, v0

    move-object/from16 v17, v1

    move-object/from16 v25, v3

    move-object/from16 v32, v4

    move-object/from16 v19, v5

    move-object/from16 v28, v8

    move/from16 v38, v9

    move-object/from16 v18, v10

    invoke-direct/range {v13 .. v48}, Lwz/g0;-><init>(Ly00/c8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lwz/f0;Li20/b;ZLjava/util/Map;Lwz/e0;Lux/a;Lux/b;Lf20/b;Lh20/l1;Lh20/i1;ZZZLjava/lang/String;Ly00/p2;ZLjava/lang/String;ZZZZZLwz/d0;ZZLjava/lang/String;Lv00/i0;ZLjava/util/List;Ly00/n;)V

    return-object v13
.end method

.method public final b(La30/t0;Lmy/a;Ls83/c;Ly00/n;Ly00/u1;Lz20/h;)Ljava/lang/Object;
    .locals 15

    move-object/from16 v2, p2

    move-object/from16 v0, p3

    move-object/from16 v5, p5

    instance-of v1, v0, La30/e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, La30/e;

    iget v3, v1, La30/e;->G:I

    const/high16 v4, -0x80000000

    and-int v6, v3, v4

    if-eqz v6, :cond_0

    sub-int/2addr v3, v4

    iput v3, v1, La30/e;->G:I

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_0
    new-instance v1, La30/e;

    invoke-direct {v1, p0, v0}, La30/e;-><init>(La30/f;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v3, La30/e;->E:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v1, v3, La30/e;->G:I

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-object v1, v3, La30/e;->z:Lwz/g0;

    iget-object v2, v3, La30/e;->y:Lmy/a;

    iget-object v4, v3, La30/e;->x:Ly00/u1;

    iget-object v3, v3, La30/e;->w:La30/f;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v3, La30/e;->y:Lmy/a;

    iget-object v2, v3, La30/e;->x:Ly00/u1;

    iget-object v4, v3, La30/e;->w:La30/f;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    invoke-virtual {v5}, Ly00/u1;->b()Z

    move-result v1

    iget-object v4, v5, Ly00/u1;->w:Ly00/t1;

    if-nez v1, :cond_4

    sget-object v1, Ly00/o2;->x:Ly00/o2;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    iget-object v1, v2, Lmy/a;->z:Lh20/w2;

    invoke-virtual {v1}, Lh20/w2;->b()Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Ly00/o2;->y:Ly00/o2;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, p0, La30/f;->d:Lu00/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lb00/a;

    iget-object v6, v5, Ly00/u1;->z:Ly00/c8;

    if-eqz v4, :cond_6

    iget-boolean v11, v4, Ly00/t1;->G:Z

    goto :goto_2

    :cond_6
    move v11, v8

    :goto_2
    if-eqz v4, :cond_7

    iget-boolean v12, v4, Ly00/t1;->H:Z

    goto :goto_3

    :cond_7
    move v12, v8

    :goto_3
    if-eqz v4, :cond_8

    iget-boolean v13, v4, Ly00/t1;->I:Z

    goto :goto_4

    :cond_8
    move v13, v8

    :goto_4
    invoke-direct {v1, v6, v11, v12, v13}, Lb00/a;-><init>(Ly00/c8;ZZZ)V

    invoke-virtual {v1}, Lb00/a;->b()Z

    move-result v1

    if-eqz v4, :cond_9

    iget-boolean v4, v4, Ly00/t1;->x:Z

    goto :goto_5

    :cond_9
    move v4, v8

    :goto_5
    if-eqz v4, :cond_a

    iget-object v4, v2, Lmy/a;->N:Lh20/t1;

    sget-object v6, Lh20/p1;->w:Lh20/p1;

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    if-nez v1, :cond_a

    sget-object v4, Ly00/o2;->z:Ly00/o2;

    invoke-virtual {v0, v4}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_a
    iget-object v4, v2, Lmy/a;->I:Lh20/l1;

    iget-object v6, v4, Lh20/l1;->w:Lh20/k1;

    sget-object v11, Lh20/k1;->y:Lh20/k1;

    if-eq v6, v11, :cond_b

    iget-object v6, v4, Lh20/l1;->x:Lh20/k1;

    if-eq v6, v11, :cond_b

    iget-object v6, v4, Lh20/l1;->y:Lh20/k1;

    if-eq v6, v11, :cond_b

    iget-object v4, v4, Lh20/l1;->z:Lh20/j1;

    sget-object v6, Lh20/j1;->y:Lh20/j1;

    if-ne v4, v6, :cond_c

    :cond_b
    if-nez v1, :cond_c

    sget-object v1, Ly00/o2;->E:Ly00/o2;

    invoke-virtual {v0, v1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_c
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    invoke-virtual {v0}, Ln83/c;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    new-instance v1, La30/f0;

    invoke-direct {v1, v0}, La30/f0;-><init>(Ljava/util/AbstractList;)V

    return-object v1

    :cond_d
    iput-object p0, v3, La30/e;->w:La30/f;

    iput-object v5, v3, La30/e;->x:Ly00/u1;

    iput-object v2, v3, La30/e;->y:Lmy/a;

    iput v10, v3, La30/e;->G:I

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v6, p6

    invoke-virtual/range {v0 .. v6}, La30/f;->a(La30/t0;Lmy/a;Ls83/c;Ly00/n;Ly00/u1;Lz20/h;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_e

    goto :goto_7

    :cond_e
    move-object v4, p0

    move-object/from16 v2, p5

    move-object v0, v1

    move-object/from16 v1, p2

    :goto_6
    check-cast v0, Lwz/g0;

    iget-object v5, v4, La30/f;->a:La30/g;

    iput-object v4, v3, La30/e;->w:La30/f;

    iput-object v2, v3, La30/e;->x:Ly00/u1;

    iput-object v1, v3, La30/e;->y:Lmy/a;

    iput-object v0, v3, La30/e;->z:Lwz/g0;

    iput v9, v3, La30/e;->G:I

    iget-object v5, v5, La30/g;->a:Lwz/l1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v6, "configuration"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object v5

    invoke-virtual {v5}, Ln20/e;->a()Lxz/x;

    move-result-object v5

    iget-object v5, v5, Lxz/x;->m:Landroidx/room/y;

    invoke-static {v5, v3}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_f

    :goto_7
    return-object v7

    :cond_f
    move-object v14, v1

    move-object v1, v0

    move-object v0, v3

    move-object v3, v4

    move-object v4, v2

    move-object v2, v14

    :goto_8
    check-cast v0, Ld00/f;

    invoke-static {v0}, Lx43/j;->X(Ld00/f;)La30/k0;

    move-result-object v5

    new-instance v6, La30/l0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, Ld00/c;->a:Ld00/c;

    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    sget-object v0, La30/g0;->w:La30/g0;

    goto/16 :goto_12

    :cond_10
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    iget-object v7, v4, Ly00/u1;->z:Ly00/c8;

    iget-object v9, v4, Ly00/u1;->w:Ly00/t1;

    invoke-interface {v7}, Ly00/c8;->i0()Ljava/util/List;

    move-result-object v11

    sget-object v12, Ly00/f4;->G:Lt9/c0;

    const-string v12, "card"

    invoke-interface {v11, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_11

    sget-object v11, Ly00/t2;->x:Ly00/t2;

    invoke-virtual {v0, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_11
    if-eqz v9, :cond_12

    iget-boolean v11, v9, Ly00/t1;->E:Z

    goto :goto_9

    :cond_12
    move v11, v8

    :goto_9
    if-eqz v11, :cond_14

    if-eqz v9, :cond_13

    iget-boolean v11, v9, Ly00/t1;->L:Z

    goto :goto_a

    :cond_13
    move v11, v8

    :goto_a
    if-nez v11, :cond_14

    sget-object v11, Ly00/t2;->y:Ly00/t2;

    invoke-virtual {v0, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_14
    if-eqz v9, :cond_15

    iget-boolean v11, v9, Ly00/t1;->L:Z

    goto :goto_b

    :cond_15
    move v11, v8

    :goto_b
    if-eqz v11, :cond_18

    iget-object v11, v1, Lwz/g0;->F:Lwz/f0;

    iget-object v11, v11, Lwz/f0;->x:Ljava/lang/String;

    if-eqz v11, :cond_17

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_16

    goto :goto_c

    :cond_16
    move v11, v8

    goto :goto_d

    :cond_17
    :goto_c
    move v11, v10

    :goto_d
    if-eqz v11, :cond_18

    sget-object v11, Ly00/t2;->z:Ly00/t2;

    invoke-virtual {v0, v11}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_18
    iget-object v3, v3, La30/f;->c:Lxz/n0;

    iget-object v3, v3, Lxz/n0;->a:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    const-string v11, "getValue(...)"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/content/SharedPreferences;

    const-string v11, "has_used_link"

    invoke-interface {v3, v11, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v7}, Ly00/c8;->q0()Z

    move-result v3

    if-eqz v3, :cond_19

    sget-object v3, Ly00/t2;->E:Ly00/t2;

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_19
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    invoke-virtual {v0}, Ln83/c;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1a

    new-instance v2, La30/h0;

    invoke-direct {v2, v0}, La30/h0;-><init>(Ljava/util/AbstractList;)V

    :goto_e
    move-object v0, v2

    goto :goto_12

    :cond_1a
    invoke-static {v4}, Ls6/a;->j(Ly00/u1;)Lv00/i0;

    move-result-object v0

    iget-object v2, v2, Lmy/a;->x:Lh20/c2;

    if-eqz v2, :cond_1b

    move v2, v10

    goto :goto_f

    :cond_1b
    move v2, v8

    :goto_f
    invoke-static {v12, v0, v7, v2}, Ls4/b;->q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z

    move-result v0

    if-eqz v9, :cond_1c

    iget-boolean v2, v9, Ly00/t1;->L:Z

    goto :goto_10

    :cond_1c
    move v2, v8

    :goto_10
    if-eqz v2, :cond_1f

    iget-object v2, v1, Lwz/g0;->F:Lwz/f0;

    iget-object v2, v2, Lwz/f0;->x:Ljava/lang/String;

    if-eqz v2, :cond_1d

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1e

    :cond_1d
    move v8, v10

    :cond_1e
    if-nez v8, :cond_1f

    sget-object v0, Lj00/d0;->w:Lj00/d0;

    goto :goto_11

    :cond_1f
    if-eqz v0, :cond_20

    sget-object v0, Lj00/d0;->x:Lj00/d0;

    goto :goto_11

    :cond_20
    sget-object v0, Lj00/d0;->w:Lj00/d0;

    :goto_11
    new-instance v2, La30/i0;

    invoke-direct {v2, v0}, La30/i0;-><init>(Lj00/d0;)V

    goto :goto_e

    :goto_12
    invoke-direct {v6, v1, v5, v0}, La30/l0;-><init>(Lwz/g0;La30/k0;La30/j0;)V

    return-object v6
.end method
