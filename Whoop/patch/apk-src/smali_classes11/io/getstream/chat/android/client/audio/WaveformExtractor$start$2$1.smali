.class public final Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/audio/WaveformExtractor;->start(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "io/getstream/chat/android/client/audio/WaveformExtractor$start$2$1",
        "Landroid/media/MediaCodec$Callback;",
        "Landroid/media/MediaCodec;",
        "codec",
        "",
        "index",
        "Ll83/a0;",
        "onInputBufferAvailable",
        "(Landroid/media/MediaCodec;I)V",
        "Landroid/media/MediaFormat;",
        "format",
        "onOutputFormatChanged",
        "(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V",
        "Landroid/media/MediaCodec$CodecException;",
        "e",
        "onError",
        "(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V",
        "Landroid/media/MediaCodec$BufferInfo;",
        "info",
        "onOutputBufferAvailable",
        "(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/audio/WaveformExtractor;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 1

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getFinishCount$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 9

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getInputEof$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getExtractor$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)Landroid/media/MediaExtractor;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p2}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v8, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v5

    const/4 v7, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->advance()Z

    return-void

    :cond_2
    const-wide/16 v5, 0x0

    const/4 v7, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    const/4 v0, 0x1

    invoke-static {v8, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setInputEof$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 5

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v0, :cond_3

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    iget v2, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v3, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {v1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getPcmEncodingBit$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_2

    const/16 v4, 0x10

    if-eq v3, v4, :cond_1

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, v2, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$handle32bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_1
    invoke-static {v1, v2, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$handle16bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v2, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$handle8bit(Lio/getstream/chat/android/client/audio/WaveformExtractor;ILjava/nio/ByteBuffer;)V

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    :cond_3
    invoke-static {p3}, Lio/getstream/chat/android/client/audio/WaveformExtractorKt;->isEof(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->stop()V

    :cond_4
    return-void
.end method

.method public final onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 4

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "format"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    const-string v0, "sample-rate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setSampleRate$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    const-string v0, "channel-count"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setChannels$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x10

    if-eqz v1, :cond_2

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :cond_2
    :goto_0
    invoke-static {p1, v2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setPcmEncodingBit$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getSampleRate$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I

    move-result p2

    int-to-float p2, p2

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getDurationInSeconds$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)F

    move-result v0

    mul-float/2addr v0, p2

    float-to-long v0, v0

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setTotalSamples$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;J)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getTotalSamples$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)J

    move-result-wide v0

    iget-object p2, p0, Lio/getstream/chat/android/client/audio/WaveformExtractor$start$2$1;->this$0:Lio/getstream/chat/android/client/audio/WaveformExtractor;

    invoke-static {p2}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$getExpectedPoints$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;)I

    move-result p2

    int-to-long v2, p2

    div-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Lio/getstream/chat/android/client/audio/WaveformExtractor;->access$setSamplesPerPoint$p(Lio/getstream/chat/android/client/audio/WaveformExtractor;J)V

    return-void
.end method
