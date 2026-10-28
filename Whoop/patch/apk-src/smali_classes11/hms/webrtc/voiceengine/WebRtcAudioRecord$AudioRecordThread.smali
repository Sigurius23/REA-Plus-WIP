.class Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/voiceengine/WebRtcAudioRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "AudioRecordThread"
.end annotation


# instance fields
.field private volatile keepAlive:Z

.field final synthetic this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;


# direct methods
.method public constructor <init>(Lhms/webrtc/voiceengine/WebRtcAudioRecord;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    const/16 v0, -0x13

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioUtils;->getThreadInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AudioRecordThread"

    const-string v2, "WebRtcAudioRecord"

    invoke-static {v1, v0, v2}, Lhc3/i;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    move-result v0

    const/4 v1, 0x3

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->i(Z)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    :cond_1
    :goto_1
    iget-boolean v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v4, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v4}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    move-result v4

    invoke-virtual {v0, v1, v4}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    move-result v0

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    if-ne v0, v1, :cond_4

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->h()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v4, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v4}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->c(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)[B

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_2
    iget-boolean v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->d(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)J

    move-result-wide v4

    invoke-static {v1, v0, v4, v5}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->e(Lhms/webrtc/voiceengine/WebRtcAudioRecord;IJ)V

    :cond_3
    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->g()Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    iget-object v1, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->b(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    move-result v1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-static {}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->g()Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;

    move-result-object v1

    new-instance v4, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;

    iget-object v5, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v5}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v5

    invoke-direct {v4, v5, v0, v3}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;-><init>(Landroid/media/AudioRecord;[BI)V

    invoke-interface {v1, v4}, Lhms/webrtc/voiceengine/WebRtcAudioRecord$WebRtcAudioRecordSamplesReadyCallback;->onWebRtcAudioRecordSamplesReady(Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioSamples;)V

    goto/16 :goto_1

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "AudioRecord.read failed: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lhms/webrtc/Logging;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, -0x3

    if-ne v0, v4, :cond_1

    iput-boolean v3, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0, v1}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->f(Lhms/webrtc/voiceengine/WebRtcAudioRecord;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_5
    :try_start_0
    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->this$0:Lhms/webrtc/voiceengine/WebRtcAudioRecord;

    invoke-static {v0}, Lhms/webrtc/voiceengine/WebRtcAudioRecord;->a(Lhms/webrtc/voiceengine/WebRtcAudioRecord;)Landroid/media/AudioRecord;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_6
    return-void

    :goto_2
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

    const-string v0, "WebRtcAudioRecord"

    const-string v1, "stopThread"

    invoke-static {v0, v1}, Lhms/webrtc/Logging;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhms/webrtc/voiceengine/WebRtcAudioRecord$AudioRecordThread;->keepAlive:Z

    return-void
.end method
