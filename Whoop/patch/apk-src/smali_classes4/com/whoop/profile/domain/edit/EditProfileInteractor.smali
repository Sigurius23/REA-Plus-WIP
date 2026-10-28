.class public final Lcom/whoop/profile/domain/edit/EditProfileInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000245B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u001d\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\"\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008#\u0010!J\u001f\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J!\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0004\u0008*\u0010+J#\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00100R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00101R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u00102R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00103\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
        "Lod1/g;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "Lu02/c;",
        "apiClient",
        "Ltr2/n;",
        "logger",
        "Lpr2/b;",
        "avatarService",
        "Lpd1/a;",
        "bootstrapUserSignIn",
        "Lw02/a;",
        "errorBodyParser",
        "<init>",
        "(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;)V",
        "Lec3/l;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
        "deleteCurrentUserAvatarFlow",
        "()Lec3/l;",
        "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;",
        "updateRequest",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "currentResponse",
        "handleSave",
        "(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;",
        "",
        "imageData",
        "uploadAvatar",
        "([B)Lec3/l;",
        "",
        "email",
        "validateEmailField",
        "(Ljava/lang/String;)Lec3/l;",
        "username",
        "validateUsernameField",
        "",
        "preserveFormState",
        "handleRefresh",
        "(Z)Lec3/l;",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "formState",
        "createUpdateRequestFromFormState",
        "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lu02/c;",
        "Ltr2/n;",
        "Lpr2/b;",
        "Lpd1/a;",
        "Lw02/a;",
        "InternalState",
        "StateUpdate",
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
.field private final apiClient:Lu02/c;

.field private final avatarService:Lpr2/b;

.field private final bootstrapUserSignIn:Lpd1/a;

.field private final errorBodyParser:Lw02/a;

.field private final logger:Ltr2/n;


# direct methods
.method public constructor <init>(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatarService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bootstrapUserSignIn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorBodyParser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->apiClient:Lu02/c;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->logger:Ltr2/n;

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->avatarService:Lpr2/b;

    .line 5
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->bootstrapUserSignIn:Lpd1/a;

    .line 6
    iput-object p5, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->errorBodyParser:Lw02/a;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 7
    new-instance p5, Lw02/a;

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-direct {p5, p7, p7, p6, p7}, Lw02/a;-><init>(Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;-><init>(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;)V

    return-void
.end method

.method public static final synthetic access$createUpdateRequestFromFormState(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->createUpdateRequestFromFormState(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$deleteCurrentUserAvatarFlow(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->deleteCurrentUserAvatarFlow()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getApiClient$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->apiClient:Lu02/c;

    return-object p0
.end method

.method public static final synthetic access$getAvatarService$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lpr2/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->avatarService:Lpr2/b;

    return-object p0
.end method

.method public static final synthetic access$getBootstrapUserSignIn$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lpd1/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->bootstrapUserSignIn:Lpd1/a;

    return-object p0
.end method

.method public static final synthetic access$getErrorBodyParser$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lw02/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->errorBodyParser:Lw02/a;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$handleRefresh(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Z)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->handleRefresh(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleSave(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->handleSave(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$uploadAvatar(Lcom/whoop/profile/domain/edit/EditProfileInteractor;[B)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->uploadAvatar([B)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$validateEmailField(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->validateEmailField(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$validateUsernameField(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->validateUsernameField(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final createUpdateRequestFromFormState(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getHeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    move v13, v0

    goto :goto_0

    :cond_0
    move v13, v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getWeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_1
    move v14, v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUnitSystem()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-nez v0, :cond_4

    if-eqz p2, :cond_3

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getUnitSystem()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    if-nez v0, :cond_4

    const-string v0, "imperial"

    :cond_4
    move-object v15, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getFirstName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getLastName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/profile/domain/models/Gender;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/Gender;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v0, v2

    :goto_3
    if-nez v0, :cond_6

    if-eqz p2, :cond_7

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getBirthday()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    move-object v10, v0

    goto :goto_6

    :cond_7
    :goto_5
    const-string v0, ""

    goto :goto_4

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_8

    move-object v4, v0

    goto :goto_7

    :cond_8
    move-object v4, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_9

    move-object v8, v0

    goto :goto_8

    :cond_9
    move-object v8, v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCity()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_a

    goto :goto_9

    :cond_a
    move-object v0, v2

    :goto_9
    if-nez v0, :cond_b

    if-eqz p2, :cond_c

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->getCity()Ljava/lang/String;

    move-result-object v0

    :cond_b
    move-object v9, v0

    goto :goto_a

    :cond_c
    move-object v9, v2

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_d

    goto :goto_b

    :cond_d
    move-object v0, v2

    :goto_b
    if-eqz v0, :cond_e

    invoke-static {v0}, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;->valueOf(Ljava/lang/String;)Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    move-result-object v2

    :cond_e
    move-object v12, v2

    new-instance v2, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    invoke-direct/range {v2 .. v15}, Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/domain/models/Gender;Lcom/whoop/profile/domain/models/PhysiologicalBaseline;FFLjava/lang/String;)V

    return-object v2
.end method

.method private final deleteCurrentUserAvatarFlow()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$deleteCurrentUserAvatarFlow$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$deleteCurrentUserAvatarFlow$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final handleRefresh(Z)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;ZLq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method public static synthetic handleRefresh$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->handleRefresh(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final handleSave(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;",
            "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance p2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleSave$1;

    const/4 v0, 0x0

    invoke-direct {p2, p1, p0, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleSave$1;-><init>(Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, p2}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final uploadAvatar([B)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;-><init>([BLcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final validateEmailField(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final validateUsernameField(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "upstream"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V

    invoke-static {v1, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    const v24, 0x7ffff

    const/16 v25, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v4 .. v25}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;

    invoke-direct {v2, v0, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    new-instance v5, Lec3/l1;

    invoke-direct {v5, v4, v1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;

    invoke-direct {v1, v3, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;-><init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V

    invoke-static {v5, v1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    return-object v1
.end method
