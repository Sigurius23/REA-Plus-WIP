.class public final Lr82/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr82/a$a;,
        Lr82/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u0000 \u00152\u00020\u0001:\u0002!#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010)R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lr82/a;",
        "",
        "Ltr2/n;",
        "logger",
        "Liy1/c;",
        "metricWriter",
        "Landroid/net/ConnectivityManager;",
        "connectivityManager",
        "Lbc3/c0;",
        "coroutineScope",
        "Lca2/h;",
        "rawDataTrackingService",
        "Lst0/r;",
        "strapLockStateTracker",
        "<init>",
        "(Ltr2/n;Liy1/c;Landroid/net/ConnectivityManager;Lbc3/c0;Lca2/h;Lst0/r;)V",
        "",
        "throughputBytesPerSecond",
        "",
        "networkType",
        "Ll83/a0;",
        "g",
        "(ILjava/lang/String;)V",
        "f",
        "()Ljava/lang/String;",
        "Ljava/io/File;",
        "exportedFile",
        "Lr82/a$b;",
        "h",
        "(Ljava/io/File;)Lr82/a$b;",
        "session",
        "e",
        "(Lr82/a$b;)V",
        "a",
        "Ltr2/n;",
        "b",
        "Liy1/c;",
        "c",
        "Landroid/net/ConnectivityManager;",
        "d",
        "Lbc3/c0;",
        "Lca2/h;",
        "Lst0/r;",
        "sensor-data-upload_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final g:Lr82/a$a;


# instance fields
.field private final a:Ltr2/n;

.field private final b:Liy1/c;

.field private final c:Landroid/net/ConnectivityManager;

.field private final d:Lbc3/c0;

.field private final e:Lca2/h;

.field private final f:Lst0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr82/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr82/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr82/a;->g:Lr82/a$a;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Liy1/c;Landroid/net/ConnectivityManager;Lbc3/c0;Lca2/h;Lst0/r;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawDataTrackingService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapLockStateTracker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr82/a;->a:Ltr2/n;

    iput-object p2, p0, Lr82/a;->b:Liy1/c;

    iput-object p3, p0, Lr82/a;->c:Landroid/net/ConnectivityManager;

    iput-object p4, p0, Lr82/a;->d:Lbc3/c0;

    iput-object p5, p0, Lr82/a;->e:Lca2/h;

    iput-object p6, p0, Lr82/a;->f:Lst0/r;

    return-void
.end method

.method public static final synthetic a(Lr82/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lr82/a;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lr82/a;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lr82/a;->b:Liy1/c;

    return-object p0
.end method

.method public static final synthetic c(Lr82/a;)Lca2/h;
    .locals 0

    iget-object p0, p0, Lr82/a;->e:Lca2/h;

    return-object p0
.end method

.method public static final synthetic d(Lr82/a;)Lst0/r;
    .locals 0

    iget-object p0, p0, Lr82/a;->f:Lst0/r;

    return-object p0
.end method

.method private final f()Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    const-string v0, "unknown"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lr82/a;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v2

    iget-object v3, p0, Lr82/a;->c:Landroid/net/ConnectivityManager;

    invoke-virtual {v3, v2}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v2

    if-nez v2, :cond_0

    return-object v0

    :cond_0
    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v0, "wifi"

    return-object v0

    :catch_0
    move-exception v2

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v1}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v0, "cellular"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object v0

    :goto_0
    iget-object v3, p0, Lr82/a;->a:Ltr2/n;

    const-string v4, "Failed to determine network type"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v3, v4, v2, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v0
.end method

.method private final g(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lr82/a;->d:Lbc3/c0;

    new-instance v1, Lr82/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lr82/a$c;-><init>(Lr82/a;Ljava/lang/String;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final e(Lr82/a$b;)V
    .locals 10

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Lr82/a$b;->c()J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    const-wide/16 v2, 0x0

    cmpg-double v2, v0, v2

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    iget-object p1, p0, Lr82/a;->a:Ltr2/n;

    const-string v0, "Upload duration was 0 or negative, skipping throughput calculation"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lr82/a$b;->a()J

    move-result-wide v4

    long-to-double v4, v4

    div-double/2addr v4, v0

    iget-object v2, p0, Lr82/a;->a:Ltr2/n;

    invoke-virtual {p1}, Lr82/a$b;->a()J

    move-result-wide v6

    const-string v8, "Upload completed - Size: "

    const-string v9, " bytes, Duration: "

    invoke-static {v6, v7, v8, v9}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, "s, Throughput: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " bytes/sec"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v4, v5}, Le93/b;->W(D)I

    move-result v0

    invoke-virtual {p1}, Lr82/a$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lr82/a;->g(ILjava/lang/String;)V

    return-void
.end method

.method public final h(Ljava/io/File;)Lr82/a$b;
    .locals 7

    const-string v0, "exportedFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    iget-object v0, p0, Lr82/a;->a:Ltr2/n;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Starting upload tracking for file: "

    const-string v6, ", size: "

    invoke-static {v1, p1, v4, v5, v6}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, " bytes"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lr82/a$b;

    invoke-direct {p0}, Lr82/a;->f()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lr82/a$b;-><init>(JJLjava/lang/String;)V

    return-object v1
.end method
