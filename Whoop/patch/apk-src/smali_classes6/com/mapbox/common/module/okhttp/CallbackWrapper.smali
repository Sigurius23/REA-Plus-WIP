.class public final Lcom/mapbox/common/module/okhttp/CallbackWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001:\u0001%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0008\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\u000c0\nj\u0002`\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u000c2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0019\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R(\u0010\u000e\u001a\u0016\u0012\u0008\u0012\u00060\u0004j\u0002`\u000b\u0012\u0004\u0012\u00020\u000c0\nj\u0002`\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper;",
        "Lud3/k;",
        "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;",
        "service",
        "",
        "id",
        "Lud3/j;",
        "call",
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;",
        "callback",
        "Lkotlin/Function1;",
        "Lcom/mapbox/common/module/RequestId;",
        "Ll83/a0;",
        "Lcom/mapbox/common/module/RequestFinishedCallback;",
        "onRequestFinished",
        "<init>",
        "(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Lkotlin/jvm/functions/Function1;)V",
        "Ljava/io/IOException;",
        "e",
        "onFailure",
        "(Lud3/j;Ljava/io/IOException;)V",
        "Lud3/x0;",
        "response",
        "onResponse",
        "(Lud3/j;Lud3/x0;)V",
        "cancel",
        "()V",
        "Lcom/mapbox/common/HttpRequestError;",
        "error",
        "(Lcom/mapbox/common/HttpRequestError;)V",
        "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;",
        "J",
        "Lud3/j;",
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;",
        "Lkotlin/jvm/functions/Function1;",
        "requestError",
        "Lcom/mapbox/common/HttpRequestError;",
        "RequestCallback",
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
.field private final call:Lud3/j;

.field private final callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

.field private final id:J

.field private final onRequestFinished:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private requestError:Lcom/mapbox/common/HttpRequestError;

.field private final service:Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;JLud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;",
            "J",
            "Lud3/j;",
            "Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRequestFinished"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->service:Lcom/mapbox/common/module/okhttp/OkHttpClientDetail;

    iput-wide p2, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->id:J

    iput-object p4, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->call:Lud3/j;

    iput-object p5, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

    iput-object p6, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 1
    new-instance v0, Lcom/mapbox/common/HttpRequestError;

    sget-object v1, Lcom/mapbox/common/HttpRequestErrorType;->REQUEST_CANCELLED:Lcom/mapbox/common/HttpRequestErrorType;

    const-string v2, "Request cancelled"

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->requestError:Lcom/mapbox/common/HttpRequestError;

    .line 2
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->call:Lud3/j;

    check-cast v0, Lzd3/o;

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    return-void
.end method

.method public final cancel(Lcom/mapbox/common/HttpRequestError;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->requestError:Lcom/mapbox/common/HttpRequestError;

    .line 4
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->call:Lud3/j;

    check-cast p1, Lzd3/o;

    invoke-virtual {p1}, Lzd3/o;->cancel()V

    return-void
.end method

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lzd3/o;

    iget-boolean p1, p1, Lzd3/o;->R:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->requestError:Lcom/mapbox/common/HttpRequestError;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

    invoke-interface {p2, p1}, Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;->onFailure(Lcom/mapbox/common/HttpRequestError;)V

    goto :goto_5

    :cond_0
    sget-object p1, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    instance-of v0, p2, Ljava/net/UnknownHostException;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    instance-of v0, p2, Ljavax/net/ssl/SSLException;

    :goto_0
    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    instance-of v0, p2, Ljava/net/UnknownServiceException;

    :goto_1
    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    instance-of v0, p2, Ljava/net/SocketException;

    :goto_2
    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    instance-of v1, p2, Ljava/net/ProtocolException;

    :goto_3
    if-eqz v1, :cond_5

    sget-object p1, Lcom/mapbox/common/HttpRequestErrorType;->CONNECTION_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    goto :goto_4

    :cond_5
    instance-of v0, p2, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_6

    sget-object p1, Lcom/mapbox/common/HttpRequestErrorType;->REQUEST_TIMED_OUT:Lcom/mapbox/common/HttpRequestErrorType;

    :cond_6
    :goto_4
    new-instance v0, Lcom/mapbox/common/HttpRequestError;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

    invoke-interface {p1, v0}, Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;->onFailure(Lcom/mapbox/common/HttpRequestError;)V

    :goto_5
    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->onRequestFinished:Lkotlin/jvm/functions/Function1;

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->id:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

    invoke-interface {v0, p1, p2}, Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;->onResponse(Lud3/j;Lud3/x0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_1

    :goto_0
    iget-object p2, p0, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;

    new-instance v0, Lcom/mapbox/common/HttpRequestError;

    sget-object v1, Lcom/mapbox/common/HttpRequestErrorType;->OTHER_ERROR:Lcom/mapbox/common/HttpRequestErrorType;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lcom/mapbox/common/module/okhttp/CallbackWrapper$RequestCallback;->onFailure(Lcom/mapbox/common/HttpRequestError;)V

    goto :goto_2

    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->onFailure(Lud3/j;Ljava/io/IOException;)V

    :goto_2
    return-void
.end method
