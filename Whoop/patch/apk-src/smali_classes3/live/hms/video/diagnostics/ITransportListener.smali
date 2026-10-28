.class public interface abstract Llive/hms/video/diagnostics/ITransportListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0004J!\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001b\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/diagnostics/ITransportListener;",
        "",
        "Ll83/a0;",
        "onInitFetched",
        "()V",
        "",
        "websocketUrl",
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
        "onMediaCaptured",
        "onMediaPublished",
        "Lhms/webrtc/CandidatePairChangeEvent;",
        "event",
        "onSelectedCandidatePairChanged",
        "(Lhms/webrtc/CandidatePairChangeEvent;Z)V",
        "",
        "quality",
        "onNetworkQuality",
        "(I)V",
        "onCompleted",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "onRTCTrackAdded",
        "(Llive/hms/video/media/tracks/HMSTrack;)V",
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


# virtual methods
.method public abstract onCompleted()V
.end method

.method public abstract onError(Llive/hms/video/error/HMSException;)V
.end method

.method public abstract onICEConnected(Z)V
.end method

.method public abstract onIceCandidate(Lhms/webrtc/IceCandidate;Z)V
.end method

.method public abstract onInitFetched()V
.end method

.method public abstract onMediaCaptured()V
.end method

.method public abstract onMediaPublished()V
.end method

.method public abstract onNetworkQuality(I)V
.end method

.method public abstract onRTCTrackAdded(Llive/hms/video/media/tracks/HMSTrack;)V
.end method

.method public abstract onSelectedCandidatePairChanged(Lhms/webrtc/CandidatePairChangeEvent;Z)V
.end method

.method public abstract onWebSocketConnected(Ljava/lang/String;)V
.end method
