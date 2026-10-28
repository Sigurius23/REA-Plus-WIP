.class final Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;)V
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
    c = "live.hms.video.connection.subscribe.HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1"
    f = "HMSSubscribeConnection.kt"
    l = {
        0xd3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $event:Lhms/webrtc/CandidatePairChangeEvent;

.field final synthetic $observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

.field label:I

.field final synthetic this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection;",
            "Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;",
            "Lhms/webrtc/CandidatePairChangeEvent;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iput-object p2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iput-object p3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$event:Lhms/webrtc/CandidatePairChangeEvent;

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

    new-instance p1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;

    iget-object v0, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iget-object v2, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$event:Lhms/webrtc/CandidatePairChangeEvent;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;-><init>(Llive/hms/video/connection/subscribe/HMSSubscribeConnection;Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->label:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->this$0:Llive/hms/video/connection/subscribe/HMSSubscribeConnection;

    invoke-virtual {p1}, Llive/hms/video/connection/subscribe/HMSSubscribeConnection;->isClose()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "HMSSubscribeConnection"

    const-string v0, "Ignoring onDataChannel as connection is closed"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v2

    :cond_2
    iget-object p1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$observer:Llive/hms/video/connection/subscribe/ISubscribeConnectionObserver;

    iget-object v1, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->$event:Lhms/webrtc/CandidatePairChangeEvent;

    iput v3, p0, Llive/hms/video/connection/subscribe/HMSSubscribeConnection$nativeObserver$1$onSelectedCandidatePairChanged$1;->label:I

    invoke-interface {p1, v1, p0}, Llive/hms/video/connection/IConnectionObserver;->onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    return-object v2
.end method
