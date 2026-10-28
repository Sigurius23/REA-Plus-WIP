.class public final Lcom/mapbox/common/module/okhttp/HttpCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\n\u001a\u0016\u0012\u0008\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\u00080\u0006j\u0002`\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0018R(\u0010\n\u001a\u0016\u0012\u0008\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\u00080\u0006j\u0002`\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/HttpCallback;",
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;",
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
        "Lcom/mapbox/common/HttpRequestError;",
        "error",
        "onFailure",
        "(Lcom/mapbox/common/HttpRequestError;)V",
        "Lud3/j;",
        "call",
        "Lud3/x0;",
        "response",
        "onResponse",
        "(Lud3/j;Lud3/x0;)V",
        "J",
        "Lcom/mapbox/common/http_backend/RequestObserver;",
        "Lkotlin/jvm/functions/Function1;",
        "chunkSize",
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
.field private final chunkSize:J

.field private final id:J

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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    iput-object p3, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iput-object p4, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    const-wide/32 p1, 0x10000

    iput-wide p1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->chunkSize:J

    return-void
.end method


# virtual methods
.method public onFailure(Lcom/mapbox/common/HttpRequestError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iget-wide v1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-interface {v0, v1, v2, p1}, Lcom/mapbox/common/http_backend/RequestObserver;->onFailed(JLcom/mapbox/common/HttpRequestError;)V

    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 10

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/mapbox/common/http_backend/ResponseData;

    invoke-static {p2}, Lcom/mapbox/common/module/okhttp/HttpCallbackKt;->access$generateOutputHeaders(Lud3/x0;)Ljava/util/HashMap;

    move-result-object v1

    iget v2, p2, Lud3/x0;->z:I

    new-instance v3, Lcom/mapbox/common/ResponseReadStream;

    invoke-direct {v3, p1}, Lcom/mapbox/common/ResponseReadStream;-><init>(Lne3/h;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/mapbox/common/http_backend/ResponseData;-><init>(Ljava/util/HashMap;ILcom/mapbox/common/ReadStream;)V

    iget-object v1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iget-wide v2, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-interface {v1, v2, v3, v0}, Lcom/mapbox/common/http_backend/RequestObserver;->onResponse(JLcom/mapbox/common/http_backend/ResponseData;)V

    iget-object p2, p2, Lud3/x0;->G:Lud3/a1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz p2, :cond_5

    :try_start_1
    invoke-virtual {p2}, Lud3/a1;->d1()Lne3/j;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v1, 0x0

    :cond_0
    :goto_0
    if-nez v1, :cond_4

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :cond_1
    :try_start_2
    iget-wide v6, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->chunkSize:J

    sub-long/2addr v6, v4

    invoke-interface {v0, p1, v6, v7}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-eqz v8, :cond_2

    add-long/2addr v4, v6

    const-wide/16 v8, 0x2000

    cmp-long v6, v6, v8

    if-nez v6, :cond_3

    iget-wide v6, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->chunkSize:J

    cmp-long v6, v4, v6

    if-ltz v6, :cond_1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const/4 v1, 0x1

    :cond_3
    :goto_1
    cmp-long v2, v4, v2

    if-lez v2, :cond_0

    iget-object v2, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iget-wide v3, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-interface {v2, v3, v4}, Lcom/mapbox/common/http_backend/RequestObserver;->onData(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_2
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_4
    const/4 p1, 0x0

    invoke-static {v0, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    goto :goto_5

    :goto_3
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_7
    invoke-static {p2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    :goto_4
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->observer:Lcom/mapbox/common/http_backend/RequestObserver;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-interface {p1, v0, v1}, Lcom/mapbox/common/http_backend/RequestObserver;->onSucceeded(J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :goto_5
    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/HttpCallback;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method
