.class public interface abstract Llive/hms/video/transport/ITransportObserver;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/transport/ITransportObserver$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u000b\u0010\nJ#\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00042\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010&\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008&\u0010#J\u000f\u0010\'\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\'\u0010#J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H&\u00a2\u0006\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Llive/hms/video/transport/ITransportObserver;",
        "",
        "Lcom/google/gson/JsonObject;",
        "message",
        "Ll83/a0;",
        "onNotification",
        "(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onTrackAdd",
        "(Llive/hms/video/media/tracks/HMSTrack;)V",
        "onTrackRemove",
        "Llive/hms/video/transport/models/TransportState;",
        "state",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onStateChange",
        "(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V",
        "",
        "url",
        "onWebSocketConnected",
        "(Ljava/lang/String;)V",
        "",
        "isPublish",
        "onICEConnected",
        "(Z)V",
        "Lhms/webrtc/IceCandidate;",
        "candidate",
        "onIceCandidate",
        "(Lhms/webrtc/IceCandidate;Z)V",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;Z)V",
        "onInitFetched",
        "()V",
        "onNonFatalError",
        "(Llive/hms/video/error/HMSException;)V",
        "onStopScreenshare",
        "onStopAudioshare",
        "Llive/hms/video/media/tracks/HMSLocalTrack;",
        "localTrack",
        "onTrackMuteChange",
        "(Llive/hms/video/media/tracks/HMSLocalTrack;)V",
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
.method public abstract onICEConnected(Z)V
.end method

.method public abstract onIceCandidate(Lhms/webrtc/IceCandidate;Z)V
.end method

.method public abstract onInitFetched()V
.end method

.method public abstract onNonFatalError(Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onNotification(Lcom/google/gson/JsonObject;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonObject;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Z)V
.end method

.method public abstract onStateChange(Llive/hms/video/transport/models/TransportState;Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onStopAudioshare()V
.end method

.method public abstract onStopScreenshare()V
.end method

.method public abstract onTrackAdd(Llive/hms/video/media/tracks/HMSTrack;)V
.end method

.method public abstract onTrackMuteChange(Llive/hms/video/media/tracks/HMSLocalTrack;)V
.end method

.method public abstract onTrackRemove(Llive/hms/video/media/tracks/HMSTrack;)V
.end method

.method public abstract onWebSocketConnected(Ljava/lang/String;)V
.end method
