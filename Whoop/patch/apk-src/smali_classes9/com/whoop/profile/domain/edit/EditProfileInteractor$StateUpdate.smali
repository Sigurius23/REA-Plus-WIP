.class abstract Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "StateUpdate"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$NoOp;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveCompleted;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveFailed;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SavingStarted;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;,
        Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
        "",
        "<init>",
        "()V",
        "Loading",
        "DataLoaded",
        "ErrorOccurred",
        "SaveRequested",
        "SavingStarted",
        "SaveCompleted",
        "SaveFailed",
        "NoOp",
        "AvatarUploading",
        "AvatarUploadSuccess",
        "AvatarUploadError",
        "EmailValidationStarted",
        "EmailValidationCompleted",
        "UsernameValidationStarted",
        "UsernameValidationCompleted",
        "ClearUsernameValidation",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$NoOp;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveCompleted;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveFailed;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SavingStarted;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;-><init>()V

    return-void
.end method
