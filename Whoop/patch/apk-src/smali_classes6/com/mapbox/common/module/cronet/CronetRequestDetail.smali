.class public final Lcom/mapbox/common/module/cronet/CronetRequestDetail;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/module/RequestDetail;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/mapbox/common/module/cronet/CronetRequestDetail;",
        "Lcom/mapbox/common/module/RequestDetail;",
        "Lorg/chromium/net/UrlRequest;",
        "request",
        "Lcom/mapbox/common/module/cronet/UrlCallback;",
        "callback",
        "",
        "timeoutSeconds",
        "<init>",
        "(Lorg/chromium/net/UrlRequest;Lcom/mapbox/common/module/cronet/UrlCallback;J)V",
        "Ll83/a0;",
        "start",
        "()V",
        "Lcom/mapbox/common/HttpRequestError;",
        "error",
        "cancel",
        "(Lcom/mapbox/common/HttpRequestError;)V",
        "Lorg/chromium/net/UrlRequest;",
        "Lcom/mapbox/common/module/cronet/UrlCallback;",
        "J",
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
.field private final callback:Lcom/mapbox/common/module/cronet/UrlCallback;

.field private final request:Lorg/chromium/net/UrlRequest;

.field private final timeoutSeconds:J


# direct methods
.method public constructor <init>(Lorg/chromium/net/UrlRequest;Lcom/mapbox/common/module/cronet/UrlCallback;J)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->request:Lorg/chromium/net/UrlRequest;

    iput-object p2, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->callback:Lcom/mapbox/common/module/cronet/UrlCallback;

    iput-wide p3, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->timeoutSeconds:J

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/common/module/cronet/CronetRequestDetail;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->start$lambda$0(Lcom/mapbox/common/module/cronet/CronetRequestDetail;)V

    return-void
.end method

.method private static final start$lambda$0(Lcom/mapbox/common/module/cronet/CronetRequestDetail;)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->request:Lorg/chromium/net/UrlRequest;

    invoke-virtual {v0}, Lorg/chromium/net/UrlRequest;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/mapbox/common/HttpRequestError;

    sget-object v1, Lcom/mapbox/common/HttpRequestErrorType;->REQUEST_TIMED_OUT:Lcom/mapbox/common/HttpRequestErrorType;

    const-string v2, "Request timed out"

    invoke-direct {v0, v1, v2}, Lcom/mapbox/common/HttpRequestError;-><init>(Lcom/mapbox/common/HttpRequestErrorType;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->cancel(Lcom/mapbox/common/HttpRequestError;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public cancel(Lcom/mapbox/common/HttpRequestError;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->callback:Lcom/mapbox/common/module/cronet/UrlCallback;

    invoke-virtual {v0, p1}, Lcom/mapbox/common/module/cronet/UrlCallback;->setCancelReason(Lcom/mapbox/common/HttpRequestError;)V

    :cond_0
    iget-object p1, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->request:Lorg/chromium/net/UrlRequest;

    invoke-virtual {p1}, Lorg/chromium/net/UrlRequest;->cancel()V

    return-void
.end method

.method public start()V
    .locals 5

    iget-wide v0, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->timeoutSeconds:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-static {}, Lcom/mapbox/common/module/cronet/CronetRequestDetailKt;->access$getExecutor$p()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/m;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iget-wide v2, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->timeoutSeconds:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    iget-object v0, p0, Lcom/mapbox/common/module/cronet/CronetRequestDetail;->request:Lorg/chromium/net/UrlRequest;

    invoke-virtual {v0}, Lorg/chromium/net/UrlRequest;->start()V

    return-void
.end method
