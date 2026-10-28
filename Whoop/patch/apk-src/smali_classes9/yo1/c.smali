.class public abstract Lyo1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyo1/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001aK\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lyo1/d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lyn1/a;",
        "Ll83/a0;",
        "onAnalyticEvent",
        "Lcom/whoop/design/models/modal/DecodedGenericInteraction;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lhy0/b2;",
        "",
        "h",
        "(Lhy0/b2;)Ljava/lang/String;",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lyo1/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyo1/c;->f(Lkotlin/jvm/functions/Function1;Lyo1/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lyo1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lyo1/c;->e(Lkotlin/jvm/functions/Function1;Lyo1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lyo1/c;->g(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lyo1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAnalyticEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, 0x49c5c5da

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v5, 0x6

    move v6, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v5, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v5, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v9

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_9

    invoke-virtual {v15, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_5

    :cond_8
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_9
    and-int/lit16 v7, v6, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v7, v10, :cond_a

    move v7, v12

    goto :goto_6

    :cond_a
    move v7, v11

    :goto_6
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v15, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    if-eqz v0, :cond_b

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_b
    move-object v0, v1

    :goto_7
    and-int/lit16 v1, v6, 0x380

    if-ne v1, v9, :cond_c

    move v1, v12

    goto :goto_8

    :cond_c
    move v1, v11

    :goto_8
    and-int/lit8 v7, v6, 0x70

    if-eq v7, v8, :cond_d

    and-int/lit8 v7, v6, 0x40

    if-eqz v7, :cond_e

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_d
    move v11, v12

    :cond_e
    or-int/2addr v1, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_f

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v7, v1, :cond_10

    :cond_f
    new-instance v7, Lyo1/c$a;

    const/4 v1, 0x0

    invoke-direct {v7, v3, v2, v1}, Lyo1/c$a;-><init>(Lkotlin/jvm/functions/Function1;Lyo1/d;Lq83/d;)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lc93/m;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v15, v7, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lx30/f1;

    const/16 v7, 0x8

    invoke-direct {v1, v7, v4, v2}, Lx30/f1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x6121316a

    invoke-static {v7, v15, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    and-int/lit8 v1, v6, 0xe

    const/high16 v6, 0xc00000

    or-int v16, v1, v6

    const/16 v17, 0x7e

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v17}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v6

    goto :goto_9

    :cond_11
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lw71/k;

    const/16 v7, 0x11

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lw71/k;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lyo1/d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v2, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v6, v2, :cond_2

    :cond_1
    new-instance v6, Lyo1/b;

    const/4 v2, 0x0

    invoke-direct {v6, v2, v0, v1}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object/from16 v17, v6

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v2, v13

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v7, v5, v6

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v12, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, Ll0/m;->g:Ll0/h;

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v0, 0x36

    invoke-static {v15, v4, v12, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move/from16 p2, v5

    move/from16 p3, v6

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v12, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    invoke-static {v5, v12, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v7

    invoke-virtual {v1}, Lyo1/d;->a()Ljava/lang/String;

    move-result-object v7

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v15

    move-object/from16 v17, v0

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v0, v10

    const-wide/16 v33, 0x0

    cmpl-double v0, v0, v33

    const-string v1, "invalid weight; must be greater than zero"

    if-lez v0, :cond_9

    :goto_3
    move-object v0, v8

    goto :goto_4

    :cond_9
    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_3

    :goto_4
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v35, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v18, v10, v35

    if-lez v18, :cond_a

    move/from16 v10, v35

    :goto_5
    move-object/from16 v18, v0

    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_5

    :goto_6
    invoke-direct {v8, v10, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v31, v0, 0x12

    const v32, 0x2fff8

    move-object v0, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object v10, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v9

    move-wide/from16 v44, v15

    move-object/from16 v16, v10

    move-wide/from16 v9, v44

    const/4 v15, 0x0

    move-object/from16 v22, v16

    move-object/from16 v21, v17

    const-wide/16 v16, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    move-object/from16 v25, v21

    const-wide/16 v20, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v25

    const/16 v25, 0x0

    move-object/from16 v38, v26

    const/16 v26, 0x0

    move-object/from16 v39, v28

    const/16 v28, 0x0

    move-object/from16 v40, v30

    const/16 v30, 0x0

    move-object/from16 v41, v36

    move-object/from16 v36, v1

    move-object/from16 v1, v41

    move-object/from16 v41, v38

    move-object/from16 v38, v3

    move-object/from16 v3, v41

    move-object/from16 v41, v0

    move-object/from16 v0, v39

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    sget-object v7, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v7

    const/4 v8, 0x6

    invoke-static {v7, v12, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    sget v8, Lxn1/c;->p:I

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v10

    const/4 v9, 0x3

    int-to-float v9, v9

    const/4 v13, 0x4

    int-to-float v15, v13

    mul-float/2addr v9, v15

    move v13, v9

    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v14, v13

    const/16 v13, 0x180

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v42, v16

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    mul-float v7, p2, v15

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v4, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_b

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v12, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    move-object/from16 v4, v41

    goto :goto_9

    :cond_d
    move-object/from16 v4, v41

    :goto_8
    move-object/from16 v13, v38

    goto :goto_a

    :goto_9
    invoke-static {v8, v12, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lyo1/d;->c()Ljava/lang/String;

    move-result-object v17

    const/16 v21, 0xe

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v11, Lkd1/o$c;->f:I

    move-object/from16 v29, v12

    const/4 v12, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v7, v16

    move-object/from16 v10, v29

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object v12, v10

    sget v8, Lxn1/c;->o:I

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x5

    int-to-float v9, v9

    mul-float/2addr v9, v15

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v10, v15

    const/16 v15, 0x180

    const/16 v16, 0x78

    move v11, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v38, v13

    const/4 v13, 0x0

    move-object/from16 v39, v2

    move/from16 v43, v14

    move-object/from16 v14, v29

    move-object/from16 v2, v38

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v7, v10

    cmpl-double v7, v7, v33

    if-lez v7, :cond_e

    goto :goto_b

    :cond_e
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v10, v35

    if-lez v7, :cond_f

    move/from16 v10, v35

    :cond_f
    const/4 v7, 0x1

    invoke-direct {v13, v10, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    mul-float v14, v7, p3

    const/16 v17, 0x0

    const/16 v18, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v8, v37

    move-object/from16 v9, v40

    const/4 v10, 0x0

    invoke-static {v8, v9, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_10

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v9, v12, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lyo1/d;->g()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual/range {p1 .. p1}, Lyo1/d;->f()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_13

    const v0, 0x5b12a9fb

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    move-object/from16 v2, v39

    :goto_d
    const/4 v7, 0x1

    goto :goto_e

    :cond_13
    const v0, 0x5b12a9fc

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const-wide v0, 0x3fc3333333333333L    # 0.15

    double-to-float v0, v0

    move-object/from16 v2, v39

    move/from16 v14, v43

    invoke-static {v0, v14, v2, v12}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lyo1/d;->h()Lhy0/c2;

    move-result-object v0

    if-nez v0, :cond_14

    const v0, -0x97376a7

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    :goto_f
    move/from16 v13, v42

    const/4 v7, 0x1

    goto :goto_10

    :cond_14
    const v1, -0x97376a6

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget v1, Lhy0/c2;->p:I

    invoke-static {v0, v12, v1}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-static {v12, v7, v2, v13, v12}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {p1 .. p1}, Lyo1/d;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    invoke-virtual {v5, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_15
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lyo1/d;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lyo1/d;->e()Lcom/whoop/design/models/modal/DecodedGenericInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lyo1/c;->d(Landroidx/compose/ui/Modifier;Lyo1/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lhy0/b2;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyo1/c$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const-string p0, "unknown"

    return-object p0

    :pswitch_0
    const-string p0, "processing"

    return-object p0

    :pswitch_1
    const-string p0, "not_sent"

    return-object p0

    :pswitch_2
    const-string p0, "sent"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
