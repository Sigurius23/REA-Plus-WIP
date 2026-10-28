.class public abstract Lzc1/p3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0005\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Li2/x;",
        "accentColor",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/p3;->h(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p3;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p3;->g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, -0x206610e4

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/lit8 v0, p1, 0x1

    invoke-virtual {v9, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_2

    sget-object p0, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p0, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne p0, v2, :cond_1

    new-instance p0, Li2/x;

    invoke-direct {p0, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    invoke-virtual {v9, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p0, Lp1/c1;

    invoke-static {p0}, Lzc1/p3;->e(Lp1/c1;)J

    move-result-wide v0

    new-instance v2, Lcom/whoop/profile/view/edit/c;

    const/16 v3, 0x9

    invoke-direct {v2, v3, p0}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const p0, 0x66090c55

    invoke-static {p0, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0x6000

    const/16 v11, 0xe

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v0 .. v11}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_3

    new-instance v0, Lzc1/l2;

    const/16 v1, 0x1b

    invoke-direct {v0, p1, v1}, Lzc1/l2;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final e(Lp1/c1;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/x;

    iget-wide v0, p0, Li2/x;->a:J

    return-wide v0
.end method

.method private static final f(Lp1/c1;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "J)V"
        }
    .end annotation

    new-instance v0, Li2/x;

    invoke-direct {v0, p1, p2}, Li2/x;-><init>(J)V

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 49

    const/high16 v0, 0x42200000    # 40.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/high16 v1, 0x42a00000    # 80.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/high16 v2, 0x42480000    # 50.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x41c80000    # 25.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/high16 v5, 0x42700000    # 60.0f

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    and-int/lit8 v7, p2, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x2

    if-eq v7, v10, :cond_0

    move v7, v9

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    and-int/lit8 v11, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    int-to-float v7, v10

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v7, v10

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v10}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v15, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v15, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 p1, v14

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    :cond_2
    move-object/from16 p1, v14

    :goto_2
    invoke-static {v12, v15, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v15, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v7, v15, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v16

    const/16 v21, 0x0

    const/16 v22, 0x1d

    move/from16 v18, v12

    move-object v14, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    move-object/from16 v19, v15

    move-wide/from16 v14, v16

    const-wide/16 v16, 0x0

    move/from16 v24, v18

    move-object/from16 v34, v19

    const-wide/16 v18, 0x0

    move-object/from16 v38, v0

    move-object/from16 v40, v1

    move-object/from16 v39, v6

    move-object/from16 v6, v20

    move/from16 v1, v24

    move-object/from16 v20, v34

    move-object/from16 v0, p1

    invoke-static/range {v12 .. v22}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v41

    move-object/from16 v15, v20

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v12, v13, :cond_4

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v12, Lp1/c1;

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 p1, v12

    const-string v12, "first transition"

    move-object/from16 p2, v13

    const/16 v13, 0x30

    move-object/from16 v42, v2

    const/4 v2, 0x0

    invoke-static {v14, v12, v15, v13, v2}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v2

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v13, Lb2/e;->K:Lb2/l;

    sget-object v12, Ll0/m;->g:Ll0/h;

    move-object/from16 v43, v2

    const/16 v2, 0x36

    invoke-static {v12, v13, v15, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object/from16 v18, v13

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v44, v5

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-eqz v5, :cond_5

    invoke-virtual {v15, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_5
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v15, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v12, v15, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, v15, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v32

    invoke-virtual {v7, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v12

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v36, v2, 0x12

    const v37, 0x2fffa

    move-object/from16 v19, v15

    move-wide v14, v12

    const-string v12, "Toggle Animation"

    const/4 v13, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const/16 v5, 0x30

    const-wide/16 v16, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const-wide/16 v21, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const-wide/16 v25, 0x0

    move-object/from16 v28, v27

    const/16 v27, 0x0

    move-object/from16 v29, v28

    const/16 v28, 0x0

    move-object/from16 v30, v29

    const/16 v29, 0x0

    move-object/from16 v31, v30

    const/16 v30, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v35, v33

    const/16 v33, 0x0

    move-object/from16 v45, v35

    const/16 v35, 0x6

    move-object/from16 v2, p1

    move-object/from16 v5, v45

    move/from16 v45, v1

    move-object/from16 v1, p2

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v34

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v1, :cond_8

    new-instance v13, Lzc1/n0;

    const/16 v14, 0xd

    invoke-direct {v13, v14, v2}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v18, 0x30

    const/16 v19, 0x1c

    const/4 v14, 0x0

    move-object/from16 v34, v15

    const/4 v15, 0x0

    move-object/from16 v17, v34

    move-object/from16 v16, v41

    invoke-static/range {v12 .. v19}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v17

    const/4 v2, 0x1

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v15, v12}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v12, Ll0/m;->a:Ll0/e;

    const/16 v13, 0x30

    invoke-static {v12, v5, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move-object/from16 v16, v12

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    move-object/from16 v22, v1

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v23, v7

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_9

    invoke-virtual {v15, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v15, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v12, v15, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v15, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Ll0/t1;->a:Ll0/t1;

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v12, 0x1

    invoke-virtual {v1, v10, v12, v7}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    move-object/from16 v24, v3

    move-object/from16 v14, v42

    move-object/from16 v3, v44

    invoke-direct {v12, v14, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v17, v13

    new-instance v13, Ll83/k;

    const/high16 v18, 0x42be0000    # 95.0f

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    move-object/from16 v3, v40

    invoke-direct {v13, v3, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v12, v13}, [Ll83/k;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    sget-object v7, Lx81/b;->a:Lx81/b;

    sget v12, Lx81/b;->b:I

    invoke-virtual {v7, v15, v12}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v13

    invoke-virtual {v13}, Ly81/a;->a()J

    move-result-wide v18

    const/16 v20, 0x0

    const/16 v21, 0x30

    move-object/from16 v13, v17

    const/16 v17, 0x0

    move-object/from16 v25, v16

    move-wide/from16 v47, v18

    move-object/from16 v19, v15

    move-wide/from16 v15, v47

    const/16 v18, 0x0

    move-object/from16 v26, v7

    move/from16 v46, v12

    move-object/from16 v3, v25

    move-object/from16 v7, v42

    move-object/from16 v12, v43

    invoke-static/range {v12 .. v21}, Lb21/d;->j(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v19

    const/4 v13, 0x1

    invoke-static {v10, v2, v15, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v15, v13}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v13, 0x30

    invoke-static {v3, v5, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->i0()V

    move-object/from16 v27, v5

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-eqz v5, :cond_c

    invoke-virtual {v15, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v15, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v12, v15, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v15, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-virtual {v1, v10, v13, v3}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v3, Ll83/k;

    const/high16 v12, 0x41200000    # 10.0f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    move-object/from16 v13, v39

    invoke-direct {v3, v13, v12}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v12, Ll83/k;

    const/high16 v14, 0x41f00000    # 30.0f

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    invoke-direct {v12, v4, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    move-object/from16 v14, v38

    invoke-direct {v4, v14, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const/high16 v16, 0x428c0000    # 70.0f

    move-object/from16 v17, v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    move-object/from16 v13, v44

    invoke-direct {v7, v13, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const/high16 v16, 0x42b40000    # 90.0f

    move-object/from16 v28, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object/from16 v29, v8

    move-object/from16 v8, v40

    invoke-direct {v5, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v12, v4, v7, v5}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    move-object/from16 v3, v26

    move/from16 v4, v46

    invoke-virtual {v3, v15, v4}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v5

    invoke-virtual {v5}, Ly81/a;->a()J

    move-result-wide v7

    new-instance v5, Ll83/k;

    invoke-direct {v5, v14, v13}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v20, 0x6000

    const/16 v21, 0x0

    move-object/from16 v13, v17

    const/16 v17, 0x1

    move-object v14, v1

    move-object/from16 v18, v5

    move-object/from16 v19, v15

    move-object/from16 v1, v39

    move-object/from16 v12, v43

    move-wide v15, v7

    invoke-static/range {v12 .. v21}, Lb21/d;->j(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v19

    const/4 v13, 0x1

    invoke-static {v10, v2, v15, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v7, v25

    move-object/from16 v5, v27

    const/16 v13, 0x30

    invoke-static {v7, v5, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v15, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_f
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v15, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_8

    :cond_10
    :goto_7
    move-object/from16 v0, v29

    goto :goto_9

    :cond_11
    :goto_8
    invoke-static {v7, v15, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v15, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v28

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v13, 0x1

    invoke-virtual {v0, v10, v13, v7}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v5, Ll83/k;

    move-object/from16 v6, v24

    invoke-direct {v5, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const/high16 v6, 0x42960000    # 75.0f

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/high16 v7, 0x42c80000    # 100.0f

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-direct {v1, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v1}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lb21/f;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    invoke-virtual {v3, v15, v4}, Lx81/b;->a(Landroidx/compose/runtime/Composer;I)Ly81/a;

    move-result-object v1

    invoke-virtual {v1}, Ly81/a;->a()J

    move-result-wide v3

    const/16 v20, 0x0

    const/16 v21, 0x30

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v13, v0

    move-object/from16 v19, v15

    move-wide v15, v3

    invoke-static/range {v12 .. v21}, Lb21/d;->j(Ld0/z1;Landroidx/compose/ui/Modifier;Ljava/util/List;JZLl83/k;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v15, v19

    const/4 v13, 0x1

    invoke-static {v10, v2, v15, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v15, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v0, v23

    move/from16 v1, v45

    invoke-virtual {v0, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->l0()J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->Z()J

    move-result-wide v2

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v15, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->h0()J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v4, v5, v2}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v22

    if-ne v0, v1, :cond_12

    new-instance v0, Lzc1/p3$a;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lzc1/p3$a;-><init>(Lp1/c1;)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v14, v0

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x180

    const/16 v17, 0x2

    const/4 v13, 0x0

    invoke-static/range {v12 .. v17}, Lbd1/e;->b(Ljava/util/List;Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x1

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_13
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/p3;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j(Lp1/c1;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p3;->f(Lp1/c1;J)V

    return-void
.end method
