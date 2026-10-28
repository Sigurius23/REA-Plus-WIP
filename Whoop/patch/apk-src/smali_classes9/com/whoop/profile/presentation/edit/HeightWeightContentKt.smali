.class public final Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a]\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a;\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0014H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a;\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\u0014H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u001c\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u001d\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "bottomSheetType",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "viewState",
        "Lkotlin/Function2;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
        "",
        "Ll83/a0;",
        "onFieldUpdate",
        "overrideUnitSystem",
        "currentHeight",
        "currentWeight",
        "HeightWeightContent",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "",
        "currentHeightInMeters",
        "",
        "isImperial",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;",
        "validationRanges",
        "Lkotlin/Function1;",
        "onValueSelected",
        "HeightSelector",
        "(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "currentWeightInKilograms",
        "WeightSelector",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
        "selectedHeightValue",
        "selectedWeightValue",
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
.method public static final HeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "validationRanges"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueSelected"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x5fa4ed75

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v0, 0x493

    const/16 v8, 0x492

    if-eq v6, v8, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    sget-object v6, Ld21/a;->a:Ld21/a;

    invoke-virtual {v6, v1}, Ld21/a;->s(F)I

    move-result v18

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightMetersMin()F

    move-result v8

    invoke-virtual {v6, v8}, Ld21/a;->s(F)I

    move-result v8

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightMetersMax()F

    move-result v10

    invoke-virtual {v6, v10}, Ld21/a;->s(F)I

    move-result v6

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v14, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move v14, v8

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v12, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v12, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Ld21/g;

    if-eqz v2, :cond_c

    sget-object v7, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    :goto_7
    move-object/from16 v17, v7

    goto :goto_8

    :cond_c
    sget-object v7, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    goto :goto_7

    :goto_8
    new-instance v7, Li93/j;

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMin()I

    move-result v8

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMax()I

    move-result v9

    const/4 v10, 0x1

    invoke-direct {v7, v8, v9, v10}, Li93/h;-><init>(III)V

    new-instance v8, Li93/j;

    invoke-direct {v8, v14, v6, v10}, Li93/h;-><init>(III)V

    sget v6, Lgy0/f;->y0:I

    invoke-static {v12, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v21

    sget v6, Lgy0/f;->M0:I

    invoke-static {v12, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v22

    sget v6, Lgy0/f;->I:I

    invoke-static {v12, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v23

    move-object/from16 v19, v7

    move-object/from16 v20, v8

    invoke-direct/range {v16 .. v23}, Ld21/g;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    and-int/lit16 v0, v0, 0x1c00

    const/16 v10, 0x800

    if-ne v0, v10, :cond_d

    const/4 v9, 0x1

    goto :goto_9

    :cond_d
    const/4 v9, 0x0

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_e

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_f

    :cond_e
    new-instance v0, La61/a;

    const/16 v6, 0x15

    invoke-direct {v0, v4, v6}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v0, 0x28

    int-to-float v9, v0

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v10

    const v0, 0x30d80

    sget v6, Ld21/g;->h:I

    or-int/2addr v0, v6

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0xc

    or-int v13, v0, v6

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v14}, Ld21/f;->e(Ld21/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lcom/whoop/profile/presentation/edit/c;

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/edit/c;-><init>(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final HeightSelector$lambda$0$0$0(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p1}, Ld21/a;->t(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightSelector$lambda$1(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final HeightWeightContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
            "Lc93/m;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v7, p7

    const-string v0, "bottomSheetType"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFieldUpdate"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p6

    check-cast v5, Lp1/q;

    const v0, 0x54775e91

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v5, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit8 v4, p8, 0x8

    const/16 v8, 0x800

    if-eqz v4, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v9, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_6

    move-object/from16 v9, p3

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v8

    goto :goto_4

    :cond_8
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p8, 0x10

    if-eqz v10, :cond_a

    or-int/lit16 v0, v0, 0x6000

    :cond_9
    move-object/from16 v11, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_6

    :cond_b
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_d

    or-int/2addr v0, v13

    :cond_c
    move-object/from16 v13, p5

    goto :goto_9

    :cond_d
    and-int/2addr v13, v7

    if-nez v13, :cond_c

    move-object/from16 v13, p5

    invoke-virtual {v5, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x10000

    :goto_8
    or-int/2addr v0, v14

    :goto_9
    const v14, 0x12493

    and-int/2addr v14, v0

    const v15, 0x12492

    const/16 v16, 0x1

    const/4 v6, 0x0

    if-eq v14, v15, :cond_f

    move/from16 v14, v16

    goto :goto_a

    :cond_f
    move v14, v6

    :goto_a
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v5, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_2b

    const/4 v14, 0x0

    if-eqz v4, :cond_10

    move-object v4, v14

    goto :goto_b

    :cond_10
    move-object v4, v9

    :goto_b
    move-object v9, v5

    if-eqz v10, :cond_11

    move-object v5, v14

    goto :goto_c

    :cond_11
    move-object v5, v11

    :goto_c
    move v10, v6

    if-eqz v12, :cond_12

    move-object v6, v14

    goto :goto_d

    :cond_12
    move-object v6, v13

    :goto_d
    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v11

    if-nez v11, :cond_13

    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2c

    new-instance v0, Lcom/whoop/profile/presentation/edit/d;

    const/4 v9, 0x0

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lcom/whoop/profile/presentation/edit/d;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    :goto_e
    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_13
    move-object v7, v1

    move-object v12, v3

    move-object v14, v4

    move-object v13, v5

    move-object v15, v6

    if-eqz v14, :cond_14

    invoke-static {v14}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromString(Ljava/lang/String;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    if-nez v1, :cond_15

    :cond_14
    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    :cond_15
    and-int/lit16 v2, v0, 0x1c00

    if-ne v2, v8, :cond_16

    move/from16 v2, v16

    goto :goto_f

    :cond_16
    move v2, v10

    :goto_f
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_17

    if-ne v3, v4, :cond_18

    :cond_17
    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lp1/c1;

    invoke-static {v3}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$3(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v2

    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->HEIGHT:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    if-ne v7, v1, :cond_19

    move/from16 v1, v16

    goto :goto_10

    :cond_19
    move v1, v10

    :goto_10
    const/4 v3, 0x0

    if-eqz v1, :cond_1c

    if-eqz v13, :cond_1a

    invoke-static {v13}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    if-eqz v5, :cond_1a

    :goto_11
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    goto :goto_12

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    if-eqz v5, :cond_1b

    goto :goto_11

    :cond_1b
    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getHeight()F

    move-result v5

    goto :goto_12

    :cond_1c
    move v5, v3

    :goto_12
    if-nez v1, :cond_1d

    if-eqz v15, :cond_1e

    invoke-static {v15}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_1e

    :goto_13
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :cond_1d
    move-object/from16 p4, v11

    goto :goto_14

    :cond_1e
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_1f

    goto :goto_13

    :cond_1f
    move-object/from16 p4, v11

    invoke-virtual/range {p4 .. p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getWeight()D

    move-result-wide v10

    double-to-float v3, v10

    :goto_14
    invoke-virtual {v9, v5}, Lp1/q;->d(F)Z

    move-result v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_20

    if-ne v8, v4, :cond_21

    :cond_20
    invoke-static {v5, v9}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v8

    :cond_21
    check-cast v8, Lp1/z0;

    invoke-virtual {v9, v3}, Lp1/q;->d(F)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_22

    if-ne v6, v4, :cond_23

    :cond_22
    invoke-static {v3, v9}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v6

    :cond_23
    check-cast v6, Lp1/z0;

    if-eqz v1, :cond_27

    const v1, 0x6f3ad66e

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$5(Lp1/z0;)F

    move-result v1

    invoke-virtual/range {p4 .. p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getValidationRanges()Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    move-result-object v3

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit16 v0, v0, 0x380

    const/16 v6, 0x100

    if-ne v0, v6, :cond_24

    goto :goto_15

    :cond_24
    const/16 v16, 0x0

    :goto_15
    or-int v0, v5, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_25

    if-ne v5, v4, :cond_26

    :cond_25
    new-instance v5, Lcom/whoop/profile/presentation/edit/e;

    const/4 v0, 0x0

    invoke-direct {v5, v12, v8, v0}, Lcom/whoop/profile/presentation/edit/e;-><init>(Lc93/m;Lp1/z0;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v4, v5

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    move-object v5, v9

    const/4 v10, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_27
    move-object v5, v9

    const/4 v10, 0x0

    const v1, 0x6f40c9ab

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-static {v6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$8(Lp1/z0;)F

    move-result v1

    invoke-virtual/range {p4 .. p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getValidationRanges()Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    move-result-object v3

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit16 v0, v0, 0x380

    const/16 v9, 0x100

    if-ne v0, v9, :cond_28

    goto :goto_16

    :cond_28
    move/from16 v16, v10

    :goto_16
    or-int v0, v8, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_29

    if-ne v8, v4, :cond_2a

    :cond_29
    new-instance v8, Lcom/whoop/profile/presentation/edit/e;

    const/4 v0, 0x1

    invoke-direct {v8, v12, v6, v0}, Lcom/whoop/profile/presentation/edit/e;-><init>(Lc93/m;Lp1/z0;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v4, v8

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->WeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    :goto_17
    move-object v9, v5

    move-object v5, v13

    move-object v4, v14

    move-object v6, v15

    goto :goto_18

    :cond_2b
    move-object v7, v1

    move-object v12, v3

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v4, v9

    move-object v6, v13

    move-object v9, v5

    move-object v5, v11

    :goto_18
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2c

    new-instance v0, Lcom/whoop/profile/presentation/edit/d;

    const/4 v9, 0x1

    move-object/from16 v2, p1

    move/from16 v8, p8

    move-object v1, v7

    move-object v3, v12

    move/from16 v7, p7

    invoke-direct/range {v0 .. v9}, Lcom/whoop/profile/presentation/edit/d;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    goto/16 :goto_e

    :cond_2c
    return-void
.end method

.method private static final HeightWeightContent$lambda$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightContent$lambda$10$0(Lc93/m;Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p1, p2}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$6(Lp1/z0;F)V

    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->HEIGHT:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightContent$lambda$11$0(Lc93/m;Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p1, p2}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$9(Lp1/z0;F)V

    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->WEIGHT:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-static {p2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightContent$lambda$12(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final HeightWeightContent$lambda$3(Lp1/c1;)Lcom/whoop/domain/model/UnitSystem;
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

.method private static final HeightWeightContent$lambda$5(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final HeightWeightContent$lambda$6(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method private static final HeightWeightContent$lambda$8(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final HeightWeightContent$lambda$9(Lp1/z0;F)V
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0, p1}, Lp1/g1;->y(F)V

    return-void
.end method

.method public static final WeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FZ",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "validationRanges"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueSelected"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, 0x5a3b1f86

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    const/16 v8, 0x800

    if-nez v7, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v9, 0x492

    const/4 v15, 0x1

    if-eq v7, v9, :cond_8

    move v7, v15

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v12, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    sget-object v7, Ld21/a;->a:Ld21/a;

    invoke-virtual {v7, v1}, Ld21/a;->m(F)I

    move-result v18

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v14, v13, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_9

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    :cond_a
    invoke-static {v13, v12, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Ls41/d;

    if-eqz v2, :cond_c

    sget-object v6, Lcom/whoop/domain/model/UnitSystem;->IMPERIAL:Lcom/whoop/domain/model/UnitSystem;

    :goto_7
    move-object/from16 v17, v6

    goto :goto_8

    :cond_c
    sget-object v6, Lcom/whoop/domain/model/UnitSystem;->METRIC:Lcom/whoop/domain/model/UnitSystem;

    goto :goto_7

    :goto_8
    new-instance v6, Li93/j;

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightPoundsMin()I

    move-result v7

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightPoundsMax()I

    move-result v10

    invoke-direct {v6, v7, v10, v15}, Li93/h;-><init>(III)V

    new-instance v7, Li93/j;

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightKilogramsMin()I

    move-result v10

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightKilogramsMax()I

    move-result v11

    invoke-direct {v7, v10, v11, v15}, Li93/h;-><init>(III)V

    sget v10, Lgy0/f;->I1:I

    invoke-static {v12, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v21

    sget v10, Lgy0/f;->Q0:I

    invoke-static {v12, v10}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    invoke-direct/range {v16 .. v22}, Ls41/d;-><init>(Lcom/whoop/domain/model/UnitSystem;ILi93/j;Li93/j;Ljava/lang/String;Ljava/lang/String;)V

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v8, :cond_d

    move v10, v15

    goto :goto_9

    :cond_d
    const/4 v10, 0x0

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_e

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_f

    :cond_e
    new-instance v0, La61/a;

    const/16 v6, 0x16

    invoke-direct {v0, v4, v6}, La61/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v0, 0xa

    int-to-float v0, v0

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float v9, v0, v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v0, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v10

    const v0, 0x30d80

    sget v6, Ls41/d;->g:I

    or-int/2addr v0, v6

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0xc

    or-int v13, v0, v6

    const/4 v14, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, v16

    invoke-static/range {v6 .. v14}, Ls41/c;->d(Ls41/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLb91/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_11

    new-instance v0, Lcom/whoop/profile/presentation/edit/c;

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/presentation/edit/c;-><init>(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final WeightSelector$lambda$0$0$0(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    sget-object v0, Ld21/a;->a:Ld21/a;

    invoke-virtual {v0, p1}, Ld21/a;->q(I)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final WeightSelector$lambda$1(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->WeightSelector(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$0(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightSelector$lambda$1(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$12(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightSelector$lambda$0$0$0(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->WeightSelector$lambda$0$0$0(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/m;Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$11$0(Lc93/m;Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->WeightSelector$lambda$1(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc93/m;Lp1/z0;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->HeightWeightContent$lambda$10$0(Lc93/m;Lp1/z0;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
