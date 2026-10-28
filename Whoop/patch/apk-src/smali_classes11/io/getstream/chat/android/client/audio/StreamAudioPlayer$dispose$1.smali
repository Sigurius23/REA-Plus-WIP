.class final Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->dispose()V
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
    c = "io.getstream.chat.android.client.audio.StreamAudioPlayer$dispose$1"
    f = "StreamAudioPlayer.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/audio/StreamAudioPlayer;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-direct {p1, v0, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;-><init>(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getLogger(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lb23/k;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    iget-object v1, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->z:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getPlayerState$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/PlayerState;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[dispose] playerState: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v3, v2, v0, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$stopPolling(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getOnStateListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getOnProgressListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getOnSpeedListeners$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getSeekMap$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getSpeedMap$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getAudioTracks$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/StreamAudioPlayer$dispose$1;->this$0:Lio/getstream/chat/android/client/audio/StreamAudioPlayer;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/StreamAudioPlayer;->access$getMediaPlayer$p(Lio/getstream/chat/android/client/audio/StreamAudioPlayer;)Lio/getstream/chat/android/client/audio/NativeMediaPlayer;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayer;->release()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
