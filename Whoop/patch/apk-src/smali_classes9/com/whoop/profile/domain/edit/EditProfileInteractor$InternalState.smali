.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "InternalState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u00084\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u00db\u0001\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0006\u00108\u001a\u00020\tJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\t\u0010F\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010I\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u00dd\u0001\u0010L\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00052\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00052\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0014\u0010M\u001a\u00020\u00052\u0008\u0010N\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010O\u001a\u00020PH\u00d6\u0081\u0004J\n\u0010Q\u001a\u00020\u000bH\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010!R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010(R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010!R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010!R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010!R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010&R\u0011\u0010\u0019\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010!R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010&\u00a8\u0006R"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
        "",
        "response",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "isLoading",
        "",
        "isSaving",
        "saveSuccess",
        "error",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "saveError",
        "",
        "pendingSaveRequest",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "lastFailedFormState",
        "avatarUploading",
        "avatarUploadSuccess",
        "avatarUploadError",
        "pendingRetryData",
        "",
        "avatarRefreshNeeded",
        "emailValidating",
        "emailValidationResult",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;",
        "lastValidatedEmail",
        "usernameValidating",
        "usernameValidationResult",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;",
        "lastValidatedUsername",
        "<init>",
        "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V",
        "getResponse",
        "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "()Z",
        "getSaveSuccess",
        "getError",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "getSaveError",
        "()Ljava/lang/String;",
        "getPendingSaveRequest",
        "()Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "getLastFailedFormState",
        "getAvatarUploading",
        "getAvatarUploadSuccess",
        "getAvatarUploadError",
        "getPendingRetryData",
        "()[B",
        "getAvatarRefreshNeeded",
        "getEmailValidating",
        "getEmailValidationResult",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;",
        "getLastValidatedEmail",
        "getUsernameValidating",
        "getUsernameValidationResult",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;",
        "getLastValidatedUsername",
        "toDomainState",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final avatarRefreshNeeded:Z

.field private final avatarUploadError:Ljava/lang/String;

.field private final avatarUploadSuccess:Z

.field private final avatarUploading:Z

.field private final emailValidating:Z

.field private final emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

.field private final error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

.field private final isLoading:Z

.field private final isSaving:Z

.field private final lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field private final lastValidatedEmail:Ljava/lang/String;

.field private final lastValidatedUsername:Ljava/lang/String;

.field private final pendingRetryData:[B

.field private final pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field private final response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

.field private final saveError:Ljava/lang/String;

.field private final saveSuccess:Z

.field private final usernameValidating:Z

.field private final usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;


# direct methods
.method public constructor <init>()V
    .locals 22

    .line 1
    const v20, 0x7ffff

    const/16 v21, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v21}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    .line 4
    iput-boolean p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    .line 5
    iput-boolean p3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 10
    iput-object p8, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 11
    iput-boolean p9, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    .line 12
    iput-boolean p10, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    .line 13
    iput-object p11, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    .line 15
    iput-boolean p13, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    .line 16
    iput-boolean p14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    .line 17
    iput-object p15, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    move/from16 p1, p17

    .line 19
    iput-boolean p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 20

    move/from16 v0, p20

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v5, v0, 0x4

    if-eqz v5, :cond_2

    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    move/from16 v5, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move/from16 v2, p14

    :goto_d
    and-int/lit16 v4, v0, 0x4000

    if-eqz v4, :cond_e

    const/4 v4, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v4, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v0, v0, v19

    if-eqz v0, :cond_12

    const/16 p20, 0x0

    :goto_12
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move/from16 p15, v2

    move/from16 p3, v3

    move-object/from16 p16, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move/from16 p10, v11

    move/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move/from16 p14, v15

    move-object/from16 p17, v16

    move/from16 p18, v17

    move-object/from16 p19, v18

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    goto :goto_12

    .line 22
    :goto_13
    invoke-direct/range {p1 .. p20}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-boolean v14, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    goto :goto_c

    :cond_c
    move/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move-object/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    move-object/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move-object/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p16, v2

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move-object/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    return v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    return-object v0
.end method

.method public final component13()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    return v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    return v0
.end method

.method public final component15()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    return v0
.end method

.method public final component18()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    return v0
.end method

.method public final component5()Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final component8()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    return v0
.end method

.method public final copy(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;
    .locals 20

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    move/from16 v17, p17

    move-object/from16 v18, p18

    move-object/from16 v19, p19

    invoke-direct/range {v0 .. v19}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    iget-boolean v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAvatarRefreshNeeded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    return v0
.end method

.method public final getAvatarUploadError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final getAvatarUploadSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    return v0
.end method

.method public final getAvatarUploading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    return v0
.end method

.method public final getEmailValidating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    return v0
.end method

.method public final getEmailValidationResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    return-object v0
.end method

.method public final getError()Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    return-object v0
.end method

.method public final getLastFailedFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final getLastValidatedEmail()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastValidatedUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    return-object v0
.end method

.method public final getPendingRetryData()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    return-object v0
.end method

.method public final getPendingSaveRequest()Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    return-object v0
.end method

.method public final getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    return-object v0
.end method

.method public final getSaveError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    return-object v0
.end method

.method public final getSaveSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    return v0
.end method

.method public final getUsernameValidating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    return v0
.end method

.method public final getUsernameValidationResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    if-nez v2, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_a
    add-int/2addr v0, v1

    return v0
.end method

.method public final isLoading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    return v0
.end method

.method public final isSaving()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    return v0
.end method

.method public final toDomainState()Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 8

    new-instance v3, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    iget-boolean v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    invoke-direct {v3, v0, v1, v2, v4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;-><init>(ZZLjava/lang/String;[B)V

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    invoke-direct {v4, v0, v1, v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;-><init>(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;)V

    new-instance v5, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    invoke-direct {v5, v0, v1, v2}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;-><init>(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$Loading;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Saving;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$Saving;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    iget-boolean v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    if-eqz v0, :cond_2

    sget-object v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$Success;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$Success;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    if-eqz v0, :cond_3

    sget-object v2, Lcom/whoop/profile/domain/edit/EditProfileDialogType$SaveError;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$SaveError;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V

    return-object v0

    :cond_3
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    if-eqz v0, :cond_4

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-result-object v0

    return-object v0

    :cond_4
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-boolean v2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isLoading:Z

    iget-boolean v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->isSaving:Z

    iget-boolean v4, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveSuccess:Z

    iget-object v5, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->error:Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object v6, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->saveError:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingSaveRequest:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v8, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastFailedFormState:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-boolean v9, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploading:Z

    iget-boolean v10, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadSuccess:Z

    iget-object v11, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarUploadError:Ljava/lang/String;

    iget-object v12, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->pendingRetryData:[B

    invoke-static {v12}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v12

    iget-boolean v13, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->avatarRefreshNeeded:Z

    iget-boolean v14, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidating:Z

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->emailValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedEmail:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidating:Z

    move/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->usernameValidationResult:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->lastValidatedUsername:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v20, v15

    const-string v15, "InternalState(response="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isLoading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSaving="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", saveSuccess="

    const-string v2, ", error="

    invoke-static {v0, v3, v1, v4, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", saveError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pendingSaveRequest="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastFailedFormState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarUploading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", avatarUploadSuccess="

    const-string v2, ", avatarUploadError="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", pendingRetryData="

    const-string v2, ", avatarRefreshNeeded="

    invoke-static {v0, v11, v1, v12, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", emailValidating="

    const-string v2, ", emailValidationResult="

    invoke-static {v0, v13, v1, v14, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastValidatedEmail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", usernameValidating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", usernameValidationResult="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastValidatedUsername="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    move-object/from16 v2, v20

    invoke-static {v2, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
