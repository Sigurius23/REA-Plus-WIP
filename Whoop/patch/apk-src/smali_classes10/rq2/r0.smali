.class public abstract Lrq2/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lrq2/p0;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "f",
        "(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V",
        "d",
        "(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lrq2/p0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/r0;->e(Lrq2/p0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/r0;->g(Lrq2/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/r0;->h(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "step"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    const v2, 0x5cda0bd

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v15, 0x1

    if-eq v5, v3, :cond_2

    move v3, v15

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/2addr v2, v15

    invoke-virtual {v12, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_3
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v3, v12, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0xa5

    int-to-float v2, v2

    int-to-float v3, v4

    mul-float v7, v3, v3

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    invoke-static {v3, v4}, Li91/c;->o(J)Li91/a;

    move-result-object v6

    sget v3, Li91/a;->a:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit16 v13, v3, 0x61b0

    const/16 v14, 0x1e1

    move v4, v3

    const/4 v3, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v16, v4

    move v4, v2

    move/from16 v2, v16

    invoke-static/range {v3 .. v14}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lrq2/p0;->e()F

    move-result v5

    sget-object v3, Li2/t;->b:Li2/s;

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const-wide v8, 0xff132c5fL

    invoke-static {v8, v9}, Li2/w0;->e(J)J

    move-result-wide v8

    new-instance v10, Li2/x;

    invoke-direct {v10, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v6, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const-wide v9, 0xff66ddffL

    invoke-static {v9, v10}, Li2/w0;->e(J)J

    move-result-wide v9

    new-instance v11, Li2/x;

    invoke-direct {v11, v9, v10}, Li2/x;-><init>(J)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v6, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v9}, [Ll83/k;

    move-result-object v6

    invoke-static {v3, v6}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v3

    invoke-static {v3}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v6

    or-int/lit16 v13, v2, 0x6030

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Los0/d;

    const/16 v4, 0x18

    invoke-direct {v3, v0, v1, v4}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final e(Lrq2/p0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lrq2/r0;->d(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x75222f48

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Llz1/a;

    const/16 v2, 0x18

    invoke-direct {v1, p0, v2}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v2, -0x4b9bf582

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lrq2/q0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/q0;-><init>(Lrq2/p0;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final g(Lrq2/p0;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 47

    move-object/from16 v0, p2

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->e:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v9, v8, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object v11, v0

    check-cast v11, Lp1/q;

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    iget-object v7, v11, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_0
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v0, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v5, v11, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x6

    int-to-float v5, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v7, 0x7

    move/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move/from16 v18, v6

    move v6, v5

    const/4 v5, 0x0

    move/from16 v27, v16

    move-object/from16 v1, v17

    move/from16 v26, v18

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_1
    invoke-static {v0, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v6, v11, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-static {v0, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, p0

    invoke-static {v3, v0, v5}, Lrq2/r0;->d(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V

    const/16 v4, 0x36

    invoke-static {v9, v8, v0, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_6

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v0, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v6, v11, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v0, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lrq2/p0;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v6, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->u()Lb91/a;

    move-result-object v20

    new-instance v12, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v12, v10}, Lw3/k;-><init>(I)V

    sget v28, Lb91/a;->d:I

    shl-int/lit8 v24, v28, 0x12

    const v25, 0x2fdfa

    move-object v0, v1

    const/4 v1, 0x0

    move v13, v4

    move v14, v5

    const-wide/16 v4, 0x0

    move-object v15, v6

    const/4 v6, 0x0

    move/from16 v16, v7

    const/4 v7, 0x0

    move-wide/from16 v45, v8

    move-object v9, v2

    move-wide/from16 v2, v45

    const/4 v8, 0x0

    move-object/from16 v18, v9

    move/from16 v17, v10

    const-wide/16 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move/from16 v21, v13

    move/from16 v22, v14

    const-wide/16 v13, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    move/from16 v29, v16

    const/16 v16, 0x0

    move/from16 v30, v17

    const/16 v17, 0x0

    move-object/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v22, p2

    move/from16 v38, v29

    move-object/from16 v39, v31

    move-object/from16 v35, v32

    move/from16 v36, v33

    move-object/from16 v37, v34

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    const/4 v1, 0x1

    int-to-float v2, v1

    mul-float v2, v2, v26

    move-object/from16 v3, v39

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v4, v36

    invoke-static {v2, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v5, Ly81/f;->WHITE_50:Ly81/f;

    invoke-virtual {v5}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v5

    move-object/from16 v7, v37

    move/from16 v8, v38

    invoke-virtual {v7, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->q()Lb91/a;

    move-result-object v20

    new-instance v12, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v12, v9}, Lw3/k;-><init>(I)V

    move v10, v1

    const/4 v1, 0x0

    move-object v0, v2

    move-object/from16 v31, v3

    move v13, v4

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v15, v7

    const/4 v7, 0x0

    move/from16 v29, v8

    const/4 v8, 0x0

    move/from16 v30, v9

    move v11, v10

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move/from16 v33, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v34, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v22, p2

    move/from16 v41, v29

    move-object/from16 v42, v31

    move-object/from16 v40, v34

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    move-object/from16 v1, v35

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->h()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-nez v3, :cond_9

    const v3, -0x6d68d564

    invoke-virtual {v1, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->h()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v15, v40

    move/from16 v8, v41

    invoke-virtual {v15, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->N()Lb91/a;

    move-result-object v21

    invoke-virtual {v15, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v9, 0x3

    int-to-float v8, v9

    mul-float v8, v8, v26

    move-object/from16 v9, v42

    invoke-static {v9, v8, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shl-int/lit8 v24, v28, 0x15

    const v25, 0x1fff8

    move-object/from16 v32, v1

    move-object v1, v4

    const-wide/16 v4, 0x0

    move v14, v2

    move-object v0, v3

    move-wide v2, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v43, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x30

    move-object/from16 v22, p2

    move-object/from16 v44, v32

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v44

    const/4 v14, 0x0

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    :goto_3
    const/4 v14, 0x1

    goto :goto_4

    :cond_9
    move-object/from16 v9, v42

    const/4 v14, 0x0

    const v2, -0x6d63dec1

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v3, v6

    mul-float v3, v3, v26

    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v2}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    shl-int/lit8 v5, v33, 0x3

    shl-int/lit8 v6, v33, 0x6

    or-int/2addr v5, v6

    invoke-static {v2, v3, v4, v0, v5}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    invoke-virtual {v1, v14}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/r0;->f(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
