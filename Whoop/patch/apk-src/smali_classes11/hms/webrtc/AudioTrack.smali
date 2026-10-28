.class public Lhms/webrtc/AudioTrack;
.super Lhms/webrtc/MediaStreamTrack;
.source "SourceFile"


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lhms/webrtc/MediaStreamTrack;-><init>(J)V

    return-void
.end method

.method private static native nativeSetVolume(JD)V
.end method


# virtual methods
.method public getNativeAudioTrack()J
    .locals 2

    invoke-virtual {p0}, Lhms/webrtc/MediaStreamTrack;->getNativeMediaStreamTrack()J

    move-result-wide v0

    return-wide v0
.end method

.method public setVolume(D)V
    .locals 2

    invoke-virtual {p0}, Lhms/webrtc/AudioTrack;->getNativeAudioTrack()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lhms/webrtc/AudioTrack;->nativeSetVolume(JD)V

    return-void
.end method
