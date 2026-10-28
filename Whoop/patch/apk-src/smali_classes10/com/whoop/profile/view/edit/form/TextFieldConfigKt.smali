.class public final Lcom/whoop/profile/view/edit/form/TextFieldConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "createTextFieldConfigs",
        "",
        "Lcom/whoop/profile/view/edit/form/TextFieldConfig;",
        "formState",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "includeUsername",
        "",
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
.method public static final createTextFieldConfigs(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/whoop/profile/view/edit/form/TextFieldConfig;",
            ">;"
        }
    .end annotation

    const-string v0, "formState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_0

    new-instance v1, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    sget-object v2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    sget v3, Lcom/whoop/profile/R$string;->profile_edit_username_label:I

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;IIILcom/whoop/profile/view/edit/form/FieldState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    sget-object v3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->FIRST_NAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    sget v4, Lcom/whoop/profile/R$string;->profile_edit_first_name_label:I

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getFirstName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x6

    invoke-direct/range {v2 .. v8}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;IIILcom/whoop/profile/view/edit/form/FieldState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    sget-object v4, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->LAST_NAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    sget v5, Lcom/whoop/profile/R$string;->profile_edit_last_name_label:I

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getLastName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x6

    invoke-direct/range {v3 .. v9}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;IIILcom/whoop/profile/view/edit/form/FieldState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/whoop/profile/view/edit/form/TextFieldConfig;

    sget-object v5, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->CITY:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    sget v6, Lcom/whoop/profile/R$string;->profile_edit_city_label:I

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCity()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x7

    invoke-direct/range {v4 .. v10}, Lcom/whoop/profile/view/edit/form/TextFieldConfig;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;IIILcom/whoop/profile/view/edit/form/FieldState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-object v0
.end method
