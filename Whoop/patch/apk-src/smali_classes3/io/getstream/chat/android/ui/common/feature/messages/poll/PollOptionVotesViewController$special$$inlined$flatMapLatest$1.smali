.class public final Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;-><init>(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V
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
    c = "io.getstream.chat.android.ui.common.feature.messages.poll.PollOptionVotesViewController$special$$inlined$flatMapLatest$1"
    f = "PollOptionVotesViewController.kt"
    l = {
        0xbe,
        0xbd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;


# direct methods
.method public constructor <init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;)V
    .locals 0

    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ll83/a0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    invoke-direct {v0, p3, v1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ll83/a0;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ll83/a0;

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->this$0:Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x0

    iput v6, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;->access$fetchPollVotes(Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v5, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/ui/common/feature/messages/poll/PollOptionVotesViewController$special$$inlined$flatMapLatest$1;->label:I

    invoke-static {v1}, Lec3/v;->y(Lec3/m;)V

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v4

    :goto_1
    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v4

    :goto_2
    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    :goto_4
    return-object v4
.end method
