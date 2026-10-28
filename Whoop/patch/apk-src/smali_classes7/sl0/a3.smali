.class public abstract Lsl0/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "conversationId",
        "",
        "suggestions",
        "",
        "messageCount",
        "Lkotlin/Function1;",
        "Lnl0/d;",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;IILjava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsl0/a3;->f(Lkotlin/jvm/functions/Function1;IILjava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lnl0/d;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsl0/a3;->e(Lnl0/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lsl0/a3;->g(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;I",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "conversationId"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suggestions"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v4, 0xcfe0055

    invoke-virtual {v0, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move-object/from16 v10, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_6

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_4

    :cond_8
    const/16 v11, 0x400

    :goto_4
    or-int/2addr v4, v11

    :goto_5
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    const/4 v14, 0x1

    if-eq v11, v12, :cond_9

    move v11, v14

    goto :goto_6

    :cond_9
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_17

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_a

    new-instance v7, Lsc2/n;

    const/16 v10, 0x1d

    invoke-direct {v7, v10}, Lsc2/n;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, v7

    :cond_b
    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v17, v6, v7

    const/16 v19, 0x0

    const/16 v20, 0xd

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v12, v15

    const-string v15, "VerticalSuggestions"

    invoke-static {v6, v15}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v15, v14

    mul-float/2addr v7, v15

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v7, v8, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v8, v0, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, -0x3f53f812

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    const/4 v6, 0x0

    :goto_8
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v21, v6, 0x1

    if-ltz v6, :cond_15

    check-cast v8, Ljava/lang/String;

    const/high16 v9, 0x3f800000    # 1.0f

    if-nez v6, :cond_f

    const v13, -0x7f79f952

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v14, 0x800

    const/16 v17, 0x6

    const/16 v22, 0x0

    const/16 v18, 0xfe

    move-object/from16 v23, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object/from16 v28, v11

    move-object/from16 v27, v12

    const-wide/16 v11, 0x0

    move/from16 v29, v6

    move-object v6, v13

    move/from16 v30, v14

    const-wide/16 v13, 0x0

    move/from16 v31, v15

    const/4 v15, 0x0

    move-object/from16 v16, v0

    move/from16 v0, v22

    move-object/from16 v32, v23

    move-object/from16 v33, v24

    move-object/from16 v34, v27

    move-object/from16 v1, v28

    move/from16 v5, v29

    move/from16 v2, v30

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v16

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    move v5, v6

    move-object/from16 v32, v7

    move-object/from16 v33, v8

    move-object/from16 v26, v10

    move-object v1, v11

    move-object/from16 v34, v12

    move/from16 v31, v15

    const/16 v2, 0x800

    move-object v6, v0

    const/4 v0, 0x0

    const v7, -0x7f7751dd

    invoke-virtual {v6, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_9
    and-int/lit16 v7, v4, 0x1c00

    if-ne v7, v2, :cond_10

    const/4 v13, 0x1

    goto :goto_a

    :cond_10
    move v13, v0

    :goto_a
    invoke-virtual {v6, v5}, Lp1/q;->e(I)Z

    move-result v7

    or-int/2addr v7, v13

    and-int/lit16 v8, v4, 0x380

    const/16 v9, 0x100

    if-ne v8, v9, :cond_11

    const/4 v13, 0x1

    goto :goto_b

    :cond_11
    move v13, v0

    :goto_b
    or-int/2addr v7, v13

    and-int/lit8 v8, v4, 0xe

    const/4 v10, 0x4

    if-ne v8, v10, :cond_12

    const/4 v13, 0x1

    goto :goto_c

    :cond_12
    move v13, v0

    :goto_c
    or-int/2addr v7, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_14

    if-ne v8, v1, :cond_13

    goto :goto_d

    :cond_13
    move-object/from16 v7, p0

    move-object/from16 v11, v26

    goto :goto_e

    :cond_14
    :goto_d
    new-instance v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;

    move-object/from16 v7, p0

    move-object/from16 v11, v26

    invoke-direct {v8, v7, v5, v3, v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/a;-><init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v8, Lkotlin/jvm/functions/Function1;

    move-object/from16 v5, v33

    invoke-static {v5, v8, v6, v0, v0}, Lsl0/j1;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, v34

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v12, v31

    invoke-static {v12, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v17, 0x6

    const/16 v18, 0xfe

    const/4 v7, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v36, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const-wide/16 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v35, v16

    move-object/from16 v16, v6

    move-object v6, v5

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v16

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    move-object/from16 v7, v32

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p1

    move/from16 v5, p5

    move-object v11, v1

    move-object v0, v6

    move/from16 v6, v21

    move-object/from16 v10, v26

    move-object/from16 v12, v27

    move/from16 v15, v31

    move-object/from16 v1, p0

    goto/16 :goto_8

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    move-object v6, v0

    move-object/from16 v26, v10

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v26

    goto :goto_f

    :cond_17
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v4, v10

    :goto_f
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lh00/i;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lh00/i;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e(Lnl0/d;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;IILjava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 10

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnl0/d$m;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v9}, Lnl0/d$m;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lsl0/a3;->d(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
