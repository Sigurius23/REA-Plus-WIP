.class public abstract Lry2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Llz2/b;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Llz2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "whooplabs_release"
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
.method public static synthetic a(Llz2/b;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry2/a;->f(Llz2/b;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llz2/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lry2/a;->g(Llz2/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lry2/a;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Llz2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llz2/b;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x1c5a5421

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v5, p4, 0x2

    const/16 v6, 0x20

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v2, v8

    :goto_4
    and-int/lit8 v8, v2, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x0

    if-eq v8, v9, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    move v8, v11

    :goto_5
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v0, v12, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_14

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_7

    new-instance v5, Lrx0/f;

    const/4 v7, 0x3

    invoke-direct {v5, v7}, Lrx0/f;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lc93/a;

    goto :goto_6

    :cond_8
    move-object v5, v7

    :goto_6
    invoke-virtual {v1}, Llz2/b;->d()Z

    move-result v7

    if-eqz v7, :cond_9

    const v7, -0x6f15bb9a

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-static {v7, v0, v12, v11}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v12

    goto :goto_7

    :cond_9
    invoke-virtual {v1}, Llz2/b;->c()Z

    move-result v7

    if-eqz v7, :cond_a

    const v7, -0x6f15b43a

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v7, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->u()J

    move-result-wide v12

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    const v7, -0x6f15aef7

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-static {v7, v0, v12, v11}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v12

    :goto_7
    invoke-virtual {v1}, Llz2/b;->c()Z

    move-result v7

    if-eqz v7, :cond_b

    const v7, -0x6f15a257

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-static {v7, v0, v14, v11}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    goto :goto_8

    :cond_b
    const v7, -0x6f159cba

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-static {v7, v0, v14, v11}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v14

    :goto_8
    const/high16 v7, 0x3f800000    # 1.0f

    move/from16 p2, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v3, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v18, v3, v7

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v7, v18

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v11, v4

    invoke-static {v3, v10, v11, v14, v15}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v18

    and-int/lit8 v3, v2, 0xe

    if-eq v3, v4, :cond_d

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_c

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_9

    :cond_c
    const/4 v3, 0x0

    goto :goto_a

    :cond_d
    :goto_9
    const/4 v3, 0x1

    :goto_a
    and-int/lit8 v2, v2, 0x70

    if-ne v2, v6, :cond_e

    const/4 v2, 0x1

    goto :goto_b

    :cond_e
    const/4 v2, 0x0

    :goto_b
    or-int/2addr v2, v3

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_f

    if-ne v3, v8, :cond_10

    :cond_f
    new-instance v3, Lqt2/e;

    const/16 v2, 0x14

    invoke-direct {v3, v2, v1, v5}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v22, v3

    check-cast v22, Lc93/a;

    const/16 v23, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v3, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v4, v0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Llz2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v0, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->P()Lb91/a;

    move-result-object v22

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v26, v4, 0x12

    const v27, 0x2fff8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-wide/from16 v29, v12

    move-object v13, v5

    move-wide/from16 v4, v29

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/16 v18, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x30

    move-object/from16 p1, v24

    move-object/from16 v24, v0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, p1

    goto :goto_d

    :cond_14
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v7

    :goto_d
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Lqk2/i;

    const/16 v5, 0xa

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Llz2/b;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Llz2/b;->d()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llz2/b;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lry2/a;->d(Llz2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
