.class final Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;
.super Lud3/f1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0002\u0018\u0000 82\u00020\u0001:\u00018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\u000c2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0019J)\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\'\u0010!\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010#\u001a\u0004\u0008$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0017\u0010-\u001a\u00020,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\"\u00102\u001a\u0002018\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107\u00a8\u00069"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;",
        "Lud3/f1;",
        "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;",
        "requestObserver",
        "",
        "id",
        "<init>",
        "(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;J)V",
        "Lud3/x0;",
        "response",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "generateOutputHeaders",
        "(Lud3/x0;)Ljava/util/HashMap;",
        "Lud3/e1;",
        "webSocket",
        "Ll83/a0;",
        "onOpen",
        "(Lud3/e1;Lud3/x0;)V",
        "Lne3/l;",
        "bytes",
        "onMessage",
        "(Lud3/e1;Lne3/l;)V",
        "text",
        "(Lud3/e1;Ljava/lang/String;)V",
        "",
        "t",
        "onFailure",
        "(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V",
        "",
        "code",
        "reason",
        "onClosed",
        "(Lud3/e1;ILjava/lang/String;)V",
        "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;",
        "getRequestObserver",
        "()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;",
        "J",
        "Lud3/e1;",
        "getWebSocket",
        "()Lud3/e1;",
        "setWebSocket",
        "(Lud3/e1;)V",
        "Lne3/h;",
        "buffer",
        "Lne3/h;",
        "getBuffer",
        "()Lne3/h;",
        "Lcom/mapbox/common/ResultCallback;",
        "onClosedCallback",
        "Lcom/mapbox/common/ResultCallback;",
        "getOnClosedCallback",
        "()Lcom/mapbox/common/ResultCallback;",
        "setOnClosedCallback",
        "(Lcom/mapbox/common/ResultCallback;)V",
        "Companion",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;

.field private static final websocketClosedNormalCode:I


# instance fields
.field private final buffer:Lne3/h;

.field private final id:J

.field public onClosedCallback:Lcom/mapbox/common/ResultCallback;

.field private final requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

.field public webSocket:Lud3/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->Companion:Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;

    const/16 v0, 0x3e8

    sput v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->websocketClosedNormalCode:I

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;J)V
    .locals 1

    const-string v0, "requestObserver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iput-wide p2, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->buffer:Lne3/h;

    return-void
.end method

.method public static final synthetic access$getWebsocketClosedNormalCode$cp()I
    .locals 1

    sget v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->websocketClosedNormalCode:I

    return v0
.end method

.method private final generateOutputHeaders(Lud3/x0;)Ljava/util/HashMap;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/x0;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object p1, p1, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {p1}, Lud3/d0;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final getBuffer()Lne3/h;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->buffer:Lne3/h;

    return-object v0
.end method

.method public final getOnClosedCallback()Lcom/mapbox/common/ResultCallback;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->onClosedCallback:Lcom/mapbox/common/ResultCallback;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "onClosedCallback"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getRequestObserver()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    return-object v0
.end method

.method public final getWebSocket()Lud3/e1;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->webSocket:Lud3/e1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "webSocket"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onClosed(Lud3/e1;ILjava/lang/String;)V
    .locals 3

    const-string v0, "Unexpected socket closure: "

    const-string v1, "webSocket"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->onClosedCallback:Lcom/mapbox/common/ResultCallback;

    if-eqz p1, :cond_1

    sget p1, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->websocketClosedNormalCode:I

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getOnClosedCallback()Lcom/mapbox/common/ResultCallback;

    move-result-object p1

    const/4 p2, 0x1

    invoke-interface {p1, p2}, Lcom/mapbox/common/ResultCallback;->run(Z)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getOnClosedCallback()Lcom/mapbox/common/ResultCallback;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lcom/mapbox/common/ResultCallback;->run(Z)V

    return-void

    :cond_1
    new-instance p1, Lcom/mapbox/common/HttpRequestError;

    sget-object v1, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v1, p2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    const/4 p3, 0x0

    invoke-interface {p2, v0, v1, p1, p3}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onFailed(JLcom/mapbox/common/HttpRequestError;Ljava/lang/Integer;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
    .locals 2

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "t"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/mapbox/common/HttpRequestError;

    sget-object v0, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    if-eqz p3, :cond_0

    iget-object v1, p3, Lud3/x0;->y:Ljava/lang/String;

    if-nez v1, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "Unknown error"

    :cond_1
    invoke-direct {p1, v0, v1}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    if-eqz p3, :cond_2

    iget p3, p3, Lud3/x0;->z:I

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2, v0, v1, p1, p3}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onFailed(JLcom/mapbox/common/HttpRequestError;Ljava/lang/Integer;)V

    return-void
.end method

.method public onMessage(Lud3/e1;Ljava/lang/String;)V
    .locals 3

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "text"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->buffer:Lne3/h;

    sget-object v0, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lne3/h;->write([B)V

    .line 4
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    sget-object p2, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->TEXT:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, p2, v2}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onData(JLcom/mapbox/common/experimental/wss_backend/WsOpCode;Z)V

    return-void
.end method

.method public onMessage(Lud3/e1;Lne3/l;)V
    .locals 3

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bytes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->buffer:Lne3/h;

    invoke-virtual {p1, p2}, Lne3/h;->l1(Lne3/l;)V

    .line 2
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    sget-object p2, Lcom/mapbox/common/experimental/wss_backend/WsOpCode;->BINARY:Lcom/mapbox/common/experimental/wss_backend/WsOpCode;

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, p2, v2}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onData(JLcom/mapbox/common/experimental/wss_backend/WsOpCode;Z)V

    return-void
.end method

.method public onOpen(Lud3/e1;Lud3/x0;)V
    .locals 3

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lud3/x0;->z:I

    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    invoke-interface {v0, v1, v2}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onSwitchingProtocols(J)V

    :cond_0
    new-instance v0, Lcom/mapbox/common/experimental/wss_backend/ResponseData;

    invoke-direct {p0, p2}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->generateOutputHeaders(Lud3/x0;)Ljava/util/HashMap;

    move-result-object p2

    new-instance v1, Lcom/mapbox/common/ResponseReadStream;

    iget-object v2, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->buffer:Lne3/h;

    invoke-direct {v1, v2}, Lcom/mapbox/common/ResponseReadStream;-><init>(Lne3/h;)V

    invoke-direct {v0, p2, p1, v1}, Lcom/mapbox/common/experimental/wss_backend/ResponseData;-><init>(Ljava/util/HashMap;ILcom/mapbox/common/ReadStream;)V

    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->requestObserver:Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    iget-wide v1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->id:J

    invoke-interface {p1, v1, v2, v0}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onResponse(JLcom/mapbox/common/experimental/wss_backend/ResponseData;)V

    return-void
.end method

.method public final setOnClosedCallback(Lcom/mapbox/common/ResultCallback;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->onClosedCallback:Lcom/mapbox/common/ResultCallback;

    return-void
.end method

.method public final setWebSocket(Lud3/e1;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->webSocket:Lud3/e1;

    return-void
.end method
