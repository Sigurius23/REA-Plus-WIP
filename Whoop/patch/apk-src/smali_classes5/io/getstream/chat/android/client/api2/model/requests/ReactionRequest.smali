.class public final Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;",
        "",
        "reaction",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;",
        "enforce_unique",
        "",
        "skip_push",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)V",
        "getReaction",
        "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;",
        "getEnforce_unique",
        "()Z",
        "getSkip_push",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lqx/t;
    generateAdapter = true
.end annotation


# instance fields
.field private final enforce_unique:Z

.field private final reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

.field private final skip_push:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)V
    .locals 1

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    iput-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->copy(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;
    .locals 1

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;-><init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnforce_unique()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    return v0
.end method

.method public final getReaction()Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    return-object v0
.end method

.method public final getSkip_push()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->reaction:Lio/getstream/chat/android/client/api2/model/dto/UpstreamReactionDto;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->enforce_unique:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/ReactionRequest;->skip_push:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ReactionRequest(reaction="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enforce_unique="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", skip_push="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
