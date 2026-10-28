.class public final Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/RequestDetail;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00082\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;",
        "Lcom/mapbox/common/module/RequestDetail;",
        "Lud3/j;",
        "call",
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper;",
        "callback",
        "<init>",
        "(Lud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper;)V",
        "Ll83/a0;",
        "start",
        "()V",
        "Lcom/mapbox/common/HttpRequestError;",
        "error",
        "cancel",
        "(Lcom/mapbox/common/HttpRequestError;)V",
        "Lud3/j;",
        "getCall",
        "()Lud3/j;",
        "Lcom/mapbox/common/module/okhttp/CallbackWrapper;",
        "getCallback",
        "()Lcom/mapbox/common/module/okhttp/CallbackWrapper;",
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

.field private final callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;


# direct methods
.method public constructor <init>(Lud3/j;Lcom/mapbox/common/module/okhttp/CallbackWrapper;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->call:Lud3/j;

    iput-object p2, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    return-void
.end method


# virtual methods
.method public cancel(Lcom/mapbox/common/HttpRequestError;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    invoke-virtual {p1}, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->cancel()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    invoke-virtual {v0, p1}, Lcom/mapbox/common/module/okhttp/CallbackWrapper;->cancel(Lcom/mapbox/common/HttpRequestError;)V

    return-void
.end method

.method public final getCall()Lud3/j;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->call:Lud3/j;

    return-object v0
.end method

.method public final getCallback()Lcom/mapbox/common/module/okhttp/CallbackWrapper;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    return-object v0
.end method

.method public start()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->call:Lud3/j;

    iget-object v1, p0, Lcom/mapbox/common/module/okhttp/OkHttpRequestDetail;->callback:Lcom/mapbox/common/module/okhttp/CallbackWrapper;

    check-cast v0, Lzd3/o;

    invoke-virtual {v0, v1}, Lzd3/o;->d(Lud3/k;)V

    return-void
.end method
