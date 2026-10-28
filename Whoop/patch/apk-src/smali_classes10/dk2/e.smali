.class public abstract Ldk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a/\u0010\u0004\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onRetryClicked",
        "onBackPressed",
        "f",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "j",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "tilt-graph_release"
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
.method public static synthetic a(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ldk2/e;->l(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ldk2/e;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldk2/e;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ldk2/e;->i(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Ldk2/e;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x7189dafc

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v8, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v2, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    move v2, v8

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    :goto_2
    move v9, v2

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v2, v6

    goto :goto_2

    :goto_4
    and-int/lit8 v2, v9, 0x13

    const/16 v6, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v2, v6, :cond_6

    move v2, v11

    goto :goto_5

    :cond_6
    move v2, v10

    :goto_5
    and-int/lit8 v6, v9, 0x1

    invoke-virtual {v5, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_7

    new-instance v0, Ldf2/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ldf2/a;-><init>(I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v0, Lc93/a;

    move-object v12, v0

    goto :goto_6

    :cond_8
    move-object v12, v1

    :goto_6
    if-eqz v3, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    new-instance v0, Ldf2/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ldf2/a;-><init>(I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lc93/a;

    move-object v1, v0

    goto :goto_7

    :cond_a
    move-object v1, v4

    :goto_7
    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ldk2/o;->a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_8
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    invoke-static {v3, v5, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v9, 0x70

    or-int/lit8 v6, v0, 0x6

    const/16 v7, 0x1c

    const/4 v0, 0x0

    move-object/from16 v16, v2

    const/4 v2, 0x0

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v18, v4

    const/4 v4, 0x0

    move-object/from16 v19, v16

    move-object/from16 v21, v17

    move-object/from16 v20, v18

    invoke-static/range {v0 .. v7}, Lek2/c;->g(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v8

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-static {v0, v2, v13, v5}, Ld;->w(FFLb2/t;Lp1/q;)V

    int-to-float v0, v11

    mul-float/2addr v0, v2

    const/16 v17, 0x0

    const/16 v18, 0xe

    move-object v2, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v22, v14

    move v14, v0

    move-object/from16 v0, v22

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v5, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v19

    invoke-static {v5, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v5, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    move-object/from16 v0, v20

    goto :goto_b

    :cond_10
    :goto_a
    move-object/from16 v0, v21

    goto :goto_c

    :goto_b
    invoke-static {v6, v5, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v5, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lh2/c;

    const v2, 0x3e4ccccd    # 0.2f

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v3, v3}, Lh2/c;-><init>(FFFF)V

    const/4 v2, 0x0

    const/16 v3, 0x30

    invoke-static {v2, v0, v5, v3, v11}, Ldk2/l;->c(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    and-int/lit8 v0, v9, 0xe

    invoke-static {v12, v5, v0}, Ldk2/e;->j(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object v15, v1

    move-object v14, v12

    goto :goto_d

    :cond_11
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v14, v1

    move-object v15, v4

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v13, Ldk2/d;

    const/16 v18, 0x0

    move/from16 v16, p3

    move/from16 v17, p4

    invoke-direct/range {v13 .. v18}, Ldk2/d;-><init>(Lc93/a;Lc93/a;III)V

    iput-object v13, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ldk2/e;->f(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x7bf150ef

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v10, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v10

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    move/from16 v28, v2

    goto :goto_1

    :cond_1
    move/from16 v28, p2

    :goto_1
    and-int/lit8 v2, v28, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v2, v3, :cond_2

    move v2, v12

    goto :goto_2

    :cond_2
    move v2, v11

    :goto_2
    and-int/lit8 v4, v28, 0x1

    invoke-virtual {v7, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->a:Ll0/e;

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v14, v5

    mul-float/2addr v3, v14

    sget-object v5, Lb2/e;->K:Lb2/l;

    invoke-static {v3, v5}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v3

    const/16 v5, 0x36

    invoke-static {v3, v4, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v2, v10

    mul-float/2addr v2, v14

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, Lx81/d;->a:Lx81/d;

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->g()I

    move-result v2

    const/4 v3, 0x6

    invoke-static {v2, v7, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget v5, Lx81/d;->b:I

    invoke-virtual {v15, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    move-wide/from16 v38, v8

    move v9, v5

    move-wide/from16 v5, v38

    const/16 v8, 0x1b0

    move/from16 v16, v9

    const/4 v9, 0x0

    move/from16 v17, v3

    const/4 v3, 0x0

    move/from16 v10, v16

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v2, Ltj2/a;->c:I

    invoke-static {v2, v7, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v22

    invoke-virtual {v15, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v4

    move v3, v14

    new-instance v14, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v26, v8, 0x12

    const v27, 0x2fdfa

    move v8, v3

    const/4 v3, 0x0

    move v9, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    move/from16 v20, v12

    const-wide/16 v11, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v25, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v37, v30

    move-object/from16 v1, v33

    move-object/from16 v36, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/16 v2, 0x23

    int-to-float v2, v2

    mul-float v2, v2, v34

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v1, Ltj2/a;->b:I

    const/4 v2, 0x0

    invoke-static {v1, v7, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v36

    move/from16 v9, v37

    invoke-virtual {v2, v7, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v2, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v14, v9}, Lw3/k;-><init>(I)V

    const/16 v25, 0x30

    const v27, 0x2fdf8

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    sget-object v3, Lny0/v;->TextMedium:Lny0/v;

    sget v1, Ltj2/a;->a:I

    const/4 v2, 0x0

    invoke-static {v1, v7, v2}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    and-int/lit8 v1, v28, 0xe

    const/4 v14, 0x4

    if-ne v1, v14, :cond_6

    const/4 v11, 0x1

    goto :goto_4

    :cond_6
    move v11, v2

    :goto_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v11, :cond_7

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_8

    :cond_7
    new-instance v1, Ld42/o;

    const/4 v2, 0x6

    invoke-direct {v1, v0, v2}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v10, v1

    check-cast v10, Lc93/a;

    const/16 v12, 0x30

    const/16 v13, 0x79

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v11, v24

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    const/4 v1, 0x1

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    move v14, v10

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lch0/t;

    move/from16 v3, p2

    invoke-direct {v2, v3, v14, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ldk2/e;->j(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
