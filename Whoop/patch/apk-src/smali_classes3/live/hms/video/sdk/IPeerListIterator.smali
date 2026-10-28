.class public interface abstract Llive/hms/video/sdk/IPeerListIterator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ-\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\u0008\u0012\u0004\u0012\u00020\u0013`\u00142\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/sdk/IPeerListIterator;",
        "",
        "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "peerListIteratorOptions",
        "Llive/hms/video/sdk/FindPeerListener;",
        "peerListResultListener",
        "Ll83/a0;",
        "findPeers",
        "(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V",
        "",
        "iteratorID",
        "",
        "limit",
        "peerIteratorNext",
        "(Ljava/lang/String;ILlive/hms/video/sdk/FindPeerListener;)V",
        "",
        "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
        "peers",
        "Ljava/util/ArrayList;",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "Lkotlin/collections/ArrayList;",
        "convertToHMSPeer",
        "(Ljava/util/List;)Ljava/util/ArrayList;",
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


# virtual methods
.method public abstract convertToHMSPeer(Ljava/util/List;)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract findPeers(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V
.end method

.method public abstract peerIteratorNext(Ljava/lang/String;ILlive/hms/video/sdk/FindPeerListener;)V
.end method
