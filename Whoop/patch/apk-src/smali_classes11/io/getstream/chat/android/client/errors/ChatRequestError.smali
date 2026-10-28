.class public final Lio/getstream/chat/android/client/errors/ChatRequestError;
.super Ljava/io/IOException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/errors/ChatRequestError;",
        "Ljava/io/IOException;",
        "message",
        "",
        "streamCode",
        "",
        "statusCode",
        "cause",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/Throwable;)V",
        "getStreamCode",
        "()I",
        "getStatusCode",
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


# instance fields
.field private final statusCode:I

.field private final streamCode:I


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/Throwable;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p4}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 3
    iput p2, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->streamCode:I

    .line 4
    iput p3, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->statusCode:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/errors/ChatRequestError;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final getStatusCode()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->statusCode:I

    return v0
.end method

.method public final getStreamCode()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->streamCode:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->streamCode:I

    iget v1, p0, Lio/getstream/chat/android/client/errors/ChatRequestError;->statusCode:I

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, ", statusCode: "

    const-string v4, ", message: "

    const-string v5, "streamCode: "

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
