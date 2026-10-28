.class public abstract Lzc1/q7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "selectedNumber",
        "selectedHeight",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q7;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q7;->j(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/q7;->i(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v1, 0x5b85aefc

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v13, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_9

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v13, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v13, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_4

    const-string v2, "--"

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    const-string v5, "5 ft"

    invoke-static {v5}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lp1/c1;

    const-string v6, "Spinner Selector \u2013 Numbers"

    const/4 v7, 0x6

    invoke-static {v6, v13, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v18, "4"

    const-string v19, "5"

    const-string v14, "--"

    const-string v15, "1"

    const-string v16, "2"

    const-string v17, "3"

    filled-new-array/range {v14 .. v19}, [Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v4, :cond_6

    new-instance v8, Lzc1/n5;

    const/16 v9, 0x14

    invoke-direct {v8, v9, v2}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v12, v8

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/16 v15, 0x30

    const/16 v16, 0x3fe

    move v8, v1

    sget-object v1, Ll0/z;->a:Ll0/z;

    move-object v9, v3

    const/4 v3, 0x0

    move-object v10, v4

    const/4 v4, 0x0

    move-object v11, v5

    const/4 v5, 0x0

    move-object v14, v2

    move-object v2, v6

    const/4 v6, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v14

    const/16 v14, 0x36

    move-object/from16 v0, v19

    move-object/from16 v27, v20

    move-object/from16 p0, v21

    invoke-static/range {v1 .. v16}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v28, v1

    invoke-static/range {v22 .. v22}, Lzc1/q7;->e(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Selected: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->l0()J

    move-result-wide v5

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v21

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v25, v3, 0x12

    const v26, 0x2fffa

    move-object v3, v2

    const/4 v2, 0x0

    move-object v7, v3

    move-wide v3, v5

    const-wide/16 v5, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const-wide/16 v14, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move-object/from16 v30, v29

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v23

    const/4 v1, 0x5

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Spinner Selector \u2013 Custom Height & Style"

    const/4 v3, 0x6

    invoke-static {v2, v13, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v2, Li93/j;

    const/4 v3, 0x3

    const/4 v4, 0x7

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5}, Li93/h;-><init>(III)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    move-object v4, v2

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_7

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " ft"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    const/16 v2, 0x28

    int-to-float v2, v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v13, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v10, v27

    if-ne v8, v10, :cond_8

    new-instance v8, Lzc1/n5;

    const/16 v9, 0x15

    move-object/from16 v10, p0

    invoke-direct {v8, v9, v10}, Lzc1/n5;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    move-object/from16 v10, p0

    :goto_3
    move-object v12, v8

    check-cast v12, Lkotlin/jvm/functions/Function1;

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v8, v17, 0x9

    const/16 v9, 0x6006

    or-int v14, v9, v8

    const/16 v15, 0x30

    const/16 v16, 0x3f2

    move/from16 v18, v5

    move v5, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v8, v6

    const/4 v6, 0x0

    move-object v9, v4

    move-object v4, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v27, v0

    move/from16 v31, v1

    move-object/from16 v0, v19

    move/from16 v32, v20

    move-object/from16 v1, v28

    invoke-static/range {v1 .. v16}, Lu31/e;->j(Ll0/y;Ljava/util/List;ILb91/a;FIZLb2/f;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    invoke-static/range {v21 .. v21}, Lzc1/q7;->g(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v30

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move/from16 v8, v32

    invoke-virtual {v0, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->l0()J

    move-result-wide v3

    invoke-virtual {v0, v13, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->q()Lb91/a;

    move-result-object v21

    shl-int/lit8 v25, v17, 0x12

    const v26, 0x2fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v23

    move-object/from16 v0, v27

    move/from16 v1, v31

    const/4 v5, 0x1

    invoke-static {v0, v1, v13, v5}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_4

    :cond_9
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lzc1/g6;

    const/16 v2, 0x1c

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/g6;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final e(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final f(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final h(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzc1/q7;->f(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lzc1/q7;->h(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q7;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
