.class final Llive/hms/video/sdk/SDKDelegate$leave$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->leave(ZLq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.SDKDelegate$leave$2"
    f = "SDKDelegate.kt"
    l = {
        0x70e,
        0x711,
        0x715
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $notifyServer:Z

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Z",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$leave$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-boolean p2, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->$notifyServer:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$leave$2;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-boolean v2, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->$notifyServer:Z

    invoke-direct {v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$leave$2;-><init>(Llive/hms/video/sdk/SDKDelegate;ZLq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$leave$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$leave$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$leave$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$leave$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v1}, Llive/hms/video/sdk/SDKDelegate;->access$isLeaveInProgressAtomic$p(Llive/hms/video/sdk/SDKDelegate;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    const-string v1, "SDKDelegate"

    const-string v6, "Leave initiated ..."

    invoke-static {v1, v6}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKDelegate;->isScreenShared()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    :try_start_2
    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    iput v5, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->label:I

    invoke-static {v1, p0}, Llive/hms/video/utils/HmsExtensionKt;->stopScreenShareSuspend(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v0, :cond_4

    goto :goto_4

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_4
    :goto_1
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKDelegate;->isAudioShared()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    :try_start_3
    iput-object v2, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->label:I

    invoke-static {p1, p0}, Llive/hms/video/utils/HmsExtensionKt;->stopAudioShareSuspend(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v0, :cond_5

    goto :goto_4

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_5
    :goto_3
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getWebrtcStatsMonitor$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/connection/degredation/WebRtcStatsMonitor;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/connection/degredation/WebRtcStatsMonitor;->forcePublishStats()V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$clearPluginPendingState(Llive/hms/video/sdk/SDKDelegate;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-boolean v1, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->$notifyServer:Z

    iput-object v2, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->L$0:Ljava/lang/Object;

    iput v3, p0, Llive/hms/video/sdk/SDKDelegate$leave$2;->label:I

    invoke-static {p1, v1, p0}, Llive/hms/video/sdk/SDKDelegate;->access$leaveMeeting(Llive/hms/video/sdk/SDKDelegate;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_4
    return-object v0

    :cond_6
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
