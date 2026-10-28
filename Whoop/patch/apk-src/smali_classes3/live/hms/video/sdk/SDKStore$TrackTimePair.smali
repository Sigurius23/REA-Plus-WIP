.class public final Llive/hms/video/sdk/SDKStore$TrackTimePair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/SDKStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrackTimePair"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Llive/hms/video/sdk/SDKStore$TrackTimePair;",
        "",
        "track",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "timestamp",
        "",
        "<init>",
        "(Llive/hms/video/media/tracks/HMSTrack;J)V",
        "getTrack",
        "()Llive/hms/video/media/tracks/HMSTrack;",
        "getTimestamp",
        "()J",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final timestamp:J

.field private final track:Llive/hms/video/media/tracks/HMSTrack;


# direct methods
.method public constructor <init>(Llive/hms/video/media/tracks/HMSTrack;J)V
    .locals 1

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    .line 3
    iput-wide p2, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/tracks/HMSTrack;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/sdk/SDKStore$TrackTimePair;-><init>(Llive/hms/video/media/tracks/HMSTrack;J)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/SDKStore$TrackTimePair;Llive/hms/video/media/tracks/HMSTrack;JILjava/lang/Object;)Llive/hms/video/sdk/SDKStore$TrackTimePair;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    iget-wide p2, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->copy(Llive/hms/video/media/tracks/HMSTrack;J)Llive/hms/video/sdk/SDKStore$TrackTimePair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/media/tracks/HMSTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    return-wide v0
.end method

.method public final copy(Llive/hms/video/media/tracks/HMSTrack;J)Llive/hms/video/sdk/SDKStore$TrackTimePair;
    .locals 1

    const-string v0, "track"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/sdk/SDKStore$TrackTimePair;-><init>(Llive/hms/video/media/tracks/HMSTrack;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    iget-object v3, p1, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    return-wide v0
.end method

.method public final getTrack()Llive/hms/video/media/tracks/HMSTrack;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TrackTimePair(track="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->track:Llive/hms/video/media/tracks/HMSTrack;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/SDKStore$TrackTimePair;->timestamp:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
