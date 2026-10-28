.class Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/audio/WebRtcAudioRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AudioRecordThread"
.end annotation


# instance fields
.field private volatile keepAlive:Z

.field final synthetic this$0:Lhms/webrtc/audio/WebRtcAudioRecord;


# direct methods
.method public constructor <init>(Lhms/webrtc/audio/WebRtcAudioRecord;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    const/16 v0, -0x13

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    invoke-static {}, Lhms/webrtc/audio/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioRecordThread"

    const-string v2, "WebRtcAudioRecordExternal"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v4

    :goto_0
    invoke-static {v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->n(Z)V

    iget-object v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v0, v4}, Lhms/webrtc/audio/WebRtcAudioRecord;->j(Lhms/webrtc/audio/WebRtcAudioRecord;I)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    new-instance v0, Landroid/media/AudioTimestamp;

    invoke-direct {v0}, Landroid/media/AudioTimestamp;-><init>()V

    :cond_1
    :goto_1
    iget-boolean v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v1

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v5

    iget-object v6, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v6}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    invoke-virtual {v1, v5, v6}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    move-result v10

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    if-ne v10, v1, :cond_6

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->h(Lhms/webrtc/audio/WebRtcAudioRecord;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/audio/WebRtcAudioRecord;->f(Lhms/webrtc/audio/WebRtcAudioRecord;)[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_2
    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->g(Lhms/webrtc/audio/WebRtcAudioRecord;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->d(Lhms/webrtc/audio/WebRtcAudioRecord;)Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->d(Lhms/webrtc/audio/WebRtcAudioRecord;)Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;

    move-result-object v1

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-interface {v1, v5, v10}, Lhms/webrtc/audio/WebRtcAudioRecord$AudioBufferCallback;->onBuffer(Ljava/nio/ByteBuffer;I)V

    :cond_3
    iget-boolean v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v1

    invoke-virtual {v1, v0, v4}, Landroid/media/AudioRecord;->getTimestamp(Landroid/media/AudioTimestamp;I)I

    move-result v1

    if-nez v1, :cond_4

    iget-wide v5, v0, Landroid/media/AudioTimestamp;->nanoTime:J

    :goto_2
    move-wide v11, v5

    goto :goto_3

    :cond_4
    const-wide/16 v5, 0x0

    goto :goto_2

    :goto_3
    iget-object v7, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v7}, Lhms/webrtc/audio/WebRtcAudioRecord;->i(Lhms/webrtc/audio/WebRtcAudioRecord;)J

    move-result-wide v8

    invoke-static/range {v7 .. v12}, Lhms/webrtc/audio/WebRtcAudioRecord;->k(Lhms/webrtc/audio/WebRtcAudioRecord;JIJ)V

    :cond_5
    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->c(Lhms/webrtc/audio/WebRtcAudioRecord;)Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v5

    iget-object v6, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v6}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/nio/Buffer;->capacity()I

    move-result v6

    iget-object v7, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v7}, Lhms/webrtc/audio/WebRtcAudioRecord;->e(Lhms/webrtc/audio/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v7

    add-int/2addr v7, v6

    invoke-static {v1, v5, v7}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/audio/WebRtcAudioRecord;->c(Lhms/webrtc/audio/WebRtcAudioRecord;)Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;

    move-result-object v5

    new-instance v6, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioSamples;

    iget-object v7, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v7}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v7

    invoke-virtual {v7}, Landroid/media/AudioRecord;->getAudioFormat()I

    move-result v7

    iget-object v8, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v8}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v8

    invoke-virtual {v8}, Landroid/media/AudioRecord;->getChannelCount()I

    move-result v8

    iget-object v9, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v9}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v9

    invoke-virtual {v9}, Landroid/media/AudioRecord;->getSampleRate()I

    move-result v9

    invoke-direct {v6, v7, v8, v9, v1}, Lhms/webrtc/audio/JavaAudioDeviceModule$AudioSamples;-><init>(III[B)V

    invoke-interface {v5, v6}, Lhms/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;->onWebRtcAudioRecordSamplesReady(Lhms/webrtc/audio/JavaAudioDeviceModule$AudioSamples;)V

    goto/16 :goto_1

    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "AudioRecord.read failed: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, -0x3

    if-ne v10, v5, :cond_1

    iput-boolean v4, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    iget-object v5, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v5, v1}, Lhms/webrtc/audio/WebRtcAudioRecord;->l(Lhms/webrtc/audio/WebRtcAudioRecord;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_7
    :try_start_0
    iget-object v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/audio/WebRtcAudioRecord;->b(Lhms/webrtc/audio/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    iget-object v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/audio/WebRtcAudioRecord;

    invoke-static {v0, v3}, Lhms/webrtc/audio/WebRtcAudioRecord;->j(Lhms/webrtc/audio/WebRtcAudioRecord;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_8
    return-void

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "AudioRecord.stop failed: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public stopThread()V
    .locals 2

    const-string v0, "WebRtcAudioRecordExternal"

    const-string v1, "stopThread"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhms/webrtc/audio/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    return-void
.end method
