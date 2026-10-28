.class public abstract Lgt1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lft1/c$g;",
        "state",
        "Ll83/a0;",
        "c",
        "(Lft1/c$g;Landroidx/compose/runtime/Composer;I)V",
        "labrador_release"
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
.method public static synthetic a(Lft1/c$g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgt1/f;->e(Lft1/c$g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lft1/c$g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lgt1/f;->d(Lft1/c$g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lft1/c$g;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "state"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x71b2a559

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    if-eq v5, v4, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v7, v9, v2, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v2, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lft1/c$g;->v()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    int-to-float v7, v4

    mul-float/2addr v7, v8

    const/4 v8, 0x0

    invoke-static {v5, v7, v8, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v5, v2, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v27, v5, 0x12

    const v28, 0x2fff8

    move-wide/from16 v29, v8

    move v9, v6

    move-wide/from16 v5, v29

    const-wide/16 v7, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    const/16 v26, 0x30

    move/from16 v29, v25

    move-object/from16 v25, v2

    move/from16 v2, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    sget-object v4, Lb3/v1;->n:Lp1/u2;

    sget-object v5, Ly3/m;->w:Ly3/m;

    invoke-virtual {v4, v5}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v5, Lej1/h;

    const/16 v6, 0x15

    invoke-direct {v5, v0, v6}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    const v6, -0x39fec771

    invoke-static {v6, v3, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v3, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lgt1/d;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lgt1/d;-><init>(Lft1/c$g;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(Lft1/c$g;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v2, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, 0x3fd55555

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lft1/c$g;->w()Lh71/j;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lft1/c$g;->g()J

    move-result-wide v8

    int-to-float v0, v3

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/16 v1, 0xa

    const/4 v2, 0x0

    invoke-static {v0, v2, v0, v2, v1}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v12

    sget v0, Lh71/j;->g:I

    shl-int/lit8 v0, v0, 0x3

    const v1, 0xc00006

    or-int v16, v0, v1

    const/16 v17, 0x36c

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v17}, Lh71/g;->l(Landroidx/compose/ui/Modifier;Lh71/j;Lh71/i;Li71/b;JLkotlin/jvm/functions/Function1;Lf0/r1;Ll0/k1;Ld61/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lft1/c$g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lgt1/f;->c(Lft1/c$g;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
