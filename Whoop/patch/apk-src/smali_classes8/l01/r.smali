.class public abstract Ll01/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\'\u0010\u0011\u001a\u00020\u0006*\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0019\u0010\u0013\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll01/s;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Ll01/s;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/u;",
        "Lgz0/m0;",
        "icon",
        "Ly81/e;",
        "color",
        "i",
        "(Ll0/u;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V",
        "o",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ll0/u;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ll01/r;->j(Ll0/u;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ll01/r;->p(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll01/s;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ll01/r;->l(Ll01/s;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll01/s;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll01/r;->h(Ll01/s;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ll01/r;->n(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ll01/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll01/r;->m(Ll01/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ll01/s;Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x293b1ec8

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v6, v2, 0x3

    const/4 v13, 0x1

    if-eq v6, v4, :cond_3

    move v6, v13

    goto :goto_3

    :cond_3
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v2, v13

    invoke-virtual {v5, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_17

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v15, v5, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v5, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v12, v14

    const-wide/16 v28, 0x0

    cmpl-double v2, v12, v28

    const-string v30, "invalid weight; must be greater than zero"

    if-lez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v31, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v14, v31

    if-lez v4, :cond_8

    move/from16 v4, v31

    :goto_6
    const/4 v8, 0x1

    goto :goto_7

    :cond_8
    move v4, v14

    goto :goto_6

    :goto_7
    invoke-direct {v2, v4, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->z:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v4, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v5, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    const/4 v8, 0x3

    int-to-float v8, v8

    mul-float/2addr v8, v4

    move-object v12, v9

    const/4 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x4

    move-object/from16 v16, v10

    move v10, v8

    move-object v14, v7

    move v7, v2

    move-object v2, v14

    move-object v14, v12

    move-object/from16 v12, v16

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v9, v6

    const/4 v8, 0x1

    int-to-float v6, v8

    mul-float/2addr v6, v4

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v4, v8, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v5, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v8, v5, v8, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v5, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v7, 0x19

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v11, v8

    mul-float/2addr v7, v11

    const/4 v8, 0x5

    int-to-float v8, v8

    mul-float/2addr v8, v11

    invoke-static {v4, v7, v8}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/16 v7, 0x36

    invoke-static {v6, v15, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v7, v5, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v5, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0x14

    int-to-float v4, v4

    mul-float/2addr v4, v11

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/u;->g()I

    move-result v6

    const/4 v7, 0x6

    invoke-static {v6, v5, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    move/from16 v19, v7

    const/16 v7, 0x61b0

    const/16 v8, 0x68

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move-object/from16 v32, v2

    move-object v2, v6

    move-object/from16 v33, v16

    move-object/from16 v6, v24

    invoke-static/range {v2 .. v8}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    const/16 v2, 0xa

    int-to-float v2, v2

    mul-float/2addr v2, v11

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v0}, Ll01/s;->c()Lkd1/o;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move/from16 v16, v10

    const/16 v10, 0x61b0

    const/16 v11, 0x68

    move-object/from16 v24, v5

    const/4 v5, 0x0

    sget-object v6, Ly2/j;->b:Ly2/b1;

    const/4 v7, 0x0

    move-object v4, v8

    const/4 v8, 0x0

    move/from16 v34, v19

    move-object/from16 v19, v12

    move/from16 v12, v34

    move-object/from16 v34, v9

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v35, v6

    move-object v5, v9

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Ll01/s;->f()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v15, v5, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0x2fffa

    move/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v36, v18

    const/16 v18, 0x0

    move-object/from16 v37, v19

    const/16 v19, 0x0

    move-object/from16 v38, v20

    const/16 v20, 0x0

    move-object/from16 v39, v21

    const/16 v21, 0x0

    move/from16 v40, v23

    const/16 v23, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v0, v36

    move-object/from16 v42, v37

    move-object/from16 v44, v38

    move-object/from16 v43, v39

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v2, v10

    cmpl-double v2, v2, v28

    if-lez v2, :cond_12

    goto :goto_b

    :cond_12
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v10, v31

    if-lez v3, :cond_13

    move/from16 v14, v31

    goto :goto_c

    :cond_13
    move v14, v10

    :goto_c
    invoke-direct {v2, v14, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->F:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_14

    move-object/from16 v12, v42

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v13, v43

    goto :goto_e

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v5, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v32

    invoke-static {v5, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    move-object/from16 v14, v44

    goto :goto_10

    :cond_16
    :goto_f
    move-object/from16 v3, v33

    goto :goto_11

    :goto_10
    invoke-static {v4, v5, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v5, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v34

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v8, v10}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Ll01/s;->g()Lkd1/o;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    const/16 v10, 0x61b0

    const/16 v11, 0x68

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v4, v8

    const/4 v8, 0x0

    move-object/from16 v9, v24

    move-object/from16 v6, v35

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_17
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v2, Lk71/i;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lk71/i;-><init>(Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final h(Ll01/s;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ll01/r;->g(Ll01/s;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ll0/u;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move-object/from16 v0, p2

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v1, -0x78c8b7a

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    if-nez p1, :cond_2

    const/4 v5, -0x1

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_2
    invoke-virtual {v10, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    :cond_4
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_5
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_8

    and-int/lit16 v6, v4, 0x200

    if-nez v6, :cond_6

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_4

    :cond_6
    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_4
    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_5

    :cond_7
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v1, v6

    :cond_8
    :goto_6
    and-int/lit16 v6, v1, 0x93

    const/16 v7, 0x92

    const/4 v13, 0x0

    if-eq v6, v7, :cond_9

    const/4 v6, 0x1

    goto :goto_7

    :cond_9
    move v6, v13

    :goto_7
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    if-eqz v5, :cond_a

    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_a
    if-nez p1, :cond_b

    const v1, -0x7c592759

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    const v5, -0x7c592758

    const/4 v6, 0x6

    invoke-static {v10, v5, p1, v10, v6}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v5

    shr-int/2addr v1, v6

    and-int/lit8 v1, v1, 0xe

    invoke-interface {v0, v10, v1}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    int-to-float v1, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v1, v3

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->I:Lb2/m;

    invoke-interface {p0, v1, v2}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_8
    move-object v3, v0

    goto :goto_9

    :cond_c
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Ljp1/d;

    const/16 v6, 0x1b

    move-object v1, p0

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final j(Ll0/u;Lgz0/m0;Ly81/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ll01/r;->i(Ll0/u;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ll01/s;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x1ca6503f

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_5

    and-int/lit8 v6, v4, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_3
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_7

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move v6, v8

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v5, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v6, v9, :cond_8

    move v6, v11

    goto :goto_5

    :cond_8
    move v6, v10

    :goto_5
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v14, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_f

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v15, v0

    goto :goto_6

    :cond_9
    move-object v15, v1

    :goto_6
    and-int/lit8 v0, v5, 0x70

    if-eq v0, v7, :cond_b

    and-int/lit8 v0, v5, 0x40

    if-eqz v0, :cond_a

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_7

    :cond_a
    move v0, v10

    goto :goto_8

    :cond_b
    :goto_7
    move v0, v11

    :goto_8
    and-int/lit16 v1, v5, 0x380

    if-ne v1, v8, :cond_c

    move v10, v11

    :cond_c
    or-int/2addr v0, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_d

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_e

    :cond_d
    new-instance v1, Ll01/q;

    const/4 v0, 0x0

    invoke-direct {v1, v0, v2, v3}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v19, v1

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v0, v15

    new-instance v1, Lkk1/b;

    const/4 v6, 0x6

    invoke-direct {v1, v2, v6}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    const v6, 0x3d3d0b51

    invoke-static {v6, v14, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7e

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v0

    goto :goto_9

    :cond_f
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Ljp1/d;

    const/16 v6, 0x1a

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final l(Ll01/s;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ll01/s;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ll01/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    sget-object p1, Ll0/a1;->x:Ll0/a1;

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p0}, Ll01/s;->e()Ll01/t;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll01/t;->getSmallCardGradient()Li2/t;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-static {p2, v0, v1, v4, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_1
    invoke-static {p1, v1}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->w:Lb2/m;

    invoke-static {p2, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    iget-wide v0, v7, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v2, La3/l;->a:La3/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_2

    invoke-virtual {v7, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v7, v2, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v7, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    :cond_3
    invoke-static {v0, v7, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v7, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget p1, Lcom/whoop/navigation/e;->d:I

    invoke-static {p0, v7, p1}, Ll01/r;->g(Ll01/s;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Ll01/s;->b()Lgz0/m0;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x2

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Ll01/r;->i(Ll0/u;Lgz0/m0;Ly81/e;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ll01/r;->k(Landroidx/compose/ui/Modifier;Ll01/s;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 3

    check-cast p1, Lp1/q;

    const v0, 0xf63c4d7

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x1

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_1

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_1
    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Ll01/r$a;

    invoke-direct {v1}, Ll01/r$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p1, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lb70/a;

    const/16 v1, 0x12

    invoke-direct {v0, p2, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final p(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Ll01/r;->o(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
