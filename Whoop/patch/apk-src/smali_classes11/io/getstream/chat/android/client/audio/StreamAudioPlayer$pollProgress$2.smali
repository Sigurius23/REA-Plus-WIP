.class final Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->pollProgress()V
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
    c = "io.getstream.chat.android.client.audio.StreamAudioPlayer$pollProgress$2"
    f = "StreamAudioPlayer.kt"
    l = {
        0x18e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $audioHash:I

.field F$0:F

.field I$0:I

.field I$1:I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/audio/StreamAudioPlayer;",
            "I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iput p2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->$audioHash:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;

    iget-object v1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iget v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->$audioHash:I

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getMediaPlayer$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getCurrentPosition()I

    move-result p1

    iget-object v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {v2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getMediaPlayer$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    move-result-object v2

    invoke-interface {v2}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->getDuration()I

    move-result v2

    int-to-float v4, p1

    int-to-float v5, v2

    div-float/2addr v4, v5

    iget-object v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iget v6, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->$audioHash:I

    new-instance v7, Lio/getstream/chat/android/client/audio/ProgressData;

    invoke-direct {v7, p1, v4, v2}, Lio/getstream/chat/android/client/audio/ProgressData;-><init>(IFI)V

    invoke-static {v5, v6, v7}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$publishProgress(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;ILio/getstream/chat/android/client/audio/ProgressData;)V

    if-lt p1, v2, :cond_4

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getLogger(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, ") >= durationMs("

    const-string v5, ")"

    const-string v6, "[pollProgress] #3; currentPosition("

    invoke-static {p1, v2, v6, v1, v5}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v4, v3, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->$audioHash:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$complete(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;I)V

    goto :goto_1

    :cond_4
    iget-object v5, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {v5}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getProgressUpdatePeriod$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)J

    move-result-wide v5

    iput-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->L$0:Ljava/lang/Object;

    iput p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->I$0:I

    iput v2, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->I$1:I

    iput v4, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->F$0:F

    iput v3, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$pollProgress$2;->label:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
