.class public Lhms/webrtc/AudioSource;
.super Lhms/webrtc/MediaSource;
.source "SourceFile"


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/MediaSource;-><init>(J)V

    return-void
.end method


# virtual methods
.method public getNativeAudioSource()J
    .locals 2

    invoke-virtual {p0}, Lhms/webrtc/MediaSource;->getNativeMediaSource()J

    move-result-wide v0

    return-wide v0
.end method
