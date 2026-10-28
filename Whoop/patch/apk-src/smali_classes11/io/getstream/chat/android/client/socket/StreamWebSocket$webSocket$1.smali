.class public final Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;
.super Lud3/f1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/socket/StreamWebSocket;-><init>(Lio/getstream/chat/android/client/parser/ChatParser;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J)\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "io/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1",
        "Lud3/f1;",
        "Lud3/e1;",
        "webSocket",
        "",
        "text",
        "Ll83/a0;",
        "onMessage",
        "(Lud3/e1;Ljava/lang/String;)V",
        "",
        "t",
        "Lud3/x0;",
        "response",
        "onFailure",
        "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V",
        "",
        "code",
        "reason",
        "onClosed",
        "(Lud3/e1;ILjava/lang/String;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/socket/StreamWebSocket;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;->this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClosed(Lud3/e1;ILjava/lang/String;)V
    .locals 6

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x3e8

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;->this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->access$getEventFlow$p(Lio/getstream/chat/android/client/socket/StreamWebSocket;)Lec3/o1;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_CLOSED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/4 v4, 0x6

    const/4 v5, 0x0

    sget-object v0, Ln23/c;->e:Ln23/b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object p3

    invoke-direct {p2, p3}, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;-><init>(Ln23/e;)V

    invoke-interface {p1, p2}, Lec3/o1;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
    .locals 6

    const-string p3, "webSocket"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;->this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->access$getEventFlow$p(Lio/getstream/chat/android/client/socket/StreamWebSocket;)Lec3/o1;

    move-result-object p1

    new-instance p3, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->SOCKET_FAILURE:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    const/4 v4, 0x2

    const/4 v5, 0x0

    sget-object v0, Ln23/c;->e:Ln23/b;

    const/4 v2, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object p2

    invoke-direct {p3, p2}, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;-><init>(Ln23/e;)V

    invoke-interface {p1, p3}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onMessage(Lud3/e1;Ljava/lang/String;)V
    .locals 4

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "text"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->x:Lb23/g;

    const-string v1, "Chat:Events"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lb23/i;->c:Lb23/j;

    const-string v2, "[handleEvent] event: `"

    const-string v3, "`"

    invoke-static {v2, p2, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, v0, v1, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;->this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->access$getEventFlow$p(Lio/getstream/chat/android/client/socket/StreamWebSocket;)Lec3/o1;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;->this$0:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    invoke-static {v0, p2}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->access$parseMessage(Lio/getstream/chat/android/client/socket/StreamWebSocket;Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;

    move-result-object p2

    invoke-interface {p1, p2}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method
