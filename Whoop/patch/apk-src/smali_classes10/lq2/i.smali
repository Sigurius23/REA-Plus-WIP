.class public abstract Llq2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aK\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lkd1/o;",
        "image",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onExitPress",
        "g",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "showLogo",
        "showRefreshButton",
        "onRefreshPress",
        "j",
        "(Lkd1/o;Lc93/a;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "user-journey_release"
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

    invoke-static {}, Llq2/i;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Llq2/i;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Llq2/i;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llq2/i;->i(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkd1/o;Lc93/a;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Llq2/i;->n(Lkd1/o;Lc93/a;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkd1/o;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Llq2/i;->m(Lkd1/o;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p4

    const-string v1, "image"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "title"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v1, -0x3ef000ef    # -8.999772f

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v7, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v7

    goto :goto_2

    :cond_2
    move v1, v7

    :goto_2
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_5

    and-int/lit8 v3, v7, 0x40

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
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    :goto_5
    move v8, v1

    goto :goto_7

    :cond_7
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_6

    :cond_8
    const/16 v5, 0x80

    :goto_6
    or-int/2addr v1, v5

    goto :goto_5

    :goto_7
    and-int/lit16 v1, v8, 0x93

    const/16 v5, 0x92

    if-eq v1, v5, :cond_9

    const/4 v1, 0x1

    goto :goto_8

    :cond_9
    const/4 v1, 0x0

    :goto_8
    and-int/lit8 v5, v8, 0x1

    invoke-virtual {v13, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_17

    if-eqz v3, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_a

    new-instance v1, Llq2/h;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Llq2/h;-><init>(I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lc93/a;

    move-object/from16 v34, v1

    goto :goto_9

    :cond_b
    move-object/from16 v34, v4

    :goto_9
    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v5, v4, v13, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_c
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v13, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v11, v13, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v13, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v1

    const-wide/16 v16, 0x0

    cmpl-double v2, v2, v16

    if-lez v2, :cond_f

    const/4 v2, 0x1

    goto :goto_b

    :cond_f
    const/4 v2, 0x0

    :goto_b
    if-nez v2, :cond_10

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_10
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v11, 0x1

    invoke-direct {v2, v1, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/16 v3, 0x36

    invoke-static {v1, v4, v13, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v3, v13, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v13, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v3, v13, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v13, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v1, 0x3ffc000000000000L    # 1.75

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    mul-float v17, v3, v2

    const/16 v18, 0x0

    const/16 v19, 0xa

    const/16 v16, 0x0

    move-object v11, v15

    move v15, v1

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0xa

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v15, v3

    mul-float/2addr v2, v15

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lt0/j;->a:Lt0/i;

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget v1, Lkd1/o;->a:I

    and-int/lit8 v2, v8, 0xe

    or-int v4, v1, v2

    move-object v1, v5

    const/4 v5, 0x3

    move-object v2, v1

    const/4 v1, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v37, v13

    move-object v13, v3

    move-object/from16 v3, v37

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    sget v0, Lyp2/c;->s:I

    invoke-static {v3, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object v2, v10

    move-object/from16 v10, v16

    const/16 v16, 0x6000

    const/16 v17, 0x68

    move-object v4, v11

    const/4 v11, 0x0

    move-object v5, v12

    sget-object v12, Ly2/j;->b:Ly2/b1;

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 p2, v9

    move-object v9, v0

    move-object/from16 v0, p2

    move/from16 p2, v8

    move/from16 v35, v15

    move-object/from16 v36, v19

    move-object v8, v1

    move-object v15, v3

    const/4 v1, 0x0

    move-object v3, v2

    move-object/from16 v2, v18

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v15

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v13, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    move-object/from16 v10, v36

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_14

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v13, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    invoke-static {v8, v13, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v13, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    mul-float v0, v0, v35

    invoke-static {v0, v10}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/u;->g()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v13, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v11

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object/from16 v19, v10

    move-object v10, v0

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    int-to-float v4, v0

    mul-float v16, v4, v35

    const/16 v18, 0x0

    move-object/from16 v14, v19

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v4, v14

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v8, p2, 0x3

    and-int/lit8 v8, v8, 0xe

    or-int/2addr v5, v8

    invoke-static {v6, v13, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v13, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->r()Lb91/a;

    move-result-object v28

    invoke-virtual {v1, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v10

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v32, v2, 0x12

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

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    const/16 v2, 0xc

    int-to-float v2, v2

    mul-float v2, v2, v35

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v4, "UserJourneyBackButton"

    invoke-static {v2, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v14, Lny0/o;

    sget-object v15, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {v1}, Lyb0/f;->a(Lx81/d;)I

    move-result v16

    const/16 v25, 0x3dc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lyp2/c;->i:I

    invoke-static {v13, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget v1, Lny0/o;->k:I

    or-int/lit16 v1, v1, 0x180

    const v2, 0xe000

    shl-int/lit8 v3, p2, 0x6

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const/16 v15, 0x8

    const/4 v11, 0x0

    move-object v8, v14

    move-object/from16 v12, v34

    move v14, v1

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v12, v4

    :goto_e
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Ll72/h;

    const/16 v3, 0x17

    move-object/from16 v4, p0

    move/from16 v2, p5

    move-object v5, v6

    move v1, v7

    move-object v6, v12

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llq2/i;->g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lkd1/o;Lc93/a;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd1/o;",
            "Lc93/a;",
            "ZZ",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "image"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x434ec6e4

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_7

    :cond_b
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v0, v10

    :goto_8
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v0, v0, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_9

    :cond_e
    const/16 v13, 0x2000

    :goto_9
    or-int/2addr v0, v13

    :goto_a
    and-int/lit16 v13, v0, 0x2493

    const/16 v14, 0x2492

    const/4 v2, 0x0

    if-eq v13, v14, :cond_f

    const/4 v13, 0x1

    goto :goto_b

    :cond_f
    move v13, v2

    :goto_b
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v12, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1a

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_10

    new-instance v3, Llj1/b;

    const/16 v4, 0x1d

    invoke-direct {v3, v4}, Llj1/b;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lc93/a;

    goto :goto_c

    :cond_11
    move-object v3, v4

    :goto_c
    if-eqz v5, :cond_12

    const/4 v7, 0x1

    :cond_12
    if-eqz v8, :cond_13

    move v4, v2

    goto :goto_d

    :cond_13
    move v4, v9

    :goto_d
    if-eqz v10, :cond_15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_14

    new-instance v5, Llq2/h;

    const/4 v8, 0x0

    invoke-direct {v5, v8}, Llq2/h;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v5, Lc93/a;

    goto :goto_e

    :cond_15
    move-object v5, v11

    :goto_e
    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lb2/e;->E:Lb2/m;

    invoke-static {v10, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_16

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_16
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_18

    :cond_17
    invoke-static {v11, v12, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v12, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x0

    const/4 v10, 0x3

    invoke-static {v8, v10}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v8

    new-instance v11, Lb30/a1;

    const/16 v13, 0x1c

    invoke-direct {v11, v1, v13}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v13, 0x6b237a

    invoke-static {v13, v12, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    shr-int/lit8 v13, v0, 0x6

    and-int/lit8 v13, v13, 0xe

    const v14, 0x30180

    or-int/2addr v14, v13

    const/16 v15, 0x1a

    move-object v13, v9

    move-object v9, v8

    const/4 v8, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v13

    move-object v13, v12

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v2, v18

    invoke-static/range {v7 .. v15}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move v15, v7

    move-object v12, v13

    const/16 v7, 0xc

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-string v9, "UserJourneyBackButton"

    invoke-static {v8, v9}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v8, Lb2/e;->z:Lb2/m;

    sget-object v10, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v10, v2, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/4 v8, 0x3

    int-to-float v8, v8

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v23, v8, v11

    move/from16 v20, v23

    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v21, Lny0/o;

    sget-object v22, Lny0/q$a;->f:Lny0/q$a;

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11}, Lyb0/f;->a(Lx81/d;)I

    move-result v23

    const/16 v32, 0x3dc

    const/16 v33, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v21 .. v33}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v22

    sget v11, Lyp2/c;->i:I

    invoke-static {v12, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    sget v13, Lny0/o;->k:I

    or-int/lit16 v14, v13, 0x180

    shl-int/lit8 v17, v0, 0x9

    const v18, 0xe000

    and-int v17, v17, v18

    or-int v14, v14, v17

    move/from16 v17, v13

    move v13, v14

    const/4 v14, 0x0

    move/from16 v19, v0

    move-object v0, v10

    move-object v10, v8

    move-object v8, v11

    move-object v11, v3

    move v3, v7

    move-object/from16 v7, v21

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v35, v11

    if-eqz v4, :cond_19

    const v7, 0x7b0acb96

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->F:Lb2/m;

    invoke-virtual {v0, v2, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v24, 0x0

    const/16 v25, 0xb

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v23, v20

    move-object/from16 v20, v0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "UserJourneyRefreshButton"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v22, Lny0/o;

    sget v24, Lyp2/a;->b:I

    const/16 v33, 0x3dc

    const/16 v34, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x1

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v23, v16

    invoke-direct/range {v22 .. v34}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lyp2/c;->t:I

    invoke-static {v12, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    and-int v0, v19, v18

    or-int v13, v17, v0

    const/4 v14, 0x4

    const/4 v9, 0x0

    move-object v11, v5

    move-object/from16 v7, v22

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    move-object v11, v5

    const/4 v0, 0x0

    const v2, 0x7b138a20

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move v3, v15

    move-object/from16 v2, v35

    :goto_12
    move-object v5, v11

    goto :goto_13

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v7

    move v4, v9

    goto :goto_12

    :goto_13
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, Lep1/p;

    const/16 v8, 0x9

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZZLc93/a;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lkd1/o;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    int-to-float p1, p1

    const/4 p3, 0x4

    int-to-float p3, p3

    mul-float/2addr p1, p3

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v7, Lkd1/o;->a:I

    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    sget p0, Lyp2/c;->E:I

    invoke-static {v6, p0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/16 v8, 0x6180

    const/16 v9, 0x68

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkd1/o;Lc93/a;ZZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Llq2/i;->j(Lkd1/o;Lc93/a;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
