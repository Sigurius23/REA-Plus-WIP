.class final Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->searchUsers(Ljava/lang/String;)V
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
    c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$searchUsers$1"
    f = "AddMembersViewController.kt"
    l = {
        0x80
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $query:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->$query:Ljava/lang/String;

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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->$query:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lec3/p1;

    move-result-object p1

    :cond_2
    move-object v2, p1

    check-cast v2, Lec3/h2;

    invoke-virtual {v2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    iget-object v4, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->$query:Ljava/lang/String;

    invoke-static {v4}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v2, v4, v5}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$toSearchRequest(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Ljava/lang/String;I)Lio/getstream/chat/android/client/api/models/QueryUsersRequest;

    move-result-object v2

    invoke-virtual {p1, v2}, Lio/getstream/chat/android/client/ChatClient;->queryUsers(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;

    move-result-object p1

    iput-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->label:I

    invoke-interface {p1, p0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_0
    check-cast p1, Ln23/h;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    instance-of v2, p1, Ln23/g;

    if-eqz v2, :cond_5

    move-object v3, p1

    check-cast v3, Ln23/g;

    iget-object v3, v3, Ln23/g;->a:Ljava/lang/Object;

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lec3/p1;

    move-result-object v1

    :cond_4
    move-object v3, v1

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v13

    move-object v4, v13

    check-cast v4, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/16 v11, 0x36

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v4

    invoke-virtual {v3, v13, v4}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_5
    instance-of v1, p1, Ln23/f;

    if-eqz v1, :cond_a

    :cond_6
    :goto_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$searchUsers$1;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    if-nez v2, :cond_9

    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_8

    invoke-static {v0}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {v1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lec3/p1;

    move-result-object p1

    :cond_7
    move-object v0, p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
