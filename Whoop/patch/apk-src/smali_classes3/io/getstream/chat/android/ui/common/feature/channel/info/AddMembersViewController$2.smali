.class final Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;-><init>(Lbc3/c0;ILio/getstream/chat/android/client/ChatClient;Lec3/l;)V
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
        "\u0000\u0012\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "",
        "memberIds",
        "Ll83/a0;",
        "<anonymous>",
        "(Ljava/util/Set;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.common.feature.channel.info.AddMembersViewController$2"
    f = "AddMembersViewController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    invoke-direct {v0, v1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;-><init>(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Set;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->invoke(Ljava/util/Set;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Ljava/util/Set;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->L$0:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/util/Set;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController$2;->this$0:Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;->access$get_state$p(Lio/getstream/chat/android/ui/common/feature/channel/info/AddMembersViewController;)Lec3/p1;

    move-result-object p1

    :cond_0
    move-object v0, p1

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v10

    move-object v1, v10

    check-cast v1, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    const/16 v8, 0x1f

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;->copy$default(Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;ZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/util/Set;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/state/channel/info/AddMembersViewState;

    move-result-object v1

    invoke-virtual {v0, v10, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
