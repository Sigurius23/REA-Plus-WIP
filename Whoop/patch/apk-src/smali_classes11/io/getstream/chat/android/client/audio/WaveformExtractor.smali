.class public final Lio/getstream/chat/android/client/audio/WaveformExtractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000c\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00100\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00102\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00101R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00101R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010:\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008:\u00106R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010\"R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010\"R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010\"R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008?\u0010@R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010@R2\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u00100Bj\u0008\u0012\u0004\u0012\u00020\u0010`C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u0016\u0010J\u001a\u00020>8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010@R\u0016\u0010K\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u00101\u00a8\u0006L"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/WaveformExtractor;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "key",
        "",
        "expectedPoints",
        "Lio/getstream/chat/android/client/audio/ExtractorCallBack;",
        "extractorCallBack",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;ILio/getstream/chat/android/client/audio/ExtractorCallBack;)V",
        "path",
        "Landroid/media/MediaFormat;",
        "getFormat",
        "(Ljava/lang/String;)Landroid/media/MediaFormat;",
        "",
        "sample",
        "Ll83/a0;",
        "rms",
        "(F)V",
        "size",
        "Ljava/nio/ByteBuffer;",
        "buf",
        "handle8bit",
        "(ILjava/nio/ByteBuffer;)V",
        "handle16bit",
        "handle32bit",
        "start",
        "(Ljava/lang/String;)V",
        "stop",
        "()V",
        "Landroid/content/Context;",
        "Ljava/lang/String;",
        "I",
        "Lio/getstream/chat/android/client/audio/ExtractorCallBack;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Landroid/media/MediaCodec;",
        "decoder",
        "Landroid/media/MediaCodec;",
        "Landroid/media/MediaExtractor;",
        "extractor",
        "Landroid/media/MediaExtractor;",
        "durationInSeconds",
        "F",
        "progress",
        "currentProgress",
        "",
        "started",
        "Z",
        "Ljava/util/concurrent/CountDownLatch;",
        "finishCount",
        "Ljava/util/concurrent/CountDownLatch;",
        "inputEof",
        "sampleRate",
        "channels",
        "pcmEncodingBit",
        "",
        "totalSamples",
        "J",
        "samplesPerPoint",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "sampleData",
        "Ljava/util/ArrayList;",
        "getSampleData",
        "()Ljava/util/ArrayList;",
        "setSampleData",
        "(Ljava/util/ArrayList;)V",
        "sampleCount",
        "squaredSampleSum",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private channels:I

.field private final context:Landroid/content/Context;

.field private currentProgress:F

.field private decoder:Landroid/media/MediaCodec;

.field private durationInSeconds:F

.field private final expectedPoints:I

.field private extractor:Landroid/media/MediaExtractor;

.field private final extractorCallBack:Lio/getstream/chat/android/client/audio/ExtractorCallBack;

.field private final finishCount:Ljava/util/concurrent/CountDownLatch;

.field private inputEof:Z

.field private final key:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;

.field private pcmEncodingBit:I

.field private progress:F

.field private sampleCount:J

.field private sampleData:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private sampleRate:I

.field private samplesPerPoint:J

.field private squaredSampleSum:F

.field private volatile started:Z

.field private totalSamples:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILio/getstream/chat/android/client/audio/ExtractorCallBack;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extractorCallBack"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->context:Landroid/content/Context;

    iput-object p2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->key:Ljava/lang/String;

    iput p3, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->expectedPoints:I

    iput-object p4, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->extractorCallBack:Lio/getstream/chat/android/client/audio/ExtractorCallBack;

    const-string p1, "WaveformExtractor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->logger$delegate:Ll83/h;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->finishCount:Ljava/util/concurrent/CountDownLatch;

    iput p2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    const/16 p1, 0x10

    iput p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->pcmEncodingBit:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleData:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic access$getDurationInSeconds$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)F
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->durationInSeconds:F

    return p0
.end method

.method public static final synthetic access$getExpectedPoints$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->expectedPoints:I

    return p0
.end method

.method public static final synthetic access$getExtractor$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Landroid/media/MediaExtractor;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->extractor:Landroid/media/MediaExtractor;

    return-object p0
.end method

.method public static final synthetic access$getFinishCount$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->finishCount:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static final synthetic access$getInputEof$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->inputEof:Z

    return p0
.end method

.method public static final synthetic access$getPcmEncodingBit$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->pcmEncodingBit:I

    return p0
.end method

.method public static final synthetic access$getSampleRate$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I
    .locals 0

    iget p0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleRate:I

    return p0
.end method

.method public static final synthetic access$getTotalSamples$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->totalSamples:J

    return-wide v0
.end method

.method public static final synthetic access$handle16bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->handle16bit(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic access$handle32bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->handle32bit(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic access$handle8bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->handle8bit(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic access$setChannels$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    return-void
.end method

.method public static final synthetic access$setInputEof$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->inputEof:Z

    return-void
.end method

.method public static final synthetic access$setPcmEncodingBit$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->pcmEncodingBit:I

    return-void
.end method

.method public static final synthetic access$setSampleRate$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleRate:I

    return-void
.end method

.method public static final synthetic access$setSamplesPerPoint$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;J)V
    .locals 0

    iput-wide p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->samplesPerPoint:J

    return-void
.end method

.method public static final synthetic access$setTotalSamples$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;J)V
    .locals 0

    iput-wide p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->totalSamples:J

    return-void
.end method

.method private final getFormat(Ljava/lang/String;)Landroid/media/MediaFormat;
    .locals 7

    new-instance v0, Landroid/media/MediaExtractor;

    invoke-direct {v0}, Landroid/media/MediaExtractor;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->extractor:Landroid/media/MediaExtractor;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->context:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result p1

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, p1, :cond_2

    invoke-virtual {v0, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v4

    const-string v5, "getTrackFormat(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "mime"

    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v5, ""

    :cond_0
    const-string v6, "audio"

    invoke-static {v5, v6, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string p1, "durationUs"

    invoke-virtual {v4, p1}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    long-to-float p1, v1

    const v1, 0x49742400    # 1000000.0f

    div-float/2addr p1, v1

    iput p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->durationInSeconds:F

    invoke-virtual {v0, v3}, Landroid/media/MediaExtractor;->selectTrack(I)V

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handle16bit(ILjava/nio/ByteBuffer;)V
    .locals 10

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[handle16bit] size: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-wide v5, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->totalSamples:J

    iget v1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleRate:I

    iget v7, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->durationInSeconds:F

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[handle16bit] this.totalSamples: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, ", sampleRate: "

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", duration: "

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_5

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v5, "[handle16bit] amplitude: "

    invoke-static {v2, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v7, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    int-to-float v2, v2

    const v3, 0x46fffe00    # 32767.0f

    div-float/2addr v2, v3

    iget v3, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    if-ne v3, v1, :cond_4

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_4
    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->rms(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    return-void
.end method

.method private final handle32bit(ILjava/nio/ByteBuffer;)V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[handle32bit] size: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    const/16 v1, 0x8

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_3

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    int-to-long v3, v3

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v5, v1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x10

    shl-long/2addr v7, v9

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    int-to-long v9, v9

    const/16 v11, 0x18

    shl-long/2addr v9, v11

    or-long/2addr v3, v5

    or-long/2addr v3, v7

    or-long/2addr v3, v9

    long-to-float v3, v3

    const/high16 v4, 0x4f000000

    div-float/2addr v3, v4

    iget v4, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    if-ne v4, v2, :cond_2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_2
    invoke-direct {p0, v3}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->rms(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private final handle8bit(ILjava/nio/ByteBuffer;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[handle8bit] size: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_3

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42fe0000    # 127.0f

    div-float/2addr v2, v3

    iget v3, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->channels:I

    if-ne v3, v1, :cond_2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_2
    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->rms(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private final rms(F)V
    .locals 8

    iget-wide v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleCount:J

    iget-wide v2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->samplesPerPoint:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->currentProgress:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->currentProgress:F

    iget v4, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->expectedPoints:I

    int-to-float v4, v4

    div-float/2addr v0, v4

    iput v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->progress:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->stop()V

    return-void

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->squaredSampleSum:F

    long-to-float v1, v2

    div-float/2addr v0, v1

    float-to-double v1, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, ", averageSquaredSample: "

    const-string v6, ", rms: "

    const-string v7, "[rms] sample: "

    invoke-static {v7, p1, v3, v0, v6}, Lb9/y;->t(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {v2, v5, v4, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleData:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->extractorCallBack:Lio/getstream/chat/android/client/audio/ExtractorCallBack;

    iget v1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->progress:F

    invoke-interface {v0, p0, v1}, Lio/getstream/chat/android/client/audio/ExtractorCallBack;->onProgress(Lio/getstream/chat/android/client/audio/WaveformExtractor;F)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleCount:J

    const/4 v0, 0x0

    iput v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->squaredSampleSum:F

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "waveformData"

    iget-object v2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleData:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->progress:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "progress"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "playerKey"

    iget-object v2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->key:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-wide v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleCount:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleCount:J

    iget v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->squaredSampleSum:F

    float-to-double v1, p1

    const/high16 p1, 0x40000000    # 2.0f

    float-to-double v3, p1

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    double-to-float p1, v1

    add-float/2addr v0, p1

    iput v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->squaredSampleSum:F

    return-void
.end method


# virtual methods
.method public final getSampleData()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleData:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final setSampleData(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->sampleData:Ljava/util/ArrayList;

    return-void
.end method

.method public final start(Ljava/lang/String;)V
    .locals 7

    const-string v0, "[start] started: "

    const-string v1, "path"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    iget-boolean v5, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", path: "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-boolean v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getFormat(Ljava/lang/String;)Landroid/media/MediaFormat;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "mime"

    invoke-virtual {p1, v0}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v4, v4, v1}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    new-instance p1, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;-><init>(Lio/getstream/chat/android/client/audio/WaveformExtractor;)V

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;)V

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    iput-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->decoder:Landroid/media/MediaCodec;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No MIME type found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No audio format found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public final stop()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    iget-boolean v3, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    const-string v4, "[stop] started: "

    invoke-static {v4, v3}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v1, v2, v0, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-boolean v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->started:Z

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->decoder:Landroid/media/MediaCodec;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->decoder:Landroid/media/MediaCodec;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->extractor:Landroid/media/MediaExtractor;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->release()V

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor;->finishCount:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
