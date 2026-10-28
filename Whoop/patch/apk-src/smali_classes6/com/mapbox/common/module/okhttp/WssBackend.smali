.class public final Lcom/mapbox/common/module/okhttp/WssBackend;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/experimental/wss_backend/Service;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\"\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/WssBackend;",
        "Lcom/mapbox/common/experimental/wss_backend/Service;",
        "<init>",
        "()V",
        "",
        "pingTimeout",
        "Ll83/a0;",
        "setPingTimeout",
        "(J)V",
        "connectTimeout",
        "setConnectionTimeout",
        "Lcom/mapbox/common/experimental/wss_backend/Request;",
        "request",
        "Lcom/mapbox/common/experimental/wss_backend/RequestObserver;",
        "observer",
        "connect",
        "(Lcom/mapbox/common/experimental/wss_backend/Request;Lcom/mapbox/common/experimental/wss_backend/RequestObserver;)J",
        "id",
        "Lcom/mapbox/common/ResultCallback;",
        "callback",
        "cancelConnection",
        "(JLcom/mapbox/common/ResultCallback;)V",
        "Lcom/mapbox/common/experimental/wss_backend/Data;",
        "data",
        "write",
        "(JLcom/mapbox/common/experimental/wss_backend/Data;)V",
        "pingTimeoutMs",
        "J",
        "connectTimeoutMs",
        "Lud3/l0;",
        "wssClient",
        "Lud3/l0;",
        "",
        "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;",
        "socketMap",
        "Ljava/util/Map;",
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


# instance fields
.field private connectTimeoutMs:J

.field private pingTimeoutMs:J

.field private socketMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;",
            ">;"
        }
    .end annotation
.end field

.field private wssClient:Lud3/l0;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x4e20

    iput-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->pingTimeoutMs:J

    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->connectTimeoutMs:J

    new-instance v0, Lud3/k0;

    invoke-direct {v0}, Lud3/k0;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x14

    invoke-virtual {v0, v2, v3, v1}, Lud3/k0;->c(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, v0}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object v1, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->wssClient:Lud3/l0;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public cancelConnection(JLcom/mapbox/common/ResultCallback;)V
    .locals 2

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    invoke-virtual {v0, p3}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->setOnClosedCallback(Lcom/mapbox/common/ResultCallback;)V

    iget-object p3, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p3, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    invoke-virtual {p3}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getWebSocket()Lud3/e1;

    move-result-object p3

    sget-object v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->Companion:Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper$Companion;->getWebsocketClosedNormalCode()I

    move-result v0

    const-string v1, "Closed by client"

    check-cast p3, Lle3/g;

    invoke-virtual {p3, v0, v1}, Lle3/g;->b(ILjava/lang/String;)Z

    iget-object p3, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const/4 p1, 0x0

    :try_start_0
    invoke-interface {p3, p1}, Lcom/mapbox/common/ResultCallback;->run(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public connect(Lcom/mapbox/common/experimental/wss_backend/Request;Lcom/mapbox/common/experimental/wss_backend/RequestObserver;)J
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/mapbox/common/module/NetworkIdGenerator;->INSTANCE:Lcom/mapbox/common/module/NetworkIdGenerator;

    invoke-virtual {v0}, Lcom/mapbox/common/module/NetworkIdGenerator;->newId()J

    move-result-wide v0

    new-instance v2, Lud3/n0;

    invoke-direct {v2}, Lud3/n0;-><init>()V

    const-string v3, "GET"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    invoke-virtual {p1}, Lcom/mapbox/common/experimental/wss_backend/Request;->getUrl()Ljava/lang/String;

    move-result-object v3

    const-string v4, "request.url"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lud3/n0;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/common/experimental/wss_backend/Request;->getHeaders()Ljava/util/HashMap;

    move-result-object p1

    const-string v3, "request.headers"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v4, v3}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    invoke-direct {p1, p2, v0, v1}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;-><init>(Lcom/mapbox/common/experimental/wss_backend/RequestObserver;J)V

    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->wssClient:Lud3/l0;

    new-instance v3, Lud3/o0;

    invoke-direct {v3, v2}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p2, v3, p1}, Lud3/l0;->c(Lud3/o0;Lud3/f1;)Lle3/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->setWebSocket(Lud3/e1;)V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-object v2, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-interface {v2, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-wide v0
.end method

.method public final setConnectionTimeout(J)V
    .locals 2

    iput-wide p1, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->connectTimeoutMs:J

    new-instance p1, Lud3/k0;

    invoke-direct {p1}, Lud3/k0;-><init>()V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->connectTimeoutMs:J

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->pingTimeoutMs:J

    invoke-virtual {p1, v0, v1, p2}, Lud3/k0;->c(JLjava/util/concurrent/TimeUnit;)V

    new-instance p2, Lud3/l0;

    invoke-direct {p2, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p2, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->wssClient:Lud3/l0;

    return-void
.end method

.method public setPingTimeout(J)V
    .locals 2

    iput-wide p1, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->pingTimeoutMs:J

    new-instance p1, Lud3/k0;

    invoke-direct {p1}, Lud3/k0;-><init>()V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->connectTimeoutMs:J

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->pingTimeoutMs:J

    invoke-virtual {p1, v0, v1, p2}, Lud3/k0;->c(JLjava/util/concurrent/TimeUnit;)V

    new-instance p2, Lud3/l0;

    invoke-direct {p2, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p2, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->wssClient:Lud3/l0;

    return-void
.end method

.method public write(JLcom/mapbox/common/experimental/wss_backend/Data;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/mapbox/common/experimental/wss_backend/Data;->isByteArray()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getWebSocket()Lud3/e1;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lne3/l;->z:Lne3/k;

    invoke-virtual {p3}, Lcom/mapbox/common/experimental/wss_backend/Data;->getByteArray()[B

    move-result-object p3

    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p3

    const-string v1, "wrap(data.byteArray)"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {p3, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p3, Lne3/l;

    invoke-direct {p3, v1}, Lne3/l;-><init>([B)V

    check-cast v0, Lle3/g;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p3}, Lle3/g;->g(ILne3/l;)Z

    move-result v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getWebSocket()Lud3/e1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/mapbox/common/experimental/wss_backend/Data;->getString()Ljava/lang/String;

    move-result-object p3

    const-string v1, "data.string"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lle3/g;

    invoke-virtual {v0, p3}, Lle3/g;->h(Ljava/lang/String;)Z

    move-result v1

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    new-instance p3, Lcom/mapbox/common/HttpRequestError;

    sget-object v0, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    const-string v1, "Message would overflow buffer or shutdown in progress"

    invoke-direct {p3, v0, v1}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/WssBackend;->socketMap:Ljava/util/Map;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/WebsocketObserverWrapper;->getRequestObserver()Lcom/mapbox/common/experimental/wss_backend/RequestObserver;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/mapbox/common/experimental/wss_backend/RequestObserver;->onFailed(JLcom/mapbox/common/HttpRequestError;Ljava/lang/Integer;)V

    :cond_2
    return-void
.end method
