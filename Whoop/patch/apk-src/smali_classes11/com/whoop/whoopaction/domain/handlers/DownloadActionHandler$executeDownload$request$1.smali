.class public final Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz02/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler;->e(Lcom/whoop/whoopaction/domain/models/DownloadAction;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz02/a<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001c\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0004\u001a\u0004\u0008\r\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0004\u001a\u0004\u0008\u001e\u0010\u0006\u00a8\u0006\u001f"
    }
    d2 = {
        "com/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1",
        "Lz02/a;",
        "",
        "path",
        "Ljava/lang/String;",
        "getPath",
        "()Ljava/lang/String;",
        "Li63/t;",
        "method",
        "Li63/t;",
        "getMethod",
        "()Li63/t;",
        "body",
        "getBody",
        "",
        "hasBody",
        "Z",
        "getHasBody",
        "()Z",
        "",
        "headers",
        "Ljava/util/Map;",
        "getHeaders",
        "()Ljava/util/Map;",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "httpTimeoutConfig",
        "Lcom/whoop/network/request/HttpTimeoutConfig;",
        "getHttpTimeoutConfig",
        "()Lcom/whoop/network/request/HttpTimeoutConfig;",
        "tag",
        "getTag",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final body:Ljava/lang/String;

.field private final hasBody:Z

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

.field private final method:Li63/t;

.field private final path:Ljava/lang/String;

.field private final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/DownloadAction;)V
    .locals 11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->path:Ljava/lang/String;

    sget-object v0, Li63/t;->b:Li63/t;

    sget-object v0, Li63/t;->b:Li63/t;

    iput-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->method:Li63/t;

    sget-object v0, Li63/r;->a:Ljava/util/List;

    const-string v0, "Accept"

    const-string v1, "*/*"

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->headers:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    new-instance v2, Lcom/whoop/network/request/HttpTimeoutConfig;

    const/4 v9, 0x3

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/network/request/HttpTimeoutConfig;-><init>(JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    iput-object v2, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/DownloadAction;->getMetricEvent()Lcom/whoop/analytics/MetricEventModel;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/analytics/MetricEventModel;->getRequestName()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->tag:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic getBody()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->getBody()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->body:Ljava/lang/String;

    return-object v0
.end method

.method public getHasBody()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->hasBody:Z

    return v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getHttpTimeoutConfig()Lcom/whoop/network/request/HttpTimeoutConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->httpTimeoutConfig:Lcom/whoop/network/request/HttpTimeoutConfig;

    return-object v0
.end method

.method public getMethod()Li63/t;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->method:Li63/t;

    return-object v0
.end method

.method public bridge getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lz02/a;->getParameters()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/handlers/DownloadActionHandler$executeDownload$request$1;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public bridge url(Lsr2/y;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lz02/a;->url(Lsr2/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
