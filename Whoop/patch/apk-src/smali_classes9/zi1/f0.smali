.class public abstract Lzi1/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "buttonText",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "kennel_release"
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

    invoke-static {}, Lzi1/f0;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzi1/f0;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILcom/whoop/design/util/TextResource;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p2

    move p2, p0

    move-object p0, p1

    move-object p1, v0

    invoke-static/range {p0 .. p5}, Lzi1/f0;->g(Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "buttonText"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, -0x1152f135

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v12, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v13, 0x12

    const/4 v6, 0x0

    if-eq v5, v13, :cond_6

    const/4 v5, 0x1

    goto :goto_5

    :cond_6
    move v5, v6

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v9, v7, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_f

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_7

    new-instance v2, Lzi1/e0;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lzi1/e0;-><init>(I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/a;

    move-object v15, v2

    goto :goto_6

    :cond_8
    move-object v15, v4

    :goto_6
    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->j0()J

    move-result-wide v7

    and-int/lit8 v10, v0, 0x70

    if-ne v10, v3, :cond_9

    const/4 v3, 0x1

    goto :goto_7

    :cond_9
    move v3, v6

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_a

    if-ne v10, v5, :cond_b

    :cond_a
    new-instance v10, Ly71/e;

    const/16 v3, 0x15

    invoke-direct {v10, v15, v3}, Ly71/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v20, v10

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    sget-object v16, Lb2/t;->w:Lb2/t;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v5, 0x3e19999a    # 0.15f

    invoke-static {v5, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v10

    sget-object v5, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v5}, Lkd1/w;->a()Lk91/a;

    move-result-object v5

    invoke-virtual {v5}, Lk91/a;->c()Lt0/i;

    move-result-object v5

    invoke-static {v3, v10, v11, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v10, 0x3ffc000000000000L    # 1.75

    double-to-float v5, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v5, v10

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->a:Ll0/e;

    move/from16 p2, v13

    const/16 v13, 0x30

    invoke-static {v11, v5, v9, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object/from16 v17, v15

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v9, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-nez v13, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_e

    :cond_d
    invoke-static {v11, v9, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a;->a()I

    move-result v3

    invoke-static {v3, v9, v6}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    new-instance v5, Li2/p;

    const/4 v6, 0x5

    invoke-direct {v5, v7, v8, v6}, Li2/p;-><init>(JI)V

    move v6, v10

    const/16 v10, 0x30

    const/16 v11, 0x3c

    move-object v7, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v8, v4

    const/4 v4, 0x0

    move v13, v8

    move-object v8, v5

    const/4 v5, 0x0

    move v14, v6

    const/4 v6, 0x0

    move-object v15, v7

    const/4 v7, 0x0

    move-object/from16 v28, v16

    move/from16 v16, v0

    move-object/from16 v0, v28

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v12

    invoke-static {v2, v14, v0, v9}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v2, v16, 0xe

    or-int/2addr v0, v2

    invoke-static {v1, v9, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v15, v9, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v26, v0, 0x12

    const v27, 0x2fffa

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v0, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 p1, v0

    const/4 v0, 0x1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v24

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v2, p1

    goto :goto_9

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v4

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lk80/l;

    const/4 v5, 0x2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lk80/l;-><init>(Lcom/whoop/design/util/TextResource;Lc93/a;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzi1/f0;->d(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
