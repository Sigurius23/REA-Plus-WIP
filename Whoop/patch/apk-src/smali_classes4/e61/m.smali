.class public abstract Le61/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le61/m$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "Lj61/c;",
        "selectionState",
        "Ll83/a0;",
        "i",
        "(Lj61/c;Landroidx/compose/runtime/Composer;I)V",
        "state",
        "k",
        "f",
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
.method public static synthetic a(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le61/m;->m(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le61/m;->h(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JLj61/c;FFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Le61/m;->l(JLj61/c;FFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(FFJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p2, p3, p0, p1, p4}, Le61/m;->g(JFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le61/m;->j(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x7820538f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, p2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int v3, p2, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p2

    :goto_2
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v5, v4, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    move v5, v7

    :goto_3
    and-int/2addr v3, v6

    invoke-virtual {v2, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v0}, Lj61/c;->n()F

    move-result v3

    invoke-virtual {v0}, Lj61/c;->o()F

    move-result v5

    sget-object v8, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v8}, Lp91/a$a;->c()Lp91/a;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v3, v5, v8}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v5, v4

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v8, v5

    const/4 v9, 0x0

    invoke-static {v3, v8, v9, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x30

    invoke-static {v8, v4, v2, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

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

    if-eqz v12, :cond_4

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v2, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-nez v10, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    :cond_5
    invoke-static {v9, v2, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v2, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lj61/c;->c()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v2, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    const/4 v11, 0x3

    int-to-float v11, v11

    invoke-interface {v8, v11}, Ly3/c;->q0(F)F

    move-result v11

    invoke-virtual {v2, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-interface {v3, v5}, Ly3/c;->q0(F)F

    move-result v12

    invoke-virtual {v0}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    const/4 v8, 0x6

    if-eqz v3, :cond_7

    const v3, 0x50380f7c

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-virtual {v13, v2, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->w()J

    move-result-wide v13

    const/16 v30, 0x0

    const v31, 0x7ffff4

    move v15, v5

    const/4 v5, 0x0

    move/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v27, v2

    move-object v2, v3

    move-wide/from16 v43, v9

    move-object v10, v4

    move-wide/from16 v3, v43

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v7

    move-wide/from16 v43, v13

    move v14, v6

    move-wide/from16 v6, v43

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move-object/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v25

    const/16 v25, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v38, v29

    const/16 v29, 0x0

    move/from16 v39, v32

    move/from16 v1, v33

    move-object/from16 v40, v34

    move/from16 v41, v35

    move/from16 v42, v36

    move/from16 v0, v37

    invoke-static/range {v2 .. v31}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v2, v27

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    move-object/from16 v40, v4

    move/from16 v39, v5

    move v0, v7

    move v1, v8

    move-wide v3, v9

    move/from16 v41, v11

    move/from16 v42, v12

    const v5, 0x503aa7ed

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_5
    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_8

    const/4 v6, 0x1

    goto :goto_6

    :cond_8
    move v6, v0

    :goto_6
    if-nez v6, :cond_9

    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_9
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v14, 0x1

    invoke-direct {v6, v5, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    new-instance v5, Landroidx/compose/foundation/layout/VerticalAlignElement;

    move-object/from16 v10, v40

    invoke-direct {v5, v10}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v6, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v15, v39

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2, v3, v4}, Lp1/q;->f(J)Z

    move-result v6

    move/from16 v11, v41

    invoke-virtual {v2, v11}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v6, v7

    move/from16 v12, v42

    invoke-virtual {v2, v12}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v7, v6, :cond_b

    :cond_a
    new-instance v8, Le61/l;

    const/4 v13, 0x0

    move-wide v9, v3

    invoke-direct/range {v8 .. v13}, Le61/l;-><init>(JFFI)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v8

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v7, v2, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lj61/c;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, 0x504205f6

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lj61/c;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->w()J

    move-result-wide v6

    const/16 v30, 0x0

    const v31, 0x7ffff4

    move-object/from16 v27, v2

    move-object v2, v5

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v2 .. v31}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v2, v27

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v14, 0x1

    goto :goto_8

    :cond_c
    const v1, 0x5044b4ed

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v2, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Le61/k;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Le61/k;-><init>(Lj61/c;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final g(JFFLk2/e;)Ll83/a0;
    .locals 12

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long/2addr v4, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    shr-long/2addr v2, v6

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    shl-long/2addr v2, v6

    and-long v6, v9, v7

    or-long/2addr v6, v2

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p2, v2, v3

    const/4 p2, 0x1

    aput p3, v2, p2

    new-instance v10, Li2/k;

    new-instance p2, Landroid/graphics/DashPathEffect;

    invoke-direct {p2, v2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, p2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v11, 0x1d8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v2, p0

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Le61/m;->f(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x44e20626

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v4, v2, 0x3

    const/4 v5, 0x1

    if-eq v4, v3, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    and-int/2addr v2, v5

    invoke-virtual {v7, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lj61/c;->n()F

    move-result v9

    invoke-virtual {v0}, Lj61/c;->o()F

    move-result v10

    invoke-virtual {v0}, Lj61/c;->m()F

    move-result v11

    invoke-virtual {v0}, Lj61/c;->g()F

    move-result v12

    invoke-virtual {v0}, Lj61/c;->d()Lj61/a;

    move-result-object v2

    sget-object v4, Le61/m$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    if-eq v2, v5, :cond_6

    if-eq v2, v3, :cond_5

    const/4 v3, 0x3

    if-ne v2, v3, :cond_4

    new-instance v13, Lp91/a;

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/high16 v14, 0x3f000000    # 0.5f

    const/high16 v15, 0x3f000000    # 0.5f

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_5
    new-instance v13, Lp91/a;

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/high16 v14, 0x3f000000    # 0.5f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_6
    new-instance v14, Lp91/a;

    const/16 v19, 0xc

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/high16 v16, 0x3f000000    # 0.5f

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v14

    :goto_4
    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static/range {v8 .. v13}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lj61/c;->f()Z

    move-result v5

    invoke-virtual {v0}, Lj61/c;->e()F

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v9}, Lez0/b;->d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_8

    new-instance v3, Lbp0/o;

    const/4 v4, 0x3

    invoke-direct {v3, v0, v1, v4}, Lbp0/o;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final j(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Le61/m;->i(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 40

    move-object/from16 v3, p0

    move/from16 v6, p2

    move-object/from16 v0, p1

    check-cast v0, Lp1/q;

    const v1, 0x53fd6ee6

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v5, v1, 0x3

    const/4 v8, 0x0

    if-eq v5, v2, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    move v5, v8

    :goto_3
    and-int/lit8 v9, v1, 0x1

    invoke-virtual {v0, v9, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v3}, Lj61/c;->c()Ly81/e;

    move-result-object v5

    invoke-interface {v5, v0, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly3/c;

    const/4 v12, 0x3

    int-to-float v12, v12

    invoke-interface {v11, v12}, Ly3/c;->q0(F)F

    move-result v11

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    int-to-float v2, v2

    invoke-interface {v5, v2}, Ly3/c;->q0(F)F

    move-result v5

    invoke-virtual {v3}, Lj61/c;->i()Lj61/b;

    move-result-object v12

    sget-object v13, Lj61/b;->NUMERIC:Lj61/b;

    if-eq v12, v13, :cond_5

    invoke-virtual {v3}, Lj61/c;->i()Lj61/b;

    move-result-object v12

    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    const v12, -0x42b33333    # -0.05f

    goto :goto_5

    :cond_5
    :goto_4
    const v12, -0x4247ae14    # -0.09f

    :goto_5
    invoke-virtual {v3}, Lj61/c;->n()F

    move-result v14

    sget-object v33, Lp91/a;->e:Lp91/a$a;

    invoke-virtual/range {v33 .. v33}, Lp91/a$a;->a()Lp91/a;

    move-result-object v15

    move/from16 p1, v11

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v14, v12, v15}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_6

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v0, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v0, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    move/from16 v34, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-wide/from16 v18, v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_7

    :cond_7
    move-wide/from16 v18, v9

    :goto_7
    invoke-static {v7, v0, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lb2/e;->L:Lb2/l;

    const/4 v9, 0x4

    int-to-float v10, v9

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    const/16 v10, 0x36

    invoke-static {v9, v7, v0, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v20, v11

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v9, v0, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v0, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lj61/c;->i()Lj61/b;

    move-result-object v1

    const/4 v4, 0x6

    if-eq v1, v13, :cond_c

    invoke-virtual {v3}, Lj61/c;->i()Lj61/b;

    move-result-object v1

    if-nez v1, :cond_d

    :cond_c
    move/from16 v1, p1

    move-object v7, v0

    move-wide/from16 v38, v18

    move-object/from16 v36, v20

    const/4 v0, 0x0

    goto/16 :goto_c

    :cond_d
    const v1, 0x6172a70

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    const v1, 0x617dd0d

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v0, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v8, v0, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x1

    const-wide/16 v16, 0x0

    move-wide/from16 v22, v18

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v25, v20

    move/from16 v24, v21

    const-wide/16 v20, 0x0

    move-wide/from16 v28, v22

    const/16 v22, 0x0

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move-wide/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 v29, v30

    const/16 v30, 0x0

    move-wide/from16 v38, v36

    move-object/from16 v36, v29

    move-object/from16 v29, v0

    move v0, v7

    move-object v7, v1

    move/from16 v1, p1

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    move/from16 v1, p1

    move-object v7, v0

    move-wide/from16 v38, v18

    move-object/from16 v36, v20

    const/4 v0, 0x0

    const v8, 0x61b83c6

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v3}, Lj61/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    const v8, 0x61c8a6d

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v10

    invoke-virtual {v9, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object/from16 v29, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-wide v9, v10

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

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v4, 0x6203126

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v15, 0x1

    goto/16 :goto_f

    :goto_c
    const v8, 0x60d89f0

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    const v8, 0x60e3c8d

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v9, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->A()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object/from16 v29, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-wide v9, v10

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

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_10
    const v8, 0x611e346

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v3}, Lj61/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    const v8, 0x612e9ed

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lj61/c;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v9, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object/from16 v29, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-wide v9, v10

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

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_11
    const v4, 0x61690a6

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :goto_f
    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v3}, Lj61/c;->n()F

    move-result v17

    invoke-virtual/range {v33 .. v33}, Lp91/a$a;->b()Lp91/a;

    move-result-object v19

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v36

    invoke-static/range {v16 .. v21}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-wide/from16 v9, v38

    invoke-virtual {v7, v9, v10}, Lp1/q;->f(J)Z

    move-result v2

    and-int/lit8 v4, v34, 0xe

    const/4 v11, 0x4

    if-eq v4, v11, :cond_13

    and-int/lit8 v4, v34, 0x8

    if-eqz v4, :cond_12

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_10

    :cond_12
    move v15, v0

    :cond_13
    :goto_10
    or-int/2addr v2, v15

    invoke-virtual {v7, v1}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v7, v5}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_14

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_15

    :cond_14
    move/from16 v16, v0

    goto :goto_11

    :cond_15
    move v9, v0

    goto :goto_12

    :goto_11
    new-instance v0, Lcz0/m;

    move v4, v1

    move-wide v1, v9

    move/from16 v9, v16

    invoke-direct/range {v0 .. v5}, Lcz0/m;-><init>(JLj61/c;FF)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v4, v7, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_13

    :cond_16
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Le61/k;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v6, v2}, Le61/k;-><init>(Lj61/c;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final l(JLj61/c;FFLk2/e;)Ll83/a0;
    .locals 13

    move-object/from16 v0, p5

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v6, 0x20

    shl-long/2addr v2, v6

    const-wide v7, 0xffffffffL

    and-long/2addr v4, v7

    or-long v3, v2, v4

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v9

    and-long/2addr v9, v7

    long-to-int v2, v9

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {p2}, Lj61/c;->g()F

    move-result p2

    mul-float/2addr p2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v11, p2

    shl-long v5, v9, v6

    and-long/2addr v7, v11

    or-long/2addr v5, v7

    const/4 p2, 0x1

    int-to-float v2, p2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v7

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v8, 0x0

    aput p3, v2, v8

    aput p4, v2, p2

    new-instance v9, Li2/k;

    new-instance p2, Landroid/graphics/DashPathEffect;

    invoke-direct {p2, v2, v1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v9, p2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v10, 0x1d0

    move-wide v1, p0

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lj61/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Le61/m;->k(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic n(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le61/m;->f(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic o(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le61/m;->i(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final synthetic p(Lj61/c;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Le61/m;->k(Lj61/c;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
