.class final Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/degredation/WebRtcStatsMonitor;-><init>(Llive/hms/video/transport/ITransport;JLbc3/c0;Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Llive/hms/video/connection/degredation/StatsBundle;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.connection.degredation.WebRtcStatsMonitor$statsFlow$1"
    f = "WebRtcStatsMonitor.kt"
    l = {
        0x35,
        0x37,
        0x39
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/degredation/WebRtcStatsMonitor;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;

    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-direct {v0, v1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;-><init>(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_0
    move-object p1, v1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    :goto_0
    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-virtual {v1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->isTransportConnected()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    iput-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->label:I

    invoke-static {v1, p0}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->access$retrieveStats(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto :goto_3

    :cond_5
    move-object v7, v1

    move-object v1, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Llive/hms/video/connection/degredation/StatsBundle;

    if-eqz p1, :cond_7

    iput-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->label:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_3

    :cond_6
    move-object v1, p1

    :cond_7
    :goto_2
    iget-object p1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->this$0:Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    invoke-static {p1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->access$getDelayPeriod$p(Llive/hms/video/connection/degredation/WebRtcStatsMonitor;)J

    move-result-wide v5

    iput-object v1, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/connection/degredation/WebRtcStatsMonitor$statsFlow$1;->label:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    :goto_3
    return-object v0
.end method
