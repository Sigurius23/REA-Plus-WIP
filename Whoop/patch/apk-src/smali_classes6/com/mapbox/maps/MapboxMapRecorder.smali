.class public final Lcom/mapbox/maps/MapboxMapRecorder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/mapbox/maps/MapboxExperimental;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ1\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0010H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/mapbox/maps/MapboxMapRecorder;",
        "",
        "Lcom/mapbox/maps/MapRecorder;",
        "mapRecorder",
        "<init>",
        "(Lcom/mapbox/maps/MapRecorder;)V",
        "Lcom/mapbox/maps/MapRecorderOptions;",
        "options",
        "Ll83/a0;",
        "startRecording",
        "(Lcom/mapbox/maps/MapRecorderOptions;)V",
        "Ljava/nio/ByteBuffer;",
        "stopRecording",
        "()Ljava/nio/ByteBuffer;",
        "recordedSequence",
        "Lcom/mapbox/maps/MapPlayerOptions;",
        "Lkotlin/Function0;",
        "onEnded",
        "replay",
        "(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;)V",
        "togglePauseReplay",
        "()V",
        "",
        "getPlaybackState",
        "()Ljava/lang/String;",
        "Lcom/mapbox/maps/MapRecorder;",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mapRecorder:Lcom/mapbox/maps/MapRecorder;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapRecorder;)V
    .locals 1

    const-string v0, "mapRecorder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    return-void
.end method

.method public static synthetic a(Lc93/a;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/MapboxMapRecorder;->replay$lambda$4(Lc93/a;)V

    return-void
.end method

.method public static synthetic replay$default(Lcom/mapbox/maps/MapboxMapRecorder;Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    new-instance p2, Lcom/mapbox/maps/MapPlayerOptions$Builder;

    invoke-direct {p2}, Lcom/mapbox/maps/MapPlayerOptions$Builder;-><init>()V

    invoke-virtual {p2}, Lcom/mapbox/maps/MapPlayerOptions$Builder;->build()Lcom/mapbox/maps/MapPlayerOptions;

    move-result-object p2

    const-string p5, "mapPlayerOptions"

    invoke-static {p2, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Lcom/mapbox/maps/MapboxMapRecorder$replay$2;->INSTANCE:Lcom/mapbox/maps/MapboxMapRecorder$replay$2;

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/mapbox/maps/MapboxMapRecorder;->replay(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;)V

    return-void
.end method

.method private static final replay$lambda$4(Lc93/a;)V
    .locals 1

    const-string v0, "$onEnded"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic startRecording$default(Lcom/mapbox/maps/MapboxMapRecorder;Lcom/mapbox/maps/MapRecorderOptions;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Lcom/mapbox/maps/MapRecorderOptions$Builder;

    invoke-direct {p1}, Lcom/mapbox/maps/MapRecorderOptions$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/mapbox/maps/MapRecorderOptions$Builder;->build()Lcom/mapbox/maps/MapRecorderOptions;

    move-result-object p1

    const-string p2, "Builder().apply(block).build()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/mapbox/maps/MapboxMapRecorder;->startRecording(Lcom/mapbox/maps/MapRecorderOptions;)V

    return-void
.end method


# virtual methods
.method public final getPlaybackState()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapRecorder;->getPlaybackState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mapRecorder.playbackState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final replay(Ljava/nio/ByteBuffer;)V
    .locals 7

    .line 1
    const-string v0, "recordedSequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/MapboxMapRecorder;->replay$default(Lcom/mapbox/maps/MapboxMapRecorder;Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;ILjava/lang/Object;)V

    return-void
.end method

.method public final replay(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;)V
    .locals 7

    .line 2
    const-string v0, "recordedSequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lcom/mapbox/maps/MapboxMapRecorder;->replay$default(Lcom/mapbox/maps/MapboxMapRecorder;Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;ILjava/lang/Object;)V

    return-void
.end method

.method public final replay(Ljava/nio/ByteBuffer;Lcom/mapbox/maps/MapPlayerOptions;Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "Lcom/mapbox/maps/MapPlayerOptions;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "recordedSequence"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnded"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {v0}, Lcom/mapbox/bindgen/DataRef;->allocateNative(I)Lcom/mapbox/bindgen/DataRef;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/mapbox/bindgen/DataRef;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 5
    iget-object p1, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    new-instance v1, Lb10/a;

    const/4 v2, 0x1

    invoke-direct {v1, p3, v2}, Lb10/a;-><init>(Lc93/a;I)V

    invoke-virtual {p1, v0, p2, v1}, Lcom/mapbox/maps/MapRecorder;->replay(Lcom/mapbox/bindgen/DataRef;Lcom/mapbox/maps/MapPlayerOptions;Lcom/mapbox/maps/PlaybackFinished;)V

    return-void
.end method

.method public final startRecording()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/mapbox/maps/MapboxMapRecorder;->startRecording$default(Lcom/mapbox/maps/MapboxMapRecorder;Lcom/mapbox/maps/MapRecorderOptions;ILjava/lang/Object;)V

    return-void
.end method

.method public final startRecording(Lcom/mapbox/maps/MapRecorderOptions;)V
    .locals 1

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    invoke-virtual {v0, p1}, Lcom/mapbox/maps/MapRecorder;->startRecording(Lcom/mapbox/maps/MapRecorderOptions;)V

    return-void
.end method

.method public final stopRecording()Ljava/nio/ByteBuffer;
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapRecorder;->stopRecording()Lcom/mapbox/bindgen/DataRef;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/DataRef;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v1, "data.buffer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method public final togglePauseReplay()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/MapboxMapRecorder;->mapRecorder:Lcom/mapbox/maps/MapRecorder;

    invoke-virtual {v0}, Lcom/mapbox/maps/MapRecorder;->togglePauseReplay()V

    return-void
.end method
