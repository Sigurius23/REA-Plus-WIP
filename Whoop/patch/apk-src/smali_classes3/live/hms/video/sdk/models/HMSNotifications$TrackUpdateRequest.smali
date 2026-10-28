.class public final Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;
.super Llive/hms/video/sdk/models/HMSNotifications;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/sdk/models/HMSNotifications;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TrackUpdateRequest"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;",
        "Llive/hms/video/sdk/models/HMSNotifications;",
        "peerId",
        "",
        "trackid",
        "streamId",
        "isMute",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getPeerId",
        "()Ljava/lang/String;",
        "getTrackid",
        "getStreamId",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final isMute:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "mute"
    .end annotation
.end field

.field private final peerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "requested_by"
    .end annotation
.end field

.field private final streamId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "stream_id"
    .end annotation
.end field

.field private final trackid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "track_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "trackid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/sdk/models/HMSNotifications;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    iput-boolean p4, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;
    .locals 1

    const-string v0, "trackid"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getStreamId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMute()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TrackUpdateRequest(peerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->peerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trackid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->trackid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", streamId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->streamId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isMute="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSNotifications$TrackUpdateRequest;->isMute:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
