.class public Llive/hms/video/media/tracks/HMSVideoTrack;
.super Llive/hms/video/media/tracks/HMSTrack;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR$\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8\u0016@PX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010\u001f\u001a\u0004\u0008\"\u0010!\"\u0004\u0008#\u0010$R\"\u0010%\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008%\u0010\u001f\u001a\u0004\u0008&\u0010!\"\u0004\u0008\'\u0010$\u00a8\u0006("
    }
    d2 = {
        "Llive/hms/video/media/tracks/HMSVideoTrack;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "Llive/hms/video/media/streams/HMSMediaStream;",
        "stream",
        "Lhms/webrtc/VideoTrack;",
        "nativeTrack",
        "",
        "source",
        "<init>",
        "(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;)V",
        "Lhms/webrtc/VideoSink;",
        "sink",
        "Llive/hms/video/sdk/HMSAddSinkResultListener;",
        "resultListener",
        "Ll83/a0;",
        "addSink",
        "(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V",
        "removeSink",
        "(Lhms/webrtc/VideoSink;)V",
        "toString",
        "()Ljava/lang/String;",
        "TAG",
        "Ljava/lang/String;",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "type",
        "Llive/hms/video/media/tracks/HMSTrackType;",
        "getType",
        "()Llive/hms/video/media/tracks/HMSTrackType;",
        "",
        "value",
        "isAdded",
        "Z",
        "isAdded$lib_release",
        "()Z",
        "isDegraded",
        "setDegraded$lib_release",
        "(Z)V",
        "isDisposed",
        "isDisposed$lib_release",
        "setDisposed$lib_release",
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
.field private final TAG:Ljava/lang/String;

.field private isAdded:Z

.field private isDegraded:Z

.field private isDisposed:Z

.field private final type:Llive/hms/video/media/tracks/HMSTrackType;


# direct methods
.method public constructor <init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;)V
    .locals 1

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeTrack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/media/tracks/HMSTrack;-><init>(Llive/hms/video/media/streams/HMSMediaStream;Lhms/webrtc/MediaStreamTrack;Ljava/lang/String;)V

    const-string p1, "HMSVideoTrack"

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->TAG:Ljava/lang/String;

    sget-object p1, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    iput-object p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->type:Llive/hms/video/media/tracks/HMSTrackType;

    return-void
.end method

.method public static synthetic addSink$default(Llive/hms/video/media/tracks/HMSVideoTrack;Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;ILjava/lang/Object;)V
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/media/tracks/HMSVideoTrack;->addSink(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: addSink"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public addSink(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V
    .locals 1

    const-string p2, "sink"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-boolean p2, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDisposed:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object p2

    const-string v0, "null cannot be cast to non-null type hms.webrtc.VideoTrack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lhms/webrtc/VideoTrack;

    invoke-virtual {p2, p1}, Lhms/webrtc/VideoTrack;->addSink(Lhms/webrtc/VideoSink;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isAdded:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "native video  track has been disposed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->TAG:Ljava/lang/String;

    const-string p2, " native track has been disposed"

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public getType()Llive/hms/video/media/tracks/HMSTrackType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->type:Llive/hms/video/media/tracks/HMSTrackType;

    return-object v0
.end method

.method public final isAdded$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isAdded:Z

    return v0
.end method

.method public isDegraded()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDegraded:Z

    return v0
.end method

.method public final isDisposed$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDisposed:Z

    return v0
.end method

.method public removeSink(Lhms/webrtc/VideoSink;)V
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-boolean v0, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDisposed:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type hms.webrtc.VideoTrack"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhms/webrtc/VideoTrack;

    invoke-virtual {v0, p1}, Lhms/webrtc/VideoTrack;->removeSink(Lhms/webrtc/VideoSink;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isAdded:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "native video  track has been disposed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->TAG:Ljava/lang/String;

    const-string v0, " native track has been disposed"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDegraded$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDegraded:Z

    return-void
.end method

.method public final setDisposed$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/media/tracks/HMSVideoTrack;->isDisposed:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSVideoTrack{trackId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSTrack;->isEnabled$lib_release()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isDegraded:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llive/hms/video/media/tracks/HMSVideoTrack;->isDegraded()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
