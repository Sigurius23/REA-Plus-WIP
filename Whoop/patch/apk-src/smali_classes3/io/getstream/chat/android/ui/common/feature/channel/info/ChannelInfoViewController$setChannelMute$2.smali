.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->setChannelMute(Z)V
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
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$setChannelMute$2"
    f = "ChannelInfoViewController.kt"
    l = {
        0x13a,
        0x13c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $mute:Z

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;


# direct methods
.method public constructor <init>(ZLio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->$mute:Z

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->$mute:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;-><init>(ZLio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->$mute:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getChannelClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    invoke-static {p1, v2, v4, v2}, Lio/getstream/chat/android/client/channel/ChannelClient;->mute$default(Lio/getstream/chat/android/client/channel/ChannelClient;Ljava/lang/Integer;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    iput v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ln23/h;

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getChannelClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->unmute()Lo23/d;

    move-result-object p1

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Ln23/h;

    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$setChannelMute$2;->$mute:Z

    instance-of v3, p1, Ln23/g;

    if-nez v3, :cond_9

    instance-of v3, p1, Ln23/f;

    if-eqz v3, :cond_8

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v4, "[setChannelMute] error: "

    invoke-static {v4, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v3, v6, v5, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$get_events$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lec3/o1;

    move-result-object p1

    if-eqz v1, :cond_7

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteChannelError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$MuteChannelError;

    goto :goto_4

    :cond_7
    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteChannelError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnmuteChannelError;

    :goto_4
    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
