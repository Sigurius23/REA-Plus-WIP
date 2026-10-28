.class public final Llive/hms/video/sdk/models/PeerListIterator$next$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/FindPeerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/models/PeerListIterator;->next(Llive/hms/video/sdk/listeners/PeerListResultListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/sdk/models/PeerListIterator$next$1$2",
        "Llive/hms/video/sdk/FindPeerListener;",
        "Llive/hms/video/sdk/models/FindPeerResponse;",
        "result",
        "Ll83/a0;",
        "onResult",
        "(Llive/hms/video/sdk/models/FindPeerResponse;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
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
.field final synthetic $it:Llive/hms/video/sdk/IPeerListIterator;

.field final synthetic $peerListResultListener:Llive/hms/video/sdk/listeners/PeerListResultListener;

.field final synthetic this$0:Llive/hms/video/sdk/models/PeerListIterator;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/PeerListIterator;Llive/hms/video/sdk/listeners/PeerListResultListener;Llive/hms/video/sdk/IPeerListIterator;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->this$0:Llive/hms/video/sdk/models/PeerListIterator;

    iput-object p2, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->$peerListResultListener:Llive/hms/video/sdk/listeners/PeerListResultListener;

    iput-object p3, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->$it:Llive/hms/video/sdk/IPeerListIterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->$peerListResultListener:Llive/hms/video/sdk/listeners/PeerListResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    return-void
.end method

.method public onResult(Llive/hms/video/sdk/models/FindPeerResponse;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->this$0:Llive/hms/video/sdk/models/PeerListIterator;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FindPeerResponse;->getEof()Z

    move-result v1

    invoke-static {v0, v1}, Llive/hms/video/sdk/models/PeerListIterator;->access$setEof$p(Llive/hms/video/sdk/models/PeerListIterator;Z)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->this$0:Llive/hms/video/sdk/models/PeerListIterator;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FindPeerResponse;->getLimit()I

    move-result v1

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PeerListIterator;->setLimit(I)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->this$0:Llive/hms/video/sdk/models/PeerListIterator;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FindPeerResponse;->getTotal()I

    move-result v1

    invoke-virtual {v0, v1}, Llive/hms/video/sdk/models/PeerListIterator;->setTotalCount(I)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->$peerListResultListener:Llive/hms/video/sdk/listeners/PeerListResultListener;

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;->$it:Llive/hms/video/sdk/IPeerListIterator;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FindPeerResponse;->getPeers()Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {v1, p1}, Llive/hms/video/sdk/IPeerListIterator;->convertToHMSPeer(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/listeners/PeerListResultListener;->onSuccess(Ljava/util/ArrayList;)V

    return-void
.end method
