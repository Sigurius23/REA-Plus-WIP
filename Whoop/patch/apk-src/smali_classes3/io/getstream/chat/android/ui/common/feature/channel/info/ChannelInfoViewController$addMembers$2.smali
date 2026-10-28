.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->addMembers(Ljava/util/Set;)V
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
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$addMembers$2"
    f = "ChannelInfoViewController.kt"
    l = {
        0xe2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $userIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/util/Set;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->$userIds:Ljava/util/Set;

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

    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->$userIds:Ljava/util/Set;

    invoke-direct {p1, v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;Ljava/util/Set;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->label:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getChannelClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->$userIds:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v6, Lio/getstream/chat/android/models/MemberData;

    const/4 v7, 0x2

    invoke-direct {v6, v4, v2, v7, v2}, Lio/getstream/chat/android/models/MemberData;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v4, Lio/getstream/chat/android/client/query/AddMembersParams;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v11}, Lio/getstream/chat/android/client/query/AddMembersParams;-><init>(Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v4}, Lio/getstream/chat/android/client/channel/ChannelClient;->addMembers(Lio/getstream/chat/android/client/query/AddMembersParams;)Lo23/d;

    move-result-object p1

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    check-cast p1, Ln23/h;

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$addMembers$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;

    instance-of v1, p1, Ln23/g;

    if-nez v1, :cond_6

    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_5

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$getLogger(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lb23/k;

    move-result-object v1

    iget-object v3, v1, Lb23/k;->c:Lb23/e;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Ln23/e;->a()Ljava/lang/String;

    move-result-object p1

    const-string v3, "[addMembers] error: "

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v5, v4, p1, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-static {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;->access$get_events$p(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;)Lec3/o1;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$AddMembersError;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewEvent$AddMembersError;

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
.end method
