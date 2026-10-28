.class public abstract Lt61/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt61/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a3\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li2/x;",
        "color",
        "Ly3/f;",
        "size",
        "Lu61/b;",
        "shape",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;JFLu61/b;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lu61/b;JFFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt61/f;->d(Lu61/b;JFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;JFLu61/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lt61/f;->e(Landroidx/compose/ui/Modifier;JFLu61/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;JFLu61/b;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v4, p3

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x706475cb

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    const/16 v8, 0x20

    move-wide/from16 v11, p1

    if-nez v7, :cond_4

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v0, v4}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_6
    and-int/lit8 v7, p7, 0x8

    const/16 v9, 0x800

    if-eqz v7, :cond_7

    or-int/lit16 v5, v5, 0xc00

    goto :goto_6

    :cond_7
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_a

    if-nez p4, :cond_8

    const/4 v10, -0x1

    goto :goto_4

    :cond_8
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    :goto_4
    invoke-virtual {v0, v10}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_9

    move v10, v9

    goto :goto_5

    :cond_9
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v5, v10

    :cond_a
    :goto_6
    and-int/lit16 v10, v5, 0x493

    const/16 v13, 0x492

    const/4 v15, 0x0

    const/4 v14, 0x1

    if-eq v10, v13, :cond_b

    move v10, v14

    goto :goto_7

    :cond_b
    move v10, v15

    :goto_7
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v0, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_12

    if-eqz v1, :cond_c

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_8

    :cond_c
    move-object v1, v3

    :goto_8
    if-eqz v7, :cond_d

    sget-object v3, Lu61/b;->CIRCLE:Lu61/b;

    move-object v10, v3

    goto :goto_9

    :cond_d
    move-object/from16 v10, p4

    :goto_9
    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    int-to-float v2, v2

    invoke-interface {v7, v2}, Ly3/c;->q0(F)F

    move-result v13

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    invoke-interface {v2, v4}, Ly3/c;->q0(F)F

    move-result v2

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit16 v7, v5, 0x1c00

    if-ne v7, v9, :cond_e

    move v7, v14

    goto :goto_a

    :cond_e
    move v7, v15

    :goto_a
    and-int/lit8 v5, v5, 0x70

    if-ne v5, v8, :cond_f

    goto :goto_b

    :cond_f
    move v14, v15

    :goto_b
    or-int v5, v7, v14

    invoke-virtual {v0, v13}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_10

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_11

    :cond_10
    new-instance v9, Lt61/d;

    move v14, v2

    invoke-direct/range {v9 .. v14}, Lt61/d;-><init>(Lu61/b;JFF)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v9

    :cond_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v7, v0, v15}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v5, v10

    goto :goto_c

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object v1, v3

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Lt61/e;

    move-wide/from16 v2, p1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lt61/e;-><init>(Landroidx/compose/ui/Modifier;JFLu61/b;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(Lu61/b;JFFLk2/e;)Ll83/a0;
    .locals 14

    move/from16 v1, p3

    const-string v0, "$this$Canvas"

    move-object/from16 v2, p5

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt61/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v11, 0x2

    if-eq p0, v0, :cond_3

    if-eq p0, v11, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    invoke-interface {v2}, Lk2/e;->B0()J

    move-result-wide v0

    invoke-interface {v2}, Lk2/e;->t0()La3/p;

    move-result-object p0

    invoke-virtual {p0}, La3/p;->A()J

    move-result-wide v12

    invoke-virtual {p0}, La3/p;->w()Li2/v;

    move-result-object v3

    invoke-interface {v3}, Li2/v;->q()V

    :try_start_0
    iget-object v3, p0, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Laj/d;

    const/high16 v4, 0x42340000    # 45.0f

    invoke-virtual {v3, v4, v0, v1}, Laj/d;->v(FJ)V

    const/4 v10, 0x0

    const/16 v11, 0x7e

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, v2

    move-wide v2, p1

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v12, v13}, Ld;->z(La3/p;J)V

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    invoke-static {p0, v12, v13}, Ld;->z(La3/p;J)V

    throw v0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const/4 v10, 0x0

    const/16 v11, 0x7e

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v2, p1

    move-object/from16 v1, p5

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    goto/16 :goto_0

    :cond_2
    const/4 v8, 0x0

    const/16 v9, 0x7e

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-wide v2, p1

    move-object/from16 v1, p5

    invoke-static/range {v1 .. v9}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    goto/16 :goto_0

    :cond_3
    const/4 v9, 0x0

    const/16 v10, 0x7e

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-wide v3, p1

    move-object/from16 v2, p5

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    invoke-interface/range {p5 .. p5}, Lk2/e;->t0()La3/p;

    move-result-object p0

    invoke-virtual {p0}, La3/p;->A()J

    move-result-wide v2

    const/16 p0, 0x20

    shr-long v4, v2, p0

    long-to-int p0, v4

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    int-to-float v0, v11

    mul-float/2addr v0, v1

    cmpl-float p0, p0, v0

    if-lez p0, :cond_4

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    long-to-int p0, v2

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_4

    cmpg-float p0, v0, p4

    if-gez p0, :cond_4

    invoke-interface/range {p5 .. p5}, Lk2/e;->t0()La3/p;

    move-result-object p0

    iget-object p0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast p0, Laj/d;

    invoke-virtual {p0, v1, v1, v1, v1}, Laj/d;->o(FFFF)V

    const-wide v2, 0xff0b1f2bL

    :try_start_1
    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v3

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v2, p5

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface/range {p5 .. p5}, Lk2/e;->t0()La3/p;

    move-result-object p0

    iget-object p0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast p0, Laj/d;

    neg-float v0, v1

    invoke-virtual {p0, v0, v0, v0, v0}, Laj/d;->o(FFFF)V

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object p0, v0

    invoke-interface/range {p5 .. p5}, Lk2/e;->t0()La3/p;

    move-result-object v0

    iget-object v0, v0, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    neg-float v1, v1

    invoke-virtual {v0, v1, v1, v1, v1}, Laj/d;->o(FFFF)V

    throw p0

    :cond_4
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;JFLu61/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lt61/f;->c(Landroidx/compose/ui/Modifier;JFLu61/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
