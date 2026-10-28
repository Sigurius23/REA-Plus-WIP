.class public abstract Lno0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\nH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a5\u0010\u0013\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Llo0/b0$b$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Llo0/z;",
        "Ll83/a0;",
        "onEvent",
        "f",
        "(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lhy0/h0;",
        "image",
        "",
        "title",
        "subtitle",
        "i",
        "(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc31/k;",
        "progressState",
        "k",
        "(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/z;->j(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/z;->l(Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lno0/z;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/z;->m(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lno0/z;->h(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/b0$b$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onEvent"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v1, -0x559bb8f4

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v5, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p3, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    or-int v1, p3, v1

    goto :goto_2

    :cond_2
    move/from16 v1, p3

    :goto_2
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v1, v6

    :cond_4
    and-int/lit8 v6, v1, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    if-eq v6, v9, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v10

    :goto_4
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v4, v12, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_16

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v14, v5

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    const/4 v8, 0x0

    invoke-static {v13, v14, v8, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v4, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-nez v10, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v2, v4, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    float-to-double v10, v6

    const-wide/16 v18, 0x0

    cmpl-double v10, v10, v18

    if-lez v10, :cond_9

    const/4 v10, 0x1

    goto :goto_6

    :cond_9
    const/4 v10, 0x0

    :goto_6
    if-nez v10, :cond_a

    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_a
    const/4 v10, 0x1

    invoke-static {v5, v10, v6}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Lb2/e;->w:Lb2/m;

    const/4 v11, 0x0

    invoke-static {v10, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v10

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v4, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v6, v4, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v5, 0x12

    int-to-float v5, v5

    mul-float v22, v5, v15

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v10, 0x0

    invoke-static {v5, v10, v6, v7, v6}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {}, Lno0/t;->a()F

    move-result v6

    invoke-static {v5, v6}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x4

    int-to-float v6, v6

    const/4 v10, 0x6

    invoke-static {v6, v15, v14, v4, v10}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v6

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    move/from16 v16, v7

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_e

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_f

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v14, v4, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Llo0/b0$b$a;->d()Lhy0/h0;

    move-result-object v2

    invoke-virtual {v0}, Llo0/b0$b$a;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Llo0/b0$b$a;->f()Ljava/lang/String;

    move-result-object v5

    sget v6, Lhy0/h0;->h:I

    invoke-static {v2, v3, v5, v4, v6}, Lno0/z;->i(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Llo0/b0$b$a;->c()Lo71/h;

    move-result-object v2

    if-nez v2, :cond_11

    const v2, 0x5b63b581

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move-object/from16 v7, p1

    :goto_9
    const/4 v10, 0x1

    goto :goto_d

    :cond_11
    const v2, 0x5b63b582

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    new-instance v2, Lo71/a;

    invoke-direct {v2}, Lo71/a;-><init>()V

    invoke-virtual {v0}, Llo0/b0$b$a;->c()Lo71/h;

    move-result-object v3

    and-int/lit8 v5, v1, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_12

    const/4 v5, 0x1

    goto :goto_a

    :cond_12
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_14

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_13

    goto :goto_b

    :cond_13
    move-object/from16 v7, p1

    goto :goto_c

    :cond_14
    :goto_b
    new-instance v6, Lno0/l;

    const/4 v5, 0x1

    move-object/from16 v7, p1

    invoke-direct {v6, v7, v5}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v5, Lo71/h;->h:I

    sget v8, Lo71/a;->a:I

    shl-int/2addr v8, v10

    or-int/2addr v5, v8

    invoke-virtual {v2, v3, v6, v4, v5}, Lo71/a;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_d
    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Llo0/b0$b$a;->e()Lc31/k;

    move-result-object v3

    if-nez v3, :cond_15

    const v1, -0x4311bd8e

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move-object v3, v7

    :goto_e
    const/4 v10, 0x1

    goto :goto_f

    :cond_15
    const v2, -0x4311bd8d

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->H:Lb2/m;

    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v6, v2, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v5, Lc31/k;->r:I

    shl-int/lit8 v5, v5, 0x3

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v5, v1

    const/4 v6, 0x0

    move-object v1, v2

    move-object v2, v3

    move-object v3, v7

    invoke-static/range {v1 .. v6}, Lno0/z;->k(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_16
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_17

    new-instance v2, Lmx1/i;

    const/16 v4, 0xe

    move/from16 v7, p3

    invoke-direct {v2, v0, v3, v7, v4}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "heightWeightEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llo0/z$c;

    invoke-direct {v0, p1}, Llo0/z$c;-><init>(Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lno0/z;->f(Llo0/b0$b$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move/from16 v0, p4

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v3, 0xaadb333

    invoke-virtual {v6, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v13, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v0, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v13

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v0

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    and-int/lit8 v4, v0, 0x30

    move-object/from16 v14, p1

    if-nez v4, :cond_4

    invoke-virtual {v6, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit16 v4, v0, 0x180

    if-nez v4, :cond_6

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_6
    move v15, v3

    and-int/lit16 v3, v15, 0x93

    const/16 v4, 0x92

    const/4 v9, 0x0

    if-eq v3, v4, :cond_7

    const/4 v3, 0x1

    goto :goto_5

    :cond_7
    move v3, v9

    :goto_5
    and-int/lit8 v4, v15, 0x1

    invoke-virtual {v6, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v5, v6, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v1, :cond_b

    const v3, 0x640441aa

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    move v14, v11

    move-object v13, v12

    move/from16 v16, v15

    move v15, v9

    goto :goto_7

    :cond_b
    const v3, 0x640441ab

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lhy0/h0;->g()Lkd1/o;

    move-result-object v3

    sget v7, Lkd1/o;->a:I

    const/4 v8, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    const/16 v4, 0x19

    int-to-float v4, v4

    int-to-float v5, v13

    mul-float/2addr v4, v5

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v24, v6

    sget-object v6, Lb2/e;->z:Lb2/m;

    move v4, v11

    const/16 v11, 0x6db0

    move-object v7, v12

    const/16 v12, 0x60

    move v8, v4

    const/4 v4, 0x0

    move-object v10, v7

    sget-object v7, Ly2/j;->b:Ly2/b1;

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move-object v13, v10

    move/from16 v14, v16

    move-object/from16 v10, v24

    move/from16 v16, v15

    move/from16 v15, v17

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    :goto_7
    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v9, v3, v4

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v6, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    shr-int/lit8 v10, v16, 0x3

    and-int/lit8 v10, v10, 0xe

    or-int/lit8 v26, v10, 0x30

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v27, v10, 0x12

    const v28, 0x2fff8

    move-object v10, v5

    move-object/from16 v24, v6

    move-wide v5, v8

    move v9, v7

    const-wide/16 v7, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    move-object/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v22, v16

    move-object/from16 v21, v17

    const-wide/16 v16, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 v30, v20

    const/16 v20, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move-object/from16 v33, v25

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v29, v4

    move/from16 v2, v30

    move-object/from16 v0, v31

    move/from16 v1, v32

    move-object/from16 v34, v33

    move-object v4, v3

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    if-nez p2, :cond_c

    const v0, 0x640d0ff2

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    goto :goto_8

    :cond_c
    const v3, 0x640d0ff3

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    move-object/from16 v13, v34

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x1

    int-to-float v5, v4

    mul-float v5, v5, v29

    const/4 v7, 0x0

    invoke-static {v3, v7, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0, v6, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v6, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    new-instance v14, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v14, v5}, Lw3/k;-><init>(I)V

    const/16 v25, 0x30

    move/from16 v26, v27

    const v27, 0x2fdf8

    move-object/from16 v24, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-wide/from16 v35, v0

    move v1, v4

    move-wide/from16 v4, v35

    move v0, v2

    move-object/from16 v2, p2

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lno0/y;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y;-><init>(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final j(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lno0/z;->i(Lhy0/h0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc31/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x6c84061f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v5, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v4, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v10, 0x92

    if-eq v8, v10, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v10, v7, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object v6, v13

    :cond_9
    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Ll0/m;->b:Ll0/e;

    sget-object v10, Lb2/e;->J:Lb2/l;

    const/4 v14, 0x6

    invoke-static {v8, v10, v0, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_a

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    :cond_b
    invoke-static {v10, v0, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v1, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    const/4 v10, 0x5

    int-to-float v10, v10

    mul-float v17, v10, v5

    const/16 v18, 0x2

    move-object v5, v15

    const/4 v15, 0x0

    move/from16 v16, v1

    move-object/from16 v19, v14

    move v14, v1

    move-object/from16 v1, v19

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v11, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v0, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v0, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-nez v5, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    :cond_e
    invoke-static {v13, v0, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v0, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v1, v7, 0x380

    const/16 v5, 0x100

    if-ne v1, v5, :cond_10

    const/4 v13, 0x1

    goto :goto_8

    :cond_10
    const/4 v13, 0x0

    :goto_8
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v13, :cond_11

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_12

    :cond_11
    new-instance v1, Lno0/l;

    const/4 v5, 0x2

    invoke-direct {v1, v3, v5}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v5, Lc31/k;->r:I

    shr-int/lit8 v7, v7, 0x3

    and-int/lit8 v7, v7, 0xe

    or-int/2addr v5, v7

    const/4 v13, 0x0

    invoke-static {v2, v1, v0, v5, v13}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_9
    move-object v1, v6

    goto :goto_a

    :cond_13
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lno0/x;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lno0/x;-><init>(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Llo0/z$o;->a:Llo0/z$o;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/z;->k(Landroidx/compose/ui/Modifier;Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
