.class public final Lio/getstream/chat/android/client/socket/StreamWebSocket;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/StreamWebSocket;",
        "",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "parser",
        "Lkotlin/Function1;",
        "Lud3/f1;",
        "Lud3/e1;",
        "socketCreator",
        "<init>",
        "(Lio/getstream/chat/android/client/parser/ChatParser;Lkotlin/jvm/functions/Function1;)V",
        "",
        "text",
        "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;",
        "parseMessage",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "chatEvent",
        "",
        "send",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)Z",
        "close",
        "()Z",
        "Lec3/l;",
        "listen",
        "()Lec3/l;",
        "Lio/getstream/chat/android/client/parser/ChatParser;",
        "Lec3/o1;",
        "eventFlow",
        "Lec3/o1;",
        "webSocket",
        "Lud3/e1;",
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
.field private final eventFlow:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final parser:Lio/getstream/chat/android/client/parser/ChatParser;

.field private final webSocket:Lud3/e1;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/parser/ChatParser;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/parser/ChatParser;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "parser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketCreator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    const/4 p1, 0x0

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/16 v2, 0x64

    invoke-static {v1, v2, p1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->eventFlow:Lec3/o1;

    new-instance p1, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/socket/StreamWebSocket$webSocket$1;-><init>(Lio/getstream/chat/android/client/socket/StreamWebSocket;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/e1;

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->webSocket:Lud3/e1;

    return-void
.end method

.method public static final synthetic access$getEventFlow$p(Lio/getstream/chat/android/client/socket/StreamWebSocket;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->eventFlow:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic access$parseMessage(Lio/getstream/chat/android/client/socket/StreamWebSocket;Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parseMessage(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;

    move-result-object p0

    return-object p0
.end method

.method private final parseMessage(Ljava/lang/String;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    const-class v1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-interface {v0, p1, v1}, Lio/getstream/chat/android/client/parser/ChatParser;->fromJsonOrError(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;

    move-result-object v0

    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_0

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    new-instance v1, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Message;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Message;-><init>(Lio/getstream/chat/android/client/events/ChatEvent;)V

    new-instance v0, Ln23/g;

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_3

    :goto_0
    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_1

    check-cast v0, Ln23/g;

    goto :goto_1

    :cond_1
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_2

    new-instance v1, Ln23/g;

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-static {p0, p1, v0}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parseMessage$lambda$2(Lio/getstream/chat/android/client/socket/StreamWebSocket;Ljava/lang/String;Ln23/e;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;

    invoke-direct {v1, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :goto_1
    iget-object p1, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final parseMessage$lambda$2(Lio/getstream/chat/android/client/socket/StreamWebSocket;Ljava/lang/String;Ln23/e;)Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;
    .locals 8

    const-string v0, "parseChatError"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    const-class v0, Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    invoke-interface {p0, p1, v0}, Lio/getstream/chat/android/client/parser/ChatParser;->fromJsonOrError(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;

    move-result-object p0

    instance-of p1, p0, Ln23/g;

    if-eqz p1, :cond_0

    check-cast p0, Ln23/g;

    iget-object p0, p0, Ln23/g;->a:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/socket/SocketErrorMessage;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/SocketErrorMessage;->getError()Lio/getstream/chat/android/client/socket/ErrorResponse;

    move-result-object p0

    goto :goto_0

    :cond_0
    instance-of p0, p0, Ln23/f;

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getStatusCode()I

    move-result p2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/ErrorResponse;->getCode()I

    move-result p0

    new-instance v0, Ln23/c;

    const/16 v1, 0x8

    invoke-direct {v0, p1, p0, p2, v1}, Ln23/c;-><init>(Ljava/lang/String;III)V

    goto :goto_1

    :cond_1
    sget-object v3, Lio/getstream/chat/android/client/errors/ChatErrorCode;->CANT_PARSE_EVENT:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-static {p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->extractCause(Ln23/e;)Ljava/lang/Throwable;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    sget-object v2, Ln23/c;->e:Ln23/b;

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->fromChatErrorCode$default(Ln23/b;Lio/getstream/chat/android/client/errors/ChatErrorCode;ILjava/lang/Throwable;ILjava/lang/Object;)Ln23/c;

    move-result-object v0

    :goto_1
    new-instance p0, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/socket/StreamWebSocketEvent$Error;-><init>(Ln23/e;)V

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final close()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->webSocket:Lud3/e1;

    const-string v1, "Connection close by client"

    check-cast v0, Lle3/g;

    const/16 v2, 0x3e8

    invoke-virtual {v0, v2, v1}, Lle3/g;->b(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final listen()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->eventFlow:Lec3/o1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    return-object v0
.end method

.method public final send(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 2

    const-string v0, "chatEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->webSocket:Lud3/e1;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/StreamWebSocket;->parser:Lio/getstream/chat/android/client/parser/ChatParser;

    invoke-interface {v1, p1}, Lio/getstream/chat/android/client/parser/ChatParser;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast v0, Lle3/g;

    invoke-virtual {v0, p1}, Lle3/g;->h(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
