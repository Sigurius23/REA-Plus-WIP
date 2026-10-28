.class public abstract Llive/hms/video/connection/degredation/RemoteTrack;
.super Llive/hms/video/connection/degredation/Track;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010 \u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0007\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/connection/degredation/RemoteTrack;",
        "Llive/hms/video/connection/degredation/Track;",
        "<init>",
        "()V",
        "jitter",
        "",
        "getJitter",
        "()Ljava/lang/Double;",
        "jitterBufferDelay",
        "getJitterBufferDelay",
        "packetsLost",
        "",
        "getPacketsLost",
        "()Ljava/lang/Integer;",
        "packetsReceived",
        "",
        "getPacketsReceived",
        "()Ljava/lang/Long;",
        "ssrc",
        "getSsrc",
        "lastPacketReceivedTimestamp",
        "getLastPacketReceivedTimestamp",
        "timestampUs",
        "getTimestampUs",
        "bytesTransported",
        "Ljava/math/BigInteger;",
        "getBytesTransported",
        "()Ljava/math/BigInteger;",
        "trackIdentifier",
        "",
        "getTrackIdentifier",
        "()Ljava/lang/String;",
        "remoteTimestamp",
        "getRemoteTimestamp",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/Track;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public abstract getBytesTransported()Ljava/math/BigInteger;
.end method

.method public abstract getJitter()Ljava/lang/Double;
.end method

.method public abstract getJitterBufferDelay()Ljava/lang/Double;
.end method

.method public abstract getLastPacketReceivedTimestamp()Ljava/lang/Double;
.end method

.method public abstract getPacketsLost()Ljava/lang/Integer;
.end method

.method public abstract getPacketsReceived()Ljava/lang/Long;
.end method

.method public abstract getRemoteTimestamp()Ljava/lang/Double;
.end method

.method public abstract getSsrc()Ljava/lang/Long;
.end method

.method public abstract getTimestampUs()Ljava/lang/Double;
.end method

.method public abstract getTrackIdentifier()Ljava/lang/String;
.end method
