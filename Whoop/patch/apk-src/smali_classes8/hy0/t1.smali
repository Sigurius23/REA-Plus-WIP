.class public abstract Lhy0/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a?\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ly3/f;",
        "arrowOffset",
        "Lcom/whoop/design/util/TextResource;",
        "informationText",
        "Lhy0/s1;",
        "tooltipArrowDirection",
        "title",
        "Lhy0/a;",
        "cta",
        "Ll83/a0;",
        "d",
        "(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "icon",
        "e",
        "(IFLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(IFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhy0/t1;->f(IFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhy0/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lhy0/t1;->g(Lhy0/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lhy0/t1;->h(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "informationText"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tooltipArrowDirection"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v4, -0x736bc87f

    invoke-virtual {v0, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_1
    move v4, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {v0, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0xc00

    :cond_6
    move-object/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_6

    move-object/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_4

    :cond_8
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0x6000

    :cond_9
    move-object/from16 v10, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit16 v11, v4, 0x2493

    const/16 v12, 0x2492

    const/4 v14, 0x0

    if-eq v11, v12, :cond_c

    const/4 v11, 0x1

    goto :goto_8

    :cond_c
    move v11, v14

    :goto_8
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_20

    const/4 v11, 0x0

    if-eqz v7, :cond_d

    move-object v7, v11

    goto :goto_9

    :cond_d
    move-object v7, v8

    :goto_9
    if-eqz v9, :cond_e

    move-object v10, v11

    :cond_e
    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move/from16 v33, v4

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p3, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_b

    :cond_10
    move-object/from16 p3, v10

    :goto_b
    invoke-static {v5, v0, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lhy0/s1;->UP:Lhy0/s1;

    if-ne v3, v5, :cond_12

    const v5, -0xd13899f

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/k0;->e()I

    move-result v5

    shl-int/lit8 v10, v33, 0x3

    and-int/lit8 v10, v10, 0x70

    invoke-static {v5, v1, v0, v10}, Lhy0/t1;->e(IFLandroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x0

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v5, 0x1

    goto :goto_d

    :cond_12
    const/4 v5, 0x0

    const v10, -0xd115689

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    int-to-float v10, v5

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float v17, v10, v12

    invoke-static/range {v17 .. v17}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v15, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v5, Lx81/d;->a:Lx81/d;

    move/from16 v16, v12

    const/4 v12, 0x6

    invoke-virtual {v5, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    move-object/from16 p4, v13

    invoke-virtual/range {v18 .. v18}, Ly81/i;->w()J

    move-result-wide v12

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v12, v13, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v10, 0x3

    if-eqz p3, :cond_13

    int-to-float v12, v10

    mul-float v12, v12, v16

    goto :goto_e

    :cond_13
    mul-float v12, v16, v16

    :goto_e
    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v12, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object v13, v11

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v16, v13

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_14

    move-object/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_14
    move-object/from16 v13, p4

    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v0, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v12, v16

    invoke-static {v0, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {v10, v0, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v0, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-static {v8, v9, v0, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_17

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v0, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_18

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v1, v0, v1, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v0, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v7, :cond_1a

    const v1, -0xc1b8e30

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    move-object/from16 v1, p3

    move-object/from16 p3, v7

    move v3, v13

    move-object v6, v15

    move/from16 v4, v17

    const/16 v35, 0x3

    move-object v7, v0

    const/4 v0, 0x6

    goto/16 :goto_11

    :cond_1a
    const/4 v13, 0x0

    const v1, -0xc1b8e2f

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    move-object v8, v7

    invoke-static {v8, v0, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v1, 0x6

    invoke-virtual {v5, v0, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v27

    const/16 v18, 0x0

    const/16 v20, 0x7

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v6, v15

    move/from16 v4, v19

    invoke-virtual {v5, v0, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fff8

    const-wide/16 v11, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x1

    const-wide/16 v20, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    const/16 v26, 0x3

    const/16 v23, 0x0

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v35, v30

    const/16 v30, 0x30

    move/from16 v36, v1

    move-object/from16 v1, p3

    move-object/from16 p3, v8

    move-object v8, v3

    move/from16 v3, v29

    move-object/from16 v29, v0

    move/from16 v0, v36

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_11
    shr-int/lit8 v8, v33, 0x3

    and-int/lit8 v8, v8, 0xe

    invoke-static {v2, v7, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v7, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object/from16 v29, v7

    move-object v7, v8

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    if-nez v1, :cond_1b

    const v0, -0xc117780

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v0, 0x1

    goto :goto_13

    :cond_1b
    const v0, -0xc11777f

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    sget-object v8, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v1}, Lhy0/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v17, v4

    move-object v15, v6

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v4, v6, :cond_1c

    sget-object v4, Lhy0/t1$a;->w:Lhy0/t1$a;

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_1d

    if-ne v10, v6, :cond_1e

    :cond_1d
    new-instance v10, Lhy0/l;

    const/4 v4, 0x3

    invoke-direct {v10, v1, v4}, Lhy0/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v19, v10

    check-cast v19, Lkotlin/jvm/functions/Function1;

    const/16 v22, 0x0

    const/16 v23, 0xfb8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x36

    move-object/from16 v20, v7

    move-object v7, v0

    invoke-static/range {v7 .. v23}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v20

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    sget-object v0, Lhy0/s1;->DOWN:Lhy0/s1;

    move-object/from16 v4, p2

    if-ne v4, v0, :cond_1f

    const v0, -0xcfa8bc1

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->d()I

    move-result v0

    shl-int/lit8 v5, v33, 0x3

    and-int/lit8 v5, v5, 0x70

    move/from16 v6, p0

    invoke-static {v0, v6, v7, v5}, Lhy0/t1;->e(IFLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_14
    const/4 v0, 0x1

    goto :goto_15

    :cond_1f
    move/from16 v6, p0

    const v0, -0xcf85129

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object/from16 v8, p3

    move-object v5, v1

    goto :goto_16

    :cond_20
    move-object v7, v0

    move v6, v1

    move-object v4, v3

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v5, v10

    :goto_16
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_21

    new-instance v0, Lc51/b;

    move-object v4, v8

    const/4 v8, 0x3

    move-object/from16 v3, p2

    move/from16 v7, p7

    move v1, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v8}, Lc51/b;-><init>(FLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method public static final e(IFLandroidx/compose/runtime/Composer;I)V
    .locals 8

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x3dd38636

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    const/4 v1, 0x2

    if-nez p2, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->e(I)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr p2, v2

    :cond_3
    and-int/lit8 v2, p2, 0x13

    const/16 v3, 0x12

    if-eq v2, v3, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    and-int/lit8 v3, p2, 0x1

    invoke-virtual {v5, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    const/4 v2, 0x6

    or-int/2addr p2, v2

    invoke-static {p0, v5, p2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object p2

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    invoke-static {v3, p1, v4, v1}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v0, v0

    mul-float v4, v0, v0

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v3, v4, v1}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v3

    const/16 v6, 0x30

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move-object v0, p2

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lc30/a;

    invoke-direct {v0, p0, p1, p3}, Lc30/a;-><init>(IFI)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final f(IFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhy0/t1;->e(IFLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lhy0/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhy0/a;->b()Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lhy0/t1;->d(FLcom/whoop/design/util/TextResource;Lhy0/s1;Lcom/whoop/design/util/TextResource;Lhy0/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
