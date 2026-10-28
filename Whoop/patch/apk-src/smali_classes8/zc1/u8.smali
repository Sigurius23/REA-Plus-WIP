.class public abstract Lzc1/u8;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
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

    invoke-static {p0, p1, p2}, Lzc1/u8;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 41

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, -0x7d0d0ea4

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v14, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v14, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v14, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v14, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v14, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Trend Tile With Unused Content Closure"

    const/4 v4, 0x6

    invoke-static {v2, v14, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x2

    int-to-float v5, v2

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v14, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v6, Ly71/g;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/a0;->d()I

    move-result v8

    const/4 v9, 0x0

    invoke-direct {v6, v8, v9, v2, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v18, "TITLE"

    move-object v8, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v10, "86%"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const-string v11, "84%"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object v12, v6

    new-instance v6, Ly71/g;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v13

    invoke-virtual {v13}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v13

    invoke-virtual {v13}, Lgz0/k0;->e()I

    move-result v13

    invoke-direct {v6, v13, v9, v2, v9}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v13, Lx81/d;->b:I

    invoke-virtual {v7, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->Z()J

    move-result-wide v15

    sget-object v19, Lzc1/k1;->a:Lzc1/k1;

    move/from16 v17, v13

    invoke-virtual/range {v19 .. v19}, Lzc1/k1;->g()Lc93/m;

    move-result-object v13

    sget v20, Ly71/g;->c:I

    shl-int/lit8 v21, v20, 0x3

    sget v22, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v23, v22, 0x6

    or-int v24, v21, v23

    shl-int/lit8 v25, v22, 0x9

    or-int v24, v24, v25

    shl-int/lit8 v22, v22, 0xc

    or-int v22, v24, v22

    shl-int/lit8 v20, v20, 0xf

    or-int v20, v22, v20

    move-object/from16 v22, v8

    move-wide/from16 v39, v15

    move-object v15, v7

    move-wide/from16 v7, v39

    const/16 v16, 0x30

    move/from16 v26, v17

    const/16 v17, 0x781

    move/from16 v27, v1

    const/4 v1, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move/from16 v29, v4

    move-object v4, v10

    const/4 v10, 0x0

    move/from16 v30, v5

    move-object v5, v11

    const/4 v11, 0x0

    move/from16 v31, v2

    move-object v2, v12

    const/4 v12, 0x0

    move-object/from16 p0, v15

    move/from16 v15, v20

    move-object/from16 v35, v22

    move/from16 v32, v26

    move/from16 v0, v30

    invoke-static/range {v1 .. v17}, Lc41/v5;->e(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v35

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Trend Tile with Content Closure"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Ly71/g;

    invoke-virtual/range {p0 .. p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a0;->d()I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v4, v6, v5, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v34, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "79%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v7, "76%"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Ly71/g;

    invoke-virtual/range {p0 .. p0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v9

    invoke-virtual {v9}, Lgz0/k0;->d()I

    move-result v9

    invoke-direct {v8, v9, v6, v5, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, p0

    move/from16 v10, v32

    invoke-virtual {v9, v14, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b0()J

    move-result-wide v10

    invoke-virtual/range {v19 .. v19}, Lzc1/k1;->h()Lc93/m;

    move-result-object v13

    const/4 v1, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move/from16 v31, v5

    move-object/from16 v33, v6

    move-object v5, v7

    move-object v6, v8

    move-wide v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v36, v35

    invoke-static/range {v1 .. v17}, Lc41/v5;->e(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v36

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Trend Tile Multiple Content"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/a0;->d()I

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v4, v6, v5, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v34, v3

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v22, "93%"

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {v19 .. v19}, Lzc1/k1;->e()Lc93/m;

    move-result-object v13

    const/16 v17, 0x7f1

    move-object/from16 v35, v1

    const/4 v1, 0x0

    move/from16 v31, v5

    const/4 v5, 0x0

    move-object/from16 v33, v6

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    move/from16 v15, v24

    move/from16 v0, v34

    move-object/from16 v37, v35

    invoke-static/range {v1 .. v17}, Lc41/v5;->e(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "Show CTA"

    invoke-static {v1, v14, v0}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v0, v30

    move-object/from16 v1, v37

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Ly71/g;

    invoke-virtual/range {v20 .. v20}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->k()Lgz0/a0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/a0;->d()I

    move-result v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v2, v3, v6, v5, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v22 .. v22}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {v19 .. v19}, Lzc1/k1;->f()Lc93/m;

    move-result-object v13

    const/high16 v5, 0xc00000

    or-int v5, v21, v5

    or-int v5, v5, v23

    or-int v15, v5, v25

    const/16 v17, 0x771

    move-object/from16 v35, v1

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x1

    move-object/from16 v38, v35

    invoke-static/range {v1 .. v17}, Lc41/v5;->e(Landroidx/compose/ui/Modifier;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;JZLcom/whoop/util/TrendKey;Lrz0/f;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v38

    const/4 v1, 0x1

    invoke-static {v8, v0, v14, v1}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v1, Lzc1/t7;

    const/16 v2, 0x1c

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/t7;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u8;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
