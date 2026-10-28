.class public abstract Lg51/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "currentMonthTitle",
        "",
        "previousArrowEnabled",
        "nextArrowEnabled",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "previousArrowClick",
        "nextArrowClick",
        "b",
        "(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lg51/a;->c(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "ZZ",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v0, p4

    move/from16 v10, p6

    const-string v2, "currentMonthTitle"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "previousArrowClick"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "nextArrowClick"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p5

    check-cast v7, Lp1/q;

    const v2, 0x3bd992c0

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v10, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_1
    move v2, v10

    :goto_1
    and-int/lit8 v5, p7, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v10, 0x30

    if-nez v6, :cond_2

    move/from16 v6, p1

    invoke-virtual {v7, v6}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v10, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p2

    invoke-virtual {v7, v9}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v2, v11

    :goto_5
    and-int/lit16 v11, v10, 0xc00

    if-nez v11, :cond_9

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_6

    :cond_8
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    :cond_9
    and-int/lit16 v11, v10, 0x6000

    if-nez v11, :cond_b

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x4000

    goto :goto_7

    :cond_a
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v2, v11

    :cond_b
    move v11, v2

    and-int/lit16 v2, v11, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x1

    if-eq v2, v12, :cond_c

    move v2, v13

    goto :goto_8

    :cond_c
    const/4 v2, 0x0

    :goto_8
    and-int/lit8 v12, v11, 0x1

    invoke-virtual {v7, v12, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    if-eqz v5, :cond_d

    move/from16 v20, v13

    goto :goto_9

    :cond_d
    move/from16 v20, v6

    :goto_9
    if-eqz v8, :cond_e

    move/from16 v37, v13

    goto :goto_a

    :cond_e
    move/from16 v37, v9

    :goto_a
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v5, 0x400c000000000000L    # 3.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v8, 0x0

    invoke-static {v2, v5, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v2, v3

    mul-float v16, v2, v6

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->g:Ll0/h;

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v6, 0x36

    invoke-static {v3, v5, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v14, Lny0/o;

    sget-object v15, Lny0/q$a;->f:Lny0/q$a;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Lih0/d0;->C(Lx81/d;)I

    move-result v16

    const/16 v25, 0x3dc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v39, v15

    move/from16 v38, v20

    sget v3, Lgy0/f;->c:I

    invoke-static {v7, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "LeftArrowIconButton"

    invoke-static {v12, v5}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shl-int/lit8 v6, v11, 0x3

    const v40, 0xe000

    and-int v8, v6, v40

    const/16 v9, 0x8

    move-object v4, v5

    const/4 v5, 0x0

    move-object v6, v14

    move-object v14, v2

    move-object v2, v6

    move-object/from16 v6, p3

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v2, "CalendarToolbar_MonthTitle"

    invoke-static {v12, v2}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v3, v11, 0xe

    invoke-static {v1, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    invoke-virtual {v14, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    invoke-virtual {v14, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v31

    const/16 v35, 0x0

    const v36, 0x2fff8

    const-wide/16 v15, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v33, v7

    move v4, v13

    move-object/from16 v41, v12

    move-object v12, v2

    move v2, v11

    move-object v11, v3

    move-object v3, v14

    move-wide v13, v5

    move-object/from16 v5, v41

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    new-instance v21, Lny0/o;

    invoke-static {v3}, Ldc/b;->D(Lx81/d;)I

    move-result v23

    const/16 v32, 0x3dc

    const/16 v33, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move/from16 v27, v37

    move-object/from16 v22, v39

    invoke-direct/range {v21 .. v33}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lgy0/f;->b:I

    invoke-static {v7, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const-string v6, "RightArrowIconButton"

    invoke-static {v5, v6}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int v8, v2, v40

    move v2, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object v6, v0

    move v0, v2

    move-object/from16 v2, v21

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    move/from16 v3, v27

    move/from16 v2, v38

    goto :goto_c

    :cond_12
    invoke-virtual {v7}, Lp1/q;->X()V

    move v2, v6

    move v3, v9

    :goto_c
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v0, Lep1/p;

    const/4 v8, 0x5

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    move v6, v10

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final c(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lg51/a;->b(Lcom/whoop/design/util/TextResource;ZZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
