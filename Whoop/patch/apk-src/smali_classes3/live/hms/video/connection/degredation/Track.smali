.class public abstract Llive/hms/video/connection/degredation/Track;
.super Llive/hms/video/connection/degredation/WebrtcStats;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/degredation/Track$LocalTrack;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0001\u0010B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/Track;",
        "Llive/hms/video/connection/degredation/WebrtcStats;",
        "<init>",
        "()V",
        "bytesTransported",
        "Ljava/math/BigInteger;",
        "getBytesTransported",
        "()Ljava/math/BigInteger;",
        "trackIdentifier",
        "",
        "getTrackIdentifier",
        "()Ljava/lang/String;",
        "remoteTimestamp",
        "",
        "getRemoteTimestamp",
        "()Ljava/lang/Double;",
        "LocalTrack",
        "Llive/hms/video/connection/degredation/RemoteTrack;",
        "Llive/hms/video/connection/degredation/Track$LocalTrack;",
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
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/WebrtcStats;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/connection/degredation/Track;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getBytesTransported()Ljava/math/BigInteger;
.end method

.method public abstract getRemoteTimestamp()Ljava/lang/Double;
.end method

.method public abstract getTrackIdentifier()Ljava/lang/String;
.end method
