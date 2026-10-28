.class public abstract Lw71/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\n\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "",
        "timeString",
        "",
        "isSubQuestion",
        "enabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "tapAction",
        "d",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw71/b0;->e(Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw71/b0;->g(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw71/b0;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p6

    const-string v1, "question"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "timeString"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tapAction"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    const v1, 0x568b3f50

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move/from16 v3, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_4

    move/from16 v3, p2

    invoke-virtual {v4, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_8

    invoke-virtual {v4, v8}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x800

    goto :goto_5

    :cond_7
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v1, v5

    :cond_8
    and-int/lit16 v5, v10, 0x6000

    if-nez v5, :cond_a

    invoke-virtual {v4, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x4000

    goto :goto_6

    :cond_9
    const/16 v5, 0x2000

    :goto_6
    or-int/2addr v1, v5

    :cond_a
    and-int/lit16 v5, v1, 0x2493

    const/16 v6, 0x2492

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_b

    move v5, v12

    goto :goto_7

    :cond_b
    move v5, v11

    :goto_7
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1d

    if-eqz v2, :cond_c

    move/from16 v23, v11

    goto :goto_8

    :cond_c
    move/from16 v23, v3

    :goto_8
    sget-object v2, Lw71/c;->a:Lw71/c;

    if-eqz v23, :cond_d

    invoke-virtual {v2}, Lw71/c;->b()F

    move-result v2

    :goto_9
    move v14, v2

    goto :goto_a

    :cond_d
    invoke-virtual {v2}, Lw71/c;->a()F

    move-result v2

    goto :goto_9

    :goto_a
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x6

    if-lez v2, :cond_e

    const v2, -0x1f4726c8

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X()J

    move-result-wide v2

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_b
    move-wide/from16 v19, v2

    goto :goto_c

    :cond_e
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_f

    const v2, -0x1f471efd

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j()J

    move-result-wide v2

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    const v2, -0x1f4717c8

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/b;->a:Lx81/b;

    invoke-virtual {v2, v4, v3}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v2

    invoke-virtual {v2}, Ly81/a;->d()J

    move-result-wide v2

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->g:Ll0/h;

    const/16 v6, 0x36

    invoke-static {v5, v3, v4, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_10

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_10
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_d
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v4, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_11
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x40000000    # 2.0f

    float-to-double v5, v2

    const-wide/16 v16, 0x0

    cmpl-double v5, v5, v16

    const-string v18, "invalid weight; must be greater than zero"

    if-lez v5, :cond_13

    goto :goto_e

    :cond_13
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v21, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v2, v21

    if-lez v6, :cond_14

    move/from16 v2, v21

    :cond_14
    invoke-direct {v5, v2, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v2, Lb2/e;->M:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v6, v2, v4, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 v22, v13

    iget-wide v12, v4, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-eqz v0, :cond_15

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    move-object/from16 v0, v22

    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v4, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v15, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    invoke-static {v12, v4, v12, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v4, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v1, 0xe

    move-object v1, v6

    const/16 v6, 0xe

    move-object v2, v1

    const/4 v1, 0x0

    move-object v12, v2

    const/4 v2, 0x0

    move-object v13, v3

    const/4 v3, 0x0

    move-object v10, v12

    move-object v12, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    cmpl-double v1, v1, v16

    if-lez v1, :cond_18

    goto :goto_10

    :cond_18
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_10
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v21

    if-lez v2, :cond_19

    move/from16 v0, v21

    :cond_19
    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->O:Lb2/k;

    const/16 v3, 0x30

    invoke-static {v10, v0, v4, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1a

    invoke-virtual {v4, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v4, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_1b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    :cond_1b
    invoke-static {v3, v4, v3, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v4, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lp00/f;

    invoke-direct {v0, v9, v7, v8}, Lp00/f;-><init>(Lc93/a;Ljava/lang/String;Z)V

    const v1, -0x5e562d38

    invoke-static {v1, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v21, 0x6000

    const/16 v22, 0xd

    const-wide/16 v11, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    move-wide/from16 v13, v19

    move-object/from16 v19, v0

    move v0, v2

    move-object/from16 v20, v4

    invoke-static/range {v11 .. v22}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move/from16 v3, v23

    goto :goto_12

    :cond_1d
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1e

    new-instance v0, Lep1/p;

    const/16 v8, 0xf

    move-object/from16 v1, p0

    move/from16 v4, p3

    move/from16 v6, p6

    move-object v2, v7

    move-object v5, v9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZLc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final e(Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 19

    move-object/from16 v0, p2

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v5, p4, 0x1

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    const v1, -0x217fb584

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    sget v1, Lgy0/f;->z2:I

    invoke-static {v6, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p0

    :goto_1
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    new-instance v10, Lny0/v0$c;

    sget-object v1, Lny0/e1;->FLEXIBLE:Lny0/e1;

    const/4 v5, 0x0

    invoke-direct {v10, v1, v5, v4, v5}, Lny0/v0$c;-><init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    move v11, v2

    goto :goto_2

    :cond_2
    move v11, v3

    :goto_2
    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Lry2/g;

    const/16 v1, 0x16

    invoke-direct {v2, v0, v1}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v15, v2

    check-cast v15, Lc93/a;

    const/16 v17, 0x0

    const/16 v18, 0x18d

    move-object/from16 v16, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v12, p1

    invoke-static/range {v6 .. v18}, Lny0/u0;->q(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    move-object/from16 v16, v6

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lw71/b0;->d(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
