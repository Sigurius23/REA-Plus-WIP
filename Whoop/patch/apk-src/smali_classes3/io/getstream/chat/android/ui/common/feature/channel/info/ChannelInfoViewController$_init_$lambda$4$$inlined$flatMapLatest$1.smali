.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1"
    f = "ChannelInfoViewController.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $global$inlined:Lio/getstream/chat/android/client/api/state/GlobalState;

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;


# direct methods
.method public constructor <init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/client/api/state/GlobalState;)V
    .locals 0

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->$global$inlined:Lio/getstream/chat/android/client/api/state/GlobalState;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->$global$inlined:Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-direct {v0, p3, v1, v2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lio/getstream/chat/android/client/api/state/GlobalState;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {v3}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "[onChannelState]"

    invoke-interface {v3, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getChannelData()Lec3/f2;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$2;

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-direct {v4, v5, v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    new-instance v5, Lec3/j1;

    const/4 v6, 0x0

    invoke-direct {v5, v3, v4, v6}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMembers()Lec3/f2;

    move-result-object v3

    new-instance v4, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$3;

    iget-object v6, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-direct {v4, v6, v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$3;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    new-instance v6, Lec3/j1;

    const/4 v8, 0x0

    invoke-direct {v6, v3, v4, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMuted()Lec3/f2;

    move-result-object v1

    new-instance v3, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$4;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-direct {v3, v4, v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$4;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Lq83/d;)V

    new-instance v4, Lec3/j1;

    invoke-direct {v4, v1, v3, v8}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    sget-object v1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;

    invoke-static {v5, v6, v4, v1}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v1

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->$global$inlined:Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-interface {v3}, Lio/getstream/chat/android/client/api/state/GlobalState;->getMuted()Lec3/f2;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->$global$inlined:Lio/getstream/chat/android/client/api/state/GlobalState;

    invoke-interface {v4}, Lio/getstream/chat/android/client/api/state/GlobalState;->getBlockedUserIds()Lec3/f2;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;

    const/4 v6, 0x4

    invoke-direct {v5, v6, v7}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {v1, v3, v4, v5}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object v1

    iput-object v7, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$_init_$lambda$4$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
