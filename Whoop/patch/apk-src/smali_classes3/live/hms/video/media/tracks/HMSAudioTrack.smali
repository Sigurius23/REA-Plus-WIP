.class public Llive/hms/video/media/tracks/HMSAudioTrack;
.super Llive/hms/video/media/tracks/HMSTrack;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u0014\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/media/tracks/HMSAudioTrack;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "stream",
        "Llive/hms/video/media/streams/HMSMediaStream;",
        "nativeTrack",
        "Lhms/webrtc/AudioTrack;",
        "source",
        "",
        "<init>",
        "(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;)V",
        "type",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "getType",
        "()Llive/hms/video/media/tracks/HMSTrackType;",
        "isDisposed",
        "",
        "isDisposed$lib_release",
        "()Z",
        "setDisposed$lib_release",
        "(Z)V",
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
.field private isDisposed:Z

.field private final type:Llive/hms/video/media/tracks/HMSTrackType;


# direct methods
.method public constructor <init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeTrack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/tracks/HMSTrack;-><init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/MediaStreamTrack;Ljava/lang/String;)V

    .line 4
    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->AUDIO:Llive/hms/video/media/tracks/HMSTrackType;

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSAudioTrack;->type:Llive/hms/video/media/tracks/HMSTrackType;

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    const-string p3, "regular"

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/tracks/HMSAudioTrack;-><init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getType()Llive/hms/video/media/tracks/HMSTrackType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSAudioTrack;->type:Llive/hms/video/media/tracks/HMSTrackType;

    return-object v0
.end method

.method public final isDisposed$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSAudioTrack;->isDisposed:Z

    return v0
.end method

.method public final setDisposed$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSAudioTrack;->isDisposed:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSAudioTrack{trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->isEnabled$lib_release()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
