.class public abstract Lh90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lh90/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Lh90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/domain/model/UnitSystem;",
        "selectedUnit",
        "onUnitSelected",
        "x",
        "(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "G",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "",
        "selectedCentimeters",
        "selectedPounds",
        "activation_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lh90/b;->G(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lh90/b;->x(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic D(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0

    invoke-static {p0}, Lh90/b;->r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lh90/b;->t(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic F(Lp1/a1;)I
    .locals 0

    invoke-static {p0}, Lh90/b;->v(Lp1/a1;)I

    move-result p0

    return p0
.end method

.method private static final G(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lgf1/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lgf1/e;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 5

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x4b794518    # 1.6336152E7f

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->W0()J

    move-result-wide v0

    const/4 p2, 0x1

    int-to-float v2, p2

    const/4 v3, 0x4

    int-to-float v3, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3, v4, v0, v1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, p2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-interface {p0, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh90/b;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh90/b;->C(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh90/b;->n(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh90/b;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh90/b;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lh90/b;->H(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lh90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh90/b;->q(Lh90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lh90/b;->z(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh90/b;->p(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lh90/b;->B(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh90/b;->o(Lp1/a1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lh90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 62
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh90/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x33a88eb4

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v4

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x1

    if-eq v6, v9, :cond_6

    move v6, v11

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_28

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_7

    new-instance v3, Lh00/l0;

    const/16 v5, 0x1d

    invoke-direct {v3, v5}, Lh00/l0;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v14, v3

    goto :goto_6

    :cond_8
    move-object v14, v5

    :goto_6
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_9

    invoke-virtual {v1}, Lh90/c;->s()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_a

    invoke-virtual {v1}, Lh90/c;->o()I

    move-result v5

    invoke-static {v5, v8}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v5

    :cond_a
    check-cast v5, Lp1/a1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_b

    invoke-virtual {v1}, Lh90/c;->p()I

    move-result v6

    invoke-static {v6, v8}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v6

    :cond_b
    move-object v15, v6

    check-cast v15, Lp1/a1;

    invoke-static {v15}, Lh90/b;->v(Lp1/a1;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    and-int/lit8 v7, v0, 0x70

    if-ne v7, v4, :cond_c

    move v13, v11

    :goto_7
    move/from16 p2, v9

    goto :goto_8

    :cond_c
    const/4 v13, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x0

    if-nez v13, :cond_d

    if-ne v9, v12, :cond_e

    :cond_d
    new-instance v9, Lh90/b$a;

    invoke-direct {v9, v14, v15, v3, v10}, Lh90/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lc93/m;

    invoke-static {v8, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lh90/b;->t(Lp1/a1;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    if-ne v7, v4, :cond_f

    move v9, v11

    goto :goto_9

    :cond_f
    const/4 v9, 0x0

    :goto_9
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v9, :cond_10

    if-ne v13, v12, :cond_11

    :cond_10
    new-instance v13, Lh90/b$b;

    invoke-direct {v13, v14, v5, v3, v10}, Lh90/b$b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lc93/m;

    invoke-static {v8, v13, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lh90/b;->r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v6

    if-ne v7, v4, :cond_12

    move v4, v11

    goto :goto_a

    :cond_12
    const/4 v4, 0x0

    :goto_a
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_14

    if-ne v7, v12, :cond_13

    goto :goto_b

    :cond_13
    move-object v9, v3

    move-object/from16 v17, v5

    move-object/from16 v28, v14

    goto :goto_c

    :cond_14
    :goto_b
    new-instance v13, Lh90/b$c;

    const/16 v18, 0x0

    move-object/from16 v16, v3

    move-object/from16 v17, v5

    invoke-direct/range {v13 .. v18}, Lh90/b$c;-><init>(Lkotlin/jvm/functions/Function1;Lp1/a1;Lp1/c1;Lp1/a1;Lq83/d;)V

    move-object/from16 v28, v14

    move-object/from16 v9, v16

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v13

    :goto_c
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v3, 0x7

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v14, v4

    mul-float v22, v3, v14

    int-to-float v2, v2

    mul-float v21, v2, v14

    const/16 v24, 0x0

    const/16 v25, 0x8

    move/from16 v23, v21

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3, v8, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v3, 0xe

    invoke-static {v2, v4, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->d:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v4, v5, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-eqz v3, :cond_15

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_d
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v8, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v8, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_17

    :cond_16
    invoke-static {v5, v8, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v8, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lh90/c;->l()Lkd1/o;

    move-result-object v2

    move-object v5, v3

    invoke-virtual {v1}, Lh90/c;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object v11, v4

    invoke-virtual {v1}, Lh90/c;->q()Ljava/lang/String;

    move-result-object v4

    sget v20, Lkd1/o;->a:I

    move-object/from16 v24, v8

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v21, v8, 0x3

    or-int v21, v20, v21

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 p1, v15

    const/16 v23, 0xe

    move-object v15, v11

    move-object/from16 v11, v22

    move/from16 v22, v0

    move-object v0, v6

    move/from16 v6, v21

    move/from16 v21, v14

    move-object v14, v5

    move-object/from16 v5, v24

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v9}, Lh90/b;->r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_18

    new-instance v3, Lf1/a0;

    const/16 v4, 0x13

    invoke-direct {v3, v4, v9}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lkotlin/jvm/functions/Function1;

    or-int v4, v8, v20

    or-int/2addr v4, v8

    or-int/2addr v4, v8

    or-int/2addr v4, v8

    or-int/2addr v4, v8

    or-int/lit16 v4, v4, 0x180

    and-int/lit8 v6, v22, 0xe

    or-int/2addr v4, v6

    invoke-static {v1, v2, v3, v5, v4}, Lh90/b;->x(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v2, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x0

    invoke-static {v2, v4, v5, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_19

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    invoke-static {v4, v5, v4, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v3, v2

    const-wide/16 v29, 0x0

    cmpl-double v3, v3, v29

    const-string v31, "invalid weight; must be greater than zero"

    if-lez v3, :cond_1c

    goto :goto_f

    :cond_1c
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v32, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v2, v32

    if-lez v4, :cond_1d

    move/from16 v4, v32

    :goto_10
    const/4 v6, 0x1

    goto :goto_11

    :cond_1d
    move v4, v2

    goto :goto_10

    :goto_11
    invoke-direct {v3, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lb2/e;->N:Lb2/k;

    int-to-float v7, v6

    mul-float v33, v7, v21

    invoke-static/range {v33 .. v33}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/16 v6, 0x36

    invoke-static {v7, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object/from16 v20, v7

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-eqz v2, :cond_1e

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_12
    move-object/from16 v2, v20

    goto :goto_13

    :cond_1e
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_12

    :goto_13
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_1f

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    :cond_1f
    invoke-static {v6, v5, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v5, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v4}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual {v1}, Lh90/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lb91/d;->s()Lb91/a;

    move-result-object v20

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ly81/i;->b1()J

    move-result-wide v23

    sget v25, Lb91/a;->d:I

    shl-int/lit8 v26, v25, 0x12

    const v27, 0x2fff8

    move-object/from16 v25, v6

    move/from16 v34, v7

    const-wide/16 v6, 0x0

    move/from16 v35, v8

    const/4 v8, 0x0

    move-object/from16 v36, v9

    const/4 v9, 0x0

    move-object/from16 v37, v10

    const/4 v10, 0x0

    move-object/from16 v38, v11

    move-object/from16 v39, v12

    const-wide/16 v11, 0x0

    move-object/from16 v40, v13

    const/4 v13, 0x0

    move-object/from16 v41, v14

    const/4 v14, 0x0

    move-object/from16 v42, v15

    const/16 v43, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v44, v17

    const/16 v17, 0x0

    const/16 v45, 0x36

    const/16 v18, 0x0

    const/16 v46, 0x0

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/high16 v47, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    move/from16 v48, v21

    const/16 v21, 0x0

    move-object/from16 v49, v4

    move-wide/from16 v60, v23

    move-object/from16 v24, v5

    move-wide/from16 v4, v60

    const/16 v23, 0x0

    move-object/from16 v50, v25

    const/16 v25, 0x0

    move/from16 v58, v34

    move/from16 v55, v35

    move-object/from16 v54, v37

    move-object/from16 v51, v38

    move-object/from16 v1, v39

    move-object/from16 v59, v40

    move-object/from16 v52, v41

    move-object/from16 v53, v42

    move-object/from16 v56, v49

    move-object/from16 v57, v50

    move-object/from16 v34, v0

    move/from16 v0, v43

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    new-instance v2, Ld21/g;

    invoke-static/range {v36 .. v36}, Lh90/b;->r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v7

    invoke-static/range {v44 .. v44}, Lh90/b;->t(Lp1/a1;)I

    move-result v8

    new-instance v9, Li93/j;

    invoke-virtual/range {p0 .. p0}, Lh90/c;->i()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lh90/c;->h()I

    move-result v4

    invoke-direct {v9, v3, v4, v0}, Li93/h;-><init>(III)V

    new-instance v10, Li93/j;

    invoke-virtual/range {p0 .. p0}, Lh90/c;->f()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lh90/c;->e()I

    move-result v4

    invoke-direct {v10, v3, v4, v0}, Li93/h;-><init>(III)V

    invoke-virtual/range {p0 .. p0}, Lh90/c;->g()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lh90/c;->j()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lh90/c;->c()Ljava/lang/String;

    move-result-object v13

    move-object v6, v2

    invoke-direct/range {v6 .. v13}, Ld21/g;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_21

    new-instance v3, Lfc0/f;

    const/4 v4, 0x2

    move-object/from16 v6, v44

    invoke-direct {v3, v6, v4}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v4, Ld21/g;->h:I

    or-int/lit8 v9, v4, 0x30

    const/16 v10, 0x3c

    const/4 v4, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v24

    invoke-static/range {v2 .. v10}, Ld21/f;->e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v3, v2

    cmpl-double v3, v3, v29

    if-lez v3, :cond_22

    goto :goto_14

    :cond_22
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v2, v32

    if-lez v4, :cond_23

    move/from16 v10, v32

    goto :goto_15

    :cond_23
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_15
    invoke-direct {v3, v10, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {v33 .. v33}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move-object/from16 v4, v56

    const/16 v6, 0x36

    invoke-static {v2, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_24

    move-object/from16 v11, v51

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v14, v52

    goto :goto_17

    :cond_24
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v5, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v11, v53

    invoke-static {v5, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_25

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    :cond_25
    move-object/from16 v2, v34

    goto :goto_19

    :cond_26
    :goto_18
    move-object/from16 v2, v54

    goto :goto_1a

    :goto_19
    invoke-static {v6, v5, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v5, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v4}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-virtual/range {p0 .. p0}, Lh90/c;->z()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v4, v55

    invoke-static {v2, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v57

    move/from16 v6, v58

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v6

    const/16 v25, 0x0

    const v27, 0x2fff8

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    new-instance v2, Ls41/d;

    invoke-static/range {v36 .. v36}, Lh90/b;->r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v7

    invoke-static/range {p1 .. p1}, Lh90/b;->v(Lp1/a1;)I

    move-result v8

    new-instance v9, Li93/j;

    invoke-virtual/range {p0 .. p0}, Lh90/c;->y()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lh90/c;->x()I

    move-result v4

    invoke-direct {v9, v3, v4, v0}, Li93/h;-><init>(III)V

    new-instance v10, Li93/j;

    invoke-virtual/range {p0 .. p0}, Lh90/c;->v()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lh90/c;->u()I

    move-result v4

    invoke-direct {v10, v3, v4, v0}, Li93/h;-><init>(III)V

    invoke-virtual/range {p0 .. p0}, Lh90/c;->w()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lh90/c;->t()Ljava/lang/String;

    move-result-object v12

    move-object v6, v2

    invoke-direct/range {v6 .. v12}, Ls41/d;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_27

    new-instance v3, Lfc0/f;

    const/4 v1, 0x3

    move-object/from16 v15, p1

    invoke-direct {v3, v15, v1}, Lfc0/f;-><init>(Lp1/a1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v1, Ls41/d;->g:I

    or-int/lit8 v9, v1, 0x30

    const/16 v10, 0x3c

    const/4 v4, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, v24

    invoke-static/range {v2 .. v10}, Ls41/c;->d(Ls41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    int-to-float v1, v3

    const/16 v2, 0xd

    int-to-float v2, v2

    mul-float v2, v2, v48

    move-object/from16 v3, v59

    invoke-static {v3, v1, v2}, Landroidx/compose/foundation/layout/d;->i(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_1b

    :cond_28
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v5

    :goto_1b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_29

    new-instance v0, Lfc0/e;

    const/16 v5, 0x12

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lh90/b;->s(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh90/b;->u(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/a1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lh90/b;->w(Lp1/a1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lh90/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lh90/b;->l(Lh90/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/domain/model/UnitSystem;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/UnitSystem;

    return-object p0
.end method

.method private static final s(Lp1/c1;Lcom/whoop/domain/model/UnitSystem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/domain/model/UnitSystem;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final u(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final v(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final w(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final x(Lh90/c;Lcom/whoop/domain/model/UnitSystem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh90/c;",
            "Lcom/whoop/domain/model/UnitSystem;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x3cf531b6

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_1

    :cond_1
    move v5, v6

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v5, v8

    :cond_4
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_6
    and-int/lit16 v8, v5, 0x93

    const/16 v10, 0x92

    const/16 v31, 0x0

    const/4 v11, 0x1

    if-eq v8, v10, :cond_7

    move v8, v11

    goto :goto_5

    :cond_7
    move/from16 v8, v31

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v8, v10, :cond_8

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_8
    move-object v13, v8

    check-cast v13, Lj0/i;

    int-to-float v6, v6

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v12, v6, v8

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    invoke-static {v14, v15, v12, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v0, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v19, v10

    invoke-virtual/range {v16 .. v16}, Ly81/i;->r()J

    move-result-wide v9

    int-to-float v7, v7

    invoke-static {v12, v6, v7, v9, v10}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v9

    mul-float/2addr v7, v8

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v7, v0, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v8, v0, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v7, v6

    const-wide/16 v32, 0x0

    cmpl-double v7, v7, v32

    const-string v34, "invalid weight; must be greater than zero"

    if-lez v7, :cond_c

    goto :goto_7

    :cond_c
    invoke-static/range {v34 .. v34}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v35, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v7, v6, v35

    if-lez v7, :cond_d

    move/from16 v7, v35

    goto :goto_8

    :cond_d
    move v7, v6

    :goto_8
    invoke-direct {v12, v7, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    and-int/lit16 v5, v5, 0x380

    const/16 v7, 0x100

    if-ne v5, v7, :cond_e

    move v8, v11

    goto :goto_9

    :cond_e
    move/from16 v8, v31

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_f

    move-object/from16 v8, v19

    if-ne v9, v8, :cond_10

    goto :goto_a

    :cond_f
    move-object/from16 v8, v19

    :goto_a
    new-instance v9, Lgz/a;

    const/16 v10, 0xa

    invoke-direct {v9, v3, v10}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v17, v9

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    move-object v9, v14

    const/4 v14, 0x0

    move v10, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 v36, v13

    sget-object v13, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    if-ne v2, v13, :cond_11

    move v13, v11

    goto :goto_b

    :cond_11
    move/from16 v13, v31

    :goto_b
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_12

    new-instance v14, Lh00/l0;

    const/16 v15, 0x1b

    invoke-direct {v14, v15}, Lh00/l0;-><init>(I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v13, v14}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v1}, Lh90/c;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v13, v0, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v0, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v0, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    new-instance v6, Lw3/k;

    move-object/from16 v17, v9

    const/4 v9, 0x3

    invoke-direct {v6, v9}, Lw3/k;-><init>(I)V

    sget v18, Lb91/a;->d:I

    shl-int/lit8 v29, v18, 0x12

    const v30, 0x2fdf8

    move/from16 v19, v9

    move/from16 v18, v10

    const-wide/16 v9, 0x0

    move/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v21, v17

    move-object/from16 v17, v6

    move-object v6, v12

    const/4 v12, 0x0

    move/from16 v22, v5

    move-object v5, v13

    const/4 v13, 0x0

    move/from16 v23, v7

    move-object/from16 v24, v8

    move-wide v7, v15

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v26, v16

    const/16 v16, 0x0

    move/from16 v27, v18

    move/from16 v28, v19

    const-wide/16 v18, 0x0

    move/from16 v37, v20

    const/16 v20, 0x0

    move-object/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v22

    const/16 v22, 0x0

    move/from16 v40, v23

    const/16 v23, 0x0

    move-object/from16 v41, v24

    const/16 v24, 0x0

    move/from16 v42, v26

    const/16 v26, 0x0

    move/from16 v43, v28

    const/16 v28, 0x0

    move/from16 v45, v27

    move/from16 v1, v37

    move-object/from16 v44, v38

    move/from16 v46, v39

    move-object/from16 v48, v41

    move/from16 v47, v42

    move-object/from16 v27, v0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    float-to-double v6, v0

    cmpl-double v6, v6, v32

    if-lez v6, :cond_13

    goto :goto_c

    :cond_13
    invoke-static/range {v34 .. v34}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v0, v35

    if-lez v6, :cond_14

    move/from16 v6, v35

    goto :goto_d

    :cond_14
    move v6, v0

    :goto_d
    invoke-direct {v12, v6, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move/from16 v0, v46

    const/16 v7, 0x100

    if-ne v0, v7, :cond_15

    move v11, v1

    goto :goto_e

    :cond_15
    move/from16 v11, v31

    :goto_e
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v8, v48

    if-nez v11, :cond_16

    if-ne v0, v8, :cond_17

    :cond_16
    new-instance v0, Lgz/a;

    const/16 v6, 0xb

    invoke-direct {v0, v3, v6}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v17, v0

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, v36

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    if-ne v2, v6, :cond_18

    move v6, v1

    goto :goto_f

    :cond_18
    move/from16 v6, v31

    :goto_f
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_19

    new-instance v7, Lh00/l0;

    const/16 v8, 0x1c

    invoke-direct {v7, v8}, Lh00/l0;-><init>(I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v6, v7}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lh90/c;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v7, v47

    invoke-static {v0, v5, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v9, v44

    move/from16 v10, v45

    invoke-virtual {v9, v5, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v5, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    new-instance v9, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v9, v10}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v5

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1a
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lh02/i;

    const/4 v5, 0x2

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lh90/b;->G(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
