.class public final Llive/hms/video/sdk/RtcStatsObserverUseCase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Llive/hms/video/sdk/RtcStatsObserverUseCase;",
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
        "Llive/hms/video/connection/stats/HMSStatsObserver;",
        "observer",
        "Ll83/a0;",
        "addStatsObserver",
        "(Llive/hms/video/connection/stats/HMSStatsObserver;)V",
        "startStatsObserver",
        "()V",
        "close",
        "Lec3/t1;",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "Lc93/a;",
        "statsObserver",
        "Llive/hms/video/connection/stats/HMSStatsObserver;",
        "Lbc3/c0;",
        "statsObserverScope",
        "Lbc3/c0;",
        "Lbc3/k1;",
        "statsObserverJob",
        "Lbc3/k1;",
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

.field private final statsFlow:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field

.field private statsObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

.field private statsObserverJob:Lbc3/k1;

.field private statsObserverScope:Lbc3/c0;

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

    iput-object p1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsFlow:Lec3/t1;

    iput-object p2, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    iput-object p3, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->hasJoined:Lc93/a;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverScope:Lbc3/c0;

    return-void
.end method

.method public static final synthetic access$getStatsFlow$p(Llive/hms/video/sdk/RtcStatsObserverUseCase;)Lec3/t1;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsFlow:Lec3/t1;

    return-object p0
.end method


# virtual methods
.method public final addStatsObserver(Llive/hms/video/connection/stats/HMSStatsObserver;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

    iget-object p1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->hasJoined:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Llive/hms/video/sdk/RtcStatsObserverUseCase;->startStatsObserver()V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverJob:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverScope:Lbc3/c0;

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    iput-object v1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverScope:Lbc3/c0;

    return-void
.end method

.method public final getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public final startStatsObserver()V
    .locals 6

    iget-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

    iget-object v1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    sget-object v4, Llive/hms/video/sdk/featureflags/Features$PUBLISH_STATS;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$PUBLISH_STATS;

    invoke-virtual {v1, v4}, Llive/hms/video/sdk/featureflags/FeatureFlags;->isFeatureEnabled(Llive/hms/video/sdk/featureflags/Features;)Z

    move-result v1

    if-ne v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iget-object v4, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v4}, Llive/hms/video/sdk/SDKStore;->getFeatureFlags()Llive/hms/video/sdk/featureflags/FeatureFlags;

    move-result-object v4

    if-eqz v4, :cond_1

    sget-object v5, Llive/hms/video/sdk/featureflags/Features$SUBSCRIBER_STATS;->INSTANCE:Llive/hms/video/sdk/featureflags/Features$SUBSCRIBER_STATS;

    invoke-virtual {v4, v5}, Llive/hms/video/sdk/featureflags/FeatureFlags;->isFeatureEnabled(Llive/hms/video/sdk/featureflags/Features;)Z

    move-result v4

    if-ne v4, v3, :cond_1

    move v2, v3

    :cond_1
    if-nez v0, :cond_3

    if-nez v1, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    return-void

    :cond_3
    :goto_1
    iget-object v1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverJob:Lbc3/k1;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverScope:Lbc3/c0;

    new-instance v3, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1;

    invoke-direct {v3, p0, v0, v2}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1;-><init>(Llive/hms/video/sdk/RtcStatsObserverUseCase;Llive/hms/video/connection/stats/HMSStatsObserver;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v2, v2, v3, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase;->statsObserverJob:Lbc3/k1;

    return-void
.end method
