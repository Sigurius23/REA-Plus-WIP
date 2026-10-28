.class public final Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ*\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\"\u0010\u0012\u001a\u00020\u0007*\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000c\u001a\u00020\t2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000c\u001a\u00020\tH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u000c\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000c\u001a\u00020\tH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u000c\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;",
        "",
        "featureFlagChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "reduce",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "domainResult",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "toFullScreenModal",
        "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;",
        "domainState",
        "isUsernameFieldEditable",
        "",
        "lockedFields",
        "",
        "Lcom/whoop/profile/domain/edit/models/ProfileLockField;",
        "toViewState",
        "createEditableFields",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;",
        "mapResponseToProfileData",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "response",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "createAvatarState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
        "createEmailValidationState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;",
        "createUsernameValidationState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;",
        "createAvatarModal",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final createAvatarModal(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;
    .locals 15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    new-instance v2, Lsz0/q0;

    new-instance v4, Lsz0/p0$e;

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_uploading_profile_image:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    sget v3, Lgy0/a;->B2:I

    invoke-direct {v4, v0, v3}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const/16 v13, 0x3fd

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v6, 0xe

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadSuccess()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    new-instance v2, Lsz0/q0;

    new-instance v3, Lsz0/p0$h;

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_success:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-wide/16 v5, 0x5dc

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_upload_success:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/16 v13, 0x3f9

    const/4 v14, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;

    const/16 v6, 0xc

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadError()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    new-instance v2, Lsz0/q0;

    new-instance v3, Lsz0/p0$b;

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_unable_to_upload:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_upload_error_message:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_retry_button:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget v0, Lcom/whoop/profile/R$string;->profile_avatar_close_button:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    const/16 v13, 0x349

    const/4 v14, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$AvatarUploadRetry;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$AvatarUploadRetry;

    sget-object v4, Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$CloseAvatarModal;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method private final createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
    .locals 14

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading()Z

    move-result v1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadSuccess()Z

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadError()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getAvatarUrl()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->isUploading()Z

    move-result v8

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadSuccess()Z

    move-result v9

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getUploadError()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    :goto_1
    move v10, v5

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->getPendingUploadData()[B

    move-result-object v11

    const/16 v12, 0x70

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
            "Ljava/util/Set<",
            "+",
            "Lcom/whoop/profile/domain/edit/models/ProfileLockField;",
            ">;)",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;"
        }
    .end annotation

    move-object/from16 v0, p2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    const-string v10, ""

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getEmail()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    move-object v3, v10

    :cond_1
    sget-object v4, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->EMAIL:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v12, v3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v12, v10

    :goto_1
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->USERNAME:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v4

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getFirstName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    move-object v12, v3

    goto :goto_3

    :cond_5
    :goto_2
    move-object v12, v10

    :goto_3
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->FIRST_NAME:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getLastName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    move-object v12, v3

    goto :goto_5

    :cond_7
    :goto_4
    move-object v12, v10

    :goto_5
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->LAST_NAME:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v6

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getGender()Lcom/whoop/profile/domain/models/Gender;

    move-result-object v3

    if-nez v3, :cond_8

    sget-object v3, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_9

    goto :goto_6

    :cond_9
    move-object v12, v3

    goto :goto_7

    :cond_a
    :goto_6
    move-object v12, v10

    :goto_7
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->GENDER:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    new-instance v7, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xe

    const/16 v18, 0x0

    move-object v11, v7

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getPhysiologicalBaseline()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_b

    goto :goto_8

    :cond_b
    move-object v12, v3

    goto :goto_9

    :cond_c
    :goto_8
    move-object v12, v10

    :goto_9
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->PHYSIOLOGICAL_BASELINE:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v11, v8

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_d

    goto :goto_a

    :cond_d
    move-object v12, v3

    goto :goto_b

    :cond_e
    :goto_a
    move-object v12, v10

    :goto_b
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->HEIGHT:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xc

    const/16 v18, 0x0

    move-object v11, v9

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeight()F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_f

    goto :goto_c

    :cond_f
    move-object v12, v3

    goto :goto_d

    :cond_10
    :goto_c
    move-object v12, v10

    :goto_d
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->WEIGHT:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v16

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0xc

    const/16 v18, 0x0

    invoke-direct/range {v11 .. v18}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUnitSystem()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_11

    goto :goto_e

    :cond_11
    move-object v13, v3

    goto :goto_f

    :cond_12
    :goto_e
    move-object v13, v10

    :goto_f
    const/16 v18, 0x1c

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCountry()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_13

    goto :goto_10

    :cond_13
    move-object v14, v3

    goto :goto_11

    :cond_14
    :goto_10
    move-object v14, v10

    :goto_11
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->COUNTRY:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v18

    const/16 v19, 0xc

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_16

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getState()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_15

    goto :goto_12

    :cond_15
    move-object v15, v3

    goto :goto_13

    :cond_16
    :goto_12
    move-object v15, v10

    :goto_13
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->STATE:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v19

    const/16 v20, 0xc

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v21}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getBirthday()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_17

    goto :goto_14

    :cond_17
    move-object/from16 v16, v3

    goto :goto_15

    :cond_18
    :goto_14
    move-object/from16 v16, v10

    :goto_15
    sget-object v3, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->BIRTHDAY:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v20

    const/16 v21, 0xc

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v16, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    if-eqz v1, :cond_1a

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCity()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_19

    goto :goto_16

    :cond_19
    move-object/from16 v17, v1

    goto :goto_17

    :cond_1a
    :goto_16
    move-object/from16 v17, v10

    :goto_17
    sget-object v1, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->CITY:Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v21

    const/16 v22, 0xc

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v23}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;-><init>(Ljava/lang/String;ZZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v2

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    invoke-direct/range {v2 .. v15}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;)V

    return-object v2
.end method

.method private final createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getEmailValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;->getResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    move-result-object v0

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getEmailValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;->isValidating()Z

    move-result v2

    instance-of v3, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$Available;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    instance-of v5, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;

    if-nez v5, :cond_3

    instance-of v5, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    move-object v5, v4

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    instance-of v6, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;

    if-eqz v6, :cond_4

    sget v0, Lcom/whoop/profile/R$string;->profile_edit_email_cannot_be_used:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    goto :goto_2

    :cond_4
    instance-of v6, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;

    if-eqz v6, :cond_5

    sget v0, Lcom/whoop/profile/R$string;->profile_edit_email_validation_network_error:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    goto :goto_2

    :cond_5
    if-nez v3, :cond_7

    if-nez v0, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    :goto_2
    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getEmailValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;->getLastValidatedEmail()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v5, v4, p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v1
.end method

.method private final createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getUsernameValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;->getResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getUsernameValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;->isValidating()Z

    move-result v3

    instance-of v1, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    instance-of v4, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    if-nez v4, :cond_3

    instance-of v4, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    move-object v4, v2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    instance-of v5, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    if-eqz v5, :cond_6

    move-object v5, v0

    check-cast v5, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_2

    :cond_4
    move-object v5, v2

    :goto_2
    if-eqz v5, :cond_5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_5

    :cond_5
    :goto_3
    move-object v5, v2

    goto :goto_5

    :cond_6
    instance-of v5, v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    if-eqz v5, :cond_8

    move-object v5, v0

    check-cast v5, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    move-object v5, v2

    :goto_4
    if-eqz v5, :cond_5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_5

    :cond_8
    if-nez v1, :cond_5

    if-nez v0, :cond_9

    goto :goto_3

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_5
    if-eqz v1, :cond_b

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    move-object v0, v2

    :goto_6
    if-eqz v0, :cond_b

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :cond_b
    move-object v6, v2

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getUsernameValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;->getLastValidatedUsername()Ljava/lang/String;

    move-result-object v7

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    invoke-direct/range {v2 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v2
.end method

.method private final mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;
    .locals 36

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getTitle()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getAvatarUrl()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getFirstName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getLastName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_2
    const/4 v9, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getMemberSince()D

    move-result-wide v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getAge()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getFoundingMember()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_1
    move v15, v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUserId()I

    move-result v0

    move-object v11, v3

    int-to-long v2, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeight()F

    move-result v18

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeight()F

    move-result v0

    move-object/from16 v17, v1

    float-to-double v0, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getBirthday()Ljava/lang/String;

    move-result-object v19

    if-nez v19, :cond_4

    move-object/from16 v19, v17

    :cond_4
    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    move-wide/from16 v19, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUnitSystem()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    move-wide/from16 v22, v2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lcom/whoop/domain/model/UnitSystemExtKt;->unitSystemFromStringOrDefault$default(Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;ILjava/lang/Object;)Lcom/whoop/domain/model/UnitSystem;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getGender()Lcom/whoop/profile/domain/models/Gender;

    move-result-object v1

    if-nez v1, :cond_5

    sget-object v1, Lcom/whoop/profile/domain/models/Gender;->PREFER_NOT:Lcom/whoop/profile/domain/models/Gender;

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getPhysiologicalBaseline()Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    :cond_6
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    new-instance v25, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightFeetMinValue()I

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x3

    :goto_3
    move/from16 v26, v2

    goto :goto_4

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightFeetMinValue()I

    move-result v2

    goto :goto_3

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightFeetMaxValue()I

    move-result v2

    if-nez v2, :cond_8

    const/4 v2, 0x7

    :goto_5
    move/from16 v27, v2

    goto :goto_6

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightFeetMaxValue()I

    move-result v2

    goto :goto_5

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMinValue()Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMinValue()Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMinValue()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_7
    move/from16 v28, v2

    goto :goto_9

    :cond_a
    :goto_8
    const v2, 0x3f68f5c3    # 0.91f

    goto :goto_7

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMaxValue()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMaxValue()Ljava/lang/Float;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v2

    if-eqz v2, :cond_b

    goto :goto_b

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getHeightMetersMaxValue()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_a
    move/from16 v29, v2

    goto :goto_c

    :cond_c
    :goto_b
    const v2, 0x400851ec    # 2.13f

    goto :goto_a

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightPoundsMinValue()I

    move-result v2

    if-nez v2, :cond_d

    const/16 v2, 0x32

    :goto_d
    move/from16 v30, v2

    goto :goto_e

    :cond_d
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightPoundsMinValue()I

    move-result v2

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightPoundsMaxValue()I

    move-result v2

    if-nez v2, :cond_e

    const/16 v2, 0x190

    :goto_f
    move/from16 v31, v2

    goto :goto_10

    :cond_e
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightPoundsMaxValue()I

    move-result v2

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightKilogramsMinValue()I

    move-result v2

    const/16 v3, 0xa

    if-nez v2, :cond_f

    move/from16 v32, v3

    goto :goto_11

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightKilogramsMinValue()I

    move-result v2

    move/from16 v32, v2

    :goto_11
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightKilogramsMaxValue()I

    move-result v2

    if-nez v2, :cond_10

    const/16 v2, 0x1f4

    :goto_12
    move/from16 v33, v2

    goto :goto_13

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getWeightKilogramsMaxValue()I

    move-result v2

    goto :goto_12

    :goto_13
    invoke-direct/range {v25 .. v33}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;-><init>(IIFFIIII)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCountries()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    move-object/from16 v16, v0

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v26, v1

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/profile/domain/edit/models/CountryOption;

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/models/CountryOption;->getName()Ljava/lang/String;

    move-result-object v27

    invoke-static/range {v27 .. v27}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/models/CountryOption;->getCountryCode()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/models/CountryOption;->getCountryFlag()Ljava/lang/String;

    move-result-object v27

    if-nez v27, :cond_11

    move-object/from16 v31, v17

    goto :goto_15

    :cond_11
    move-object/from16 v31, v27

    :goto_15
    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/models/CountryOption;->getAgeLimit()Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/models/CountryOption;->getStates()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_13

    check-cast v2, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v27, v4

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/profile/domain/edit/models/StateOption;

    new-instance v3, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    invoke-virtual {v4}, Lcom/whoop/profile/domain/edit/models/StateOption;->getName()Ljava/lang/String;

    move-result-object v28

    move-object/from16 v33, v2

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v4}, Lcom/whoop/profile/domain/edit/models/StateOption;->getStateCode()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v33

    const/16 v3, 0xa

    goto :goto_16

    :cond_12
    :goto_17
    move-object/from16 v33, v1

    goto :goto_18

    :cond_13
    move-object/from16 p1, v1

    move-object/from16 v27, v4

    sget-object v1, Lm83/y;->w:Lm83/y;

    goto :goto_17

    :goto_18
    new-instance v28, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-direct/range {v28 .. v33}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v1, v28

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move-object/from16 v4, v27

    const/16 v3, 0xa

    goto/16 :goto_14

    :cond_14
    move-object/from16 v27, v4

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-object v3, v11

    const/4 v11, 0x0

    move-wide/from16 v34, v22

    move-object/from16 v22, v16

    move-wide/from16 v16, v34

    move-object/from16 v23, v26

    move-object/from16 v26, v0

    invoke-direct/range {v2 .. v26}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;DIZJFDLcom/whoop/design/util/TextResource;Lcom/whoop/domain/model/UnitSystem;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Ljava/util/List;)V

    return-object v2
.end method

.method private final toFullScreenModal(Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;Lcom/whoop/profile/domain/edit/EditProfileDomainState;ZLjava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;",
            "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
            "Z",
            "Ljava/util/Set<",
            "+",
            "Lcom/whoop/profile/domain/edit/models/ProfileLockField;",
            ">;)",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    instance-of v4, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    new-instance v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v11, v1

    goto :goto_0

    :cond_0
    move-object v11, v7

    :goto_0
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v12

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v15

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_1
    if-eqz v7, :cond_2

    move/from16 v16, v6

    :goto_1
    move-object v10, v8

    goto :goto_2

    :cond_2
    move/from16 v16, v5

    goto :goto_1

    :goto_2
    new-instance v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v9, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    move/from16 v17, p3

    invoke-direct/range {v8 .. v19}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_3
    instance-of v4, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Saving;

    if-eqz v4, :cond_7

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v12, v1

    goto :goto_3

    :cond_4
    move-object v12, v7

    :goto_3
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v15

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_5
    if-eqz v7, :cond_6

    move/from16 v17, v6

    goto :goto_4

    :cond_6
    move/from16 v17, v5

    :goto_4
    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v10, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, p3

    move-object v11, v8

    invoke-direct/range {v9 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_7
    instance-of v4, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;

    if-eqz v4, :cond_b

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v9

    sget-object v10, Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;

    sget-object v12, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v12, v1

    goto :goto_5

    :cond_8
    move-object v12, v7

    :goto_5
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v15

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_9
    if-eqz v7, :cond_a

    move/from16 v17, v6

    goto :goto_6

    :cond_a
    move/from16 v17, v5

    :goto_6
    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v10, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, p3

    move-object v11, v8

    invoke-direct/range {v9 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_b
    instance-of v4, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;

    if-eqz v4, :cond_f

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v9

    sget-object v10, Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;

    sget-object v12, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v12, v1

    goto :goto_7

    :cond_c
    move-object v12, v7

    :goto_7
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v15

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_d
    if-eqz v7, :cond_e

    move/from16 v17, v6

    goto :goto_8

    :cond_e
    move/from16 v17, v5

    :goto_8
    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v10, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, p3

    move-object v11, v8

    invoke-direct/range {v9 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_f
    instance-of v4, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Success;

    if-eqz v4, :cond_13

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v12, v1

    goto :goto_9

    :cond_10
    move-object v12, v7

    :goto_9
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v15

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_11
    if-eqz v7, :cond_12

    move/from16 v17, v6

    goto :goto_a

    :cond_12
    move/from16 v17, v5

    :goto_a
    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v10, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, p3

    move-object v11, v8

    invoke-direct/range {v9 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_13
    instance-of v1, v1, Lcom/whoop/profile/domain/edit/EditProfileDialogType$SaveError;

    if-eqz v1, :cond_17

    new-instance v11, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v9

    sget-object v10, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    const/4 v13, 0x4

    const/4 v14, 0x0

    move-object v8, v11

    const/4 v11, 0x0

    move-object v12, v10

    invoke-direct/range {v8 .. v14}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v1

    move-object v12, v1

    goto :goto_b

    :cond_14
    move-object v12, v7

    :goto_b
    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v13

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v14

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v15

    invoke-direct {v0, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v7

    :cond_15
    if-eqz v7, :cond_16

    move/from16 v17, v6

    goto :goto_c

    :cond_16
    move/from16 v17, v5

    :goto_c
    new-instance v9, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v10, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    move/from16 v18, p3

    move-object v11, v8

    invoke-direct/range {v9 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9

    :cond_17
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final toViewState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;ZLjava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
            "Z",
            "Ljava/util/Set<",
            "+",
            "Lcom/whoop/profile/domain/edit/models/ProfileLockField;",
            ">;)",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarModal(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->mapResponseToProfileData(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    move-result-object v4

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEditableFields(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    move-result-object v5

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v6

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v7

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUsername()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_1
    move v9, v1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :goto_2
    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v2, 0x0

    move/from16 v10, p2

    invoke-direct/range {v1 .. v12}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    move-object/from16 v1, p1

    new-instance v4, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    if-nez v3, :cond_3

    new-instance v5, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    sget-object v2, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v2}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v6

    sget-object v7, Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$Refresh;

    sget-object v9, Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$GoBack;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;-><init>(Lsz0/q0;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;Lcom/whoop/profile/presentation/edit/EditProfileEvent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    goto :goto_3

    :cond_3
    move-object v6, v3

    :goto_3
    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createAvatarState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object v9

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createEmailValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    move-result-object v10

    invoke-direct/range {p0 .. p1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->createUsernameValidationState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v11

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v12, 0x0

    move/from16 v13, p2

    invoke-direct/range {v4 .. v15}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public final reduce(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 7

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-profile-username-field"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getLockedFields()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/whoop/profile/domain/edit/models/ProfileLockField;->getEntries()Lt83/a;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    check-cast v5, Lcom/whoop/profile/domain/edit/models/ProfileLockField;

    if-eqz v5, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    goto :goto_2

    :cond_4
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getCurrentDialogType()Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;

    if-eqz v3, :cond_5

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->getCurrentDialogType()Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    move-result-object v2

    check-cast v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;

    invoke-direct {p0, v2, p1, v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->toFullScreenModal(Lcom/whoop/profile/domain/edit/EditProfileDialogType$FullScreenModal;Lcom/whoop/profile/domain/edit/EditProfileDomainState;ZLjava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v2, v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$NoChangesToSave;

    if-eqz v2, :cond_6

    invoke-direct {p0, p1, v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->toViewState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;ZLjava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-direct {p0, p1, v0, v1}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;->toViewState(Lcom/whoop/profile/domain/edit/EditProfileDomainState;ZLjava/util/Set;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p1

    return-object p1
.end method
