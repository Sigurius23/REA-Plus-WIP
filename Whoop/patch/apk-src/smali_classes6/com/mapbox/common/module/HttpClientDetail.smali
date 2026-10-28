.class public interface abstract Lcom/mapbox/common/module/HttpClientDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001JG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u001a\u0010\u000c\u001a\u0016\u0012\u0008\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000bH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/mapbox/common/module/HttpClientDetail;",
        "",
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


# virtual methods
.method public abstract buildRequest(Lcom/mapbox/common/http_backend/Request;JLcom/mapbox/common/http_backend/RequestObserver;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/common/module/RequestDetail;
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
.end method

.method public abstract executor()Ljava/util/concurrent/ExecutorService;
.end method

.method public abstract setMaxRequestsPerHost(B)V
.end method

.method public abstract supportsKeepCompression()Z
.end method
