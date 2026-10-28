.class public final Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/HttpClientDetail;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/okhttp/OkHttpClientDetail$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000c2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u001a\u0010\u0015\u001a\u0016\u0012\u0008\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00060\u0013j\u0002`\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;",
        "Lcom/mapbox/common/module/HttpClientDetail;",
        "<init>",
        "()V",
        "",
        "max",
        "Ll83/a0;",
        "setMaxRequestsPerHost",
        "(B)V",
        "",
        "supportsKeepCompression",
        "()Z",
        "Lcom/mapbox/common/http_backend/Request;",
        "request",
        "",
        "Lcom/mapbox/common/module/RequestId;",
        "id",
        "Lcom/mapbox/common/http_backend/RequestObserver;",
        "requestObserver",
        "Lkotlin/Function1;",
        "Lcom/mapbox/common/module/RequestFinishedCallback;",
        "onRequestFinished",
        "Lcom/mapbox/common/module/RequestDetail;",
        "buildRequest",
        "(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;",
        "Ljava/util/concurrent/ExecutorService;",
        "executor",
        "()Ljava/util/concurrent/ExecutorService;",
        "Lcom/mapbox/common/module/okhttp/LazyClient;",
        "httpClient",
        "Lcom/mapbox/common/module/okhttp/LazyClient;",
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
.field private final httpClient:Lcom/mapbox/common/module/okhttp/LazyClient;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/mapbox/common/module/okhttp/LazyClient;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/module/okhttp/LazyClient;-><init>(Ljavax/net/SocketFactory;Z)V

    iput-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;->httpClient:Lcom/mapbox/common/module/okhttp/LazyClient;

    return-void
.end method


# virtual methods
.method public buildRequest(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;
    .locals 9
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

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getUrl()Ljava/lang/String;

    move-result-object v1

    const-string v2, "request.url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v2, Ljava/lang/Object;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-string v3, "type"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lud3/n0;->e:Lv63/c;

    invoke-virtual {v3, v2, v1}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object v1

    iput-object v1, v0, Lud3/n0;->e:Lv63/c;

    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getHeaders()Ljava/util/HashMap;

    move-result-object v1

    const-string v2, "request.headers"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "key"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "value"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getFlags()I

    move-result v1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const-string v1, "Accept-Encoding"

    const-string v3, "gzip, deflate"

    invoke-virtual {v0, v1, v3}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getMethod()Lcom/mapbox/common/HttpMethod;

    move-result-object v1

    sget-object v3, Lcom/mapbox/common/module/okhttp/OkHttpClientDetail$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    if-eq v1, v2, :cond_4

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getBody()Lcom/mapbox/common/ReadStream;

    move-result-object v1

    const-string v2, "POST"

    if-nez v1, :cond_3

    sget-object v1, Lud3/v0;->Companion:Lud3/u0;

    const/4 v4, 0x0

    new-array v5, v4, [B

    const/4 v6, 0x7

    invoke-static {v1, v5, v3, v4, v6}, Lud3/u0;->d(Lud3/u0;[BLud3/h0;II)Lud3/t0;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    goto :goto_1

    :cond_3
    new-instance v4, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;

    invoke-direct {v4, v1, v3}, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;-><init>(Lcom/mapbox/common/ReadStream;Lud3/h0;)V

    invoke-virtual {v0, v2, v4}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    goto :goto_1

    :cond_4
    const-string v1, "GET"

    invoke-virtual {v0, v1, v3}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    goto :goto_1

    :cond_5
    const-string v1, "HEAD"

    invoke-virtual {v0, v1, v3}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    :goto_1
    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;->httpClient:Lcom/mapbox/common/module/okhttp/LazyClient;

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/LazyClient;->get()Lud3/l0;

    move-result-object v0

    invoke-virtual {v0, v1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object v6

    iget-object v0, v6, Lzd3/o;->F:Lzd3/n;

    invoke-virtual {p1}, Lcom/mapbox/common/http_backend/Request;->getTimeout()J

    move-result-wide v1

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, p1}, Lne3/r0;->g(JLjava/util/concurrent/TimeUnit;)Lne3/r0;

    new-instance v2, Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    new-instance v7, Lcom/mapbox/common/module/okhttp/HttpCallback;

    invoke-direct {v7, p2, p3, p4, p5}, Lcom/mapbox/common/module/okhttp/HttpCallback;-><init>(JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)V

    move-object v3, p0

    move-wide v4, p2

    move-object v8, p5

    invoke-direct/range {v2 .. v8}, Lcom/mapbox/common/module/okhttp/CallbackWrapper;-><init>(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;

    invoke-direct {p1, v6, v2}, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;-><init>(Lud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper;)V

    return-object p1
.end method

.method public executor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;->httpClient:Lcom/mapbox/common/module/okhttp/LazyClient;

    invoke-virtual {v0}, Lcom/mapbox/common/module/okhttp/LazyClient;->get()Lud3/l0;

    move-result-object v0

    iget-object v0, v0, Lud3/l0;->a:Lud3/u;

    invoke-virtual {v0}, Lud3/u;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public setMaxRequestsPerHost(B)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;->httpClient:Lcom/mapbox/common/module/okhttp/LazyClient;

    invoke-virtual {v0, p1}, Lcom/mapbox/common/module/okhttp/LazyClient;->setMaxRequestsPerHost(B)V

    return-void
.end method

.method public supportsKeepCompression()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
