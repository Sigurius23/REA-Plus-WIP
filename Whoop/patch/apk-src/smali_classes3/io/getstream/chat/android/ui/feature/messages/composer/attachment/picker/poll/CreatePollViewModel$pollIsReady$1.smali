.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/p;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "options",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
        "title",
        "",
        "allowMultipleVotes",
        "maxAnswers",
        "",
        "multipleAnswersError"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.poll.CreatePollViewModel$pollIsReady$1"
    f = "CreatePollViewModel.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field synthetic L$3:Ljava/lang/Object;

.field synthetic Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x6

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v1, p1

    check-cast v1, Ljava/util/List;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    move-object v4, p4

    check-cast v4, Ljava/lang/Integer;

    move-object v5, p5

    check-cast v5, Ljava/lang/Integer;

    move-object v6, p6

    check-cast v6, Lq83/d;

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->invoke(Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;

    invoke-direct {v0, p6}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;-><init>(Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$1:Ljava/lang/Object;

    iput-boolean p3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->Z$0:Z

    iput-object p4, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$2:Ljava/lang/Object;

    iput-object p5, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$3:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->Z$0:Z

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/CreatePollViewModel$pollIsReady$1;->label:I

    if-nez v5, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    instance-of p1, v0, Ljava/util/Collection;

    if-eqz p1, :cond_0

    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollAnswer;->getDuplicateError()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_1
    :goto_1
    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz v2, :cond_2

    if-eqz v3, :cond_3

    if-nez v4, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
