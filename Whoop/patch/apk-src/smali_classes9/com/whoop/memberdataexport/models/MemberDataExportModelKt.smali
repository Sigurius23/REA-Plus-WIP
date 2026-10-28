.class public final Lcom/whoop/memberdataexport/models/MemberDataExportModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/memberdataexport/models/MemberDataExportModelKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "reduceDtoToModel",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "intermediateMdeDto",
        "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        "member-data-export_release"
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
.method public static final reduceDtoToModel(Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;
    .locals 15

    const-string v0, "intermediateMdeDto"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llv1/b;->Companion:Llv1/b$a;

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getState()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llv1/b$a;->a(Ljava/lang/String;)Llv1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/memberdataexport/models/MemberDataExportModelKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p0, 0x4

    if-ne v0, p0, :cond_0

    new-instance p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getScreenTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getHeadlineDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getBodyDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getExportUnavailableSectionIcon()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getExportUnavailableSectionHeadlineDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getExportUnavailableSectionBodyDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getHelpLinkTextDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getHelpLink()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct/range {v0 .. v8}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getScreenTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getHeadlineDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getBodyDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getLearnMoreTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getLearnMoreLink()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getUpdateAccountTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getConfirmationTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getRecipientEmailDisplay()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getRecipientEmailLabelDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getSubmitButtonTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getSubmissionLoadingTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {p0}, Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;->getSubmissionSuccessTextDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const-string v8, "android-app://com.whoop/settings/profileUpdateFragment"

    invoke-direct/range {v1 .. v14}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1

    :cond_3
    sget-object p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;->INSTANCE:Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;

    return-object p0
.end method
