.class public final Llive/hms/video/media/tracks/HMSRemoteAudioTrack;
.super Llive/hms/video/media/tracks/HMSAudioTrack;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/tracks/HMSRemoteTrack;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/tracks/HMSRemoteAudioTrack$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0016\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B+\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R$\u0010$\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\u0011\u00a8\u0006("
    }
    d2 = {
        "Llive/hms/video/media/tracks/HMSRemoteAudioTrack;",
        "Llive/hms/video/media/tracks/HMSAudioTrack;",
        "Llive/hms/video/media/tracks/HMSRemoteTrack;",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "stream",
        "Lhms/webrtc/AudioTrack;",
        "nativeTrack",
        "",
        "source",
        "",
        "ssrc",
        "<init>",
        "(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;J)V",
        "",
        "isEnabled",
        "Ll83/a0;",
        "setExpectedLayer",
        "(Z)V",
        "",
        "getVolume",
        "()D",
        "value",
        "setVolume",
        "(D)V",
        "toString",
        "()Ljava/lang/String;",
        "Llive/hms/video/media/streams/HMSRemoteStream;",
        "getStream$lib_release",
        "()Llive/hms/video/media/streams/HMSRemoteStream;",
        "J",
        "getSsrc",
        "()J",
        "setSsrc",
        "(J)V",
        "volume",
        "D",
        "isPlaybackAllowed",
        "()Z",
        "setPlaybackAllowed",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/media/tracks/HMSRemoteAudioTrack$Companion;

.field public static final TAG:Ljava/lang/String; = "HMSRemoteAudioTrack"


# instance fields
.field private ssrc:J

.field private final stream:Llive/hms/video/media/streams/HMSRemoteStream;

.field private volume:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->Companion:Llive/hms/video/media/tracks/HMSRemoteAudioTrack$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;J)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeTrack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/tracks/HMSAudioTrack;-><init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->stream:Llive/hms/video/media/streams/HMSRemoteStream;

    .line 5
    iput-wide p4, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->ssrc:J

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 6
    iput-wide p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->volume:D

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    .line 1
    const-string p3, "regular"

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;-><init>(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/AudioTrack;Ljava/lang/String;J)V

    return-void
.end method

.method public static final synthetic access$setEnabled$lib_release$s2113781155(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Llive/hms/video/media/tracks/HMSTrack;->setEnabled$lib_release(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final setExpectedLayer(Z)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$setExpectedLayer$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public getSsrc()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->ssrc:J

    return-wide v0
.end method

.method public bridge synthetic getStream$lib_release()Llive/hms/video/media/streams/HMSMediaStream;
    .locals 1

    .line 1
    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->getStream$lib_release()Llive/hms/video/media/streams/HMSRemoteStream;

    move-result-object v0

    return-object v0
.end method

.method public getStream$lib_release()Llive/hms/video/media/streams/HMSRemoteStream;
    .locals 1

    .line 2
    iget-object v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->stream:Llive/hms/video/media/streams/HMSRemoteStream;

    return-object v0
.end method

.method public final getVolume()D
    .locals 2

    iget-wide v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->volume:D

    return-wide v0
.end method

.method public isPlaybackAllowed()Z
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->isEnabled$lib_release()Z

    move-result v0

    return v0
.end method

.method public setPlaybackAllowed(Z)V
    .locals 3

    sget-object v0, Llive/hms/video/utils/HMSCoroutineScope;->INSTANCE:Llive/hms/video/utils/HMSCoroutineScope;

    new-instance v1, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$isPlaybackAllowed$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack$isPlaybackAllowed$1;-><init>(Llive/hms/video/media/tracks/HMSRemoteAudioTrack;ZLq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public setSsrc(J)V
    .locals 0

    iput-wide p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->ssrc:J

    return-void
.end method

.method public final setVolume(D)V
    .locals 5

    iget-wide v0, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->volume:D

    const-wide/16 v2, 0x0

    cmpg-double v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    cmpg-double v4, p1, v2

    if-nez v4, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->setExpectedLayer(Z)V

    goto :goto_1

    :cond_1
    :goto_0
    cmpg-double v0, v0, v2

    if-nez v0, :cond_2

    cmpl-double v0, p1, v2

    if-lez v0, :cond_2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->setExpectedLayer(Z)V

    :cond_2
    :goto_1
    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type hms.webrtc.AudioTrack"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhms/webrtc/AudioTrack;

    invoke-virtual {v0, p1, p2}, Lhms/webrtc/AudioTrack;->setVolume(D)V

    iput-wide p1, p0, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->volume:D

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSRemoteAudioTrack{trackId="

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
