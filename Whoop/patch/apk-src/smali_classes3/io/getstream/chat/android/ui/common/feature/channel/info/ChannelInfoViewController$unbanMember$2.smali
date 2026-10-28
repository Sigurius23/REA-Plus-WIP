.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->unbanMember(Ljava/lang/String;)V
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
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$unbanMember$2"
    f = "ChannelInfoViewController.kt"
    l = {
        0x1bb
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $memberId:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->$memberId:Ljava/lang/String;

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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->$memberId:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/lang/String;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getChannelClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->$memberId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/channel/ChannelClient;->unbanUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->label:I

    check-cast p1, Lo23/o;

    invoke-virtual {p1, p0}, Lo23/o;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ln23/h;

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_3

    move-object v1, p1

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Ll83/a0;

    goto :goto_1

    :cond_3
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_7

    :goto_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$unbanMember$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    if-nez v0, :cond_6

    instance-of v0, p1, Ln23/f;

    if-eqz v0, :cond_5

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v2, "[unbanMember] error: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {v0, v4, v3, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$get_events$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lec3/o1;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnbanMemberError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$UnbanMemberError;

    invoke-interface {p1, v0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
