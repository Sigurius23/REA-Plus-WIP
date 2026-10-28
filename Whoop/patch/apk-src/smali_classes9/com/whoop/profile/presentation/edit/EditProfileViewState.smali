.class public final Lcom/whoop/profile/presentation/edit/EditProfileViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;,
        Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\"\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u000c789:;<=>?@ABBg\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\t\u0010,\u001a\u00020\rH\u00c6\u0003J\t\u0010-\u001a\u00020\u000fH\u00c6\u0003J\t\u0010.\u001a\u00020\u0011H\u00c6\u0003J\t\u0010/\u001a\u00020\u0011H\u00c6\u0003Ji\u00100\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u00c6\u0001J\u0014\u00101\u001a\u00020\u00112\u0008\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00103\u001a\u000204H\u00d6\u0081\u0004J\n\u00105\u001a\u000206H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010$R\u0011\u0010%\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010$\u00a8\u0006C"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState;",
        "",
        "popUpDialog",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;",
        "fullScreenModal",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;",
        "profileData",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "editableFields",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;",
        "avatarState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
        "emailValidationState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;",
        "usernameValidationState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;",
        "showUsernameField",
        "",
        "isUsernameFieldEditable",
        "<init>",
        "(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)V",
        "getPopUpDialog",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;",
        "getFullScreenModal",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;",
        "getProfileData",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "getEditableFields",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;",
        "getAvatarState",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;",
        "getEmailValidationState",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;",
        "getUsernameValidationState",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;",
        "getShowUsernameField",
        "()Z",
        "canSave",
        "getCanSave",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "EditableFieldState",
        "EditableFields",
        "EditProfileData",
        "ValidationRanges",
        "Country",
        "State",
        "FullScreenModal",
        "EditProfileDialogState",
        "BottomSheetType",
        "AvatarViewState",
        "EmailValidationViewState",
        "UsernameValidationViewState",
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
.field private final avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

.field private final editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

.field private final emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

.field private final fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

.field private final isUsernameFieldEditable:Z

.field private final popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

.field private final profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

.field private final showUsernameField:Z

.field private final usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)V
    .locals 1

    const-string v0, "editableFields"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatarState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationState"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usernameValidationState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    .line 8
    iput-object p6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    .line 9
    iput-object p7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    .line 11
    iput-boolean p9, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    move-object v3, v2

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v2, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    .line 12
    new-instance v5, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    const/16 v19, 0x1fff

    const/16 v20, 0x0

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

    invoke-direct/range {v5 .. v20}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    .line 13
    new-instance v6, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    const/16 v18, 0x7ff

    const/16 v19, 0x0

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

    invoke-direct/range {v6 .. v19}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;-><init>(ZZLjava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;ZZZZ[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_5

    .line 14
    new-instance v7, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v4, v0, 0x40

    if-eqz v4, :cond_6

    .line 15
    new-instance v8, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    const/16 v14, 0x1f

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v4, v0, 0x80

    const/4 v9, 0x0

    if-eqz v4, :cond_7

    move v4, v9

    goto :goto_7

    :cond_7
    move/from16 v4, p8

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    move/from16 p10, v9

    :goto_8
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p4, v2

    move-object/from16 p3, v3

    move/from16 p9, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    goto :goto_9

    :cond_8
    move/from16 p10, p9

    goto :goto_8

    .line 16
    :goto_9
    invoke-direct/range {p1 .. p10}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILjava/lang/Object;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    :cond_8
    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->copy(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    return-object v0
.end method

.method public final component3()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    return-object v0
.end method

.method public final component6()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    return-object v0
.end method

.method public final component7()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    return v0
.end method

.method public final copy(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)Lcom/whoop/profile/presentation/edit/EditProfileViewState;
    .locals 11

    const-string v0, "editableFields"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatarState"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationState"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usernameValidationState"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    iget-object v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    iget-boolean v3, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    iget-boolean p1, p1, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAvatarState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    return-object v0
.end method

.method public final getCanSave()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHasChanges()Z

    move-result v0

    return v0
.end method

.method public final getEditableFields()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    return-object v0
.end method

.method public final getEmailValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    return-object v0
.end method

.method public final getFullScreenModal()Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    return-object v0
.end method

.method public final getPopUpDialog()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    return-object v0
.end method

.method public final getProfileData()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    return-object v0
.end method

.method public final getShowUsernameField()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    return v0
.end method

.method public final getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v1, v2

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    invoke-static {v0, v2, v1}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isUsernameFieldEditable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->popUpDialog:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->fullScreenModal:Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->profileData:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->editableFields:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;

    iget-object v4, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->avatarState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;

    iget-object v5, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->emailValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;

    iget-object v6, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->usernameValidationState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    iget-boolean v7, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->showUsernameField:Z

    iget-boolean v8, p0, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->isUsernameFieldEditable:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "EditProfileViewState(popUpDialog="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fullScreenModal="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", profileData="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", editableFields="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", avatarState="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emailValidationState="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", usernameValidationState="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showUsernameField="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isUsernameFieldEditable="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
