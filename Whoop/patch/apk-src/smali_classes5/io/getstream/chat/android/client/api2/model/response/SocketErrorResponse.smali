.class public final Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000b\u0010\u0008\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;",
        "",
        "error",
        "Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;",
        "<init>",
        "(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)V",
        "getError",
        "()Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "ErrorResponse",
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
.field private final error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;-><init>(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;-><init>(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;ILjava/lang/Object;)Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    :cond_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->copy(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;-><init>(Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    iget-object p1, p1, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getError()Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse;->error:Lio/getstream/chat/android/client/api2/model/response/SocketErrorResponse$ErrorResponse;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SocketErrorResponse(error="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
