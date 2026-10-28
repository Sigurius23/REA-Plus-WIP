.class public abstract Lzr1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ai\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u001a\u0008\u0002\u0010\u000b\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0004\u0012\u00020\n0\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a9\u0010\u0018\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lkm0/f;",
        "viewState",
        "",
        "Lkm0/d;",
        "behaviorsInWeeklyPlan",
        "",
        "savedBehaviors",
        "",
        "forceScrollbar",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onConfirm",
        "Lkotlin/Function0;",
        "onDismiss",
        "o",
        "(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "m",
        "(Lkm0/d;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Ln0/u;",
        "state",
        "Ly3/f;",
        "width",
        "verticalPadding",
        "z",
        "(Landroidx/compose/ui/Modifier;Ln0/u;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "journal_release"
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
.method private static final A(Ln0/u;)Z
    .locals 1

    invoke-virtual {p0}, Ln0/u;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ln0/u;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final B(Ln0/u;ZLp1/t2;FFJLk2/c;)Ll83/a0;
    .locals 16

    move/from16 v0, p4

    move-object/from16 v1, p7

    const-string v2, "$this$drawWithContent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, La3/p0;

    iget-object v3, v2, La3/p0;->w:Lk2/b;

    invoke-virtual {v2}, La3/p0;->a()V

    invoke-virtual/range {p0 .. p0}, Ln0/u;->h()Ln0/n;

    move-result-object v4

    iget-object v4, v4, Ln0/n;->k:Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Ln0/u;->h()Ln0/n;

    move-result-object v5

    iget v5, v5, Ln0/n;->n:I

    invoke-static {v4}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln0/g;

    if-eqz v6, :cond_0

    check-cast v6, Ln0/o;

    iget v6, v6, Ln0/o;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    if-nez p1, :cond_1

    move-object/from16 v7, p0

    iget-object v7, v7, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v7}, Lh0/d0;->b()Z

    move-result v7

    if-nez v7, :cond_1

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    if-lez v7, :cond_2

    :cond_1
    if-eqz v6, :cond_2

    if-lez v5, :cond_2

    move/from16 v7, p3

    invoke-virtual {v2, v7}, La3/p0;->q0(F)F

    move-result v7

    invoke-interface {v3}, Lk2/e;->d()J

    move-result-wide v8

    const-wide v10, 0xffffffffL

    and-long/2addr v8, v10

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float v12, v7, v9

    sub-float/2addr v8, v12

    int-to-float v5, v5

    div-float/2addr v8, v5

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v8

    add-float/2addr v5, v7

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v8

    invoke-virtual {v2, v0}, La3/p0;->q0(F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v12, v4

    const/16 v4, 0x20

    shl-long/2addr v6, v4

    and-long/2addr v12, v10

    or-long/2addr v6, v12

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-interface {v3}, Lk2/e;->d()J

    move-result-wide v12

    shr-long/2addr v12, v4

    long-to-int v3, v12

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v2, v0}, La3/p0;->q0(F)F

    move-result v12

    sub-float/2addr v3, v12

    const/4 v12, 0x1

    int-to-float v12, v12

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v12, v13

    invoke-virtual {v2, v12}, La3/p0;->q0(F)F

    move-result v12

    sub-float/2addr v3, v12

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v12, v3

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v14, v3

    shl-long/2addr v12, v4

    and-long/2addr v14, v10

    or-long/2addr v12, v14

    invoke-virtual {v2, v0}, La3/p0;->q0(F)F

    move-result v3

    div-float/2addr v3, v9

    invoke-virtual {v2, v0}, La3/p0;->q0(F)F

    move-result v0

    div-float/2addr v0, v9

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v14, v0

    shl-long/2addr v2, v4

    and-long v4, v14, v10

    or-long/2addr v2, v4

    const/4 v9, 0x0

    const/16 v11, 0xd0

    move-object v0, v1

    move-wide v5, v6

    move v10, v8

    move-wide v7, v2

    move-wide v3, v12

    move-wide/from16 v1, p5

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzr1/c;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lkm0/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzr1/c;->n(Lkm0/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ln0/u;ZLp1/t2;FFJLk2/c;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lzr1/c;->B(Ln0/u;ZLp1/t2;FFJLk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lzr1/c;->x(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzr1/c;->v(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkm0/f;Ln0/u;ZLjava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lzr1/c;->s(Lkm0/f;Ln0/u;ZLjava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzr1/c;->p(Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ln0/u;)Z
    .locals 0

    invoke-static {p0}, Lzr1/c;->A(Ln0/u;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Ljava/util/List;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzr1/c;->u(Ljava/util/List;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzr1/c;->t(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzr1/c;->w(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Lzr1/c;->r()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final m(Lkm0/d;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x29583d86

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v5, v3, :cond_3

    move v3, v11

    goto :goto_3

    :cond_3
    move v3, v10

    :goto_3
    and-int/2addr v2, v11

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v3, v2, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v7, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x5

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float v6, v5, v4

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v17, v12

    invoke-virtual/range {v16 .. v16}, Ly81/i;->g()J

    move-result-wide v11

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v6, v11, v12, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v11, v7, v11, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xa

    int-to-float v5, v5

    move-object/from16 v10, v17

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/i0;->k()I

    move-result v6

    const/4 v11, 0x6

    invoke-static {v6, v7, v11}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    invoke-virtual {v8, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->f()J

    move-result-wide v11

    move-object/from16 v17, v8

    const/16 v8, 0x1b0

    move/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v19, v3

    const/4 v3, 0x0

    move v0, v4

    move-object v4, v5

    move-object/from16 v1, v17

    move/from16 v28, v18

    move-wide/from16 v31, v11

    move-object v11, v2

    move-object v2, v6

    move-wide/from16 v5, v31

    move-object/from16 v12, v19

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    const/4 v3, 0x3

    int-to-float v3, v3

    invoke-static {v3, v0, v10, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x0

    invoke-static {v0, v3, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v3, v7, v3, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v7, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lkm0/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v5, v28

    invoke-virtual {v1, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v1, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move v6, v3

    const/4 v3, 0x0

    move v10, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move/from16 v16, v4

    move/from16 v18, v5

    move-wide v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object v2, v0

    move/from16 v0, v29

    move-object/from16 v29, v1

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lkm0/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_d

    const v0, -0x33715c18

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v2, 0x1

    goto :goto_8

    :cond_d
    const v3, -0x33715c17    # -7.4784584E7f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-static {v2, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v5, v28

    move-object/from16 v0, v29

    invoke-virtual {v0, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v3

    invoke-virtual {v0, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    const/16 v25, 0x0

    const v27, 0x2fffa

    move-wide v4, v3

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Luw0/c;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Luw0/c;-><init>(Lkm0/d;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final n(Lkm0/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzr1/c;->m(Lkm0/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkm0/f;",
            "Ljava/util/List<",
            "Lkm0/d;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v9, p7

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "behaviorsInWeeklyPlan"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedBehaviors"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    const v0, 0x3719e2d

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v9, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v9

    goto :goto_2

    :cond_2
    move v0, v9

    :goto_2
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_6

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_6
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v4, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_7

    move/from16 v4, p3

    invoke-virtual {v10, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x800

    goto :goto_5

    :cond_9
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    :goto_6
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_b

    or-int/lit16 v0, v0, 0x6000

    :cond_a
    move-object/from16 v6, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v6, v9, 0x6000

    if-nez v6, :cond_a

    move-object/from16 v6, p4

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/16 v8, 0x4000

    goto :goto_7

    :cond_c
    const/16 v8, 0x2000

    :goto_7
    or-int/2addr v0, v8

    :goto_8
    and-int/lit8 v8, p8, 0x20

    const/high16 v11, 0x30000

    if-eqz v8, :cond_e

    or-int/2addr v0, v11

    :cond_d
    move-object/from16 v11, p5

    goto :goto_a

    :cond_e
    and-int/2addr v11, v9

    if-nez v11, :cond_d

    move-object/from16 v11, p5

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v0, v12

    :goto_a
    const v12, 0x12493

    and-int/2addr v12, v0

    const v13, 0x12492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v12, v13, :cond_10

    move v12, v14

    goto :goto_b

    :cond_10
    move v12, v15

    :goto_b
    and-int/2addr v0, v14

    invoke-virtual {v10, v0, v12}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_17

    if-eqz v3, :cond_11

    move v3, v15

    goto :goto_c

    :cond_11
    move v3, v4

    :goto_c
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_12

    new-instance v4, Lzm1/d;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lzm1/d;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, v4

    :cond_13
    if-eqz v8, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_14

    new-instance v4, Lzi1/e0;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/a;

    move-object v5, v4

    goto :goto_d

    :cond_15
    move-object v5, v11

    :goto_d
    const/4 v4, 0x3

    invoke-static {v15, v15, v10, v4}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_16

    new-instance v11, Lzi1/e0;

    const/16 v0, 0xa

    invoke-direct {v11, v0}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v11, Lc93/a;

    new-instance v12, Lc4/a0;

    invoke-direct {v12, v4}, Lc4/a0;-><init>(I)V

    new-instance v0, Lbf0/j;

    move-object v2, v8

    const/4 v8, 0x3

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v8}, Lbf0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v1, 0x924fcc4

    invoke-static {v1, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x1b6

    invoke-static {v11, v12, v0, v10, v1}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v6

    move-object v6, v5

    move-object v5, v4

    move v4, v3

    goto :goto_e

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v5, v6

    move-object v6, v11

    :goto_e
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_18

    new-instance v0, Lb30/i2;

    const/16 v9, 0x16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/i2;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final p(Ljava/util/List;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lkm0/f;Ln0/u;ZLjava/util/List;Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 45

    and-int/lit8 v4, p8, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eq v4, v7, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    and-int/lit8 v8, p8, 0x1

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v4

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    const/4 v12, 0x4

    invoke-static {v10, v4, v9, v11, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v9, 0x5

    int-to-float v9, v9

    int-to-float v12, v12

    mul-float/2addr v9, v12

    invoke-static {v4, v9, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v9, 0x3f4ccccd    # 0.8f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v5, v14, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v9

    const/16 v13, 0xe

    invoke-static {v4, v9, v13}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->N:Lb2/k;

    sget-object v13, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v13, v9, v14, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move/from16 p7, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v14, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v4, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v4, v7

    const/4 v6, 0x2

    const/4 v11, 0x0

    invoke-static {v10, v4, v11, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object v6, v9

    invoke-virtual/range {p0 .. p0}, Lkm0/f;->d()Ljava/lang/String;

    move-result-object v9

    move-object/from16 p8, v13

    sget-object v13, Lx81/d;->a:Lx81/d;

    move-object/from16 v16, v15

    sget v15, Lx81/d;->b:I

    invoke-virtual {v13, v14, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v13, v14, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->q()Lb91/a;

    move-result-object v29

    new-instance v11, Lw3/k;

    move-object/from16 v20, v13

    const/4 v13, 0x3

    invoke-direct {v11, v13}, Lw3/k;-><init>(I)V

    sget v21, Lb91/a;->d:I

    shl-int/lit8 v33, v21, 0x12

    const v34, 0x2fdf8

    move/from16 v21, v13

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v21

    move-object/from16 v21, v11

    move-wide/from16 v43, v17

    move/from16 v18, v12

    move-wide/from16 v11, v43

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v26, 0x0

    const-wide/16 v18, 0x0

    move-object/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v30, v22

    move-object/from16 v28, v23

    const-wide/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v27

    const/16 v27, 0x0

    move-object/from16 v38, v28

    const/16 v28, 0x0

    move/from16 v39, v30

    const/16 v30, 0x0

    move/from16 v40, v32

    const/16 v32, 0x30

    move/from16 v36, v7

    move-object v1, v10

    move-object/from16 v3, v37

    move/from16 v2, v39

    move-object v10, v4

    move-object v7, v6

    move-object/from16 v6, v38

    move-object/from16 v4, p8

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    const/4 v9, 0x2

    int-to-float v10, v9

    mul-float v9, v10, v36

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v14, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move v10, v9

    invoke-virtual/range {p0 .. p0}, Lkm0/f;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    new-instance v13, Lw3/k;

    const/4 v15, 0x3

    invoke-direct {v13, v15}, Lw3/k;-><init>(I)V

    invoke-virtual {v3, v14, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->b()Lb91/a;

    move-result-object v29

    const/16 v32, 0x0

    const v34, 0x2fdfa

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v21, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v24, v22

    const-wide/16 v22, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v37, v30

    const/16 v30, 0x0

    move/from16 v0, v37

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v14, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3, v14, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->q()J

    move-result-wide v2

    const/4 v15, 0x3

    int-to-float v9, v15

    mul-float v12, v9, v35

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v1, v2, v3, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v3, v10, :cond_4

    new-instance v3, Lzm1/d;

    const/16 v11, 0xa

    invoke-direct {v3, v11}, Lzm1/d;-><init>(I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move v11, v9

    move-object v13, v10

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v14, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    :cond_6
    invoke-static {v9, v14, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v14, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v2, v0, v3}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v17

    const/4 v15, 0x6

    const/16 v16, 0x6

    move v9, v11

    const/4 v11, 0x0

    move v10, v12

    const/4 v12, 0x0

    move/from16 v41, v9

    move-object v9, v1

    move/from16 v1, v41

    move/from16 v41, v10

    move-object/from16 v42, v13

    move-object/from16 v10, p1

    move/from16 v13, p2

    invoke-static/range {v9 .. v16}, Lzr1/c;->z(Landroidx/compose/ui/Modifier;Ln0/u;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v10, v9

    const/4 v9, 0x2

    invoke-static {v11, v0, v2, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v9, 0x2d

    int-to-float v9, v9

    mul-float v9, v9, v35

    invoke-static {v0, v2, v9, v3}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static/range {p7 .. p7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    move-object/from16 v0, p3

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_8

    move-object/from16 v3, v42

    if-ne v11, v3, :cond_9

    goto :goto_3

    :cond_8
    move-object/from16 v3, v42

    :goto_3
    new-instance v11, Lej1/s;

    const/4 v13, 0x6

    invoke-direct {v11, v0, v13}, Lej1/s;-><init>(Ljava/util/List;I)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x6180

    const/16 v20, 0x1e8

    const/4 v13, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, v17

    move-object/from16 v17, v11

    move-object v11, v0

    move-object v0, v10

    move-object/from16 v18, v31

    move-object/from16 v10, p1

    invoke-static/range {v9 .. v20}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v18

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    mul-float v9, v1, v36

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v14, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x0

    invoke-static {v1, v9, v14, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v14, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v14, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v9, v14, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v2

    const-wide/16 v6, 0x0

    cmpl-double v1, v4, v6

    const-string v4, "invalid weight; must be greater than zero"

    if-lez v1, :cond_d

    goto :goto_5

    :cond_d
    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v2, v1

    if-lez v5, :cond_e

    move v5, v1

    :goto_6
    const/4 v8, 0x1

    goto :goto_7

    :cond_e
    move v5, v2

    goto :goto_6

    :goto_7
    invoke-direct {v9, v5, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lkm0/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object/from16 v5, p4

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_f

    if-ne v10, v3, :cond_10

    :cond_f
    new-instance v10, Ly71/e;

    const/16 v8, 0x16

    invoke-direct {v10, v5, v8}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v15, v10

    check-cast v15, Lc93/a;

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v17, v5, 0x6

    const/16 v18, 0x3a

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v9 .. v18}, Lny0/q0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    move/from16 v10, v41

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    float-to-double v8, v2

    cmpl-double v0, v8, v6

    if-lez v0, :cond_11

    goto :goto_8

    :cond_11
    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v0, v2, v1

    if-lez v0, :cond_12

    move v2, v1

    :cond_12
    const/4 v8, 0x1

    invoke-direct {v9, v2, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lkm0/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object/from16 v2, p5

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    move-object/from16 v1, p6

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_13

    if-ne v4, v3, :cond_14

    :cond_13
    new-instance v4, Lpj2/s;

    const/4 v0, 0x2

    invoke-direct {v4, v1, v0, v2}, Lpj2/s;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v15, v4

    check-cast v15, Lc93/a;

    shl-int/lit8 v17, v5, 0x9

    const/16 v18, 0x36

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v31, v14

    const/4 v14, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v9 .. v18}, Lny0/c0;->b(Landroidx/compose/ui/Modifier;ZLjava/lang/Integer;Lcom/whoop/design/util/TextResource;Lg1/u0;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    const/4 v8, 0x1

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_15
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->e(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljava/util/List;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lzr1/c$a;->w:Lzr1/c$a;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lzr1/c$b;

    invoke-direct {v2, v0, p0}, Lzr1/c$b;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lzr1/c$c;

    invoke-direct {v0, p0}, Lzr1/c$c;-><init>(Ljava/util/List;)V

    new-instance p0, Lx1/b;

    const/4 v3, 0x1

    const v4, 0x2fd4df92

    invoke-direct {p0, v0, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p1, Ln0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v1, v0, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lzr1/c;->o(Lkm0/f;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic y(Lkm0/d;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lzr1/c;->m(Lkm0/d;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final z(Landroidx/compose/ui/Modifier;Ln0/u;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move/from16 v1, p6

    const-string v3, "$this$verticalScrollbar"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    int-to-float v3, v3

    move v6, v3

    goto :goto_0

    :cond_0
    move/from16 v6, p2

    :goto_0
    and-int/lit8 v3, p7, 0x4

    const/16 v4, 0x8

    if-eqz v3, :cond_1

    int-to-float v3, v4

    move v5, v3

    goto :goto_1

    :cond_1
    move/from16 v5, p3

    :goto_1
    and-int/lit8 v3, p7, 0x8

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    move/from16 v3, p4

    :goto_2
    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v7, v14, :cond_3

    new-instance v7, Lcom/whoop/profile/view/c;

    const/4 v8, 0x3

    invoke-direct {v7, v2, v8}, Lcom/whoop/profile/view/c;-><init>(Ln0/u;I)V

    invoke-static {v7}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v7, Lp1/t2;

    invoke-interface {v7}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_4

    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_4
    const/4 v7, 0x0

    :goto_3
    iget-object v8, v2, Ln0/u;->i:Lh0/d0;

    invoke-virtual {v8}, Lh0/d0;->b()Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x96

    goto :goto_4

    :cond_5
    const/16 v8, 0x1f4

    :goto_4
    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v9, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v9

    const/4 v12, 0x6

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static {v8, v15, v13, v12}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v8

    const/16 v12, 0xc00

    const/16 v13, 0x14

    move-wide/from16 v16, v9

    const-string v9, ""

    const/4 v10, 0x0

    move-wide/from16 v18, v16

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v7

    and-int/lit8 v8, v1, 0x70

    xor-int/lit8 v8, v8, 0x30

    const/16 v9, 0x20

    if-le v8, v9, :cond_6

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    and-int/lit8 v8, v1, 0x30

    if-ne v8, v9, :cond_8

    :cond_7
    move v8, v4

    goto :goto_5

    :cond_8
    move v8, v15

    :goto_5
    const v9, 0xe000

    and-int/2addr v9, v1

    xor-int/lit16 v9, v9, 0x6000

    const/16 v10, 0x4000

    if-le v9, v10, :cond_9

    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    and-int/lit16 v9, v1, 0x6000

    if-ne v9, v10, :cond_b

    :cond_a
    move v9, v4

    goto :goto_6

    :cond_b
    move v9, v15

    :goto_6
    or-int/2addr v8, v9

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    and-int/lit16 v9, v1, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    const/16 v10, 0x800

    if-le v9, v10, :cond_c

    invoke-virtual {v11, v5}, Lp1/q;->d(F)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    and-int/lit16 v9, v1, 0xc00

    if-ne v9, v10, :cond_e

    :cond_d
    move v9, v4

    goto :goto_7

    :cond_e
    move v9, v15

    :goto_7
    or-int/2addr v8, v9

    and-int/lit16 v9, v1, 0x380

    xor-int/lit16 v9, v9, 0x180

    const/16 v10, 0x100

    if-le v9, v10, :cond_f

    invoke-virtual {v11, v6}, Lp1/q;->d(F)Z

    move-result v9

    if-nez v9, :cond_11

    :cond_f
    and-int/lit16 v1, v1, 0x180

    if-ne v1, v10, :cond_10

    goto :goto_8

    :cond_10
    move v4, v15

    :cond_11
    :goto_8
    or-int v1, v8, v4

    move-wide/from16 v8, v18

    invoke-virtual {v11, v8, v9}, Lp1/q;->f(J)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_12

    if-ne v4, v14, :cond_13

    :cond_12
    new-instance v1, Luw0/b;

    move-wide/from16 v16, v8

    const/4 v9, 0x1

    move-object v4, v7

    move-wide/from16 v7, v16

    invoke-direct/range {v1 .. v9}, Luw0/b;-><init>(Ln0/u;ZLp1/t2;FFJI)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v1

    :cond_13
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v4}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0
.end method
