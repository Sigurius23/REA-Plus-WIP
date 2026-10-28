.class public final Lcom/mapbox/common/module/cronet/UrlCallback;
.super Lorg/chromium/net/UrlRequest$Callback;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0008\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\u00080\u0006j\u0002`\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0011\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ-\u0010!\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J#\u0010#\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008#\u0010\u001eJ-\u0010&\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J#\u0010(\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008(\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010*R(\u0010\n\u001a\u0016\u0012\u0008\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\u00080\u0006j\u0002`\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u00068"
    }
    d2 = {
        "Lcom/mapbox/common/module/cronet/UrlCallback;",
        "Lorg/chromium/net/UrlRequest$Callback;",
        "",
        "id",
        "Lcom/mapbox/common/http_backend/RequestObserver;",
        "observer",
        "Lkotlin/Function1;",
        "Lcom/mapbox/common/module/RequestId;",
        "Ll83/a0;",
        "Lcom/mapbox/common/module/RequestFinishedCallback;",
        "onRequestFinished",
        "<init>",
        "(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V",
        "Lorg/chromium/net/UrlRequest;",
        "request",
        "Lkotlin/Function0;",
        "callback",
        "runObserverCallbackSynchronously",
        "(Lorg/chromium/net/UrlRequest;Lc93/a;)V",
        "Lcom/mapbox/common/HttpRequestError;",
        "reason",
        "setCancelReason",
        "(Lcom/mapbox/common/HttpRequestError;)V",
        "Lorg/chromium/net/UrlResponseInfo;",
        "info",
        "",
        "newLocationUrl",
        "onRedirectReceived",
        "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V",
        "onResponseStarted",
        "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V",
        "Ljava/nio/ByteBuffer;",
        "byteBuffer",
        "onReadCompleted",
        "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V",
        "onSucceeded",
        "Lorg/chromium/net/CronetException;",
        "exception",
        "onFailed",
        "(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V",
        "onCanceled",
        "J",
        "Lcom/mapbox/common/http_backend/RequestObserver;",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "chunkSize",
        "I",
        "",
        "failed",
        "Z",
        "Lne3/h;",
        "intermediateBuffer",
        "Lne3/h;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "cancelReason",
        "Ljava/util/concurrent/atomic/AtomicReference;",
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
.field private cancelReason:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lcom/mapbox/common/HttpRequestError;",
            ">;"
        }
    .end annotation
.end field

.field private final chunkSize:I

.field private failed:Z

.field private final id:J

.field private final intermediateBuffer:Lne3/h;

.field private final observer:Lcom/mapbox/common/http_backend/RequestObserver;

.field private final onRequestFinished:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/mapbox/common/http_backend/RequestObserver;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "observer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRequestFinished"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lorg/chromium/net/UrlRequest$Callback;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->id:J

    iput-object p3, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iput-object p4, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    const/high16 p1, 0x10000

    iput p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->chunkSize:I

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->intermediateBuffer:Lne3/h;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->cancelReason:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final synthetic access$getId$p(Lcom/mapbox/common/module/cronet/UrlCallback;)J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->id:J

    return-wide v0
.end method

.method public static final synthetic access$getIntermediateBuffer$p(Lcom/mapbox/common/module/cronet/UrlCallback;)Lne3/h;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->intermediateBuffer:Lne3/h;

    return-object p0
.end method

.method public static final synthetic access$getObserver$p(Lcom/mapbox/common/module/cronet/UrlCallback;)Lcom/mapbox/common/http_backend/RequestObserver;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    return-object p0
.end method

.method public static final synthetic access$setFailed$p(Lcom/mapbox/common/module/cronet/UrlCallback;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->failed:Z

    return-void
.end method

.method private final runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/chromium/net/UrlRequest;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->failed:Z

    if-nez v0, :cond_0

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_2
    monitor-exit p0

    return-void

    :catch_0
    move-exception p2

    goto :goto_2

    :goto_1
    monitor-exit p0

    throw p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->isDone()Z

    move-result v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_2

    new-instance v0, Lcom/mapbox/common/HttpRequestError;

    sget-object v1, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    const-string v2, "Exception during callback: "

    invoke-static {p2, v2}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/module/cronet/UrlCallback;->setCancelReason(Lcom/mapbox/common/HttpRequestError;)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->cancel()V

    :cond_2
    return-void
.end method


# virtual methods
.method public onCanceled(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
    .locals 2

    iget-object p2, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->cancelReason:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/mapbox/common/HttpRequestError;

    if-nez p2, :cond_0

    new-instance p2, Lcom/mapbox/common/HttpRequestError;

    sget-object v0, Lcom/mapbox/common/HttpRequestErrorType;->REQUEST_CANCELLED:Lcom/mapbox/common/HttpRequestErrorType;

    const-string v1, "Request cancelled"

    invoke-direct {p2, v0, v1}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    :cond_0
    new-instance v0, Lcom/mapbox/common/module/cronet/UrlCallback$onCanceled$1;

    invoke-direct {v0, p0, p2}, Lcom/mapbox/common/module/cronet/UrlCallback$onCanceled$1;-><init>(Lcom/mapbox/common/module/cronet/UrlCallback;Lcom/mapbox/common/HttpRequestError;)V

    invoke-direct {p0, p1, v0}, Lcom/mapbox/common/module/cronet/UrlCallback;->runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V

    iget-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onFailed(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Lorg/chromium/net/CronetException;)V
    .locals 3

    sget-object p2, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    instance-of v0, p3, Lorg/chromium/net/NetworkException;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mapbox/common/HttpRequestErrorType;->CONNECTION_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    move-object v1, p3

    check-cast v1, Lorg/chromium/net/NetworkException;

    invoke-virtual {v1}, Lorg/chromium/net/NetworkException;->getErrorCode()I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    const/4 v2, 0x6

    if-eq v1, v2, :cond_0

    const/16 v2, 0xb

    if-eq v1, v2, :cond_1

    move-object p2, v0

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/mapbox/common/HttpRequestErrorType;->REQUEST_TIMED_OUT:Lcom/mapbox/common/HttpRequestErrorType;

    :cond_1
    :goto_0
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    const-string v0, "Exception of type "

    invoke-virtual {v0, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_4

    :cond_3
    const-string v0, "No info"

    :cond_4
    new-instance p3, Lcom/mapbox/common/HttpRequestError;

    const-string v1, "Couldn\'t connect to server: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, p2, v0}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    new-instance p2, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;

    invoke-direct {p2, p0, p3}, Lcom/mapbox/common/module/cronet/UrlCallback$onFailed$1;-><init>(Lcom/mapbox/common/module/cronet/UrlCallback;Lcom/mapbox/common/HttpRequestError;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/module/cronet/UrlCallback;->runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V

    iget-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide p2, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->id:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onReadCompleted(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/nio/ByteBuffer;)V
    .locals 3

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p2, 0x0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->intermediateBuffer:Lne3/h;

    invoke-virtual {v0, p3}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/2addr p2, v0

    if-gtz v0, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Lorg/chromium/net/UrlRequest;->read(Ljava/nio/ByteBuffer;)V

    if-lez p2, :cond_1

    new-instance p2, Lcom/mapbox/common/module/cronet/UrlCallback$onReadCompleted$2;

    invoke-direct {p2, p0}, Lcom/mapbox/common/module/cronet/UrlCallback$onReadCompleted$2;-><init>(Lcom/mapbox/common/module/cronet/UrlCallback;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/module/cronet/UrlCallback;->runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V

    return-void

    :catch_0
    move-exception p2

    goto :goto_0

    :catchall_0
    move-exception p2

    :try_start_3
    monitor-exit p0

    throw p2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    :goto_0
    new-instance p3, Lcom/mapbox/common/HttpRequestError;

    sget-object v0, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error reading network buffer: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lcom/mapbox/common/module/cronet/UrlCallback;->setCancelReason(Lcom/mapbox/common/HttpRequestError;)V

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->cancel()V

    :cond_1
    return-void
.end method

.method public onRedirectReceived(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->followRedirect()V

    :cond_0
    return-void
.end method

.method public onResponseStarted(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
    .locals 5

    if-eqz p1, :cond_5

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p2}, Lorg/chromium/net/UrlResponseInfo;->getAllHeaders()Ljava/util/Map;

    move-result-object v0

    const-string v1, "info.allHeaders"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_1

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "it.key"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v4, 0x0

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {p2}, Lorg/chromium/net/UrlResponseInfo;->getHttpStatusCode()I

    move-result v1

    invoke-static {v1}, Lcom/mapbox/common/NetworkUsageMetricsMeter;->onHttpCodeReceived(I)V

    new-instance v1, Lcom/mapbox/common/module/cronet/UrlCallback$onResponseStarted$1;

    invoke-direct {v1, p0, v0, p2}, Lcom/mapbox/common/module/cronet/UrlCallback$onResponseStarted$1;-><init>(Lcom/mapbox/common/module/cronet/UrlCallback;Ljava/util/HashMap;Lorg/chromium/net/UrlResponseInfo;)V

    invoke-direct {p0, p1, v1}, Lcom/mapbox/common/module/cronet/UrlCallback;->runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V

    iget p2, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->chunkSize:I

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/chromium/net/UrlRequest;->read(Ljava/nio/ByteBuffer;)V

    return-void

    :cond_5
    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->cancel()V

    :cond_6
    return-void
.end method

.method public onSucceeded(Lorg/chromium/net/UrlRequest;Lorg/chromium/net/UrlResponseInfo;)V
    .locals 2

    new-instance p2, Lcom/mapbox/common/module/cronet/UrlCallback$onSucceeded$1;

    invoke-direct {p2, p0}, Lcom/mapbox/common/module/cronet/UrlCallback$onSucceeded$1;-><init>(Lcom/mapbox/common/module/cronet/UrlCallback;)V

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/module/cronet/UrlCallback;->runObserverCallbackSynchronously(Lorg/chromium/net/UrlRequest;Lc93/a;)V

    iget-object p1, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final setCancelReason(Lcom/mapbox/common/HttpRequestError;)V
    .locals 1

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/UrlCallback;->cancelReason:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
