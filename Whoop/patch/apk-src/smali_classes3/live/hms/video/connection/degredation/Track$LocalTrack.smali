.class public abstract Llive/hms/video/connection/degredation/Track$LocalTrack;
.super Llive/hms/video/connection/degredation/Track;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/connection/degredation/Track;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "LocalTrack"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/degredation/Track$LocalTrack$LocalAudio;,
        Llive/hms/video/connection/degredation/Track$LocalTrack$LocalVideo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\n\u0008&\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u000c\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/connection/degredation/Track$LocalTrack;",
        "Llive/hms/video/connection/degredation/Track;",
        "<init>",
        "()V",
        "ssrc",
        "",
        "getSsrc",
        "()Ljava/lang/Long;",
        "jitter",
        "",
        "getJitter",
        "()Ljava/lang/Double;",
        "packetLoss",
        "getPacketLoss",
        "()J",
        "setPacketLoss",
        "(J)V",
        "LocalAudio",
        "LocalVideo",
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


# instance fields
.field private packetLoss:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/connection/degredation/Track;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public abstract getJitter()Ljava/lang/Double;
.end method

.method public getPacketLoss()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/connection/degredation/Track$LocalTrack;->packetLoss:J

    return-wide v0
.end method

.method public abstract getSsrc()Ljava/lang/Long;
.end method

.method public setPacketLoss(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/connection/degredation/Track$LocalTrack;->packetLoss:J

    return-void
.end method
