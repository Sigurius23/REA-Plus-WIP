.class public final Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/profile/presentation/edit/EditProfileViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AvatarViewState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B}\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u007f\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001J\u0014\u0010+\u001a\u00020\u00032\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010-\u001a\u00020.H\u00d6\u0081\u0004J\n\u0010/\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0013R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u00060"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
        "",
        "isUploading",
        "",
        "uploadSuccess",
        "uploadError",
        "",
        "currentAvatarUrl",
        "isEditingAvatar",
        "selectedImageUri",
        "Landroid/net/Uri;",
        "isInCropMode",
        "showUploadingModal",
        "showSuccessModal",
        "showErrorModal",
        "pendingRetryData",
        "",
        "<init>",
        "(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)V",
        "()Z",
        "getUploadSuccess",
        "getUploadError",
        "()Ljava/lang/String;",
        "getCurrentAvatarUrl",
        "getSelectedImageUri",
        "()Landroid/net/Uri;",
        "getShowUploadingModal",
        "getShowSuccessModal",
        "getShowErrorModal",
        "getPendingRetryData",
        "()[B",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final currentAvatarUrl:Ljava/lang/String;

.field private final isEditingAvatar:Z

.field private final isInCropMode:Z

.field private final isUploading:Z

.field private final pendingRetryData:[B

.field private final selectedImageUri:Landroid/net/Uri;

.field private final showErrorModal:Z

.field private final showSuccessModal:Z

.field private final showUploadingModal:Z

.field private final uploadError:Ljava/lang/String;

.field private final uploadSuccess:Z


# direct methods
.method public constructor <init>()V
    .locals 14

    .line 1
    const/16 v12, 0x7ff

    const/4 v13, 0x0

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

    move-object v0, p0

    invoke-direct/range {v0 .. v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    .line 4
    iput-boolean p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    .line 7
    iput-boolean p5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    .line 9
    iput-boolean p7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    .line 10
    iput-boolean p8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    .line 11
    iput-boolean p9, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    .line 12
    iput-boolean p10, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    .line 13
    iput-object p11, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[BILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p13, p12, 0x1

    const/4 v0, 0x0

    if-eqz p13, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p13, p12, 0x4

    const/4 v1, 0x0

    if-eqz p13, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    move p5, v0

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    move-object p6, v1

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    move p7, v0

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    move p9, v0

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    move p10, v0

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    move-object p12, v1

    :goto_0
    move p11, p10

    move p10, p9

    move p9, p8

    move p8, p7

    move-object p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_a
    move-object p12, p11

    goto :goto_0

    .line 14
    :goto_1
    invoke-direct/range {p1 .. p12}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[BILjava/lang/Object;)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-boolean p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-boolean p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-boolean p5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-boolean p7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-boolean p9, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-boolean p10, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    :cond_a
    move p12, p10

    move-object p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->copy(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    return v0
.end method

.method public final component11()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    return v0
.end method

.method public final component6()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    return v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
    .locals 12

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    iget-object p1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCurrentAvatarUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getPendingRetryData()[B
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    return-object v0
.end method

.method public final getSelectedImageUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    return-object v0
.end method

.method public final getShowErrorModal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    return v0
.end method

.method public final getShowSuccessModal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    return v0
.end method

.method public final getShowUploadingModal()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    return v0
.end method

.method public final getUploadError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    return-object v0
.end method

.method public final getUploadSuccess()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Landroid/net/Uri;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final isEditingAvatar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    return v0
.end method

.method public final isInCropMode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    return v0
.end method

.method public final isUploading()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isUploading:Z

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadSuccess:Z

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->uploadError:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->currentAvatarUrl:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isEditingAvatar:Z

    iget-object v5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->selectedImageUri:Landroid/net/Uri;

    iget-boolean v6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->isInCropMode:Z

    iget-boolean v7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showUploadingModal:Z

    iget-boolean v8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showSuccessModal:Z

    iget-boolean v9, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->showErrorModal:Z

    iget-object v10, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->pendingRetryData:[B

    invoke-static {v10}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v10

    const-string v11, ", uploadSuccess="

    const-string v12, ", uploadError="

    const-string v13, "AvatarViewState(isUploading="

    invoke-static {v13, v11, v12, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentAvatarUrl="

    const-string v11, ", isEditingAvatar="

    invoke-static {v0, v2, v1, v3, v11}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", selectedImageUri="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isInCropMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showUploadingModal="

    const-string v2, ", showSuccessModal="

    invoke-static {v0, v6, v1, v7, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ", showErrorModal="

    const-string v2, ", pendingRetryData="

    invoke-static {v0, v8, v1, v9, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v10, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
