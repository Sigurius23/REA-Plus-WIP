.class public final Lio/ktor/client/network/sockets/ConnectTimeoutException;
.super Ljava/net/ConnectException;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lio/ktor/client/network/sockets/ConnectTimeoutException;",
        "Ljava/net/ConnectException;",
        "ktor-client-core"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Ljava/net/SocketTimeoutException;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/SocketTimeoutException;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lio/ktor/client/network/sockets/ConnectTimeoutException;->w:Ljava/net/SocketTimeoutException;

    return-void
.end method


# virtual methods
.method public final getCause()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lio/ktor/client/network/sockets/ConnectTimeoutException;->w:Ljava/net/SocketTimeoutException;

    return-object v0
.end method
