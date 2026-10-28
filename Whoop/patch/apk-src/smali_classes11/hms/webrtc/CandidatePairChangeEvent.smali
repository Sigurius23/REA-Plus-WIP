.class public final Lhms/webrtc/CandidatePairChangeEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final estimatedDisconnectedTimeMs:I

.field public final lastDataReceivedMs:I

.field public final local:Lhms/webrtc/IceCandidate;

.field public final reason:Ljava/lang/String;

.field public final remote:Lhms/webrtc/IceCandidate;


# direct methods
.method public constructor <init>(Lhms/webrtc/IceCandidate;Lhms/webrtc/IceCandidate;ILjava/lang/String;I)V
    .locals 0
    .annotation build Lhms/webrtc/CalledByNative;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhms/webrtc/CandidatePairChangeEvent;->local:Lhms/webrtc/IceCandidate;

    iput-object p2, p0, Lhms/webrtc/CandidatePairChangeEvent;->remote:Lhms/webrtc/IceCandidate;

    iput p3, p0, Lhms/webrtc/CandidatePairChangeEvent;->lastDataReceivedMs:I

    iput-object p4, p0, Lhms/webrtc/CandidatePairChangeEvent;->reason:Ljava/lang/String;

    iput p5, p0, Lhms/webrtc/CandidatePairChangeEvent;->estimatedDisconnectedTimeMs:I

    return-void
.end method
