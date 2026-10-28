.class public abstract Lcom/whoop/profile/domain/edit/EditProfileDomainAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
        "",
        "<init>",
        "()V",
        "Refresh",
        "SaveProfile",
        "ValidateEmailField",
        "ValidateUsernameField",
        "ClearUsernameValidation",
        "UploadAvatar",
        "DeleteAvatar",
        "RetryAvatarUpload",
        "RefreshAfterAvatarUpload",
        "NoOp",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;",
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
.field public static final $stable:I


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
    invoke-direct {p0}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction;-><init>()V

    return-void
.end method
