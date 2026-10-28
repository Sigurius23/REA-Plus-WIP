.class public final Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u00b1\u0001\u0010\u0016\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\n0\u000c2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u000c2\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u00082\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00132\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0013H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "viewState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "formState",
        "Ltr2/n;",
        "logger",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function2;",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;",
        "",
        "onOpenBottomSheet",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
        "onFieldUpdate",
        "onFieldValidation",
        "Lkotlin/Function0;",
        "onUsernameFieldFocused",
        "onOpenBirthdayPicker",
        "EditProfileFieldsContent",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static final EditProfileFieldsContent(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 66
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Ltr2/n;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/m;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move/from16 v12, p11

    move/from16 v13, p12

    const-string v6, "viewState"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "formState"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "logger"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onEvent"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onOpenBottomSheet"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onFieldUpdate"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p10

    check-cast v9, Lp1/q;

    const v6, 0x1dd5dafe

    invoke-virtual {v9, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v13, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v7, v12, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v12, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v12

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v12

    :goto_1
    and-int/lit8 v10, v12, 0x30

    if-nez v10, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x20

    goto :goto_2

    :cond_3
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v8, v10

    :cond_4
    and-int/lit16 v10, v12, 0x180

    if-nez v10, :cond_7

    and-int/lit16 v10, v12, 0x200

    if-nez v10, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_3

    :cond_5
    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_3
    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v8, v10

    :cond_7
    and-int/lit16 v10, v12, 0xc00

    if-nez v10, :cond_9

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v8, v10

    :cond_9
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_b

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x4000

    goto :goto_6

    :cond_a
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v8, v10

    :cond_b
    const/high16 v10, 0x30000

    and-int/2addr v10, v12

    if-nez v10, :cond_d

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_c
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v8, v10

    :cond_d
    const/high16 v10, 0x180000

    and-int/2addr v10, v12

    if-nez v10, :cond_f

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    const/high16 v10, 0x100000

    goto :goto_8

    :cond_e
    const/high16 v10, 0x80000

    :goto_8
    or-int/2addr v8, v10

    :cond_f
    and-int/lit16 v10, v13, 0x80

    const/high16 v19, 0xc00000

    if-eqz v10, :cond_10

    or-int v8, v8, v19

    move-object/from16 v14, p7

    goto :goto_a

    :cond_10
    and-int v19, v12, v19

    move-object/from16 v14, p7

    if-nez v19, :cond_12

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x800000

    goto :goto_9

    :cond_11
    const/high16 v20, 0x400000

    :goto_9
    or-int v8, v8, v20

    :cond_12
    :goto_a
    and-int/lit16 v15, v13, 0x100

    const/high16 v22, 0x6000000

    if-eqz v15, :cond_13

    or-int v8, v8, v22

    move-object/from16 v11, p8

    goto :goto_c

    :cond_13
    and-int v22, v12, v22

    move-object/from16 v11, p8

    if-nez v22, :cond_15

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_14

    const/high16 v23, 0x4000000

    goto :goto_b

    :cond_14
    const/high16 v23, 0x2000000

    :goto_b
    or-int v8, v8, v23

    :cond_15
    :goto_c
    and-int/lit16 v2, v13, 0x200

    const/high16 v23, 0x30000000

    if-eqz v2, :cond_17

    or-int v8, v8, v23

    :cond_16
    move/from16 v23, v2

    move-object/from16 v2, p9

    goto :goto_e

    :cond_17
    and-int v23, v12, v23

    if-nez v23, :cond_16

    move/from16 v23, v2

    move-object/from16 v2, p9

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_18

    const/high16 v24, 0x20000000

    goto :goto_d

    :cond_18
    const/high16 v24, 0x10000000

    :goto_d
    or-int v8, v8, v24

    :goto_e
    const v24, 0x12492493

    and-int v2, v8, v24

    const v5, 0x12492492

    if-eq v2, v5, :cond_19

    const/4 v2, 0x1

    goto :goto_f

    :cond_19
    const/4 v2, 0x0

    :goto_f
    and-int/lit8 v5, v8, 0x1

    invoke-virtual {v9, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_81

    sget-object v25, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_1a

    move-object/from16 v2, v25

    goto :goto_10

    :cond_1a
    move-object v2, v7

    :goto_10
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_1c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_1b

    new-instance v6, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v7, 0x1a

    invoke-direct {v6, v7}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v14, v6

    :cond_1c
    if-eqz v15, :cond_1e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_1d

    new-instance v6, Lcom/whoop/design/models/modal/a;

    const/16 v7, 0xe

    invoke-direct {v6, v7}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Lc93/a;

    move-object v15, v6

    goto :goto_11

    :cond_1e
    move-object/from16 v15, p8

    :goto_11
    if-eqz v23, :cond_20

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_1f

    new-instance v6, Lcom/whoop/design/models/modal/a;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, Lcom/whoop/design/models/modal/a;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v6, Lc93/a;

    move-object/from16 v52, v6

    goto :goto_12

    :cond_20
    move-object/from16 v52, p9

    :goto_12
    sget-object v6, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v9, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg2/i;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result v7

    and-int/lit16 v10, v8, 0x380

    const/16 v11, 0x100

    if-eq v10, v11, :cond_22

    and-int/lit16 v11, v8, 0x200

    if-eqz v11, :cond_21

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_21

    goto :goto_13

    :cond_21
    const/4 v11, 0x0

    goto :goto_14

    :cond_22
    :goto_13
    const/4 v11, 0x1

    :goto_14
    invoke-virtual {v9, v7}, Lp1/q;->h(Z)Z

    move-result v26

    or-int v11, v11, v26

    move-object/from16 p0, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_23

    if-ne v6, v5, :cond_24

    :cond_23
    invoke-static {v3, v7}, Lcom/whoop/profile/view/edit/form/TextFieldConfigKt;->createTextFieldConfigs(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object/from16 v53, v6

    check-cast v53, Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    const/16 v11, 0x100

    if-eq v10, v11, :cond_26

    and-int/lit16 v11, v8, 0x200

    if-eqz v11, :cond_25

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_25

    goto :goto_15

    :cond_25
    const/4 v11, 0x0

    goto :goto_16

    :cond_26
    :goto_15
    const/4 v11, 0x1

    :goto_16
    or-int/2addr v6, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_27

    if-ne v11, v5, :cond_28

    :cond_27
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v6

    invoke-static {v6, v3}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt;->createClickableFieldConfigs(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ljava/util/List;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object/from16 v54, v11

    check-cast v54, Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v6

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    const/16 v11, 0x100

    if-eq v10, v11, :cond_2a

    and-int/lit16 v11, v8, 0x200

    if-eqz v11, :cond_29

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_29

    goto :goto_17

    :cond_29
    const/4 v11, 0x0

    goto :goto_18

    :cond_2a
    :goto_17
    const/4 v11, 0x1

    :goto_18
    or-int/2addr v6, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_2b

    if-ne v11, v5, :cond_2c

    :cond_2b
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v6

    invoke-static {v6, v3}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt;->createHeightWeightGroupedField(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object/from16 v55, v11

    check-cast v55, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v6, Ll0/m;->c:Ll0/g;

    move-object/from16 v56, v2

    sget-object v2, Lb2/e;->M:Lb2/k;

    move/from16 p8, v7

    move/from16 v31, v8

    const/4 v7, 0x0

    invoke-static {v6, v2, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v32, v10

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_2d

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_2d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_19
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v9, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    move-object/from16 v33, v14

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-nez v14, :cond_2e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    move-object/from16 v34, v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2f

    goto :goto_1a

    :cond_2e
    move-object/from16 v34, v15

    :goto_1a
    invoke-static {v7, v9, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v14, v11

    const-wide/16 v26, 0x0

    cmpl-double v11, v14, v26

    if-lez v11, :cond_30

    const/4 v11, 0x1

    goto :goto_1b

    :cond_30
    const/4 v11, 0x0

    :goto_1b
    if-nez v11, :cond_31

    const-string v11, "invalid weight; must be greater than zero"

    invoke-static {v11}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_31
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v14, 0x1

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v11, v15, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v15, 0x0

    invoke-static {v15, v9, v14}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    const/16 v15, 0xe

    invoke-static {v11, v3, v15}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v35

    const/4 v3, 0x2

    int-to-float v11, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v39, v11, v3

    const/16 v40, 0x7

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v35 .. v40}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v15, 0x0

    invoke-static {v6, v2, v9, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_32

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_32
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v9, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_33

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    :cond_33
    invoke-static {v6, v9, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_34
    invoke-static {v9, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v2

    const/high16 v6, 0x70000

    and-int v12, v31, v6

    const/high16 v13, 0x20000

    if-ne v12, v13, :cond_35

    const/4 v7, 0x1

    goto :goto_1d

    :cond_35
    const/4 v7, 0x0

    :goto_1d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v7, :cond_36

    if-ne v6, v5, :cond_37

    :cond_36
    new-instance v6, La1/j;

    const/16 v7, 0x14

    invoke-direct {v6, v0, v7}, La1/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    move-object v7, v6

    check-cast v7, Lc93/a;

    const/16 v29, 0x0

    const/16 v30, 0xd

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v27, v39

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v15, v25

    move/from16 v14, v27

    shr-int/lit8 v6, v31, 0x9

    and-int/lit8 v6, v6, 0x70

    or-int/lit16 v10, v6, 0xc00

    const/4 v11, 0x0

    move-object/from16 v57, p0

    move-object/from16 v6, p4

    move/from16 v58, p8

    move-object/from16 v60, v5

    move/from16 v13, v31

    move/from16 v59, v32

    move-object v5, v2

    const/4 v2, 0x1

    invoke-static/range {v5 .. v11}, Lcom/whoop/profile/view/edit/EditProfileAvatarSectionKt;->EditProfileAvatarSection(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    mul-float/2addr v6, v3

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v9, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v7, -0x6fbc5e7

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object/from16 v7, v53

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v11, 0x0

    :goto_1e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/high16 p7, 0x380000

    const-string v10, "toLowerCase(...)"

    if-eqz v8, :cond_66

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v61, v11, 0x1

    if-ltz v11, :cond_65

    check-cast v8, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    const v2, 0x45695b21

    move-object/from16 v62, v7

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object v7

    invoke-virtual {v9, v2, v7}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object v2

    sget-object v7, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne v2, v7, :cond_38

    const/4 v2, 0x1

    goto :goto_1f

    :cond_38
    const/4 v2, 0x0

    :goto_1f
    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object v7

    sget-object v21, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v21, v7

    const/4 v5, 0x1

    if-eq v7, v5, :cond_3c

    const/4 v5, 0x2

    if-eq v7, v5, :cond_3b

    const/4 v5, 0x3

    if-eq v7, v5, :cond_3a

    const/4 v5, 0x4

    if-eq v7, v5, :cond_39

    const/4 v7, 0x0

    goto :goto_20

    :cond_39
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCity()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v7

    goto :goto_20

    :cond_3a
    const/4 v5, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v7

    goto :goto_20

    :cond_3b
    const/4 v5, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getLastName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v7

    goto :goto_20

    :cond_3c
    const/4 v5, 0x4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getFirstName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v7

    :goto_20
    if-eqz v2, :cond_3e

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable()Z

    move-result v21

    if-eqz v21, :cond_3d

    goto :goto_21

    :cond_3d
    const/16 v21, 0x0

    goto :goto_22

    :cond_3e
    :goto_21
    const/16 v21, 0x1

    :goto_22
    if-eqz v2, :cond_3f

    sget-object v5, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v22

    move/from16 p9, v7

    invoke-virtual/range {v22 .. v22}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v22

    move/from16 v63, v13

    invoke-virtual/range {v22 .. v22}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValidating()Z

    move-result v13

    invoke-virtual {v5, v7, v13}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->isUsernameFieldValidating(ZZ)Z

    move-result v5

    goto :goto_23

    :cond_3f
    move/from16 p9, v7

    move/from16 v63, v13

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result v5

    :goto_23
    if-eqz v2, :cond_40

    if-nez v5, :cond_40

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValid()Ljava/lang/Boolean;

    move-result-object v7

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getLastValidatedUsername()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_40

    const/16 v25, 0x1

    goto :goto_24

    :cond_40
    const/16 v25, 0x0

    :goto_24
    if-eqz v2, :cond_42

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_42

    if-nez v5, :cond_41

    if-eqz v25, :cond_42

    :cond_41
    move/from16 v7, v21

    const/16 v21, 0x1

    goto :goto_25

    :cond_42
    move/from16 v7, v21

    const/16 v21, 0x0

    :goto_25
    if-eqz v2, :cond_43

    if-eqz v5, :cond_43

    const v13, 0x456a2f8a

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    sget v13, Lcom/whoop/profile/R$string;->profile_edit_username_validating:I

    invoke-static {v9, v13}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move/from16 v22, v5

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_43
    move/from16 v22, v5

    const/4 v5, 0x0

    if-eqz v25, :cond_44

    const v13, 0x67dcc0be

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getValidationSuccess()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_45

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    goto :goto_26

    :cond_44
    const v13, 0x456a44ed

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :cond_45
    :goto_26
    if-eqz v25, :cond_46

    const v5, 0x456a54cd    # 3749.3f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    move/from16 v23, v7

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->j()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    move-object/from16 v24, v13

    :goto_27
    move-wide/from16 v35, v26

    goto :goto_28

    :cond_46
    move/from16 v23, v7

    const v7, 0x456a5a21

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    move-object/from16 v24, v13

    sget v13, Lx81/d;->b:I

    invoke-static {v7, v9, v13, v5}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v26

    goto :goto_27

    :goto_28
    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getLabelRes()I

    move-result v5

    invoke-static {v9, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getKeyboardType-PjHm6EE()I

    move-result v39

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v32, v5

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v13, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v10

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object/from16 v37, v5

    if-eqz v2, :cond_48

    const v5, 0x67eb64d6

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v38, v7

    move-object/from16 v7, v60

    if-ne v5, v7, :cond_47

    sget-object v5, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$1$1;

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_47
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_29
    move-object/from16 v5, v26

    goto :goto_2a

    :cond_48
    move-object/from16 v38, v7

    move-object/from16 v7, v60

    const v5, 0x67ecb9d6

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v7, :cond_49

    sget-object v5, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$EditProfileFieldsContent$4$1$2$2$1;

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_49
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    move-object/from16 v26, v5

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_29

    :goto_2a
    move-object/from16 v40, v5

    if-eqz v2, :cond_4c

    const v5, 0x67ef0163

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_4a

    const v5, 0x456add07

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    move/from16 v41, v10

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->e()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_2b

    :cond_4a
    move/from16 v41, v10

    const/4 v5, 0x0

    if-eqz v25, :cond_4b

    const v10, 0x456ae7ef

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v10, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->k()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_2b

    :cond_4b
    const v10, 0x456af1e1

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v10, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->r()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_2b
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_2c
    move-wide/from16 v42, v26

    goto :goto_2f

    :cond_4c
    move/from16 v41, v10

    const v5, 0x67f468c3

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_4d

    const v5, 0x456b05cc

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c()J

    move-result-wide v26

    :goto_2d
    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_2e

    :cond_4d
    const/4 v5, 0x0

    const v10, 0x456b0b01

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v10, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->r()J

    move-result-wide v26

    goto :goto_2d

    :goto_2e
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_2c

    :goto_2f
    if-eqz v2, :cond_50

    const v5, 0x67f7fea7

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_4e

    const v5, 0x456b2745

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->d()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_30
    move-object/from16 v44, v13

    goto :goto_31

    :cond_4e
    const/4 v5, 0x0

    if-eqz v25, :cond_4f

    const v10, 0x456b31ed

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v10, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->j()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_30

    :cond_4f
    const v10, 0x456b3ba1

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    move-object/from16 v44, v13

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v9, v13, v5}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v26

    :goto_31
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_32
    move-wide/from16 v45, v26

    goto :goto_34

    :cond_50
    move-object/from16 v44, v13

    const v5, 0x67fd562a

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_51

    const v5, 0x456b4f85

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_33

    :cond_51
    const/4 v5, 0x0

    const v10, 0x456b53e1

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v9, v13, v5}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v26

    :goto_33
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_32

    :goto_34
    if-eqz v2, :cond_54

    const v5, 0x6800d987

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_52

    const v5, 0x456b7065

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->d()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_35

    :cond_52
    const/4 v5, 0x0

    if-eqz v25, :cond_53

    const v10, 0x456b7b0d

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->j()J

    move-result-wide v26

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_35

    :cond_53
    const v10, 0x456b84c1

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v9, v13, v5}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v26

    :goto_35
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_36
    move-wide/from16 v47, v26

    goto :goto_38

    :cond_54
    const v5, 0x6806310a

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_55

    const v5, 0x456b98a5

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v5, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b()J

    move-result-wide v26

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_37

    :cond_55
    const/4 v5, 0x0

    const v10, 0x456b9d01

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v9, v13, v5}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v26

    :goto_37
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_36

    :goto_38
    if-eqz v2, :cond_56

    const v10, 0x68098473

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->d()J

    move-result-wide v26

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_39
    move-wide/from16 v49, v26

    goto :goto_3a

    :cond_56
    const v10, 0x680ae513

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v26

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_39

    :goto_3a
    if-eqz v2, :cond_57

    const v10, 0x680d16f3

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->d()J

    move-result-wide v26

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_3b
    move-wide/from16 v64, v26

    goto :goto_3c

    :cond_57
    const v10, 0x680e7793

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b()J

    move-result-wide v26

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_3b

    :goto_3c
    if-eqz v23, :cond_58

    if-nez p9, :cond_58

    const/4 v5, 0x1

    :goto_3d
    move-object/from16 v10, v57

    goto :goto_3e

    :cond_58
    const/4 v5, 0x0

    goto :goto_3d

    :goto_3e
    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    move/from16 p9, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v13, :cond_59

    if-ne v5, v7, :cond_5a

    :cond_59
    new-instance v5, Lb30/l1;

    const/4 v13, 0x2

    invoke-direct {v5, v10, v13}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5a
    move-object/from16 v27, v5

    check-cast v27, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_5b

    if-ne v13, v7, :cond_5c

    :cond_5b
    new-instance v13, Lb30/l1;

    const/4 v5, 0x3

    invoke-direct {v13, v10, v5}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5c
    move-object/from16 v28, v13

    check-cast v28, Lkotlin/jvm/functions/Function1;

    new-instance v26, Lu0/q0;

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x3a

    invoke-direct/range {v26 .. v31}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    move-object/from16 v5, v26

    move-object/from16 v19, v44

    const/16 v13, 0x4000

    invoke-virtual {v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getImeAction-eUduSuo()I

    move-result v44

    move/from16 v23, v14

    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v13, v13

    mul-float/2addr v13, v3

    move/from16 v14, v23

    invoke-static {v15, v14, v13}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object/from16 v23, v5

    and-int v5, v63, p7

    move-object/from16 v57, v10

    const/high16 v10, 0x100000

    if-ne v5, v10, :cond_5d

    const/4 v5, 0x1

    goto :goto_3f

    :cond_5d
    const/4 v5, 0x0

    :goto_3f
    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_5e

    if-ne v10, v7, :cond_5f

    :cond_5e
    new-instance v10, Lbe1/c;

    const/16 v5, 0x1d

    invoke-direct {v10, v5, v1, v8}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5f
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v2}, Lp1/q;->h(Z)Z

    move-result v5

    const/high16 v26, 0xe000000

    move/from16 v27, v2

    and-int v2, v63, v26

    move/from16 p7, v5

    const/high16 v5, 0x4000000

    if-ne v2, v5, :cond_60

    const/4 v2, 0x1

    goto :goto_40

    :cond_60
    const/4 v2, 0x0

    :goto_40
    or-int v2, p7, v2

    const/high16 v26, 0x1c00000

    and-int v5, v63, v26

    move/from16 p7, v2

    const/high16 v2, 0x800000

    if-ne v5, v2, :cond_61

    const/4 v5, 0x1

    goto :goto_41

    :cond_61
    const/4 v5, 0x0

    :goto_41
    or-int v5, p7, v5

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v5, v5, v20

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v5, :cond_63

    if-ne v2, v7, :cond_62

    goto :goto_42

    :cond_62
    move-object/from16 v5, v33

    move-object/from16 v8, v34

    goto :goto_43

    :cond_63
    :goto_42
    new-instance v26, Lch0/e;

    const/16 v31, 0x2

    move-object/from16 v30, v8

    move-object/from16 v29, v33

    move-object/from16 v28, v34

    invoke-direct/range {v26 .. v31}, Lch0/e;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v2, v26

    move-object/from16 v8, v28

    move-object/from16 v5, v29

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_43
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object/from16 p7, v2

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v60, v5

    or-int/lit16 v5, v2, 0xc00

    shl-int/lit8 v26, v2, 0x3

    or-int v5, v5, v26

    shl-int/lit8 v26, v2, 0xf

    or-int v5, v5, v26

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v2, v5

    move/from16 v26, v22

    move-object/from16 v5, v23

    move-object/from16 v22, v24

    move-wide/from16 v23, v35

    move-wide/from16 v34, v49

    const/16 v50, 0x0

    const/16 v27, 0x4000

    const/high16 v51, 0x2700000

    move/from16 v28, v27

    move-object/from16 v27, v40

    const/16 v40, 0x0

    move/from16 v20, v41

    const/high16 v29, 0x800000

    const/16 v41, 0x0

    move/from16 v31, v28

    move/from16 v30, v29

    move-wide/from16 v28, v42

    const/16 v42, 0x0

    move/from16 v33, v30

    move/from16 v36, v31

    move-wide/from16 v30, v45

    const/16 v45, 0x0

    const/16 v49, 0x0

    move-wide/from16 v16, v47

    move/from16 v48, v2

    move v2, v14

    move-object/from16 v14, v32

    move-wide/from16 v32, v16

    move-object/from16 v46, p7

    move-object/from16 v43, v5

    move-object/from16 v47, v9

    move-object/from16 v16, v10

    move-object/from16 v17, v13

    move-object v5, v15

    move-object/from16 v18, v37

    move-object/from16 v15, v38

    move-wide/from16 v36, v64

    const/4 v9, 0x2

    const/high16 v10, 0x100000

    const/4 v13, 0x4

    move/from16 v38, p9

    invoke-static/range {v14 .. v51}, Lcom/whoop/profile/view/edit/form/EditProfileTextFieldKt;->EditProfileTextField-iQW2vr8(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;JZZLy81/e;JJJJJZILq3/g0;Lqz0/c;Lc93/m;Lu0/q0;IZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v14, v47

    invoke-interface/range {v53 .. v53}, Ljava/util/List;->size()I

    move-result v15

    const/4 v10, 0x1

    sub-int/2addr v15, v10

    if-ge v11, v15, :cond_64

    const v11, 0x68237b49

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    int-to-float v11, v10

    const/4 v15, 0x0

    invoke-static {v11, v3, v5, v14, v15}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_44

    :cond_64
    const/4 v15, 0x0

    const v10, 0x6824dfe8

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    :goto_44
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    move-object v15, v5

    move-object/from16 v34, v8

    move-object v9, v14

    move-object/from16 v33, v60

    move/from16 v11, v61

    move/from16 v13, v63

    move v14, v2

    move-object/from16 v60, v7

    move-object/from16 v7, v62

    const/4 v2, 0x1

    goto/16 :goto_1e

    :cond_65
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_66
    move/from16 v63, v13

    move v2, v14

    move-object v5, v15

    move-object/from16 v8, v34

    move-object/from16 v7, v60

    const/high16 v11, 0x100000

    const/4 v13, 0x4

    const/4 v15, 0x0

    move-object v14, v9

    move-object/from16 v60, v33

    const/4 v9, 0x2

    invoke-static {v14, v15, v5, v2, v14}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    sget v15, Lcom/whoop/profile/R$string;->profile_edit_birthday_label:I

    invoke-static {v14, v15}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_67

    const/16 v16, 0x1

    goto :goto_45

    :cond_67
    const/16 v16, 0x0

    :goto_45
    if-eqz v16, :cond_68

    new-instance v11, Lcom/whoop/design/util/TextResource$e;

    sget-object v13, Lcom/whoop/profile/utils/BirthdayUtils;->INSTANCE:Lcom/whoop/profile/utils/BirthdayUtils;

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Lcom/whoop/profile/utils/BirthdayUtils;->formatForDisplay(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v11, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_46

    :cond_68
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    :goto_46
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getBirthday()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v9

    const/16 v23, 0x1

    xor-int/lit8 v21, v9, 0x1

    const/4 v9, 0x0

    const/4 v13, 0x2

    invoke-static {v5, v2, v9, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit16 v9, v13, 0x6c00

    const/16 v16, 0x3

    shl-int/lit8 v13, v13, 0x3

    or-int/2addr v9, v13

    shr-int/lit8 v13, v63, 0x15

    and-int/lit16 v13, v13, 0x380

    or-int v27, v9, v13

    const/16 v28, 0x0

    const/16 v29, 0x760

    const-string v18, "birthday"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v26, v14

    move-object v14, v15

    move-object/from16 v16, v52

    move-object v15, v11

    invoke-static/range {v14 .. v29}, Lqz0/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v16

    move-object/from16 v9, v26

    const v13, -0x6f82d69

    invoke-virtual {v9, v13}, Lp1/q;->e0(I)V

    check-cast v54, Ljava/lang/Iterable;

    invoke-interface/range {v54 .. v54}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_47
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_70

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-static {v9, v15}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getType()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    move-result-object v15

    sget-object v16, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v15, v16, v15

    move/from16 v33, v3

    const/4 v3, 0x1

    if-eq v15, v3, :cond_6c

    const/4 v3, 0x2

    if-eq v15, v3, :cond_6b

    const/4 v3, 0x3

    if-eq v15, v3, :cond_6a

    const/4 v3, 0x4

    if-eq v15, v3, :cond_69

    const/4 v3, 0x0

    goto :goto_48

    :cond_69
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getPhysiologicalBaseline()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    goto :goto_48

    :cond_6a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getGender()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    goto :goto_48

    :cond_6b
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    goto :goto_48

    :cond_6c
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    :goto_48
    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getLabelRes()I

    move-result v15

    invoke-static {v9, v15}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    move-object/from16 v16, v15

    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getValue()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getType()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    move-result-object v17

    move/from16 v18, v3

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v34, v8

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->isError()Z

    move-result v20

    invoke-virtual {v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const/16 v23, 0x1

    xor-int/lit8 v21, v18, 0x1

    move-object/from16 v18, v3

    const/4 v3, 0x2

    const/4 v8, 0x0

    invoke-static {v5, v2, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/high16 v3, 0x20000

    if-ne v12, v3, :cond_6d

    const/4 v3, 0x1

    goto :goto_49

    :cond_6d
    const/4 v3, 0x0

    :goto_49
    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_6e

    if-ne v8, v7, :cond_6f

    :cond_6e
    new-instance v8, Lbs1/v;

    const/16 v3, 0x14

    invoke-direct {v8, v3, v0, v14}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6f
    check-cast v8, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit16 v14, v3, 0xc00

    shl-int/lit8 v22, v3, 0x3

    or-int v14, v14, v22

    shl-int/lit8 v3, v3, 0xf

    or-int v27, v14, v3

    const/16 v28, 0x0

    const/16 v29, 0x700

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v26, v9

    move-object/from16 v14, v16

    move-object/from16 v16, v8

    invoke-static/range {v14 .. v29}, Lqz0/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZFJLb91/a;Landroidx/compose/runtime/Composer;III)V

    move/from16 v3, v33

    move-object/from16 v8, v34

    goto/16 :goto_47

    :cond_70
    move/from16 v33, v3

    move-object/from16 v34, v8

    const/4 v15, 0x0

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    if-nez v55, :cond_71

    const v2, 0x28065791

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_4a
    const/4 v3, 0x1

    goto/16 :goto_4f

    :cond_71
    const v3, 0x28065792

    invoke-static {v9, v3, v5, v2, v9}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    if-nez v3, :cond_72

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->isLocked()Z

    move-result v3

    if-nez v3, :cond_72

    const/16 v18, 0x1

    :goto_4b
    const/4 v3, 0x2

    const/4 v8, 0x0

    goto :goto_4c

    :cond_72
    const/16 v18, 0x0

    goto :goto_4b

    :goto_4c
    invoke-static {v5, v2, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/high16 v3, 0x20000

    if-ne v12, v3, :cond_73

    const/4 v2, 0x1

    goto :goto_4d

    :cond_73
    const/4 v2, 0x0

    :goto_4d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_74

    if-ne v3, v7, :cond_75

    :cond_74
    new-instance v3, Lcom/whoop/profile/view/edit/l;

    const/4 v2, 0x2

    invoke-direct {v3, v2, v0}, Lcom/whoop/profile/view/edit/l;-><init>(ILc93/m;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_75
    move-object/from16 v16, v3

    check-cast v16, Lc93/m;

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int v3, v63, p7

    const/high16 v10, 0x100000

    if-ne v3, v10, :cond_76

    const/4 v3, 0x1

    goto :goto_4e

    :cond_76
    const/4 v3, 0x0

    :goto_4e
    or-int/2addr v2, v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_77

    if-ne v3, v7, :cond_78

    :cond_77
    new-instance v3, Lbe1/c;

    const/16 v2, 0x1c

    invoke-direct {v3, v2, v4, v1}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_78
    move-object/from16 v17, v3

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x6

    const/16 v21, 0x0

    move-object/from16 v19, v9

    move-object/from16 v15, v55

    invoke-static/range {v14 .. v21}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->HeightWeightGroupedFormField(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;Lc93/m;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x0

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_4a

    :goto_4f
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v3, v9, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->o()J

    move-result-wide v12

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v12, v13, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v3, v3, v33

    invoke-static {v2, v6, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v12, v9, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_79

    invoke-virtual {v9, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_50

    :cond_79
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_50
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v9, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_7a

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7b

    :cond_7a
    invoke-static {v8, v9, v8, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lcom/whoop/profile/R$string;->profile_edit_save_button:I

    invoke-static {v9, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v2, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v8

    move-object/from16 v10, p2

    move/from16 v12, v58

    invoke-virtual {v2, v10, v3, v12, v8}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->isSaveButtonEnabled(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;)Z

    move-result v2

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v5, "edit_profile_save_button"

    invoke-static {v3, v5}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const v3, 0xe000

    and-int v3, v63, v3

    const/16 v13, 0x4000

    if-ne v3, v13, :cond_7c

    const/4 v3, 0x1

    :goto_51
    move/from16 v5, v59

    const/16 v8, 0x100

    goto :goto_52

    :cond_7c
    move v3, v6

    goto :goto_51

    :goto_52
    if-eq v5, v8, :cond_7d

    move/from16 v13, v63

    and-int/lit16 v5, v13, 0x200

    if-eqz v5, :cond_7e

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7e

    :cond_7d
    const/4 v6, 0x1

    :cond_7e
    or-int/2addr v3, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_80

    if-ne v5, v7, :cond_7f

    goto :goto_53

    :cond_7f
    move-object/from16 v6, p4

    goto :goto_54

    :cond_80
    :goto_53
    new-instance v5, Lbs1/v;

    const/16 v3, 0x15

    move-object/from16 v6, p4

    invoke-direct {v5, v3, v6, v10}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_54
    move-object/from16 v27, v5

    check-cast v27, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v29, v3, 0x12

    const/16 v30, 0x0

    const/16 v31, 0x1fbc

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move v15, v2

    move-object/from16 v28, v9

    invoke-static/range {v14 .. v31}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    const/4 v3, 0x1

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object/from16 v26, v9

    move-object v10, v11

    move-object/from16 v9, v34

    move-object/from16 v7, v56

    move-object/from16 v8, v60

    goto :goto_55

    :cond_81
    move-object/from16 v6, p4

    move-object v10, v3

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v10, p9

    move-object/from16 v26, v9

    move-object v8, v14

    move-object/from16 v9, p8

    :goto_55
    invoke-virtual/range {v26 .. v26}, Lp1/q;->u()Lp1/v1;

    move-result-object v14

    if-eqz v14, :cond_82

    new-instance v0, Lbm2/f1;

    const/4 v13, 0x2

    move-object v2, v7

    move-object v7, v1

    move-object v1, v2

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v11, p11

    move/from16 v12, p12

    move-object v5, v6

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v13}, Lbm2/f1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v14, Lp1/v1;->d:Lc93/m;

    :cond_82
    return-void
.end method

.method private static final EditProfileFieldsContent$lambda$0$0(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$1$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final EditProfileFieldsContent$lambda$2$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$0$0(Lc93/m;)Ll83/a0;
    .locals 2

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->AVATAR:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    const/4 v1, 0x0

    invoke-interface {p0, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$1$2$0(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$1$3$0(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x6

    check-cast p0, Lg2/l;

    invoke-virtual {p0, p1}, Lg2/l;->h(I)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$1$4$0(Lc93/m;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$1$5$0(ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Z)Ll83/a0;
    .locals 0

    if-eqz p4, :cond_0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    if-nez p4, :cond_1

    invoke-virtual {p3}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;->getFieldType()Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$2$0$0(Lc93/m;Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;->getType()Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$3$0$0(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "bottomSheetType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$0$3$1$0(Ltr2/n;Lc93/m;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "newUnitSystem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Unit System Toggled to: "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p0, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->UNIT_SYSTEM:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-interface {p1, p0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$6$1$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ll83/a0;
    .locals 1

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;

    invoke-direct {v0, p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$SaveProfile;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileFieldsContent$lambda$7(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc93/m;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$0$0(Lc93/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$1$5$0(ZLc93/a;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$7(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$0$0(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$1$0$0(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/m;Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$2$0$0(Lc93/m;Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$2$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$3$0$0(Lc93/m;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/m;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$1$4$0(Lc93/m;Lcom/whoop/profile/view/edit/form/TextFieldConfig;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$1$2$0(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$1$3$0(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ltr2/n;Lc93/m;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$6$0$3$1$0(Ltr2/n;Lc93/m;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->EditProfileFieldsContent$lambda$1$0()Ll83/a0;

    move-result-object v0

    return-object v0
.end method
