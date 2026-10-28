.class public final Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "selectedBaseline",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onBaselineSelected",
        "PhysiologicalBaselineSelectionContent",
        "(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "baseline",
        "Lcom/whoop/design/util/TextResource;",
        "getBaselineDisplayText",
        "(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/design/util/TextResource;",
        "profile_release"
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
.method public static final PhysiologicalBaselineSelectionContent(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onBaselineSelected"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x60b99b6b

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_2

    if-nez v0, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    :goto_0
    invoke-virtual {v7, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v4, v2, 0x30

    const/16 v10, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v10

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v11, 0x0

    if-eq v4, v5, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v11

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->FEMALE:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    sget-object v5, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->MALE:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    sget-object v6, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->AVERAGE:Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    filled-new-array {v4, v5, v6}, [Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v7, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    :cond_7
    invoke-static {v6, v7, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v7, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, 0x1f9438dc

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    move-object v4, v13

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, Ly71/o;->p:Ly71/o$c;

    invoke-static {v4}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->getBaselineDisplayText(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    if-ne v0, v4, :cond_9

    const/16 v32, 0x1

    goto :goto_7

    :cond_9
    move/from16 v32, v11

    :goto_7
    const v40, 0x7f7ffe

    const/16 v41, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-static/range {v16 .. v41}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    and-int/lit8 v8, v3, 0x70

    if-ne v8, v10, :cond_a

    const/4 v8, 0x1

    goto :goto_8

    :cond_a
    move v8, v11

    :goto_8
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    invoke-virtual {v7, v9}, Lp1/q;->e(I)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_b

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v9, v8, :cond_c

    :cond_b
    new-instance v9, Lbs1/v;

    const/16 v8, 0x19

    invoke-direct {v9, v8, v1, v4}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lc93/a;

    sget v8, Ly71/o;->q:I

    shl-int/lit8 v8, v8, 0x3

    or-int/lit8 v8, v8, 0x6

    move-object/from16 v16, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v9

    const/4 v9, 0x0

    move-object/from16 v10, v16

    invoke-static/range {v4 .. v9}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v13}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    if-eq v10, v4, :cond_d

    const v4, -0x57c88f0f

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v4, v5, v15, v7, v11}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_d
    const v4, -0x57c75efe

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    :goto_9
    const/16 v10, 0x20

    goto/16 :goto_6

    :cond_e
    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_10

    new-instance v4, Lce2/b;

    const/16 v5, 0xc

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final PhysiologicalBaselineSelectionContent$lambda$0$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final PhysiologicalBaselineSelectionContent$lambda$1(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->PhysiologicalBaselineSelectionContent(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->PhysiologicalBaselineSelectionContent$lambda$0$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->PhysiologicalBaselineSelectionContent$lambda$1(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final getBaselineDisplayText(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/design/util/TextResource;
    .locals 3

    sget-object v0, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p0, v0, :cond_2

    if-eq p0, v1, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_prefer_not_to_specify:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_male:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_2
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_female:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
