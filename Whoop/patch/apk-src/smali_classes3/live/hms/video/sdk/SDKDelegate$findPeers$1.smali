.class final Llive/hms/video/sdk/SDKDelegate$findPeers$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->findPeers(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V
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
    c = "live.hms.video.sdk.SDKDelegate$findPeers$1"
    f = "SDKDelegate.kt"
    l = {
        0x8a3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $listener:Llive/hms/video/sdk/FindPeerListener;

.field final synthetic $peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
            "Llive/hms/video/sdk/FindPeerListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$findPeers$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$listener:Llive/hms/video/sdk/FindPeerListener;

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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$findPeers$1;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$listener:Llive/hms/video/sdk/FindPeerListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$findPeers$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$findPeers$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, p0

    goto :goto_4

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p0

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v3

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    :try_start_2
    invoke-virtual {p1}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->getByGroupName()Ljava/lang/String;

    move-result-object p1
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v4, p1

    goto :goto_0

    :cond_2
    move-object v4, v1

    :goto_0
    :try_start_3
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;
    :try_end_3
    .catch Llive/hms/video/error/HMSException; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz p1, :cond_3

    :try_start_4
    invoke-virtual {p1}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->getByRoleName()Ljava/lang/String;

    move-result-object p1
    :try_end_4
    .catch Llive/hms/video/error/HMSException; {:try_start_4 .. :try_end_4} :catch_0

    move-object v5, p1

    goto :goto_1

    :cond_3
    move-object v5, v1

    :goto_1
    :try_start_5
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;
    :try_end_5
    .catch Llive/hms/video/error/HMSException; {:try_start_5 .. :try_end_5} :catch_2

    if-eqz p1, :cond_4

    :try_start_6
    invoke-virtual {p1}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->getByPeerIds()Ljava/util/ArrayList;

    move-result-object v1
    :try_end_6
    .catch Llive/hms/video/error/HMSException; {:try_start_6 .. :try_end_6} :catch_0

    :cond_4
    move-object v6, v1

    :try_start_7
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;
    :try_end_7
    .catch Llive/hms/video/error/HMSException; {:try_start_7 .. :try_end_7} :catch_2

    if-eqz p1, :cond_5

    :try_start_8
    invoke-virtual {p1}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->getLimit()I

    move-result p1
    :try_end_8
    .catch Llive/hms/video/error/HMSException; {:try_start_8 .. :try_end_8} :catch_0

    :goto_2
    move v7, p1

    goto :goto_3

    :cond_5
    const/16 p1, 0xa

    goto :goto_2

    :goto_3
    :try_start_9
    iput v2, p0, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->label:I
    :try_end_9
    .catch Llive/hms/video/error/HMSException; {:try_start_9 .. :try_end_9} :catch_2

    move-object v8, p0

    :try_start_a
    invoke-interface/range {v3 .. v8}, Llive/hms/video/transport/ITransport;->findPeers(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_4
    check-cast p1, Llive/hms/video/sdk/models/FindPeerResponse;

    iget-object v0, v8, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->access$getPeerListIterator$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/models/PeerListIterator;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FindPeerResponse;->getIteratorId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PeerListIterator;->setIteratorId$lib_release(Ljava/lang/String;)V

    goto :goto_6

    :catch_1
    move-exception v0

    :goto_5
    move-object p1, v0

    goto :goto_7

    :cond_7
    :goto_6
    iget-object v0, v8, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$listener:Llive/hms/video/sdk/FindPeerListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/FindPeerListener;->onResult(Llive/hms/video/sdk/models/FindPeerResponse;)V
    :try_end_a
    .catch Llive/hms/video/error/HMSException; {:try_start_a .. :try_end_a} :catch_1

    goto :goto_8

    :catch_2
    move-exception v0

    move-object v8, p0

    goto :goto_5

    :goto_7
    iget-object v0, v8, Llive/hms/video/sdk/SDKDelegate$findPeers$1;->$listener:Llive/hms/video/sdk/FindPeerListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
