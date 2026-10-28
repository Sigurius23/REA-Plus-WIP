.class public abstract Ljp1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljp1/g$f;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a9\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lhp1/d;",
        "viewState",
        "Lcp1/d;",
        "type",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "n",
        "(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lhp1/c;",
        "",
        "isActive",
        "Lkotlin/Function0;",
        "y",
        "(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
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
.method private static final A(Lhp1/c;ZLcp1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    int-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v0

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v5, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/c;->a()Lgz0/m0;

    move-result-object v3

    if-nez v3, :cond_4

    const v0, 0x6f419e2b

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object v3, v5

    move-object/from16 v17, v6

    goto :goto_4

    :cond_4
    const v3, 0x6f419e2c

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lhp1/c;->a()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v7, 0x6

    invoke-static {v3, v10, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    int-to-float v7, v7

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz p1, :cond_5

    const v9, 0x2934758d

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v9, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->r()J

    move-result-wide v11

    :goto_2
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const v9, 0x2934796d

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v9, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->Y0()J

    move-result-wide v11

    goto :goto_2

    :goto_3
    const/16 v9, 0x1b0

    move/from16 v16, v9

    move-wide/from16 v31, v11

    move v11, v8

    move-wide/from16 v8, v31

    const/4 v12, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object v1, v5

    move-object v5, v3

    move-object v3, v1

    move v1, v11

    move/from16 v11, v16

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v0, v1, v4, v10, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_4
    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v0, v1, v10, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v10, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object/from16 v0, v17

    goto :goto_8

    :cond_8
    :goto_7
    invoke-static {v1, v10, v1, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_6

    :goto_8
    invoke-static {v10, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    if-eqz p1, :cond_9

    const v0, 0x1175296e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-static {v0, v10, v3, v2}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    :goto_9
    move-wide v7, v3

    goto :goto_a

    :cond_9
    const v0, 0x11752dae

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-static {v0, v10, v3, v2}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    goto :goto_9

    :goto_a
    sget-object v0, Lcp1/d;->POSTPARTUM:Lcp1/d;

    move-object/from16 v3, p2

    if-ne v3, v0, :cond_a

    const v0, 0x11753bc6

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    :goto_b
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object/from16 v25, v0

    goto :goto_c

    :cond_a
    const v0, 0x11753f87

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->L()Lb91/a;

    move-result-object v0

    goto :goto_b

    :goto_c
    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual/range {p0 .. p0}, Lhp1/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, 0x1d33ba2f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v0, 0x1

    goto :goto_10

    :cond_b
    const v0, 0x1d33ba30

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lhp1/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v10, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    if-eqz p1, :cond_c

    const v0, 0x69e906bf

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->t()J

    move-result-wide v0

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_e
    move-wide v7, v0

    goto :goto_f

    :cond_c
    const v0, 0x69e90a9f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-static {v0, v10, v1, v2}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_e

    :goto_f
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_10
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lhp1/c;Lcp1/d;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ljp1/g;->y(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic C(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp1/g;->y(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static synthetic a(Lhp1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp1/g;->t(Lhp1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhp1/c;Lcp1/d;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljp1/g;->B(Lhp1/c;Lcp1/d;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcp1/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lhp1/d;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/g;->u(Lcp1/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lhp1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp1/g;->p(Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lhp1/d;Lp1/c1;Lcp1/d;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/g;->s(Lhp1/d;Lp1/c1;Lcp1/d;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/g;->z(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/g;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/g;->r(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/g;->w(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljp1/g;->x(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lhp1/c;ZLcp1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp1/g;->A(Lhp1/c;ZLcp1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/g;->q(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/g;->v(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhp1/d;",
            "Lcp1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p1

    move/from16 v8, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    const v0, -0x5fa14f3c

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p6, 0x4

    const/16 v10, 0x100

    if-eqz v4, :cond_5

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_8

    if-nez p2, :cond_6

    const/4 v5, -0x1

    goto :goto_3

    :cond_6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_3
    invoke-virtual {v14, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_7

    move v5, v10

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v3, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v6, p3

    :goto_6
    move v12, v3

    goto :goto_8

    :cond_a
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_9

    move-object/from16 v6, p3

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_7

    :cond_b
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v3, v12

    goto :goto_6

    :goto_8
    and-int/lit16 v3, v12, 0x493

    const/16 v13, 0x492

    const/4 v7, 0x1

    if-eq v3, v13, :cond_c

    move v3, v7

    goto :goto_9

    :cond_c
    const/4 v3, 0x0

    :goto_9
    and-int/lit8 v13, v12, 0x1

    invoke-virtual {v14, v13, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3b

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_d

    move-object v2, v13

    :cond_d
    if-eqz v4, :cond_e

    sget-object v0, Lcp1/d;->POSTPARTUM:Lcp1/d;

    move-object v3, v0

    goto :goto_a

    :cond_e
    move-object/from16 v3, p2

    :goto_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_f

    new-instance v4, Ljg/c;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Ljg/c;-><init>(I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_10
    move-object v4, v6

    :goto_b
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    const/16 v16, 0x0

    if-ne v5, v0, :cond_11

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_12

    invoke-static/range {v16 .. v16}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_13

    invoke-static {v7, v14}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v9

    :cond_13
    check-cast v9, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_14

    invoke-virtual {v1}, Lhp1/d;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v7, Lp1/c1;

    invoke-virtual {v1}, Lhp1/d;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v15

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v20, :cond_15

    if-ne v11, v0, :cond_16

    :cond_15
    move-object v11, v0

    goto :goto_c

    :cond_16
    move-object/from16 v26, v0

    move-object v7, v2

    move-object v2, v5

    move-object v5, v9

    move-object v0, v11

    move-object v9, v3

    move-object v11, v4

    move-object v4, v6

    goto :goto_d

    :goto_c
    new-instance v0, Ljp1/g$a;

    move-object/from16 v20, v4

    move-object v4, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    move-object v7, v2

    move-object/from16 v2, v26

    move-object/from16 v26, v9

    move-object v9, v3

    move-object v3, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v11

    move-object/from16 v11, v20

    invoke-direct/range {v0 .. v6}, Ljp1/g$a;-><init>(Lhp1/d;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    move-object v2, v3

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v0, Lc93/m;

    invoke-static {v14, v0, v15}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit16 v3, v12, 0x380

    if-ne v3, v10, :cond_17

    const/4 v6, 0x1

    goto :goto_e

    :cond_17
    const/4 v6, 0x0

    :goto_e
    or-int/2addr v0, v6

    and-int/lit16 v6, v12, 0x1c00

    const/16 v12, 0x800

    if-ne v6, v12, :cond_18

    const/4 v12, 0x1

    goto :goto_f

    :cond_18
    const/4 v12, 0x0

    :goto_f
    or-int/2addr v0, v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v0, :cond_19

    move-object/from16 v0, v26

    if-ne v12, v0, :cond_1a

    goto :goto_10

    :cond_19
    move-object/from16 v0, v26

    :goto_10
    new-instance v12, Lim1/a0;

    const/16 v15, 0xb

    invoke-direct {v12, v1, v9, v11, v15}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v12, Lc93/a;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-interface {v15, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    move-object/from16 v20, v7

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    move-object/from16 p2, v2

    const/4 v2, 0x0

    invoke-static {v7, v10, v14, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    move/from16 v19, v3

    iget-wide v2, v14, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v14, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p3, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v24, v4

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_1b

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_11
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v14, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v14, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    move-object/from16 v25, v4

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_1c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v26, v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1d

    goto :goto_12

    :cond_1c
    move-object/from16 v26, v5

    :goto_12
    invoke-static {v2, v14, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp1/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v5, v10

    invoke-virtual {v1}, Lhp1/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lhp1/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-eqz v15, :cond_1e

    invoke-virtual {v1}, Lhp1/d;->f()Lcp1/c;

    move-result-object v27

    if-eqz v27, :cond_1e

    invoke-virtual {v1}, Lhp1/d;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v27

    if-eqz v27, :cond_1e

    invoke-static {v15}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v27

    if-eqz v27, :cond_1e

    move-object/from16 v16, v15

    :cond_1e
    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    move-object/from16 v27, v2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v15, :cond_1f

    if-ne v2, v0, :cond_20

    :cond_1f
    new-instance v2, Liy0/a;

    const/4 v15, 0x4

    invoke-direct {v2, v12, v15}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v2, Lc93/a;

    move/from16 v15, v19

    move-object/from16 v19, v2

    const/16 v2, 0x100

    if-ne v15, v2, :cond_21

    const/16 v21, 0x1

    :goto_13
    const/16 v2, 0x800

    goto :goto_14

    :cond_21
    const/16 v21, 0x0

    goto :goto_13

    :goto_14
    if-ne v6, v2, :cond_22

    const/16 v28, 0x1

    goto :goto_15

    :cond_22
    const/16 v28, 0x0

    :goto_15
    or-int v21, v21, v28

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v21, :cond_24

    if-ne v2, v0, :cond_23

    goto :goto_16

    :cond_23
    move-object/from16 v21, v3

    goto :goto_17

    :cond_24
    :goto_16
    new-instance v2, Ljp1/b;

    move-object/from16 v21, v3

    const/4 v3, 0x1

    invoke-direct {v2, v9, v11, v3}, Ljp1/b;-><init>(Lcp1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    check-cast v2, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v29, v3, 0x3

    or-int v30, v3, v29

    shl-int/lit8 v31, v3, 0x9

    or-int v30, v30, v31

    const/16 v31, 0x2

    const/16 v17, 0x4

    move-object/from16 v32, v11

    const/4 v11, 0x0

    move-object/from16 v33, v5

    move/from16 v22, v6

    move-object/from16 p0, v7

    move-object v5, v12

    move-object/from16 v34, v13

    move-object/from16 v12, v16

    move-object/from16 v13, v19

    move/from16 v16, v30

    const/high16 v6, 0x3f800000    # 1.0f

    const/16 v7, 0x100

    move/from16 v19, v3

    move-object v3, v9

    move-object v9, v4

    move v4, v15

    move-object v15, v14

    move-object v14, v2

    const/4 v2, 0x0

    invoke-static/range {v9 .. v17}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v15

    sget-object v12, Ll0/m;->d:Ll0/g;

    sget-object v13, Lb2/e;->N:Lb2/k;

    float-to-double v9, v6

    const-wide/16 v15, 0x0

    cmpl-double v9, v9, v15

    if-lez v9, :cond_25

    goto :goto_18

    :cond_25
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_18
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v9, v6, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v11, 0x3

    int-to-float v11, v11

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v15, v11

    invoke-static {v15, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-string v2, "LazyColumMultiSelect"

    invoke-static {v9, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-ne v4, v7, :cond_26

    move/from16 v16, v10

    goto :goto_19

    :cond_26
    const/16 v16, 0x0

    :goto_19
    or-int v2, v2, v16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_27

    if-ne v6, v0, :cond_28

    :cond_27
    move-object v2, v0

    goto :goto_1a

    :cond_28
    move-object/from16 v36, p0

    move-object/from16 v2, p2

    move-object/from16 v35, p3

    move-object/from16 v41, v0

    move-object v10, v5

    move/from16 v40, v19

    move-object/from16 v38, v21

    move-object/from16 v37, v25

    move-object/from16 v5, v26

    move-object/from16 v39, v27

    move/from16 v19, v4

    move-object/from16 v26, v20

    move-object/from16 v4, v24

    goto :goto_1b

    :goto_1a
    new-instance v0, Lam2/r;

    const/16 v6, 0x10

    move/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v36, p0

    move-object/from16 v35, p3

    move-object/from16 v41, v2

    move-object v10, v5

    move/from16 v40, v19

    move-object/from16 v38, v21

    move-object/from16 v37, v25

    move-object/from16 v5, v26

    move-object/from16 v39, v27

    move-object/from16 v2, p2

    move/from16 v19, v4

    move-object/from16 v26, v20

    move-object/from16 v4, v24

    invoke-direct/range {v0 .. v7}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_1b
    move-object/from16 v17, v6

    check-cast v17, Lkotlin/jvm/functions/Function1;

    move/from16 v0, v19

    const v19, 0x36000

    const/16 v20, 0x1ce

    move-object v6, v10

    const/4 v10, 0x0

    move v7, v11

    const/4 v11, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object v8, v6

    move v6, v0

    move/from16 v0, v21

    move-object/from16 v21, v8

    move v8, v7

    move/from16 v7, v22

    invoke-static/range {v9 .. v20}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v18

    const/4 v9, 0x0

    move-object/from16 v10, v34

    const/4 v11, 0x2

    invoke-static {v10, v0, v9, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v12, 0x30

    move-object/from16 v15, v35

    invoke-static {v15, v13, v14, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    move-object/from16 p0, v12

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_29

    move-object/from16 v13, v36

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_1c
    move-object/from16 v15, p0

    move-object/from16 v13, v37

    goto :goto_1d

    :cond_29
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_1c

    :goto_1d
    invoke-static {v14, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v13, v33

    invoke-static {v14, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-nez v12, :cond_2a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2b

    :cond_2a
    move-object/from16 v12, v38

    goto :goto_1f

    :cond_2b
    :goto_1e
    move-object/from16 v11, v39

    goto :goto_20

    :goto_1f
    invoke-static {v11, v14, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1e

    :goto_20
    invoke-static {v14, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x2

    int-to-float v9, v11

    const/4 v11, 0x4

    int-to-float v11, v11

    invoke-static {v9, v11, v10, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v12, v11

    move-object v11, v9

    invoke-virtual {v1}, Lhp1/d;->f()Lcp1/c;

    move-result-object v9

    move-object/from16 v34, v10

    invoke-virtual {v1}, Lhp1/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_2c

    const/4 v15, 0x1

    :goto_21
    const/16 v13, 0x100

    goto :goto_22

    :cond_2c
    const/4 v15, 0x0

    goto :goto_21

    :goto_22
    if-ne v6, v13, :cond_2d

    const/16 v16, 0x1

    :goto_23
    move/from16 v17, v8

    const/16 v8, 0x800

    goto :goto_24

    :cond_2d
    const/16 v16, 0x0

    goto :goto_23

    :goto_24
    if-ne v7, v8, :cond_2e

    const/16 v18, 0x1

    goto :goto_25

    :cond_2e
    const/16 v18, 0x0

    :goto_25
    or-int v16, v16, v18

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v16, v16, v18

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v8, v41

    if-nez v16, :cond_2f

    if-ne v13, v8, :cond_30

    :cond_2f
    move/from16 v16, v0

    goto :goto_26

    :cond_30
    move/from16 v27, v0

    move/from16 v19, v6

    move-object v0, v13

    move-object/from16 v2, v32

    move v13, v7

    goto :goto_27

    :goto_26
    new-instance v0, La81/l;

    move v13, v7

    const/4 v7, 0x7

    move/from16 v19, v6

    move/from16 v27, v16

    move-object v6, v1

    move-object v1, v3

    move-object v3, v4

    move-object v4, v2

    move-object/from16 v2, v32

    invoke-direct/range {v0 .. v7}, La81/l;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v3, v1

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_27
    check-cast v0, Lc93/a;

    move/from16 v1, v40

    or-int/lit16 v4, v1, 0x180

    or-int v4, v4, v29

    const/16 v16, 0x0

    move v5, v15

    move v15, v4

    move v4, v12

    move v12, v5

    move v7, v13

    move-object/from16 v5, v34

    const/16 v6, 0x100

    move-object v13, v0

    move/from16 v0, v19

    invoke-static/range {v9 .. v16}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lhp1/d;->f()Lcp1/c;

    move-result-object v9

    if-nez v9, :cond_35

    const v9, 0x4f0f6cec

    move/from16 v10, v17

    invoke-static {v14, v9, v10, v4, v5}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v14, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lhp1/d;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v9

    if-nez v9, :cond_31

    const v1, 0x4f10e29d

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    move v1, v9

    goto :goto_29

    :cond_31
    const/4 v9, 0x0

    const v10, 0x4f10e29e

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lhp1/d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-nez v11, :cond_32

    const v1, 0x12758b5d

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    move v1, v9

    goto :goto_28

    :cond_32
    const v10, 0x12758b5e

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    move-object/from16 v10, v21

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_33

    if-ne v13, v8, :cond_34

    :cond_33
    new-instance v13, Lh0/l0;

    const/16 v12, 0xa

    invoke-direct {v13, v10, v12}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    move-object/from16 v21, v13

    check-cast v21, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v23, v1, 0x6

    const/16 v24, 0x0

    const/16 v25, 0xffb

    move/from16 v42, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v1, v42

    invoke-static/range {v9 .. v25}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v22

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_28
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_29
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_2a

    :cond_35
    const/4 v1, 0x0

    const v9, 0x4f139e8a

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_2a
    invoke-virtual/range {p1 .. p1}, Lhp1/d;->f()Lcp1/c;

    move-result-object v9

    if-eqz v9, :cond_36

    move/from16 v15, v27

    goto :goto_2b

    :cond_36
    mul-float v15, v4, v4

    :goto_2b
    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v14, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v10, 0x1

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    if-ne v0, v6, :cond_37

    move v15, v10

    :goto_2c
    const/16 v12, 0x800

    goto :goto_2d

    :cond_37
    move v15, v1

    goto :goto_2c

    :goto_2d
    if-ne v7, v12, :cond_38

    move v0, v10

    goto :goto_2e

    :cond_38
    move v0, v1

    :goto_2e
    or-int/2addr v0, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_39

    if-ne v4, v8, :cond_3a

    :cond_39
    new-instance v4, Ljp1/b;

    const/4 v0, 0x2

    invoke-direct {v4, v3, v2, v0}, Ljp1/b;-><init>(Lcp1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    check-cast v4, Lc93/a;

    invoke-static {v4, v1, v14, v1, v10}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v4, v2

    move-object/from16 v1, v26

    goto :goto_2f

    :cond_3b
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v1, v2

    move-object v4, v6

    :goto_2f
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_3c

    new-instance v0, Lg1/m3;

    const/16 v7, 0x15

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_3c
    return-void
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lhp1/d;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    if-eqz p0, :cond_2

    sget-object v0, Ljp1/g$f;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    new-instance p1, Lcp1/i$f;

    invoke-direct {p1, p0}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p1, Lhp1/f$g;

    invoke-direct {p1, p0}, Lhp1/f$g;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljp1/g$f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lhp1/d;Lp1/c1;Lcp1/d;Lp1/c1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 13

    move-object/from16 v0, p5

    const-string v1, "$this$LazyColumn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lb30/a1;

    const/16 v2, 0x16

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lx1/b;

    const/4 v3, 0x1

    const v4, -0x2f20bb27

    invoke-direct {v2, v1, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v1, 0x3

    const/4 v4, 0x0

    invoke-static {v0, v4, v2, v1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {p0}, Lhp1/d;->e()Ljava/util/List;

    move-result-object v6

    sget-object v1, Ljp1/g$c;->w:Ljp1/g$c;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v2

    new-instance v12, Ljp1/g$d;

    invoke-direct {v12, v1, v6}, Ljp1/g$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v5, Ljp1/g$e;

    move-object v9, p0

    move-object v7, p1

    move-object v8, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    invoke-direct/range {v5 .. v11}, Ljp1/g$e;-><init>(Ljava/util/List;Lp1/c1;Lcp1/d;Lhp1/d;Lp1/c1;Lp1/c1;)V

    new-instance p0, Lx1/b;

    const p1, 0x2fd4df92

    invoke-direct {p0, v5, v3, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    move-object p1, v0

    check-cast p1, Ln0/f;

    invoke-virtual {p1, v2, v4, v12, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lhp1/d;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 35

    const-string v0, "$this$item"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lhp1/d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v23

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    move-object v10, v4

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v11, 0x5

    invoke-direct {v15, v11}, Lw3/k;-><init>(I)V

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v27, v12, 0x12

    const v28, 0x2fdf8

    move v12, v5

    move-wide v5, v6

    move v13, v8

    const-wide/16 v7, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move/from16 v19, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v16

    move/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v24

    const/16 v24, 0x0

    move-object/from16 v32, v26

    const/16 v26, 0x30

    move-object/from16 v25, v3

    move/from16 v33, v31

    move-object/from16 v34, v32

    move-object v3, v0

    move-object/from16 v0, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {p0 .. p0}, Lhp1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v5, 0x4

    if-nez v4, :cond_1

    const v0, -0x51ed79f9

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    move v0, v5

    move-object/from16 v1, v34

    goto :goto_1

    :cond_1
    const v6, -0x51ed79f8

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x2

    int-to-float v6, v6

    int-to-float v7, v5

    move-object/from16 v8, v34

    invoke-static {v6, v7, v8, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v4, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v12, v33

    invoke-virtual {v0, v3, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v0, v3, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v0, 0x5

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    const/16 v26, 0x30

    const v28, 0x2fdf8

    move v0, v5

    move-wide v5, v6

    move-object v14, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v25, v3

    move-object v3, v1

    move-object/from16 v1, v32

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_1
    const/16 v2, 0x8

    int-to-float v2, v2

    int-to-float v0, v0

    invoke-static {v2, v0, v1, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lcp1/d;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lhp1/d;)Ll83/a0;
    .locals 18

    move-object/from16 v0, p1

    sget-object v1, Ljp1/g$f;->a:[I

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v4, :cond_a

    const/4 v5, 0x2

    if-ne v1, v5, :cond_9

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v6, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->PREGNANCY_ONBOARDING:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-ne v1, v6, :cond_0

    new-instance v1, Lcp1/i$g;

    invoke-direct {v1, v2}, Lcp1/i$g;-><init>(Z)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_8

    :cond_0
    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-virtual/range {p5 .. p5}, Lhp1/d;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v6

    sget-object v7, Ljp1/g$f;->b:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    if-eq v6, v4, :cond_5

    if-eq v6, v5, :cond_1

    new-instance v7, Lzo1/b;

    const/16 v15, 0x7f

    const/16 v16, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_5

    :cond_1
    invoke-interface/range {p3 .. p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_4

    sget-object v5, Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;->NONE:Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;

    move-result-object v6

    array-length v7, v6

    :goto_0
    if-ge v2, v7, :cond_3

    aget-object v8, v6, v2

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    move-object v3, v8

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    if-nez v3, :cond_4

    move-object v3, v5

    :cond_4
    move-object v9, v3

    new-instance v4, Lzo1/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x6f

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v13}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_2
    move-object v7, v4

    goto :goto_5

    :cond_5
    invoke-interface/range {p3 .. p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_8

    sget-object v5, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->OTHER_OR_NONE_OF_THE_ABOVE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v6

    array-length v7, v6

    :goto_3
    if-ge v2, v7, :cond_7

    aget-object v8, v6, v2

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move-object v3, v8

    goto :goto_4

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez v3, :cond_8

    move-object v3, v5

    :cond_8
    move-object v8, v3

    new-instance v4, Lzo1/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x77

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v13}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :goto_5
    new-instance v2, Lcp1/i$d;

    invoke-direct {v2, v1, v7}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    invoke-interface/range {p3 .. p3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_c

    invoke-static {}, Lfp1/b;->values()[Lfp1/b;

    move-result-object v6

    array-length v7, v6

    :goto_6
    if-ge v2, v7, :cond_c

    aget-object v8, v6, v2

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    move-object v3, v8

    goto :goto_7

    :cond_b
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    :goto_7
    move-object v7, v3

    invoke-interface/range {p4 .. p4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :cond_d
    move v11, v4

    new-instance v5, Lfp1/d;

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x3dd

    const/16 v17, 0x0

    invoke-direct/range {v5 .. v17}, Lfp1/d;-><init>(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lhp1/f$c;

    invoke-direct {v2, v1, v5}, Lhp1/f$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lcp1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljp1/g$f;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ljp1/g;->n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lhp1/c;Lcp1/d;ZLc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/c;",
            "Lcp1/d;",
            "Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, 0x136232a1

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_5

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_6

    if-nez p1, :cond_4

    const/4 v6, -0x1

    goto :goto_3

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    :goto_3
    invoke-virtual {v13, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_4

    :cond_5
    const/16 v6, 0x10

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    :goto_5
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_8

    or-int/lit16 v0, v0, 0x180

    :cond_7
    move/from16 v7, p2

    goto :goto_7

    :cond_8
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_7

    move/from16 v7, p2

    invoke-virtual {v13, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x100

    goto :goto_6

    :cond_9
    const/16 v8, 0x80

    :goto_6
    or-int/2addr v0, v8

    :goto_7
    and-int/lit16 v8, v5, 0xc00

    const/16 v9, 0x800

    if-nez v8, :cond_b

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    move v8, v9

    goto :goto_8

    :cond_a
    const/16 v8, 0x400

    :goto_8
    or-int/2addr v0, v8

    :cond_b
    and-int/lit16 v8, v0, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v8, v10, :cond_c

    move v8, v11

    goto :goto_9

    :cond_c
    move v8, v12

    :goto_9
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v13, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    if-eqz v3, :cond_d

    sget-object v3, Lcp1/d;->POSTPARTUM:Lcp1/d;

    goto :goto_a

    :cond_d
    move-object/from16 v3, p1

    :goto_a
    if-eqz v6, :cond_e

    move v6, v12

    goto :goto_b

    :cond_e
    move v6, v7

    :goto_b
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v9, :cond_f

    goto :goto_c

    :cond_f
    move v11, v12

    :goto_c
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_10

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v0, v7, :cond_11

    :cond_10
    new-instance v0, Liy0/a;

    const/4 v7, 0x3

    invoke-direct {v0, v4, v7}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v18, v0

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x3

    int-to-float v7, v7

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    int-to-float v8, v12

    mul-float v11, v8, v2

    if-eqz v6, :cond_12

    const v2, -0x3c5fba50

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v2, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->i0()J

    move-result-wide v8

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_12
    const v2, -0x3c5fb578

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-static {v2, v13, v8, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_d
    new-instance v2, La31/c;

    const/16 v10, 0xa

    invoke-direct {v2, v1, v6, v3, v10}, La31/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v10, 0x2fee229e

    invoke-static {v10, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x1b0000

    const/16 v15, 0x18

    const/4 v10, 0x0

    move/from16 v20, v6

    move-object v6, v0

    move/from16 v0, v20

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    move v3, v0

    goto :goto_e

    :cond_13
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move v3, v7

    :goto_e
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Law0/h;

    const/16 v7, 0x10

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final z(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
