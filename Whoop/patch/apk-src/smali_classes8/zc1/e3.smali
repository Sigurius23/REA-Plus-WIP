.class public abstract Lzc1/e3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0006\u00b2\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "imperialCm",
        "metricCm",
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
.method public static synthetic a(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/e3;->j(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/e3;->i(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/e3;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 44

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v1, -0x176b22cc

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v10, 0x1

    if-eqz p1, :cond_0

    move v1, v10

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v7, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    invoke-static {v3, v2, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v1, v12, :cond_4

    const/16 v1, 0xb2

    invoke-static {v1, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v1

    :cond_4
    move-object v13, v1

    check-cast v13, Lp1/a1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_5

    const/16 v1, 0xaa

    invoke-static {v1, v7}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v1

    :cond_5
    move-object v14, v1

    check-cast v14, Lp1/a1;

    const-string v1, "Height Picker - Imperial"

    const/4 v15, 0x6

    invoke-static {v1, v7, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v16, Ld21/g;

    sget-object v17, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    invoke-static {v13}, Lzc1/e3;->e(Lp1/a1;)I

    move-result v18

    new-instance v1, Li93/j;

    const/4 v2, 0x3

    const/16 v3, 0x8

    invoke-direct {v1, v2, v3, v10}, Li93/h;-><init>(III)V

    new-instance v5, Li93/j;

    const/16 v6, 0x5a

    const/16 v8, 0xfa

    invoke-direct {v5, v6, v8, v10}, Li93/h;-><init>(III)V

    const-string v22, "in"

    const-string v23, "cm"

    const-string v21, "ft"

    move-object/from16 v19, v1

    move-object/from16 v20, v5

    invoke-direct/range {v16 .. v23}, Ld21/g;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_6

    new-instance v1, Lfc0/f;

    const/16 v5, 0xb

    invoke-direct {v1, v13, v5}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v5, Ld21/g;->h:I

    or-int/2addr v4, v5

    const/16 v9, 0x3c

    move v5, v3

    const/4 v3, 0x0

    move/from16 v17, v8

    move v8, v4

    const/4 v4, 0x0

    move/from16 v18, v5

    const/4 v5, 0x0

    move/from16 v19, v6

    const/4 v6, 0x0

    move-object v2, v1

    move-object/from16 v1, v16

    invoke-static/range {v1 .. v9}, Ld21/f;->e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    move/from16 v28, v8

    invoke-static {v13}, Lzc1/e3;->e(Lp1/a1;)I

    move-result v1

    const-string v2, "Selected: "

    const-string v3, " cm"

    invoke-static {v1, v2, v3}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->l0()J

    move-result-wide v8

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->q()Lb91/a;

    move-result-object v21

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v25, v6, 0x12

    const v26, 0x2fffa

    move-object v6, v2

    const/4 v2, 0x0

    move v13, v5

    move-object/from16 v16, v6

    const-wide/16 v5, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    move-object/from16 v17, v3

    move-wide/from16 v42, v8

    move-object v9, v4

    move-wide/from16 v3, v42

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    move-object/from16 v20, v11

    const-wide/16 v10, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v24, v13

    const/4 v13, 0x0

    move-object/from16 v29, v14

    move/from16 v30, v15

    const-wide/16 v14, 0x0

    move-object/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 v32, v17

    const/16 v17, 0x0

    move-object/from16 v33, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move-object/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move-object/from16 p0, v29

    move-object/from16 v39, v31

    move-object/from16 v0, v35

    move-object/from16 v40, v36

    move/from16 v38, v37

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v23

    const/4 v1, 0x5

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v10, v1, v2

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Height Picker - Metric"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Ld21/g;

    sget-object v12, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    invoke-static/range {p0 .. p0}, Lzc1/e3;->g(Lp1/a1;)I

    move-result v13

    new-instance v14, Li93/j;

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/16 v5, 0x8

    invoke-direct {v14, v2, v5, v3}, Li93/h;-><init>(III)V

    new-instance v15, Li93/j;

    const/16 v2, 0xfa

    const/16 v4, 0x5a

    invoke-direct {v15, v4, v2, v3}, Li93/h;-><init>(III)V

    const-string v17, "in"

    const-string v18, "cm"

    const-string v16, "ft"

    move-object v11, v1

    invoke-direct/range {v11 .. v18}, Ld21/g;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v4, v40

    if-ne v2, v4, :cond_7

    new-instance v2, Lfc0/f;

    const/16 v4, 0xc

    move-object/from16 v11, p0

    invoke-direct {v2, v11, v4}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    move-object/from16 v11, p0

    :goto_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/16 v9, 0x3c

    move/from16 v19, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v8, v28

    invoke-static/range {v1 .. v9}, Ld21/f;->e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v11}, Lzc1/e3;->g(Lp1/a1;)I

    move-result v1

    move-object/from16 v2, v32

    move-object/from16 v6, v39

    invoke-static {v1, v6, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v9, v33

    move/from16 v13, v38

    invoke-virtual {v9, v7, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->l0()J

    move-result-wide v3

    invoke-virtual {v9, v7, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->q()Lb91/a;

    move-result-object v21

    const/16 v24, 0x0

    const v26, 0x2fffa

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v41, v27

    invoke-static/range {v1 .. v26}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v23

    move/from16 v14, v41

    const/4 v3, 0x1

    invoke-static {v0, v14, v7, v3}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_3

    :cond_8
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lzc1/l2;

    const/16 v2, 0x10

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/l2;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final f(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final g(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final h(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final i(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/e3;->f(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/e3;->h(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/e3;->d(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
