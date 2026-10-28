.class public abstract Lzc1/a4;
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

    invoke-static {p0, p1, p2}, Lzc1/a4;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x38056c4e

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    move v1, v8

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v2

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v4, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Sufficient tile state"

    const/4 v10, 0x6

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v11, 0x4

    int-to-float v1, v11

    mul-float v12, v2, v1

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lt71/j;

    invoke-static {v4, v8}, Li21/k;->b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v8, v11}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v15

    const-string v21, "% Impact"

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v22, Lx81/d;->a:Lx81/d;

    invoke-virtual/range {v22 .. v22}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/i0;->z()I

    move-result v24

    sget-object v25, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    sget-object v30, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    const-string v29, "Hurts"

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v17, Lt71/b;

    move-object/from16 v27, v25

    move-object/from16 v23, v17

    move-object/from16 v28, v30

    invoke-direct/range {v23 .. v28}, Lt71/b;-><init>(ILy81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)V

    invoke-virtual/range {v22 .. v22}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/i0;->A()I

    move-result v32

    sget-object v33, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v36, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    const-string v23, "Helps"

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    new-instance v31, Lt71/b;

    move-object/from16 v35, v33

    invoke-direct/range {v31 .. v36}, Lt71/b;-><init>(ILy81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)V

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/4 v14, 0x0

    move-object v13, v2

    move-object/from16 v18, v31

    invoke-direct/range {v13 .. v20}, Lt71/j;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lt71/b;Lt71/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lt71/j;->f:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lt71/m;->h(Landroidx/compose/ui/Modifier;Lt71/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v13, v5

    const-string v1, "Insufficient tile state"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v14, Lt71/p;

    const-string v1, "NOT ENOUGH ANSWERS"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const-string v1, "Log at least 5 yes\'s and 5 no\'s for each behavior to see how they impact ya Recovery."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {v4, v8}, Li21/k;->b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v11, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v18

    const/4 v15, 0x0

    invoke-direct/range {v14 .. v20}, Lt71/p;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lt71/p;->e:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v1, 0x0

    move-object v2, v14

    invoke-static/range {v1 .. v6}, Lt71/o;->d(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Empty State"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lt71/j;

    invoke-static {v4, v8}, Li21/k;->b(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v2

    const/16 v3, 0x9

    invoke-interface {v2, v10, v3}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v39

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-virtual/range {v22 .. v22}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/i0;->z()I

    move-result v26

    invoke-static/range {v29 .. v29}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    new-instance v41, Lt71/b;

    move-object/from16 v29, v25

    move-object/from16 v25, v41

    invoke-direct/range {v25 .. v30}, Lt71/b;-><init>(ILy81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)V

    invoke-virtual/range {v22 .. v22}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/i0;->A()I

    move-result v34

    invoke-static/range {v23 .. v23}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v42, Lt71/b;

    move-object/from16 v37, v33

    move-object/from16 v38, v36

    move-object/from16 v33, v42

    move-object/from16 v36, v2

    invoke-direct/range {v33 .. v38}, Lt71/b;-><init>(ILy81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;)V

    const/16 v43, 0x1

    const/16 v44, 0x0

    const/16 v38, 0x0

    move-object/from16 v37, v1

    invoke-direct/range {v37 .. v44}, Lt71/j;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lt71/b;Lt71/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    invoke-static {v2, v1, v4, v13, v7}, Lt71/a;->e(Landroidx/compose/ui/Modifier;Lt71/j;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/s3;

    const/16 v3, 0x8

    invoke-direct {v2, v0, v3}, Lzc1/s3;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/a4;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
