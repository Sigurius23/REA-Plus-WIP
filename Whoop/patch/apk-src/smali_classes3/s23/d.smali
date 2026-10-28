.class public final Ls23/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls23/g;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

.field public c:Ls23/e;

.field public final d:Lhc3/d;

.field public e:Lbc3/c2;

.field public f:Lbc3/c2;

.field public final g:Ll83/p;

.field public h:Landroid/media/MediaRecorder;

.field public i:Ljava/io/File;

.field public j:Ljava/lang/Long;

.field public final k:Ljava/util/ArrayList;

.field public l:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public m:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public n:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public o:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public p:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

.field public final q:Lq80/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls23/d;->a:Landroid/content/Context;

    iput-object v0, p0, Ls23/d;->b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    sget-object p1, Ls23/e;->w:Ls23/e;

    iput-object p1, p0, Ls23/d;->c:Ls23/e;

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Ls23/d;->d:Lhc3/d;

    const-string p1, "Chat:DefaultStreamMediaRecorder"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ls23/d;->g:Ll83/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls23/d;->k:Ljava/util/ArrayList;

    new-instance p1, Lq80/h;

    const/16 v0, 0x19

    invoke-direct {p1, p0, v0}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ls23/d;->q:Lq80/h;

    return-void
.end method

.method public static final a(Ls23/d;Ljava/io/File;)V
    .locals 3

    invoke-virtual {p0}, Ls23/d;->d()V

    iget-object v0, p0, Ls23/d;->q:Lq80/h;

    invoke-virtual {v0}, Lq80/h;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/MediaRecorder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    const/16 v2, 0x7d00

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioEncodingBitRate(I)V

    const/16 v2, 0x3e80

    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioChannels(I)V

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    sget-object p1, Ls23/e;->x:Ls23/e;

    invoke-virtual {p0, p1}, Ls23/d;->e(Ls23/e;)V

    iput-object v0, p0, Ls23/d;->h:Landroid/media/MediaRecorder;

    return-void
.end method


# virtual methods
.method public final b(Ljava/io/File;)I
    .locals 7

    const-string v0, "[getAudioDurationInMs] failed: "

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return v1

    :cond_0
    new-instance v2, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v2}, Landroid/media/MediaMetadataRetriever;-><init>()V

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    const/16 p1, 0x9

    invoke-virtual {v2, p1}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    :try_start_1
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    goto :goto_3

    :goto_2
    :try_start_2
    invoke-virtual {p0}, Ls23/d;->c()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->F:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v5, v3, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :catchall_2
    :goto_3
    return v1

    :goto_4
    :try_start_3
    invoke-virtual {v2}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    throw p1
.end method

.method public final c()Lb23/k;
    .locals 1

    iget-object v0, p0, Ls23/d;->g:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    :cond_0
    sget-object v0, Ls23/e;->w:Ls23/e;

    invoke-virtual {p0, v0}, Ls23/d;->e(Ls23/e;)V

    iget-object v0, p0, Ls23/d;->m:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->b(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    :cond_1
    return-void
.end method

.method public final e(Ls23/e;)V
    .locals 6

    iput-object p1, p0, Ls23/d;->c:Ls23/e;

    iget-object v0, p0, Ls23/d;->o:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->g(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ls23/e;)V

    :cond_0
    iget-object p1, p0, Ls23/d;->c:Ls23/e;

    sget-object v0, Ls23/c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p1, v1, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ls23/d;->j:Ljava/lang/Long;

    invoke-virtual {p0}, Ls23/d;->c()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Ls23/d;->j:Ljava/lang/Long;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onMediaRecorderState] #1; activeRecordingStartedAt: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    iget-object p1, p0, Ls23/d;->f:Lbc3/c2;

    if-eqz p1, :cond_2

    invoke-virtual {p1, v0}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    new-instance p1, Lkd/f;

    const/16 v1, 0x1c

    invoke-direct {p1, p0, v0, v1}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v1, 0x3

    iget-object v2, p0, Ls23/d;->d:Lhc3/d;

    invoke-static {v2, v0, v0, p1, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Ls23/d;->f:Lbc3/c2;

    return-void

    :cond_3
    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Ls23/d;->j:Ljava/lang/Long;

    invoke-virtual {p0}, Ls23/d;->c()Lb23/k;

    move-result-object p1

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Ls23/d;->j:Ljava/lang/Long;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onMediaRecorderState] #2; activeRecordingStartedAt: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3, v2, v1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    return-void
.end method

.method public final f()Ln23/h;
    .locals 34

    move-object/from16 v1, p0

    const-string v0, "[stopRecording] succeed: "

    const-string v2, "[stopRecording] startedAt: "

    :try_start_0
    iget-object v3, v1, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Landroid/media/MediaRecorder;->stop()V

    iget-object v3, v1, Ls23/d;->j:Ljava/lang/Long;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_0
    const-wide/16 v5, 0x0

    :goto_0
    iget-object v3, v1, Ls23/d;->i:Ljava/io/File;

    invoke-virtual {v1, v3}, Ls23/d;->b(Ljava/io/File;)I

    move-result v3

    invoke-virtual {v1}, Ls23/d;->c()Lb23/k;

    move-result-object v4

    iget-object v7, v4, Lb23/k;->c:Lb23/e;

    iget-object v8, v4, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v7, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v7

    const/4 v10, 0x0

    if-eqz v7, :cond_1

    iget-object v4, v4, Lb23/k;->b:Lb23/j;

    iget-object v7, v1, Ls23/d;->j:Ljava/lang/Long;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", calculatedDuration: "

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", parsedDuration: "

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v9, v8, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    if-lez v3, :cond_2

    goto :goto_1

    :cond_2
    long-to-int v3, v5

    :goto_1
    iget-object v2, v1, Ls23/d;->p:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v2, :cond_3

    int-to-long v4, v3

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->c(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;J)V

    :cond_3
    invoke-virtual {v1}, Ls23/d;->d()V

    iget-object v2, v1, Ls23/d;->m:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v2, :cond_4

    iget-object v2, v2, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->b(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    :cond_4
    iget-object v2, v1, Ls23/d;->i:Ljava/io/File;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    move-object/from16 v21, v2

    goto :goto_4

    :cond_6
    :goto_3
    const-string v2, "Recording"

    goto :goto_2

    :goto_4
    iget-object v2, v1, Ls23/d;->i:Ljava/io/File;

    const-string v4, "duration"

    int-to-float v5, v3

    const/high16 v6, 0x447a0000    # 1000.0f

    div-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "waveform_data"

    iget-object v5, v1, Ls23/d;->k:Ljava/util/ArrayList;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v7}, [Ll83/k;

    move-result-object v4

    invoke-static {v4}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v31

    new-instance v11, Lio/getstream/chat/android/models/Attachment;

    const-string v19, "audio/aac"

    const-string v23, "voiceRecording"

    const v32, 0x5f57f

    const/16 v33, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v29, v2

    invoke-direct/range {v11 .. v33}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Ls23/f;

    invoke-direct {v2, v3, v11}, Ls23/f;-><init>(ILio/getstream/chat/android/models/Attachment;)V

    invoke-virtual {v1}, Ls23/d;->c()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->x:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v6, v5, v0, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    new-instance v0, Ln23/g;

    invoke-direct {v0, v2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_8
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_5
    invoke-virtual {v1}, Ls23/d;->c()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[stopRecording] failed: "

    invoke-static {v0, v3}, Lb9/y;->j(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v5, v4, v3, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-virtual {v1}, Ls23/d;->d()V

    new-instance v2, Ln23/f;

    new-instance v3, Ln23/d;

    const-string v4, "Could not Stop audio recording."

    invoke-direct {v3, v4, v0}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v2, v3}, Ln23/f;-><init>(Ln23/e;)V

    return-object v2
.end method
