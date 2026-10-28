.class public abstract Lbb2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lkd1/o;",
        "backgroundImage",
        "Lcom/whoop/design/util/TextResource;",
        "titleText",
        "subtitleText",
        "tag",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "ctaAction",
        "d",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "settings_release"
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

    invoke-static {p0}, Lbb2/b;->e(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JJLk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbb2/b;->f(JJLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lbb2/b;->g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move/from16 v10, p6

    const-string v1, "backgroundImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "titleText"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subtitleText"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "ctaAction"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v1, -0x1ce30ace

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_2

    and-int/lit8 v1, v10, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v10

    goto :goto_2

    :cond_2
    move v1, v10

    :goto_2
    and-int/lit8 v3, v10, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, v10, 0x40

    if-nez v3, :cond_3

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_3

    :cond_3
    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_3
    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_4

    :cond_4
    const/16 v3, 0x10

    :goto_4
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_8

    and-int/lit16 v3, v10, 0x200

    if-nez v3, :cond_6

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_5

    :cond_6
    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_5
    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_6

    :cond_7
    const/16 v3, 0x80

    :goto_6
    or-int/2addr v1, v3

    :cond_8
    and-int/lit16 v3, v10, 0xc00

    if-nez v3, :cond_b

    and-int/lit16 v3, v10, 0x1000

    if-nez v3, :cond_9

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_7

    :cond_9
    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_7
    if-eqz v3, :cond_a

    const/16 v3, 0x800

    goto :goto_8

    :cond_a
    const/16 v3, 0x400

    :goto_8
    or-int/2addr v1, v3

    :cond_b
    and-int/lit16 v3, v10, 0x6000

    if-nez v3, :cond_d

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    const/16 v3, 0x4000

    goto :goto_9

    :cond_c
    const/16 v3, 0x2000

    :goto_9
    or-int/2addr v1, v3

    :cond_d
    move v12, v1

    and-int/lit16 v1, v12, 0x2493

    const/16 v3, 0x2492

    if-eq v1, v3, :cond_e

    const/4 v1, 0x1

    goto :goto_a

    :cond_e
    const/4 v1, 0x0

    :goto_a
    and-int/lit8 v3, v12, 0x1

    invoke-virtual {v13, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_28

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    move/from16 v22, v12

    invoke-virtual {v5}, Ly81/i;->n()J

    move-result-wide v11

    invoke-virtual {v1, v13, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v14

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v2, v2

    move-object/from16 v25, v1

    mul-float v1, v2, v2

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v4, v11, v12, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    const v4, 0xe000

    and-int v4, v22, v4

    const/16 v5, 0x4000

    if-ne v4, v5, :cond_f

    const/4 v4, 0x1

    goto :goto_b

    :cond_f
    const/4 v4, 0x0

    :goto_b
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_10

    if-ne v5, v0, :cond_11

    :cond_10
    new-instance v5, La31/e;

    const/4 v4, 0x5

    invoke-direct {v5, v9, v4}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v31, v5

    check-cast v31, Lc93/a;

    const/16 v32, 0xf

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    move/from16 v27, v2

    sget-object v2, Ll0/m;->g:Ll0/h;

    move/from16 v28, v3

    const/16 v3, 0x36

    invoke-static {v2, v5, v13, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_12

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v13, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v3, v13, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v13, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-wide/from16 v19, v11

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v11, v3

    const-wide/16 v16, 0x0

    cmpl-double v7, v11, v16

    if-lez v7, :cond_15

    const/4 v4, 0x1

    goto :goto_d

    :cond_15
    const/4 v4, 0x0

    :goto_d
    const-string v38, "invalid weight; must be greater than zero"

    if-nez v4, :cond_16

    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_16
    const/4 v11, 0x1

    invoke-static {v3, v3, v11}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, Lb2/e;->w:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v12, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 v16, v4

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move/from16 v39, v7

    move-object/from16 v7, v16

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v29, v12

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_17

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_17
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v13, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_19

    :cond_18
    invoke-static {v3, v13, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v13, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0xc

    const/4 v11, 0x0

    invoke-static {v1, v1, v11, v11, v7}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v7

    invoke-static {v4, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13, v14, v15}, Lp1/q;->f(J)Z

    move-result v7

    move-wide/from16 v11, v19

    invoke-virtual {v13, v11, v12}, Lp1/q;->f(J)Z

    move-result v16

    or-int v7, v7, v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v7, :cond_1a

    if-ne v3, v0, :cond_1b

    :cond_1a
    new-instance v16, Lbb2/a;

    const/16 v21, 0x0

    move-wide/from16 v19, v11

    move-wide/from16 v17, v14

    invoke-direct/range {v16 .. v21}, Lbb2/a;-><init>(JJI)V

    move-object/from16 v3, v16

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v3}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v0, Lkd1/o;->a:I

    and-int/lit8 v3, v22, 0xe

    or-int v4, v0, v3

    move-object v0, v5

    const/4 v5, 0x3

    move v3, v1

    const/4 v1, 0x0

    move-object v11, v2

    const/4 v2, 0x0

    const/16 v23, 0x0

    const/high16 v26, 0x3f800000    # 1.0f

    move-object v12, v11

    move/from16 v40, v27

    move v11, v3

    move-object v3, v13

    move-object v13, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    move-object/from16 v30, v3

    const/16 v19, 0x6030

    const/16 v20, 0x68

    move-object v0, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    sget-object v15, Ly2/j;->a:Ly2/b1;

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v2, v13

    move-object v13, v7

    move-object v7, v2

    move-object v5, v0

    move v4, v11

    move/from16 v3, v23

    move-object/from16 v0, v25

    move/from16 v2, v28

    move-object/from16 v41, v29

    move-object/from16 v18, v30

    move-object v11, v1

    move/from16 v1, v22

    invoke-static/range {v11 .. v20}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v18

    if-nez p3, :cond_1c

    const v11, -0x74dac2a

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    move/from16 p5, v1

    move/from16 v42, v4

    move-object v1, v9

    move-object v4, v10

    move v9, v3

    move-object v3, v8

    const/4 v8, 0x1

    goto/16 :goto_10

    :cond_1c
    const v11, -0x74dac29

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v11, v11

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v12, v41

    invoke-static {v12, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_1d

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v13, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_1e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1f

    :cond_1e
    invoke-static {v14, v13, v14, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v13, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v19, Lhy0/o1;->HOLIDAY:Lhy0/o1;

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v11

    const/high16 v3, 0x30000000

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v3, v14

    shr-int/lit8 v14, v1, 0x9

    and-int/lit8 v14, v14, 0xe

    or-int v34, v3, v14

    const/16 v36, 0x0

    const v37, 0x7ffdf6

    move-object v3, v9

    move-object/from16 v16, v10

    const-wide/16 v9, 0x0

    move-object/from16 v30, v13

    move-wide v12, v11

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v27, v26

    const/16 v26, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v33, v30

    const/16 v30, 0x0

    move-object/from16 v32, v31

    const/16 v31, 0x0

    move-object/from16 v35, v32

    const/16 v32, 0x0

    move-object/from16 v42, v35

    const/16 v35, 0x0

    move-object/from16 p5, v42

    move/from16 v42, v4

    move-object/from16 v4, p5

    move/from16 p5, v1

    move-object v1, v3

    move-object v3, v8

    move-object/from16 v8, p3

    invoke-static/range {v8 .. v37}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v13, v33

    const/4 v8, 0x1

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/4 v11, 0x2

    int-to-float v11, v11

    mul-float v11, v11, v40

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v14, v10, v13, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_20

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_20
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v13, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_21

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_22

    :cond_21
    invoke-static {v8, v13, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v13, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-lez v39, :cond_23

    const/4 v14, 0x1

    goto :goto_12

    :cond_23
    const/4 v14, 0x0

    :goto_12
    if-nez v14, :cond_24

    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_24
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-direct {v8, v9, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->M:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    invoke-static {v10, v9, v13, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_25

    invoke-virtual {v13, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_25
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v13, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_26

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    :cond_26
    invoke-static {v10, v13, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v3, p5, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v3, v1

    move-object/from16 v6, p1

    invoke-static {v6, v13, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v3, "toUpperCase(...)"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v0, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->r()Lb91/a;

    move-result-object v28

    const/4 v3, 0x1

    int-to-float v5, v3

    mul-float v20, v5, v40

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v32, v5, 0x12

    const v33, 0x2fff8

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x30

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    move/from16 v5, v32

    const/4 v7, 0x6

    shr-int/lit8 v8, p5, 0x6

    and-int/lit8 v8, v8, 0xe

    or-int/2addr v1, v8

    move-object/from16 v8, p2

    invoke-static {v8, v13, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v0, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->d()Lb91/a;

    move-result-object v28

    new-instance v9, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v9, v12}, Lw3/k;-><init>(I)V

    or-int/lit16 v5, v5, 0xc30

    const v33, 0x2d5fa

    move-object/from16 v20, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    const/16 v23, 0x2

    const/16 v25, 0x3

    const/16 v31, 0x0

    move-object v8, v1

    move/from16 v32, v5

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/i0;->n()I

    move-result v1

    invoke-static {v1, v13, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    move/from16 v11, v42

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v11

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_28
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_29

    new-instance v0, Laq1/c;

    const/4 v7, 0x2

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v2, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(JJLk2/c;)Ll83/a0;
    .locals 11

    const-string v1, "$this$drawWithContent"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    new-instance v2, Li2/x;

    invoke-direct {v2, p0, p1}, Li2/x;-><init>(J)V

    new-instance v3, Li2/x;

    invoke-direct {v3, p2, p3}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v3, p4

    check-cast v3, La3/p0;

    iget-object v4, v3, La3/p0;->w:Lk2/b;

    invoke-interface {v4}, Lk2/e;->d()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    const/high16 v6, 0x3f000000    # 0.5f

    mul-float/2addr v5, v6

    invoke-interface {v4}, Lk2/e;->d()J

    move-result-wide v9

    and-long v6, v9, v7

    long-to-int v4, v6

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/16 v6, 0x8

    invoke-static {v1, v2, v5, v4, v6}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v1

    invoke-virtual {v3}, La3/p0;->a()V

    const/4 v8, 0x0

    const/16 v9, 0x7e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lbb2/b;->d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
