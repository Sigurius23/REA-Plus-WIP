.class public final Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0081\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;",
        "",
        "message",
        "Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "skip_enrich_url",
        "",
        "skip_push",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)V",
        "getMessage",
        "()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;",
        "getSkip_enrich_url",
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
.field private final message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

.field private final skip_enrich_url:Z

.field private final skip_push:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    .line 3
    iput-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;-><init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->copy(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    return v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;

    invoke-direct {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;-><init>(Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getMessage()Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    return-object v0
.end method

.method public final getSkip_enrich_url()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    return v0
.end method

.method public final getSkip_push()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->message:Lio/getstream/chat/android/client/api2/model/dto/UpstreamMessageDto;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_enrich_url:Z

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api2/model/requests/UpdateMessageRequest;->skip_push:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "UpdateMessageRequest(message="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", skip_enrich_url="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", skip_push="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
