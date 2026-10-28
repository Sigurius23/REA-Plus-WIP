.class public final Lcom/whoop/service/network/model/UserSessionDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/service/network/model/UserSessionDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u0000 )2\u00020\u0001:\u0001)B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0008\u0010\u001c\u001a\u00020\u001dH\u0002J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JG\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0014\u0010%\u001a\u00020\u00172\u0008\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\'\u001a\u00020\u0006H\u00d6\u0081\u0004J\n\u0010(\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/service/network/model/UserSessionDto;",
        "",
        "accessToken",
        "",
        "refreshToken",
        "expiresIn",
        "",
        "user",
        "Lcom/whoop/service/network/model/UserDto;",
        "membershipStatus",
        "needsProfileCompletionRaw",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)V",
        "getAccessToken",
        "()Ljava/lang/String;",
        "getRefreshToken",
        "getExpiresIn",
        "()I",
        "getUser",
        "()Lcom/whoop/service/network/model/UserDto;",
        "getMembershipStatus",
        "getNeedsProfileCompletionRaw",
        "needsProfileCompletion",
        "",
        "getNeedsProfileCompletion",
        "()Z",
        "toSession",
        "Lcom/whoop/domain/model/Session;",
        "toAuthToken",
        "Lcom/whoop/domain/model/AuthToken;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Companion",
        "core_release"
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
.field public static final Companion:Lcom/whoop/service/network/model/UserSessionDto$Companion;

.field public static final NEEDS_PROFILE_COMPLETION_FALSE:Ljava/lang/String; = "0"

.field public static final NEEDS_PROFILE_COMPLETION_TRUE:Ljava/lang/String; = "1"


# instance fields
.field private final accessToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "access_token"
    .end annotation
.end field

.field private final expiresIn:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "expires_in"
    .end annotation
.end field

.field private final membershipStatus:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "membershipStatus"
    .end annotation
.end field

.field private final needsProfileCompletionRaw:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "needsProfileCompletion"
    .end annotation
.end field

.field private final refreshToken:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "refresh_token"
    .end annotation
.end field

.field private final user:Lcom/whoop/service/network/model/UserDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/service/network/model/UserSessionDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/service/network/model/UserSessionDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/service/network/model/UserSessionDto;->Companion:Lcom/whoop/service/network/model/UserSessionDto$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipStatus"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    iput-object p4, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    iput-object p5, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/UserSessionDto;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/service/network/model/UserSessionDto;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/service/network/model/UserSessionDto;->copy(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/service/network/model/UserSessionDto;

    move-result-object p0

    return-object p0
.end method

.method private final toAuthToken()Lcom/whoop/domain/model/AuthToken;
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/AuthToken;

    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    iget v3, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/domain/model/AuthToken;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    return v0
.end method

.method public final component4()Lcom/whoop/service/network/model/UserDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/service/network/model/UserSessionDto;
    .locals 8

    const-string v0, "accessToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipStatus"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/UserSessionDto;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/service/network/model/UserSessionDto;-><init>(Ljava/lang/String;Ljava/lang/String;ILcom/whoop/service/network/model/UserDto;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/UserSessionDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/UserSessionDto;

    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    iget v3, p1, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    iget-object v3, p1, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAccessToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getExpiresIn()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    return v0
.end method

.method public final getMembershipStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getNeedsProfileCompletion()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    const-string v1, "1"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getNeedsProfileCompletionRaw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    return-object v0
.end method

.method public final getRefreshToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public final getUser()Lcom/whoop/service/network/model/UserDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    invoke-virtual {v2}, Lcom/whoop/service/network/model/UserDto;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toSession()Lcom/whoop/domain/model/Session;
    .locals 3

    new-instance v0, Lcom/whoop/domain/model/Session;

    invoke-direct {p0}, Lcom/whoop/service/network/model/UserSessionDto;->toAuthToken()Lcom/whoop/domain/model/AuthToken;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    invoke-static {v2}, Lcom/whoop/service/network/model/UserDtoKt;->toUser(Lcom/whoop/service/network/model/UserDto;)Lcom/whoop/domain/model/User;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/domain/model/Session;-><init>(Lcom/whoop/domain/model/AuthToken;Lcom/whoop/domain/model/User;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/service/network/model/UserSessionDto;->accessToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/service/network/model/UserSessionDto;->refreshToken:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/service/network/model/UserSessionDto;->expiresIn:I

    iget-object v3, p0, Lcom/whoop/service/network/model/UserSessionDto;->user:Lcom/whoop/service/network/model/UserDto;

    iget-object v4, p0, Lcom/whoop/service/network/model/UserSessionDto;->membershipStatus:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/service/network/model/UserSessionDto;->needsProfileCompletionRaw:Ljava/lang/String;

    const-string v6, ", refreshToken="

    const-string v7, ", expiresIn="

    const-string v8, "UserSessionDto(accessToken="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", user="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membershipStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", needsProfileCompletionRaw="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
