.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->startRecording(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Ln23/h;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lbc3/c0;)Ln23/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$startRecording$4"
    f = "AudioRecordingController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $recordingName:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->$recordingName:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->$recordingName:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->label:I

    if-nez v0, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->access$getMediaRecorder$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)Ls23/g;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->$recordingName:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$startRecording$4;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->access$getRealPollingInterval$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)I

    move-result v1

    int-to-long v4, v1

    move-object v3, p1

    check-cast v3, Ls23/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "recordingName"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, v3, Ls23/d;->b:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    iget-object v1, v3, Ls23/d;->a:Landroid/content/Context;

    invoke-virtual {p1, v1, v0}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->createFileInCache(Landroid/content/Context;Ljava/lang/String;)Ln23/h;

    move-result-object p1

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Ln23/g;

    iget-object v0, v0, Ln23/g;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iput-object v0, v3, Ls23/d;->i:Ljava/io/File;

    invoke-static {v3, v0}, Ls23/d;->a(Ls23/d;Ljava/io/File;)V

    iget-object v0, v3, Ls23/d;->h:Landroid/media/MediaRecorder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    iget-object v0, v3, Ls23/d;->l:Lio/getstream/chat/android/ui/common/feature/messages/composer/a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lio/getstream/chat/android/ui/common/feature/messages/composer/a;->a:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->a(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)V

    :cond_0
    sget-object v0, Ls23/e;->y:Ls23/e;

    invoke-virtual {v3, v0}, Ls23/d;->e(Ls23/e;)V

    iget-object v0, v3, Ls23/d;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, v3, Ls23/d;->e:Lbc3/c2;

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v6}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, v3, Ls23/d;->d:Lhc3/d;

    new-instance v2, Lb4/i;

    const/4 v7, 0x4

    invoke-direct/range {v2 .. v7}, Lb4/i;-><init>(Ljava/lang/Object;JLq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v6, v6, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, v3, Ls23/d;->e:Lbc3/c2;

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_2
    const-string p1, "Required value was null."

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {v3}, Ls23/d;->d()V

    invoke-virtual {v3}, Ls23/d;->c()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "Could not start recording audio"

    invoke-interface {v0, v3, v2, v1, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    const-string v2, "Could not start audio recording."

    invoke-direct {v1, v2, p1}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
