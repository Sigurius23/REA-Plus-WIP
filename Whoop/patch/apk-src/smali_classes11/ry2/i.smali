.class public abstract Lry2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "",
        "isEnabled",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "whooplabs_release"
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/i;->d(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lry2/i;->e(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p1

    move-object/from16 v0, p3

    move/from16 v2, p5

    const-string v3, "text"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onClick"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v3, 0x6976be09

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v13, v1}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v3, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v2, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :goto_5
    and-int/lit16 v10, v2, 0xc00

    if-nez v10, :cond_9

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_6

    :cond_8
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v3, v10

    :cond_9
    and-int/lit16 v10, v3, 0x493

    const/16 v12, 0x492

    const/4 v14, 0x0

    if-eq v10, v12, :cond_a

    const/4 v10, 0x1

    goto :goto_7

    :cond_a
    move v10, v14

    :goto_7
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v13, v12, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_13

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_b

    move-object v7, v10

    goto :goto_8

    :cond_b
    move-object v7, v9

    :goto_8
    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v16, v7

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    int-to-float v5, v5

    mul-float/2addr v7, v5

    invoke-static {v12, v7, v6, v7, v7}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v12, v13, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_9
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v13, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :cond_d
    invoke-static {v11, v13, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v1, :cond_f

    const v6, -0x1e6bb4a5

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v5

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_a
    move-object/from16 v20, v5

    goto :goto_b

    :cond_f
    const v6, -0x1e6a86c2

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X0()J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v5

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v5, 0x10

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float v19, v5, v6

    sget-object v5, Lg1/v0;->a:Ll0/l1;

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->V0()J

    move-result-wide v7

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->X0()J

    move-result-wide v11

    invoke-virtual {v5, v13, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v5

    move v15, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move-wide/from16 v23, v9

    move-wide v9, v5

    move-wide v5, v7

    move-wide/from16 v7, v23

    move-object/from16 v18, v16

    const/16 v1, 0x800

    invoke-static/range {v5 .. v15}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v7

    and-int/lit16 v5, v3, 0x1c00

    if-ne v5, v1, :cond_10

    const/4 v14, 0x1

    goto :goto_c

    :cond_10
    const/4 v14, 0x0

    :goto_c
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_11

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_12

    :cond_11
    new-instance v1, Lry2/g;

    const/4 v15, 0x0

    invoke-direct {v1, v0, v15}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v1, Lc93/a;

    and-int/lit8 v5, v3, 0x70

    or-int/lit8 v5, v5, 0x6

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v6, 0x12

    or-int/2addr v5, v6

    const/high16 v6, 0x380000

    shl-int/lit8 v3, v3, 0x12

    and-int/2addr v3, v6

    or-int v15, v5, v3

    const/16 v16, 0x6

    const/16 v17, 0x193c

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v6, p0

    move-object v14, v13

    move/from16 v10, v19

    move-object/from16 v9, v20

    move-object/from16 v0, v21

    move-object v13, v1

    move/from16 v1, p1

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v13, v14

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    move-object/from16 v5, v18

    goto :goto_d

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v5, v9

    :goto_d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lry2/h;

    const/4 v3, 0x0

    move-object/from16 v4, p0

    move/from16 v7, p1

    move-object/from16 v6, p3

    move/from16 v1, p5

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lry2/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
