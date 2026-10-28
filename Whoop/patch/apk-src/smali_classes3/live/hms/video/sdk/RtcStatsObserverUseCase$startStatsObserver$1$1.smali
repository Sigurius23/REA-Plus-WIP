.class final Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $bundleToStats:Llive/hms/video/sdk/BundleToStatsObserver;

.field final synthetic $nullCheckedObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

.field final synthetic this$0:Llive/hms/video/sdk/RtcStatsObserverUseCase;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/BundleToStatsObserver;Llive/hms/video/connection/stats/HMSStatsObserver;Llive/hms/video/sdk/RtcStatsObserverUseCase;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->$bundleToStats:Llive/hms/video/sdk/BundleToStatsObserver;

    iput-object p2, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->$nullCheckedObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

    iput-object p3, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->this$0:Llive/hms/video/sdk/RtcStatsObserverUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Llive/hms/video/sdk/RtcStatsObserverUseCase;)Llive/hms/video/sdk/models/HMSLocalPeer;
    .locals 0

    invoke-static {p0}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->emit$lambda$2(Llive/hms/video/sdk/RtcStatsObserverUseCase;)Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->emit$lambda$0(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->emit$lambda$1(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p0

    return-object p0
.end method

.method private static final emit$lambda$0(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/sdk/RtcStatsObserverUseCase;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p0

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/SDKStore;->getNativeTrackById(Ljava/lang/String;)Llive/hms/video/media/tracks/HMSTrack;

    move-result-object p0

    return-object p0
.end method

.method private static final emit$lambda$1(Llive/hms/video/sdk/RtcStatsObserverUseCase;Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/sdk/RtcStatsObserverUseCase;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p0

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/SDKStore;->getPeerByTrackId(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object p0

    return-object p0
.end method

.method private static final emit$lambda$2(Llive/hms/video/sdk/RtcStatsObserverUseCase;)Llive/hms/video/sdk/models/HMSLocalPeer;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/sdk/RtcStatsObserverUseCase;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p0

    invoke-virtual {p0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/connection/degredation/StatsBundle;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->emit(Llive/hms/video/connection/degredation/StatsBundle;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final emit(Llive/hms/video/connection/degredation/StatsBundle;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/degredation/StatsBundle;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->$bundleToStats:Llive/hms/video/sdk/BundleToStatsObserver;

    .line 3
    iget-object v2, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->$nullCheckedObserver:Llive/hms/video/connection/stats/HMSStatsObserver;

    .line 4
    iget-object p2, p0, Llive/hms/video/sdk/RtcStatsObserverUseCase$startStatsObserver$1$1;->this$0:Llive/hms/video/sdk/RtcStatsObserverUseCase;

    new-instance v3, Llive/hms/video/sdk/a;

    const/4 v1, 0x0

    invoke-direct {v3, p2, v1}, Llive/hms/video/sdk/a;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Llive/hms/video/sdk/a;

    const/4 v1, 0x1

    invoke-direct {v4, p2, v1}, Llive/hms/video/sdk/a;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Llive/hms/video/sdk/b;

    const/4 v1, 0x0

    invoke-direct {v5, p2, v1}, Llive/hms/video/sdk/b;-><init>(Ljava/lang/Object;I)V

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/sdk/BundleToStatsObserver;->convertBundleToStatsObserverEvents(Llive/hms/video/connection/degredation/StatsBundle;Llive/hms/video/connection/stats/HMSStatsObserver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    .line 5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
