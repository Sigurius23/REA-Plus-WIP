.class public final Lcom/whoop/profile/view/edit/GenderBaselineBottomSheetLogicKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u001aO\u0010\n\u001a\u00020\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aS\u0010\u0010\u001a\u00020\u00052\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a\u001d\u0010\u001a\u001a\u00020\u0014*\u00020\u00142\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u001a\u001b\u0010\u001f\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/profile/domain/models/Gender;",
        "selectedGender",
        "Lkotlin/Function2;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
        "",
        "Ll83/a0;",
        "onFieldUpdate",
        "Lkotlin/Function0;",
        "onTransitionToBaseline",
        "onClose",
        "handleGenderSelectionConfirm",
        "(Lcom/whoop/profile/domain/models/Gender;Lc93/m;Lc93/a;Lc93/a;)V",
        "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
        "selectedBaseline",
        "",
        "isTransitionedFromGender",
        "handlePhysiologicalBaselineSelectionConfirm",
        "(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZLc93/m;Lc93/a;)V",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "formState",
        "Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
        "initializeGenderBaselineState",
        "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
        "resetGenderBaselineState",
        "()Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
        "gender",
        "updateSelectedGender",
        "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
        "baseline",
        "updateSelectedBaseline",
        "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
        "markAsTransitionedFromGender",
        "(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;",
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
.method public static final handleGenderSelectionConfirm(Lcom/whoop/profile/domain/models/Gender;Lc93/m;Lc93/a;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/models/Gender;",
            "Lc93/m;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onFieldUpdate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTransitionToBaseline"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/Gender;->requiresPhysiologicalBaseline()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_0
    if-eqz p0, :cond_1

    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->GENDER:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->PHYSIOLOGICAL_BASELINE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    const-string p2, ""

    invoke-interface {p1, p0, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final handlePhysiologicalBaselineSelectionConfirm(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZLc93/m;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/models/Gender;",
            "Lcom/whoop/profile/domain/models/PhysiologicalBaseline;",
            "Z",
            "Lc93/m;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onFieldUpdate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClose"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    if-eqz p0, :cond_1

    if-eqz p1, :cond_1

    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->GENDER:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p3, p2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->PHYSIOLOGICAL_BASELINE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->PHYSIOLOGICAL_BASELINE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final initializeGenderBaselineState(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;
    .locals 3

    const-string v0, "formState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/profile/domain/models/Gender;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/Gender;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;-><init>(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Z)V

    return-object v0
.end method

.method public static final markAsTransitionedFromGender(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object p1

    :goto_0
    move-object v2, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;->copy$default(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZILjava/lang/Object;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static final resetGenderBaselineState()Lcom/whoop/profile/view/edit/GenderBaselineSheetState;
    .locals 6

    new-instance v0, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;-><init>(Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static final updateSelectedBaseline(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;->copy$default(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZILjava/lang/Object;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;

    move-result-object p0

    return-object p0
.end method

.method public static final updateSelectedGender(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/whoop/profile/view/edit/GenderBaselineSheetState;->copy$default(Lcom/whoop/profile/view/edit/GenderBaselineSheetState;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;ZILjava/lang/Object;)Lcom/whoop/profile/view/edit/GenderBaselineSheetState;

    move-result-object p0

    return-object p0
.end method
