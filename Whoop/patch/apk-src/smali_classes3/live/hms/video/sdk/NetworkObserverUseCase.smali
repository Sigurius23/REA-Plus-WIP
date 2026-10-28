.class public final Llive/hms/video/sdk/NetworkObserverUseCase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020#8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Llive/hms/video/sdk/NetworkObserverUseCase;",
        "Ljava/io/Closeable;",
        "Lec3/t1;",
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "statsFlow",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Lkotlin/Function0;",
        "",
        "hasJoined",
        "<init>",
        "(Lec3/t1;Llive/hms/video/sdk/SDKStore;Lc93/a;)V",
        "Llive/hms/video/connection/stats/quality/HMSNetworkObserver;",
        "observer",
        "Ll83/a0;",
        "addNetworkObserver",
        "(Llive/hms/video/connection/stats/quality/HMSNetworkObserver;)V",
        "startNetworkObserver",
        "()V",
        "close",
        "Lec3/t1;",
        "getStatsFlow",
        "()Lec3/t1;",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "Lc93/a;",
        "networkObserver",
        "Llive/hms/video/connection/stats/quality/HMSNetworkObserver;",
        "Lbc3/c0;",
        "networkObserverScope",
        "Lbc3/c0;",
        "Lbc3/k1;",
        "qualityObserverJob",
        "Lbc3/k1;",
        "Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;",
        "networkQualityCalculator$delegate",
        "Ll83/h;",
        "getNetworkQualityCalculator",
        "()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;",
        "networkQualityCalculator",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final hasJoined:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private networkObserver:Llive/hms/video/connection/stats/quality/HMSNetworkObserver;

.field private networkObserverScope:Lbc3/c0;

.field private final networkQualityCalculator$delegate:Ll83/h;

.field private qualityObserverJob:Lbc3/k1;

.field private final statsFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Lec3/t1;Llive/hms/video/sdk/SDKStore;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/t1;",
            "Llive/hms/video/sdk/SDKStore;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "statsFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hasJoined"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->statsFlow:Lec3/t1;

    iput-object p2, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    iput-object p3, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->hasJoined:Lc93/a;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserverScope:Lbc3/c0;

    new-instance p1, Llh1/a;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Llh1/a;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkQualityCalculator$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic b()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;
    .locals 1

    invoke-static {}, Llive/hms/video/sdk/NetworkObserverUseCase;->networkQualityCalculator_delegate$lambda$0()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;

    move-result-object v0

    return-object v0
.end method

.method private static final networkQualityCalculator_delegate$lambda$0()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;
    .locals 1

    new-instance v0, Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;

    invoke-direct {v0}, Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final addNetworkObserver(Llive/hms/video/connection/stats/quality/HMSNetworkObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserver:Llive/hms/video/connection/stats/quality/HMSNetworkObserver;

    iget-object p1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->hasJoined:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Llive/hms/video/sdk/NetworkObserverUseCase;->startNetworkObserver()V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->qualityObserverJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserverScope:Lbc3/c0;

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iput-object v1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserver:Llive/hms/video/connection/stats/quality/HMSNetworkObserver;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserverScope:Lbc3/c0;

    return-void
.end method

.method public final getNetworkQualityCalculator()Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkQualityCalculator$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/connection/stats/quality/NetworkQualityCalculator;

    return-object v0
.end method

.method public final getStatsFlow()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->statsFlow:Lec3/t1;

    return-object v0
.end method

.method public final getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public final startNetworkObserver()V
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserver:Llive/hms/video/connection/stats/quality/HMSNetworkObserver;

    if-eqz v0, :cond_1

    iget-object v1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->qualityObserverJob:Lbc3/k1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v1, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->networkObserverScope:Lbc3/c0;

    new-instance v3, Llive/hms/video/sdk/NetworkObserverUseCase$startNetworkObserver$1;

    invoke-direct {v3, p0, v0, v2}, Llive/hms/video/sdk/NetworkObserverUseCase$startNetworkObserver$1;-><init>(Llive/hms/video/sdk/NetworkObserverUseCase;Llive/hms/video/connection/stats/quality/HMSNetworkObserver;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v2, v2, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/sdk/NetworkObserverUseCase;->qualityObserverJob:Lbc3/k1;

    :cond_1
    return-void
.end method
