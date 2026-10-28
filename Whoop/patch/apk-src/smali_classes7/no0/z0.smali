.class public abstract Lno0/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a!\u0010\u000f\u001a\u00020\u0004*\u00020\u000b2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Llo0/n0;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "d",
        "(Llo0/n0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Llo0/o0;",
        "step",
        "g",
        "(Llo0/o0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lk2/e;",
        "",
        "Li2/x;",
        "gradientColors",
        "i",
        "(Lk2/e;Ljava/util/List;)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Llo0/n0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/z0;->f(Llo0/n0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/z0;->e(Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llo0/o0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/z0;->h(Llo0/o0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Llo0/n0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, 0xb31ecf7

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v15, 0x4

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v15

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, v0, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v0, v8

    invoke-virtual {v12, v0, v5}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_6

    move-object v3, v0

    goto :goto_5

    :cond_6
    move-object v3, v4

    :goto_5
    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->Y()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    sget-wide v4, Li2/x;->m:J

    new-instance v9, Li2/x;

    invoke-direct {v9, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v6, v9}, [Li2/x;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_7

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v9, v6, :cond_8

    :cond_7
    new-instance v9, Lej1/s;

    const/4 v6, 0x3

    invoke-direct {v9, v4, v6}, Lej1/s;-><init>(Ljava/util/List;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v9}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v2

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v9, 0x0

    invoke-static {v4, v5, v9, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v4, 0x3

    int-to-float v4, v4

    mul-float v20, v4, v6

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v12, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v12, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    :cond_a
    invoke-static {v6, v12, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x17e95be0

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Llo0/n0;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v4, v7

    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v17, v4, 0x1

    const/4 v6, 0x0

    if-ltz v4, :cond_d

    check-cast v5, Llo0/o0;

    if-lez v4, :cond_c

    const v4, 0x1357b13f

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v8

    int-to-float v10, v15

    mul-float/2addr v4, v10

    invoke-static {v0, v9, v4, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v13, 0x6

    const/16 v14, 0xfe

    move-object v10, v3

    const/4 v3, 0x0

    move v11, v2

    move-object v2, v4

    const/4 v4, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move/from16 v20, v7

    move/from16 v21, v8

    const-wide/16 v7, 0x0

    move/from16 v23, v9

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    move/from16 v24, v11

    const/4 v11, 0x0

    move-object/from16 v15, v18

    move-object/from16 v1, v19

    move-object/from16 v18, v0

    move/from16 v0, v20

    invoke-static/range {v2 .. v14}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    move-object/from16 v18, v0

    move-object/from16 v22, v3

    move-object v15, v5

    move-object v1, v6

    move v0, v7

    move/from16 v23, v9

    const v2, 0x579f5f61

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    goto :goto_8

    :goto_9
    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v11, 0x2

    invoke-static {v15, v1, v12, v2, v11}, Lno0/z0;->g(Llo0/o0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    const/4 v15, 0x4

    move-object/from16 v1, p0

    move v7, v0

    move v2, v11

    move/from16 v4, v17

    move-object/from16 v0, v18

    move-object/from16 v3, v22

    move/from16 v9, v23

    goto :goto_7

    :cond_d
    move-object v1, v6

    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_e
    move-object/from16 v22, v3

    move v0, v7

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v4

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lno0/y0;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e(Ljava/util/List;Lk2/e;)Ll83/a0;
    .locals 1

    const-string v0, "$this$drawBehind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lno0/z0;->i(Lk2/e;Ljava/util/List;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llo0/n0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/z0;->d(Llo0/n0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llo0/o0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, -0xab14689

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v10, 0x12

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v6, v10, :cond_6

    move v6, v12

    goto :goto_5

    :cond_6
    move v6, v11

    :goto_5
    and-int/2addr v0, v12

    invoke-virtual {v7, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_7

    move-object v13, v0

    goto :goto_6

    :cond_7
    move-object v13, v5

    :goto_6
    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    const/4 v5, 0x0

    invoke-static {v4, v5, v3, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v3, v5, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_8

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    :cond_9
    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llo0/o0;->a()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v7, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v15, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move v0, v5

    move-wide v5, v8

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Llo0/o0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v7, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v15, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    float-to-double v8, v14

    const-wide/16 v15, 0x0

    cmpl-double v0, v8, v15

    if-lez v0, :cond_b

    move v11, v12

    :cond_b
    if-nez v11, :cond_c

    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_c
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v14, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v26, v0, 0x12

    const v27, 0x2fff8

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v0, v12

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_8

    :cond_d
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v5

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lno0/y0;

    const/4 v5, 0x1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final h(Llo0/o0;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/z0;->g(Llo0/o0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lk2/e;Ljava/util/List;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/e;",
            "Ljava/util/List<",
            "Li2/x;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v12

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const-wide v4, 0xffffffffL

    and-long/2addr v1, v4

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    sget-object v15, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    const/16 v2, 0xe

    move v6, v1

    invoke-static {v15, v11, v6, v6, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v1

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long/2addr v7, v3

    and-long v3, v9, v4

    or-long/2addr v3, v7

    const/4 v9, 0x0

    const/16 v10, 0xf6

    move-wide/from16 v18, v3

    move v4, v6

    move-wide/from16 v6, v18

    move v5, v2

    const-wide/16 v2, 0x0

    move v8, v4

    move/from16 v16, v5

    const-wide/16 v4, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v11, v17

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    iget-object v2, v1, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {v1, v11, v12}, Li2/j;->i(FF)V

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float/2addr v3, v12

    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v4, :cond_0

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_0
    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v11, v11, v3, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v5, 0x43340000    # 180.0f

    const/high16 v6, 0x42b40000    # 90.0f

    const/4 v7, 0x0

    invoke-virtual {v2, v4, v5, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    sub-float v4, v13, v12

    invoke-virtual {v1, v4, v11}, Li2/j;->h(FF)V

    sub-float v4, v13, v3

    iget-object v5, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v5, :cond_1

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_1
    iget-object v5, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5, v4, v11, v13, v3}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v5, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/high16 v8, 0x43870000    # 270.0f

    invoke-virtual {v2, v5, v8, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    sub-float v5, v14, v12

    invoke-virtual {v1, v13, v5}, Li2/j;->h(FF)V

    sub-float v5, v14, v3

    iget-object v8, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v8, :cond_2

    new-instance v8, Landroid/graphics/RectF;

    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    iput-object v8, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_2
    iget-object v8, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v8, v4, v5, v13, v14}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v11, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v1, v12, v14}, Li2/j;->h(FF)V

    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    if-nez v4, :cond_3

    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    :cond_3
    iget-object v4, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4, v11, v5, v3, v14}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v3, v1, Li2/j;->b:Landroid/graphics/RectF;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v6, v6, v7}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FFZ)V

    invoke-virtual {v1}, Li2/j;->f()V

    move-object/from16 v2, p1

    const/16 v5, 0xe

    invoke-static {v15, v2, v11, v11, v5}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    new-instance v3, Lk2/i;

    const/4 v4, 0x1

    int-to-float v4, v4

    invoke-interface {v0, v4}, Ly3/c;->q0(F)F

    move-result v4

    const/4 v8, 0x0

    const/16 v9, 0x1e

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v5, 0x34

    move-object v4, v3

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method
