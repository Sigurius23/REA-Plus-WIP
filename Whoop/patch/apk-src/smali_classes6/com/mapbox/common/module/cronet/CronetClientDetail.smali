.class public final Lcom/mapbox/common/module/cronet/CronetClientDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/HttpClientDetail;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\u000c2\u001a\u0010\u0011\u001a\u0016\u0012\u0008\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JG\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0008\u001a\u00020\u00072\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\u000c2\u001a\u0010\u0011\u001a\u0016\u0012\u0008\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0002\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lcom/mapbox/common/module/cronet/CronetClientDetail;",
        "Lcom/mapbox/common/module/HttpClientDetail;",
        "fallback",
        "<init>",
        "(Lcom/mapbox/common/module/HttpClientDetail;)V",
        "Lorg/chromium/net/CronetEngine;",
        "engine",
        "Lcom/mapbox/common/http_backend/Request;",
        "request",
        "",
        "Lcom/mapbox/common/module/RequestId;",
        "id",
        "Lcom/mapbox/common/http_backend/RequestObserver;",
        "requestObserver",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "Lcom/mapbox/common/module/RequestFinishedCallback;",
        "onRequestFinished",
        "Lcom/mapbox/common/module/cronet/CronetRequestDetail;",
        "buildRequestWithEngine",
        "(Lorg/chromium/net/CronetEngine;Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/cronet/CronetRequestDetail;",
        "Lcom/mapbox/common/module/RequestDetail;",
        "buildRequest",
        "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;",
        "Ljava/util/concurrent/ExecutorService;",
        "executor",
        "()Ljava/util/concurrent/ExecutorService;",
        "",
        "max",
        "setMaxRequestsPerHost",
        "(B)V",
        "",
        "supportsKeepCompression",
        "()Z",
        "Lcom/mapbox/common/module/HttpClientDetail;",
        "Lcom/mapbox/common/module/cronet/LazyEngine;",
        "cronetEngine",
        "Lcom/mapbox/common/module/cronet/LazyEngine;",
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
.field private final cronetEngine:Lcom/mapbox/common/module/cronet/LazyEngine;

.field private final fallback:Lcom/mapbox/common/module/HttpClientDetail;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/module/HttpClientDetail;)V
    .locals 2

    const-string v0, "fallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/CronetClientDetail;->fallback:Lcom/mapbox/common/module/HttpClientDetail;

    new-instance p1, Lcom/mapbox/common/module/cronet/LazyEngine;

    invoke-static {}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->access$getCallbackExecutor$p()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "callbackExecutor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/concurrent/Executor;

    invoke-direct {p1, v0}, Lcom/mapbox/common/module/cronet/LazyEngine;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/CronetClientDetail;->cronetEngine:Lcom/mapbox/common/module/cronet/LazyEngine;

    return-void
.end method

.method private final buildRequestWithEngine(Lorg/chromium/net/CronetEngine;Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/cronet/CronetRequestDetail;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/chromium/net/CronetEngine;",
            "Lcom/mapbox/common/http_backend/Request;",
            "J",
            "Lcom/mapbox/common/http_backend/RequestObserver;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/common/module/cronet/CronetRequestDetail;"
        }
    .end annotation

    new-instance v0, Lcom/mapbox/common/module/cronet/UrlCallback;

    invoke-direct {v0, p3, p4, p5, p6}, Lcom/mapbox/common/module/cronet/UrlCallback;-><init>(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getUrl()Ljava/lang/String;

    move-result-object p3

    invoke-static {}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->access$getCallbackExecutor$p()Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    check-cast p4, Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p3, v0, p4}, Lorg/chromium/net/CronetEngine;->newUrlRequestBuilder(Ljava/lang/String;Lorg/chromium/net/UrlRequest$Callback;Ljava/util/concurrent/Executor;)Lorg/chromium/net/UrlRequest$Builder;

    move-result-object p1

    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getHeaders()Ljava/util/HashMap;

    move-result-object p3

    const-string p4, "request.headers"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/util/Map$Entry;

    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Ljava/lang/String;

    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    invoke-virtual {p1, p6, p5}, Lorg/chromium/net/UrlRequest$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lorg/chromium/net/UrlRequest$Builder;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getMethod()Lcom/mapbox/common/HttpMethod;

    move-result-object p4

    invoke-virtual {p4}, Lcom/mapbox/common/HttpMethod;->toString()Ljava/lang/String;

    move-result-object p4

    const-string p5, "request.method.toString()"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p4, p5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p4

    const-string p5, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p4}, Lorg/chromium/net/UrlRequest$Builder;->setHttpMethod(Ljava/lang/String;)Lorg/chromium/net/UrlRequest$Builder;

    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getMethod()Lcom/mapbox/common/HttpMethod;

    move-result-object p4

    sget-object p5, Lcom/mapbox/common/HttpMethod;->POST:Lcom/mapbox/common/HttpMethod;

    if-ne p4, p5, :cond_2

    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getBody()Lcom/mapbox/common/ReadStream;

    move-result-object p4

    if-eqz p4, :cond_2

    const-string p5, "content-type"

    invoke-virtual {p3, p5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "Content-Type"

    invoke-virtual {p3, p5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    const-string p3, "application/octet-stream"

    invoke-virtual {p1, p5, p3}, Lorg/chromium/net/UrlRequest$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lorg/chromium/net/UrlRequest$Builder;

    :cond_1
    invoke-static {p4}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->access$toOkioBuffer(Lcom/mapbox/common/ReadStream;)Lne3/h;

    move-result-object p3

    iget-wide p4, p3, Lne3/h;->x:J

    invoke-virtual {p3, p4, p5}, Lne3/h;->b0(J)[B

    move-result-object p3

    const/4 p4, 0x0

    array-length p5, p3

    invoke-static {p3, p4, p5}, Lse/b;->w([BII)Lpe3/b;

    move-result-object p3

    invoke-static {}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->access$getCallbackExecutor$p()Ljava/util/concurrent/ExecutorService;

    move-result-object p4

    check-cast p4, Ljava/util/concurrent/Executor;

    invoke-virtual {p1, p3, p4}, Lorg/chromium/net/UrlRequest$Builder;->setUploadDataProvider(Lorg/chromium/net/UploadDataProvider;Ljava/util/concurrent/Executor;)Lorg/chromium/net/UrlRequest$Builder;

    :cond_2
    new-instance p3, Lcom/mapbox/common/module/cronet/CronetRequestDetail;

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest$Builder;->build()Lorg/chromium/net/UrlRequest;

    move-result-object p1

    const-string p4, "requestBuilder.build()"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mapbox/common/http_backend/Request;->getTimeout()J

    move-result-wide p4

    invoke-direct {p3, p1, v0, p4, p5}, Lcom/mapbox/common/module/cronet/CronetRequestDetail;-><init>(Lorg/chromium/net/UrlRequest;Lcom/mapbox/common/module/cronet/UrlCallback;J)V

    return-object p3
.end method


# virtual methods
.method public buildRequest(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/http_backend/Request;",
            "J",
            "Lcom/mapbox/common/http_backend/RequestObserver;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/mapbox/common/module/RequestDetail;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestObserver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRequestFinished"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/CronetClientDetail;->cronetEngine:Lcom/mapbox/common/module/cronet/LazyEngine;

    invoke-virtual {v0}, Lcom/mapbox/common/module/cronet/LazyEngine;->getEngine()Lorg/chromium/net/CronetEngine;

    move-result-object v2

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    move-object v7, p5

    if-eqz v2, :cond_0

    invoke-direct/range {v1 .. v7}, Lcom/mapbox/common/module/cronet/CronetClientDetail;->buildRequestWithEngine(Lorg/chromium/net/CronetEngine;Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/cronet/CronetRequestDetail;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    iget-object v2, v1, Lcom/mapbox/common/module/cronet/CronetClientDetail;->fallback:Lcom/mapbox/common/module/HttpClientDetail;

    invoke-interface/range {v2 .. v7}, Lcom/mapbox/common/module/HttpClientDetail;->buildRequest(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;

    move-result-object p1

    return-object p1
.end method

.method public executor()Ljava/util/concurrent/ExecutorService;
    .locals 2

    invoke-static {}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->access$getCallbackExecutor$p()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    const-string v1, "callbackExecutor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public setMaxRequestsPerHost(B)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/CronetClientDetail;->fallback:Lcom/mapbox/common/module/HttpClientDetail;

    invoke-interface {v0, p1}, Lcom/mapbox/common/module/HttpClientDetail;->setMaxRequestsPerHost(B)V

    return-void
.end method

.method public supportsKeepCompression()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
