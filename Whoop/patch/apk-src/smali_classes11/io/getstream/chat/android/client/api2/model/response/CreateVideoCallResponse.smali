.class public final Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J:\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;",
        "",
        "call",
        "Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;",
        "token",
        "",
        "agoraUid",
        "",
        "agoraAppId",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V",
        "getCall",
        "()Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;",
        "getToken",
        "()Ljava/lang/String;",
        "getAgoraUid",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getAgoraAppId",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
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
.field private final agoraAppId:Ljava/lang/String;
    .annotation runtime Lqx/q;
        name = "agora_app_id"
    .end annotation
.end field

.field private final agoraUid:Ljava/lang/Integer;
    .annotation runtime Lqx/q;
        name = "agora_uid"
    .end annotation
.end field

.field private final call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

.field private final token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    iput-object p3, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    iput-object p4, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->copy(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "token"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;-><init>(Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAgoraAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    return-object v0
.end method

.method public final getAgoraUid()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getCall()Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->call:Lio/getstream/chat/android/client/api2/model/dto/VideoCallInfoDto;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->token:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraUid:Ljava/lang/Integer;

    iget-object v3, p0, Lio/getstream/chat/android/client/api2/model/response/CreateVideoCallResponse;->agoraAppId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "CreateVideoCallResponse(call="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", token="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", agoraUid="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", agoraAppId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
