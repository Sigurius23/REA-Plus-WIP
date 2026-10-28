.class public interface abstract Llive/hms/video/sdk/HMSPreviewListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/IErrorListener;
.implements Llive/hms/video/sdk/RequestPermissionInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/HMSPreviewListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J%\u0010\t\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JG\u0010\u0019\u001a\u00020\u00082\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00162\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "Llive/hms/video/sdk/IErrorListener;",
        "Llive/hms/video/sdk/RequestPermissionInterface;",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "room",
        "",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "localTracks",
        "Ll83/a0;",
        "onPreview",
        "(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V",
        "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "type",
        "hmsRoom",
        "onRoomUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V",
        "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peer",
        "onPeerUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "addedPeers",
        "removedPeers",
        "peerListUpdated",
        "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
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
.method public abstract onPeerUpdate(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V
.end method

.method public abstract onPreview(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V
.end method

.method public abstract onRoomUpdate(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V
.end method

.method public abstract peerListUpdated(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;)V"
        }
    .end annotation
.end method
