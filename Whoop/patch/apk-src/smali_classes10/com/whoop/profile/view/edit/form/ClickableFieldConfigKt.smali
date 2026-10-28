.class public final Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\nH\u0002\u001a\u001c\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "createClickableFieldConfigs",
        "",
        "Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;",
        "profileData",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "formState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "getGenderDisplayText",
        "Lcom/whoop/design/util/TextResource;",
        "genderValue",
        "",
        "getPhysiologicalBaselineDisplayText",
        "baselineValue",
        "createHeightWeightGroupedField",
        "Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;",
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
.method public static final createClickableFieldConfigs(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "formState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getCountries()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-virtual {v4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    check-cast v3, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    goto :goto_1

    :cond_2
    move-object v3, v0

    :goto_1
    const/4 v2, 0x0

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getStates()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v4

    if-ne v3, v4, :cond_3

    move v2, v4

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/profile/domain/models/Gender;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/Gender;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/domain/models/Gender;->requiresPhysiologicalBaseline()Z

    move-result v3

    sget-object v6, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->COUNTRY:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    sget v7, Lcom/whoop/profile/R$string;->profile_edit_country_label:I

    if-eqz p0, :cond_7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getCountries()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_2

    :cond_5
    move-object v8, v0

    :goto_2
    check-cast v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    move-object v8, v5

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_3

    :goto_5
    new-instance v5, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x38

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v2, :cond_f

    sget-object v7, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->STATE:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    sget v8, Lcom/whoop/profile/R$string;->profile_edit_state_label:I

    if-eqz p0, :cond_d

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getCountries()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryCode()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_9
    move-object v6, v0

    :goto_6
    check-cast v6, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getStates()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_d

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;->getCode()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    instance-of v10, v10, Lcom/whoop/design/util/TextResource$e;

    if-eqz v10, :cond_a

    invoke-virtual {v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v9}, Lcom/whoop/design/util/TextResource$e;->a()Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v4}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_a

    goto :goto_7

    :cond_b
    move-object v6, v0

    :cond_c
    :goto_7
    check-cast v6, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    if-eqz v6, :cond_d

    invoke-virtual {v6}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;->getName()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_8
    move-object v9, v2

    goto :goto_9

    :cond_d
    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_e

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_e
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_8

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v11

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v6, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    const/4 v10, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-direct/range {v6 .. v14}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_f
    move-object v6, v0

    :goto_a
    new-instance v7, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    sget-object v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->GENDER:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    sget v9, Lcom/whoop/profile/R$string;->profile_edit_gender_label:I

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt;->getGenderDisplayText(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/16 v14, 0x38

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v3, :cond_10

    new-instance v8, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    sget-object v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;->PHYSIOLOGICAL_BASELINE:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    sget v10, Lcom/whoop/profile/R$string;->profile_edit_physiological_baseline_label:I

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt;->getPhysiologicalBaselineDisplayText(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v15, 0x30

    const/16 v16, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;ILcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v8

    :cond_10
    filled-new-array {v5, v6, v7, v0}, [Lcom/whoop/profile/view/edit/form/ClickableFieldConfig;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final createHeightWeightGroupedField(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;
    .locals 11

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getHeight()F

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getWeight()D

    move-result-wide v2

    double-to-float v2, v2

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getHeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_0

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    :cond_0
    move-object v9, v3

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getWeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p1

    :cond_1
    move-object v10, p1

    sget-object p1, Ld21/a;->a:Ld21/a;

    invoke-static {v10}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1}, Ld21/a;->m(F)I

    move-result v1

    new-instance v4, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;

    invoke-virtual {p0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    invoke-virtual {p1, v2, v0}, Ld21/a;->d(FZ)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1, v1, v0}, Ld21/a;->e(IZ)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v8, p0

    invoke-direct/range {v4 .. v10}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedField;-><init>(Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final getGenderDisplayText(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 3

    invoke-static {p0}, Lcom/whoop/profile/domain/models/Gender;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/Gender;

    move-result-object p0

    sget-object v0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt$WhenMappings;->$EnumSwitchMapping$0:[I

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

.method private static final getPhysiologicalBaselineDisplayText(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 3

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object p0

    sget-object v0, Lcom/whoop/profile/view/edit/form/ClickableFieldConfigKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq p0, v0, :cond_3

    if-eq p0, v1, :cond_2

    const/4 v0, 0x3

    if-ne p0, v0, :cond_1

    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_prefer_not_to_specify:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_male:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_3
    new-instance p0, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_baseline_female:I

    invoke-direct {p0, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
