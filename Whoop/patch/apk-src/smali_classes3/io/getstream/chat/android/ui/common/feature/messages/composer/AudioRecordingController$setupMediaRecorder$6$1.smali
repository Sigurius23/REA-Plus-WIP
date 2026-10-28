.class final Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->setupMediaRecorder()V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$setupMediaRecorder$6$1"
    f = "AudioRecordingController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $durationMs:J

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;",
            "J",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    iput-wide p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->$durationMs:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->$durationMs:J

    invoke-direct {p1, v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;-><init>(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;JLq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->getRecordingState()Lec3/p1;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->access$getLogger$p(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;)Lb23/k;

    move-result-object v0

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->$durationMs:J

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v6, 0x0

    if-eqz v3, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "[onRecorderDurationChanged] duration: "

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", state: "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v5, v4, v1, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;

    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    iget-wide v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController$setupMediaRecorder$6$1;->$durationMs:J

    long-to-int v1, v1

    const/4 v2, 0x2

    invoke-static {p1, v1, v6, v2, v6}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingStateKt;->copy$default(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;ILjava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Recording;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;->access$setState(Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
