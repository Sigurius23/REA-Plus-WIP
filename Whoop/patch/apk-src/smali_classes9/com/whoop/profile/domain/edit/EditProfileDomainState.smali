.class public final Lcom/whoop/profile/domain/edit/EditProfileDomainState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;,
        Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u00002\u00020\u0001:\u0005%&\'()B=\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u000bH\u00c6\u0003J?\u0010\u001d\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010!\u001a\u00020\"H\u00d6\u0081\u0004J\n\u0010#\u001a\u00020$H\u00d6\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState;",
        "",
        "response",
        "Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "currentDialogType",
        "Lcom/whoop/profile/domain/edit/EditProfileDialogType;",
        "avatarState",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;",
        "emailValidationState",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;",
        "usernameValidationState",
        "Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;",
        "<init>",
        "(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V",
        "getResponse",
        "()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;",
        "getCurrentDialogType",
        "()Lcom/whoop/profile/domain/edit/EditProfileDialogType;",
        "getAvatarState",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;",
        "getEmailValidationState",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;",
        "getUsernameValidationState",
        "()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "AvatarDomainState",
        "EmailValidationDomainState",
        "UsernameValidationDomainState",
        "EmailValidationResult",
        "UsernameValidationResult",
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
.field private final avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

.field private final currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

.field private final emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

.field private final response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

.field private final usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V
    .locals 1

    const-string v0, "avatarState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usernameValidationState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    .line 6
    iput-object p4, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    .line 7
    iput-object p5, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 8
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;-><init>(ZZLjava/lang/String;[BILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    .line 9
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;-><init>(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 10
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;-><init>(ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p6, p5

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/domain/edit/EditProfileDomainState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->copy(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/domain/edit/EditProfileDialogType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    return-object v0
.end method

.method public final component3()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)Lcom/whoop/profile/domain/edit/EditProfileDomainState;
    .locals 7

    const-string v0, "avatarState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usernameValidationState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    iget-object v3, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    iget-object p1, p1, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAvatarState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    return-object v0
.end method

.method public final getCurrentDialogType()Lcom/whoop/profile/domain/edit/EditProfileDialogType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    return-object v0
.end method

.method public final getEmailValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    return-object v0
.end method

.method public final getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    return-object v0
.end method

.method public final getUsernameValidationState()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->response:Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->currentDialogType:Lcom/whoop/profile/domain/edit/EditProfileDialogType;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->avatarState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->emailValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;

    iget-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;->usernameValidationState:Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "EditProfileDomainState(response="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentDialogType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", avatarState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emailValidationState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", usernameValidationState="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
