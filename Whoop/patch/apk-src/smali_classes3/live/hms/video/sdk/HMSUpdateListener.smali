.class public interface abstract Llive/hms/video/sdk/HMSUpdateListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/IErrorListener;
.implements Llive/hms/video/sdk/RequestPermissionInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/HMSUpdateListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0003H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010\'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H&\u00a2\u0006\u0004\u0008+\u0010,JG\u00101\u001a\u00020\u00052\u001a\u0010/\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010-j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`.2\u001a\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010-j\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`.H\u0016\u00a2\u0006\u0004\u00081\u00102J\u0017\u00105\u001a\u00020\u00052\u0006\u00104\u001a\u000203H\u0016\u00a2\u0006\u0004\u00085\u00106J\u0017\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u000207H\u0016\u00a2\u0006\u0004\u00089\u0010:\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/sdk/HMSUpdateListener;",
        "Llive/hms/video/sdk/IErrorListener;",
        "Llive/hms/video/sdk/RequestPermissionInterface;",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "room",
        "Ll83/a0;",
        "onJoin",
        "(Llive/hms/video/sdk/models/HMSRoom;)V",
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
        "Llive/hms/video/sdk/models/enums/HMSTrackUpdate;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onTrackUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V",
        "Llive/hms/video/sdk/models/HMSRoleChangeRequest;",
        "request",
        "onRoleChangeRequest",
        "(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V",
        "Llive/hms/video/sdk/models/HMSMessage;",
        "message",
        "onMessageReceived",
        "(Llive/hms/video/sdk/models/HMSMessage;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onReconnecting",
        "(Llive/hms/video/error/HMSException;)V",
        "onReconnected",
        "()V",
        "Llive/hms/video/sdk/models/HMSRemovedFromRoom;",
        "notification",
        "onRemovedFromRoom",
        "(Llive/hms/video/sdk/models/HMSRemovedFromRoom;)V",
        "Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;",
        "details",
        "onChangeTrackStateRequest",
        "(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "addedPeers",
        "removedPeers",
        "peerListUpdated",
        "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V",
        "Llive/hms/video/sessionstore/HmsSessionStore;",
        "sessionStore",
        "onSessionStoreAvailable",
        "(Llive/hms/video/sessionstore/HmsSessionStore;)V",
        "Llive/hms/video/sdk/transcripts/HmsTranscripts;",
        "transcripts",
        "onTranscripts",
        "(Llive/hms/video/sdk/transcripts/HmsTranscripts;)V",
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
.method public abstract onChangeTrackStateRequest(Llive/hms/video/sdk/models/trackchangerequest/HMSChangeTrackStateRequest;)V
.end method

.method public abstract onJoin(Llive/hms/video/sdk/models/HMSRoom;)V
.end method

.method public abstract onMessageReceived(Llive/hms/video/sdk/models/HMSMessage;)V
.end method

.method public abstract onPeerUpdate(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V
.end method

.method public abstract onReconnected()V
.end method

.method public abstract onReconnecting(Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onRemovedFromRoom(Llive/hms/video/sdk/models/HMSRemovedFromRoom;)V
.end method

.method public abstract onRoleChangeRequest(Llive/hms/video/sdk/models/HMSRoleChangeRequest;)V
.end method

.method public abstract onRoomUpdate(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V
.end method

.method public abstract onSessionStoreAvailable(Llive/hms/video/sessionstore/HmsSessionStore;)V
.end method

.method public abstract onTrackUpdate(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V
.end method

.method public abstract onTranscripts(Llive/hms/video/sdk/transcripts/HmsTranscripts;)V
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
