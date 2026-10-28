.class public final Lcom/whoop/profile/view/edit/EditProfileScreenKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/EditProfileScreenKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002\u00b2\u0006\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Leb/a0;",
        "navController",
        "Ll83/a0;",
        "EditProfileScreen",
        "(Leb/a0;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;",
        "event",
        "handleNavigationEvent",
        "(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewModel;",
        "viewModel",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "viewState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "formState",
        "",
        "showBirthdayPicker",
        "showDiscardDialog",
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
.method public static final EditProfileScreen(Leb/a0;Landroidx/compose/runtime/Composer;II)V
    .locals 47

    move/from16 v1, p3

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0xd1a0ad7

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    move v4, v3

    :goto_0
    or-int v4, p2, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p2

    :goto_1
    and-int/lit8 v6, v4, 0x3

    const/4 v7, 0x1

    const/4 v14, 0x0

    if-eq v6, v3, :cond_3

    move v3, v7

    goto :goto_2

    :cond_3
    move v3, v14

    :goto_2
    and-int/2addr v4, v7

    invoke-virtual {v5, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_33

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v3, p2, 0x1

    if-eqz v3, :cond_6

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v3, v1, 0x1

    :cond_5
    :goto_3
    move-object v8, v2

    goto :goto_5

    :cond_6
    :goto_4
    and-int/lit8 v3, v1, 0x1

    if-eqz v3, :cond_5

    new-array v2, v14, [Leb/i1;

    invoke-static {v2, v5}, Lge3/g;->S([Leb/i1;Landroidx/compose/runtime/Composer;)Leb/u0;

    move-result-object v2

    goto :goto_3

    :goto_5
    invoke-virtual {v5}, Lp1/q;->r()V

    const v2, -0x649fae96

    invoke-virtual {v5, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_32

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v2, v2, Lwf3/a;->d:Lxf3/c;

    const v3, -0x649fad62

    const v4, -0x384098

    invoke-static {v5, v3, v5, v14, v4}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v3

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_7

    if-ne v6, v15, :cond_8

    :cond_7
    sget-object v4, Ll83/i;->y:Ll83/i;

    new-instance v6, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1;

    invoke-direct {v6, v2, v9, v9, v3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$$inlined$viewModel$1;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v4, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    move-object v10, v6

    check-cast v10, Ll83/h;

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    invoke-static {v10}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->getViewState()Lec3/f2;

    move-result-object v2

    new-instance v16, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/16 v26, 0x1ff

    const/16 v27, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v16 .. v27}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v4, 0x0

    move-object/from16 v3, v16

    invoke-static/range {v2 .. v7}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_9

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v15, :cond_a

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_b

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v15, :cond_c

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v7, Ljava/util/Map;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v15, :cond_d

    sget-object v11, Ltr2/n;->a:Ltr2/n$a;

    const-string v12, "EditProfileScreen"

    invoke-virtual {v11, v12}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v11

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v12, v11

    check-cast v12, Ltr2/n;

    invoke-static {v10}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object v11

    invoke-virtual {v5, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_e

    if-ne v14, v15, :cond_f

    :cond_e
    new-instance v14, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$1$1;

    invoke-direct {v14, v10, v9}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$1$1;-><init>(Ll83/h;Lq83/d;)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v14, Lc93/m;

    invoke-static {v5, v14, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getFullScreenModal()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    move-result-object v11

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_10

    if-ne v14, v15, :cond_11

    :cond_10
    new-instance v14, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$2$1;

    invoke-direct {v14, v8, v2, v9}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$2$1;-><init>(Leb/a0;Lp1/t2;Lq83/d;)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v14, Lc93/m;

    invoke-static {v5, v14, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEmailValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->getValidationError()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEmailValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->getLastValidatedEmail()Ljava/lang/String;

    move-result-object v13

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEmailValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->isValid()Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v16, :cond_13

    if-ne v9, v15, :cond_12

    goto :goto_6

    :cond_12
    move-object/from16 v23, v6

    goto :goto_7

    :cond_13
    :goto_6
    new-instance v9, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$3$1;

    move-object/from16 v23, v6

    const/4 v6, 0x0

    invoke-direct {v9, v7, v2, v3, v6}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$3$1;-><init>(Ljava/util/Map;Lp1/t2;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v9, Lc93/m;

    sget v24, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v11, v13, v14, v9, v5}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValidating()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_14

    if-ne v13, v15, :cond_15

    :cond_14
    new-instance v13, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;

    const/4 v11, 0x0

    invoke-direct {v13, v2, v3, v11}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;-><init>(Lp1/t2;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v13, Lc93/m;

    invoke-static {v6, v9, v13, v5}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getValidationError()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getLastValidatedUsername()Ljava/lang/String;

    move-result-object v9

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValid()Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_16

    if-ne v14, v15, :cond_17

    :cond_16
    new-instance v14, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$5$1;

    const/4 v13, 0x0

    invoke-direct {v14, v2, v3, v13}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$5$1;-><init>(Lp1/t2;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v14, Lc93/m;

    invoke-static {v6, v9, v11, v14, v5}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getFullScreenModal()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    move-result-object v6

    invoke-static {v3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v9

    if-nez v9, :cond_18

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getEmail()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-lez v9, :cond_18

    new-instance v25, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    new-instance v26, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getEmail()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v27

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getEmail()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v28

    const/16 v33, 0x34

    const/16 v34, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x1

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v26 .. v34}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v27, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v28

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v29

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v31

    const/16 v34, 0x34

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v27 .. v35}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v28, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getFirstName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v29

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getFirstName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v30

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getFirstName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v32

    const/16 v35, 0x34

    const/16 v36, 0x0

    const/16 v31, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v28 .. v36}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v29, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getLastName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v30

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getLastName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v31

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getLastName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v33

    const/16 v36, 0x34

    const/16 v37, 0x0

    const/16 v32, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v29 .. v37}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v30, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v31

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v34

    const/16 v37, 0x34

    const/16 v38, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v30 .. v38}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v31, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v32

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v33

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v35

    const/16 v38, 0x34

    const/16 v39, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v31 .. v39}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v32, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUnitSystem()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v33

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUnitSystem()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v36

    const/16 v39, 0x36

    const/16 v40, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v32 .. v40}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v33, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getGender()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v34

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getGender()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v35

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getGender()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v37

    const/16 v40, 0x34

    const/16 v41, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v33 .. v41}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v34, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getPhysiologicalBaseline()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v35

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getPhysiologicalBaseline()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v36

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getPhysiologicalBaseline()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v38

    const/16 v41, 0x34

    const/16 v42, 0x0

    const/16 v37, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v34 .. v42}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v35, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v36

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v39

    const/16 v42, 0x34

    const/16 v43, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v35 .. v43}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v36, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v37

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v40

    const/16 v43, 0x34

    const/16 v44, 0x0

    const/16 v39, 0x0

    const/16 v42, 0x0

    invoke-direct/range {v36 .. v44}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v37, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getBirthday()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v38

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getBirthday()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v39

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getBirthday()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v41

    const/16 v44, 0x34

    const/16 v45, 0x0

    const/16 v40, 0x0

    const/16 v43, 0x0

    invoke-direct/range {v37 .. v45}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v38, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCity()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v39

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCity()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v40

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCity()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getErrorMessage()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v42

    const/16 v45, 0x34

    const/16 v46, 0x0

    const/16 v41, 0x0

    const/16 v44, 0x0

    invoke-direct/range {v38 .. v46}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v25 .. v38}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;-><init>(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V

    move-object/from16 v9, v25

    invoke-static {v3, v9}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    :cond_18
    invoke-static {v3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v9

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v11

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_1a

    if-ne v11, v15, :cond_19

    goto :goto_8

    :cond_19
    move-object/from16 v19, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v7

    move-object/from16 v20, v10

    goto :goto_9

    :cond_1a
    :goto_8
    new-instance v16, Lam2/s;

    const/16 v21, 0xc

    move-object/from16 v19, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v7

    move-object/from16 v20, v10

    invoke-direct/range {v16 .. v21}, Lam2/s;-><init>(Lp1/c1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v11, v16

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static/range {v17 .. v17}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    invoke-virtual {v5, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1c

    if-ne v3, v15, :cond_1b

    goto :goto_a

    :cond_1b
    move-object/from16 v9, v19

    move-object/from16 v2, v20

    move-object/from16 v19, v11

    goto :goto_b

    :cond_1c
    :goto_a
    new-instance v16, La81/g;

    const/16 v22, 0x3

    move-object/from16 v21, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v11

    invoke-direct/range {v16 .. v22}, La81/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v3, v16

    move-object/from16 v9, v20

    move-object/from16 v2, v21

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v3, Lc93/m;

    if-eqz v6, :cond_1f

    const v7, -0x2ebd6b4e

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_1d

    if-ne v9, v15, :cond_1e

    :cond_1d
    new-instance v9, Lcom/whoop/profile/view/edit/n;

    const/4 v7, 0x0

    invoke-direct {v9, v7, v8, v2}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    invoke-static {v6, v9, v5, v7}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->EditProfileFullScreenModal(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    move-object/from16 p0, v4

    move v2, v7

    move-object v14, v8

    move-object v7, v3

    goto/16 :goto_f

    :cond_1f
    const/4 v7, 0x0

    const v6, 0x5716558e

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static/range {v17 .. v17}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v10

    if-nez v10, :cond_20

    const v2, 0x5716558d

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    move-object/from16 p0, v4

    move v2, v7

    move-object v14, v8

    move-object v7, v3

    goto/16 :goto_e

    :cond_20
    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v13

    invoke-static {v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object v6

    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_21

    if-ne v11, v15, :cond_22

    :cond_21
    new-instance v11, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$7$1$1;

    invoke-direct {v11, v6}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$7$1$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v11, Lj93/g;

    move-object v14, v11

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_24

    if-ne v7, v15, :cond_23

    goto :goto_c

    :cond_23
    move-object v6, v7

    move-object v7, v10

    goto :goto_d

    :cond_24
    :goto_c
    new-instance v6, Lam2/s;

    const/16 v11, 0xd

    move-object v7, v10

    move-object/from16 v10, v23

    invoke-direct/range {v6 .. v11}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_25

    if-ne v10, v15, :cond_26

    :cond_25
    new-instance v10, Lcom/whoop/profile/view/edit/o;

    const/4 v9, 0x0

    invoke-direct {v10, v2, v9}, Lcom/whoop/profile/view/edit/o;-><init>(Ll83/h;I)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v9, v10

    check-cast v9, Lc93/a;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_27

    new-instance v2, Lb01/m;

    const/16 v10, 0x14

    invoke-direct {v2, v10, v4}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v10, v2

    check-cast v10, Lc93/a;

    const/high16 v2, 0x6000000

    shl-int/lit8 v11, v24, 0x3

    or-int/2addr v2, v11

    move-object v11, v12

    move v12, v2

    move-object v2, v13

    const/4 v13, 0x0

    move-object/from16 p0, v7

    move-object v7, v3

    move-object/from16 v3, p0

    move-object/from16 p0, v4

    move-object v4, v11

    move-object v11, v5

    move-object v5, v14

    move-object v14, v8

    move-object/from16 v8, v19

    invoke-static/range {v2 .. v13}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->EditProfileContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_f
    invoke-static/range {p0 .. p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$6(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_2c

    const v3, -0x2ebc95d8

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-static/range {v17 .. v17}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v3

    if-nez v3, :cond_28

    const v3, 0x5729dad9

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_28
    const v2, 0x5729dada

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_29

    new-instance v3, Lb01/m;

    const/16 v4, 0x15

    move-object/from16 v6, p0

    invoke-direct {v3, v4, v6}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_29
    move-object/from16 v6, p0

    :goto_10
    check-cast v3, Lc93/a;

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2a

    if-ne v8, v15, :cond_2b

    :cond_2a
    new-instance v8, Lcom/whoop/profile/view/edit/p;

    const/4 v4, 0x0

    invoke-direct {v8, v7, v6, v4}, Lcom/whoop/profile/view/edit/p;-><init>(Lc93/m;Lp1/c1;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x30

    invoke-static {v2, v3, v8, v5, v4}, Lcom/whoop/profile/presentation/edit/BirthdayContentKt;->BirthdayContent(Ljava/lang/String;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_2c
    const v3, 0x573007f9

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    :goto_12
    invoke-static/range {v23 .. v23}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$9(Lp1/c1;)Z

    move-result v3

    if-eqz v3, :cond_31

    const v3, 0x5730f2c6

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget v3, Lcom/whoop/profile/R$string;->profile_discard_changes_title:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lcom/whoop/profile/R$string;->profile_discard_changes_message:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    sget v6, Lcom/whoop/profile/R$string;->profile_discard_changes_discard:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v7, Lcom/whoop/profile/R$string;->profile_discard_changes_cancel:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v15, :cond_2d

    new-instance v7, Lb01/m;

    const/16 v8, 0x12

    move-object/from16 v10, v23

    invoke-direct {v7, v8, v10}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_13

    :cond_2d
    move-object/from16 v10, v23

    :goto_13
    move-object/from16 v24, v7

    check-cast v24, Lc93/a;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v15, :cond_2e

    new-instance v7, Lb01/m;

    const/16 v8, 0x13

    invoke-direct {v7, v8, v10}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object/from16 v25, v7

    check-cast v25, Lc93/a;

    invoke-virtual {v5, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_2f

    if-ne v8, v15, :cond_30

    :cond_2f
    new-instance v8, Lbs1/v;

    const/16 v7, 0x17

    invoke-direct {v8, v7, v14, v10}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    move-object/from16 v26, v8

    check-cast v26, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v8, v7, 0x3

    shl-int/lit8 v9, v7, 0x6

    or-int/2addr v8, v9

    shl-int/lit8 v9, v7, 0x9

    or-int/2addr v8, v9

    shl-int/lit8 v7, v7, 0x1b

    or-int v31, v8, v7

    const/16 v33, 0xd80

    const v34, 0xe3fedf1

    move v7, v2

    const/4 v2, 0x0

    move-object/from16 v30, v5

    move-object v5, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 v35, v29

    const/16 v29, 0x0

    move/from16 v36, v32

    const/16 v32, 0x180

    move/from16 v0, v36

    invoke-static/range {v2 .. v34}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v5, v30

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_31
    move v0, v2

    move-object/from16 v35, v14

    const v2, 0x573b2bf9

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_14
    move-object/from16 v2, v35

    goto :goto_15

    :cond_32
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_34

    new-instance v3, Lcom/whoop/profile/presentation/edit/b;

    const/4 v4, 0x1

    move/from16 v5, p2

    invoke-direct {v3, v2, v5, v1, v4}, Lcom/whoop/profile/presentation/edit/b;-><init>(Ljava/lang/Object;III)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewModel;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$10(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final EditProfileScreen$lambda$18$0(Lp1/c1;Ljava/util/Map;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;
    .locals 3

    const-string v0, "fieldType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/whoop/profile/view/edit/EditProfileScreenKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    sget-object p1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p4

    invoke-virtual {p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result p4

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getLastValidatedUsername()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p3, p4, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleUsernameFieldBlur(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object p2

    invoke-virtual {v1, v0, p4, p2, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleEmailValidation(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p2

    invoke-static {p0, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->EMAIL:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne p4, p0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->getShouldTriggerApiValidation()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->getEmailToValidate()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->getEmailToValidate()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p0

    new-instance p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;->getEmailToValidate()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateEmailField;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$19$0(Lp1/c1;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;
    .locals 20

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    const-string v2, "fieldType"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "value"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    if-eqz v2, :cond_2

    sget-object v3, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    move-object/from16 v4, p1

    invoke-virtual {v3, v2, v0, v1, v4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateFieldValue(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v4

    sget-object v5, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne v0, v5, :cond_1

    invoke-static/range {p3 .. p3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static/range {p3 .. p3}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v1, v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->shouldTriggerUsernameValidation(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v11

    invoke-virtual {v4}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    const/16 v12, 0x1f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v13}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v6

    move v3, v11

    const/16 v18, 0x1ffd

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v4 .. v19}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v4

    if-eqz v3, :cond_0

    invoke-static/range {p4 .. p4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object v0

    new-instance v3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;

    invoke-direct {v3, v1}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ValidateUsernameField;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static/range {p4 .. p4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object v0

    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ClearUsernameValidation;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$ClearUsernameValidation;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    :cond_1
    :goto_0
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;->getShouldValidateState()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->STATE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final EditProfileScreen$lambda$20$0(Leb/a0;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p0

    check-cast p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;

    invoke-virtual {p0, p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;

    if-eqz p1, :cond_1

    check-cast p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;

    invoke-static {p2, p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->handleNavigationEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final EditProfileScreen$lambda$21$1$0(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Leb/a0;Lp1/t2;Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    invoke-virtual {p4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v0

    invoke-static {p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result p2

    invoke-virtual {p0, v0, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->isAnyFieldDirty(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Z)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    invoke-static {p3, p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$10(Lp1/c1;Z)V

    goto :goto_0

    :cond_0
    invoke-static {p4, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->handleNavigationEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V

    goto :goto_0

    :cond_1
    invoke-static {p4, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->handleNavigationEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$21$2$0(Ll83/h;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p0

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$UsernameFieldTapped;

    invoke-virtual {p0, v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$21$3$0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$7(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$22$0$0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$7(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$22$1$0(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "selectedDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->BIRTHDAY:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-interface {p0, v0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$7(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$23$0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$10(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$24$0(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$10(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$25$0(Leb/a0;Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$10(Lp1/c1;Z)V

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$26(Leb/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen(Leb/a0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object p0
.end method

.method private static final EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final EditProfileScreen$lambda$6(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final EditProfileScreen$lambda$7(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final EditProfileScreen$lambda$9(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$21$3$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$0(Ll83/h;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    return-void
.end method

.method public static synthetic b(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$22$1$0(Lc93/m;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$22$0$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$24$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$19$0(Lp1/c1;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Ljava/util/Map;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$18$0(Lp1/c1;Ljava/util/Map;Lp1/t2;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Leb/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$26(Leb/a0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Leb/a0;Lp1/t2;Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$21$1$0(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Leb/a0;Lp1/t2;Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final handleNavigationEvent(Lcom/whoop/profile/presentation/edit/EditProfileEvent$NavigationEvent;Leb/a0;)V
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Leb/a0;->z()Z

    :cond_0
    return-void
.end method

.method public static synthetic i(Leb/a0;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$20$0(Leb/a0;Ll83/h;Lcom/whoop/profile/presentation/edit/EditProfileEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$23$0(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ll83/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$21$2$0(Ll83/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Leb/a0;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen$lambda$25$0(Leb/a0;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method
