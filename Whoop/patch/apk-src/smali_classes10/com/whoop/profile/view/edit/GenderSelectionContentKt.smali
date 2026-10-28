.class public final Lcom/whoop/profile/view/edit/GenderSelectionContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/GenderSelectionContentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/Gender;",
        "selectedGender",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onGenderSelected",
        "GenderSelectionContent",
        "(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "gender",
        "Lcom/whoop/design/util/TextResource;",
        "getGenderDisplayText",
        "(Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/design/util/TextResource;",
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
.method public static final GenderSelectionContent(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/models/Gender;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onGenderSelected"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0xe7e1392

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

    const/16 v11, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v11

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v12, 0x0

    if-eq v4, v5, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v12

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v4, Lcom/whoop/profile/domain/models/Gender;->FEMALE:Lcom/whoop/profile/domain/models/Gender;

    sget-object v5, Lcom/whoop/profile/domain/models/Gender;->MALE:Lcom/whoop/profile/domain/models/Gender;

    sget-object v6, Lcom/whoop/profile/domain/models/Gender;->NON_BINARY:Lcom/whoop/profile/domain/models/Gender;

    sget-object v8, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    filled-new-array {v4, v5, v6, v8}, [Lcom/whoop/profile/domain/models/Gender;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v8, v7, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_6

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    invoke-static {v8, v7, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v7, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x41527c38

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    move-object v5, v14

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lcom/whoop/profile/domain/models/Gender;

    move-object v5, v4

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, Ly71/o;->p:Ly71/o$c;

    invoke-static {v13}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->getGenderDisplayText(Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    if-ne v0, v13, :cond_9

    const/16 v33, 0x1

    goto :goto_7

    :cond_9
    move/from16 v33, v12

    :goto_7
    const v41, 0x7f7ffe

    const/16 v42, 0x0

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

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-static/range {v17 .. v42}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    and-int/lit8 v8, v3, 0x70

    if-ne v8, v11, :cond_a

    const/4 v8, 0x1

    goto :goto_8

    :cond_a
    move v8, v12

    :goto_8
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

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

    const/16 v8, 0x18

    invoke-direct {v9, v8, v1, v13}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lc93/a;

    sget v8, Ly71/o;->q:I

    shl-int/lit8 v8, v8, 0x3

    or-int/lit8 v8, v8, 0x6

    move-object/from16 v17, v5

    move-object v5, v6

    move-object v6, v9

    const/4 v9, 0x0

    move-object/from16 v11, v17

    invoke-static/range {v4 .. v9}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    const/16 v5, 0x8

    if-eq v13, v4, :cond_d

    const v4, 0x2f35a449

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v8

    int-to-float v5, v5

    invoke-static {v4, v5, v11, v7, v12}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    const/4 v4, 0x2

    goto :goto_9

    :cond_d
    const v4, 0x2f36f52b

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x2

    int-to-float v6, v4

    int-to-float v5, v5

    invoke-static {v6, v5, v11, v7, v12}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_9
    move-object v4, v11

    const/16 v11, 0x20

    goto/16 :goto_6

    :cond_e
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

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

    const/16 v5, 0xb

    invoke-direct {v4, v0, v1, v2, v5}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final GenderSelectionContent$lambda$0$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/Gender;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final GenderSelectionContent$lambda$1(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->GenderSelectionContent(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/Gender;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->GenderSelectionContent$lambda$0$0$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/domain/models/Gender;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->GenderSelectionContent$lambda$1(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final getGenderDisplayText(Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/design/util/TextResource;
    .locals 3

    sget-object v0, Lcom/whoop/profile/view/edit/GenderSelectionContentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p0, v0, :cond_3

    if-eq p0, v1, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_gender_prefer_not_to_specify:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_gender_non_binary:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_2
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_gender_man:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_3
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_gender_woman:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
