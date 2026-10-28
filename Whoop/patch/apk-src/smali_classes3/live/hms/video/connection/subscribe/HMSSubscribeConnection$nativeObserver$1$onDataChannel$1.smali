.class final Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->onDataChannel(Lhms/webrtc/DataChannel;)V
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
    c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onDataChannel$1"
    f = "HMSSubscribeConnection.kt"
    l = {
        0x50,
        0x6a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $dataChannel:Lhms/webrtc/DataChannel;

.field final synthetic $observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Lhms/webrtc/DataChannel;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
            "Lhms/webrtc/DataChannel;",
            "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iput-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$dataChannel:Lhms/webrtc/DataChannel;

    iput-object p3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;

    iget-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$dataChannel:Lhms/webrtc/DataChannel;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Lhms/webrtc/DataChannel;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Llive/hms/video/connection/HMSDataChannel;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {p1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "HMSSubscribeConnection"

    const-string v0, "Ignoring onDataChannel as connection is closed"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v4

    :cond_3
    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$dataChannel:Lhms/webrtc/DataChannel;

    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->label()Ljava/lang/String;

    move-result-object p1

    const-string v1, "ion-sfu"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$dataChannel:Lhms/webrtc/DataChannel;

    iput v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->label:I

    invoke-interface {p1, v1, p0}, Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;->onDataChannel(Lhms/webrtc/DataChannel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    return-object v4

    :cond_5
    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    new-instance v1, Llive/hms/video/connection/HMSDataChannel;

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$dataChannel:Lhms/webrtc/DataChannel;

    new-instance v5, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;

    iget-object v6, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v7, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    invoke-direct {v5, v6, v7}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "role="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {v7}, Llive/hms/video/connection/HMSConnection;->getRole()Llive/hms/video/connection/models/HMSConnectionRole;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v3, v5, v6}, Llive/hms/video/connection/HMSDataChannel;-><init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V

    iget-object v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-static {v3}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$getDataChannelRequestManager$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;)Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;

    move-result-object v3

    iput-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->L$0:Ljava/lang/Object;

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onDataChannel$1;->label:I

    invoke-virtual {v3, v1, p0}, Llive/hms/video/connection/subscribe/queuemanagement/DataChannelRequestManager;->updateDataChannel(Llive/hms/video/connection/HMSDataChannel;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    move-object v0, p1

    :goto_2
    invoke-static {v0, v1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->access$setApi$p(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/HMSDataChannel;)V

    return-object v4
.end method
