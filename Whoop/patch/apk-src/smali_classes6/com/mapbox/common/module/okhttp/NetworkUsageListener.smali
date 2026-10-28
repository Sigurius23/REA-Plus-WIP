.class public Lcom/mapbox/common/module/okhttp/NetworkUsageListener;
.super Lud3/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/module/okhttp/NetworkUsageListener$NetworkUsageMetricCallback;
    }
.end annotation


# static fields
.field public static CALLBACK:Lcom/mapbox/common/module/okhttp/NetworkUsageListener$NetworkUsageMetricCallback; = null

.field public static final FACTORY:Lud3/z;

.field private static final TAG:Ljava/lang/String; = "CommonNetworkUsage"


# instance fields
.field private bytesRequest:J

.field private bytesResponse:J

.field private reported:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc9/g;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lc9/g;-><init>(I)V

    sput-object v0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->FACTORY:Lud3/z;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lzd3/o;)Lud3/a0;
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->lambda$static$0(Lud3/j;)Lud3/a0;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$static$0(Lud3/j;)Lud3/a0;
    .locals 0

    new-instance p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;

    invoke-direct {p0}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;-><init>()V

    return-object p0
.end method

.method private notifyCallback(Lud3/j;)V
    .locals 6

    iget-boolean v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->reported:Z

    if-nez v0, :cond_1

    check-cast p1, Lzd3/o;

    iget-object p1, p1, Lzd3/o;->x:Lud3/o0;

    iget-object p1, p1, Lud3/o0;->a:Lud3/e0;

    iget-object v1, p1, Lud3/e0;->i:Ljava/lang/String;

    sget-object v0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->CALLBACK:Lcom/mapbox/common/module/okhttp/NetworkUsageListener$NetworkUsageMetricCallback;

    if-eqz v0, :cond_0

    :try_start_0
    iget-wide v2, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    iget-wide v4, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    invoke-interface/range {v0 .. v5}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener$NetworkUsageMetricCallback;->onBytesTransferred(Ljava/lang/String;JJ)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    const-string v0, "CommonNetworkUsage"

    const-string v2, "notifyCallback failed: "

    invoke-static {v0, v2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    iget-wide v2, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    long-to-int p1, v2

    iget-wide v2, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    long-to-int v0, v2

    invoke-static {v1, p1, v0}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->notifyInternalMetrics(Ljava/lang/String;II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->reported:Z

    :cond_1
    return-void
.end method

.method public static notifyInternalMetrics(Ljava/lang/String;II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/mapbox/common/NetworkUsageMetricsMeter;->onBytesTransferred(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public callEnd(Lud3/j;)V
    .locals 0

    invoke-super {p0, p1}, Lud3/a0;->callEnd(Lud3/j;)V

    invoke-direct {p0, p1}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->notifyCallback(Lud3/j;)V

    return-void
.end method

.method public callFailed(Lud3/j;Ljava/io/IOException;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lud3/a0;->callFailed(Lud3/j;Ljava/io/IOException;)V

    invoke-direct {p0, p1}, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->notifyCallback(Lud3/j;)V

    return-void
.end method

.method public requestBodyEnd(Lud3/j;J)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lud3/a0;->requestBodyEnd(Lud3/j;J)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    return-void
.end method

.method public requestHeadersEnd(Lud3/j;Lud3/o0;)V
    .locals 7

    invoke-super {p0, p1, p2}, Lud3/a0;->requestHeadersEnd(Lud3/j;Lud3/o0;)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    iget-object p1, p2, Lud3/o0;->c:Lud3/d0;

    iget-object p1, p1, Lud3/d0;->w:[Ljava/lang/String;

    array-length p2, p1

    mul-int/lit8 p2, p2, 0x2

    int-to-long v2, p2

    array-length p2, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p2, :cond_0

    aget-object v5, p1, v4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesRequest:J

    return-void
.end method

.method public responseBodyEnd(Lud3/j;J)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lud3/a0;->responseBodyEnd(Lud3/j;J)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    return-void
.end method

.method public responseHeadersEnd(Lud3/j;Lud3/x0;)V
    .locals 7

    invoke-super {p0, p1, p2}, Lud3/a0;->responseHeadersEnd(Lud3/j;Lud3/x0;)V

    iget-wide v0, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    iget-object p1, p2, Lud3/x0;->F:Lud3/d0;

    iget-object p1, p1, Lud3/d0;->w:[Ljava/lang/String;

    array-length p2, p1

    mul-int/lit8 p2, p2, 0x2

    int-to-long v2, p2

    array-length p2, p1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, p2, :cond_0

    aget-object v5, p1, v4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lcom/mapbox/common/module/okhttp/NetworkUsageListener;->bytesResponse:J

    return-void
.end method
