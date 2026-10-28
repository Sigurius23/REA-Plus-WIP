.class public abstract Lat2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a?\u0010\u0005\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "primaryAction",
        "secondaryAction",
        "backAction",
        "h",
        "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lat2/d;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lat2/d;->o(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d;->l(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lat2/d;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lat2/d;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d;->m(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/d;->n(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x3e19fcdf

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v2

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, p5, 0x2

    const/16 v7, 0x20

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    move v9, v7

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :goto_3
    and-int/lit8 v9, p5, 0x4

    const/16 v10, 0x100

    if-eqz v9, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    move v12, v10

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v5, 0x93

    const/16 v13, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_9

    move v12, v15

    goto :goto_6

    :cond_9
    move v12, v14

    :goto_6
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_19

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_a

    new-instance v1, Lal0/i;

    const/16 v3, 0x1b

    invoke-direct {v1, v3}, Lal0/i;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lc93/a;

    goto :goto_7

    :cond_b
    move-object v1, v3

    :goto_7
    if-eqz v6, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_c

    new-instance v3, Lal0/i;

    const/16 v6, 0x1c

    invoke-direct {v3, v6}, Lal0/i;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lc93/a;

    goto :goto_8

    :cond_d
    move-object v3, v8

    :goto_8
    if-eqz v9, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_e

    new-instance v6, Lal0/i;

    const/16 v8, 0x1d

    invoke-direct {v6, v8}, Lal0/i;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lc93/a;

    move-object v11, v6

    :cond_f
    new-instance v16, Lsz0/p0$b;

    sget v6, Lks2/a;->g:I

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lks2/a;->d:I

    invoke-static {v0, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v8, Lks2/a;->e:I

    invoke-static {v0, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v9, Lks2/a;->f:I

    invoke-static {v0, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit8 v13, v5, 0xe

    if-ne v13, v2, :cond_10

    move v2, v15

    goto :goto_9

    :cond_10
    move v2, v14

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v2, :cond_11

    if-ne v13, v12, :cond_12

    :cond_11
    new-instance v13, Lat2/b;

    const/4 v2, 0x0

    invoke-direct {v13, v1, v2}, Lat2/b;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v13, Lc93/a;

    and-int/lit8 v2, v5, 0x70

    if-ne v2, v7, :cond_13

    move v2, v15

    goto :goto_a

    :cond_13
    move v2, v14

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_14

    if-ne v7, v12, :cond_15

    :cond_14
    new-instance v7, Lat2/b;

    const/4 v2, 0x1

    invoke-direct {v7, v3, v2}, Lat2/b;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v7, Lc93/a;

    const/high16 v2, 0x30000

    sget v17, Lsz0/p0$b;->h:I

    or-int v2, v17, v2

    sget v17, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v17, 0x3

    or-int v2, v2, v18

    shl-int/lit8 v18, v17, 0x9

    or-int v2, v2, v18

    shl-int/lit8 v17, v17, 0x15

    or-int v18, v2, v17

    const/16 v19, 0x0

    const/16 v20, 0xe44

    move-object v2, v12

    move-object v12, v9

    move-object v9, v13

    move-object v13, v7

    const/4 v7, 0x0

    move/from16 v17, v10

    const/4 v10, 0x1

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v24, v5

    move-object/from16 v5, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    move-object/from16 v17, v0

    move-object/from16 v0, v21

    move-object/from16 v21, v1

    move/from16 v1, v25

    move-object/from16 v25, v2

    move/from16 v2, v24

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    and-int/lit16 v2, v2, 0x380

    if-ne v2, v1, :cond_16

    const/4 v14, 0x1

    goto :goto_b

    :cond_16
    const/4 v14, 0x0

    :goto_b
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_17

    move-object/from16 v2, v25

    if-ne v1, v2, :cond_18

    :cond_17
    new-instance v1, Lat2/b;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lat2/b;-><init>(Lc93/a;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v1, Lc93/a;

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static {v1, v2, v5, v2, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    move-object/from16 v1, v21

    move-object v3, v0

    goto :goto_c

    :cond_19
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v8

    move-object v3, v11

    :goto_c
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lat2/c;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lat2/c;-><init>(Lc93/a;Lc93/a;Lc93/a;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lat2/d;->h(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
